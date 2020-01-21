package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateWebsiteAuthorizationProviderRequest extends js.Object {
  /**
    * The authorization provider type.
    */
  var AuthorizationProviderType: typings.awsSdk.worklinkMod.AuthorizationProviderType = js.native
  /**
    * The domain name of the authorization provider. This applies only to SAML-based authorization providers.
    */
  var DomainName: js.UndefOr[typings.awsSdk.worklinkMod.DomainName] = js.native
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsSdk.worklinkMod.FleetArn = js.native
}

object AssociateWebsiteAuthorizationProviderRequest {
  @scala.inline
  def apply(
    AuthorizationProviderType: AuthorizationProviderType,
    FleetArn: FleetArn,
    DomainName: DomainName = null
  ): AssociateWebsiteAuthorizationProviderRequest = {
    val __obj = js.Dynamic.literal(AuthorizationProviderType = AuthorizationProviderType.asInstanceOf[js.Any], FleetArn = FleetArn.asInstanceOf[js.Any])
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateWebsiteAuthorizationProviderRequest]
  }
}

