package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCostCategoryDefinitionResponse extends js.Object {
  /**
    *  The unique identifier for your Cost Category. 
    */
  var CostCategoryArn: js.UndefOr[Arn] = js.native
  /**
    *  The effective end date of the Cost Category as a result of deleting it. No costs after this date will be categorized by the deleted Cost Category. 
    */
  var EffectiveEnd: js.UndefOr[ZonedDateTime] = js.native
}

object DeleteCostCategoryDefinitionResponse {
  @scala.inline
  def apply(CostCategoryArn: Arn = null, EffectiveEnd: ZonedDateTime = null): DeleteCostCategoryDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    if (CostCategoryArn != null) __obj.updateDynamic("CostCategoryArn")(CostCategoryArn.asInstanceOf[js.Any])
    if (EffectiveEnd != null) __obj.updateDynamic("EffectiveEnd")(EffectiveEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCostCategoryDefinitionResponse]
  }
}

