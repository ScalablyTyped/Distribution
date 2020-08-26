package typings.blueprintjsCore.abstractButtonMod

import typings.blueprintjsCore.alignmentMod.Alignment
import typings.blueprintjsCore.blueprintjsCoreStrings.button
import typings.blueprintjsCore.blueprintjsCoreStrings.reset
import typings.blueprintjsCore.blueprintjsCoreStrings.submit
import typings.blueprintjsCore.propsMod.IActionProps
import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsCore.refsMod.IRef
import typings.blueprintjsIcons.iconNameMod.IconName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IButtonProps extends IActionProps {
  /**
    * If set to `true`, the button will display in an active state.
    * This is equivalent to setting `className={Classes.ACTIVE}`.
    * @default false
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Text alignment within button. By default, icons and text will be centered
    * within the button. Passing `"left"` or `"right"` will align the button
    * text to that side and push `icon` and `rightIcon` to either edge. Passing
    * `"center"` will center the text and icons together.
    * @default Alignment.CENTER
    */
  var alignText: js.UndefOr[Alignment] = js.native
  /** A ref handler or a ref object that receives the native HTML element backing this component. */
  var elementRef: js.UndefOr[IRef[_]] = js.native
  /** Whether this button should expand to fill its container. */
  var fill: js.UndefOr[Boolean] = js.native
  /** Whether this button should use large styles. */
  var large: js.UndefOr[Boolean] = js.native
  /**
    * If set to `true`, the button will display a centered loading spinner instead of its contents.
    * The width of the button is not affected by the value of this prop.
    * @default false
    */
  var loading: js.UndefOr[Boolean] = js.native
  /** Whether this button should use minimal styles. */
  var minimal: js.UndefOr[Boolean] = js.native
  /** Whether this button should use outlined styles. */
  var outlined: js.UndefOr[Boolean] = js.native
  /** Name of a Blueprint UI icon (or an icon element) to render after the text. */
  var rightIcon: js.UndefOr[IconName | MaybeElement] = js.native
  /** Whether this button should use small styles. */
  var small: js.UndefOr[Boolean] = js.native
  /**
    * HTML `type` attribute of button. Accepted values are `"button"`, `"submit"`, and `"reset"`.
    * Note that this prop has no effect on `AnchorButton`; it only affects `Button`.
    * @default "button"
    */
  var `type`: js.UndefOr[submit | reset | button] = js.native
}

object IButtonProps {
  @scala.inline
  def apply(): IButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IButtonProps]
  }
  @scala.inline
  implicit class IButtonPropsOps[Self <: IButtonProps] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAlignText(value: Alignment): Self = this.set("alignText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignText: Self = this.set("alignText", js.undefined)
    @scala.inline
    def setElementRefFunction1(value: /* ref */ _ | Null => js.Any): Self = this.set("elementRef", js.Any.fromFunction1(value))
    @scala.inline
    def setElementRef(value: IRef[_]): Self = this.set("elementRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementRef: Self = this.set("elementRef", js.undefined)
    @scala.inline
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setLarge(value: Boolean): Self = this.set("large", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setMinimal(value: Boolean): Self = this.set("minimal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimal: Self = this.set("minimal", js.undefined)
    @scala.inline
    def setOutlined(value: Boolean): Self = this.set("outlined", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlined: Self = this.set("outlined", js.undefined)
    @scala.inline
    def setRightIcon(value: IconName | MaybeElement): Self = this.set("rightIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightIcon: Self = this.set("rightIcon", js.undefined)
    @scala.inline
    def setRightIconNull: Self = this.set("rightIcon", null)
    @scala.inline
    def setSmall(value: Boolean): Self = this.set("small", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmall: Self = this.set("small", js.undefined)
    @scala.inline
    def setType(value: submit | reset | button): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

