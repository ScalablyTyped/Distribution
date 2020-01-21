package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCostCategoryDefinitionResponse extends js.Object {
  var CostCategory: js.UndefOr[typings.awsSdk.costexplorerMod.CostCategory] = js.native
}

object DescribeCostCategoryDefinitionResponse {
  @scala.inline
  def apply(CostCategory: CostCategory = null): DescribeCostCategoryDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    if (CostCategory != null) __obj.updateDynamic("CostCategory")(CostCategory.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCostCategoryDefinitionResponse]
  }
}

