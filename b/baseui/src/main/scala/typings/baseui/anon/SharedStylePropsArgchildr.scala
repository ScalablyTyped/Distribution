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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/drawer.SharedStylePropsArg & {  children :react.react.ReactNode} */
@js.native
trait SharedStylePropsArgchildr extends StObject {
  
  @JSName("$anchor")
  var $anchor: js.UndefOr[left | right | top | bottom] = js.native
  
  @JSName("$animating")
  var $animating: js.UndefOr[Boolean] = js.native
  
  @JSName("$closeable")
  var $closeable: js.UndefOr[Boolean] = js.native
  
  @JSName("$isOpen")
  var $isOpen: js.UndefOr[Boolean] = js.native
  
  @JSName("$isVisible")
  var $isVisible: js.UndefOr[Boolean] = js.native
  
  @JSName("$size")
  var $size: js.UndefOr[default_ | full | auto] = js.native
  
  var children: js.UndefOr[ReactNode] with ReactNode = js.native
}
object SharedStylePropsArgchildr {
  
  @scala.inline
  def apply(): SharedStylePropsArgchildr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedStylePropsArgchildr]
  }
  
  @scala.inline
  implicit class SharedStylePropsArgchildrMutableBuilder[Self <: SharedStylePropsArgchildr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$anchor(value: left | right | top | bottom): Self = StObject.set(x, "$anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$anchorUndefined: Self = StObject.set(x, "$anchor", js.undefined)
    
    @scala.inline
    def set$animating(value: Boolean): Self = StObject.set(x, "$animating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$animatingUndefined: Self = StObject.set(x, "$animating", js.undefined)
    
    @scala.inline
    def set$closeable(value: Boolean): Self = StObject.set(x, "$closeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$closeableUndefined: Self = StObject.set(x, "$closeable", js.undefined)
    
    @scala.inline
    def set$isOpen(value: Boolean): Self = StObject.set(x, "$isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$isOpenUndefined: Self = StObject.set(x, "$isOpen", js.undefined)
    
    @scala.inline
    def set$isVisible(value: Boolean): Self = StObject.set(x, "$isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$isVisibleUndefined: Self = StObject.set(x, "$isVisible", js.undefined)
    
    @scala.inline
    def set$size(value: default_ | full | auto): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
    
    @scala.inline
    def setChildren(value: js.UndefOr[ReactNode] with ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
