package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropDownProperties extends ComponentProperties {
  
  var editable: js.UndefOr[Boolean] = js.native
  
  var fireOnTextChange: js.UndefOr[Boolean] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[String | CategoryValue] = js.native
  
  var values: js.UndefOr[js.Array[CategoryValue | String]] = js.native
}
object DropDownProperties {
  
  @scala.inline
  def apply(): DropDownProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownProperties]
  }
  
  @scala.inline
  implicit class DropDownPropertiesMutableBuilder[Self <: DropDownProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    @scala.inline
    def setFireOnTextChange(value: Boolean): Self = StObject.set(x, "fireOnTextChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFireOnTextChangeUndefined: Self = StObject.set(x, "fireOnTextChange", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setValue(value: String | CategoryValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[CategoryValue | String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: (CategoryValue | String)*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
