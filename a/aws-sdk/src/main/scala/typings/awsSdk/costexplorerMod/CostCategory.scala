package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CostCategory extends js.Object {
  /**
    *  The unique identifier for your Cost Category. 
    */
  var CostCategoryArn: Arn = js.native
  /**
    *  The Cost Category's effective end date.
    */
  var EffectiveEnd: js.UndefOr[ZonedDateTime] = js.native
  /**
    *  The Cost Category's effective start date.
    */
  var EffectiveStart: ZonedDateTime = js.native
  var Name: CostCategoryName = js.native
  var RuleVersion: CostCategoryRuleVersion = js.native
  /**
    *  Rules are processed in order. If there are multiple rules that match the line item, then the first rule to match is used to determine that Cost Category value. 
    */
  var Rules: CostCategoryRulesList = js.native
}

object CostCategory {
  @scala.inline
  def apply(
    CostCategoryArn: Arn,
    EffectiveStart: ZonedDateTime,
    Name: CostCategoryName,
    RuleVersion: CostCategoryRuleVersion,
    Rules: CostCategoryRulesList
  ): CostCategory = {
    val __obj = js.Dynamic.literal(CostCategoryArn = CostCategoryArn.asInstanceOf[js.Any], EffectiveStart = EffectiveStart.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RuleVersion = RuleVersion.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CostCategory]
  }
  @scala.inline
  implicit class CostCategoryOps[Self <: CostCategory] (val x: Self) extends AnyVal {
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
    def setCostCategoryArn(value: Arn): Self = this.set("CostCategoryArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setEffectiveStart(value: ZonedDateTime): Self = this.set("EffectiveStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: CostCategoryName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleVersion(value: CostCategoryRuleVersion): Self = this.set("RuleVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setRulesVarargs(value: CostCategoryRule*): Self = this.set("Rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: CostCategoryRulesList): Self = this.set("Rules", value.asInstanceOf[js.Any])
    @scala.inline
    def setEffectiveEnd(value: ZonedDateTime): Self = this.set("EffectiveEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffectiveEnd: Self = this.set("EffectiveEnd", js.undefined)
  }
  
}

