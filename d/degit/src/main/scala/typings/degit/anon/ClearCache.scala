package typings.degit.anon

import typings.degit.degitBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearCache extends js.Object {
  var clearCache: js.UndefOr[`true`] = js.undefined
}

object ClearCache {
  @scala.inline
  def apply(clearCache: `true` = null): ClearCache = {
    val __obj = js.Dynamic.literal()
    if (clearCache != null) __obj.updateDynamic("clearCache")(clearCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearCache]
  }
}

