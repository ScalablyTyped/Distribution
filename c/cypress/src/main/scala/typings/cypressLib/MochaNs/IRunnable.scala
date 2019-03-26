package typings
package cypressLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Partial interface for Mocha's `Runnable` class. */
trait IRunnable extends js.Object {
  var async: scala.Boolean
  var fn: js.Function
  var sync: scala.Boolean
  var timedOut: scala.Boolean
  var title: java.lang.String
  def timeout(n: scala.Double): this.type
}

object IRunnable {
  @scala.inline
  def apply(
    async: scala.Boolean,
    fn: js.Function,
    sync: scala.Boolean,
    timedOut: scala.Boolean,
    timeout: scala.Double => IRunnable,
    title: java.lang.String
  ): IRunnable = {
    val __obj = js.Dynamic.literal(async = async, fn = fn, sync = sync, timedOut = timedOut, timeout = js.Any.fromFunction1(timeout), title = title)
  
    __obj.asInstanceOf[IRunnable]
  }
}

