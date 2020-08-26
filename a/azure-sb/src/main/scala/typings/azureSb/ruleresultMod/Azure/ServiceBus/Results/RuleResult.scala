package typings.azureSb.ruleresultMod.Azure.ServiceBus.Results

import typings.azureSb.mod.Azure.ServiceBus.CreateRuleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleResult extends js.Object {
  def parse(xml: js.Object): js.Object | js.Array[js.Object] = js.native
  def serialize(rule: CreateRuleOptions): String = js.native
}

object RuleResult {
  @scala.inline
  def apply(parse: js.Object => js.Object | js.Array[js.Object], serialize: CreateRuleOptions => String): RuleResult = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), serialize = js.Any.fromFunction1(serialize))
    __obj.asInstanceOf[RuleResult]
  }
  @scala.inline
  implicit class RuleResultOps[Self <: RuleResult] (val x: Self) extends AnyVal {
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
    def setParse(value: js.Object => js.Object | js.Array[js.Object]): Self = this.set("parse", js.Any.fromFunction1(value))
    @scala.inline
    def setSerialize(value: CreateRuleOptions => String): Self = this.set("serialize", js.Any.fromFunction1(value))
  }
  
}

