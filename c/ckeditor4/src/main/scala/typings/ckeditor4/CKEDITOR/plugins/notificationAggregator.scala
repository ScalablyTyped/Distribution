package typings.ckeditor4.CKEDITOR.plugins

import typings.ckeditor4.CKEDITOR.event
import typings.ckeditor4.CKEDITOR.plugins.notificationAggregator.task
import typings.ckeditor4.anon.Weight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait notificationAggregator
  extends StObject
     with event {
  
  def createTask(): task = js.native
  def createTask(options: Weight): task = js.native
  
  val editor: typings.ckeditor4.CKEDITOR.editor = js.native
  
  def getDoneTaskCount(): Double = js.native
  
  def getPercentage(): Double = js.native
  
  def getTaskCount(): Double = js.native
  
  def isFinished(): Boolean = js.native
  
  val notification: typings.ckeditor4.CKEDITOR.plugins.notification = js.native
  
  def update(): Unit = js.native
}
object notificationAggregator {
  
  @js.native
  trait task
    extends StObject
       with event {
    
    def cancel(): Unit = js.native
    
    def done(): Unit = js.native
    
    def isCanceled(): Boolean = js.native
    
    def isDone(): Boolean = js.native
    
    def update(weight: Double): Unit = js.native
  }
}
