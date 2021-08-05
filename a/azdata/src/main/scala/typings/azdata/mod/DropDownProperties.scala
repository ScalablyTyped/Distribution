package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropDownProperties
  extends StObject
     with ComponentProperties {
  
  var editable: js.UndefOr[Boolean] = js.undefined
  
  var fireOnTextChange: js.UndefOr[Boolean] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[String | CategoryValue] = js.undefined
  
  var values: js.UndefOr[js.Array[CategoryValue | String]] = js.undefined
}
object DropDownProperties {
  
  inline def apply(): DropDownProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownProperties]
  }
  
  extension [Self <: DropDownProperties](x: Self) {
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setFireOnTextChange(value: Boolean): Self = StObject.set(x, "fireOnTextChange", value.asInstanceOf[js.Any])
    
    inline def setFireOnTextChangeUndefined: Self = StObject.set(x, "fireOnTextChange", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setValue(value: String | CategoryValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValues(value: js.Array[CategoryValue | String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: (CategoryValue | String)*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
