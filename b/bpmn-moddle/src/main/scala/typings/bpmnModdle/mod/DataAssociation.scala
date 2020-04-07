package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataAssociation extends BaseElement {
  var assignment: Assignment
  var sourceRef: ItemAwareElement
  var targetRef: ItemAwareElement
  var transformation: FormalExpression
}

object DataAssociation {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    assignment: Assignment,
    id: String,
    sourceRef: ItemAwareElement,
    targetRef: ItemAwareElement,
    transformation: FormalExpression,
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): DataAssociation = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], assignment = assignment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], sourceRef = sourceRef.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any], transformation = transformation.asInstanceOf[js.Any])
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions.asInstanceOf[js.Any])
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataAssociation]
  }
}

