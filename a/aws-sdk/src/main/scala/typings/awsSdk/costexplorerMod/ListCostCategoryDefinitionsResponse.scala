package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCostCategoryDefinitionsResponse extends js.Object {
  
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
  implicit class ListCostCategoryDefinitionsResponseOps[Self <: ListCostCategoryDefinitionsResponse] (val x: Self) extends AnyVal {
    
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
    def setCostCategoryReferencesVarargs(value: CostCategoryReference*): Self = this.set("CostCategoryReferences", js.Array(value :_*))
    
    @scala.inline
    def setCostCategoryReferences(value: CostCategoryReferencesList): Self = this.set("CostCategoryReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCostCategoryReferences: Self = this.set("CostCategoryReferences", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextPageToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
