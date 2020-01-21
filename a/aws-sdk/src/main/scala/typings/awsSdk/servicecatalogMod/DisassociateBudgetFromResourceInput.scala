package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateBudgetFromResourceInput extends js.Object {
  /**
    * The name of the budget you want to disassociate.
    */
  var BudgetName: typings.awsSdk.servicecatalogMod.BudgetName = js.native
  /**
    * The resource identifier you want to disassociate from. Either a portfolio-id or a product-id.
    */
  var ResourceId: Id = js.native
}

object DisassociateBudgetFromResourceInput {
  @scala.inline
  def apply(BudgetName: BudgetName, ResourceId: Id): DisassociateBudgetFromResourceInput = {
    val __obj = js.Dynamic.literal(BudgetName = BudgetName.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisassociateBudgetFromResourceInput]
  }
}

