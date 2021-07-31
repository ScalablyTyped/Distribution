package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateBudgetFromResourceInput extends StObject {
  
  /**
    * The name of the budget you want to disassociate.
    */
  var BudgetName: typings.awsSdk.servicecatalogMod.BudgetName
  
  /**
    * The resource identifier you want to disassociate from. Either a portfolio-id or a product-id.
    */
  var ResourceId: Id
}
object DisassociateBudgetFromResourceInput {
  
  @scala.inline
  def apply(BudgetName: BudgetName, ResourceId: Id): DisassociateBudgetFromResourceInput = {
    val __obj = js.Dynamic.literal(BudgetName = BudgetName.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateBudgetFromResourceInput]
  }
  
  @scala.inline
  implicit class DisassociateBudgetFromResourceInputMutableBuilder[Self <: DisassociateBudgetFromResourceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: Id): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
