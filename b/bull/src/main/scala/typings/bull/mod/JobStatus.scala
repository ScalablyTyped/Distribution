package typings.bull.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bull.bullStrings.completed
  - typings.bull.bullStrings.waiting
  - typings.bull.bullStrings.active
  - typings.bull.bullStrings.delayed
  - typings.bull.bullStrings.failed
*/
trait JobStatus extends js.Object

object JobStatus {
  @scala.inline
  def active: typings.bull.bullStrings.active = this.cast("active")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completed: typings.bull.bullStrings.completed = this.cast("completed")
  @scala.inline
  def delayed: typings.bull.bullStrings.delayed = this.cast("delayed")
  @scala.inline
  def failed: typings.bull.bullStrings.failed = this.cast("failed")
  @scala.inline
  def waiting: typings.bull.bullStrings.waiting = this.cast("waiting")
}

