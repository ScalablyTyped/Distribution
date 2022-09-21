package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Positive extends StObject {
  
  @JSName("$disabled")
  var $disabled: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$error")
  var $error: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$isFocused")
  var $isFocused: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$positive")
  var $positive: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$size")
  var $size: typings.baseui.inputTypesMod.Size
  
  @JSName("$theme")
  var $theme: typings.baseui.stylesTypesMod.Theme
}
object Positive {
  
  inline def apply($size: typings.baseui.inputTypesMod.Size, $theme: typings.baseui.stylesTypesMod.Theme): Positive = {
    val __obj = js.Dynamic.literal($size = $size.asInstanceOf[js.Any], $theme = $theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Positive]
  }
  
  extension [Self <: Positive](x: Self) {
    
    inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
    
    inline def set$disabledUndefined: Self = StObject.set(x, "$disabled", js.undefined)
    
    inline def set$error(value: Boolean): Self = StObject.set(x, "$error", value.asInstanceOf[js.Any])
    
    inline def set$errorUndefined: Self = StObject.set(x, "$error", js.undefined)
    
    inline def set$isFocused(value: Boolean): Self = StObject.set(x, "$isFocused", value.asInstanceOf[js.Any])
    
    inline def set$isFocusedUndefined: Self = StObject.set(x, "$isFocused", js.undefined)
    
    inline def set$positive(value: Boolean): Self = StObject.set(x, "$positive", value.asInstanceOf[js.Any])
    
    inline def set$positiveUndefined: Self = StObject.set(x, "$positive", js.undefined)
    
    inline def set$size(value: typings.baseui.inputTypesMod.Size): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    inline def set$theme(value: typings.baseui.stylesTypesMod.Theme): Self = StObject.set(x, "$theme", value.asInstanceOf[js.Any])
  }
}
