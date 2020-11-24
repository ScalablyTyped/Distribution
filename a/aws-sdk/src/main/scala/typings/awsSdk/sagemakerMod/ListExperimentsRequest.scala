package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListExperimentsRequest extends js.Object {
  
  /**
    * A filter that returns only experiments created after the specified time.
    */
  var CreatedAfter: js.UndefOr[Timestamp] = js.native
  
  /**
    * A filter that returns only experiments created before the specified time.
    */
  var CreatedBefore: js.UndefOr[Timestamp] = js.native
  
  /**
    * The maximum number of experiments to return in the response. The default value is 10.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.sagemakerMod.MaxResults] = js.native
  
  /**
    * If the previous call to ListExperiments didn't return the full set of experiments, the call returns a token for getting the next set of experiments.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  
  /**
    * The property used to sort results. The default value is CreationTime.
    */
  var SortBy: js.UndefOr[SortExperimentsBy] = js.native
  
  /**
    * The sort order. The default value is Descending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.sagemakerMod.SortOrder] = js.native
}
object ListExperimentsRequest {
  
  @scala.inline
  def apply(): ListExperimentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExperimentsRequest]
  }
  
  @scala.inline
  implicit class ListExperimentsRequestOps[Self <: ListExperimentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreatedAfter(value: Timestamp): Self = this.set("CreatedAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAfter: Self = this.set("CreatedAfter", js.undefined)
    
    @scala.inline
    def setCreatedBefore(value: Timestamp): Self = this.set("CreatedBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedBefore: Self = this.set("CreatedBefore", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSortBy(value: SortExperimentsBy): Self = this.set("SortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortBy: Self = this.set("SortBy", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrder): Self = this.set("SortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("SortOrder", js.undefined)
  }
}
