package typings.blueprintjsCore.alertMod

import typings.blueprintjsCore.intentMod.Intent
import typings.blueprintjsCore.overlayMod.IOverlayLifecycleProps
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.react.mod.CSSProperties
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAlertProps
  extends IOverlayLifecycleProps
     with IProps {
  
  /**
    * Whether pressing <kbd>escape</kbd> when focused on the Alert should cancel the alert.
    * If this prop is enabled, then either `onCancel` or `onClose` must also be defined.
    * @default false
    */
  var canEscapeKeyCancel: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether clicking outside the Alert should cancel the alert.
    * If this prop is enabled, then either `onCancel` or `onClose` must also be defined.
    * @default false
    */
  var canOutsideClickCancel: js.UndefOr[Boolean] = js.native
  
  /**
    * The text for the cancel button.
    * If this prop is defined, then either `onCancel` or `onClose` must also be defined.
    */
  var cancelButtonText: js.UndefOr[String] = js.native
  
  /**
    * The text for the confirm (right-most) button.
    * This button will always appear, and uses the value of the `intent` prop below.
    * @default "OK"
    */
  var confirmButtonText: js.UndefOr[String] = js.native
  
  /** Name of a Blueprint UI icon (or an icon element) to display on the left side. */
  var icon: js.UndefOr[IconName | MaybeElement] = js.native
  
  /**
    * The intent to be applied to the confirm (right-most) button and the icon (if provided).
    */
  var intent: js.UndefOr[Intent] = js.native
  
  /**
    * Toggles the visibility of the alert.
    * This prop is required because the component is controlled.
    */
  var isOpen: Boolean = js.native
  
  /**
    * Handler invoked when the alert is canceled. Alerts can be **canceled** in the following ways:
    * - clicking the cancel button (if `cancelButtonText` is defined)
    * - pressing the escape key (if `canEscapeKeyCancel` is enabled)
    * - clicking on the overlay backdrop (if `canOutsideClickCancel` is enabled)
    *
    * If any of the `cancel` props are defined, then either `onCancel` or `onClose` must be defined.
    */
  var onCancel: js.UndefOr[js.Function1[/* evt */ js.UndefOr[SyntheticEvent[HTMLElement, Event]], Unit]] = js.native
  
  /**
    * Handler invoked when the Alert is confirmed or canceled; see `onConfirm` and `onCancel` for more details.
    * First argument is `true` if confirmed, `false` otherwise.
    * This is an alternative to defining separate `onConfirm` and `onCancel` handlers.
    */
  var onClose: js.UndefOr[
    js.Function2[
      /* confirmed */ Boolean, 
      /* evt */ js.UndefOr[SyntheticEvent[HTMLElement, Event]], 
      Unit
    ]
  ] = js.native
  
  /**
    * Handler invoked when the confirm button is clicked. Alerts can be **confirmed** in the following ways:
    * - clicking the confirm button
    * - focusing on the confirm button and pressing `enter` or `space`
    */
  var onConfirm: js.UndefOr[js.Function1[/* evt */ js.UndefOr[SyntheticEvent[HTMLElement, Event]], Unit]] = js.native
  
  /**
    * The container element into which the overlay renders its contents, when `usePortal` is `true`.
    * This prop is ignored if `usePortal` is `false`.
    * @default document.body
    */
  var portalContainer: js.UndefOr[HTMLElement] = js.native
  
  /**
    * CSS styles to apply to the alert.
    */
  var style: js.UndefOr[CSSProperties] = js.native
  
  /**
    * Indicates how long (in milliseconds) the overlay's enter/leave transition takes.
    * This is used by React `CSSTransition` to know when a transition completes and must match
    * the duration of the animation in CSS. Only set this prop if you override Blueprint's default
    * transitions with new transitions of a different length.
    * @default 300
    */
  var transitionDuration: js.UndefOr[Double] = js.native
}
object IAlertProps {
  
  @scala.inline
  def apply(isOpen: Boolean): IAlertProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAlertProps]
  }
  
  @scala.inline
  implicit class IAlertPropsOps[Self <: IAlertProps] (val x: Self) extends AnyVal {
    
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
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanEscapeKeyCancel(value: Boolean): Self = this.set("canEscapeKeyCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanEscapeKeyCancel: Self = this.set("canEscapeKeyCancel", js.undefined)
    
    @scala.inline
    def setCanOutsideClickCancel(value: Boolean): Self = this.set("canOutsideClickCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanOutsideClickCancel: Self = this.set("canOutsideClickCancel", js.undefined)
    
    @scala.inline
    def setCancelButtonText(value: String): Self = this.set("cancelButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelButtonText: Self = this.set("cancelButtonText", js.undefined)
    
    @scala.inline
    def setConfirmButtonText(value: String): Self = this.set("confirmButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmButtonText: Self = this.set("confirmButtonText", js.undefined)
    
    @scala.inline
    def setIcon(value: IconName | MaybeElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconNull: Self = this.set("icon", null)
    
    @scala.inline
    def setIntent(value: Intent): Self = this.set("intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntent: Self = this.set("intent", js.undefined)
    
    @scala.inline
    def setOnCancel(value: /* evt */ js.UndefOr[SyntheticEvent[HTMLElement, Event]] => Unit): Self = this.set("onCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    
    @scala.inline
    def setOnClose(value: (/* confirmed */ Boolean, /* evt */ js.UndefOr[SyntheticEvent[HTMLElement, Event]]) => Unit): Self = this.set("onClose", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnConfirm(value: /* evt */ js.UndefOr[SyntheticEvent[HTMLElement, Event]] => Unit): Self = this.set("onConfirm", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnConfirm: Self = this.set("onConfirm", js.undefined)
    
    @scala.inline
    def setPortalContainer(value: HTMLElement): Self = this.set("portalContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortalContainer: Self = this.set("portalContainer", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: Double): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
  }
}
