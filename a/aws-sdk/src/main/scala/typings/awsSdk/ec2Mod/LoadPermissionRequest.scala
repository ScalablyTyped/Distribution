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
  
  inline def apply(): LoadPermissionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadPermissionRequest]
  }
  
  extension [Self <: LoadPermissionRequest](x: Self) {
    
    inline def setGroup(value: PermissionGroup): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
