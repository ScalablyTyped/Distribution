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
  def apply(): DeleteVpcEndpointConnectionNotificationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteVpcEndpointConnectionNotificationsResult]
  }
  @scala.inline
  implicit class DeleteVpcEndpointConnectionNotificationsResultOps[Self <: DeleteVpcEndpointConnectionNotificationsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUnsuccessfulVarargs(value: UnsuccessfulItem*): Self = this.set("Unsuccessful", js.Array(value :_*))
    @scala.inline
    def setUnsuccessful(value: UnsuccessfulItemSet): Self = this.set("Unsuccessful", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsuccessful: Self = this.set("Unsuccessful", js.undefined)
  }
  
}

