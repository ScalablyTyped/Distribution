package typings.convertLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait layout extends js.Object {
  def fromEn(s: String): String = js.native
  def toEn(s: String): String = js.native
}

object layout {
  @scala.inline
  def apply(fromEn: String => String, toEn: String => String): layout = {
    val __obj = js.Dynamic.literal(fromEn = js.Any.fromFunction1(fromEn), toEn = js.Any.fromFunction1(toEn))
    __obj.asInstanceOf[layout]
  }
  @scala.inline
  implicit class layoutOps[Self <: layout] (val x: Self) extends AnyVal {
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
    def setFromEn(value: String => String): Self = this.set("fromEn", js.Any.fromFunction1(value))
    @scala.inline
    def setToEn(value: String => String): Self = this.set("toEn", js.Any.fromFunction1(value))
  }
  
}

