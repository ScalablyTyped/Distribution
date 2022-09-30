package typings.awsSdk.migrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateInput extends StObject {
  
  /**
    * The data type of the template input.
    */
  var dataType: js.UndefOr[DataType] = js.undefined
  
  /**
    * The name of the template.
    */
  var inputName: js.UndefOr[TemplateInputName] = js.undefined
  
  /**
    * Determine if an input is required from the template.
    */
  var required: js.UndefOr[Boolean] = js.undefined
}
object TemplateInput {
  
  inline def apply(): TemplateInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateInput]
  }
  
  extension [Self <: TemplateInput](x: Self) {
    
    inline def setDataType(value: DataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setInputName(value: TemplateInputName): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
    
    inline def setInputNameUndefined: Self = StObject.set(x, "inputName", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
