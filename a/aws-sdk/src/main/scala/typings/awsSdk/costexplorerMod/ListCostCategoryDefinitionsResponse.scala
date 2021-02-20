package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCostCategoryDefinitionsResponse extends StObject {
  
  /**
    *  A reference to a Cost Category containing enough information to identify the Cost Category. 
    */
  var CostCategoryReferences: js.UndefOr[CostCategoryReferencesList] = js.native
  
  /**
    *  The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size. 
    */
  var NextToken: js.UndefOr[NextPageToken] = js.native
}
object ListCostCategoryDefinitionsResponse {
  
  @scala.inline
  def apply(): ListCostCategoryDefinitionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCostCategoryDefinitionsResponse]
  }
  
  @scala.inline
  implicit class ListCostCategoryDefinitionsResponseMutableBuilder[Self <: ListCostCategoryDefinitionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCostCategoryReferences(value: CostCategoryReferencesList): Self = StObject.set(x, "CostCategoryReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCostCategoryReferencesUndefined: Self = StObject.set(x, "CostCategoryReferences", js.undefined)
    
    @scala.inline
    def setCostCategoryReferencesVarargs(value: CostCategoryReference*): Self = StObject.set(x, "CostCategoryReferences", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextPageToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
