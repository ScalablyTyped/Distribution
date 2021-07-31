package typings.baseui.anon

import typings.baseui.baseuiStrings.alertdialog
import typings.baseui.baseuiStrings.auto
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.dialog
import typings.baseui.baseuiStrings.full
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/modal.SharedStylePropsArg & {  children :react.react.ReactNode} */
trait SharedStylePropsArgchildrAnimate extends StObject {
  
  @JSName("$animate")
  var $animate: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$closeable")
  var $closeable: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$isOpen")
  var $isOpen: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$isVisible")
  var $isVisible: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$role")
  var $role: js.UndefOr[dialog | alertdialog] = js.undefined
  
  @JSName("$size")
  var $size: js.UndefOr[default_ | full | auto] = js.undefined
  
  @JSName("$unstable_ModalBackdropScroll")
  var $unstable_ModalBackdropScroll: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[ReactNode] & ReactNode
}
object SharedStylePropsArgchildrAnimate {
  
  @scala.inline
  def apply(): SharedStylePropsArgchildrAnimate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedStylePropsArgchildrAnimate]
  }
  
  @scala.inline
  implicit class SharedStylePropsArgchildrAnimateMutableBuilder[Self <: SharedStylePropsArgchildrAnimate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$animate(value: Boolean): Self = StObject.set(x, "$animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$animateUndefined: Self = StObject.set(x, "$animate", js.undefined)
    
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
    def set$role(value: dialog | alertdialog): Self = StObject.set(x, "$role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$roleUndefined: Self = StObject.set(x, "$role", js.undefined)
    
    @scala.inline
    def set$size(value: default_ | full | auto): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
    
    @scala.inline
    def set$unstable_ModalBackdropScroll(value: Boolean): Self = StObject.set(x, "$unstable_ModalBackdropScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$unstable_ModalBackdropScrollUndefined: Self = StObject.set(x, "$unstable_ModalBackdropScroll", js.undefined)
    
    @scala.inline
    def setChildren(value: js.UndefOr[ReactNode] & ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
