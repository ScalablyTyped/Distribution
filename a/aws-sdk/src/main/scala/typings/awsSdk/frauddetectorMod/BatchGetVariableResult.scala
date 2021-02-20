package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetVariableResult extends StObject {
  
  /**
    * The errors from the request.
    */
  var errors: js.UndefOr[BatchGetVariableErrorList] = js.native
  
  /**
    * The returned variables.
    */
  var variables: js.UndefOr[VariableList] = js.native
}
object BatchGetVariableResult {
  
  @scala.inline
  def apply(): BatchGetVariableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetVariableResult]
  }
  
  @scala.inline
  implicit class BatchGetVariableResultMutableBuilder[Self <: BatchGetVariableResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: BatchGetVariableErrorList): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: BatchGetVariableError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setVariables(value: VariableList): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    
    @scala.inline
    def setVariablesVarargs(value: Variable*): Self = StObject.set(x, "variables", js.Array(value :_*))
  }
}
