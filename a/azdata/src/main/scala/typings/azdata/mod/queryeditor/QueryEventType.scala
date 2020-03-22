package typings.azdata.mod.queryeditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.azdata.azdataStrings.queryStart
  - typings.azdata.azdataStrings.queryUpdate
  - typings.azdata.azdataStrings.queryStop
  - typings.azdata.azdataStrings.executionPlan
  - typings.azdata.azdataStrings.visualize
*/
trait QueryEventType extends js.Object

object QueryEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def executionPlan: typings.azdata.azdataStrings.executionPlan = this.cast("executionPlan")
  @scala.inline
  def queryStart: typings.azdata.azdataStrings.queryStart = this.cast("queryStart")
  @scala.inline
  def queryStop: typings.azdata.azdataStrings.queryStop = this.cast("queryStop")
  @scala.inline
  def queryUpdate: typings.azdata.azdataStrings.queryUpdate = this.cast("queryUpdate")
  @scala.inline
  def visualize: typings.azdata.azdataStrings.visualize = this.cast("visualize")
}

