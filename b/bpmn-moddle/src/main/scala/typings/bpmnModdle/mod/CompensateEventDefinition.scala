package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompensateEventDefinition extends BaseElement {
  var activityRef: Activity
  var waitForCompletion: Boolean
}

object CompensateEventDefinition {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    activityRef: Activity,
    id: String,
    waitForCompletion: Boolean,
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): CompensateEventDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], activityRef = activityRef.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], waitForCompletion = waitForCompletion.asInstanceOf[js.Any])
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions.asInstanceOf[js.Any])
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompensateEventDefinition]
  }
}

