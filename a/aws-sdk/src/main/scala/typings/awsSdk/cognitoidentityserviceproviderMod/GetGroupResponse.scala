package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGroupResponse extends js.Object {
  
  /**
    * The group object for the group.
    */
  var Group: js.UndefOr[GroupType] = js.native
}
object GetGroupResponse {
  
  @scala.inline
  def apply(): GetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupResponse]
  }
  
  @scala.inline
  implicit class GetGroupResponseOps[Self <: GetGroupResponse] (val x: Self) extends AnyVal {
    
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
    def setGroup(value: GroupType): Self = this.set("Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("Group", js.undefined)
  }
}
