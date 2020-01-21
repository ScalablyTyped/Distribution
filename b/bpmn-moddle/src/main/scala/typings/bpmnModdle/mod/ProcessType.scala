package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bpmnModdle.bpmnModdleStrings.None
  - typings.bpmnModdle.bpmnModdleStrings.Public
  - typings.bpmnModdle.bpmnModdleStrings.Private
*/
trait ProcessType extends js.Object

object ProcessType {
  @scala.inline
  def None: typings.bpmnModdle.bpmnModdleStrings.None = this.cast("None")
  @scala.inline
  def Private: typings.bpmnModdle.bpmnModdleStrings.Private = this.cast("Private")
  @scala.inline
  def Public: typings.bpmnModdle.bpmnModdleStrings.Public = this.cast("Public")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

