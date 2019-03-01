package typings
package crossDashStorageLib.crossDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrossStorageClientOptions extends js.Object {
  var frameId: js.UndefOr[java.lang.String] = js.undefined
  var promise: js.UndefOr[js.Any] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object CrossStorageClientOptions {
  @scala.inline
  def apply(frameId: java.lang.String = null, promise: js.Any = null, timeout: scala.Int | scala.Double = null): CrossStorageClientOptions = {
    val __obj = js.Dynamic.literal()
    if (frameId != null) __obj.updateDynamic("frameId")(frameId)
    if (promise != null) __obj.updateDynamic("promise")(promise)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossStorageClientOptions]
  }
}

