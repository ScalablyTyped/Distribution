package typings.bootstrapDatepicker

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatepickerCustomFormatOptions extends js.Object {
  var toDisplay: js.UndefOr[
    js.Function3[/* date */ String, /* format */ js.Any, /* language */ js.Any, String]
  ] = js.native
  var toValue: js.UndefOr[
    js.Function3[/* date */ String, /* format */ js.Any, /* language */ js.Any, Date]
  ] = js.native
}

object DatepickerCustomFormatOptions {
  @scala.inline
  def apply(): DatepickerCustomFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatepickerCustomFormatOptions]
  }
  @scala.inline
  implicit class DatepickerCustomFormatOptionsOps[Self <: DatepickerCustomFormatOptions] (val x: Self) extends AnyVal {
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
    def setToDisplay(value: (/* date */ String, /* format */ js.Any, /* language */ js.Any) => String): Self = this.set("toDisplay", js.Any.fromFunction3(value))
    @scala.inline
    def deleteToDisplay: Self = this.set("toDisplay", js.undefined)
    @scala.inline
    def setToValue(value: (/* date */ String, /* format */ js.Any, /* language */ js.Any) => Date): Self = this.set("toValue", js.Any.fromFunction3(value))
    @scala.inline
    def deleteToValue: Self = this.set("toValue", js.undefined)
  }
  
}

