package typings.cypress.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Partial interface for Mocha's `Runnable` class. */
trait IRunnable extends js.Object {
  var async: Boolean
  var fn: js.Function
  var sync: Boolean
  var timedOut: Boolean
  var title: String
  def timeout(n: Double): this.type
}

object IRunnable {
  @scala.inline
  def apply(
    async: Boolean,
    fn: js.Function,
    sync: Boolean,
    timedOut: Boolean,
    timeout: Double => IRunnable,
    title: String
  ): IRunnable = {
    val __obj = js.Dynamic.literal(async = async, fn = fn, sync = sync, timedOut = timedOut, timeout = js.Any.fromFunction1(timeout), title = title)
  
    __obj.asInstanceOf[IRunnable]
  }
}

