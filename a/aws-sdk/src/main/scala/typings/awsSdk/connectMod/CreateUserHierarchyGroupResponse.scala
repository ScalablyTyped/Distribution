package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserHierarchyGroupResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the hierarchy group. 
    */
  var HierarchyGroupArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the hierarchy group.
    */
  var HierarchyGroupId: js.UndefOr[typings.awsSdk.connectMod.HierarchyGroupId] = js.undefined
}
object CreateUserHierarchyGroupResponse {
  
  inline def apply(): CreateUserHierarchyGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUserHierarchyGroupResponse]
  }
  
  extension [Self <: CreateUserHierarchyGroupResponse](x: Self) {
    
    inline def setHierarchyGroupArn(value: ARN): Self = StObject.set(x, "HierarchyGroupArn", value.asInstanceOf[js.Any])
    
    inline def setHierarchyGroupArnUndefined: Self = StObject.set(x, "HierarchyGroupArn", js.undefined)
    
    inline def setHierarchyGroupId(value: HierarchyGroupId): Self = StObject.set(x, "HierarchyGroupId", value.asInstanceOf[js.Any])
    
    inline def setHierarchyGroupIdUndefined: Self = StObject.set(x, "HierarchyGroupId", js.undefined)
  }
}
