package typings.betterQueue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.betterQueue.betterQueueStrings.task_queued
  - typings.betterQueue.betterQueueStrings.task_accepted
  - typings.betterQueue.betterQueueStrings.task_started
  - typings.betterQueue.betterQueueStrings.task_finish
  - typings.betterQueue.betterQueueStrings.task_failed
  - typings.betterQueue.betterQueueStrings.task_progress
  - typings.betterQueue.betterQueueStrings.batch_finish
  - typings.betterQueue.betterQueueStrings.batch_failed
  - typings.betterQueue.betterQueueStrings.batch_progress
  - typings.betterQueue.betterQueueStrings.drain
  - typings.betterQueue.betterQueueStrings.empty
  - typings.betterQueue.betterQueueStrings.error
*/
trait QueueEvent extends js.Object

object QueueEvent {
  @scala.inline
  def batch_failed: typings.betterQueue.betterQueueStrings.batch_failed = this.cast("batch_failed")
  @scala.inline
  def batch_finish: typings.betterQueue.betterQueueStrings.batch_finish = this.cast("batch_finish")
  @scala.inline
  def batch_progress: typings.betterQueue.betterQueueStrings.batch_progress = this.cast("batch_progress")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def drain: typings.betterQueue.betterQueueStrings.drain = this.cast("drain")
  @scala.inline
  def empty: typings.betterQueue.betterQueueStrings.empty = this.cast("empty")
  @scala.inline
  def error: typings.betterQueue.betterQueueStrings.error = this.cast("error")
  @scala.inline
  def task_accepted: typings.betterQueue.betterQueueStrings.task_accepted = this.cast("task_accepted")
  @scala.inline
  def task_failed: typings.betterQueue.betterQueueStrings.task_failed = this.cast("task_failed")
  @scala.inline
  def task_finish: typings.betterQueue.betterQueueStrings.task_finish = this.cast("task_finish")
  @scala.inline
  def task_progress: typings.betterQueue.betterQueueStrings.task_progress = this.cast("task_progress")
  @scala.inline
  def task_queued: typings.betterQueue.betterQueueStrings.task_queued = this.cast("task_queued")
  @scala.inline
  def task_started: typings.betterQueue.betterQueueStrings.task_started = this.cast("task_started")
}

