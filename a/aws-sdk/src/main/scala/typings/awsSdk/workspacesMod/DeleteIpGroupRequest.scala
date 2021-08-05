package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIpGroupRequest extends StObject {
  
  /**
    * The identifier of the IP access control group.
    */
  var GroupId: IpGroupId
}
object DeleteIpGroupRequest {
  
  inline def apply(GroupId: IpGroupId): DeleteIpGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIpGroupRequest]
  }
  
  extension [Self <: DeleteIpGroupRequest](x: Self) {
    
    inline def setGroupId(value: IpGroupId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
  }
}
