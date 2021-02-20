package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchCreateVariableError extends StObject {
  
  /**
    * The error code. 
    */
  var code: js.UndefOr[integer] = js.native
  
  /**
    * The error message.
    */
  var message: js.UndefOr[String] = js.native
  
  /**
    * The name.
    */
  var name: js.UndefOr[String] = js.native
}
object BatchCreateVariableError {
  
  @scala.inline
  def apply(): BatchCreateVariableError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateVariableError]
  }
  
  @scala.inline
  implicit class BatchCreateVariableErrorMutableBuilder[Self <: BatchCreateVariableError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: integer): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
