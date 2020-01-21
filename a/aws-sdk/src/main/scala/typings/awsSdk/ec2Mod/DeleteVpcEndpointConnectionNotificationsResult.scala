package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVpcEndpointConnectionNotificationsResult extends js.Object {
  /**
    * Information about the notifications that could not be deleted successfully.
    */
  var Unsuccessful: js.UndefOr[UnsuccessfulItemSet] = js.native
}

object DeleteVpcEndpointConnectionNotificationsResult {
  @scala.inline
  def apply(Unsuccessful: UnsuccessfulItemSet = null): DeleteVpcEndpointConnectionNotificationsResult = {
    val __obj = js.Dynamic.literal()
    if (Unsuccessful != null) __obj.updateDynamic("Unsuccessful")(Unsuccessful.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpcEndpointConnectionNotificationsResult]
  }
}

