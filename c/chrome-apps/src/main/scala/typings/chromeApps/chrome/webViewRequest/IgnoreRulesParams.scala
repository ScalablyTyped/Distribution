package typings.chromeApps.chrome.webViewRequest

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgnoreRulesParams extends js.Object {
  /**
    * If set, rules with the specified tag are ignored. This ignoring is not persisted,
    * it affects only rules and their actions of the same network request stage.
    * Note that rules are executed in descending order of their priorities.
    * This action affects rules of lower priority than the current rule.
    * Rules with the same priority may or may not be ignored.
    */
  var hasTag: js.UndefOr[String] = js.undefined
  /**
    * If set, rules with a lower priority than the specified value are ignored.
    * This boundary is not persisted, it affects only rules and their actions
    * of the same network request stage.
    */
  var lowerPriorityThan: js.UndefOr[integer] = js.undefined
}

object IgnoreRulesParams {
  @scala.inline
  def apply(hasTag: String = null, lowerPriorityThan: Int | Double = null): IgnoreRulesParams = {
    val __obj = js.Dynamic.literal()
    if (hasTag != null) __obj.updateDynamic("hasTag")(hasTag.asInstanceOf[js.Any])
    if (lowerPriorityThan != null) __obj.updateDynamic("lowerPriorityThan")(lowerPriorityThan.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreRulesParams]
  }
}

