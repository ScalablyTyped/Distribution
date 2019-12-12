package typings.bpmnDashModdle.bpmnDashModdleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.bpmnDashModdle.bpmnDashModdleMod.TypeDerived because Already inherited
- typings.bpmnDashModdle.bpmnDashModdleMod.BaseElement because Already inherited
- typings.bpmnDashModdle.bpmnDashModdleMod.ItemAwareElement because var conflicts: $attrs, $parent, $type, documentation, extensionDefinitions, extensionElements, id. Inlined itemSubjectRef, dataState */ @js.native
trait DataStoreReference extends FlowElement {
  var dataState: DataState = js.native
  var dataStoreRef: DataStore = js.native
  var itemSubjectRef: ItemDefinition = js.native
}

