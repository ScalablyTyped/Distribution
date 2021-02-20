package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateUserHierarchyStructureRequest extends StObject {
  
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
  implicit class UpdateUserHierarchyStructureRequestMutableBuilder[Self <: UpdateUserHierarchyStructureRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHierarchyStructure(value: HierarchyStructureUpdate): Self = StObject.set(x, "HierarchyStructure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
