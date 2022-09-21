package typings.baseui.anon

import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/phone-input/styled-components.HeightStyleProps & {  $disabled :boolean | undefined,   $isFocused :boolean | undefined,   $isFocusVisible :boolean | undefined,   $isHighlighted :boolean | undefined,   $size :'default' | 'compact' | undefined} */
trait HeightStylePropsdisabledb extends StObject {
  
  @JSName("$disabled")
  var $disabled: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$height")
  var $height: String
  
  @JSName("$isFocusVisible")
  var $isFocusVisible: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$isFocused")
  var $isFocused: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$isHighlighted")
  var $isHighlighted: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$size")
  var $size: js.UndefOr[default_ | compact] = js.undefined
}
object HeightStylePropsdisabledb {
  
  inline def apply($height: String): HeightStylePropsdisabledb = {
    val __obj = js.Dynamic.literal($height = $height.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightStylePropsdisabledb]
  }
  
  extension [Self <: HeightStylePropsdisabledb](x: Self) {
    
    inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
    
    inline def set$disabledUndefined: Self = StObject.set(x, "$disabled", js.undefined)
    
    inline def set$height(value: String): Self = StObject.set(x, "$height", value.asInstanceOf[js.Any])
    
    inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
    
    inline def set$isFocusVisibleUndefined: Self = StObject.set(x, "$isFocusVisible", js.undefined)
    
    inline def set$isFocused(value: Boolean): Self = StObject.set(x, "$isFocused", value.asInstanceOf[js.Any])
    
    inline def set$isFocusedUndefined: Self = StObject.set(x, "$isFocused", js.undefined)
    
    inline def set$isHighlighted(value: Boolean): Self = StObject.set(x, "$isHighlighted", value.asInstanceOf[js.Any])
    
    inline def set$isHighlightedUndefined: Self = StObject.set(x, "$isHighlighted", js.undefined)
    
    inline def set$size(value: default_ | compact): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    inline def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
  }
}
