package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConnectionAliasPermissionsResult extends StObject {
  
  /**
    * The identifier of the connection alias.
    */
  var AliasId: js.UndefOr[ConnectionAliasId] = js.undefined
  
  /**
    * The permissions associated with a connection alias.
    */
  var ConnectionAliasPermissions: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.ConnectionAliasPermissions] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeConnectionAliasPermissionsResult {
  
  inline def apply(): DescribeConnectionAliasPermissionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConnectionAliasPermissionsResult]
  }
  
  extension [Self <: DescribeConnectionAliasPermissionsResult](x: Self) {
    
    inline def setAliasId(value: ConnectionAliasId): Self = StObject.set(x, "AliasId", value.asInstanceOf[js.Any])
    
    inline def setAliasIdUndefined: Self = StObject.set(x, "AliasId", js.undefined)
    
    inline def setConnectionAliasPermissions(value: ConnectionAliasPermissions): Self = StObject.set(x, "ConnectionAliasPermissions", value.asInstanceOf[js.Any])
    
    inline def setConnectionAliasPermissionsUndefined: Self = StObject.set(x, "ConnectionAliasPermissions", js.undefined)
    
    inline def setConnectionAliasPermissionsVarargs(value: ConnectionAliasPermission*): Self = StObject.set(x, "ConnectionAliasPermissions", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
