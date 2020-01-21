package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeStatusDetails extends js.Object {
  /**
    * The name of the volume status.
    */
  var Name: js.UndefOr[VolumeStatusName] = js.native
  /**
    * The intended status of the volume status.
    */
  var Status: js.UndefOr[String] = js.native
}

object VolumeStatusDetails {
  @scala.inline
  def apply(Name: VolumeStatusName = null, Status: String = null): VolumeStatusDetails = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeStatusDetails]
  }
}

