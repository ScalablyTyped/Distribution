package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPlatformBranchesResult extends StObject {
  
  /**
    * In a paginated request, if this value isn't null, it's the token that you can pass in a subsequent request to get the next response page.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * Summary information about the platform branches.
    */
  var PlatformBranchSummaryList: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformBranchSummaryList] = js.undefined
}
object ListPlatformBranchesResult {
  
  @scala.inline
  def apply(): ListPlatformBranchesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPlatformBranchesResult]
  }
  
  @scala.inline
  implicit class ListPlatformBranchesResultMutableBuilder[Self <: ListPlatformBranchesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPlatformBranchSummaryList(value: PlatformBranchSummaryList): Self = StObject.set(x, "PlatformBranchSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformBranchSummaryListUndefined: Self = StObject.set(x, "PlatformBranchSummaryList", js.undefined)
    
    @scala.inline
    def setPlatformBranchSummaryListVarargs(value: PlatformBranchSummary*): Self = StObject.set(x, "PlatformBranchSummaryList", js.Array(value :_*))
  }
}
