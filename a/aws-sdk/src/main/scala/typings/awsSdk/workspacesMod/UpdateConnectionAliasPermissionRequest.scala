package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateConnectionAliasPermissionRequest extends js.Object {
  
  /**
    * The identifier of the connection alias that you want to update permissions for.
    */
  var AliasId: ConnectionAliasId = js.native
  
  /**
    * Indicates whether to share or unshare the connection alias with the specified AWS account.
    */
  var ConnectionAliasPermission: typings.awsSdk.workspacesMod.ConnectionAliasPermission = js.native
}
object UpdateConnectionAliasPermissionRequest {
  
  @scala.inline
  def apply(AliasId: ConnectionAliasId, ConnectionAliasPermission: ConnectionAliasPermission): UpdateConnectionAliasPermissionRequest = {
    val __obj = js.Dynamic.literal(AliasId = AliasId.asInstanceOf[js.Any], ConnectionAliasPermission = ConnectionAliasPermission.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConnectionAliasPermissionRequest]
  }
  
  @scala.inline
  implicit class UpdateConnectionAliasPermissionRequestOps[Self <: UpdateConnectionAliasPermissionRequest] (val x: Self) extends AnyVal {
    
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
    def setConnectionAliasPermission(value: ConnectionAliasPermission): Self = this.set("ConnectionAliasPermission", value.asInstanceOf[js.Any])
  }
}
