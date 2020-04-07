package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardLoopCharacteristics extends BaseElement {
  var loopCondition: Expression
  var loopMaximum: Expression
  var testBefore: Boolean
}

object StandardLoopCharacteristics {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    loopCondition: Expression,
    loopMaximum: Expression,
    testBefore: Boolean,
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): StandardLoopCharacteristics = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loopCondition = loopCondition.asInstanceOf[js.Any], loopMaximum = loopMaximum.asInstanceOf[js.Any], testBefore = testBefore.asInstanceOf[js.Any])
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions.asInstanceOf[js.Any])
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardLoopCharacteristics]
  }
}

