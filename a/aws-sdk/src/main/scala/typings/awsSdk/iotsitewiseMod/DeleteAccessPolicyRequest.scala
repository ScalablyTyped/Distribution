package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAccessPolicyRequest extends StObject {
  
  /**
    * The ID of the access policy to be deleted.
    */
  var accessPolicyId: ID = js.native
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
}
object DeleteAccessPolicyRequest {
  
  @scala.inline
  def apply(accessPolicyId: ID): DeleteAccessPolicyRequest = {
    val __obj = js.Dynamic.literal(accessPolicyId = accessPolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAccessPolicyRequest]
  }
  
  @scala.inline
  implicit class DeleteAccessPolicyRequestMutableBuilder[Self <: DeleteAccessPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessPolicyId(value: ID): Self = StObject.set(x, "accessPolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
  }
}
