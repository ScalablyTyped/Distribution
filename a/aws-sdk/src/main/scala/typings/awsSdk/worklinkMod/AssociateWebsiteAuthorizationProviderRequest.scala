package typings.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateWebsiteAuthorizationProviderRequest extends StObject {
  
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
  def apply(AuthorizationProviderType: AuthorizationProviderType, FleetArn: FleetArn): AssociateWebsiteAuthorizationProviderRequest = {
    val __obj = js.Dynamic.literal(AuthorizationProviderType = AuthorizationProviderType.asInstanceOf[js.Any], FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateWebsiteAuthorizationProviderRequest]
  }
  
  @scala.inline
  implicit class AssociateWebsiteAuthorizationProviderRequestMutableBuilder[Self <: AssociateWebsiteAuthorizationProviderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationProviderType(value: AuthorizationProviderType): Self = StObject.set(x, "AuthorizationProviderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    @scala.inline
    def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
  }
}
