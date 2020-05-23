package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CostCategoryReference extends js.Object {
  /**
    *  The unique identifier for your Cost Category. 
    */
  var CostCategoryArn: js.UndefOr[Arn] = js.native
  /**
    *  The Cost Category's effective end date.
    */
  var EffectiveEnd: js.UndefOr[ZonedDateTime] = js.native
  /**
    *  The Cost Category's effective start date.
    */
  var EffectiveStart: js.UndefOr[ZonedDateTime] = js.native
  var Name: js.UndefOr[CostCategoryName] = js.native
  /**
    *  The number of rules associated with a specific Cost Category. 
    */
  var NumberOfRules: js.UndefOr[NonNegativeInteger] = js.native
}

object CostCategoryReference {
  @scala.inline
  def apply(
    CostCategoryArn: Arn = null,
    EffectiveEnd: ZonedDateTime = null,
    EffectiveStart: ZonedDateTime = null,
    Name: CostCategoryName = null,
    NumberOfRules: js.UndefOr[NonNegativeInteger] = js.undefined
  ): CostCategoryReference = {
    val __obj = js.Dynamic.literal()
    if (CostCategoryArn != null) __obj.updateDynamic("CostCategoryArn")(CostCategoryArn.asInstanceOf[js.Any])
    if (EffectiveEnd != null) __obj.updateDynamic("EffectiveEnd")(EffectiveEnd.asInstanceOf[js.Any])
    if (EffectiveStart != null) __obj.updateDynamic("EffectiveStart")(EffectiveStart.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (!js.isUndefined(NumberOfRules)) __obj.updateDynamic("NumberOfRules")(NumberOfRules.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CostCategoryReference]
  }
}

