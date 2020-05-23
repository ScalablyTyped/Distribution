package typings.color.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey extends /* key */ StringDictionary[Double] {
  var alpha: js.UndefOr[Double] = js.undefined
}

object Dictkey {
  @scala.inline
  def apply(
    StringDictionary: /* index */ StringDictionary[Double] = null,
    alpha: js.UndefOr[Double] = js.undefined
  ): Dictkey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
}

