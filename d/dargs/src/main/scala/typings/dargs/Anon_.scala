package typings.dargs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_
  extends /* key */ StringDictionary[String | Boolean | Double | js.Array[String]] {
  var `--`: js.UndefOr[js.Array[String]] = js.undefined
  @JSName("_")
  var _underscore: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_ {
  @scala.inline
  def apply(
    `--`: js.Array[String] = null,
    StringDictionary: /* key */ StringDictionary[String | Boolean | Double | js.Array[String]] = null,
    _underscore: js.Array[String] = null
  ): Anon_ = {
    val __obj = js.Dynamic.literal()
    if (`--` != null) __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_underscore != null) __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_]
  }
}

