package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateResourceSharePermissionResponse extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the request succeeded.
    */
  var returnValue: js.UndefOr[Boolean] = js.undefined
}
object AssociateResourceSharePermissionResponse {
  
  @scala.inline
  def apply(): AssociateResourceSharePermissionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateResourceSharePermissionResponse]
  }
  
  @scala.inline
  implicit class AssociateResourceSharePermissionResponseMutableBuilder[Self <: AssociateResourceSharePermissionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValueUndefined: Self = StObject.set(x, "returnValue", js.undefined)
  }
}
