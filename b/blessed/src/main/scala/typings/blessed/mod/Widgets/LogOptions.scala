package typings.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogOptions extends ScrollableTextOptions {
  /**
    * scroll to bottom on input even if the user has scrolled up. default: false.
    */
  var scrollOnInput: js.UndefOr[Boolean] = js.native
  /**
    * amount of scrollback allowed. default: Infinity.
    */
  var scrollback: js.UndefOr[Double] = js.native
}

object LogOptions {
  @scala.inline
  def apply(): LogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogOptions]
  }
  @scala.inline
  implicit class LogOptionsOps[Self <: LogOptions] (val x: Self) extends AnyVal {
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
    def setScrollOnInput(value: Boolean): Self = this.set("scrollOnInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollOnInput: Self = this.set("scrollOnInput", js.undefined)
    @scala.inline
    def setScrollback(value: Double): Self = this.set("scrollback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollback: Self = this.set("scrollback", js.undefined)
  }
  
}

