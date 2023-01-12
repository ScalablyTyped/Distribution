package typings.baseui.anon

import typings.baseui.modalTypesMod.RoleProp
import typings.baseui.modalTypesMod.SizeProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<baseui.baseui/modal/types.SharedStylePropsArg, 'children'> */
trait OmitSharedStylePropsArgchAnimate extends StObject {
  
  @JSName("$animate")
  var $animate: Boolean
  
  @JSName("$closeable")
  var $closeable: Boolean
  
  @JSName("$isFocusVisible")
  var $isFocusVisible: Boolean
  
  @JSName("$isOpen")
  var $isOpen: Boolean
  
  @JSName("$isVisible")
  var $isVisible: Boolean
  
  @JSName("$role")
  var $role: RoleProp
  
  @JSName("$size")
  var $size: SizeProp
}
object OmitSharedStylePropsArgchAnimate {
  
  inline def apply(
    $animate: Boolean,
    $closeable: Boolean,
    $isFocusVisible: Boolean,
    $isOpen: Boolean,
    $isVisible: Boolean,
    $role: RoleProp,
    $size: SizeProp
  ): OmitSharedStylePropsArgchAnimate = {
    val __obj = js.Dynamic.literal($animate = $animate.asInstanceOf[js.Any], $closeable = $closeable.asInstanceOf[js.Any], $isFocusVisible = $isFocusVisible.asInstanceOf[js.Any], $isOpen = $isOpen.asInstanceOf[js.Any], $isVisible = $isVisible.asInstanceOf[js.Any], $role = $role.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitSharedStylePropsArgchAnimate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitSharedStylePropsArgchAnimate] (val x: Self) extends AnyVal {
    
    inline def set$animate(value: Boolean): Self = StObject.set(x, "$animate", value.asInstanceOf[js.Any])
    
    inline def set$closeable(value: Boolean): Self = StObject.set(x, "$closeable", value.asInstanceOf[js.Any])
    
    inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
    
    inline def set$isOpen(value: Boolean): Self = StObject.set(x, "$isOpen", value.asInstanceOf[js.Any])
    
    inline def set$isVisible(value: Boolean): Self = StObject.set(x, "$isVisible", value.asInstanceOf[js.Any])
    
    inline def set$role(value: RoleProp): Self = StObject.set(x, "$role", value.asInstanceOf[js.Any])
    
    inline def set$size(value: SizeProp): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
  }
}
