package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserHierarchyStructureRequest extends StObject {
  
  /**
    * The hierarchy levels to update.
    */
  var HierarchyStructure: HierarchyStructureUpdate
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
}
object UpdateUserHierarchyStructureRequest {
  
  inline def apply(HierarchyStructure: HierarchyStructureUpdate, InstanceId: InstanceId): UpdateUserHierarchyStructureRequest = {
    val __obj = js.Dynamic.literal(HierarchyStructure = HierarchyStructure.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserHierarchyStructureRequest]
  }
  
  extension [Self <: UpdateUserHierarchyStructureRequest](x: Self) {
    
    inline def setHierarchyStructure(value: HierarchyStructureUpdate): Self = StObject.set(x, "HierarchyStructure", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
