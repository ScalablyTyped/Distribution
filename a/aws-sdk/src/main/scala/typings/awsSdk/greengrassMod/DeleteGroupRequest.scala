package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGroupRequest extends StObject {
  
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string
}
object DeleteGroupRequest {
  
  @scala.inline
  def apply(GroupId: string): DeleteGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGroupRequest]
  }
  
  @scala.inline
  implicit class DeleteGroupRequestMutableBuilder[Self <: DeleteGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupId(value: string): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
  }
}
