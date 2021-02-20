package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAccessPoliciesResponse extends StObject {
  
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
  implicit class ListAccessPoliciesResponseMutableBuilder[Self <: ListAccessPoliciesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessPolicySummaries(value: AccessPolicySummaries): Self = StObject.set(x, "accessPolicySummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPolicySummariesVarargs(value: AccessPolicySummary*): Self = StObject.set(x, "accessPolicySummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
