package typings.bcoeV8Coverage.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeCov extends js.Object {
  var count: Double = js.native
  var endOffset: Double = js.native
  var startOffset: Double = js.native
}

object RangeCov {
  @scala.inline
  def apply(count: Double, endOffset: Double, startOffset: Double): RangeCov = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeCov]
  }
  @scala.inline
  implicit class RangeCovOps[Self <: RangeCov] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndOffset(value: Double): Self = this.set("endOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartOffset(value: Double): Self = this.set("startOffset", value.asInstanceOf[js.Any])
  }
  
}

