package typings.awsSdk.clientsWorklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateWebsiteAuthorizationProviderRequest extends StObject {
  
  /**
    * The authorization provider type.
    */
  var AuthorizationProviderType: typings.awsSdk.clientsWorklinkMod.AuthorizationProviderType
  
  /**
    * The domain name of the authorization provider. This applies only to SAML-based authorization providers.
    */
  var DomainName: js.UndefOr[typings.awsSdk.clientsWorklinkMod.DomainName] = js.undefined
  
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsSdk.clientsWorklinkMod.FleetArn
}
object AssociateWebsiteAuthorizationProviderRequest {
  
  inline def apply(AuthorizationProviderType: AuthorizationProviderType, FleetArn: FleetArn): AssociateWebsiteAuthorizationProviderRequest = {
    val __obj = js.Dynamic.literal(AuthorizationProviderType = AuthorizationProviderType.asInstanceOf[js.Any], FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateWebsiteAuthorizationProviderRequest]
  }
  
  extension [Self <: AssociateWebsiteAuthorizationProviderRequest](x: Self) {
    
    inline def setAuthorizationProviderType(value: AuthorizationProviderType): Self = StObject.set(x, "AuthorizationProviderType", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
  }
}
