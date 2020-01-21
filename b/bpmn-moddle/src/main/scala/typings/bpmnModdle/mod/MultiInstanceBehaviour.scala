package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bpmnModdle.bpmnModdleStrings.None
  - typings.bpmnModdle.bpmnModdleStrings.One
  - typings.bpmnModdle.bpmnModdleStrings.All
  - typings.bpmnModdle.bpmnModdleStrings.Complex
*/
trait MultiInstanceBehaviour extends js.Object

object MultiInstanceBehaviour {
  @scala.inline
  def All: typings.bpmnModdle.bpmnModdleStrings.All = this.cast("All")
  @scala.inline
  def Complex: typings.bpmnModdle.bpmnModdleStrings.Complex = this.cast("Complex")
  @scala.inline
  def None: typings.bpmnModdle.bpmnModdleStrings.None = this.cast("None")
  @scala.inline
  def One: typings.bpmnModdle.bpmnModdleStrings.One = this.cast("One")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

