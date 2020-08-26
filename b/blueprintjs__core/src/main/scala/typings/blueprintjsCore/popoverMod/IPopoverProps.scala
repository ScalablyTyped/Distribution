package typings.blueprintjsCore.popoverMod

import typings.blueprintjsCore.popoverSharedPropsMod.IPopoverSharedProps
import typings.react.mod.HTMLProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPopoverProps extends IPopoverSharedProps {
  /** HTML props for the backdrop element. Can be combined with `backdropClassName`. */
  var backdropProps: js.UndefOr[HTMLProps[HTMLDivElement]] = js.native
  /**
    * The content displayed inside the popover. This can instead be provided as
    * the _second_ element in `children` (first is `target`).
    */
  var content: js.UndefOr[String | Element] = js.native
  /**
    * Whether the wrapper and target should take up the full width of their container.
    * Note that supplying `true` for this prop will force  `targetTagName="div"` and
    * `wrapperTagName="div"`.
    */
  var fill: js.UndefOr[Boolean] = js.native
  /**
    * Enables an invisible overlay beneath the popover that captures clicks and
    * prevents interaction with the rest of the document until the popover is
    * closed. This prop is only available when `interactionKind` is
    * `PopoverInteractionKind.CLICK`. When popovers with backdrop are opened,
    * they become focused.
    * @default false
    */
  var hasBackdrop: js.UndefOr[Boolean] = js.native
  /**
    * The kind of interaction that triggers the display of the popover.
    * @default PopoverInteractionKind.CLICK
    */
  var interactionKind: js.UndefOr[PopoverInteractionKind] = js.native
  /**
    * Whether to apply minimal styles to this popover, which includes removing
    * the arrow and adding `Classes.MINIMAL` to minimize and accelerate the
    * transitions.
    * @default false
    */
  var minimal: js.UndefOr[Boolean] = js.native
  /**
    * Ref supplied to the `Classes.POPOVER` element.
    */
  var popoverRef: js.UndefOr[js.Function1[/* ref */ HTMLDivElement | Null, Unit]] = js.native
  /**
    * The target to which the popover content is attached. This can instead be
    * provided as the _first_ element in `children`.
    */
  var target: js.UndefOr[String | Element] = js.native
}

object IPopoverProps {
  @scala.inline
  def apply(): IPopoverProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPopoverProps]
  }
  @scala.inline
  implicit class IPopoverPropsOps[Self <: IPopoverProps] (val x: Self) extends AnyVal {
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
    def setBackdropProps(value: HTMLProps[HTMLDivElement]): Self = this.set("backdropProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdropProps: Self = this.set("backdropProps", js.undefined)
    @scala.inline
    def setContent(value: String | Element): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setHasBackdrop(value: Boolean): Self = this.set("hasBackdrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasBackdrop: Self = this.set("hasBackdrop", js.undefined)
    @scala.inline
    def setInteractionKind(value: PopoverInteractionKind): Self = this.set("interactionKind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractionKind: Self = this.set("interactionKind", js.undefined)
    @scala.inline
    def setMinimal(value: Boolean): Self = this.set("minimal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimal: Self = this.set("minimal", js.undefined)
    @scala.inline
    def setPopoverRef(value: /* ref */ HTMLDivElement | Null => Unit): Self = this.set("popoverRef", js.Any.fromFunction1(value))
    @scala.inline
    def deletePopoverRef: Self = this.set("popoverRef", js.undefined)
    @scala.inline
    def setTarget(value: String | Element): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

