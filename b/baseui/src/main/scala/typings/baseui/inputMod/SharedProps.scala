package typings.baseui.inputMod

import typings.baseui.baseuiStrings.both
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.end
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.mini
import typings.baseui.baseuiStrings.none
import typings.baseui.baseuiStrings.right
import typings.baseui.baseuiStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedProps extends js.Object {
  /** Defines styles for inputs that are grouped with other controls. */
  @JSName("$adjoined")
  var $adjoined: none | left | right | both
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
  var $position: start | end
  /** Renders UI in 'positive' state */
  @JSName("$positive")
  var $positive: Boolean
  /** Renders UI in 'required' state */
  @JSName("$required")
  var $required: Boolean
  /** Renders UI in provided size. */
  @JSName("$size")
  var $size: mini | default_ | compact | large_
}

object SharedProps {
  @scala.inline
  def apply(
    $adjoined: none | left | right | both,
    $disabled: Boolean,
    $error: Boolean,
    $isFocused: Boolean,
    $position: start | end,
    $positive: Boolean,
    $required: Boolean,
    $size: mini | default_ | compact | large_
  ): SharedProps = {
    val __obj = js.Dynamic.literal($adjoined = $adjoined.asInstanceOf[js.Any], $disabled = $disabled.asInstanceOf[js.Any], $error = $error.asInstanceOf[js.Any], $isFocused = $isFocused.asInstanceOf[js.Any], $position = $position.asInstanceOf[js.Any], $positive = $positive.asInstanceOf[js.Any], $required = $required.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedProps]
  }
}

