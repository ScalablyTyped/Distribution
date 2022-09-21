package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteCommandResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the cluster.
    */
  var clusterArn: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the container.
    */
  var containerArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the container.
    */
  var containerName: js.UndefOr[String] = js.undefined
  
  /**
    * Determines whether the execute command session is running in interactive mode. Amazon ECS only supports initiating interactive sessions, so you must specify true for this value.
    */
  var interactive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The details of the SSM session that was created for this instance of execute-command.
    */
  var session: js.UndefOr[Session] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the task.
    */
  var taskArn: js.UndefOr[String] = js.undefined
}
object ExecuteCommandResponse {
  
  inline def apply(): ExecuteCommandResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteCommandResponse]
  }
  
  extension [Self <: ExecuteCommandResponse](x: Self) {
    
    inline def setClusterArn(value: String): Self = StObject.set(x, "clusterArn", value.asInstanceOf[js.Any])
    
    inline def setClusterArnUndefined: Self = StObject.set(x, "clusterArn", js.undefined)
    
    inline def setContainerArn(value: String): Self = StObject.set(x, "containerArn", value.asInstanceOf[js.Any])
    
    inline def setContainerArnUndefined: Self = StObject.set(x, "containerArn", js.undefined)
    
    inline def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    inline def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    inline def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setTaskArn(value: String): Self = StObject.set(x, "taskArn", value.asInstanceOf[js.Any])
    
    inline def setTaskArnUndefined: Self = StObject.set(x, "taskArn", js.undefined)
  }
}
