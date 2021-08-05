package typings.baseui.anon

import typings.baseui.baseuiStrings.auto
import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.full
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.right
import typings.baseui.baseuiStrings.top
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/drawer.SharedStylePropsArg & {  children :react.react.ReactNode} */
trait SharedStylePropsArgchildr extends StObject {
  
  @JSName("$anchor")
  var $anchor: js.UndefOr[left | right | top | bottom] = js.undefined
  
  @JSName("$animating")
  var $animating: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$closeable")
  var $closeable: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$isOpen")
  var $isOpen: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$isVisible")
  var $isVisible: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$size")
  var $size: js.UndefOr[default_ | full | auto] = js.undefined
  
  var children: js.UndefOr[ReactNode] & ReactNode
}
object SharedStylePropsArgchildr {
  
  inline def apply(): SharedStylePropsArgchildr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedStylePropsArgchildr]
  }
  
  extension [Self <: SharedStylePropsArgchildr](x: Self) {
    
    inline def set$anchor(value: left | right | top | bottom): Self = StObject.set(x, "$anchor", value.asInstanceOf[js.Any])
    
    inline def set$anchorUndefined: Self = StObject.set(x, "$anchor", js.undefined)
    
    inline def set$animating(value: Boolean): Self = StObject.set(x, "$animating", value.asInstanceOf[js.Any])
    
    inline def set$animatingUndefined: Self = StObject.set(x, "$animating", js.undefined)
    
    inline def set$closeable(value: Boolean): Self = StObject.set(x, "$closeable", value.asInstanceOf[js.Any])
    
    inline def set$closeableUndefined: Self = StObject.set(x, "$closeable", js.undefined)
    
    inline def set$isOpen(value: Boolean): Self = StObject.set(x, "$isOpen", value.asInstanceOf[js.Any])
    
    inline def set$isOpenUndefined: Self = StObject.set(x, "$isOpen", js.undefined)
    
    inline def set$isVisible(value: Boolean): Self = StObject.set(x, "$isVisible", value.asInstanceOf[js.Any])
    
    inline def set$isVisibleUndefined: Self = StObject.set(x, "$isVisible", js.undefined)
    
    inline def set$size(value: default_ | full | auto): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    inline def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
    
    inline def setChildren(value: js.UndefOr[ReactNode] & ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
