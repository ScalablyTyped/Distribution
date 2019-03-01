package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs.ItemAwareElement because var conflicts: $attrs, $type, documentation, extensionDefinitions, extensionElements, id. Inlined itemSubjectRef, dataState */ trait DataStoreReference extends FlowElement {
  var dataState: DataState
  var dataStoreRef: DataStore
  var itemSubjectRef: ItemDefinition
}

object DataStoreReference {
  @scala.inline
  def apply(
    $type: ElementType,
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    dataState: DataState,
    dataStoreRef: DataStore,
    id: java.lang.String,
    itemSubjectRef: ItemDefinition,
    monitoring: Monitoring,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null,
    name: java.lang.String = null
  ): DataStoreReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$type")($type)
    __obj.updateDynamic("auditing")(auditing)
    __obj.updateDynamic("categoryValueRef")(categoryValueRef)
    __obj.updateDynamic("dataState")(dataState)
    __obj.updateDynamic("dataStoreRef")(dataStoreRef)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("itemSubjectRef")(itemSubjectRef)
    __obj.updateDynamic("monitoring")(monitoring)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[DataStoreReference]
  }
}

