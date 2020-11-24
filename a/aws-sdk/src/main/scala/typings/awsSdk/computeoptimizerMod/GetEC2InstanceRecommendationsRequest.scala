package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEC2InstanceRecommendationsRequest extends js.Object {
  
  /**
    * The IDs of the AWS accounts for which to return instance recommendations. If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return instance recommendations. Only one account ID can be specified per request.
    */
  var accountIds: js.UndefOr[AccountIds] = js.native
  
  /**
    * An array of objects that describe a filter that returns a more specific list of instance recommendations.
    */
  var filters: js.UndefOr[Filters] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the instances for which to return recommendations.
    */
  var instanceArns: js.UndefOr[InstanceArns] = js.native
  
  /**
    * The maximum number of instance recommendations to return with a single request. To retrieve the remaining results, make another request with the returned NextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * The token to advance to the next page of instance recommendations.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object GetEC2InstanceRecommendationsRequest {
  
  @scala.inline
  def apply(): GetEC2InstanceRecommendationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEC2InstanceRecommendationsRequest]
  }
  
  @scala.inline
  implicit class GetEC2InstanceRecommendationsRequestOps[Self <: GetEC2InstanceRecommendationsRequest] (val x: Self) extends AnyVal {
    
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
    def setAccountIdsVarargs(value: AccountId*): Self = this.set("accountIds", js.Array(value :_*))
    
    @scala.inline
    def setAccountIds(value: AccountIds): Self = this.set("accountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountIds: Self = this.set("accountIds", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: Filters): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setInstanceArnsVarargs(value: InstanceArn*): Self = this.set("instanceArns", js.Array(value :_*))
    
    @scala.inline
    def setInstanceArns(value: InstanceArns): Self = this.set("instanceArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceArns: Self = this.set("instanceArns", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
