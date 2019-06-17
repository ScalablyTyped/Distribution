package typings
package baseuiLib.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnChangeParams extends js.Object {
  var option: js.UndefOr[Option] = js.undefined
  var `type`: js.UndefOr[
    baseuiLib.baseuiLibStrings.select | baseuiLib.baseuiLibStrings.remove | baseuiLib.baseuiLibStrings.clear
  ] = js.undefined
  var value: js.UndefOr[Value] = js.undefined
}

object OnChangeParams {
  @scala.inline
  def apply(
    option: Option = null,
    `type`: baseuiLib.baseuiLibStrings.select | baseuiLib.baseuiLibStrings.remove | baseuiLib.baseuiLibStrings.clear = null,
    value: Value = null
  ): OnChangeParams = {
    val __obj = js.Dynamic.literal()
    if (option != null) __obj.updateDynamic("option")(option)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[OnChangeParams]
  }
}

