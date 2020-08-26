package typings.blueprintjsCore.drawerMod

import typings.blueprintjsCore.overlayMod.IBackdropProps
import typings.blueprintjsCore.overlayMod.IOverlayableProps
import typings.blueprintjsCore.positionMod.Position
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDrawerProps
  extends IOverlayableProps
     with IBackdropProps
     with IProps {
  /**
    * Name of a Blueprint UI icon (or an icon element) to render in the
    * drawer's header. Note that the header will only be rendered if `title` is
    * provided.
    */
  var icon: js.UndefOr[IconName | MaybeElement] = js.native
  /**
    * Whether to show the close button in the dialog's header.
    * Note that the header will only be rendered if `title` is provided.
    * @default true
    */
  var isCloseButtonShown: js.UndefOr[Boolean] = js.native
  /**
    * Toggles the visibility of the overlay and its children.
    * This prop is required because the component is controlled.
    */
  var isOpen: Boolean = js.native
  /**
    * Position of a drawer. All angled positions will be casted into pure positions
    * (TOP, BOTTOM, LEFT or RIGHT).
    * @default Position.RIGHT
    */
  var position: js.UndefOr[Position] = js.native
  /**
    * CSS size of the drawer. This sets `width` if `vertical={false}` (default)
    * and `height` otherwise.
    *
    * Constants are available for common sizes:
    * - `Drawer.SIZE_SMALL = 360px`
    * - `Drawer.SIZE_STANDARD = 50%`
    * - `Drawer.SIZE_LARGE = 90%`
    *
    * @default Drawer.SIZE_STANDARD = "50%"
    */
  var size: js.UndefOr[Double | String] = js.native
  /**
    * CSS styles to apply to the dialog.
    * @default {}
    */
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * Title of the dialog. If provided, an element with `Classes.DIALOG_HEADER`
    * will be rendered inside the dialog before any children elements.
    */
  var title: js.UndefOr[ReactNode] = js.native
  /**
    * Name of the transition for internal `CSSTransition`. Providing your own
    * name here will require defining new CSS transition properties.
    */
  var transitionName: js.UndefOr[String] = js.native
  /**
    * Whether the drawer should appear with vertical styling.
    * It will be ignored if `position` prop is set
    * @default false
    * @deprecated use `position` instead
    */
  var vertical: js.UndefOr[Boolean] = js.native
}

object IDrawerProps {
  @scala.inline
  def apply(isOpen: Boolean): IDrawerProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDrawerProps]
  }
  @scala.inline
  implicit class IDrawerPropsOps[Self <: IDrawerProps] (val x: Self) extends AnyVal {
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
    def setIcon(value: IconName | MaybeElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconNull: Self = this.set("icon", null)
    @scala.inline
    def setIsCloseButtonShown(value: Boolean): Self = this.set("isCloseButtonShown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCloseButtonShown: Self = this.set("isCloseButtonShown", js.undefined)
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setSize(value: Double | String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTransitionName(value: String): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionName: Self = this.set("transitionName", js.undefined)
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}

