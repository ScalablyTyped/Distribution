package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformDevice extends js.Object {
  /**
    * The ID for the GPU(s) on the container instance. The available GPU IDs can also be obtained on the container instance in the /var/lib/ecs/gpu/nvidia_gpu_info.json file.
    */
  var id: String = js.native
  /**
    * The type of device that is available on the container instance. The only supported value is GPU.
    */
  var `type`: PlatformDeviceType = js.native
}

object PlatformDevice {
  @scala.inline
  def apply(id: String, `type`: PlatformDeviceType): PlatformDevice = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformDevice]
  }
}

