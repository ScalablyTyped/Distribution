package typings.badgin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<badgin.badgin/build/title.Options> */
@js.native
trait PartialOptionsIndicator extends js.Object {
  var indicator: js.UndefOr[String] = js.native
}

object PartialOptionsIndicator {
  @scala.inline
  def apply(): PartialOptionsIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsIndicator]
  }
  @scala.inline
  implicit class PartialOptionsIndicatorOps[Self <: PartialOptionsIndicator] (val x: Self) extends AnyVal {
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
    def setIndicator(value: String): Self = this.set("indicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicator: Self = this.set("indicator", js.undefined)
  }
  
}

