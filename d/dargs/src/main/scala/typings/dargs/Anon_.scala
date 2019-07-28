package typings.dargs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_
  extends /* key */ StringDictionary[String | Boolean | Double | js.Array[String]] {
  var `--`: js.UndefOr[js.Array[String]] = js.undefined
  var `_`: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_ {
  @scala.inline
  def apply(
    `--`: js.Array[String] = null,
    StringDictionary: /* key */ StringDictionary[String | Boolean | Double | js.Array[String]] = null,
    `_`: js.Array[String] = null
  ): Anon_ = {
    val __obj = js.Dynamic.literal()
    if (`--` != null) __obj.updateDynamic("--")(`--`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`_` != null) __obj.updateDynamic("_")(`_`)
    __obj.asInstanceOf[Anon_]
  }
}

