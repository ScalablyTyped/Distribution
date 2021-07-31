package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadPermissionRequest extends StObject {
  
  /**
    * The name of the group.
    */
  var Group: js.UndefOr[PermissionGroup] = js.undefined
  
  /**
    * The AWS account ID.
    */
  var UserId: js.UndefOr[String] = js.undefined
}
object LoadPermissionRequest {
  
  @scala.inline
  def apply(): LoadPermissionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadPermissionRequest]
  }
  
  @scala.inline
  implicit class LoadPermissionRequestMutableBuilder[Self <: LoadPermissionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: PermissionGroup): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
