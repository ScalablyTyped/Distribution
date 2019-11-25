package typings.bpmnDashModdle.bpmnDashModdleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionAttributeDefinition extends TypeDerived {
  /**
    * @default false
    */
  var isReference: Boolean
  var name: String
  var `type`: String
}

object ExtensionAttributeDefinition {
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, isReference: Boolean, name: String, `type`: String): ExtensionAttributeDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], isReference = isReference.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionAttributeDefinition]
  }
}

