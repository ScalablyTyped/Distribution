package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinuxParameters extends js.Object {
  /**
    * The Linux capabilities for the container that are added to or dropped from the default configuration provided by Docker.  If you are using tasks that use the Fargate launch type, capabilities is supported but the add parameter is not supported. 
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
  def apply(
    capabilities: KernelCapabilities = null,
    devices: DevicesList = null,
    initProcessEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    maxSwap: Int | scala.Double = null,
    sharedMemorySize: Int | scala.Double = null,
    swappiness: Int | scala.Double = null,
    tmpfs: TmpfsList = null
  ): LinuxParameters = {
    val __obj = js.Dynamic.literal()
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (devices != null) __obj.updateDynamic("devices")(devices.asInstanceOf[js.Any])
    if (!js.isUndefined(initProcessEnabled)) __obj.updateDynamic("initProcessEnabled")(initProcessEnabled.asInstanceOf[js.Any])
    if (maxSwap != null) __obj.updateDynamic("maxSwap")(maxSwap.asInstanceOf[js.Any])
    if (sharedMemorySize != null) __obj.updateDynamic("sharedMemorySize")(sharedMemorySize.asInstanceOf[js.Any])
    if (swappiness != null) __obj.updateDynamic("swappiness")(swappiness.asInstanceOf[js.Any])
    if (tmpfs != null) __obj.updateDynamic("tmpfs")(tmpfs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinuxParameters]
  }
}

