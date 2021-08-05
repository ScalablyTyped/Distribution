package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGroupResponse extends StObject {
  
  /**
    * A structure containing details about the new group.
    */
  var Group: typings.awsSdk.iamMod.Group
}
object CreateGroupResponse {
  
  inline def apply(Group: Group): CreateGroupResponse = {
    val __obj = js.Dynamic.literal(Group = Group.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupResponse]
  }
  
  extension [Self <: CreateGroupResponse](x: Self) {
    
    inline def setGroup(value: Group): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
  }
}
