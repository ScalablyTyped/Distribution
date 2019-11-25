package typings.bpmnDashModdle.bpmnDashModdleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CorrelationSubscription extends BaseElement {
  var correlationKeyRef: CorrelationKey
  var correlationPropertyBinding: js.Array[CorrelationKey]
}

object CorrelationSubscription {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    correlationKeyRef: CorrelationKey,
    correlationPropertyBinding: js.Array[CorrelationKey],
    id: String,
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): CorrelationSubscription = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], correlationKeyRef = correlationKeyRef.asInstanceOf[js.Any], correlationPropertyBinding = correlationPropertyBinding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions.asInstanceOf[js.Any])
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorrelationSubscription]
  }
}

