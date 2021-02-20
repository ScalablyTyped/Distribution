package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetVariableError extends StObject {
  
  /**
    * The error code. 
    */
  var code: js.UndefOr[integer] = js.native
  
  /**
    * The error message.
    */
  var message: js.UndefOr[String] = js.native
  
  /**
    * The error name. 
    */
  var name: js.UndefOr[String] = js.native
}
object BatchGetVariableError {
  
  @scala.inline
  def apply(): BatchGetVariableError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetVariableError]
  }
  
  @scala.inline
  implicit class BatchGetVariableErrorMutableBuilder[Self <: BatchGetVariableError] (val x: Self) extends AnyVal {
    
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
