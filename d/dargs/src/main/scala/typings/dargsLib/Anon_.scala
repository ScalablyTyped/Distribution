package typings
package dargsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_
  extends /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Boolean | scala.Double | js.Array[java.lang.String]] {
  var `--`: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var `_`: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_ {
  @scala.inline
  def apply(
    `--`: js.Array[java.lang.String] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Boolean | scala.Double | js.Array[java.lang.String]] = null,
    `_`: js.Array[java.lang.String] = null
  ): Anon_ = {
    val __obj = js.Dynamic.literal()
    if (`--` != null) __obj.updateDynamic("--")(`--`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`_` != null) __obj.updateDynamic("_")(`_`)
    __obj.asInstanceOf[Anon_]
  }
}

