package typings.blueprintjsCore.overlayMod

import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOverlayableProps extends IOverlayLifecycleProps {
  /**
    * Whether the overlay should acquire application focus when it first opens.
    * @default true
    */
  var autoFocus: js.UndefOr[Boolean] = js.native
  /**
    * Whether pressing the `esc` key should invoke `onClose`.
    * @default true
    */
  var canEscapeKeyClose: js.UndefOr[Boolean] = js.native
  /**
    * Whether the overlay should prevent focus from leaving itself. That is, if the user attempts
    * to focus an element outside the overlay and this prop is enabled, then the overlay will
    * immediately bring focus back to itself. If you are nesting overlay components, either disable
    * this prop on the "outermost" overlays or mark the nested ones `usePortal={false}`.
    * @default true
    */
  var enforceFocus: js.UndefOr[Boolean] = js.native
  /**
    * If `true` and `usePortal={true}`, the `Portal` containing the children is created and attached
    * to the DOM when the overlay is opened for the first time; otherwise this happens when the
    * component mounts. Lazy mounting provides noticeable performance improvements if you have lots
    * of overlays at once, such as on each row of a table.
    * @default true
    */
  var `lazy`: js.UndefOr[Boolean] = js.native
  /**
    * A callback that is invoked when user interaction causes the overlay to close, such as
    * clicking on the overlay or pressing the `esc` key (if enabled).
    *
    * Receives the event from the user's interaction, if there was an event (generally either a
    * mouse or key event). Note that, since this component is controlled by the `isOpen` prop, it
    * will not actually close itself until that prop becomes `false`.
    */
  var onClose: js.UndefOr[js.Function1[/* event */ js.UndefOr[SyntheticEvent[HTMLElement, Event]], Unit]] = js.native
  /**
    * Space-delimited string of class names applied to the `Portal` element if
    * `usePortal={true}`.
    */
  var portalClassName: js.UndefOr[String] = js.native
  /**
    * The container element into which the overlay renders its contents, when `usePortal` is `true`.
    * This prop is ignored if `usePortal` is `false`.
    * @default document.body
    */
  var portalContainer: js.UndefOr[HTMLElement] = js.native
  /**
    * Indicates how long (in milliseconds) the overlay's enter/leave transition takes.
    * This is used by React `CSSTransition` to know when a transition completes and must match
    * the duration of the animation in CSS. Only set this prop if you override Blueprint's default
    * transitions with new transitions of a different length.
    * @default 300
    */
  var transitionDuration: js.UndefOr[Double] = js.native
  /**
    * Whether the overlay should be wrapped in a `Portal`, which renders its contents in a new
    * element attached to `portalContainer` prop.
    *
    * This prop essentially determines which element is covered by the backdrop: if `false`,
    * then only its parent is covered; otherwise, the entire page is covered (because the parent
    * of the `Portal` is the `<body>` itself).
    *
    * Set this prop to `false` on nested overlays (such as `Dialog` or `Popover`) to ensure that they
    * are rendered above their parents.
    * @default true
    */
  var usePortal: js.UndefOr[Boolean] = js.native
}

object IOverlayableProps {
  @scala.inline
  def apply(): IOverlayableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOverlayableProps]
  }
  @scala.inline
  implicit class IOverlayablePropsOps[Self <: IOverlayableProps] (val x: Self) extends AnyVal {
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
    def setCanEscapeKeyClose(value: Boolean): Self = this.set("canEscapeKeyClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanEscapeKeyClose: Self = this.set("canEscapeKeyClose", js.undefined)
    @scala.inline
    def setEnforceFocus(value: Boolean): Self = this.set("enforceFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnforceFocus: Self = this.set("enforceFocus", js.undefined)
    @scala.inline
    def setLazy(value: Boolean): Self = this.set("lazy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLazy: Self = this.set("lazy", js.undefined)
    @scala.inline
    def setOnClose(value: /* event */ js.UndefOr[SyntheticEvent[HTMLElement, Event]] => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
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
    def setUsePortal(value: Boolean): Self = this.set("usePortal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsePortal: Self = this.set("usePortal", js.undefined)
  }
  
}

