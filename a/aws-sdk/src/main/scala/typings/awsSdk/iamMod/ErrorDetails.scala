package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorDetails extends StObject {
  
  /**
    * The error code associated with the operation failure.
    */
  var Code: stringType = js.native
  
  /**
    * Detailed information about the reason that the operation failed.
    */
  var Message: stringType = js.native
}
object ErrorDetails {
  
  @scala.inline
  def apply(Code: stringType, Message: stringType): ErrorDetails = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorDetails]
  }
  
  @scala.inline
  implicit class ErrorDetailsMutableBuilder[Self <: ErrorDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: stringType): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: stringType): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
  }
}
