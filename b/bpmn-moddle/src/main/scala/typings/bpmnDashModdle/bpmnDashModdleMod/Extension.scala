package typings.bpmnDashModdle.bpmnDashModdleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extension extends TypeDerived {
  var definition: ExtensionDefinition
  /**
    * @default false
    */
  var mustUnderstand: Boolean
}

object Extension {
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, definition: ExtensionDefinition, mustUnderstand: Boolean): Extension = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, definition = definition, mustUnderstand = mustUnderstand)
  
    __obj.asInstanceOf[Extension]
  }
}

