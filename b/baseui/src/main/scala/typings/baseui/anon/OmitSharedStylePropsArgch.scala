package typings.baseui.anon

import typings.baseui.drawerTypesMod.AnchorProp
import typings.baseui.drawerTypesMod.SizeProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<baseui.baseui/drawer/types.SharedStylePropsArg, 'children'> */
trait OmitSharedStylePropsArgch extends StObject {
  
  @JSName("$anchor")
  var $anchor: AnchorProp
  
  @JSName("$animating")
  var $animating: Boolean
  
  @JSName("$closeable")
  var $closeable: Boolean
  
  @JSName("$isFocusVisible")
  var $isFocusVisible: Boolean
  
  @JSName("$isOpen")
  var $isOpen: Boolean
  
  @JSName("$isVisible")
  var $isVisible: Boolean
  
  @JSName("$showBackdrop")
  var $showBackdrop: Boolean
  
  @JSName("$size")
  var $size: SizeProp
}
object OmitSharedStylePropsArgch {
  
  inline def apply(
    $anchor: AnchorProp,
    $animating: Boolean,
    $closeable: Boolean,
    $isFocusVisible: Boolean,
    $isOpen: Boolean,
    $isVisible: Boolean,
    $showBackdrop: Boolean,
    $size: SizeProp
  ): OmitSharedStylePropsArgch = {
    val __obj = js.Dynamic.literal($anchor = $anchor.asInstanceOf[js.Any], $animating = $animating.asInstanceOf[js.Any], $closeable = $closeable.asInstanceOf[js.Any], $isFocusVisible = $isFocusVisible.asInstanceOf[js.Any], $isOpen = $isOpen.asInstanceOf[js.Any], $isVisible = $isVisible.asInstanceOf[js.Any], $showBackdrop = $showBackdrop.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitSharedStylePropsArgch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitSharedStylePropsArgch] (val x: Self) extends AnyVal {
    
    inline def set$anchor(value: AnchorProp): Self = StObject.set(x, "$anchor", value.asInstanceOf[js.Any])
    
    inline def set$animating(value: Boolean): Self = StObject.set(x, "$animating", value.asInstanceOf[js.Any])
    
    inline def set$closeable(value: Boolean): Self = StObject.set(x, "$closeable", value.asInstanceOf[js.Any])
    
    inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
    
    inline def set$isOpen(value: Boolean): Self = StObject.set(x, "$isOpen", value.asInstanceOf[js.Any])
    
    inline def set$isVisible(value: Boolean): Self = StObject.set(x, "$isVisible", value.asInstanceOf[js.Any])
    
    inline def set$showBackdrop(value: Boolean): Self = StObject.set(x, "$showBackdrop", value.asInstanceOf[js.Any])
    
    inline def set$size(value: SizeProp): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
  }
}
