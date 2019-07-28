package typings.axeDashCore.axeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeResult extends js.Object {
  var all: js.Array[CheckResult]
  var any: js.Array[CheckResult]
  var failureSummary: js.UndefOr[String] = js.undefined
  var html: String
  var impact: js.UndefOr[ImpactValue] = js.undefined
  var none: js.Array[CheckResult]
  var target: js.Array[String]
  var xpath: js.UndefOr[js.Array[String]] = js.undefined
}

object NodeResult {
  @scala.inline
  def apply(
    all: js.Array[CheckResult],
    any: js.Array[CheckResult],
    html: String,
    none: js.Array[CheckResult],
    target: js.Array[String],
    failureSummary: String = null,
    impact: ImpactValue = null,
    xpath: js.Array[String] = null
  ): NodeResult = {
    val __obj = js.Dynamic.literal(all = all, any = any, html = html, none = none, target = target)
    if (failureSummary != null) __obj.updateDynamic("failureSummary")(failureSummary)
    if (impact != null) __obj.updateDynamic("impact")(impact)
    if (xpath != null) __obj.updateDynamic("xpath")(xpath)
    __obj.asInstanceOf[NodeResult]
  }
}

