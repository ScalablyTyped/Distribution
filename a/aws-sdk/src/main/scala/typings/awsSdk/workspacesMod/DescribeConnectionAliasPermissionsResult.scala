package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConnectionAliasPermissionsResult extends StObject {
  
  /**
    * The identifier of the connection alias.
    */
  var AliasId: js.UndefOr[ConnectionAliasId] = js.native
  
  /**
    * The permissions associated with a connection alias.
    */
  var ConnectionAliasPermissions: js.UndefOr[typings.awsSdk.workspacesMod.ConnectionAliasPermissions] = js.native
  
  /**
    * The token to use to retrieve the next set of results, or null if no more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object DescribeConnectionAliasPermissionsResult {
  
  @scala.inline
  def apply(): DescribeConnectionAliasPermissionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConnectionAliasPermissionsResult]
  }
  
  @scala.inline
  implicit class DescribeConnectionAliasPermissionsResultMutableBuilder[Self <: DescribeConnectionAliasPermissionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasId(value: ConnectionAliasId): Self = StObject.set(x, "AliasId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasIdUndefined: Self = StObject.set(x, "AliasId", js.undefined)
    
    @scala.inline
    def setConnectionAliasPermissions(value: ConnectionAliasPermissions): Self = StObject.set(x, "ConnectionAliasPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionAliasPermissionsUndefined: Self = StObject.set(x, "ConnectionAliasPermissions", js.undefined)
    
    @scala.inline
    def setConnectionAliasPermissionsVarargs(value: ConnectionAliasPermission*): Self = StObject.set(x, "ConnectionAliasPermissions", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
