package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBudgetsForResourceOutput extends StObject {
  
  /**
    * Information about the associated budgets.
    */
  var Budgets: js.UndefOr[typings.awsSdk.servicecatalogMod.Budgets] = js.native
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
}
object ListBudgetsForResourceOutput {
  
  @scala.inline
  def apply(): ListBudgetsForResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBudgetsForResourceOutput]
  }
  
  @scala.inline
  implicit class ListBudgetsForResourceOutputMutableBuilder[Self <: ListBudgetsForResourceOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBudgets(value: Budgets): Self = StObject.set(x, "Budgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetsUndefined: Self = StObject.set(x, "Budgets", js.undefined)
    
    @scala.inline
    def setBudgetsVarargs(value: BudgetDetail*): Self = StObject.set(x, "Budgets", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
  }
}
