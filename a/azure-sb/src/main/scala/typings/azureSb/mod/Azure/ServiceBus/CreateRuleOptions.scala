package typings.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.ICreateRuleOptions> */
trait CreateRuleOptions extends js.Object {
  var correlationIdFilter: js.UndefOr[String] = js.undefined
  var falseFilter: js.UndefOr[String] = js.undefined
  var sqlExpressionFilter: js.UndefOr[String] = js.undefined
  var sqlRuleAction: js.UndefOr[String] = js.undefined
  var trueFilter: js.UndefOr[String] = js.undefined
}

object CreateRuleOptions {
  @scala.inline
  def apply(
    correlationIdFilter: String = null,
    falseFilter: String = null,
    sqlExpressionFilter: String = null,
    sqlRuleAction: String = null,
    trueFilter: String = null
  ): CreateRuleOptions = {
    val __obj = js.Dynamic.literal()
    if (correlationIdFilter != null) __obj.updateDynamic("correlationIdFilter")(correlationIdFilter.asInstanceOf[js.Any])
    if (falseFilter != null) __obj.updateDynamic("falseFilter")(falseFilter.asInstanceOf[js.Any])
    if (sqlExpressionFilter != null) __obj.updateDynamic("sqlExpressionFilter")(sqlExpressionFilter.asInstanceOf[js.Any])
    if (sqlRuleAction != null) __obj.updateDynamic("sqlRuleAction")(sqlRuleAction.asInstanceOf[js.Any])
    if (trueFilter != null) __obj.updateDynamic("trueFilter")(trueFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRuleOptions]
  }
}

