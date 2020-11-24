package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAccessPoliciesResponse extends js.Object {
  
  /**
    * A list that summarizes each access policy.
    */
  var accessPolicySummaries: AccessPolicySummaries = js.native
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListAccessPoliciesResponse {
  
  @scala.inline
  def apply(accessPolicySummaries: AccessPolicySummaries): ListAccessPoliciesResponse = {
    val __obj = js.Dynamic.literal(accessPolicySummaries = accessPolicySummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccessPoliciesResponse]
  }
  
  @scala.inline
  implicit class ListAccessPoliciesResponseOps[Self <: ListAccessPoliciesResponse] (val x: Self) extends AnyVal {
    
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
    def setAccessPolicySummariesVarargs(value: AccessPolicySummary*): Self = this.set("accessPolicySummaries", js.Array(value :_*))
    
    @scala.inline
    def setAccessPolicySummaries(value: AccessPolicySummaries): Self = this.set("accessPolicySummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
