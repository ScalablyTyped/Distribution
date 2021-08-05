package typings.baseui.inputMod

import typings.baseui.baseuiStrings.both
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.end
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.mini
import typings.baseui.baseuiStrings.none
import typings.baseui.baseuiStrings.right
import typings.baseui.baseuiStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedProps extends StObject {
  
  /** Defines styles for inputs that are grouped with other controls. */
  @JSName("$adjoined")
  var $adjoined: /* keyof baseui.baseui/input.ADJOINED */ none | left | right | both
  
  /** Renders UI in 'disabled' state */
  @JSName("$disabled")
  var $disabled: Boolean
  
  /** Renders UI in 'error' state */
  @JSName("$error")
  var $error: Boolean
  
  /** Defines if has a clearable or MaskToggleButton at the end */
  @JSName("$hasIconTrailing")
  var $hasIconTrailing: Boolean
  
  /** Renders UI in 'focus' state */
  @JSName("$isFocused")
  var $isFocused: Boolean
  
  @JSName("$position")
  var $position: /* keyof baseui.baseui/input.ENHANCER_POSITION */ start | end
  
  /** Renders UI in 'positive' state */
  @JSName("$positive")
  var $positive: Boolean
  
  /** Renders UI in 'required' state */
  @JSName("$required")
  var $required: Boolean
  
  /** Renders UI in provided size. */
  @JSName("$size")
  var $size: /* keyof baseui.baseui/input.SIZE */ mini | default_ | compact | large_
}
object SharedProps {
  
  inline def apply(
    $adjoined: /* keyof baseui.baseui/input.ADJOINED */ none | left | right | both,
    $disabled: Boolean,
    $error: Boolean,
    $hasIconTrailing: Boolean,
    $isFocused: Boolean,
    $position: /* keyof baseui.baseui/input.ENHANCER_POSITION */ start | end,
    $positive: Boolean,
    $required: Boolean,
    $size: /* keyof baseui.baseui/input.SIZE */ mini | default_ | compact | large_
  ): SharedProps = {
    val __obj = js.Dynamic.literal($adjoined = $adjoined.asInstanceOf[js.Any], $disabled = $disabled.asInstanceOf[js.Any], $error = $error.asInstanceOf[js.Any], $hasIconTrailing = $hasIconTrailing.asInstanceOf[js.Any], $isFocused = $isFocused.asInstanceOf[js.Any], $position = $position.asInstanceOf[js.Any], $positive = $positive.asInstanceOf[js.Any], $required = $required.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedProps]
  }
  
  extension [Self <: SharedProps](x: Self) {
    
    inline def set$adjoined(value: /* keyof baseui.baseui/input.ADJOINED */ none | left | right | both): Self = StObject.set(x, "$adjoined", value.asInstanceOf[js.Any])
    
    inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
    
    inline def set$error(value: Boolean): Self = StObject.set(x, "$error", value.asInstanceOf[js.Any])
    
    inline def set$hasIconTrailing(value: Boolean): Self = StObject.set(x, "$hasIconTrailing", value.asInstanceOf[js.Any])
    
    inline def set$isFocused(value: Boolean): Self = StObject.set(x, "$isFocused", value.asInstanceOf[js.Any])
    
    inline def set$position(value: /* keyof baseui.baseui/input.ENHANCER_POSITION */ start | end): Self = StObject.set(x, "$position", value.asInstanceOf[js.Any])
    
    inline def set$positive(value: Boolean): Self = StObject.set(x, "$positive", value.asInstanceOf[js.Any])
    
    inline def set$required(value: Boolean): Self = StObject.set(x, "$required", value.asInstanceOf[js.Any])
    
    inline def set$size(value: /* keyof baseui.baseui/input.SIZE */ mini | default_ | compact | large_): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
  }
}
