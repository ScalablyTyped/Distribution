package typings.baseui.accordionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedProps extends StObject {
  
  @JSName("$color")
  var $color: js.UndefOr[String] = js.undefined
  
  @JSName("$disabled")
  var $disabled: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$expanded")
  var $expanded: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$size")
  var $size: js.UndefOr[String | Double] = js.undefined
}
object SharedProps {
  
  @scala.inline
  def apply(): SharedProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedProps]
  }
  
  @scala.inline
  implicit class SharedPropsMutableBuilder[Self <: SharedProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$color(value: String): Self = StObject.set(x, "$color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$colorUndefined: Self = StObject.set(x, "$color", js.undefined)
    
    @scala.inline
    def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$disabledUndefined: Self = StObject.set(x, "$disabled", js.undefined)
    
    @scala.inline
    def set$expanded(value: Boolean): Self = StObject.set(x, "$expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$expandedUndefined: Self = StObject.set(x, "$expanded", js.undefined)
    
    @scala.inline
    def set$size(value: String | Double): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
  }
}
