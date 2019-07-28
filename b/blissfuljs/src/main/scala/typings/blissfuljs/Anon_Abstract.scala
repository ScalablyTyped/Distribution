package typings.blissfuljs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Abstract
  extends /* propertyName */ StringDictionary[js.Any] {
  var `abstract`: js.UndefOr[Boolean] = js.undefined
  var constructor: js.UndefOr[js.Function] = js.undefined
  var `extends`: js.UndefOr[js.Function] = js.undefined
  var `lazy`: js.UndefOr[js.Object] = js.undefined
  var live: js.UndefOr[js.Object] = js.undefined
  var static: js.UndefOr[js.Object] = js.undefined
}

object Anon_Abstract {
  @scala.inline
  def apply(
    StringDictionary: /* propertyName */ StringDictionary[js.Any] = null,
    `abstract`: js.UndefOr[Boolean] = js.undefined,
    constructor: js.Function = null,
    `extends`: js.Function = null,
    `lazy`: js.Object = null,
    live: js.Object = null,
    static: js.Object = null
  ): Anon_Abstract = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(`abstract`)) __obj.updateDynamic("abstract")(`abstract`)
    if (constructor != null) __obj.updateDynamic("constructor")(constructor)
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`)
    if (`lazy` != null) __obj.updateDynamic("lazy")(`lazy`)
    if (live != null) __obj.updateDynamic("live")(live)
    if (static != null) __obj.updateDynamic("static")(static)
    __obj.asInstanceOf[Anon_Abstract]
  }
}

