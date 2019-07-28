package typings.bpmnDashModdle.bpmnDashModdleMod

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
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, id = id, loopCondition = loopCondition, loopMaximum = loopMaximum, testBefore = testBefore)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[StandardLoopCharacteristics]
  }
}

