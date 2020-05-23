package typings.consolidate.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictotherOptions
  extends /* otherOptions */ StringDictionary[js.Any] {
  var cache: js.UndefOr[Boolean] = js.undefined
}

object DictotherOptions {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    cache: js.UndefOr[Boolean] = js.undefined
  ): DictotherOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictotherOptions]
  }
}

