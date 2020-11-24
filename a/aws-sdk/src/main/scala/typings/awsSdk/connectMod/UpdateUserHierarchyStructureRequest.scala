package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateUserHierarchyStructureRequest extends js.Object {
  
  /**
    * The hierarchy levels to update.
    */
  var HierarchyStructure: HierarchyStructureUpdate = js.native
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
}
object UpdateUserHierarchyStructureRequest {
  
  @scala.inline
  def apply(HierarchyStructure: HierarchyStructureUpdate, InstanceId: InstanceId): UpdateUserHierarchyStructureRequest = {
    val __obj = js.Dynamic.literal(HierarchyStructure = HierarchyStructure.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserHierarchyStructureRequest]
  }
  
  @scala.inline
  implicit class UpdateUserHierarchyStructureRequestOps[Self <: UpdateUserHierarchyStructureRequest] (val x: Self) extends AnyVal {
    
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
    def setHierarchyStructure(value: HierarchyStructureUpdate): Self = this.set("HierarchyStructure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
  }
}
