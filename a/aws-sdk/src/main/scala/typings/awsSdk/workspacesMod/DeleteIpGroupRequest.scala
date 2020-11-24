package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteIpGroupRequest extends js.Object {
  
  /**
    * The identifier of the IP access control group.
    */
  var GroupId: IpGroupId = js.native
}
object DeleteIpGroupRequest {
  
  @scala.inline
  def apply(GroupId: IpGroupId): DeleteIpGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIpGroupRequest]
  }
  
  @scala.inline
  implicit class DeleteIpGroupRequestOps[Self <: DeleteIpGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGroupId(value: IpGroupId): Self = this.set("GroupId", value.asInstanceOf[js.Any])
  }
}
