package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAccessPolicyRequest extends StObject {
  
  /**
    * The ID of the access policy to be deleted.
    */
  var accessPolicyId: ID
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
}
object DeleteAccessPolicyRequest {
  
  inline def apply(accessPolicyId: ID): DeleteAccessPolicyRequest = {
    val __obj = js.Dynamic.literal(accessPolicyId = accessPolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAccessPolicyRequest]
  }
  
  extension [Self <: DeleteAccessPolicyRequest](x: Self) {
    
    inline def setAccessPolicyId(value: ID): Self = StObject.set(x, "accessPolicyId", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
  }
}
