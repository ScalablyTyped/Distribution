package typings
package bpmnDashModdleLib.bpmnDashModdleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataStore extends ItemAwareElement {
  var capacity: scala.Double
  var isUnlimited: scala.Boolean
  var name: java.lang.String
}

object DataStore {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    capacity: scala.Double,
    dataState: DataState,
    id: java.lang.String,
    isUnlimited: scala.Boolean,
    itemSubjectRef: ItemDefinition,
    name: java.lang.String,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
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

