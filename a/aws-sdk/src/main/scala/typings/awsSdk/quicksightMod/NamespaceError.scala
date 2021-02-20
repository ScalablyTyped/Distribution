package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamespaceError extends StObject {
  
  /**
    * The message for the error.
    */
  var Message: js.UndefOr[String] = js.native
  
  /**
    * The error type.
    */
  var Type: js.UndefOr[NamespaceErrorType] = js.native
}
object NamespaceError {
  
  @scala.inline
  def apply(): NamespaceError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamespaceError]
  }
  
  @scala.inline
  implicit class NamespaceErrorMutableBuilder[Self <: NamespaceError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setType(value: NamespaceErrorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
