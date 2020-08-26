package typings.contextjs.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitSettings extends js.Object {
  var above: js.UndefOr[String | Boolean] = js.native
  var compress: js.UndefOr[Boolean] = js.native
  var fadeSpeed: js.UndefOr[Double] = js.native
  var filter: js.UndefOr[js.Function1[/* e */ Element, Unit]] = js.native
  var preventDoubleContext: js.UndefOr[Boolean] = js.native
}

object InitSettings {
  @scala.inline
  def apply(): InitSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitSettings]
  }
  @scala.inline
  implicit class InitSettingsOps[Self <: InitSettings] (val x: Self) extends AnyVal {
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
    def setAbove(value: String | Boolean): Self = this.set("above", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbove: Self = this.set("above", js.undefined)
    @scala.inline
    def setCompress(value: Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    @scala.inline
    def setFadeSpeed(value: Double): Self = this.set("fadeSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFadeSpeed: Self = this.set("fadeSpeed", js.undefined)
    @scala.inline
    def setFilter(value: /* e */ Element => Unit): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setPreventDoubleContext(value: Boolean): Self = this.set("preventDoubleContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventDoubleContext: Self = this.set("preventDoubleContext", js.undefined)
  }
  
}

