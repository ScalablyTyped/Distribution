package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateBudgetWithResourceInput extends js.Object {
  /**
    * The name of the budget you want to associate.
    */
  var BudgetName: typings.awsSdk.servicecatalogMod.BudgetName = js.native
  /**
    *  The resource identifier. Either a portfolio-id or a product-id.
    */
  var ResourceId: Id = js.native
}

object AssociateBudgetWithResourceInput {
  @scala.inline
  def apply(BudgetName: BudgetName, ResourceId: Id): AssociateBudgetWithResourceInput = {
    val __obj = js.Dynamic.literal(BudgetName = BudgetName.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateBudgetWithResourceInput]
  }
  @scala.inline
  implicit class AssociateBudgetWithResourceInputOps[Self <: AssociateBudgetWithResourceInput] (val x: Self) extends AnyVal {
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
    def setBudgetName(value: BudgetName): Self = this.set("BudgetName", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceId(value: Id): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
  }
  
}

