package typings.chromeTraceEvent.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields
  extends /* otherData */ StringDictionary[js.Any] {
  var args: js.UndefOr[js.Any] = js.undefined
  var cat: js.UndefOr[js.Any] = js.undefined
}

object Fields {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    args: js.Any = null,
    cat: js.Any = null
  ): Fields = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (cat != null) __obj.updateDynamic("cat")(cat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
}

