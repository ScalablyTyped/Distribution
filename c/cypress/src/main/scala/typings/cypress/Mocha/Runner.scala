package typings.cypress.Mocha

import typings.cypress.NodeJS.EventEmitter
import typings.cypress.cypressStrings.`hook end`
import typings.cypress.cypressStrings.`suite end`
import typings.cypress.cypressStrings.`test end`
import typings.cypress.cypressStrings.end
import typings.cypress.cypressStrings.fail
import typings.cypress.cypressStrings.hook
import typings.cypress.cypressStrings.pass
import typings.cypress.cypressStrings.pending
import typings.cypress.cypressStrings.start
import typings.cypress.cypressStrings.suite
import typings.cypress.cypressStrings.test
import typings.cypress.cypressStrings.waiting
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion Runner "pending" event
// #region Runner untyped events
// #endregion Runner "fail" event
// #region Runner "pending" event
// #endregion Runner "pass" event
// #region Runner "fail" event
// #endregion Runner "hook end" event
// #region Runner "pass" event
// #endregion Runner "hook" event
// #region Runner "hook end" event
// #endregion Runner "test end" event
// #region Runner "hook" event
// #endregion Runner "test" event
// #region Runner "test end" event
// #endregion Runner "suite end" event
// #region Runner "test" event
// #endregion Runner "suite" event
// #region Runner "suite end" event
// #endregion Runner "end" event
// #region Runner "suite" event
// #endregion Runner "start" event
// #region Runner "end" event
// #endregion Runner "waiting" event
// #region Runner "start" event
// #region Runner "waiting" event
/**
  * Initialize a `Runner` for the given `suite`.
  *
  * @see https://mochajs.org/api/Mocha.Runner.html
  */
@js.native
trait Runner extends EventEmitter {
  var _abort: js.Any = js.native
  var _defaultGrep: js.Any = js.native
  var _delay: js.Any = js.native
  var _globals: js.Any = js.native
  var allowUncaught: js.UndefOr[Boolean] = js.native
  var asyncOnly: js.UndefOr[Boolean] = js.native
  var currentRunnable: js.UndefOr[Runnable] = js.native
  var failures: Double = js.native
  var forbidOnly: js.UndefOr[Boolean] = js.native
  var forbidPending: js.UndefOr[Boolean] = js.native
  var fullStackTrace: js.UndefOr[Boolean] = js.native
  var hookErr: js.Any = js.native
  var ignoreLeaks: js.UndefOr[Boolean] = js.native
  var next: js.Any = js.native
  var nextSuite: js.Any = js.native
  var prevGlobalsLength: js.Any = js.native
  var started: Boolean = js.native
  var stats: js.UndefOr[Stats] = js.native
  var suite: Suite = js.native
  var test: js.UndefOr[Test] = js.native
  var total: Double = js.native
  /**
    * Cleanly abort execution.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#.Runner#abort
    */
  def abort(): this.type = js.native
  def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_fail(event: fail, listener: js.Function2[/* test */ Test, /* err */ js.Any, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_hook(event: hook, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_hookend(event: `hook end`, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_pass(event: pass, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_pending(event: pending, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_start(event: start, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_suite(event: suite, listener: js.Function1[/* suite */ Suite, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_suiteend(event: `suite end`, listener: js.Function1[/* suite */ Suite, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_test(event: test, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_testend(event: `test end`, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_waiting(event: waiting, listener: js.Function1[/* rootSuite */ Suite, Unit]): this.type = js.native
  /**
    * Check for global variable leaks.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#checkGlobals
    */
  /* protected */ def checkGlobals(test: Test): Unit = js.native
  def emit(name: String, args: js.Any*): Boolean = js.native
  @JSName("emit")
  def emit_end(name: end): Boolean = js.native
  @JSName("emit")
  def emit_fail(name: fail, test: Test, err: js.Any): Boolean = js.native
  @JSName("emit")
  def emit_hook(name: hook, hook: Hook): Boolean = js.native
  @JSName("emit")
  def emit_hookend(name: `hook end`, hook: Hook): Boolean = js.native
  @JSName("emit")
  def emit_pass(name: pass, test: Test): Boolean = js.native
  @JSName("emit")
  def emit_pending(name: pending, test: Test): Boolean = js.native
  @JSName("emit")
  def emit_start(name: start): Boolean = js.native
  @JSName("emit")
  def emit_suite(name: suite, suite: Suite): Boolean = js.native
  @JSName("emit")
  def emit_suiteend(name: `suite end`, suite: Suite): Boolean = js.native
  @JSName("emit")
  def emit_test(name: test, test: Test): Boolean = js.native
  @JSName("emit")
  def emit_testend(name: `test end`, test: Test): Boolean = js.native
  @JSName("emit")
  def emit_waiting(name: waiting, rootSuite: Suite): Boolean = js.native
  /**
    * Fail the given `test`.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#fail
    */
  /* protected */ def fail(test: Test, err: js.Any): Unit = js.native
  /**
    * Fail the given `hook` with `err`.
    *
    * Hook failures work in the following pattern:
    * - If bail, then exit
    * - Failed `before` hook skips all tests in a suite and subsuites,
    *   but jumps to corresponding `after` hook
    * - Failed `before each` hook skips remaining tests in a
    *   suite and jumps to corresponding `after each` hook,
    *   which is run only once
    * - Failed `after` hook does not alter
    *   execution order
    * - Failed `after each` hook skips remaining tests in a
    *   suite and subsuites, but executes other `after each`
    *   hooks
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#failHook
    */
  /* protected */ def failHook(hook: Hook, err: js.Any): Unit = js.native
  /**
    * Return a list of global properties.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#globalProps
    */
  /* protected */ def globalProps(): js.Array[String] = js.native
  /**
    * Gets the allowed globals.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#.Runner#globals
    */
  def globals(): js.Array[String] = js.native
  /**
    * Allow the given `arr` of globals.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#.Runner#globals
    */
  def globals(arr: js.Array[String]): this.type = js.native
   // added by reporters
  /**
    * Run tests with full titles matching `re`. Updates runner.total
    * with number of tests matched.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#.Runner#grep
    */
  def grep(re: RegExp, invert: Boolean): this.type = js.native
  /** @deprecated Use the overload that accepts `Mocha.Suite` instead. */
  def grepTotal(suite: ISuite): Double = js.native
  /**
    * Returns the number of tests matching the grep search for the
    * given suite.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#.Runner#grepTotal
    */
  def grepTotal(suite: Suite): Double = js.native
  /**
    * Run hook `name` callbacks and then invoke `fn()`.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#hook
    */
  /* protected */ def hook(name: String, fn: js.Function0[Unit]): Unit = js.native
  /**
    * Run hooks from the bottom up.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#hookDown
    */
  /* protected */ def hookDown(
    name: String,
    fn: js.Function2[/* err */ js.UndefOr[js.Any], /* errSuite */ js.UndefOr[Suite], Unit]
  ): Unit = js.native
  /**
    * Run hooks from the top level down.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#hookUp
    */
  /* protected */ def hookUp(
    name: String,
    fn: js.Function2[/* err */ js.UndefOr[js.Any], /* errSuite */ js.UndefOr[Suite], Unit]
  ): Unit = js.native
  /**
    * Run hook `name` for the given array of `suites`
    * in order, and callback `fn(err, errSuite)`.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#hooks
    */
  /* protected */ def hooks(
    name: String,
    suites: js.Array[Suite],
    fn: js.Function2[/* err */ js.UndefOr[js.Any], /* errSuite */ js.UndefOr[Suite], Unit]
  ): Unit = js.native
  def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_fail(event: fail, listener: js.Function2[/* test */ Test, /* err */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_hook(event: hook, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("on")
  def on_hookend(event: `hook end`, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("on")
  def on_pass(event: pass, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  @JSName("on")
  def on_pending(event: pending, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  @JSName("on")
  def on_start(event: start, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_suite(event: suite, listener: js.Function1[/* suite */ Suite, Unit]): this.type = js.native
  @JSName("on")
  def on_suiteend(event: `suite end`, listener: js.Function1[/* suite */ Suite, Unit]): this.type = js.native
  @JSName("on")
  def on_test(event: test, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  @JSName("on")
  def on_testend(event: `test end`, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  @JSName("on")
  def on_waiting(event: waiting, listener: js.Function1[/* rootSuite */ Suite, Unit]): this.type = js.native
  def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_fail(event: fail, listener: js.Function2[/* test */ Test, /* err */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_hook(event: hook, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("once")
  def once_hookend(event: `hook end`, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("once")
  def once_pass(event: pass, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  @JSName("once")
  def once_pending(event: pending, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  @JSName("once")
  def once_start(event: start, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_suite(event: suite, listener: js.Function1[/* suite */ Suite, Unit]): this.type = js.native
  @JSName("once")
  def once_suiteend(event: `suite end`, listener: js.Function1[/* suite */ Suite, Unit]): this.type = js.native
  @JSName("once")
  def once_test(event: test, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  @JSName("once")
  def once_testend(event: `test end`, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  @JSName("once")
  def once_waiting(event: waiting, listener: js.Function1[/* rootSuite */ Suite, Unit]): this.type = js.native
  /**
    * Return an array of parent Suites from closest to furthest.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#parents
    */
  /* protected */ def parents(): js.Array[Suite] = js.native
  def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_fail(event: fail, listener: js.Function2[/* test */ Test, /* err */ js.Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_hook(event: hook, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_hookend(event: `hook end`, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_pass(event: pass, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_pending(event: pending, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_start(event: start, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_suite(event: suite, listener: js.Function1[/* suite */ Suite, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_suiteend(event: `suite end`, listener: js.Function1[/* suite */ Suite, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_test(event: test, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_testend(event: `test end`, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_waiting(event: waiting, listener: js.Function1[/* rootSuite */ Suite, Unit]): this.type = js.native
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_fail(event: fail, listener: js.Function2[/* test */ Test, /* err */ js.Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_hook(event: hook, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_hookend(event: `hook end`, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pass(event: pass, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pending(event: pending, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_start(event: start, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_suite(event: suite, listener: js.Function1[/* suite */ Suite, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_suiteend(event: `suite end`, listener: js.Function1[/* suite */ Suite, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_test(event: test, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_testend(event: `test end`, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_waiting(event: waiting, listener: js.Function1[/* rootSuite */ Suite, Unit]): this.type = js.native
  def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_fail(event: fail, listener: js.Function2[/* test */ Test, /* err */ js.Any, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_hook(event: hook, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_hookend(event: `hook end`, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_pass(event: pass, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_pending(event: pending, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_start(event: start, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_suite(event: suite, listener: js.Function1[/* suite */ Suite, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_suiteend(event: `suite end`, listener: js.Function1[/* suite */ Suite, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_test(event: test, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_testend(event: `test end`, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_waiting(event: waiting, listener: js.Function1[/* rootSuite */ Suite, Unit]): this.type = js.native
  /**
    * Run the root suite and invoke `fn(failures)` on completion.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#.Runner#run
    */
  def run(): this.type = js.native
  def run(fn: js.Function1[/* failures */ Double, Unit]): this.type = js.native
  /**
    * Run the given `suite` and invoke the callback `fn()` when complete.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#runSuite
    */
  /* protected */ def runSuite(suite: Suite, fn: js.Function1[/* errSuite */ js.UndefOr[Suite], Unit]): Unit = js.native
  /**
    * Run the current test and callback `fn(err)`.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#runTest
    */
  /* protected */ def runTest(fn: Done): js.Any = js.native
  /**
    * Run tests in the given `suite` and invoke the callback `fn()` when complete.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#runTests
    */
  /* protected */ def runTests(suite: Suite, fn: js.Function1[/* errSuite */ js.UndefOr[Suite], Unit]): Unit = js.native
  /**
    * Handle uncaught exceptions.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#uncaught
    */
  def uncaught(err: js.Any): Unit = js.native
}

