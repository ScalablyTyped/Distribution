package typings.cypress.mod.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The clock starts at the unix epoch (timestamp of 0). This means that when you instantiate new Date in your application, it will have a time of January 1st, 1970.
  */
trait Clock extends js.Object {
  /**
    * Restore all overridden native functions. This is automatically called between tests, so should not generally be needed.
    */
  def restore(): Unit
  /**
    * Move the clock the specified number of `milliseconds`.
    * Any timers within the affected range of time will be called.
    * @param time Number in ms to advance the clock
    */
  def tick(time: Double): Unit
}

object Clock {
  @scala.inline
  def apply(restore: () => Unit, tick: Double => Unit): Clock = {
    val __obj = js.Dynamic.literal(restore = js.Any.fromFunction0(restore), tick = js.Any.fromFunction1(tick))
    __obj.asInstanceOf[Clock]
  }
}

