package typings.ckeditor.CKEDITOR.plugins

import typings.ckeditor.CKEDITOR.event
import typings.ckeditor.CKEDITOR.plugins.notificationAggregator.task
import typings.ckeditor.anon.Weight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait notificationAggregator extends event {
  val editor: typings.ckeditor.CKEDITOR.editor = js.native
  val notification: typings.ckeditor.CKEDITOR.plugins.notification = js.native
  def createTask(): task = js.native
  def createTask(options: Weight): task = js.native
  def getDoneTaskCount(): Double = js.native
  def getPercentage(): Double = js.native
  def getTaskCount(): Double = js.native
  def isFinished(): Boolean = js.native
  def update(): Unit = js.native
}

@JSGlobal("CKEDITOR.plugins.notificationAggregator")
@js.native
object notificationAggregator extends js.Object {
  @js.native
  trait task extends event {
    def cancel(): Unit = js.native
    def done(): Unit = js.native
    def isCanceled(): Boolean = js.native
    def isDone(): Boolean = js.native
    def update(weight: Double): Unit = js.native
  }
  
}

