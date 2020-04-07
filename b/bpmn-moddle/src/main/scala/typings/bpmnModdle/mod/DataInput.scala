package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataInput extends ItemAwareElement {
  var inputSetRef: InputSet
  var inputSetWithOptional: InputSet
  var inputSetWithWhileExecuting: InputSet
  /** @default false */
  var isCollection: Boolean
  var name: String
}

object DataInput {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    dataState: DataState,
    id: String,
    inputSetRef: InputSet,
    inputSetWithOptional: InputSet,
    inputSetWithWhileExecuting: InputSet,
    isCollection: Boolean,
    itemSubjectRef: ItemDefinition,
    name: String,
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): DataInput = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], dataState = dataState.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputSetRef = inputSetRef.asInstanceOf[js.Any], inputSetWithOptional = inputSetWithOptional.asInstanceOf[js.Any], inputSetWithWhileExecuting = inputSetWithWhileExecuting.asInstanceOf[js.Any], isCollection = isCollection.asInstanceOf[js.Any], itemSubjectRef = itemSubjectRef.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions.asInstanceOf[js.Any])
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataInput]
  }
}

