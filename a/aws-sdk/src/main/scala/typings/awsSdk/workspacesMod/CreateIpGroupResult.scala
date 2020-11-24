package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateIpGroupResult extends js.Object {
  
  /**
    * The identifier of the group.
    */
  var GroupId: js.UndefOr[IpGroupId] = js.native
}
object CreateIpGroupResult {
  
  @scala.inline
  def apply(): CreateIpGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIpGroupResult]
  }
  
  @scala.inline
  implicit class CreateIpGroupResultOps[Self <: CreateIpGroupResult] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def deleteGroupId: Self = this.set("GroupId", js.undefined)
  }
}
