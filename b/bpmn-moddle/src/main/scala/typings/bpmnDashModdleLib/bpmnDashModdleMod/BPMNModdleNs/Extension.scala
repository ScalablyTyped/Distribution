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
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    definition: ExtensionDefinition,
    mustUnderstand: scala.Boolean
  ): Extension = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, definition = definition, mustUnderstand = mustUnderstand)
  
    __obj.asInstanceOf[Extension]
  }
}

