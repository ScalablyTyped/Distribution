package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifySelfservicePermissionsRequest extends StObject {
  
  /**
    * The identifier of the directory.
    */
  var ResourceId: DirectoryId = js.native
  
  /**
    * The permissions to enable or disable self-service capabilities.
    */
  var SelfservicePermissions: typings.awsSdk.workspacesMod.SelfservicePermissions = js.native
}
object ModifySelfservicePermissionsRequest {
  
  @scala.inline
  def apply(ResourceId: DirectoryId, SelfservicePermissions: SelfservicePermissions): ModifySelfservicePermissionsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], SelfservicePermissions = SelfservicePermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifySelfservicePermissionsRequest]
  }
  
  @scala.inline
  implicit class ModifySelfservicePermissionsRequestMutableBuilder[Self <: ModifySelfservicePermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: DirectoryId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfservicePermissions(value: SelfservicePermissions): Self = StObject.set(x, "SelfservicePermissions", value.asInstanceOf[js.Any])
  }
}
