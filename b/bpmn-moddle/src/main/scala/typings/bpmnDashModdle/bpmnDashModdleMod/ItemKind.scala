package typings.bpmnDashModdle.bpmnDashModdleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bpmnDashModdle.bpmnDashModdleStrings.Physical
  - typings.bpmnDashModdle.bpmnDashModdleStrings.Information
*/
trait ItemKind extends js.Object

object ItemKind {
  @scala.inline
  def Information: typings.bpmnDashModdle.bpmnDashModdleStrings.Information = this.cast("Information")
  @scala.inline
  def Physical: typings.bpmnDashModdle.bpmnDashModdleStrings.Physical = this.cast("Physical")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

