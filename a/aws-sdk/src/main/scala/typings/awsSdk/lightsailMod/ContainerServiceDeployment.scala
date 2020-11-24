package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerServiceDeployment extends js.Object {
  
  /**
    * An object that describes the configuration for the containers of the deployment.
    */
  var containers: js.UndefOr[ContainerMap] = js.native
  
  /**
    * The timestamp when the deployment was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  
  /**
    * An object that describes the endpoint of the deployment.
    */
  var publicEndpoint: js.UndefOr[ContainerServiceEndpoint] = js.native
  
  /**
    * The state of the deployment. A deployment can be in one of the following states:    Activating - The deployment is being created.    Active - The deployment was successfully created, and it's currently running on the container service. The container service can have only one deployment in an active state at a time.    Inactive - The deployment was previously successfully created, but it is not currently running on the container service.    Failed - The deployment failed. Use the GetContainerLog action to view the log events for the containers in the deployment to try to determine the reason for the failure.  
    */
  var state: js.UndefOr[ContainerServiceDeploymentState] = js.native
  
  /**
    * The version number of the deployment.
    */
  var version: js.UndefOr[integer] = js.native
}
object ContainerServiceDeployment {
  
  @scala.inline
  def apply(): ContainerServiceDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerServiceDeployment]
  }
  
  @scala.inline
  implicit class ContainerServiceDeploymentOps[Self <: ContainerServiceDeployment] (val x: Self) extends AnyVal {
    
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
    def setContainers(value: ContainerMap): Self = this.set("containers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainers: Self = this.set("containers", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setPublicEndpoint(value: ContainerServiceEndpoint): Self = this.set("publicEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicEndpoint: Self = this.set("publicEndpoint", js.undefined)
    
    @scala.inline
    def setState(value: ContainerServiceDeploymentState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setVersion(value: integer): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
