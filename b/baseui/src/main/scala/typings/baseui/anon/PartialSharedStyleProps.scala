package typings.baseui.anon

import typings.baseui.baseuiStrings.circle
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import typings.baseui.baseuiStrings.pill
import typings.baseui.baseuiStrings.primary
import typings.baseui.baseuiStrings.round_
import typings.baseui.baseuiStrings.secondary
import typings.baseui.baseuiStrings.square
import typings.baseui.baseuiStrings.tertiary
import typings.baseui.buttonTypesMod.CustomColors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<baseui.baseui/button/types.SharedStyleProps> */
trait PartialSharedStyleProps extends StObject {
  
  @JSName("$colors")
  var $colors: js.UndefOr[CustomColors] = js.undefined
  
  @JSName("$disabled")
  var $disabled: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$isFocusVisible")
  var $isFocusVisible: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$isLoading")
  var $isLoading: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$isSelected")
  var $isSelected: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$kind")
  var $kind: js.UndefOr[primary | secondary | tertiary] = js.undefined
  
  @JSName("$shape")
  var $shape: js.UndefOr[default_ | pill | round_ | circle | square] = js.undefined
  
  @JSName("$size")
  var $size: js.UndefOr[mini | default_ | compact | large_] = js.undefined
}
object PartialSharedStyleProps {
  
  inline def apply(): PartialSharedStyleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSharedStyleProps]
  }
  
  extension [Self <: PartialSharedStyleProps](x: Self) {
    
    inline def set$colors(value: CustomColors): Self = StObject.set(x, "$colors", value.asInstanceOf[js.Any])
    
    inline def set$colorsUndefined: Self = StObject.set(x, "$colors", js.undefined)
    
    inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
    
    inline def set$disabledUndefined: Self = StObject.set(x, "$disabled", js.undefined)
    
    inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
    
    inline def set$isFocusVisibleUndefined: Self = StObject.set(x, "$isFocusVisible", js.undefined)
    
    inline def set$isLoading(value: Boolean): Self = StObject.set(x, "$isLoading", value.asInstanceOf[js.Any])
    
    inline def set$isLoadingUndefined: Self = StObject.set(x, "$isLoading", js.undefined)
    
    inline def set$isSelected(value: Boolean): Self = StObject.set(x, "$isSelected", value.asInstanceOf[js.Any])
    
    inline def set$isSelectedUndefined: Self = StObject.set(x, "$isSelected", js.undefined)
    
    inline def set$kind(value: primary | secondary | tertiary): Self = StObject.set(x, "$kind", value.asInstanceOf[js.Any])
    
    inline def set$kindUndefined: Self = StObject.set(x, "$kind", js.undefined)
    
    inline def set$shape(value: default_ | pill | round_ | circle | square): Self = StObject.set(x, "$shape", value.asInstanceOf[js.Any])
    
    inline def set$shapeUndefined: Self = StObject.set(x, "$shape", js.undefined)
    
    inline def set$size(value: mini | default_ | compact | large_): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    inline def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
  }
}
