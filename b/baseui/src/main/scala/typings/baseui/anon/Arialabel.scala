package typings.baseui.anon

import typings.baseui.baseuiStrings.default_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arialabel extends StObject {
  
  var `aria-describedby`: Any
  
  var `aria-label`: String
  
  var `aria-labelledby`: Any
  
  var autoComplete: String
  
  var autoFocus: Boolean
  
  var disabled: Boolean
  
  var error: Boolean
  
  var id: Any
  
  var manageFocus: Boolean
  
  var mask: Boolean
  
  var name: Any
  
  def onChange(): Unit
  
  var placeholder: String
  
  var positive: Boolean
  
  var required: Boolean
  
  var size: default_
  
  var values: js.Array[String]
}
object Arialabel {
  
  inline def apply(
    `aria-describedby`: Any,
    `aria-label`: String,
    `aria-labelledby`: Any,
    autoComplete: String,
    autoFocus: Boolean,
    disabled: Boolean,
    error: Boolean,
    id: Any,
    manageFocus: Boolean,
    mask: Boolean,
    name: Any,
    onChange: () => Unit,
    placeholder: String,
    positive: Boolean,
    required: Boolean,
    values: js.Array[String]
  ): Arialabel = {
    val __obj = js.Dynamic.literal(autoComplete = autoComplete.asInstanceOf[js.Any], autoFocus = autoFocus.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], manageFocus = manageFocus.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), placeholder = placeholder.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], size = "default", values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arialabel]
  }
  
  extension [Self <: Arialabel](x: Self) {
    
    inline def `setAria-describedby`(value: Any): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelledby`(value: Any): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setManageFocus(value: Boolean): Self = StObject.set(x, "manageFocus", value.asInstanceOf[js.Any])
    
    inline def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setSize(value: default_): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
