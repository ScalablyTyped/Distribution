package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bpmnModdle.bpmnModdleStrings.None
  - typings.bpmnModdle.bpmnModdleStrings.Standard
  - typings.bpmnModdle.bpmnModdleStrings.MultiInstanceSequential
  - typings.bpmnModdle.bpmnModdleStrings.MultiInstanceParallel
*/
trait ChoreographyLoopType extends js.Object

object ChoreographyLoopType {
  @scala.inline
  def MultiInstanceParallel: typings.bpmnModdle.bpmnModdleStrings.MultiInstanceParallel = this.cast("MultiInstanceParallel")
  @scala.inline
  def MultiInstanceSequential: typings.bpmnModdle.bpmnModdleStrings.MultiInstanceSequential = this.cast("MultiInstanceSequential")
  @scala.inline
  def None: typings.bpmnModdle.bpmnModdleStrings.None = this.cast("None")
  @scala.inline
  def Standard: typings.bpmnModdle.bpmnModdleStrings.Standard = this.cast("Standard")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

