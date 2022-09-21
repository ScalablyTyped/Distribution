package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteCommandRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) or short name of the cluster the task is running in. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.undefined
  
  /**
    * The command to run on the container.
    */
  var command: String
  
  /**
    * The name of the container to execute the command on. A container name only needs to be specified for tasks containing multiple containers.
    */
  var container: js.UndefOr[String] = js.undefined
  
  /**
    * Use this flag to run your command in interactive mode.
    */
  var interactive: Boolean
  
  /**
    * The Amazon Resource Name (ARN) or ID of the task the container is part of.
    */
  var task: String
}
object ExecuteCommandRequest {
  
  inline def apply(command: String, interactive: Boolean, task: String): ExecuteCommandRequest = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], interactive = interactive.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteCommandRequest]
  }
  
  extension [Self <: ExecuteCommandRequest](x: Self) {
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setTask(value: String): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
  }
}
