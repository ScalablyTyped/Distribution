package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeIpGroupsResult extends StObject {
  
  /**
    * The token to use to retrieve the next set of results, or null if no more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * Information about the IP access control groups.
    */
  var Result: js.UndefOr[WorkspacesIpGroupsList] = js.native
}
object DescribeIpGroupsResult {
  
  @scala.inline
  def apply(): DescribeIpGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIpGroupsResult]
  }
  
  @scala.inline
  implicit class DescribeIpGroupsResultMutableBuilder[Self <: DescribeIpGroupsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResult(value: WorkspacesIpGroupsList): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "Result", js.undefined)
    
    @scala.inline
    def setResultVarargs(value: WorkspacesIpGroup*): Self = StObject.set(x, "Result", js.Array(value :_*))
  }
}
