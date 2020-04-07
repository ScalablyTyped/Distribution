package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputSet extends BaseElement {
  var dataInputRefs: js.Array[DataInput]
  var name: String
  var optionalInputRefs: js.Array[DataInput]
  var outputSetRefs: js.Array[OutputSet]
  var whileExecutingInputsRefs: js.Array[DataInput]
}

object InputSet {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    dataInputRefs: js.Array[DataInput],
    id: String,
    name: String,
    optionalInputRefs: js.Array[DataInput],
    outputSetRefs: js.Array[OutputSet],
    whileExecutingInputsRefs: js.Array[DataInput],
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): InputSet = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], dataInputRefs = dataInputRefs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionalInputRefs = optionalInputRefs.asInstanceOf[js.Any], outputSetRefs = outputSetRefs.asInstanceOf[js.Any], whileExecutingInputsRefs = whileExecutingInputsRefs.asInstanceOf[js.Any])
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions.asInstanceOf[js.Any])
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputSet]
  }
}

