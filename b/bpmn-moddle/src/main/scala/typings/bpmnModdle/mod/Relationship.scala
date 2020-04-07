package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relationship extends BaseElement {
  var direction: RelationshipDirection
  var source: js.Array[BaseElement]
  var target: js.Array[BaseElement]
  var `type`: String
}

object Relationship {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    direction: RelationshipDirection,
    id: String,
    source: js.Array[BaseElement],
    target: js.Array[BaseElement],
    `type`: String,
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): Relationship = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions.asInstanceOf[js.Any])
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relationship]
  }
}

