package typings.baseui.selectTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutosizeInputProps extends StObject {
  
  @JSName("$size")
  var $size: Size
  
  var defaultValue: js.UndefOr[String] = js.undefined
  
  def inputRef(ref: Any): Any
  
  var overrides: AutosizeInputOverrides
  
  var value: String
}
object AutosizeInputProps {
  
  inline def apply($size: Size, inputRef: Any => Any, overrides: AutosizeInputOverrides, value: String): AutosizeInputProps = {
    val __obj = js.Dynamic.literal($size = $size.asInstanceOf[js.Any], inputRef = js.Any.fromFunction1(inputRef), overrides = overrides.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutosizeInputProps]
  }
  
  extension [Self <: AutosizeInputProps](x: Self) {
    
    inline def set$size(value: Size): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setInputRef(value: Any => Any): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
    
    inline def setOverrides(value: AutosizeInputOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
