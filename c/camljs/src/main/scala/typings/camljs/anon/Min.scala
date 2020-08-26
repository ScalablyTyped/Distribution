package typings.camljs.anon

import typings.camljs.mod.Aggregation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Min extends Aggregation {
  var min: String = js.native
}

object Min {
  @scala.inline
  def apply(min: String): Min = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Min]
  }
  @scala.inline
  implicit class MinOps[Self <: Min] (val x: Self) extends AnyVal {
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
    def setMin(value: String): Self = this.set("min", value.asInstanceOf[js.Any])
  }
  
}

