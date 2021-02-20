package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUserHierarchyGroupResponse extends StObject {
  
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
  implicit class CreateUserHierarchyGroupResponseMutableBuilder[Self <: CreateUserHierarchyGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHierarchyGroupArn(value: ARN): Self = StObject.set(x, "HierarchyGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchyGroupArnUndefined: Self = StObject.set(x, "HierarchyGroupArn", js.undefined)
    
    @scala.inline
    def setHierarchyGroupId(value: HierarchyGroupId): Self = StObject.set(x, "HierarchyGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchyGroupIdUndefined: Self = StObject.set(x, "HierarchyGroupId", js.undefined)
  }
}
