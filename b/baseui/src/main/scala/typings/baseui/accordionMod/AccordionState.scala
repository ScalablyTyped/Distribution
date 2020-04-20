package typings.baseui.accordionMod

import typings.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionState extends js.Object {
  var expanded: js.Array[Key]
}

object AccordionState {
  @scala.inline
  def apply(expanded: js.Array[Key]): AccordionState = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionState]
  }
}

