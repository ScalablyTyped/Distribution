package typings
package chromeDashAppsLib.chromeNs.webViewRequestNs

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
  var hasTag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If set, rules with a lower priority than the specified value are ignored.
    * This boundary is not persisted, it affects only rules and their actions
    * of the same network request stage.
    */
  var lowerPriorityThan: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
}

object IgnoreRulesParams {
  @scala.inline
  def apply(
    hasTag: java.lang.String = null,
    lowerPriorityThan: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  ): IgnoreRulesParams = {
    val __obj = js.Dynamic.literal()
    if (hasTag != null) __obj.updateDynamic("hasTag")(hasTag)
    if (!js.isUndefined(lowerPriorityThan)) __obj.updateDynamic("lowerPriorityThan")(lowerPriorityThan)
    __obj.asInstanceOf[IgnoreRulesParams]
  }
}

