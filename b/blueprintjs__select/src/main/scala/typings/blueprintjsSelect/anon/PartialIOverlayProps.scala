package typings.blueprintjsSelect.anon

import typings.react.mod.HTMLProps
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core.IOverlayProps> */
@js.native
trait PartialIOverlayProps extends js.Object {
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var backdropClassName: js.UndefOr[String] = js.native
  
  var backdropProps: js.UndefOr[HTMLProps[HTMLDivElement]] = js.native
  
  var canEscapeKeyClose: js.UndefOr[Boolean] = js.native
  
  var canOutsideClickClose: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var enforceFocus: js.UndefOr[Boolean] = js.native
  
  var hasBackdrop: js.UndefOr[Boolean] = js.native
  
  var isOpen: js.UndefOr[Boolean] = js.native
  
  var `lazy`: js.UndefOr[Boolean] = js.native
  
  var onClose: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLElement, Event], Unit]] = js.native
  
  var onClosed: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  
  var onClosing: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  
  var onOpened: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  
  var onOpening: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  
  var portalClassName: js.UndefOr[String] = js.native
  
  var portalContainer: js.UndefOr[HTMLElement] = js.native
  
  var transitionDuration: js.UndefOr[Double] = js.native
  
  var transitionName: js.UndefOr[String] = js.native
  
  var usePortal: js.UndefOr[Boolean] = js.native
}
object PartialIOverlayProps {
  
  @scala.inline
  def apply(): PartialIOverlayProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIOverlayProps]
  }
  
  @scala.inline
  implicit class PartialIOverlayPropsOps[Self <: PartialIOverlayProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setBackdropClassName(value: String): Self = this.set("backdropClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackdropClassName: Self = this.set("backdropClassName", js.undefined)
    
    @scala.inline
    def setBackdropProps(value: HTMLProps[HTMLDivElement]): Self = this.set("backdropProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackdropProps: Self = this.set("backdropProps", js.undefined)
    
    @scala.inline
    def setCanEscapeKeyClose(value: Boolean): Self = this.set("canEscapeKeyClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanEscapeKeyClose: Self = this.set("canEscapeKeyClose", js.undefined)
    
    @scala.inline
    def setCanOutsideClickClose(value: Boolean): Self = this.set("canOutsideClickClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanOutsideClickClose: Self = this.set("canOutsideClickClose", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setEnforceFocus(value: Boolean): Self = this.set("enforceFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforceFocus: Self = this.set("enforceFocus", js.undefined)
    
    @scala.inline
    def setHasBackdrop(value: Boolean): Self = this.set("hasBackdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasBackdrop: Self = this.set("hasBackdrop", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    
    @scala.inline
    def setLazy(value: Boolean): Self = this.set("lazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLazy: Self = this.set("lazy", js.undefined)
    
    @scala.inline
    def setOnClose(value: /* event */ SyntheticEvent[HTMLElement, Event] => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnClosed(value: /* node */ HTMLElement => Unit): Self = this.set("onClosed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClosed: Self = this.set("onClosed", js.undefined)
    
    @scala.inline
    def setOnClosing(value: /* node */ HTMLElement => Unit): Self = this.set("onClosing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClosing: Self = this.set("onClosing", js.undefined)
    
    @scala.inline
    def setOnOpened(value: /* node */ HTMLElement => Unit): Self = this.set("onOpened", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOpened: Self = this.set("onOpened", js.undefined)
    
    @scala.inline
    def setOnOpening(value: /* node */ HTMLElement => Unit): Self = this.set("onOpening", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOpening: Self = this.set("onOpening", js.undefined)
    
    @scala.inline
    def setPortalClassName(value: String): Self = this.set("portalClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortalClassName: Self = this.set("portalClassName", js.undefined)
    
    @scala.inline
    def setPortalContainer(value: HTMLElement): Self = this.set("portalContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortalContainer: Self = this.set("portalContainer", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: Double): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
    
    @scala.inline
    def setTransitionName(value: String): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionName: Self = this.set("transitionName", js.undefined)
    
    @scala.inline
    def setUsePortal(value: Boolean): Self = this.set("usePortal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsePortal: Self = this.set("usePortal", js.undefined)
  }
}
