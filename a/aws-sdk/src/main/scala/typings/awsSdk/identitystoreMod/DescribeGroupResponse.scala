package typings.awsSdk.identitystoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGroupResponse extends js.Object {
  
  /**
    * Contains the group’s display name value. The length limit is 1024 characters. This value can consist of letters, accented characters, symbols, numbers, punctuation, tab, new line, carriage return, space and non breaking space in this attribute. The characters “&lt;&gt;;:%” are excluded. This value is specified at the time the group is created and stored as an attribute of the group object in the identity store.
    */
  var DisplayName: GroupDisplayName = js.native
  
  /**
    * The identifier for a group in the identity store.
    */
  var GroupId: ResourceId = js.native
}
object DescribeGroupResponse {
  
  @scala.inline
  def apply(DisplayName: GroupDisplayName, GroupId: ResourceId): DescribeGroupResponse = {
    val __obj = js.Dynamic.literal(DisplayName = DisplayName.asInstanceOf[js.Any], GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGroupResponse]
  }
  
  @scala.inline
  implicit class DescribeGroupResponseOps[Self <: DescribeGroupResponse] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: GroupDisplayName): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupId(value: ResourceId): Self = this.set("GroupId", value.asInstanceOf[js.Any])
  }
}
