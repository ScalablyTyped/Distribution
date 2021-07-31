package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationWarning extends StObject {
  
  /**
    * The identifier of the object that contains the validation warning.
    */
  var id: js.UndefOr[typings.awsSdk.datapipelineMod.id] = js.undefined
  
  /**
    * A description of the validation warning.
    */
  var warnings: js.UndefOr[validationMessages] = js.undefined
}
object ValidationWarning {
  
  @scala.inline
  def apply(): ValidationWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationWarning]
  }
  
  @scala.inline
  implicit class ValidationWarningMutableBuilder[Self <: ValidationWarning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setWarnings(value: validationMessages): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: validationMessage*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
