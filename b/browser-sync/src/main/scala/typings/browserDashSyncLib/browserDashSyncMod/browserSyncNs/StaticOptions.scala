package typings
package browserDashSyncLib.browserDashSyncMod.browserSyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticOptions extends js.Object {
  var dir: java.lang.String | js.Array[java.lang.String]
  var route: java.lang.String | js.Array[java.lang.String]
}

object StaticOptions {
  @scala.inline
  def apply(
    dir: java.lang.String | js.Array[java.lang.String],
    route: java.lang.String | js.Array[java.lang.String]
  ): StaticOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    __obj.updateDynamic("route")(route.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticOptions]
  }
}

