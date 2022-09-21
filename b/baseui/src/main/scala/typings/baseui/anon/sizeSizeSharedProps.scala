package typings.baseui.anon

import typings.baseui.baseuiStrings.end_
import typings.baseui.baseuiStrings.start
import typings.csstype.mod.Property.Resize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  $size :baseui.baseui/input.Size} & baseui.baseui/input.SharedProps */
trait sizeSizeSharedProps extends StObject {
  
  /** Defines styles for inputs that are grouped with other controls. */
  @JSName("$adjoined")
  var $adjoined: typings.baseui.inputTypesMod.Adjoined
  
  /** Renders UI in 'disabled' state */
  @JSName("$disabled")
  var $disabled: js.UndefOr[Boolean] = js.undefined
  
  /** Renders UI in 'error' state */
  @JSName("$error")
  var $error: js.UndefOr[Boolean] = js.undefined
  
  /** Defines if has a clearable or MaskToggleButton at the end */
  @JSName("$hasIconTrailing")
  var $hasIconTrailing: js.UndefOr[Boolean] = js.undefined
  
  /** Renders UI in 'focus' state */
  @JSName("$isFocused")
  var $isFocused: js.UndefOr[Boolean] = js.undefined
  
  /** Renders UI in 'readOnly' state */
  @JSName("$isReadOnly")
  var $isReadOnly: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$position")
  var $position: js.UndefOr[start | end_] = js.undefined
  
  /** Renders UI in 'positive' state */
  @JSName("$positive")
  var $positive: js.UndefOr[Boolean] = js.undefined
  
  /** Renders UI in 'required' state */
  @JSName("$required")
  var $required: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$resize")
  var $resize: js.UndefOr[Resize] = js.undefined
  
  /** Renders UI in provided size. */
  @JSName("$size")
  var $size: typings.baseui.inputTypesMod.Size
}
object sizeSizeSharedProps {
  
  inline def apply($adjoined: typings.baseui.inputTypesMod.Adjoined, $size: typings.baseui.inputTypesMod.Size): sizeSizeSharedProps = {
    val __obj = js.Dynamic.literal($adjoined = $adjoined.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any])
    __obj.asInstanceOf[sizeSizeSharedProps]
  }
  
  extension [Self <: sizeSizeSharedProps](x: Self) {
    
    inline def set$adjoined(value: typings.baseui.inputTypesMod.Adjoined): Self = StObject.set(x, "$adjoined", value.asInstanceOf[js.Any])
    
    inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
    
    inline def set$disabledUndefined: Self = StObject.set(x, "$disabled", js.undefined)
    
    inline def set$error(value: Boolean): Self = StObject.set(x, "$error", value.asInstanceOf[js.Any])
    
    inline def set$errorUndefined: Self = StObject.set(x, "$error", js.undefined)
    
    inline def set$hasIconTrailing(value: Boolean): Self = StObject.set(x, "$hasIconTrailing", value.asInstanceOf[js.Any])
    
    inline def set$hasIconTrailingUndefined: Self = StObject.set(x, "$hasIconTrailing", js.undefined)
    
    inline def set$isFocused(value: Boolean): Self = StObject.set(x, "$isFocused", value.asInstanceOf[js.Any])
    
    inline def set$isFocusedUndefined: Self = StObject.set(x, "$isFocused", js.undefined)
    
    inline def set$isReadOnly(value: Boolean): Self = StObject.set(x, "$isReadOnly", value.asInstanceOf[js.Any])
    
    inline def set$isReadOnlyUndefined: Self = StObject.set(x, "$isReadOnly", js.undefined)
    
    inline def set$position(value: start | end_): Self = StObject.set(x, "$position", value.asInstanceOf[js.Any])
    
    inline def set$positionUndefined: Self = StObject.set(x, "$position", js.undefined)
    
    inline def set$positive(value: Boolean): Self = StObject.set(x, "$positive", value.asInstanceOf[js.Any])
    
    inline def set$positiveUndefined: Self = StObject.set(x, "$positive", js.undefined)
    
    inline def set$required(value: Boolean): Self = StObject.set(x, "$required", value.asInstanceOf[js.Any])
    
    inline def set$requiredUndefined: Self = StObject.set(x, "$required", js.undefined)
    
    inline def set$resize(value: Resize): Self = StObject.set(x, "$resize", value.asInstanceOf[js.Any])
    
    inline def set$resizeUndefined: Self = StObject.set(x, "$resize", js.undefined)
    
    inline def set$size(value: typings.baseui.inputTypesMod.Size): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
  }
}
