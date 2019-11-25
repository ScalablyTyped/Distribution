package typings.bpmnDashModdle.bpmnDashModdleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bpmnDashModdle.bpmnDashModdleStrings.None
  - typings.bpmnDashModdle.bpmnDashModdleStrings.Standard
  - typings.bpmnDashModdle.bpmnDashModdleStrings.MultiInstanceSequential
  - typings.bpmnDashModdle.bpmnDashModdleStrings.MultiInstanceParallel
*/
trait ChoreographyLoopType extends js.Object

object ChoreographyLoopType {
  @scala.inline
  def MultiInstanceParallel: typings.bpmnDashModdle.bpmnDashModdleStrings.MultiInstanceParallel = this.cast("MultiInstanceParallel")
  @scala.inline
  def MultiInstanceSequential: typings.bpmnDashModdle.bpmnDashModdleStrings.MultiInstanceSequential = this.cast("MultiInstanceSequential")
  @scala.inline
  def None: typings.bpmnDashModdle.bpmnDashModdleStrings.None = this.cast("None")
  @scala.inline
  def Standard: typings.bpmnDashModdle.bpmnDashModdleStrings.Standard = this.cast("Standard")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

