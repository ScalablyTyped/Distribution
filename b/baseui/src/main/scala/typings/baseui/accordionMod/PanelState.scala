package typings.baseui.accordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelState extends js.Object {
  var expanded: Boolean
}

object PanelState {
  @scala.inline
  def apply(expanded: Boolean): PanelState = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelState]
  }
}

