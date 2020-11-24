package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUserHierarchyGroupResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the hierarchy group. 
    */
  var HierarchyGroupArn: js.UndefOr[ARN] = js.native
  
  /**
    * The identifier of the hierarchy group.
    */
  var HierarchyGroupId: js.UndefOr[typings.awsSdk.connectMod.HierarchyGroupId] = js.native
}
object CreateUserHierarchyGroupResponse {
  
  @scala.inline
  def apply(): CreateUserHierarchyGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUserHierarchyGroupResponse]
  }
  
  @scala.inline
  implicit class CreateUserHierarchyGroupResponseOps[Self <: CreateUserHierarchyGroupResponse] (val x: Self) extends AnyVal {
    
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
    def setHierarchyGroupArn(value: ARN): Self = this.set("HierarchyGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHierarchyGroupArn: Self = this.set("HierarchyGroupArn", js.undefined)
    
    @scala.inline
    def setHierarchyGroupId(value: HierarchyGroupId): Self = this.set("HierarchyGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHierarchyGroupId: Self = this.set("HierarchyGroupId", js.undefined)
  }
}
