package typings.bpmnModdle.mod

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
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], dataState = dataState.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isUnlimited = isUnlimited.asInstanceOf[js.Any], itemSubjectRef = itemSubjectRef.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions.asInstanceOf[js.Any])
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataStore]
  }
}

