package typings
package chromeDashTraceDashEventLib.chromeDashTraceDashEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields
  extends /* filedName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var args: js.UndefOr[js.Any] = js.undefined
  var cat: js.UndefOr[js.Any] = js.undefined
}

object Fields {
  @scala.inline
  def apply(
    StringDictionary: /* filedName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    args: js.Any = null,
    cat: js.Any = null
  ): Fields = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (args != null) __obj.updateDynamic("args")(args)
    if (cat != null) __obj.updateDynamic("cat")(cat)
    __obj.asInstanceOf[Fields]
  }
}

