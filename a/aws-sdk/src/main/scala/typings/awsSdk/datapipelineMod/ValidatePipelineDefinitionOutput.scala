package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidatePipelineDefinitionOutput extends js.Object {
  
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
  implicit class ValidatePipelineDefinitionOutputOps[Self <: ValidatePipelineDefinitionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrored(value: Boolean): Self = this.set("errored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationErrorsVarargs(value: ValidationError*): Self = this.set("validationErrors", js.Array(value :_*))
    
    @scala.inline
    def setValidationErrors(value: ValidationErrors): Self = this.set("validationErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationErrors: Self = this.set("validationErrors", js.undefined)
    
    @scala.inline
    def setValidationWarningsVarargs(value: ValidationWarning*): Self = this.set("validationWarnings", js.Array(value :_*))
    
    @scala.inline
    def setValidationWarnings(value: ValidationWarnings): Self = this.set("validationWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationWarnings: Self = this.set("validationWarnings", js.undefined)
  }
}
