package typings.blueprintjsTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NextScrollLeft extends js.Object {
  var nextScrollLeft: Double = js.native
  var nextScrollTop: Double = js.native
}

object NextScrollLeft {
  @scala.inline
  def apply(nextScrollLeft: Double, nextScrollTop: Double): NextScrollLeft = {
    val __obj = js.Dynamic.literal(nextScrollLeft = nextScrollLeft.asInstanceOf[js.Any], nextScrollTop = nextScrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextScrollLeft]
  }
  @scala.inline
  implicit class NextScrollLeftOps[Self <: NextScrollLeft] (val x: Self) extends AnyVal {
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
    def setNextScrollLeft(value: Double): Self = this.set("nextScrollLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextScrollTop(value: Double): Self = this.set("nextScrollTop", value.asInstanceOf[js.Any])
  }
  
}

