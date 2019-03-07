package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowElementsContainer extends BaseElement {
  var flowElements: js.Array[FlowElement]
  var laneSets: js.Array[LaneSet]
}

object FlowElementsContainer {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    flowElements: js.Array[FlowElement],
    id: java.lang.String,
    laneSets: js.Array[LaneSet],
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): FlowElementsContainer = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, flowElements = flowElements, id = id, laneSets = laneSets)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[FlowElementsContainer]
  }
}

