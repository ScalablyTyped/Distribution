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
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, isReference = isReference, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ExtensionAttributeDefinition]
  }
}

