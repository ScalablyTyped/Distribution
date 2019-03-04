package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lane extends BaseElement {
  var childLaneSet: LaneSet
  var flowNodeRef: js.Array[FlowNode]
  var name: java.lang.String
  var partitionElement: BaseElement
  var partitionElementRef: BaseElement
}

object Lane {
  @scala.inline
  def apply(
    $type: ElementType,
    childLaneSet: LaneSet,
    flowNodeRef: js.Array[FlowNode],
    id: java.lang.String,
    name: java.lang.String,
    partitionElement: BaseElement,
    partitionElementRef: BaseElement,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): Lane = {
    val __obj = js.Dynamic.literal($type = $type, childLaneSet = childLaneSet, flowNodeRef = flowNodeRef, id = id, name = name, partitionElement = partitionElement, partitionElementRef = partitionElementRef)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[Lane]
  }
}

