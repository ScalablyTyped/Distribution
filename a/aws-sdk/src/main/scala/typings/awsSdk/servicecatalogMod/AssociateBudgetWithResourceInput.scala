package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateBudgetWithResourceInput extends StObject {
  
  /**
    * The name of the budget you want to associate.
    */
  var BudgetName: typings.awsSdk.servicecatalogMod.BudgetName
  
  /**
    *  The resource identifier. Either a portfolio-id or a product-id.
    */
  var ResourceId: Id
}
object AssociateBudgetWithResourceInput {
  
  inline def apply(BudgetName: BudgetName, ResourceId: Id): AssociateBudgetWithResourceInput = {
    val __obj = js.Dynamic.literal(BudgetName = BudgetName.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateBudgetWithResourceInput]
  }
  
  extension [Self <: AssociateBudgetWithResourceInput](x: Self) {
    
    inline def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: Id): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
