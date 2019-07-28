package typings.bpmnDashModdle.bpmnDashModdleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormalExpression extends Expression {
  var evaluatesToTypeRef: ItemDefinition
  var language: String
}

object FormalExpression {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    body: String,
    evaluatesToTypeRef: ItemDefinition,
    id: String,
    language: String,
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): FormalExpression = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, body = body, evaluatesToTypeRef = evaluatesToTypeRef, id = id, language = language)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[FormalExpression]
  }
}

