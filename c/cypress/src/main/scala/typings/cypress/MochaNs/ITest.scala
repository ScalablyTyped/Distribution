package typings.cypress.MochaNs

import typings.cypress.cypressStrings.failed
import typings.cypress.cypressStrings.passed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Partial interface for Mocha's `Test` class. */
trait ITest extends IRunnable {
  var parent: ISuite
  var pending: Boolean
  var state: js.UndefOr[failed | passed] = js.undefined
  def fullTitle(): String
}

object ITest {
  @scala.inline
  def apply(
    async: Boolean,
    fn: js.Function,
    fullTitle: () => String,
    parent: ISuite,
    pending: Boolean,
    sync: Boolean,
    timedOut: Boolean,
    timeout: Double => ITest,
    title: String,
    state: failed | passed = null
  ): ITest = {
    val __obj = js.Dynamic.literal(async = async, fn = fn, fullTitle = js.Any.fromFunction0(fullTitle), parent = parent, pending = pending, sync = sync, timedOut = timedOut, timeout = js.Any.fromFunction1(timeout), title = title)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITest]
  }
}

