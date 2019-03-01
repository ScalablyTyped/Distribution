package typings
package consolidateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cache
  extends /* otherOptions */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var cache: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Cache {
  @scala.inline
  def apply(
    StringDictionary: /* otherOptions */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    cache: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Cache = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    __obj.asInstanceOf[Anon_Cache]
  }
}

