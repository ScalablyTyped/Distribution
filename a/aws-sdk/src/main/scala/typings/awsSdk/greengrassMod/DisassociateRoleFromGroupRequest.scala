package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateRoleFromGroupRequest extends StObject {
  
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string = js.native
}
object DisassociateRoleFromGroupRequest {
  
  @scala.inline
  def apply(GroupId: string): DisassociateRoleFromGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateRoleFromGroupRequest]
  }
  
  @scala.inline
  implicit class DisassociateRoleFromGroupRequestMutableBuilder[Self <: DisassociateRoleFromGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupId(value: string): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
  }
}
