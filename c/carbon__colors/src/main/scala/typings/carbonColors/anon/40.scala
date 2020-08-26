package typings.carbonColors.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `40` extends js.Object {
  var `40`: String = js.native
}

object `40` {
  @scala.inline
  def apply(`40`: String): `40` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("40")(`40`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`40`]
  }
  @scala.inline
  implicit class `40Ops`[Self <: `40`] (val x: Self) extends AnyVal {
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
    def set40(value: String): Self = this.set("40", value.asInstanceOf[js.Any])
  }
  
}

