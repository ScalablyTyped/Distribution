package typings.awsSdk.worklinkMod

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
  var FleetArn: typings.awsSdk.worklinkMod.FleetArn
}
object DisassociateWebsiteAuthorizationProviderRequest {
  
  @scala.inline
  def apply(AuthorizationProviderId: Id, FleetArn: FleetArn): DisassociateWebsiteAuthorizationProviderRequest = {
    val __obj = js.Dynamic.literal(AuthorizationProviderId = AuthorizationProviderId.asInstanceOf[js.Any], FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateWebsiteAuthorizationProviderRequest]
  }
  
  @scala.inline
  implicit class DisassociateWebsiteAuthorizationProviderRequestMutableBuilder[Self <: DisassociateWebsiteAuthorizationProviderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationProviderId(value: Id): Self = StObject.set(x, "AuthorizationProviderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
  }
}
