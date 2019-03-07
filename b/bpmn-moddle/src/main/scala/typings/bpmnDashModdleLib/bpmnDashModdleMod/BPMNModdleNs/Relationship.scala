package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relationship extends BaseElement {
  var direction: RelationshipDirection
  var source: js.Array[BaseElement]
  var target: js.Array[BaseElement]
  var `type`: java.lang.String
}

object Relationship {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    direction: RelationshipDirection,
    id: java.lang.String,
    source: js.Array[BaseElement],
    target: js.Array[BaseElement],
    `type`: java.lang.String,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): Relationship = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, direction = direction, id = id, source = source, target = target)
    __obj.updateDynamic("type")(`type`)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[Relationship]
  }
}

