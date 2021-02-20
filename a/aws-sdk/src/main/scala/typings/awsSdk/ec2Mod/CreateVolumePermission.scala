package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVolumePermission extends StObject {
  
  /**
    * The group to be added or removed. The possible value is all.
    */
  var Group: js.UndefOr[PermissionGroup] = js.native
  
  /**
    * The AWS account ID to be added or removed.
    */
  var UserId: js.UndefOr[String] = js.native
}
object CreateVolumePermission {
  
  @scala.inline
  def apply(): CreateVolumePermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVolumePermission]
  }
  
  @scala.inline
  implicit class CreateVolumePermissionMutableBuilder[Self <: CreateVolumePermission] (val x: Self) extends AnyVal {
    
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
