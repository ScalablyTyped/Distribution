package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCommandsRequest extends StObject {
  
  /**
    * An array of command IDs. If you include this parameter, DescribeCommands returns a description of the specified commands. Otherwise, it returns a description of every command.
    */
  var CommandIds: js.UndefOr[Strings] = js.undefined
  
  /**
    * The deployment ID. If you include this parameter, DescribeCommands returns a description of the commands associated with the specified deployment.
    */
  var DeploymentId: js.UndefOr[String] = js.undefined
  
  /**
    * The instance ID. If you include this parameter, DescribeCommands returns a description of the commands associated with the specified instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
}
object DescribeCommandsRequest {
  
  inline def apply(): DescribeCommandsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCommandsRequest]
  }
  
  extension [Self <: DescribeCommandsRequest](x: Self) {
    
    inline def setCommandIds(value: Strings): Self = StObject.set(x, "CommandIds", value.asInstanceOf[js.Any])
    
    inline def setCommandIdsUndefined: Self = StObject.set(x, "CommandIds", js.undefined)
    
    inline def setCommandIdsVarargs(value: String*): Self = StObject.set(x, "CommandIds", js.Array(value :_*))
    
    inline def setDeploymentId(value: String): Self = StObject.set(x, "DeploymentId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentIdUndefined: Self = StObject.set(x, "DeploymentId", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
  }
}
