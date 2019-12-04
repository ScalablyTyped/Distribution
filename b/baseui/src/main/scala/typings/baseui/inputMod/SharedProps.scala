package typings.baseui.inputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedProps extends js.Object {
  /** Defines styles for inputs that are grouped with other controls. */
  @JSName("$adjoined")
  var $adjoined: String
  /** Renders UI in 'disabled' state */
  @JSName("$disabled")
  var $disabled: Boolean
  /** Renders UI in 'error' state */
  @JSName("$error")
  var $error: Boolean
  /** Renders UI in 'focus' state */
  @JSName("$isFocused")
  var $isFocused: Boolean
  @JSName("$position")
  var $position: String
  /** Renders UI in 'positive' state */
  @JSName("$positive")
  var $positive: Boolean
  /** Renders UI in 'required' state */
  @JSName("$required")
  var $required: Boolean
  /** Renders UI in provided size. */
  @JSName("$size")
  var $size: String
}

object SharedProps {
  @scala.inline
  def apply(
    $adjoined: String,
    $disabled: Boolean,
    $error: Boolean,
    $isFocused: Boolean,
    $position: String,
    $positive: Boolean,
    $required: Boolean,
    $size: String
  ): SharedProps = {
    val __obj = js.Dynamic.literal($adjoined = $adjoined.asInstanceOf[js.Any], $disabled = $disabled.asInstanceOf[js.Any], $error = $error.asInstanceOf[js.Any], $isFocused = $isFocused.asInstanceOf[js.Any], $position = $position.asInstanceOf[js.Any], $positive = $positive.asInstanceOf[js.Any], $required = $required.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SharedProps]
  }
}

