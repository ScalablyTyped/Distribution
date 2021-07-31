package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDeploymentRequest extends StObject {
  
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the deployment if you wish to redeploy a previous deployment.
    */
  var DeploymentId: js.UndefOr[string] = js.undefined
  
  /**
    * The type of deployment. When used for ''CreateDeployment'', only ''NewDeployment'' and ''Redeployment'' are valid.
    */
  var DeploymentType: typings.awsSdk.greengrassMod.DeploymentType
  
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string
  
  /**
    * The ID of the group version to be deployed.
    */
  var GroupVersionId: js.UndefOr[string] = js.undefined
}
object CreateDeploymentRequest {
  
  @scala.inline
  def apply(DeploymentType: DeploymentType, GroupId: string): CreateDeploymentRequest = {
    val __obj = js.Dynamic.literal(DeploymentType = DeploymentType.asInstanceOf[js.Any], GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentRequest]
  }
  
  @scala.inline
  implicit class CreateDeploymentRequestMutableBuilder[Self <: CreateDeploymentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmznClientToken(value: string): Self = StObject.set(x, "AmznClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmznClientTokenUndefined: Self = StObject.set(x, "AmznClientToken", js.undefined)
    
    @scala.inline
    def setDeploymentId(value: string): Self = StObject.set(x, "DeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdUndefined: Self = StObject.set(x, "DeploymentId", js.undefined)
    
    @scala.inline
    def setDeploymentType(value: DeploymentType): Self = StObject.set(x, "DeploymentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupId(value: string): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupVersionId(value: string): Self = StObject.set(x, "GroupVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupVersionIdUndefined: Self = StObject.set(x, "GroupVersionId", js.undefined)
  }
}
