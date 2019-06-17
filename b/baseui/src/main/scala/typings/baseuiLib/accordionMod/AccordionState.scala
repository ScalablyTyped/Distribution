package typings
package baseuiLib.accordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionState extends js.Object {
  var expanded: js.Array[reactLib.reactMod.Key]
}

object AccordionState {
  @scala.inline
  def apply(expanded: js.Array[reactLib.reactMod.Key]): AccordionState = {
    val __obj = js.Dynamic.literal(expanded = expanded)
  
    __obj.asInstanceOf[AccordionState]
  }
}

