package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDevicePoolResult extends js.Object {
  /**
    * The newly created device pool.
    */
  var devicePool: js.UndefOr[DevicePool] = js.native
}

object CreateDevicePoolResult {
  @scala.inline
  def apply(devicePool: DevicePool = null): CreateDevicePoolResult = {
    val __obj = js.Dynamic.literal()
    if (devicePool != null) __obj.updateDynamic("devicePool")(devicePool.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDevicePoolResult]
  }
}

