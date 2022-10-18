package typings.awsSdk.clientsWorklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateWebsiteAuthorizationProviderRequest extends StObject {
  
  /**
    * A unique identifier for the authorization provider.
    */
  var AuthorizationProviderId: Id
  
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsSdk.clientsWorklinkMod.FleetArn
}
object DisassociateWebsiteAuthorizationProviderRequest {
  
  inline def apply(AuthorizationProviderId: Id, FleetArn: FleetArn): DisassociateWebsiteAuthorizationProviderRequest = {
    val __obj = js.Dynamic.literal(AuthorizationProviderId = AuthorizationProviderId.asInstanceOf[js.Any], FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateWebsiteAuthorizationProviderRequest]
  }
  
  extension [Self <: DisassociateWebsiteAuthorizationProviderRequest](x: Self) {
    
    inline def setAuthorizationProviderId(value: Id): Self = StObject.set(x, "AuthorizationProviderId", value.asInstanceOf[js.Any])
    
    inline def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
  }
}
