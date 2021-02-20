package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidatePipelineDefinitionOutput extends StObject {
  
  /**
    * Indicates whether there were validation errors.
    */
  var errored: Boolean = js.native
  
  /**
    * Any validation errors that were found.
    */
  var validationErrors: js.UndefOr[ValidationErrors] = js.native
  
  /**
    * Any validation warnings that were found.
    */
  var validationWarnings: js.UndefOr[ValidationWarnings] = js.native
}
object ValidatePipelineDefinitionOutput {
  
  @scala.inline
  def apply(errored: Boolean): ValidatePipelineDefinitionOutput = {
    val __obj = js.Dynamic.literal(errored = errored.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatePipelineDefinitionOutput]
  }
  
  @scala.inline
  implicit class ValidatePipelineDefinitionOutputMutableBuilder[Self <: ValidatePipelineDefinitionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrored(value: Boolean): Self = StObject.set(x, "errored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationErrors(value: ValidationErrors): Self = StObject.set(x, "validationErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationErrorsUndefined: Self = StObject.set(x, "validationErrors", js.undefined)
    
    @scala.inline
    def setValidationErrorsVarargs(value: ValidationError*): Self = StObject.set(x, "validationErrors", js.Array(value :_*))
    
    @scala.inline
    def setValidationWarnings(value: ValidationWarnings): Self = StObject.set(x, "validationWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationWarningsUndefined: Self = StObject.set(x, "validationWarnings", js.undefined)
    
    @scala.inline
    def setValidationWarningsVarargs(value: ValidationWarning*): Self = StObject.set(x, "validationWarnings", js.Array(value :_*))
  }
}
