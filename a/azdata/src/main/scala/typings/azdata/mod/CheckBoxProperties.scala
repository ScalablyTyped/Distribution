package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckBoxProperties
  extends StObject
     with ComponentProperties {
  
  /**
    * Whether the checkbox is checked.
    */
  var checked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The label to display next to the checkbox.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the component is marked with the 'required' property - making
    * it required to be checked for component validation.
    */
  var required: js.UndefOr[Boolean] = js.undefined
}
object CheckBoxProperties {
  
  inline def apply(): CheckBoxProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckBoxProperties]
  }
  
  extension [Self <: CheckBoxProperties](x: Self) {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
