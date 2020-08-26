package typings.bootstrapTimepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimepickerIconOptions extends js.Object {
  var down: js.UndefOr[String] = js.native
  var up: js.UndefOr[String] = js.native
}

object TimepickerIconOptions {
  @scala.inline
  def apply(): TimepickerIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimepickerIconOptions]
  }
  @scala.inline
  implicit class TimepickerIconOptionsOps[Self <: TimepickerIconOptions] (val x: Self) extends AnyVal {
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
    def setDown(value: String): Self = this.set("down", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDown: Self = this.set("down", js.undefined)
    @scala.inline
    def setUp(value: String): Self = this.set("up", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUp: Self = this.set("up", js.undefined)
  }
  
}

