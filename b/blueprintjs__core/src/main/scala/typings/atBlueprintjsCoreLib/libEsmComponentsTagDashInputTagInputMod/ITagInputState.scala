package typings
package atBlueprintjsCoreLib.libEsmComponentsTagDashInputTagInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITagInputState extends js.Object {
  var activeIndex: scala.Double
  var inputValue: java.lang.String
  var isInputFocused: scala.Boolean
}

object ITagInputState {
  @scala.inline
  def apply(activeIndex: scala.Double, inputValue: java.lang.String, isInputFocused: scala.Boolean): ITagInputState = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex, inputValue = inputValue, isInputFocused = isInputFocused)
  
    __obj.asInstanceOf[ITagInputState]
  }
}

