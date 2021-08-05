package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTaskSetRequest extends StObject {
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task set exists in.
    */
  var cluster: String
  
  var scale: Scale
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the service that the task set exists in.
    */
  var service: String
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the task set to update.
    */
  var taskSet: String
}
object UpdateTaskSetRequest {
  
  inline def apply(cluster: String, scale: Scale, service: String, taskSet: String): UpdateTaskSetRequest = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], taskSet = taskSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTaskSetRequest]
  }
  
  extension [Self <: UpdateTaskSetRequest](x: Self) {
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Scale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setTaskSet(value: String): Self = StObject.set(x, "taskSet", value.asInstanceOf[js.Any])
  }
}
