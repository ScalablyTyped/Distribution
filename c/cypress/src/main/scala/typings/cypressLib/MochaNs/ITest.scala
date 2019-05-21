package typings
package cypressLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Partial interface for Mocha's `Test` class. */
trait ITest extends IRunnable {
  var parent: ISuite
  var pending: scala.Boolean
  var state: js.UndefOr[cypressLib.cypressLibStrings.failed | cypressLib.cypressLibStrings.passed] = js.undefined
  def fullTitle(): java.lang.String
}

object ITest {
  @scala.inline
  def apply(
    async: scala.Boolean,
    fn: js.Function,
    fullTitle: () => java.lang.String,
    parent: ISuite,
    pending: scala.Boolean,
    sync: scala.Boolean,
    timedOut: scala.Boolean,
    timeout: scala.Double => ITest,
    title: java.lang.String,
    state: cypressLib.cypressLibStrings.failed | cypressLib.cypressLibStrings.passed = null
  ): ITest = {
    val __obj = js.Dynamic.literal(async = async, fn = fn, fullTitle = js.Any.fromFunction0(fullTitle), parent = parent, pending = pending, sync = sync, timedOut = timedOut, timeout = js.Any.fromFunction1(timeout), title = title)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITest]
  }
}

