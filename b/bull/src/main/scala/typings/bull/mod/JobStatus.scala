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
  - typings.bull.bullStrings.paused
*/
trait JobStatus extends js.Object

object JobStatus {
  @scala.inline
  def active: typings.bull.bullStrings.active = "active".asInstanceOf[typings.bull.bullStrings.active]
  @scala.inline
  def completed: typings.bull.bullStrings.completed = "completed".asInstanceOf[typings.bull.bullStrings.completed]
  @scala.inline
  def delayed: typings.bull.bullStrings.delayed = "delayed".asInstanceOf[typings.bull.bullStrings.delayed]
  @scala.inline
  def failed: typings.bull.bullStrings.failed = "failed".asInstanceOf[typings.bull.bullStrings.failed]
  @scala.inline
  def paused: typings.bull.bullStrings.paused = "paused".asInstanceOf[typings.bull.bullStrings.paused]
  @scala.inline
  def waiting: typings.bull.bullStrings.waiting = "waiting".asInstanceOf[typings.bull.bullStrings.waiting]
}

