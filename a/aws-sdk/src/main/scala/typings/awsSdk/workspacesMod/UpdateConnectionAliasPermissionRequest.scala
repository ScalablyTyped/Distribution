package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateConnectionAliasPermissionRequest extends StObject {
  
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
  implicit class UpdateConnectionAliasPermissionRequestMutableBuilder[Self <: UpdateConnectionAliasPermissionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasId(value: ConnectionAliasId): Self = StObject.set(x, "AliasId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionAliasPermission(value: ConnectionAliasPermission): Self = StObject.set(x, "ConnectionAliasPermission", value.asInstanceOf[js.Any])
  }
}
