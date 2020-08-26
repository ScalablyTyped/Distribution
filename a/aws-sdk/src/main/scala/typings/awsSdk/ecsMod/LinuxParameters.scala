package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinuxParameters extends js.Object {
  /**
    * The Linux capabilities for the container that are added to or dropped from the default configuration provided by Docker.  For tasks that use the Fargate launch type, capabilities is supported for all platform versions but the add parameter is only supported if using platform version 1.4.0 or later. 
    */
  var capabilities: js.UndefOr[KernelCapabilities] = js.native
  /**
    * Any host devices to expose to the container. This parameter maps to Devices in the Create a container section of the Docker Remote API and the --device option to docker run.  If you are using tasks that use the Fargate launch type, the devices parameter is not supported. 
    */
  var devices: js.UndefOr[DevicesList] = js.native
  /**
    * Run an init process inside the container that forwards signals and reaps processes. This parameter maps to the --init option to docker run. This parameter requires version 1.25 of the Docker Remote API or greater on your container instance. To check the Docker Remote API version on your container instance, log in to your container instance and run the following command: sudo docker version --format '{{.Server.APIVersion}}' 
    */
  var initProcessEnabled: js.UndefOr[BoxedBoolean] = js.native
  /**
    * The total amount of swap memory (in MiB) a container can use. This parameter will be translated to the --memory-swap option to docker run where the value would be the sum of the container memory plus the maxSwap value. If a maxSwap value of 0 is specified, the container will not use swap. Accepted values are 0 or any positive integer. If the maxSwap parameter is omitted, the container will use the swap configuration for the container instance it is running on. A maxSwap value must be set for the swappiness parameter to be used.  If you are using tasks that use the Fargate launch type, the maxSwap parameter is not supported. 
    */
  var maxSwap: js.UndefOr[BoxedInteger] = js.native
  /**
    * The value for the size (in MiB) of the /dev/shm volume. This parameter maps to the --shm-size option to docker run.  If you are using tasks that use the Fargate launch type, the sharedMemorySize parameter is not supported. 
    */
  var sharedMemorySize: js.UndefOr[BoxedInteger] = js.native
  /**
    * This allows you to tune a container's memory swappiness behavior. A swappiness value of 0 will cause swapping to not happen unless absolutely necessary. A swappiness value of 100 will cause pages to be swapped very aggressively. Accepted values are whole numbers between 0 and 100. If the swappiness parameter is not specified, a default value of 60 is used. If a value is not specified for maxSwap then this parameter is ignored. This parameter maps to the --memory-swappiness option to docker run.  If you are using tasks that use the Fargate launch type, the swappiness parameter is not supported. 
    */
  var swappiness: js.UndefOr[BoxedInteger] = js.native
  /**
    * The container path, mount options, and size (in MiB) of the tmpfs mount. This parameter maps to the --tmpfs option to docker run.  If you are using tasks that use the Fargate launch type, the tmpfs parameter is not supported. 
    */
  var tmpfs: js.UndefOr[TmpfsList] = js.native
}

object LinuxParameters {
  @scala.inline
  def apply(): LinuxParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinuxParameters]
  }
  @scala.inline
  implicit class LinuxParametersOps[Self <: LinuxParameters] (val x: Self) extends AnyVal {
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
    def setCapabilities(value: KernelCapabilities): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapabilities: Self = this.set("capabilities", js.undefined)
    @scala.inline
    def setDevicesVarargs(value: Device*): Self = this.set("devices", js.Array(value :_*))
    @scala.inline
    def setDevices(value: DevicesList): Self = this.set("devices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevices: Self = this.set("devices", js.undefined)
    @scala.inline
    def setInitProcessEnabled(value: BoxedBoolean): Self = this.set("initProcessEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitProcessEnabled: Self = this.set("initProcessEnabled", js.undefined)
    @scala.inline
    def setMaxSwap(value: BoxedInteger): Self = this.set("maxSwap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSwap: Self = this.set("maxSwap", js.undefined)
    @scala.inline
    def setSharedMemorySize(value: BoxedInteger): Self = this.set("sharedMemorySize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedMemorySize: Self = this.set("sharedMemorySize", js.undefined)
    @scala.inline
    def setSwappiness(value: BoxedInteger): Self = this.set("swappiness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwappiness: Self = this.set("swappiness", js.undefined)
    @scala.inline
    def setTmpfsVarargs(value: Tmpfs*): Self = this.set("tmpfs", js.Array(value :_*))
    @scala.inline
    def setTmpfs(value: TmpfsList): Self = this.set("tmpfs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTmpfs: Self = this.set("tmpfs", js.undefined)
  }
  
}

