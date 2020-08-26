package typings.chrome.chrome.declarativeWebRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgnoreRules extends js.Object {
  var lowerPriorityThan: Double = js.native
}

object IgnoreRules {
  @scala.inline
  def apply(lowerPriorityThan: Double): IgnoreRules = {
    val __obj = js.Dynamic.literal(lowerPriorityThan = lowerPriorityThan.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreRules]
  }
  @scala.inline
  implicit class IgnoreRulesOps[Self <: IgnoreRules] (val x: Self) extends AnyVal {
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
    def setLowerPriorityThan(value: Double): Self = this.set("lowerPriorityThan", value.asInstanceOf[js.Any])
  }
  
}

