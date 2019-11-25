package typings.bpmnDashModdle.bpmnDashModdleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bpmnDashModdle.bpmnDashModdleStrings.None
  - typings.bpmnDashModdle.bpmnDashModdleStrings.Forward
  - typings.bpmnDashModdle.bpmnDashModdleStrings.Backward
  - typings.bpmnDashModdle.bpmnDashModdleStrings.Both
*/
trait RelationshipDirection extends js.Object

object RelationshipDirection {
  @scala.inline
  def Backward: typings.bpmnDashModdle.bpmnDashModdleStrings.Backward = this.cast("Backward")
  @scala.inline
  def Both: typings.bpmnDashModdle.bpmnDashModdleStrings.Both = this.cast("Both")
  @scala.inline
  def Forward: typings.bpmnDashModdle.bpmnDashModdleStrings.Forward = this.cast("Forward")
  @scala.inline
  def None: typings.bpmnDashModdle.bpmnDashModdleStrings.None = this.cast("None")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

