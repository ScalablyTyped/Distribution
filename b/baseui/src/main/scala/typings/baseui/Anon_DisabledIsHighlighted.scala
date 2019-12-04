package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledIsHighlighted extends js.Object {
  @JSName("$disabled")
  var $disabled: Boolean
  @JSName("$isHighlighted")
  var $isHighlighted: Boolean
  @JSName("$selected")
  var $selected: Boolean
}

object Anon_DisabledIsHighlighted {
  @scala.inline
  def apply($disabled: Boolean, $isHighlighted: Boolean, $selected: Boolean): Anon_DisabledIsHighlighted = {
    val __obj = js.Dynamic.literal($disabled = $disabled.asInstanceOf[js.Any], $isHighlighted = $isHighlighted.asInstanceOf[js.Any], $selected = $selected.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DisabledIsHighlighted]
  }
}

