package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateWebsiteAuthorizationProviderRequest extends js.Object {
  /**
    * A unique identifier for the authorization provider.
    */
  var AuthorizationProviderId: Id = js.native
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsSdk.worklinkMod.FleetArn = js.native
}

object DisassociateWebsiteAuthorizationProviderRequest {
  @scala.inline
  def apply(AuthorizationProviderId: Id, FleetArn: FleetArn): DisassociateWebsiteAuthorizationProviderRequest = {
    val __obj = js.Dynamic.literal(AuthorizationProviderId = AuthorizationProviderId.asInstanceOf[js.Any], FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateWebsiteAuthorizationProviderRequest]
  }
  @scala.inline
  implicit class DisassociateWebsiteAuthorizationProviderRequestOps[Self <: DisassociateWebsiteAuthorizationProviderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthorizationProviderId(value: Id): Self = this.set("AuthorizationProviderId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFleetArn(value: FleetArn): Self = this.set("FleetArn", value.asInstanceOf[js.Any])
  }
  
}

