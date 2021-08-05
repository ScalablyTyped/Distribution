package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the container.
    */
  var containerArn: js.UndefOr[String] = js.undefined
  
  /**
    * The number of CPU units set for the container. The value will be 0 if no value was specified in the container definition when the task definition was registered.
    */
  var cpu: js.UndefOr[String] = js.undefined
  
  /**
    * The exit code returned from the container.
    */
  var exitCode: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * The IDs of each GPU assigned to the container.
    */
  var gpuIds: js.UndefOr[GpuIds] = js.undefined
  
  /**
    * The health status of the container. If health checks are not configured for this container in its task definition, then it reports the health status as UNKNOWN.
    */
  var healthStatus: js.UndefOr[HealthStatus] = js.undefined
  
  /**
    * The image used for the container.
    */
  var image: js.UndefOr[String] = js.undefined
  
  /**
    * The container image manifest digest.  The imageDigest is only returned if the container is using an image hosted in Amazon ECR, otherwise it is omitted. 
    */
  var imageDigest: js.UndefOr[String] = js.undefined
  
  /**
    * The last known status of the container.
    */
  var lastStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The hard limit (in MiB) of memory set for the container.
    */
  var memory: js.UndefOr[String] = js.undefined
  
  /**
    * The soft limit (in MiB) of memory set for the container.
    */
  var memoryReservation: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the container.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The network bindings associated with the container.
    */
  var networkBindings: js.UndefOr[NetworkBindings] = js.undefined
  
  /**
    * The network interfaces associated with the container.
    */
  var networkInterfaces: js.UndefOr[NetworkInterfaces] = js.undefined
  
  /**
    * A short (255 max characters) human-readable string to provide additional details about a running or stopped container.
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Docker container.
    */
  var runtimeId: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the task.
    */
  var taskArn: js.UndefOr[String] = js.undefined
}
object Container {
  
  inline def apply(): Container = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Container]
  }
  
  extension [Self <: Container](x: Self) {
    
    inline def setContainerArn(value: String): Self = StObject.set(x, "containerArn", value.asInstanceOf[js.Any])
    
    inline def setContainerArnUndefined: Self = StObject.set(x, "containerArn", js.undefined)
    
    inline def setCpu(value: String): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    inline def setExitCode(value: BoxedInteger): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    inline def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
    
    inline def setGpuIds(value: GpuIds): Self = StObject.set(x, "gpuIds", value.asInstanceOf[js.Any])
    
    inline def setGpuIdsUndefined: Self = StObject.set(x, "gpuIds", js.undefined)
    
    inline def setGpuIdsVarargs(value: String*): Self = StObject.set(x, "gpuIds", js.Array(value :_*))
    
    inline def setHealthStatus(value: HealthStatus): Self = StObject.set(x, "healthStatus", value.asInstanceOf[js.Any])
    
    inline def setHealthStatusUndefined: Self = StObject.set(x, "healthStatus", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageDigest(value: String): Self = StObject.set(x, "imageDigest", value.asInstanceOf[js.Any])
    
    inline def setImageDigestUndefined: Self = StObject.set(x, "imageDigest", js.undefined)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLastStatus(value: String): Self = StObject.set(x, "lastStatus", value.asInstanceOf[js.Any])
    
    inline def setLastStatusUndefined: Self = StObject.set(x, "lastStatus", js.undefined)
    
    inline def setMemory(value: String): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryReservation(value: String): Self = StObject.set(x, "memoryReservation", value.asInstanceOf[js.Any])
    
    inline def setMemoryReservationUndefined: Self = StObject.set(x, "memoryReservation", js.undefined)
    
    inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworkBindings(value: NetworkBindings): Self = StObject.set(x, "networkBindings", value.asInstanceOf[js.Any])
    
    inline def setNetworkBindingsUndefined: Self = StObject.set(x, "networkBindings", js.undefined)
    
    inline def setNetworkBindingsVarargs(value: NetworkBinding*): Self = StObject.set(x, "networkBindings", js.Array(value :_*))
    
    inline def setNetworkInterfaces(value: NetworkInterfaces): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacesUndefined: Self = StObject.set(x, "networkInterfaces", js.undefined)
    
    inline def setNetworkInterfacesVarargs(value: NetworkInterface*): Self = StObject.set(x, "networkInterfaces", js.Array(value :_*))
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setRuntimeId(value: String): Self = StObject.set(x, "runtimeId", value.asInstanceOf[js.Any])
    
    inline def setRuntimeIdUndefined: Self = StObject.set(x, "runtimeId", js.undefined)
    
    inline def setTaskArn(value: String): Self = StObject.set(x, "taskArn", value.asInstanceOf[js.Any])
    
    inline def setTaskArnUndefined: Self = StObject.set(x, "taskArn", js.undefined)
  }
}
