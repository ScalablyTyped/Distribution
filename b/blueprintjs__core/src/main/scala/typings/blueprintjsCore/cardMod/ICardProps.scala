package typings.blueprintjsCore.cardMod

import typings.blueprintjsCore.elevationMod.Elevation
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
trait ICardProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * Controls the intensity of the drop shadow beneath the card: the higher
    * the elevation, the higher the drop shadow. At elevation `0`, no drop
    * shadow is applied.
    *
    * @default 0
    */
  var elevation: js.UndefOr[Elevation] = js.native
  /**
    * Whether the card should respond to user interactions. If set to `true`,
    * hovering over the card will increase the card's elevation
    * and change the mouse cursor to a pointer.
    *
    * Recommended when `onClick` is also defined.
    *
    * @default false
    */
  var interactive: js.UndefOr[Boolean] = js.native
  /**
    * Callback invoked when the card is clicked.
    * Recommended when `interactive` is `true`.
    */
  @JSName("onClick")
  var onClick_ICardProps: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.native
}

object ICardProps {
  @scala.inline
  def apply(): ICardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICardProps]
  }
  @scala.inline
  implicit class ICardPropsOps[Self <: ICardProps] (val x: Self) extends AnyVal {
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
    def setElevation(value: Elevation): Self = this.set("elevation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElevation: Self = this.set("elevation", js.undefined)
    @scala.inline
    def setInteractive(value: Boolean): Self = this.set("interactive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractive: Self = this.set("interactive", js.undefined)
    @scala.inline
    def setOnClick(value: /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
  }
  
}

