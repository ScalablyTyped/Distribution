package typings.blueprintjsTimezone.anon

import typings.blueprintjsCore.alignmentMod.Alignment
import typings.blueprintjsCore.intentMod.Intent
import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsCore.refsMod.IRef
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.button
import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.reset
import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.submit
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core.IButtonProps> */
@js.native
trait PartialIButtonProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
  var alignText: js.UndefOr[Alignment] = js.native
  var className: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var elementRef: js.UndefOr[IRef[_]] = js.native
  var fill: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[IconName | MaybeElement] = js.native
  var intent: js.UndefOr[Intent] = js.native
  var large: js.UndefOr[Boolean] = js.native
  var loading: js.UndefOr[Boolean] = js.native
  var minimal: js.UndefOr[Boolean] = js.native
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.native
  var outlined: js.UndefOr[Boolean] = js.native
  var rightIcon: js.UndefOr[IconName | MaybeElement] = js.native
  var small: js.UndefOr[Boolean] = js.native
  var text: js.UndefOr[ReactNode] = js.native
  var `type`: js.UndefOr[submit | reset | button] = js.native
}

object PartialIButtonProps {
  @scala.inline
  def apply(): PartialIButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIButtonProps]
  }
  @scala.inline
  implicit class PartialIButtonPropsOps[Self <: PartialIButtonProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
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
    def setOnClick(value: /* event */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
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
    def setText(value: ReactNode): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setType(value: submit | reset | button): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

