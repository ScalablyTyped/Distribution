package typings.bpmnModdle.mod

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
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], mustUnderstand = mustUnderstand.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Extension]
  }
}

