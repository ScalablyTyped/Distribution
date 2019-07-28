package typings.bpmnDashModdle.bpmnDashModdleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionDefinition extends TypeDerived {
  var extensionAttributeDefinitions: js.Array[ExtensionAttributeDefinition]
  var name: String
}

object ExtensionDefinition {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    extensionAttributeDefinitions: js.Array[ExtensionAttributeDefinition],
    name: String
  ): ExtensionDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, extensionAttributeDefinitions = extensionAttributeDefinitions, name = name)
  
    __obj.asInstanceOf[ExtensionDefinition]
  }
}

