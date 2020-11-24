package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDeploymentRequest extends js.Object {
  
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.native
  
  /**
    * The ID of the deployment if you wish to redeploy a previous deployment.
    */
  var DeploymentId: js.UndefOr[string] = js.native
  
  /**
    * The type of deployment. When used for ''CreateDeployment'', only ''NewDeployment'' and ''Redeployment'' are valid.
    */
  var DeploymentType: typings.awsSdk.greengrassMod.DeploymentType = js.native
  
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string = js.native
  
  /**
    * The ID of the group version to be deployed.
    */
  var GroupVersionId: js.UndefOr[string] = js.native
}
object CreateDeploymentRequest {
  
  @scala.inline
  def apply(DeploymentType: DeploymentType, GroupId: string): CreateDeploymentRequest = {
    val __obj = js.Dynamic.literal(DeploymentType = DeploymentType.asInstanceOf[js.Any], GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentRequest]
  }
  
  @scala.inline
  implicit class CreateDeploymentRequestOps[Self <: CreateDeploymentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeploymentType(value: DeploymentType): Self = this.set("DeploymentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupId(value: string): Self = this.set("GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmznClientToken(value: string): Self = this.set("AmznClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmznClientToken: Self = this.set("AmznClientToken", js.undefined)
    
    @scala.inline
    def setDeploymentId(value: string): Self = this.set("DeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentId: Self = this.set("DeploymentId", js.undefined)
    
    @scala.inline
    def setGroupVersionId(value: string): Self = this.set("GroupVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupVersionId: Self = this.set("GroupVersionId", js.undefined)
  }
}
