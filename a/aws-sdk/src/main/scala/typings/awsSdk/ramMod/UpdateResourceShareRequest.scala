package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResourceShareRequest extends StObject {
  
  /**
    * Indicates whether principals outside your AWS organization can be associated with a resource share.
    */
  var allowExternalPrincipals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the resource share.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: String
}
object UpdateResourceShareRequest {
  
  @scala.inline
  def apply(resourceShareArn: String): UpdateResourceShareRequest = {
    val __obj = js.Dynamic.literal(resourceShareArn = resourceShareArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResourceShareRequest]
  }
  
  @scala.inline
  implicit class UpdateResourceShareRequestMutableBuilder[Self <: UpdateResourceShareRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowExternalPrincipals(value: Boolean): Self = StObject.set(x, "allowExternalPrincipals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowExternalPrincipalsUndefined: Self = StObject.set(x, "allowExternalPrincipals", js.undefined)
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setResourceShareArn(value: String): Self = StObject.set(x, "resourceShareArn", value.asInstanceOf[js.Any])
  }
}
