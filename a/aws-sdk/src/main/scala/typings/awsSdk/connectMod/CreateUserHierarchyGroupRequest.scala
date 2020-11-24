package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUserHierarchyGroupRequest extends js.Object {
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
  
  /**
    * The name of the user hierarchy group. Must not be more than 100 characters.
    */
  var Name: HierarchyGroupName = js.native
  
  /**
    * The identifier for the parent hierarchy group. The user hierarchy is created at level one if the parent group ID is null.
    */
  var ParentGroupId: js.UndefOr[HierarchyGroupId] = js.native
}
object CreateUserHierarchyGroupRequest {
  
  @scala.inline
  def apply(InstanceId: InstanceId, Name: HierarchyGroupName): CreateUserHierarchyGroupRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserHierarchyGroupRequest]
  }
  
  @scala.inline
  implicit class CreateUserHierarchyGroupRequestOps[Self <: CreateUserHierarchyGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: HierarchyGroupName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentGroupId(value: HierarchyGroupId): Self = this.set("ParentGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentGroupId: Self = this.set("ParentGroupId", js.undefined)
  }
}
