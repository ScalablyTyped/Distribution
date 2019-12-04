package typings.azureDashSb.libModelsRuleresultMod.Azure.ServiceBus.Results

import typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.CreateRuleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleResult extends js.Object {
  def parse(xml: js.Object): js.Object | js.Array[js.Object]
  def serialize(rule: CreateRuleOptions): String
}

object RuleResult {
  @scala.inline
  def apply(parse: js.Object => js.Object | js.Array[js.Object], serialize: CreateRuleOptions => String): RuleResult = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), serialize = js.Any.fromFunction1(serialize))
  
    __obj.asInstanceOf[RuleResult]
  }
}

