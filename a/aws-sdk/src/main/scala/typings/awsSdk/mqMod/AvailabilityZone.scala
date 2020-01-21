package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailabilityZone extends js.Object {
  /**
    * Id for the availability zone.
    */
  var Name: js.UndefOr[string] = js.native
}

object AvailabilityZone {
  @scala.inline
  def apply(Name: string = null): AvailabilityZone = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailabilityZone]
  }
}

