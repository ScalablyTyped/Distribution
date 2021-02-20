package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CidrAuthorizationContext extends StObject {
  
  /**
    * The plain-text authorization message for the prefix and account.
    */
  var Message: GenericString = js.native
  
  /**
    * The signed authorization message for the prefix and account.
    */
  var Signature: GenericString = js.native
}
object CidrAuthorizationContext {
  
  @scala.inline
  def apply(Message: GenericString, Signature: GenericString): CidrAuthorizationContext = {
    val __obj = js.Dynamic.literal(Message = Message.asInstanceOf[js.Any], Signature = Signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[CidrAuthorizationContext]
  }
  
  @scala.inline
  implicit class CidrAuthorizationContextMutableBuilder[Self <: CidrAuthorizationContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: GenericString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: GenericString): Self = StObject.set(x, "Signature", value.asInstanceOf[js.Any])
  }
}
