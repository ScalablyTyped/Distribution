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
    Rules: CostCategoryRulesList,
    EffectiveEnd: ZonedDateTime = null
  ): CostCategory = {
    val __obj = js.Dynamic.literal(CostCategoryArn = CostCategoryArn.asInstanceOf[js.Any], EffectiveStart = EffectiveStart.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RuleVersion = RuleVersion.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    if (EffectiveEnd != null) __obj.updateDynamic("EffectiveEnd")(EffectiveEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[CostCategory]
  }
}

