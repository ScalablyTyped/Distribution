package typings.betterQueue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.betterQueue.betterQueueStrings.accept
  - typings.betterQueue.betterQueueStrings.queued
  - typings.betterQueue.betterQueueStrings.started
  - typings.betterQueue.betterQueueStrings.progress
  - typings.betterQueue.betterQueueStrings.finish
  - typings.betterQueue.betterQueueStrings.failed
  - typings.betterQueue.betterQueueStrings.error
*/
trait TicketEvent extends js.Object

object TicketEvent {
  @scala.inline
  def accept: typings.betterQueue.betterQueueStrings.accept = this.cast("accept")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.betterQueue.betterQueueStrings.error = this.cast("error")
  @scala.inline
  def failed: typings.betterQueue.betterQueueStrings.failed = this.cast("failed")
  @scala.inline
  def finish: typings.betterQueue.betterQueueStrings.finish = this.cast("finish")
  @scala.inline
  def progress: typings.betterQueue.betterQueueStrings.progress = this.cast("progress")
  @scala.inline
  def queued: typings.betterQueue.betterQueueStrings.queued = this.cast("queued")
  @scala.inline
  def started: typings.betterQueue.betterQueueStrings.started = this.cast("started")
}

