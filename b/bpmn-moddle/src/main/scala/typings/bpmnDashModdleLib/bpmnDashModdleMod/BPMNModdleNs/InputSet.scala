package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputSet extends BaseElement {
  var dataInputRefs: js.Array[DataInput]
  var name: java.lang.String
  var optionalInputRefs: js.Array[DataInput]
  var outputSetRefs: js.Array[OutputSet]
  var whileExecutingInputsRefs: js.Array[DataInput]
}

object InputSet {
  @scala.inline
  def apply(
    $type: ElementType,
    dataInputRefs: js.Array[DataInput],
    id: java.lang.String,
    name: java.lang.String,
    optionalInputRefs: js.Array[DataInput],
    outputSetRefs: js.Array[OutputSet],
    whileExecutingInputsRefs: js.Array[DataInput],
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): InputSet = {
    val __obj = js.Dynamic.literal($type = $type, dataInputRefs = dataInputRefs, id = id, name = name, optionalInputRefs = optionalInputRefs, outputSetRefs = outputSetRefs, whileExecutingInputsRefs = whileExecutingInputsRefs)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[InputSet]
  }
}

