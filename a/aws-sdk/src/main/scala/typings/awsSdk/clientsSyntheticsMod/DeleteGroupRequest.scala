package typings.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGroupRequest extends StObject {
  
  /**
    * Specifies which group to delete. You can specify the group name, the ARN, or the group ID as the GroupIdentifier.
    */
  var GroupIdentifier: typings.awsSdk.clientsSyntheticsMod.GroupIdentifier
}
object DeleteGroupRequest {
  
  inline def apply(GroupIdentifier: GroupIdentifier): DeleteGroupRequest = {
    val __obj = js.Dynamic.literal(GroupIdentifier = GroupIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGroupRequest]
  }
  
  extension [Self <: DeleteGroupRequest](x: Self) {
    
    inline def setGroupIdentifier(value: GroupIdentifier): Self = StObject.set(x, "GroupIdentifier", value.asInstanceOf[js.Any])
  }
}
