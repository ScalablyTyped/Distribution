package typings
package atBlueprintjsDatetimeLib.libEsmDateInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateInputState extends js.Object {
  var isInputFocused: scala.Boolean
  var isOpen: scala.Boolean
  var value: stdLib.Date
  var valueString: java.lang.String
}

object IDateInputState {
  @scala.inline
  def apply(
    isInputFocused: scala.Boolean,
    isOpen: scala.Boolean,
    value: stdLib.Date,
    valueString: java.lang.String
  ): IDateInputState = {
    val __obj = js.Dynamic.literal(isInputFocused = isInputFocused, isOpen = isOpen, value = value, valueString = valueString)
  
    __obj.asInstanceOf[IDateInputState]
  }
}

