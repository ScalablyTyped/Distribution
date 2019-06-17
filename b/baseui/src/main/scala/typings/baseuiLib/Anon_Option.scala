package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Option extends js.Object {
  var option: js.UndefOr[baseuiLib.selectMod.Option] = js.undefined
  var optionState: Anon_Disabled
}

object Anon_Option {
  @scala.inline
  def apply(optionState: Anon_Disabled, option: baseuiLib.selectMod.Option = null): Anon_Option = {
    val __obj = js.Dynamic.literal(optionState = optionState)
    if (option != null) __obj.updateDynamic("option")(option)
    __obj.asInstanceOf[Anon_Option]
  }
}

