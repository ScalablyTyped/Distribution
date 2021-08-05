package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerServiceDeployment extends StObject {
  
  /**
    * An object that describes the configuration for the containers of the deployment.
    */
  var containers: js.UndefOr[ContainerMap] = js.undefined
  
  /**
    * The timestamp when the deployment was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.undefined
  
  /**
    * An object that describes the endpoint of the deployment.
    */
  var publicEndpoint: js.UndefOr[ContainerServiceEndpoint] = js.undefined
  
  /**
    * The state of the deployment. A deployment can be in one of the following states:    Activating - The deployment is being created.    Active - The deployment was successfully created, and it's currently running on the container service. The container service can have only one deployment in an active state at a time.    Inactive - The deployment was previously successfully created, but it is not currently running on the container service.    Failed - The deployment failed. Use the GetContainerLog action to view the log events for the containers in the deployment to try to determine the reason for the failure.  
    */
  var state: js.UndefOr[ContainerServiceDeploymentState] = js.undefined
  
  /**
    * The version number of the deployment.
    */
  var version: js.UndefOr[integer] = js.undefined
}
object ContainerServiceDeployment {
  
  inline def apply(): ContainerServiceDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerServiceDeployment]
  }
  
  extension [Self <: ContainerServiceDeployment](x: Self) {
    
    inline def setContainers(value: ContainerMap): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    inline def setCreatedAt(value: IsoDate): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setPublicEndpoint(value: ContainerServiceEndpoint): Self = StObject.set(x, "publicEndpoint", value.asInstanceOf[js.Any])
    
    inline def setPublicEndpointUndefined: Self = StObject.set(x, "publicEndpoint", js.undefined)
    
    inline def setState(value: ContainerServiceDeploymentState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setVersion(value: integer): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
