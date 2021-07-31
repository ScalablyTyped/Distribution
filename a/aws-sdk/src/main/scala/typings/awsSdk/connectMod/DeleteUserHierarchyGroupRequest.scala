package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserHierarchyGroupRequest extends StObject {
  
  /**
    * The identifier of the hierarchy group.
    */
  var HierarchyGroupId: typings.awsSdk.connectMod.HierarchyGroupId
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
}
object DeleteUserHierarchyGroupRequest {
  
  @scala.inline
  def apply(HierarchyGroupId: HierarchyGroupId, InstanceId: InstanceId): DeleteUserHierarchyGroupRequest = {
    val __obj = js.Dynamic.literal(HierarchyGroupId = HierarchyGroupId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserHierarchyGroupRequest]
  }
  
  @scala.inline
  implicit class DeleteUserHierarchyGroupRequestMutableBuilder[Self <: DeleteUserHierarchyGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHierarchyGroupId(value: HierarchyGroupId): Self = StObject.set(x, "HierarchyGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
