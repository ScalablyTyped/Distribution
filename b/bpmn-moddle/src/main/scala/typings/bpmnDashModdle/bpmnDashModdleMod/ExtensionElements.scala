package typings.bpmnDashModdle.bpmnDashModdleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionElements
  extends TypeDerived
     with /* key */ StringDictionary[js.Any] {
  var extensionAttributeDefinition: ExtensionAttributeDefinition
  var valueRef: BaseElement
  var values: js.Array[BaseElement]
}

object ExtensionElements {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    extensionAttributeDefinition: ExtensionAttributeDefinition,
    valueRef: BaseElement,
    values: js.Array[BaseElement],
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): ExtensionElements = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], extensionAttributeDefinition = extensionAttributeDefinition.asInstanceOf[js.Any], valueRef = valueRef.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ExtensionElements]
  }
}

