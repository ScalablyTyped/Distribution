package typings.atBlueprintjsDatetime.libEsmDateInputMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateInputState extends js.Object {
  var isInputFocused: Boolean
  var isOpen: Boolean
  var value: Date
  var valueString: String
}

object IDateInputState {
  @scala.inline
  def apply(isInputFocused: Boolean, isOpen: Boolean, value: Date, valueString: String): IDateInputState = {
    val __obj = js.Dynamic.literal(isInputFocused = isInputFocused, isOpen = isOpen, value = value, valueString = valueString)
  
    __obj.asInstanceOf[IDateInputState]
  }
}

