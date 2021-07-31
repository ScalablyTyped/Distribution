package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserHierarchyGroupRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
  
  /**
    * The name of the user hierarchy group. Must not be more than 100 characters.
    */
  var Name: HierarchyGroupName
  
  /**
    * The identifier for the parent hierarchy group. The user hierarchy is created at level one if the parent group ID is null.
    */
  var ParentGroupId: js.UndefOr[HierarchyGroupId] = js.undefined
}
object CreateUserHierarchyGroupRequest {
  
  @scala.inline
  def apply(InstanceId: InstanceId, Name: HierarchyGroupName): CreateUserHierarchyGroupRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserHierarchyGroupRequest]
  }
  
  @scala.inline
  implicit class CreateUserHierarchyGroupRequestMutableBuilder[Self <: CreateUserHierarchyGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: HierarchyGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentGroupId(value: HierarchyGroupId): Self = StObject.set(x, "ParentGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentGroupIdUndefined: Self = StObject.set(x, "ParentGroupId", js.undefined)
  }
}
