package typings.browserSync.mod

import typings.chokidar.mod.WatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileCallback extends js.Object {
  var `match`: js.UndefOr[String | js.Array[String]] = js.undefined
  var options: js.UndefOr[WatchOptions] = js.undefined
  def fn(event: String, file: String): js.Any
}

object FileCallback {
  @scala.inline
  def apply(
    fn: (String, String) => js.Any,
    `match`: String | js.Array[String] = null,
    options: WatchOptions = null
  ): FileCallback = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction2(fn))
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileCallback]
  }
}

