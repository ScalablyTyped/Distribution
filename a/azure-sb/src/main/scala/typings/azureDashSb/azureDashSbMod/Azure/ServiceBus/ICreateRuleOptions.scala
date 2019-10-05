package typings.azureDashSb.azureDashSbMod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICreateRuleOptions extends js.Object {
  var correlationIdFilter: String
  var falseFilter: String
  var sqlExpressionFilter: String
  var sqlRuleAction: String
  var trueFilter: String
}

object ICreateRuleOptions {
  @scala.inline
  def apply(
    correlationIdFilter: String,
    falseFilter: String,
    sqlExpressionFilter: String,
    sqlRuleAction: String,
    trueFilter: String
  ): ICreateRuleOptions = {
    val __obj = js.Dynamic.literal(correlationIdFilter = correlationIdFilter, falseFilter = falseFilter, sqlExpressionFilter = sqlExpressionFilter, sqlRuleAction = sqlRuleAction, trueFilter = trueFilter)
  
    __obj.asInstanceOf[ICreateRuleOptions]
  }
}

