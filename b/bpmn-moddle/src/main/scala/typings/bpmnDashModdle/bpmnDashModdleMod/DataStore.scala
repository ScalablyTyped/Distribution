package typings.bpmnDashModdle.bpmnDashModdleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataStore extends ItemAwareElement {
  var capacity: Double
  var isUnlimited: Boolean
  var name: String
}

object DataStore {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    capacity: Double,
    dataState: DataState,
    id: String,
    isUnlimited: Boolean,
    itemSubjectRef: ItemDefinition,
    name: String,
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): DataStore = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, capacity = capacity, dataState = dataState, id = id, isUnlimited = isUnlimited, itemSubjectRef = itemSubjectRef, name = name)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[DataStore]
  }
}

