package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConnectClientAddInsRequest extends StObject {
  
  /**
    * The maximum number of items to return.
    */
  var MaxResults: js.UndefOr[Limit] = js.undefined
  
  /**
    * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The directory identifier for which the client add-in is configured.
    */
  var ResourceId: DirectoryId
}
object DescribeConnectClientAddInsRequest {
  
  inline def apply(ResourceId: DirectoryId): DescribeConnectClientAddInsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConnectClientAddInsRequest]
  }
  
  extension [Self <: DescribeConnectClientAddInsRequest](x: Self) {
    
    inline def setMaxResults(value: Limit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceId(value: DirectoryId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
