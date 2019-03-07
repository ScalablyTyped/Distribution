package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

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
    id: java.lang.String,
    innerMessageFlowRef: MessageFlow,
    outerMessageFlowRef: MessageFlow,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): MessageFlowAssociation = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, id = id, innerMessageFlowRef = innerMessageFlowRef, outerMessageFlowRef = outerMessageFlowRef)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[MessageFlowAssociation]
  }
}

