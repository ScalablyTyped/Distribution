package typings.baseui.anon

import typings.baseui.baseuiStrings.both
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.none
import typings.baseui.baseuiStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Adjoined extends StObject {
  
  @JSName("$adjoined")
  var $adjoined: /* keyof baseui.anon.Both */ none | left | right | both
  
  @JSName("$disabled")
  var $disabled: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$error")
  var $error: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$hasIconTrailing")
  var $hasIconTrailing: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$isFocused")
  var $isFocused: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$positive")
  var $positive: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$size")
  var $size: typings.baseui.inputTypesMod.Size
  
  @JSName("$theme")
  var $theme: typings.baseui.stylesTypesMod.Theme
}
object Adjoined {
  
  inline def apply(
    $adjoined: /* keyof baseui.anon.Both */ none | left | right | both,
    $size: typings.baseui.inputTypesMod.Size,
    $theme: typings.baseui.stylesTypesMod.Theme
  ): Adjoined = {
    val __obj = js.Dynamic.literal($adjoined = $adjoined.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], $theme = $theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adjoined]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Adjoined] (val x: Self) extends AnyVal {
    
    inline def set$adjoined(value: /* keyof baseui.anon.Both */ none | left | right | both): Self = StObject.set(x, "$adjoined", value.asInstanceOf[js.Any])
    
    inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
    
    inline def set$disabledUndefined: Self = StObject.set(x, "$disabled", js.undefined)
    
    inline def set$error(value: Boolean): Self = StObject.set(x, "$error", value.asInstanceOf[js.Any])
    
    inline def set$errorUndefined: Self = StObject.set(x, "$error", js.undefined)
    
    inline def set$hasIconTrailing(value: Boolean): Self = StObject.set(x, "$hasIconTrailing", value.asInstanceOf[js.Any])
    
    inline def set$hasIconTrailingUndefined: Self = StObject.set(x, "$hasIconTrailing", js.undefined)
    
    inline def set$isFocused(value: Boolean): Self = StObject.set(x, "$isFocused", value.asInstanceOf[js.Any])
    
    inline def set$isFocusedUndefined: Self = StObject.set(x, "$isFocused", js.undefined)
    
    inline def set$positive(value: Boolean): Self = StObject.set(x, "$positive", value.asInstanceOf[js.Any])
    
    inline def set$positiveUndefined: Self = StObject.set(x, "$positive", js.undefined)
    
    inline def set$size(value: typings.baseui.inputTypesMod.Size): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    inline def set$theme(value: typings.baseui.stylesTypesMod.Theme): Self = StObject.set(x, "$theme", value.asInstanceOf[js.Any])
  }
}
