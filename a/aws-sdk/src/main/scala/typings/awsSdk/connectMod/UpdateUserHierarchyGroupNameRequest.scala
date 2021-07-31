package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserHierarchyGroupNameRequest extends StObject {
  
  /**
    * The identifier of the hierarchy group.
    */
  var HierarchyGroupId: typings.awsSdk.connectMod.HierarchyGroupId
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
  
  /**
    * The name of the hierarchy group. Must not be more than 100 characters.
    */
  var Name: HierarchyGroupName
}
object UpdateUserHierarchyGroupNameRequest {
  
  @scala.inline
  def apply(HierarchyGroupId: HierarchyGroupId, InstanceId: InstanceId, Name: HierarchyGroupName): UpdateUserHierarchyGroupNameRequest = {
    val __obj = js.Dynamic.literal(HierarchyGroupId = HierarchyGroupId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserHierarchyGroupNameRequest]
  }
  
  @scala.inline
  implicit class UpdateUserHierarchyGroupNameRequestMutableBuilder[Self <: UpdateUserHierarchyGroupNameRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHierarchyGroupId(value: HierarchyGroupId): Self = StObject.set(x, "HierarchyGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: HierarchyGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
