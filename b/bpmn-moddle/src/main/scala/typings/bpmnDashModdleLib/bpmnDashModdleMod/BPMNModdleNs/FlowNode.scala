package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FlowNode extends FlowElement {
  var incoming: js.Array[SequenceFlow]
  var lanes: js.Array[Lane]
  var outgoing: js.Array[SequenceFlow]
}

