package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bpmnModdle.bpmnModdleStrings.Physical
  - typings.bpmnModdle.bpmnModdleStrings.Information
*/
trait ItemKind extends js.Object

object ItemKind {
  @scala.inline
  def Information: typings.bpmnModdle.bpmnModdleStrings.Information = this.cast("Information")
  @scala.inline
  def Physical: typings.bpmnModdle.bpmnModdleStrings.Physical = this.cast("Physical")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

