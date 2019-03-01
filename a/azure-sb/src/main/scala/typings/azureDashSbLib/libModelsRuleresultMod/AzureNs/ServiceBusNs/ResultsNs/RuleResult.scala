package typings
package azureDashSbLib.libModelsRuleresultMod.AzureNs.ServiceBusNs.ResultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleResult extends js.Object {
  def parse(xml: js.Object): js.Object | js.Array[js.Object]
  def serialize(rule: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.CreateRuleOptions): java.lang.String
}

object RuleResult {
  @scala.inline
  def apply(
    parse: js.Function1[js.Object, js.Object | js.Array[js.Object]],
    serialize: js.Function1[
      azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.CreateRuleOptions, 
      java.lang.String
    ]
  ): RuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(parse)
    __obj.updateDynamic("serialize")(serialize)
    __obj.asInstanceOf[RuleResult]
  }
}

