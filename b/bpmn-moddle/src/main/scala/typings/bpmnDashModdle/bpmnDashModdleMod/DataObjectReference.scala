package typings.bpmnDashModdle.bpmnDashModdleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.bpmnDashModdle.bpmnDashModdleMod.TypeDerived because Already inherited
- typings.bpmnDashModdle.bpmnDashModdleMod.BaseElement because Already inherited
- typings.bpmnDashModdle.bpmnDashModdleMod.FlowElement because var conflicts: $attrs, $parent, $type, documentation, extensionDefinitions, extensionElements, id. Inlined name, auditing, monitoring, categoryValueRef */ @js.native
trait DataObjectReference extends ItemAwareElement {
  var auditing: Auditing = js.native
  var categoryValueRef: js.Array[CategoryValue] = js.native
  var dataObjectRef: DataObject = js.native
  var monitoring: Monitoring = js.native
  var name: js.UndefOr[String] = js.native
}

