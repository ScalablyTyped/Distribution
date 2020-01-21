package typings.color

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlpha extends /* key */ StringDictionary[Double] {
  var alpha: js.UndefOr[Double] = js.undefined
}

object AnonAlpha {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[Double] = null, alpha: Int | Double = null): AnonAlpha = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlpha]
  }
}

