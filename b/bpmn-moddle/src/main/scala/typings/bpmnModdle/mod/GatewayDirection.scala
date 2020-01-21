package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bpmnModdle.bpmnModdleStrings.Unspecified
  - typings.bpmnModdle.bpmnModdleStrings.Converging
  - typings.bpmnModdle.bpmnModdleStrings.Diverging
  - typings.bpmnModdle.bpmnModdleStrings.Mixed
*/
trait GatewayDirection extends js.Object

object GatewayDirection {
  @scala.inline
  def Converging: typings.bpmnModdle.bpmnModdleStrings.Converging = this.cast("Converging")
  @scala.inline
  def Diverging: typings.bpmnModdle.bpmnModdleStrings.Diverging = this.cast("Diverging")
  @scala.inline
  def Mixed: typings.bpmnModdle.bpmnModdleStrings.Mixed = this.cast("Mixed")
  @scala.inline
  def Unspecified: typings.bpmnModdle.bpmnModdleStrings.Unspecified = this.cast("Unspecified")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

