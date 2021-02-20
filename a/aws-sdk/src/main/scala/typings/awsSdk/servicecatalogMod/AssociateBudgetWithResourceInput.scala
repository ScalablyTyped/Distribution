package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateBudgetWithResourceInput extends StObject {
  
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
  implicit class AssociateBudgetWithResourceInputMutableBuilder[Self <: AssociateBudgetWithResourceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: Id): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
