package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bpmnModdle.bpmnModdleStrings.None
  - typings.bpmnModdle.bpmnModdleStrings.One
  - typings.bpmnModdle.bpmnModdleStrings.Both
*/
trait AssociationDirection extends js.Object

object AssociationDirection {
  @scala.inline
  def Both: typings.bpmnModdle.bpmnModdleStrings.Both = this.cast("Both")
  @scala.inline
  def None: typings.bpmnModdle.bpmnModdleStrings.None = this.cast("None")
  @scala.inline
  def One: typings.bpmnModdle.bpmnModdleStrings.One = this.cast("One")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

