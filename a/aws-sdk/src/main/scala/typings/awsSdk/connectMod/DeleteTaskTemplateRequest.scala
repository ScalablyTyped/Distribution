package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTaskTemplateRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
  
  /**
    * A unique identifier for the task template.
    */
  var TaskTemplateId: typings.awsSdk.connectMod.TaskTemplateId
}
object DeleteTaskTemplateRequest {
  
  inline def apply(InstanceId: InstanceId, TaskTemplateId: TaskTemplateId): DeleteTaskTemplateRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], TaskTemplateId = TaskTemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTaskTemplateRequest]
  }
  
  extension [Self <: DeleteTaskTemplateRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setTaskTemplateId(value: TaskTemplateId): Self = StObject.set(x, "TaskTemplateId", value.asInstanceOf[js.Any])
  }
}
