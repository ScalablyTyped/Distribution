package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BudgetDetail extends StObject {
  
  /**
    * Name of the associated budget.
    */
  var BudgetName: js.UndefOr[typings.awsSdk.servicecatalogMod.BudgetName] = js.undefined
}
object BudgetDetail {
  
  @scala.inline
  def apply(): BudgetDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BudgetDetail]
  }
  
  @scala.inline
  implicit class BudgetDetailMutableBuilder[Self <: BudgetDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetNameUndefined: Self = StObject.set(x, "BudgetName", js.undefined)
  }
}
