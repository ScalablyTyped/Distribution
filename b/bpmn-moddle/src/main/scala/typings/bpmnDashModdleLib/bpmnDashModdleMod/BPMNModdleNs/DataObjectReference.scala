package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs.FlowElement because var conflicts: $attrs, $type, documentation, extensionDefinitions, extensionElements, id. Inlined name, auditing, monitoring, categoryValueRef */ trait DataObjectReference extends ItemAwareElement {
  var auditing: Auditing
  var categoryValueRef: js.Array[CategoryValue]
  var dataObjectRef: DataObject
  var monitoring: Monitoring
  var name: js.UndefOr[java.lang.String] = js.undefined
}

