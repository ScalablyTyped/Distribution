package typings.betterQueue

import typings.betterQueue.mod.QueueEvent
import typings.betterQueue.mod.TicketEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object betterQueueStrings {
  
  @js.native
  sealed trait accept extends TicketEvent
  @scala.inline
  def accept: accept = "accept".asInstanceOf[accept]
  
  @js.native
  sealed trait batch_failed extends QueueEvent
  @scala.inline
  def batch_failed: batch_failed = "batch_failed".asInstanceOf[batch_failed]
  
  @js.native
  sealed trait batch_finish extends QueueEvent
  @scala.inline
  def batch_finish: batch_finish = "batch_finish".asInstanceOf[batch_finish]
  
  @js.native
  sealed trait batch_progress extends QueueEvent
  @scala.inline
  def batch_progress: batch_progress = "batch_progress".asInstanceOf[batch_progress]
  
  @js.native
  sealed trait drain extends QueueEvent
  @scala.inline
  def drain: drain = "drain".asInstanceOf[drain]
  
  @js.native
  sealed trait empty extends QueueEvent
  @scala.inline
  def empty: empty = "empty".asInstanceOf[empty]
  
  @js.native
  sealed trait error
    extends QueueEvent
       with TicketEvent
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait failed extends TicketEvent
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait finish extends TicketEvent
  @scala.inline
  def finish: finish = "finish".asInstanceOf[finish]
  
  @js.native
  sealed trait progress extends TicketEvent
  @scala.inline
  def progress: progress = "progress".asInstanceOf[progress]
  
  @js.native
  sealed trait queued extends TicketEvent
  @scala.inline
  def queued: queued = "queued".asInstanceOf[queued]
  
  @js.native
  sealed trait started extends TicketEvent
  @scala.inline
  def started: started = "started".asInstanceOf[started]
  
  @js.native
  sealed trait task_accepted extends QueueEvent
  @scala.inline
  def task_accepted: task_accepted = "task_accepted".asInstanceOf[task_accepted]
  
  @js.native
  sealed trait task_failed extends QueueEvent
  @scala.inline
  def task_failed: task_failed = "task_failed".asInstanceOf[task_failed]
  
  @js.native
  sealed trait task_finish extends QueueEvent
  @scala.inline
  def task_finish: task_finish = "task_finish".asInstanceOf[task_finish]
  
  @js.native
  sealed trait task_progress extends QueueEvent
  @scala.inline
  def task_progress: task_progress = "task_progress".asInstanceOf[task_progress]
  
  @js.native
  sealed trait task_queued extends QueueEvent
  @scala.inline
  def task_queued: task_queued = "task_queued".asInstanceOf[task_queued]
  
  @js.native
  sealed trait task_started extends QueueEvent
  @scala.inline
  def task_started: task_started = "task_started".asInstanceOf[task_started]
}
