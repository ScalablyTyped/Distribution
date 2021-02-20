package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LastDeploymentInfo extends StObject {
  
  /**
    * A timestamp that indicates when the most recent deployment to the deployment group started.
    */
  var createTime: js.UndefOr[Timestamp] = js.native
  
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.native
  
  /**
    * A timestamp that indicates when the most recent deployment to the deployment group was complete.
    */
  var endTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The status of the most recent deployment.
    */
  var status: js.UndefOr[DeploymentStatus] = js.native
}
object LastDeploymentInfo {
  
  @scala.inline
  def apply(): LastDeploymentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastDeploymentInfo]
  }
  
  @scala.inline
  implicit class LastDeploymentInfoMutableBuilder[Self <: LastDeploymentInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: Timestamp): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDeploymentId(value: DeploymentId): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setStatus(value: DeploymentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
