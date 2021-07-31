package typings.awsSdk.identitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGroupResponse extends StObject {
  
  /**
    * Contains the group’s display name value. The length limit is 1024 characters. This value can consist of letters, accented characters, symbols, numbers, punctuation, tab, new line, carriage return, space and non breaking space in this attribute. The characters “&lt;&gt;;:%” are excluded. This value is specified at the time the group is created and stored as an attribute of the group object in the identity store.
    */
  var DisplayName: GroupDisplayName
  
  /**
    * The identifier for a group in the identity store.
    */
  var GroupId: ResourceId
}
object DescribeGroupResponse {
  
  @scala.inline
  def apply(DisplayName: GroupDisplayName, GroupId: ResourceId): DescribeGroupResponse = {
    val __obj = js.Dynamic.literal(DisplayName = DisplayName.asInstanceOf[js.Any], GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGroupResponse]
  }
  
  @scala.inline
  implicit class DescribeGroupResponseMutableBuilder[Self <: DescribeGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: GroupDisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupId(value: ResourceId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
  }
}
