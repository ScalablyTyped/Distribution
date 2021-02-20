package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Container extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the container.
    */
  var containerArn: js.UndefOr[String] = js.native
  
  /**
    * The number of CPU units set for the container. The value will be 0 if no value was specified in the container definition when the task definition was registered.
    */
  var cpu: js.UndefOr[String] = js.native
  
  /**
    * The exit code returned from the container.
    */
  var exitCode: js.UndefOr[BoxedInteger] = js.native
  
  /**
    * The IDs of each GPU assigned to the container.
    */
  var gpuIds: js.UndefOr[GpuIds] = js.native
  
  /**
    * The health status of the container. If health checks are not configured for this container in its task definition, then it reports the health status as UNKNOWN.
    */
  var healthStatus: js.UndefOr[HealthStatus] = js.native
  
  /**
    * The image used for the container.
    */
  var image: js.UndefOr[String] = js.native
  
  /**
    * The container image manifest digest.  The imageDigest is only returned if the container is using an image hosted in Amazon ECR, otherwise it is omitted. 
    */
  var imageDigest: js.UndefOr[String] = js.native
  
  /**
    * The last known status of the container.
    */
  var lastStatus: js.UndefOr[String] = js.native
  
  /**
    * The hard limit (in MiB) of memory set for the container.
    */
  var memory: js.UndefOr[String] = js.native
  
  /**
    * The soft limit (in MiB) of memory set for the container.
    */
  var memoryReservation: js.UndefOr[String] = js.native
  
  /**
    * The name of the container.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The network bindings associated with the container.
    */
  var networkBindings: js.UndefOr[NetworkBindings] = js.native
  
  /**
    * The network interfaces associated with the container.
    */
  var networkInterfaces: js.UndefOr[NetworkInterfaces] = js.native
  
  /**
    * A short (255 max characters) human-readable string to provide additional details about a running or stopped container.
    */
  var reason: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Docker container.
    */
  var runtimeId: js.UndefOr[String] = js.native
  
  /**
    * The ARN of the task.
    */
  var taskArn: js.UndefOr[String] = js.native
}
object Container {
  
  @scala.inline
  def apply(): Container = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit class ContainerMutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerArn(value: String): Self = StObject.set(x, "containerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerArnUndefined: Self = StObject.set(x, "containerArn", js.undefined)
    
    @scala.inline
    def setCpu(value: String): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    @scala.inline
    def setExitCode(value: BoxedInteger): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
    
    @scala.inline
    def setGpuIds(value: GpuIds): Self = StObject.set(x, "gpuIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGpuIdsUndefined: Self = StObject.set(x, "gpuIds", js.undefined)
    
    @scala.inline
    def setGpuIdsVarargs(value: String*): Self = StObject.set(x, "gpuIds", js.Array(value :_*))
    
    @scala.inline
    def setHealthStatus(value: HealthStatus): Self = StObject.set(x, "healthStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthStatusUndefined: Self = StObject.set(x, "healthStatus", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageDigest(value: String): Self = StObject.set(x, "imageDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageDigestUndefined: Self = StObject.set(x, "imageDigest", js.undefined)
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setLastStatus(value: String): Self = StObject.set(x, "lastStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastStatusUndefined: Self = StObject.set(x, "lastStatus", js.undefined)
    
    @scala.inline
    def setMemory(value: String): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryReservation(value: String): Self = StObject.set(x, "memoryReservation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryReservationUndefined: Self = StObject.set(x, "memoryReservation", js.undefined)
    
    @scala.inline
    def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetworkBindings(value: NetworkBindings): Self = StObject.set(x, "networkBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkBindingsUndefined: Self = StObject.set(x, "networkBindings", js.undefined)
    
    @scala.inline
    def setNetworkBindingsVarargs(value: NetworkBinding*): Self = StObject.set(x, "networkBindings", js.Array(value :_*))
    
    @scala.inline
    def setNetworkInterfaces(value: NetworkInterfaces): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfacesUndefined: Self = StObject.set(x, "networkInterfaces", js.undefined)
    
    @scala.inline
    def setNetworkInterfacesVarargs(value: NetworkInterface*): Self = StObject.set(x, "networkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setRuntimeId(value: String): Self = StObject.set(x, "runtimeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeIdUndefined: Self = StObject.set(x, "runtimeId", js.undefined)
    
    @scala.inline
    def setTaskArn(value: String): Self = StObject.set(x, "taskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskArnUndefined: Self = StObject.set(x, "taskArn", js.undefined)
  }
}
