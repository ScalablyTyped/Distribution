package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CatchEvent extends Event {
  var dataOutputAssociations: js.Array[DataOutputAssociation]
  var dataOutputs: js.Array[DataOutput]
  var eventDefinitions: js.Array[EventDefinition]
  var outputSet: OutputSet
  /**
           * @default false
           */
  var parallelMultiple: scala.Boolean
}

