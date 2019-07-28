package typings.bpmnDashModdle.bpmnDashModdleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputSet extends BaseElement {
  var dataOutputRefs: js.Array[DataOutput]
  var inputSetRefs: js.Array[InputSet]
  var name: String
  var optionalOutputRefs: js.Array[DataOutput]
  var whileExecutingOutputREfs: js.Array[DataOutput]
}

object OutputSet {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    dataOutputRefs: js.Array[DataOutput],
    id: String,
    inputSetRefs: js.Array[InputSet],
    name: String,
    optionalOutputRefs: js.Array[DataOutput],
    whileExecutingOutputREfs: js.Array[DataOutput],
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): OutputSet = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, dataOutputRefs = dataOutputRefs, id = id, inputSetRefs = inputSetRefs, name = name, optionalOutputRefs = optionalOutputRefs, whileExecutingOutputREfs = whileExecutingOutputREfs)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[OutputSet]
  }
}

