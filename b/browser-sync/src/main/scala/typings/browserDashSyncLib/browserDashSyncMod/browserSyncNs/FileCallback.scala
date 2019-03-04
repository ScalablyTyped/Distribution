package typings
package browserDashSyncLib.browserDashSyncMod.browserSyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileCallback extends js.Object {
  var `match`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var options: js.UndefOr[chokidarLib.chokidarMod.WatchOptions] = js.undefined
  def fn(event: java.lang.String, file: java.lang.String): js.Any
}

object FileCallback {
  @scala.inline
  def apply(
    fn: js.Function2[java.lang.String, java.lang.String, js.Any],
    `match`: java.lang.String | js.Array[java.lang.String] = null,
    options: chokidarLib.chokidarMod.WatchOptions = null
  ): FileCallback = {
    val __obj = js.Dynamic.literal(fn = fn)
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[FileCallback]
  }
}

