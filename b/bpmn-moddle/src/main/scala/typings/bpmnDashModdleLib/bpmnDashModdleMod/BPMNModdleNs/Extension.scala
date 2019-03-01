package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extension extends TypeDerived {
  var definition: ExtensionDefinition
  /**
    * @default false
    */
  var mustUnderstand: scala.Boolean
}

object Extension {
  @scala.inline
  def apply($type: ElementType, definition: ExtensionDefinition, mustUnderstand: scala.Boolean): Extension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$type")($type)
    __obj.updateDynamic("definition")(definition)
    __obj.updateDynamic("mustUnderstand")(mustUnderstand)
    __obj.asInstanceOf[Extension]
  }
}

