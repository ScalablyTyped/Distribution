package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DockerVolumeConfiguration extends StObject {
  
  /**
    * If this value is true, the Docker volume is created if it does not already exist.  This field is only used if the scope is shared. 
    */
  var autoprovision: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The Docker volume driver to use. The driver value must match the driver name provided by Docker because it is used for task placement. If the driver was installed using the Docker plugin CLI, use docker plugin ls to retrieve the driver name from your container instance. If the driver was installed using another method, use Docker plugin discovery to retrieve the driver name. For more information, see Docker plugin discovery. This parameter maps to Driver in the Create a volume section of the Docker Remote API and the xxdriver option to docker volume create.
    */
  var driver: js.UndefOr[String] = js.undefined
  
  /**
    * A map of Docker driver-specific options passed through. This parameter maps to DriverOpts in the Create a volume section of the Docker Remote API and the xxopt option to docker volume create.
    */
  var driverOpts: js.UndefOr[StringMap] = js.undefined
  
  /**
    * Custom metadata to add to your Docker volume. This parameter maps to Labels in the Create a volume section of the Docker Remote API and the xxlabel option to docker volume create.
    */
  var labels: js.UndefOr[StringMap] = js.undefined
  
  /**
    * The scope for the Docker volume that determines its lifecycle. Docker volumes that are scoped to a task are automatically provisioned when the task starts and destroyed when the task stops. Docker volumes that are scoped as shared persist after the task stops.
    */
  var scope: js.UndefOr[Scope] = js.undefined
}
object DockerVolumeConfiguration {
  
  inline def apply(): DockerVolumeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DockerVolumeConfiguration]
  }
  
  extension [Self <: DockerVolumeConfiguration](x: Self) {
    
    inline def setAutoprovision(value: BoxedBoolean): Self = StObject.set(x, "autoprovision", value.asInstanceOf[js.Any])
    
    inline def setAutoprovisionUndefined: Self = StObject.set(x, "autoprovision", js.undefined)
    
    inline def setDriver(value: String): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    inline def setDriverOpts(value: StringMap): Self = StObject.set(x, "driverOpts", value.asInstanceOf[js.Any])
    
    inline def setDriverOptsUndefined: Self = StObject.set(x, "driverOpts", js.undefined)
    
    inline def setDriverUndefined: Self = StObject.set(x, "driver", js.undefined)
    
    inline def setLabels(value: StringMap): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
