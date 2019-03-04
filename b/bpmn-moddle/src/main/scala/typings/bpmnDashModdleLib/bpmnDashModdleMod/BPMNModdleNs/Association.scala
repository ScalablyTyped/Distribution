package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

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
    $type: ElementType,
    associationDirection: AssociationDirection,
    id: java.lang.String,
    sourceRef: BaseElement,
    targetRef: BaseElement,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): Association = {
    val __obj = js.Dynamic.literal($type = $type, associationDirection = associationDirection, id = id, sourceRef = sourceRef, targetRef = targetRef)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[Association]
  }
}

