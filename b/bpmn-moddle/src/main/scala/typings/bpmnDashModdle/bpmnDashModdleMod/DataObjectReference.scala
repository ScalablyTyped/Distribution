package typings.bpmnDashModdle.bpmnDashModdleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.bpmnDashModdle.bpmnDashModdleMod.TypeDerived because Already inherited
- typings.bpmnDashModdle.bpmnDashModdleMod.BaseElement because Already inherited
- typings.bpmnDashModdle.bpmnDashModdleMod.FlowElement because var conflicts: $attrs, $parent, $type, documentation, extensionDefinitions, extensionElements, id. Inlined name, auditing, monitoring, categoryValueRef */ trait DataObjectReference extends ItemAwareElement {
  var auditing: Auditing
  var categoryValueRef: js.Array[CategoryValue]
  var dataObjectRef: DataObject
  var monitoring: Monitoring
  var name: js.UndefOr[String] = js.undefined
}

object DataObjectReference {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    dataObjectRef: DataObject,
    dataState: DataState,
    id: String,
    itemSubjectRef: ItemDefinition,
    monitoring: Monitoring,
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null,
    name: String = null
  ): DataObjectReference = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, auditing = auditing, categoryValueRef = categoryValueRef, dataObjectRef = dataObjectRef, dataState = dataState, id = id, itemSubjectRef = itemSubjectRef, monitoring = monitoring)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[DataObjectReference]
  }
}

