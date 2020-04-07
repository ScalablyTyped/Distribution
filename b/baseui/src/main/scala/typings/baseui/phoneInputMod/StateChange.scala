package typings.baseui.phoneInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/phone-input.STATE_CHANGE_TYPE[keyof baseui.baseui/phone-input.STATE_CHANGE_TYPE] */
/* Rewritten from type alias, can be one of: 
  - typings.baseui.baseuiStrings.textChange
  - typings.baseui.baseuiStrings.countryChange
*/
trait StateChange extends js.Object

object StateChange {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def countryChange: typings.baseui.baseuiStrings.countryChange = this.cast("countryChange")
  @scala.inline
  def textChange: typings.baseui.baseuiStrings.textChange = this.cast("textChange")
}

