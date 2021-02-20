package typings.baseui.selectMod

import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutosizeInputProps extends StObject {
  
  @JSName("$size")
  var $size: js.UndefOr[mini | default_ | compact | large_] = js.native
  
  var defaultValue: js.UndefOr[String] = js.native
  
  var inputRef: js.UndefOr[Ref[_]] = js.native
  
  var overrides: js.UndefOr[AutosizeInputOverrides] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object AutosizeInputProps {
  
  @scala.inline
  def apply(): AutosizeInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutosizeInputProps]
  }
  
  @scala.inline
  implicit class AutosizeInputPropsMutableBuilder[Self <: AutosizeInputProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$size(value: mini | default_ | compact | large_): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setInputRef(value: Ref[_]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInputRefNull: Self = StObject.set(x, "inputRef", null)
    
    @scala.inline
    def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
    
    @scala.inline
    def setOverrides(value: AutosizeInputOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
