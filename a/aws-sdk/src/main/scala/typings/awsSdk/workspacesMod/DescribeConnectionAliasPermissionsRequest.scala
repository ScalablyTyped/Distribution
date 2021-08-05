package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConnectionAliasPermissionsRequest extends StObject {
  
  /**
    * The identifier of the connection alias.
    */
  var AliasId: ConnectionAliasId
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[Limit] = js.undefined
  
  /**
    * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeConnectionAliasPermissionsRequest {
  
  inline def apply(AliasId: ConnectionAliasId): DescribeConnectionAliasPermissionsRequest = {
    val __obj = js.Dynamic.literal(AliasId = AliasId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConnectionAliasPermissionsRequest]
  }
  
  extension [Self <: DescribeConnectionAliasPermissionsRequest](x: Self) {
    
    inline def setAliasId(value: ConnectionAliasId): Self = StObject.set(x, "AliasId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: Limit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
