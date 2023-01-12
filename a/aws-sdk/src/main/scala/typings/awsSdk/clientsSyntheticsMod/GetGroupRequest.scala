package typings.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGroupRequest extends StObject {
  
  /**
    * Specifies the group to return information for. You can specify the group name, the ARN, or the group ID as the GroupIdentifier.
    */
  var GroupIdentifier: typings.awsSdk.clientsSyntheticsMod.GroupIdentifier
}
object GetGroupRequest {
  
  inline def apply(GroupIdentifier: GroupIdentifier): GetGroupRequest = {
    val __obj = js.Dynamic.literal(GroupIdentifier = GroupIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setGroupIdentifier(value: GroupIdentifier): Self = StObject.set(x, "GroupIdentifier", value.asInstanceOf[js.Any])
  }
}
