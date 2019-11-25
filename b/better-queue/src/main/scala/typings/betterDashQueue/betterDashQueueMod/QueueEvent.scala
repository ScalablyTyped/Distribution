package typings.betterDashQueue.betterDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.betterDashQueue.betterDashQueueStrings.task_queued
  - typings.betterDashQueue.betterDashQueueStrings.task_accepted
  - typings.betterDashQueue.betterDashQueueStrings.task_started
  - typings.betterDashQueue.betterDashQueueStrings.task_finish
  - typings.betterDashQueue.betterDashQueueStrings.task_failed
  - typings.betterDashQueue.betterDashQueueStrings.task_progress
  - typings.betterDashQueue.betterDashQueueStrings.batch_finish
  - typings.betterDashQueue.betterDashQueueStrings.batch_failed
  - typings.betterDashQueue.betterDashQueueStrings.batch_progress
  - typings.betterDashQueue.betterDashQueueStrings.drain
  - typings.betterDashQueue.betterDashQueueStrings.empty
  - typings.betterDashQueue.betterDashQueueStrings.error
*/
trait QueueEvent extends js.Object

object QueueEvent {
  @scala.inline
  def batch_failed: typings.betterDashQueue.betterDashQueueStrings.batch_failed = this.cast("batch_failed")
  @scala.inline
  def batch_finish: typings.betterDashQueue.betterDashQueueStrings.batch_finish = this.cast("batch_finish")
  @scala.inline
  def batch_progress: typings.betterDashQueue.betterDashQueueStrings.batch_progress = this.cast("batch_progress")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def drain: typings.betterDashQueue.betterDashQueueStrings.drain = this.cast("drain")
  @scala.inline
  def empty: typings.betterDashQueue.betterDashQueueStrings.empty = this.cast("empty")
  @scala.inline
  def error: typings.betterDashQueue.betterDashQueueStrings.error = this.cast("error")
  @scala.inline
  def task_accepted: typings.betterDashQueue.betterDashQueueStrings.task_accepted = this.cast("task_accepted")
  @scala.inline
  def task_failed: typings.betterDashQueue.betterDashQueueStrings.task_failed = this.cast("task_failed")
  @scala.inline
  def task_finish: typings.betterDashQueue.betterDashQueueStrings.task_finish = this.cast("task_finish")
  @scala.inline
  def task_progress: typings.betterDashQueue.betterDashQueueStrings.task_progress = this.cast("task_progress")
  @scala.inline
  def task_queued: typings.betterDashQueue.betterDashQueueStrings.task_queued = this.cast("task_queued")
  @scala.inline
  def task_started: typings.betterDashQueue.betterDashQueueStrings.task_started = this.cast("task_started")
}

