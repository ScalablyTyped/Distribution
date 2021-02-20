package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchPermission extends StObject {
  
  /**
    * The name of the group.
    */
  var Group: js.UndefOr[PermissionGroup] = js.native
  
  /**
    * The AWS account ID.
    */
  var UserId: js.UndefOr[String] = js.native
}
object LaunchPermission {
  
  @scala.inline
  def apply(): LaunchPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchPermission]
  }
  
  @scala.inline
  implicit class LaunchPermissionMutableBuilder[Self <: LaunchPermission] (val x: Self) extends AnyVal {
    
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
