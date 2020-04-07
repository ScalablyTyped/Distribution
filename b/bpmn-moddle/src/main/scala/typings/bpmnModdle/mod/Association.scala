package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Association extends BaseElement {
  var associationDirection: AssociationDirection
  var sourceRef: BaseElement
  var targetRef: BaseElement
}

object Association {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    associationDirection: AssociationDirection,
    id: String,
    sourceRef: BaseElement,
    targetRef: BaseElement,
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): Association = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], associationDirection = associationDirection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], sourceRef = sourceRef.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions.asInstanceOf[js.Any])
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Association]
  }
}

