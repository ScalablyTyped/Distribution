package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lane extends BaseElement {
  var childLaneSet: LaneSet
  var flowNodeRef: js.Array[FlowNode]
  var name: String
  var partitionElement: BaseElement
  var partitionElementRef: BaseElement
}

object Lane {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    childLaneSet: LaneSet,
    flowNodeRef: js.Array[FlowNode],
    id: String,
    name: String,
    partitionElement: BaseElement,
    partitionElementRef: BaseElement,
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): Lane = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], childLaneSet = childLaneSet.asInstanceOf[js.Any], flowNodeRef = flowNodeRef.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partitionElement = partitionElement.asInstanceOf[js.Any], partitionElementRef = partitionElementRef.asInstanceOf[js.Any])
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions.asInstanceOf[js.Any])
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lane]
  }
}

