package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceRole extends BaseElement {
  var ResourceParameterBindings: js.Array[ResourceParameterBinding]
  var name: java.lang.String
  var resourceAssignmentExpression: ResourceAssignmentExpression
  var resourceRef: Resource
}

object ResourceRole {
  @scala.inline
  def apply(
    $type: ElementType,
    ResourceParameterBindings: js.Array[ResourceParameterBinding],
    id: java.lang.String,
    name: java.lang.String,
    resourceAssignmentExpression: ResourceAssignmentExpression,
    resourceRef: Resource,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): ResourceRole = {
    val __obj = js.Dynamic.literal($type = $type, ResourceParameterBindings = ResourceParameterBindings, id = id, name = name, resourceAssignmentExpression = resourceAssignmentExpression, resourceRef = resourceRef)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[ResourceRole]
  }
}

