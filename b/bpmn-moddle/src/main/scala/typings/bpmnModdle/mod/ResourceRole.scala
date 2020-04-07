package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceRole extends BaseElement {
  var ResourceParameterBindings: js.Array[ResourceParameterBinding]
  var name: String
  var resourceAssignmentExpression: ResourceAssignmentExpression
  var resourceRef: Resource
}

object ResourceRole {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    ResourceParameterBindings: js.Array[ResourceParameterBinding],
    id: String,
    name: String,
    resourceAssignmentExpression: ResourceAssignmentExpression,
    resourceRef: Resource,
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): ResourceRole = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], ResourceParameterBindings = ResourceParameterBindings.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceAssignmentExpression = resourceAssignmentExpression.asInstanceOf[js.Any], resourceRef = resourceRef.asInstanceOf[js.Any])
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions.asInstanceOf[js.Any])
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRole]
  }
}

