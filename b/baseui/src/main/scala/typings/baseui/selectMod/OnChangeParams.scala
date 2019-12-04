package typings.baseui.selectMod

import typings.baseui.baseuiStrings.clear
import typings.baseui.baseuiStrings.remove
import typings.baseui.baseuiStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnChangeParams extends js.Object {
  var option: js.UndefOr[Option] = js.undefined
  var `type`: js.UndefOr[select | remove | clear] = js.undefined
  var value: Value
}

object OnChangeParams {
  @scala.inline
  def apply(value: Value, option: Option = null, `type`: select | remove | clear = null): OnChangeParams = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (option != null) __obj.updateDynamic("option")(option.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChangeParams]
  }
}

