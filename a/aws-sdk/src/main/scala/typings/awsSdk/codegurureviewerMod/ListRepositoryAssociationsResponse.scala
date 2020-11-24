package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRepositoryAssociationsResponse extends js.Object {
  
  /**
    * The nextToken value to include in a future ListRecommendations request. When the results of a ListRecommendations request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.codegurureviewerMod.NextToken] = js.native
  
  /**
    * A list of repository associations that meet the criteria of the request.
    */
  var RepositoryAssociationSummaries: js.UndefOr[typings.awsSdk.codegurureviewerMod.RepositoryAssociationSummaries] = js.native
}
object ListRepositoryAssociationsResponse {
  
  @scala.inline
  def apply(): ListRepositoryAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRepositoryAssociationsResponse]
  }
  
  @scala.inline
  implicit class ListRepositoryAssociationsResponseOps[Self <: ListRepositoryAssociationsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setRepositoryAssociationSummariesVarargs(value: RepositoryAssociationSummary*): Self = this.set("RepositoryAssociationSummaries", js.Array(value :_*))
    
    @scala.inline
    def setRepositoryAssociationSummaries(value: RepositoryAssociationSummaries): Self = this.set("RepositoryAssociationSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryAssociationSummaries: Self = this.set("RepositoryAssociationSummaries", js.undefined)
  }
}
