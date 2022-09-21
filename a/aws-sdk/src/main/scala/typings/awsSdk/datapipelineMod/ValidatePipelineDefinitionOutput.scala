package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidatePipelineDefinitionOutput extends StObject {
  
  /**
    * Indicates whether there were validation errors.
    */
  var errored: Boolean
  
  /**
    * Any validation errors that were found.
    */
  var validationErrors: js.UndefOr[ValidationErrors] = js.undefined
  
  /**
    * Any validation warnings that were found.
    */
  var validationWarnings: js.UndefOr[ValidationWarnings] = js.undefined
}
object ValidatePipelineDefinitionOutput {
  
  inline def apply(errored: Boolean): ValidatePipelineDefinitionOutput = {
    val __obj = js.Dynamic.literal(errored = errored.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatePipelineDefinitionOutput]
  }
  
  extension [Self <: ValidatePipelineDefinitionOutput](x: Self) {
    
    inline def setErrored(value: Boolean): Self = StObject.set(x, "errored", value.asInstanceOf[js.Any])
    
    inline def setValidationErrors(value: ValidationErrors): Self = StObject.set(x, "validationErrors", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorsUndefined: Self = StObject.set(x, "validationErrors", js.undefined)
    
    inline def setValidationErrorsVarargs(value: ValidationError*): Self = StObject.set(x, "validationErrors", js.Array(value*))
    
    inline def setValidationWarnings(value: ValidationWarnings): Self = StObject.set(x, "validationWarnings", value.asInstanceOf[js.Any])
    
    inline def setValidationWarningsUndefined: Self = StObject.set(x, "validationWarnings", js.undefined)
    
    inline def setValidationWarningsVarargs(value: ValidationWarning*): Self = StObject.set(x, "validationWarnings", js.Array(value*))
  }
}
