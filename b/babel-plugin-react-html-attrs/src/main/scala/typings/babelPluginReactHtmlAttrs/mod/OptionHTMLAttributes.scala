package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var disabled: js.UndefOr[Boolean | String] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var selected: js.UndefOr[Boolean | String] = js.undefined
  
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
}
object OptionHTMLAttributes {
  
  @scala.inline
  def apply[T](): OptionHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class OptionHTMLAttributesMutableBuilder[Self <: OptionHTMLAttributes[?], T] (val x: Self & OptionHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean | String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean | String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
