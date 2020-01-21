package typings.betterQueue

import typings.betterQueue.mod.QueueEvent
import typings.betterQueue.mod.TicketEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object betterQueueStrings {
  @js.native
  sealed trait accept extends TicketEvent
  
  @js.native
  sealed trait batch_failed extends QueueEvent
  
  @js.native
  sealed trait batch_finish extends QueueEvent
  
  @js.native
  sealed trait batch_progress extends QueueEvent
  
  @js.native
  sealed trait drain extends QueueEvent
  
  @js.native
  sealed trait empty extends QueueEvent
  
  @js.native
  sealed trait error
    extends QueueEvent
       with TicketEvent
  
  @js.native
  sealed trait failed extends TicketEvent
  
  @js.native
  sealed trait finish extends TicketEvent
  
  @js.native
  sealed trait progress extends TicketEvent
  
  @js.native
  sealed trait queued extends TicketEvent
  
  @js.native
  sealed trait started extends TicketEvent
  
  @js.native
  sealed trait task_accepted extends QueueEvent
  
  @js.native
  sealed trait task_failed extends QueueEvent
  
  @js.native
  sealed trait task_finish extends QueueEvent
  
  @js.native
  sealed trait task_progress extends QueueEvent
  
  @js.native
  sealed trait task_queued extends QueueEvent
  
  @js.native
  sealed trait task_started extends QueueEvent
  
  @scala.inline
  def accept: accept = "accept".asInstanceOf[accept]
  @scala.inline
  def batch_failed: batch_failed = "batch_failed".asInstanceOf[batch_failed]
  @scala.inline
  def batch_finish: batch_finish = "batch_finish".asInstanceOf[batch_finish]
  @scala.inline
  def batch_progress: batch_progress = "batch_progress".asInstanceOf[batch_progress]
  @scala.inline
  def drain: drain = "drain".asInstanceOf[drain]
  @scala.inline
  def empty: empty = "empty".asInstanceOf[empty]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  @scala.inline
  def finish: finish = "finish".asInstanceOf[finish]
  @scala.inline
  def progress: progress = "progress".asInstanceOf[progress]
  @scala.inline
  def queued: queued = "queued".asInstanceOf[queued]
  @scala.inline
  def started: started = "started".asInstanceOf[started]
  @scala.inline
  def task_accepted: task_accepted = "task_accepted".asInstanceOf[task_accepted]
  @scala.inline
  def task_failed: task_failed = "task_failed".asInstanceOf[task_failed]
  @scala.inline
  def task_finish: task_finish = "task_finish".asInstanceOf[task_finish]
  @scala.inline
  def task_progress: task_progress = "task_progress".asInstanceOf[task_progress]
  @scala.inline
  def task_queued: task_queued = "task_queued".asInstanceOf[task_queued]
  @scala.inline
  def task_started: task_started = "task_started".asInstanceOf[task_started]
}

