package typings.blueprintjsCore.buttonGroupMod

import typings.blueprintjsCore.alignmentMod.Alignment
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
trait IButtonGroupProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * Text alignment within button. By default, icons and text will be centered
    * within the button. Passing `"left"` or `"right"` will align the button
    * text to that side and push `icon` and `rightIcon` to either edge. Passing
    * `"center"` will center the text and icons together.
    */
  var alignText: js.UndefOr[Alignment] = js.native
  /**
    * Whether the button group should take up the full width of its container.
    * @default false
    */
  var fill: js.UndefOr[Boolean] = js.native
  /**
    * Whether the child buttons should appear with large styling.
    * @default false
    */
  var large: js.UndefOr[Boolean] = js.native
  /**
    * Whether the child buttons should appear with minimal styling.
    * @default false
    */
  var minimal: js.UndefOr[Boolean] = js.native
  /**
    * Whether the button group should appear with vertical styling.
    * @default false
    */
  var vertical: js.UndefOr[Boolean] = js.native
}

object IButtonGroupProps {
  @scala.inline
  def apply(): IButtonGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IButtonGroupProps]
  }
  @scala.inline
  implicit class IButtonGroupPropsOps[Self <: IButtonGroupProps] (val x: Self) extends AnyVal {
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
    def setAlignText(value: Alignment): Self = this.set("alignText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignText: Self = this.set("alignText", js.undefined)
    @scala.inline
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setLarge(value: Boolean): Self = this.set("large", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    @scala.inline
    def setMinimal(value: Boolean): Self = this.set("minimal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimal: Self = this.set("minimal", js.undefined)
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}

