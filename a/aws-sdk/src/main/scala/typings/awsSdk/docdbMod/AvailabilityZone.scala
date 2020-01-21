package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailabilityZone extends js.Object {
  /**
    * The name of the Availability Zone.
    */
  var Name: js.UndefOr[String] = js.native
}

object AvailabilityZone {
  @scala.inline
  def apply(Name: String = null): AvailabilityZone = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailabilityZone]
  }
}

