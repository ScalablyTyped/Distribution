package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIpGroupsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Information about the IP access control groups.
    */
  var Result: js.UndefOr[WorkspacesIpGroupsList] = js.undefined
}
object DescribeIpGroupsResult {
  
  inline def apply(): DescribeIpGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIpGroupsResult]
  }
  
  extension [Self <: DescribeIpGroupsResult](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResult(value: WorkspacesIpGroupsList): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "Result", js.undefined)
    
    inline def setResultVarargs(value: WorkspacesIpGroup*): Self = StObject.set(x, "Result", js.Array(value*))
  }
}
