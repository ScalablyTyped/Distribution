package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConnectionAliasPermissionsResult extends js.Object {
  
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
  implicit class DescribeConnectionAliasPermissionsResultOps[Self <: DescribeConnectionAliasPermissionsResult] (val x: Self) extends AnyVal {
    
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
    def setAliasId(value: ConnectionAliasId): Self = this.set("AliasId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliasId: Self = this.set("AliasId", js.undefined)
    
    @scala.inline
    def setConnectionAliasPermissionsVarargs(value: ConnectionAliasPermission*): Self = this.set("ConnectionAliasPermissions", js.Array(value :_*))
    
    @scala.inline
    def setConnectionAliasPermissions(value: ConnectionAliasPermissions): Self = this.set("ConnectionAliasPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionAliasPermissions: Self = this.set("ConnectionAliasPermissions", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
