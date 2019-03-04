package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #region iBeacon
trait StartBeaconDiscoveryOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_StartBeaconDiscoveryOptions: js.UndefOr[js.Function1[/* res */ ErrMsgResponse, scala.Unit]] = js.undefined
  /**
  		 * iBeacon设备广播的 uuids
  		 */
  var uuids: java.lang.String | js.Array[java.lang.String]
}

object StartBeaconDiscoveryOptions {
  @scala.inline
  def apply(
    uuids: java.lang.String | js.Array[java.lang.String],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[/* res */ ErrMsgResponse, scala.Unit] = null
  ): StartBeaconDiscoveryOptions = {
    val __obj = js.Dynamic.literal(uuids = uuids.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[StartBeaconDiscoveryOptions]
  }
}

