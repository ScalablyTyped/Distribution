package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bpmnModdle.bpmnModdleStrings.None
  - typings.bpmnModdle.bpmnModdleStrings.Forward
  - typings.bpmnModdle.bpmnModdleStrings.Backward
  - typings.bpmnModdle.bpmnModdleStrings.Both
*/
trait RelationshipDirection extends js.Object

object RelationshipDirection {
  @scala.inline
  def Backward: typings.bpmnModdle.bpmnModdleStrings.Backward = this.cast("Backward")
  @scala.inline
  def Both: typings.bpmnModdle.bpmnModdleStrings.Both = this.cast("Both")
  @scala.inline
  def Forward: typings.bpmnModdle.bpmnModdleStrings.Forward = this.cast("Forward")
  @scala.inline
  def None: typings.bpmnModdle.bpmnModdleStrings.None = this.cast("None")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

