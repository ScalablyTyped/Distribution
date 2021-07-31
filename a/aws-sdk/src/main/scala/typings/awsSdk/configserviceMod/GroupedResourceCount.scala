package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupedResourceCount extends StObject {
  
  /**
    * The name of the group that can be region, account ID, or resource type. For example, region1, region2 if the region was chosen as GroupByKey.
    */
  var GroupName: StringWithCharLimit256
  
  /**
    * The number of resources in the group.
    */
  var ResourceCount: Long
}
object GroupedResourceCount {
  
  @scala.inline
  def apply(GroupName: StringWithCharLimit256, ResourceCount: Long): GroupedResourceCount = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any], ResourceCount = ResourceCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupedResourceCount]
  }
  
  @scala.inline
  implicit class GroupedResourceCountMutableBuilder[Self <: GroupedResourceCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupName(value: StringWithCharLimit256): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceCount(value: Long): Self = StObject.set(x, "ResourceCount", value.asInstanceOf[js.Any])
  }
}
