package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDevicePoolResult extends js.Object {
  /**
    * An object that contains information about the requested device pool.
    */
  var devicePool: js.UndefOr[DevicePool] = js.native
}

object GetDevicePoolResult {
  @scala.inline
  def apply(devicePool: DevicePool = null): GetDevicePoolResult = {
    val __obj = js.Dynamic.literal()
    if (devicePool != null) __obj.updateDynamic("devicePool")(devicePool.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDevicePoolResult]
  }
}

