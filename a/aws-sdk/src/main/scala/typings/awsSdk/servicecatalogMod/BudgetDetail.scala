package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BudgetDetail extends js.Object {
  /**
    * Name of the associated budget.
    */
  var BudgetName: js.UndefOr[typings.awsSdk.servicecatalogMod.BudgetName] = js.native
}

object BudgetDetail {
  @scala.inline
  def apply(BudgetName: BudgetName = null): BudgetDetail = {
    val __obj = js.Dynamic.literal()
    if (BudgetName != null) __obj.updateDynamic("BudgetName")(BudgetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BudgetDetail]
  }
}

