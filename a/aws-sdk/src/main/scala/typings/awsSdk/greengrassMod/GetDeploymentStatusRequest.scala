package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDeploymentStatusRequest extends StObject {
  
  /**
    * The ID of the deployment.
    */
  var DeploymentId: string = js.native
  
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string = js.native
}
object GetDeploymentStatusRequest {
  
  @scala.inline
  def apply(DeploymentId: string, GroupId: string): GetDeploymentStatusRequest = {
    val __obj = js.Dynamic.literal(DeploymentId = DeploymentId.asInstanceOf[js.Any], GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeploymentStatusRequest]
  }
  
  @scala.inline
  implicit class GetDeploymentStatusRequestMutableBuilder[Self <: GetDeploymentStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentId(value: string): Self = StObject.set(x, "DeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupId(value: string): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
  }
}
