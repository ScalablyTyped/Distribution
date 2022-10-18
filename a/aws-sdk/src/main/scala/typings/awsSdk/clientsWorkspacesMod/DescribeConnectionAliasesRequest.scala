package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConnectionAliasesRequest extends StObject {
  
  /**
    * The identifiers of the connection aliases to describe.
    */
  var AliasIds: js.UndefOr[ConnectionAliasIdList] = js.undefined
  
  /**
    * The maximum number of connection aliases to return.
    */
  var Limit: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.Limit] = js.undefined
  
  /**
    * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The identifier of the directory associated with the connection alias.
    */
  var ResourceId: js.UndefOr[NonEmptyString] = js.undefined
}
object DescribeConnectionAliasesRequest {
  
  inline def apply(): DescribeConnectionAliasesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConnectionAliasesRequest]
  }
  
  extension [Self <: DescribeConnectionAliasesRequest](x: Self) {
    
    inline def setAliasIds(value: ConnectionAliasIdList): Self = StObject.set(x, "AliasIds", value.asInstanceOf[js.Any])
    
    inline def setAliasIdsUndefined: Self = StObject.set(x, "AliasIds", js.undefined)
    
    inline def setAliasIdsVarargs(value: ConnectionAliasId*): Self = StObject.set(x, "AliasIds", js.Array(value*))
    
    inline def setLimit(value: Limit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceId(value: NonEmptyString): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
  }
}
