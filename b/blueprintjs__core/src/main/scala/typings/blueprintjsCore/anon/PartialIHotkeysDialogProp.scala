package typings.blueprintjsCore.anon

import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.react.mod.CSSProperties
import typings.react.mod.HTMLProps
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/hotkeys/hotkeysDialog.IHotkeysDialogProps> */
trait PartialIHotkeysDialogProp extends StObject {
  
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  var backdropClassName: js.UndefOr[String] = js.undefined
  
  var backdropProps: js.UndefOr[HTMLProps[HTMLDivElement]] = js.undefined
  
  var canEscapeKeyClose: js.UndefOr[Boolean] = js.undefined
  
  var canOutsideClickClose: js.UndefOr[Boolean] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var enforceFocus: js.UndefOr[Boolean] = js.undefined
  
  var globalHotkeysGroup: js.UndefOr[String] = js.undefined
  
  var hasBackdrop: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[IconName | MaybeElement] = js.undefined
  
  var isCloseButtonShown: js.UndefOr[Boolean] = js.undefined
  
  var isOpen: js.UndefOr[Boolean] = js.undefined
  
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  
  var onClose: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLElement, Event], Unit]] = js.undefined
  
  var onClosed: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  
  var onClosing: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  
  var onOpened: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  
  var onOpening: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  
  var portalClassName: js.UndefOr[String] = js.undefined
  
  var portalContainer: js.UndefOr[HTMLElement] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var title: js.UndefOr[ReactNode] = js.undefined
  
  var transitionDuration: js.UndefOr[Double] = js.undefined
  
  var transitionName: js.UndefOr[String] = js.undefined
  
  var usePortal: js.UndefOr[Boolean] = js.undefined
}
object PartialIHotkeysDialogProp {
  
  @scala.inline
  def apply(): PartialIHotkeysDialogProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIHotkeysDialogProp]
  }
  
  @scala.inline
  implicit class PartialIHotkeysDialogPropMutableBuilder[Self <: PartialIHotkeysDialogProp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setBackdropClassName(value: String): Self = StObject.set(x, "backdropClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackdropClassNameUndefined: Self = StObject.set(x, "backdropClassName", js.undefined)
    
    @scala.inline
    def setBackdropProps(value: HTMLProps[HTMLDivElement]): Self = StObject.set(x, "backdropProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackdropPropsUndefined: Self = StObject.set(x, "backdropProps", js.undefined)
    
    @scala.inline
    def setCanEscapeKeyClose(value: Boolean): Self = StObject.set(x, "canEscapeKeyClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanEscapeKeyCloseUndefined: Self = StObject.set(x, "canEscapeKeyClose", js.undefined)
    
    @scala.inline
    def setCanOutsideClickClose(value: Boolean): Self = StObject.set(x, "canOutsideClickClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanOutsideClickCloseUndefined: Self = StObject.set(x, "canOutsideClickClose", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setEnforceFocus(value: Boolean): Self = StObject.set(x, "enforceFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforceFocusUndefined: Self = StObject.set(x, "enforceFocus", js.undefined)
    
    @scala.inline
    def setGlobalHotkeysGroup(value: String): Self = StObject.set(x, "globalHotkeysGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalHotkeysGroupUndefined: Self = StObject.set(x, "globalHotkeysGroup", js.undefined)
    
    @scala.inline
    def setHasBackdrop(value: Boolean): Self = StObject.set(x, "hasBackdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasBackdropUndefined: Self = StObject.set(x, "hasBackdrop", js.undefined)
    
    @scala.inline
    def setIcon(value: IconName | MaybeElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconNull: Self = StObject.set(x, "icon", null)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setIsCloseButtonShown(value: Boolean): Self = StObject.set(x, "isCloseButtonShown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCloseButtonShownUndefined: Self = StObject.set(x, "isCloseButtonShown", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
    @scala.inline
    def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
    
    @scala.inline
    def setOnClose(value: /* event */ SyntheticEvent[HTMLElement, Event] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setOnClosed(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onClosed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClosedUndefined: Self = StObject.set(x, "onClosed", js.undefined)
    
    @scala.inline
    def setOnClosing(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onClosing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClosingUndefined: Self = StObject.set(x, "onClosing", js.undefined)
    
    @scala.inline
    def setOnOpened(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onOpened", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOpenedUndefined: Self = StObject.set(x, "onOpened", js.undefined)
    
    @scala.inline
    def setOnOpening(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onOpening", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOpeningUndefined: Self = StObject.set(x, "onOpening", js.undefined)
    
    @scala.inline
    def setPortalClassName(value: String): Self = StObject.set(x, "portalClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalClassNameUndefined: Self = StObject.set(x, "portalClassName", js.undefined)
    
    @scala.inline
    def setPortalContainer(value: HTMLElement): Self = StObject.set(x, "portalContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalContainerUndefined: Self = StObject.set(x, "portalContainer", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    
    @scala.inline
    def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
    
    @scala.inline
    def setUsePortal(value: Boolean): Self = StObject.set(x, "usePortal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePortalUndefined: Self = StObject.set(x, "usePortal", js.undefined)
  }
}
