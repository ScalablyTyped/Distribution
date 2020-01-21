package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCostCategoryDefinitionResponse extends js.Object {
  /**
    *  The unique identifier for your newly created Cost Category. 
    */
  var CostCategoryArn: js.UndefOr[Arn] = js.native
  /**
    *  The Cost Category's effective start date. 
    */
  var EffectiveStart: js.UndefOr[ZonedDateTime] = js.native
}

object CreateCostCategoryDefinitionResponse {
  @scala.inline
  def apply(CostCategoryArn: Arn = null, EffectiveStart: ZonedDateTime = null): CreateCostCategoryDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    if (CostCategoryArn != null) __obj.updateDynamic("CostCategoryArn")(CostCategoryArn.asInstanceOf[js.Any])
    if (EffectiveStart != null) __obj.updateDynamic("EffectiveStart")(EffectiveStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCostCategoryDefinitionResponse]
  }
}

