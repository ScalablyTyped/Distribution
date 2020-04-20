package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsHighlighted extends js.Object {
  @JSName("$disabled")
  var $disabled: Boolean
  @JSName("$isHighlighted")
  var $isHighlighted: Boolean
  @JSName("$selected")
  var $selected: Boolean
}

object AnonIsHighlighted {
  @scala.inline
  def apply($disabled: Boolean, $isHighlighted: Boolean, $selected: Boolean): AnonIsHighlighted = {
    val __obj = js.Dynamic.literal($disabled = $disabled.asInstanceOf[js.Any], $isHighlighted = $isHighlighted.asInstanceOf[js.Any], $selected = $selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsHighlighted]
  }
}

