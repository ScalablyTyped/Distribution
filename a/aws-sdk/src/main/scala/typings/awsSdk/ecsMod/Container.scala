package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Container extends js.Object {
  
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
  implicit class ContainerOps[Self <: Container] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContainerArn(value: String): Self = this.set("containerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerArn: Self = this.set("containerArn", js.undefined)
    
    @scala.inline
    def setCpu(value: String): Self = this.set("cpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpu: Self = this.set("cpu", js.undefined)
    
    @scala.inline
    def setExitCode(value: BoxedInteger): Self = this.set("exitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitCode: Self = this.set("exitCode", js.undefined)
    
    @scala.inline
    def setGpuIdsVarargs(value: String*): Self = this.set("gpuIds", js.Array(value :_*))
    
    @scala.inline
    def setGpuIds(value: GpuIds): Self = this.set("gpuIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGpuIds: Self = this.set("gpuIds", js.undefined)
    
    @scala.inline
    def setHealthStatus(value: HealthStatus): Self = this.set("healthStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthStatus: Self = this.set("healthStatus", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setImageDigest(value: String): Self = this.set("imageDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageDigest: Self = this.set("imageDigest", js.undefined)
    
    @scala.inline
    def setLastStatus(value: String): Self = this.set("lastStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastStatus: Self = this.set("lastStatus", js.undefined)
    
    @scala.inline
    def setMemory(value: String): Self = this.set("memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemory: Self = this.set("memory", js.undefined)
    
    @scala.inline
    def setMemoryReservation(value: String): Self = this.set("memoryReservation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoryReservation: Self = this.set("memoryReservation", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNetworkBindingsVarargs(value: NetworkBinding*): Self = this.set("networkBindings", js.Array(value :_*))
    
    @scala.inline
    def setNetworkBindings(value: NetworkBindings): Self = this.set("networkBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkBindings: Self = this.set("networkBindings", js.undefined)
    
    @scala.inline
    def setNetworkInterfacesVarargs(value: NetworkInterface*): Self = this.set("networkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setNetworkInterfaces(value: NetworkInterfaces): Self = this.set("networkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterfaces: Self = this.set("networkInterfaces", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setRuntimeId(value: String): Self = this.set("runtimeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimeId: Self = this.set("runtimeId", js.undefined)
    
    @scala.inline
    def setTaskArn(value: String): Self = this.set("taskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskArn: Self = this.set("taskArn", js.undefined)
  }
}
