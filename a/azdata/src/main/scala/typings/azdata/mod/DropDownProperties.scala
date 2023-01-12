package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropDownProperties
  extends StObject
     with LoadingComponentProperties {
  
  var editable: js.UndefOr[Boolean] = js.undefined
  
  var fireOnTextChange: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Adds a short hint that describes the expected value for the editable dropdown
    */
  var placeholder: js.UndefOr[String] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Define error messages to show when custom validation fails. For empty required dropdowns we use a default error message.
    */
  var validationErrorMessages: js.UndefOr[js.Array[String]] = js.undefined
  
  var value: js.UndefOr[String | CategoryValue] = js.undefined
  
  var values: js.UndefOr[js.Array[CategoryValue | String]] = js.undefined
}
object DropDownProperties {
  
  inline def apply(): DropDownProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropDownProperties] (val x: Self) extends AnyVal {
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setFireOnTextChange(value: Boolean): Self = StObject.set(x, "fireOnTextChange", value.asInstanceOf[js.Any])
    
    inline def setFireOnTextChangeUndefined: Self = StObject.set(x, "fireOnTextChange", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setValidationErrorMessages(value: js.Array[String]): Self = StObject.set(x, "validationErrorMessages", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorMessagesUndefined: Self = StObject.set(x, "validationErrorMessages", js.undefined)
    
    inline def setValidationErrorMessagesVarargs(value: String*): Self = StObject.set(x, "validationErrorMessages", js.Array(value*))
    
    inline def setValue(value: String | CategoryValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValues(value: js.Array[CategoryValue | String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: (CategoryValue | String)*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
