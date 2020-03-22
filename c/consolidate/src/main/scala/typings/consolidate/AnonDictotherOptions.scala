package typings.consolidate

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictotherOptions
  extends /* otherOptions */ StringDictionary[js.Any] {
  var cache: js.UndefOr[Boolean] = js.undefined
}

object AnonDictotherOptions {
  @scala.inline
  def apply(
    StringDictionary: /* otherOptions */ StringDictionary[js.Any] = null,
    cache: js.UndefOr[Boolean] = js.undefined
  ): AnonDictotherOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictotherOptions]
  }
}

