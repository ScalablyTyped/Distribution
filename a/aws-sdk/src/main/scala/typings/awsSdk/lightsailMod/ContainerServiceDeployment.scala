package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerServiceDeployment extends StObject {
  
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
  implicit class ContainerServiceDeploymentMutableBuilder[Self <: ContainerServiceDeployment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainers(value: ContainerMap): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setPublicEndpoint(value: ContainerServiceEndpoint): Self = StObject.set(x, "publicEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicEndpointUndefined: Self = StObject.set(x, "publicEndpoint", js.undefined)
    
    @scala.inline
    def setState(value: ContainerServiceDeploymentState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setVersion(value: integer): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
