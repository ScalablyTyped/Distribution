package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePortalRequest extends StObject {
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The ID of the portal to delete.
    */
  var portalId: ID
}
object DeletePortalRequest {
  
  @scala.inline
  def apply(portalId: ID): DeletePortalRequest = {
    val __obj = js.Dynamic.literal(portalId = portalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePortalRequest]
  }
  
  @scala.inline
  implicit class DeletePortalRequestMutableBuilder[Self <: DeletePortalRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setPortalId(value: ID): Self = StObject.set(x, "portalId", value.asInstanceOf[js.Any])
  }
}
