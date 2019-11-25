package typings.bpmnDashModdle.bpmnDashModdleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bpmnDashModdle.bpmnDashModdleStrings.Unspecified
  - typings.bpmnDashModdle.bpmnDashModdleStrings.Converging
  - typings.bpmnDashModdle.bpmnDashModdleStrings.Diverging
  - typings.bpmnDashModdle.bpmnDashModdleStrings.Mixed
*/
trait GatewayDirection extends js.Object

object GatewayDirection {
  @scala.inline
  def Converging: typings.bpmnDashModdle.bpmnDashModdleStrings.Converging = this.cast("Converging")
  @scala.inline
  def Diverging: typings.bpmnDashModdle.bpmnDashModdleStrings.Diverging = this.cast("Diverging")
  @scala.inline
  def Mixed: typings.bpmnDashModdle.bpmnDashModdleStrings.Mixed = this.cast("Mixed")
  @scala.inline
  def Unspecified: typings.bpmnDashModdle.bpmnDashModdleStrings.Unspecified = this.cast("Unspecified")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

