package typings.chromeApps.chrome.webViewRequest

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgnoreRulesParams extends js.Object {
  /**
    * If set, rules with the specified tag are ignored. This ignoring is not persisted,
    * it affects only rules and their actions of the same network request stage.
    * Note that rules are executed in descending order of their priorities.
    * This action affects rules of lower priority than the current rule.
    * Rules with the same priority may or may not be ignored.
    */
  var hasTag: js.UndefOr[String] = js.native
  /**
    * If set, rules with a lower priority than the specified value are ignored.
    * This boundary is not persisted, it affects only rules and their actions
    * of the same network request stage.
    */
  var lowerPriorityThan: js.UndefOr[integer] = js.native
}

object IgnoreRulesParams {
  @scala.inline
  def apply(): IgnoreRulesParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreRulesParams]
  }
  @scala.inline
  implicit class IgnoreRulesParamsOps[Self <: IgnoreRulesParams] (val x: Self) extends AnyVal {
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
    def setHasTag(value: String): Self = this.set("hasTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasTag: Self = this.set("hasTag", js.undefined)
    @scala.inline
    def setLowerPriorityThan(value: integer): Self = this.set("lowerPriorityThan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowerPriorityThan: Self = this.set("lowerPriorityThan", js.undefined)
  }
  
}

