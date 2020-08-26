package typings.baseui.datepickerMod

import typings.baseui.anon.Id
import typings.baseui.anon.Select
import typings.baseui.selectMod.Option
import typings.react.mod.ReactNode
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimezonePickerProps extends js.Object {
  var date: js.UndefOr[Date] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var error: js.UndefOr[Boolean] = js.native
  var mapLabels: js.UndefOr[js.Function1[/* args */ Option, ReactNode]] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ Id, _]] = js.native
  var overrides: js.UndefOr[Select] = js.native
  var positive: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[String] = js.native
}

object TimezonePickerProps {
  @scala.inline
  def apply(): TimezonePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimezonePickerProps]
  }
  @scala.inline
  implicit class TimezonePickerPropsOps[Self <: TimezonePickerProps] (val x: Self) extends AnyVal {
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
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setMapLabels(value: /* args */ Option => ReactNode): Self = this.set("mapLabels", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMapLabels: Self = this.set("mapLabels", js.undefined)
    @scala.inline
    def setOnChange(value: /* value */ Id => _): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOverrides(value: Select): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setPositive(value: Boolean): Self = this.set("positive", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositive: Self = this.set("positive", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

