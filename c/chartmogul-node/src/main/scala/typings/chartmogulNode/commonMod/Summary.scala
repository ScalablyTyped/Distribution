package typings.chartmogulNode.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Summary extends js.Object {
  var current: Double = js.native
  var `percentage-change`: Double = js.native
  var previous: Double = js.native
}

object Summary {
  @scala.inline
  def apply(current: Double, `percentage-change`: Double, previous: Double): Summary = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
    __obj.updateDynamic("percentage-change")(`percentage-change`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Summary]
  }
  @scala.inline
  implicit class SummaryOps[Self <: Summary] (val x: Self) extends AnyVal {
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
    def setCurrent(value: Double): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def `setPercentage-change`(value: Double): Self = this.set("percentage-change", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevious(value: Double): Self = this.set("previous", value.asInstanceOf[js.Any])
  }
  
}

