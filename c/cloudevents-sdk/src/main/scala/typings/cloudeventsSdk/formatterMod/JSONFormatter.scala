package typings.cloudeventsSdk.formatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONFormatter extends js.Object {
  def format(payload: js.Any): js.Any = js.native
  def toString(payload: js.Any): String = js.native
}

object JSONFormatter {
  @scala.inline
  def apply(format: js.Any => js.Any, toString: js.Any => String): JSONFormatter = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), toString = js.Any.fromFunction1(toString))
    __obj.asInstanceOf[JSONFormatter]
  }
  @scala.inline
  implicit class JSONFormatterOps[Self <: JSONFormatter] (val x: Self) extends AnyVal {
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
    def setFormat(value: js.Any => js.Any): Self = this.set("format", js.Any.fromFunction1(value))
    @scala.inline
    def setToString(value: js.Any => String): Self = this.set("toString", js.Any.fromFunction1(value))
  }
  
}

