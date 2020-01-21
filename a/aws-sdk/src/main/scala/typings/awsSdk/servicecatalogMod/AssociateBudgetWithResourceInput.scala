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
}

