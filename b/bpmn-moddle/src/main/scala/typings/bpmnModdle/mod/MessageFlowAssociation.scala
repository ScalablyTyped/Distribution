package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageFlowAssociation extends BaseElement {
  var innerMessageFlowRef: MessageFlow
  var outerMessageFlowRef: MessageFlow
}

object MessageFlowAssociation {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    innerMessageFlowRef: MessageFlow,
    outerMessageFlowRef: MessageFlow,
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): MessageFlowAssociation = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], innerMessageFlowRef = innerMessageFlowRef.asInstanceOf[js.Any], outerMessageFlowRef = outerMessageFlowRef.asInstanceOf[js.Any])
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions.asInstanceOf[js.Any])
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageFlowAssociation]
  }
}

