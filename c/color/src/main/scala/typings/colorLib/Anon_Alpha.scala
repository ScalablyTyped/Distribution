package typings
package colorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alpha
  extends /* key */ org.scalablytyped.runtime.StringDictionary[scala.Double] {
  var alpha: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Alpha {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[scala.Double] = null,
    alpha: scala.Int | scala.Double = null
  ): Anon_Alpha = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Alpha]
  }
}

