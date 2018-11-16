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

