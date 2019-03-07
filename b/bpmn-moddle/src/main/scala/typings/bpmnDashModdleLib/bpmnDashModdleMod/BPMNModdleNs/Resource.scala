package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends BaseElement {
  var name: java.lang.String
  var resourceParameters: js.Array[ResourceParameter]
}

object Resource {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: java.lang.String,
    name: java.lang.String,
    resourceParameters: js.Array[ResourceParameter],
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): Resource = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, id = id, name = name, resourceParameters = resourceParameters)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[Resource]
  }
}

