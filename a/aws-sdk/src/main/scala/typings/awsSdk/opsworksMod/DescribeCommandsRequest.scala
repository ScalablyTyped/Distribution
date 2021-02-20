package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCommandsRequest extends StObject {
  
  /**
    * An array of command IDs. If you include this parameter, DescribeCommands returns a description of the specified commands. Otherwise, it returns a description of every command.
    */
  var CommandIds: js.UndefOr[Strings] = js.native
  
  /**
    * The deployment ID. If you include this parameter, DescribeCommands returns a description of the commands associated with the specified deployment.
    */
  var DeploymentId: js.UndefOr[String] = js.native
  
  /**
    * The instance ID. If you include this parameter, DescribeCommands returns a description of the commands associated with the specified instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
}
object DescribeCommandsRequest {
  
  @scala.inline
  def apply(): DescribeCommandsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCommandsRequest]
  }
  
  @scala.inline
  implicit class DescribeCommandsRequestMutableBuilder[Self <: DescribeCommandsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommandIds(value: Strings): Self = StObject.set(x, "CommandIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandIdsUndefined: Self = StObject.set(x, "CommandIds", js.undefined)
    
    @scala.inline
    def setCommandIdsVarargs(value: String*): Self = StObject.set(x, "CommandIds", js.Array(value :_*))
    
    @scala.inline
    def setDeploymentId(value: String): Self = StObject.set(x, "DeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdUndefined: Self = StObject.set(x, "DeploymentId", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
  }
}
