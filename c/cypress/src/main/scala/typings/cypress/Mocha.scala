package typings.cypress

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.cypress.Cypress.TestConfigOverrides
import typings.cypress.Mocha.Interface
import typings.cypress.Mocha.MochaInstanceOptions
import typings.cypress.Mocha.Reporter
import typings.cypress.Mocha.ReporterConstructor
import typings.cypress.Mocha.RootHookObject
import typings.cypress.Mocha.Runner
import typings.cypress.Mocha.Suite
import typings.cypress.Mocha.reporters.Base_
import typings.cypress.NodeJS.EventEmitter
import typings.cypress.cypressStrings.`hook end`
import typings.cypress.cypressStrings.`post-require`
import typings.cypress.cypressStrings.`pre-require`
import typings.cypress.cypressStrings.`suite end`
import typings.cypress.cypressStrings.`test end`
import typings.cypress.cypressStrings.afterAll
import typings.cypress.cypressStrings.afterEach
import typings.cypress.cypressStrings.beforeAll
import typings.cypress.cypressStrings.beforeEach
import typings.cypress.cypressStrings.end
import typings.cypress.cypressStrings.error
import typings.cypress.cypressStrings.fail
import typings.cypress.cypressStrings.failed
import typings.cypress.cypressStrings.fast
import typings.cypress.cypressStrings.hook
import typings.cypress.cypressStrings.medium
import typings.cypress.cypressStrings.pass
import typings.cypress.cypressStrings.passed
import typings.cypress.cypressStrings.pending
import typings.cypress.cypressStrings.ready
import typings.cypress.cypressStrings.require
import typings.cypress.cypressStrings.retry
import typings.cypress.cypressStrings.run
import typings.cypress.cypressStrings.slow
import typings.cypress.cypressStrings.start
import typings.cypress.cypressStrings.suite
import typings.cypress.cypressStrings.test
import typings.cypress.cypressStrings.waiting
import typings.std.HTMLLIElement
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mocha extends StObject {
  
  /* private */ var _growl: Any = js.native
  
  /* private */ var _reporter: Any = js.native
  
  /* private */ var _ui: Any = js.native
  
  /**
    * Add test `file`.
    *
    * @see https://mochajs.org/api/mocha#addFile
    */
  def addFile(file: String): this.type = js.native
  
  /**
    * Enable uncaught errors to propagate (in browser).
    *
    * @see https://mochajs.org/api/mocha#allowUncaught
    */
  def allowUncaught(): Boolean = js.native
  
  /**
    * Makes all tests async (accepting a callback)
    *
    * @see https://mochajs.org/api/mocha#asyncOnly.
    */
  def asyncOnly(): this.type = js.native
  
  /**
    * Enable or disable bailing on the first failure.
    *
    * @see https://mochajs.org/api/mocha#bail
    */
  def bail(): this.type = js.native
  def bail(bail: Boolean): this.type = js.native
  
  /**
    * Enable global leak checking.
    *
    * @see https://mochajs.org/api/mocha#checkLeaks
    */
  def checkLeaks(): this.type = js.native
  
  /**
    * Delay root suite execution.
    *
    * @see https://mochajs.org/api/mocha#delay
    */
  def delay(): Boolean = js.native
  
  /**
    * Escape string and add it to grep as a RegExp.
    *
    * @see https://mochajs.org/api/mocha#fgrep
    */
  def fgrep(str: String): this.type = js.native
  
  var files: js.Array[String] = js.native
  
  /**
    * Tests marked only fail the suite
    *
    * @see https://mochajs.org/api/mocha#forbidOnly
    */
  def forbidOnly(): Boolean = js.native
  
  /**
    * Pending tests and tests marked skip fail the suite
    *
    * @see https://mochajs.org/api/mocha#forbidPending
    */
  def forbidPending(): Boolean = js.native
  
  /**
    * Display long stack-trace on failing
    *
    * @see https://mochajs.org/api/mocha#fullTrace
    */
  def fullTrace(): this.type = js.native
  
  /**
    * Ignore `globals` array or string.
    *
    * @see https://mochajs.org/api/mocha#globals
    */
  def globals(globals: String): this.type = js.native
  def globals(globals: js.Array[String]): this.type = js.native
  
  /**
    * Add regexp to grep, if `re` is a string it is escaped.
    *
    * @see https://mochajs.org/api/mocha#grep
    */
  def grep(re: String): this.type = js.native
  def grep(re: js.RegExp): this.type = js.native
  
  /**
    * Enable growl support.
    *
    * @see https://mochajs.org/api/mocha#growl
    */
  def growl(): this.type = js.native
  
  /**
    * Invert `.grep()` matches.
    *
    * @see https://mochajs.org/api/mocha#invert
    */
  def invert(): this.type = js.native
  
  /**
    * Load registered files.
    *
    * @see https://mochajs.org/api/mocha#loadFiles
    */
  /* protected */ def loadFiles(): Unit = js.native
  /* protected */ def loadFiles(fn: js.Function0[Unit]): Unit = js.native
  
  /**
    * Loads ESM (and CJS) test files asynchronously.
    *
    * @see https://mochajs.org/api/mocha#loadFilesAsync
    */
  def loadFilesAsync(): js.Promise[Unit] = js.native
  
  /**
    * Disable syntax highlighting (in browser).
    *
    * @see https://mochajs.org/api/mocha#noHighlighting
    */
  def noHighlighting(): this.type = js.native
  
  var options: MochaInstanceOptions = js.native
  
  /**
    * Toggles parallel mode.
    *
    * Must be run before calling `run`. Changes the `Runner` class to
    * use; also enables lazy file loading if not already done so.
    *
    * @see https://mochajs.org/api/mocha#parallelMode
    */
  def parallelMode(): this.type = js.native
  def parallelMode(enabled: Boolean): this.type = js.native
  
  /**
    * Set reporter to the provided constructor, one of the built-in reporters, or loads a reporter
    * from a module path. Defaults to `"spec"`.
    *
    * @see https://mochajs.org/api/mocha#reporter
    */
  def reporter(): this.type = js.native
  def reporter(reporter: String): this.type = js.native
  def reporter(reporter: String, reporterOptions: Any): this.type = js.native
  def reporter(reporter: Unit, reporterOptions: Any): this.type = js.native
  /**
    * Set reporter to one of the built-in reporters.
    *
    * @see https://mochajs.org/api/mocha#reporter
    */
  def reporter(reporter: Reporter): this.type = js.native
  def reporter(reporter: ReporterConstructor): this.type = js.native
  def reporter(reporter: ReporterConstructor, reporterOptions: Any): this.type = js.native
  def reporter(reporter: Reporter, reporterOptions: Any): this.type = js.native
  
  /**
    * Set the number of times to retry failed tests.
    *
    * @see https://mochajs.org/api/mocha#retries
    */
  def retries(n: Double): this.type = js.native
  
  /**
    * Assigns hooks to the root suite.
    *
    * @see https://mochajs.org/api/mocha#rootHooks
    */
  def rootHooks(hooks: RootHookObject): this.type = js.native
  
  /**
    * Run tests and invoke `fn()` when complete.
    *
    * Note that `run` relies on Node's `require` to execute
    * the test interface functions and will be subject to the
    * cache - if the files are already in the `require` cache,
    * they will effectively be skipped. Therefore, to run tests
    * multiple times or to run tests in files that are already
    * in the `require` cache, make sure to clear them from the
    * cache first in whichever manner best suits your needs.
    *
    * @see https://mochajs.org/api/mocha#run
    */
  def run(): Runner = js.native
  def run(fn: js.Function1[/* failures */ Double, Unit]): Runner = js.native
  
  /**
    * Set slowness threshold in milliseconds.
    *
    * @see https://mochajs.org/api/mocha#slow
    */
  def slow(slow: String): this.type = js.native
  def slow(slow: Double): this.type = js.native
  
  var suite: Suite = js.native
  
  /**
    * Set the timeout in milliseconds.
    *
    * @see https://mochajs.org/api/mocha#timeout
    */
  def timeout(timeout: String): this.type = js.native
  def timeout(timeout: Double): this.type = js.native
  
  /**
    * Set test UI to one of the built-in test interfaces or loads a test interface from a module
    * path. Defaults to `"bdd"`.
    *
    * @see https://mochajs.org/api/mocha#ui
    */
  def ui(): this.type = js.native
  def ui(name: String): this.type = js.native
  /**
    * Set test UI to one of the built-in test interfaces.
    *
    * @see https://mochajs.org/api/mocha#ui
    */
  def ui(name: Interface): this.type = js.native
  
  /**
    * Unloads `files` from Node's `require` cache.
    *
    * This allows required files to be "freshly" reloaded, providing the ability
    * to reuse a Mocha instance programmatically.
    * Note: does not clear ESM module files from the cache
    */
  def unloadFiles(): this.type = js.native
}
object Mocha {
  
  /**
    * Async callback function used for tests and hooks.
    */
  type AsyncFunc = js.ThisFunction0[/* this */ Context, PromiseLike[Any]]
  
  // #endregion Runnable untyped events
  /**
    * Test context
    *
    * @see https://mochajs.org/api/module-Context.html#~Context
    */
  @js.native
  trait Context
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /* private */ var _runnable: Any = js.native
    
    var currentTest: js.UndefOr[Test] = js.native
    
    /**
      * Get the number of allowed retries on failed tests.
      */
    def retries(): Double = js.native
    /**
      * Set the number of allowed retries on failed tests.
      */
    def retries(n: Double): this.type = js.native
    
    /**
      * Get the context `Runnable`.
      */
    def runnable(): Runnable = js.native
    /**
      * Set the context `Runnable`.
      */
    def runnable(runnable: Runnable): this.type = js.native
    
    /**
      * Mark a test as skipped.
      */
    def skip(): scala.Nothing = js.native
    
    /**
      * Get test slowness threshold.
      */
    def slow(): Double = js.native
    /**
      * Set test slowness threshold.
      */
    def slow(ms: String): this.type = js.native
    def slow(ms: Double): this.type = js.native
    
    var test: js.UndefOr[Runnable] = js.native
    
    /**
      * Get test timeout.
      */
    def timeout(): Double = js.native
    /**
      * Set test timeout.
      */
    def timeout(ms: String): this.type = js.native
    def timeout(ms: Double): this.type = js.native
  }
  
  type Done = js.Function1[/* err */ js.UndefOr[Any], Unit]
  
  @js.native
  trait ExclusiveSuiteFunction extends StObject {
    
    /**
      * [qunit] Describe a "suite" with the given `title`. Indicates this suite should be executed
      * exclusively.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def apply(title: String): Suite = js.native
    /**
      * Describe a "suite" with the given `title`, TestOptions, and callback `fn` containing
      * nested suites. Indicates this suite should be executed exclusively.
      */
    def apply(title: String, config: TestConfigOverrides, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite = js.native
    /**
      * [bdd, tdd] Describe a "suite" with the given `title` and callback `fn` containing
      * nested suites. Indicates this suite should be executed exclusively.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def apply(title: String, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite = js.native
  }
  
  @js.native
  trait ExclusiveTestFunction extends StObject {
    
    /**
      * [bdd, tdd, qunit] Describe a specification or test-case with the given callback `fn`
      * acting as a thunk. The name of the function is used as the name of the test. Indicates
      * this test should be executed exclusively.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def apply(fn: AsyncFunc): Test = js.native
    /**
      * [bdd, tdd, qunit] Describe a specification or test-case with the given callback `fn`
      * acting as a thunk. The name of the function is used as the name of the test. Indicates
      * this test should be executed exclusively.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def apply(fn: Func): Test = js.native
    /**
      * [bdd, tdd, qunit] Describe a specification or test-case with the given `title` and
      * callback `fn` acting as a thunk. Indicates this test should be executed exclusively.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def apply(title: String): Test = js.native
    /**
      * Describe a specification or test-case with the given `title`, TestOptions, and callback `fn` acting
      * as a thunk.
      */
    def apply(title: String, config: TestConfigOverrides): Test = js.native
    def apply(title: String, config: TestConfigOverrides, fn: AsyncFunc): Test = js.native
    def apply(title: String, config: TestConfigOverrides, fn: Func): Test = js.native
    def apply(title: String, fn: AsyncFunc): Test = js.native
    def apply(title: String, fn: Func): Test = js.native
  }
  
  /**
    * Callback function used for tests and hooks.
    */
  type Func = js.ThisFunction1[/* this */ Context, /* done */ Done, Unit]
  
  // #endregion Runner untyped events
  /**
    * Initialize a new `Hook` with the given `title` and callback `fn`
    *
    * @see https://mochajs.org/api/Hook.html
    */
  @js.native
  trait Hook
    extends StObject
       with Runnable {
    
    /* private */ var _error: Any = js.native
    
    // added by Runner
    /**
      * Get the test `err`.
      *
      * @see https://mochajs.org/api/Hook.html#error
      */
    def error(): Any = js.native
    /**
      * Set the test `err`.
      *
      * @see https://mochajs.org/api/Hook.html#error
      */
    def error(err: Any): Unit = js.native
    
    var originalTitle: js.UndefOr[String] = js.native
    
    var `type`: hook = js.native
  }
  
  // #region Test interface augmentations
  @js.native
  trait HookFunction extends StObject {
    
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
      * function is used as the name of the hook.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def apply(fn: AsyncFunc): Unit = js.native
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
      * function is used as the name of the hook.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def apply(fn: Func): Unit = js.native
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given `title` and callback `fn`.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def apply(name: String): Unit = js.native
    def apply(name: String, fn: AsyncFunc): Unit = js.native
    def apply(name: String, fn: Func): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cypress.cypressStrings.bdd
    - typings.cypress.cypressStrings.tdd
    - typings.cypress.cypressStrings.qunit
    - typings.cypress.cypressStrings.exports
  */
  trait Interface extends StObject
  
  /**
    * Third-party declarations that want to add new entries to the `Interface` union can
    * contribute names here.
    */
  trait InterfaceContributions extends StObject
  
  /**
    * Variables added to the global scope by Mocha when run in the CLI.
    */
  trait MochaGlobals extends StObject {
    
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
      * function is used as the name of the hook.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Execute after running tests.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#after
      */
    def after(fn: AsyncFunc): Unit
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
      * function is used as the name of the hook.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Execute after running tests.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#after
      */
    def after(fn: Func): Unit
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given `title` and callback `fn`.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Execute after running tests.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#after
      */
    def after(name: String): Unit
    def after(name: String, fn: AsyncFunc): Unit
    def after(name: String, fn: Func): Unit
    
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
      * function is used as the name of the hook.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Execute after each test case.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#afterEach
      */
    def afterEach(fn: AsyncFunc): Unit
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
      * function is used as the name of the hook.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Execute after each test case.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#afterEach
      */
    def afterEach(fn: Func): Unit
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given `title` and callback `fn`.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Execute after each test case.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#afterEach
      */
    def afterEach(name: String): Unit
    def afterEach(name: String, fn: AsyncFunc): Unit
    def afterEach(name: String, fn: Func): Unit
    /**
      * Execute after each test case.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#afterEach
      */
    @JSName("afterEach")
    var afterEach_Original: HookFunction
    
    /**
      * Execute after running tests.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#after
      */
    @JSName("after")
    var after_Original: HookFunction
    
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
      * function is used as the name of the hook.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Execute before running tests.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#before
      */
    def before(fn: AsyncFunc): Unit
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
      * function is used as the name of the hook.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Execute before running tests.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#before
      */
    def before(fn: Func): Unit
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given `title` and callback `fn`.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Execute before running tests.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#before
      */
    def before(name: String): Unit
    def before(name: String, fn: AsyncFunc): Unit
    def before(name: String, fn: Func): Unit
    
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
      * function is used as the name of the hook.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Execute before each test case.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#beforeEach
      */
    def beforeEach(fn: AsyncFunc): Unit
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
      * function is used as the name of the hook.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Execute before each test case.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#beforeEach
      */
    def beforeEach(fn: Func): Unit
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given `title` and callback `fn`.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Execute before each test case.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#beforeEach
      */
    def beforeEach(name: String): Unit
    def beforeEach(name: String, fn: AsyncFunc): Unit
    def beforeEach(name: String, fn: Func): Unit
    /**
      * Execute before each test case.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#beforeEach
      */
    @JSName("beforeEach")
    var beforeEach_Original: HookFunction
    
    /**
      * Execute before running tests.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#before
      */
    @JSName("before")
    var before_Original: HookFunction
    
    /**
      * [qunit] Describe a "suite" with the given `title`.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Describe a "suite" containing nested suites and tests.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def context(title: String): Suite
    /**
      * Describe a "suite" with the given `title`, TestOptions, and callback `fn` containing
      * nested suites.
      */
    /**
      * Describe a "suite" containing nested suites and tests.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def context(title: String, config: TestConfigOverrides, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite
    /**
      * [bdd, tdd] Describe a "suite" with the given `title` and callback `fn` containing
      * nested suites.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Describe a "suite" containing nested suites and tests.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def context(title: String, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite
    /**
      * Describe a "suite" containing nested suites and tests.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    @JSName("context")
    var context_Original: SuiteFunction
    
    /**
      * [qunit] Describe a "suite" with the given `title`.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Describe a "suite" containing nested suites and tests.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def describe(title: String): Suite
    /**
      * Describe a "suite" with the given `title`, TestOptions, and callback `fn` containing
      * nested suites.
      */
    /**
      * Describe a "suite" containing nested suites and tests.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def describe(title: String, config: TestConfigOverrides, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite
    /**
      * [bdd, tdd] Describe a "suite" with the given `title` and callback `fn` containing
      * nested suites.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Describe a "suite" containing nested suites and tests.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def describe(title: String, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite
    /**
      * Describe a "suite" containing nested suites and tests.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    @JSName("describe")
    var describe_Original: SuiteFunction
    
    /**
      * Describe a specification or test-case with the given callback `fn` acting as a thunk.
      * The name of the function is used as the name of the test.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Describes a test case.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def it(fn: AsyncFunc): Test
    /**
      * Describe a specification or test-case with the given callback `fn` acting as a thunk.
      * The name of the function is used as the name of the test.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Describes a test case.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def it(fn: Func): Test
    /**
      * Describe a specification or test-case with the given `title` and callback `fn` acting
      * as a thunk.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Describes a test case.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def it(title: String): Test
    /**
      * Describe a specification or test-case with the given `title`, TestOptions, and callback `fn` acting
      * as a thunk.
      */
    /**
      * Describes a test case.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def it(title: String, config: TestConfigOverrides): Test
    def it(title: String, config: TestConfigOverrides, fn: AsyncFunc): Test
    def it(title: String, config: TestConfigOverrides, fn: Func): Test
    def it(title: String, fn: AsyncFunc): Test
    def it(title: String, fn: Func): Test
    /**
      * Describes a test case.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    @JSName("it")
    var it_Original: TestFunction
    
    def run(): Unit
    @JSName("run")
    var run_Original: js.Function0[Unit]
    
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
      * function is used as the name of the hook.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Execute before each test case.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#beforeEach
      */
    def setup(fn: AsyncFunc): Unit
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
      * function is used as the name of the hook.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Execute before each test case.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#beforeEach
      */
    def setup(fn: Func): Unit
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given `title` and callback `fn`.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Execute before each test case.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#beforeEach
      */
    def setup(name: String): Unit
    def setup(name: String, fn: AsyncFunc): Unit
    def setup(name: String, fn: Func): Unit
    /**
      * Execute before each test case.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#beforeEach
      */
    @JSName("setup")
    var setup_Original: HookFunction
    
    /**
      * Describe a specification or test-case with the given callback `fn` acting as a thunk.
      * The name of the function is used as the name of the test.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Describes a test case.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def specify(fn: AsyncFunc): Test
    /**
      * Describe a specification or test-case with the given callback `fn` acting as a thunk.
      * The name of the function is used as the name of the test.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Describes a test case.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def specify(fn: Func): Test
    /**
      * Describe a specification or test-case with the given `title` and callback `fn` acting
      * as a thunk.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Describes a test case.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def specify(title: String): Test
    /**
      * Describe a specification or test-case with the given `title`, TestOptions, and callback `fn` acting
      * as a thunk.
      */
    /**
      * Describes a test case.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def specify(title: String, config: TestConfigOverrides): Test
    def specify(title: String, config: TestConfigOverrides, fn: AsyncFunc): Test
    def specify(title: String, config: TestConfigOverrides, fn: Func): Test
    def specify(title: String, fn: AsyncFunc): Test
    def specify(title: String, fn: Func): Test
    /**
      * Describes a test case.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    @JSName("specify")
    var specify_Original: TestFunction
    
    /**
      * [qunit] Describe a "suite" with the given `title`.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Describe a "suite" containing nested suites and tests.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def suite(title: String): Suite
    /**
      * Describe a "suite" with the given `title`, TestOptions, and callback `fn` containing
      * nested suites.
      */
    /**
      * Describe a "suite" containing nested suites and tests.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def suite(title: String, config: TestConfigOverrides, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite
    /**
      * [bdd, tdd] Describe a "suite" with the given `title` and callback `fn` containing
      * nested suites.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Describe a "suite" containing nested suites and tests.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def suite(title: String, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite
    
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
      * function is used as the name of the hook.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Execute before running tests.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#before
      */
    def suiteSetup(fn: AsyncFunc): Unit
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
      * function is used as the name of the hook.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Execute before running tests.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#before
      */
    def suiteSetup(fn: Func): Unit
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given `title` and callback `fn`.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Execute before running tests.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#before
      */
    def suiteSetup(name: String): Unit
    def suiteSetup(name: String, fn: AsyncFunc): Unit
    def suiteSetup(name: String, fn: Func): Unit
    /**
      * Execute before running tests.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#before
      */
    @JSName("suiteSetup")
    var suiteSetup_Original: HookFunction
    
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
      * function is used as the name of the hook.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Execute after running tests.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#after
      */
    def suiteTeardown(fn: AsyncFunc): Unit
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
      * function is used as the name of the hook.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Execute after running tests.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#after
      */
    def suiteTeardown(fn: Func): Unit
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given `title` and callback `fn`.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Execute after running tests.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#after
      */
    def suiteTeardown(name: String): Unit
    def suiteTeardown(name: String, fn: AsyncFunc): Unit
    def suiteTeardown(name: String, fn: Func): Unit
    /**
      * Execute after running tests.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#after
      */
    @JSName("suiteTeardown")
    var suiteTeardown_Original: HookFunction
    
    /**
      * Describe a "suite" containing nested suites and tests.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    @JSName("suite")
    var suite_Original: SuiteFunction
    
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
      * function is used as the name of the hook.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Execute after each test case.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#afterEach
      */
    def teardown(fn: AsyncFunc): Unit
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
      * function is used as the name of the hook.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Execute after each test case.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#afterEach
      */
    def teardown(fn: Func): Unit
    /**
      * [bdd, qunit, tdd] Describe a "hook" to execute the given `title` and callback `fn`.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Execute after each test case.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#afterEach
      */
    def teardown(name: String): Unit
    def teardown(name: String, fn: AsyncFunc): Unit
    def teardown(name: String, fn: Func): Unit
    /**
      * Execute after each test case.
      *
      * - _Only available when invoked via the mocha CLI._
      *
      * @see https://mochajs.org/api/global.html#afterEach
      */
    @JSName("teardown")
    var teardown_Original: HookFunction
    
    /**
      * Describe a specification or test-case with the given callback `fn` acting as a thunk.
      * The name of the function is used as the name of the test.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Describes a test case.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def test(fn: AsyncFunc): Test
    /**
      * Describe a specification or test-case with the given callback `fn` acting as a thunk.
      * The name of the function is used as the name of the test.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Describes a test case.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def test(fn: Func): Test
    /**
      * Describe a specification or test-case with the given `title` and callback `fn` acting
      * as a thunk.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Describes a test case.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def test(title: String): Test
    /**
      * Describe a specification or test-case with the given `title`, TestOptions, and callback `fn` acting
      * as a thunk.
      */
    /**
      * Describes a test case.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def test(title: String, config: TestConfigOverrides): Test
    def test(title: String, config: TestConfigOverrides, fn: AsyncFunc): Test
    def test(title: String, config: TestConfigOverrides, fn: Func): Test
    def test(title: String, fn: AsyncFunc): Test
    def test(title: String, fn: Func): Test
    /**
      * Describes a test case.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    @JSName("test")
    var test_Original: TestFunction
    
    /**
      * Pending suite.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def xcontext(title: String, config: TestConfigOverrides, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite | Unit
    /**
      * Pending suite.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def xcontext(title: String, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite | Unit
    /**
      * Pending suite.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    @JSName("xcontext")
    var xcontext_Original: PendingSuiteFunction
    
    /**
      * Pending suite.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def xdescribe(title: String, config: TestConfigOverrides, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite | Unit
    /**
      * Pending suite.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def xdescribe(title: String, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite | Unit
    /**
      * Pending suite.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    @JSName("xdescribe")
    var xdescribe_Original: PendingSuiteFunction
    
    /**
      * [bdd, tdd, qunit] Describe a specification or test-case with the given callback `fn`
      * acting as a thunk. The name of the function is used as the name of the test. Indicates
      * this test should not be executed.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Describes a pending test case.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def xit(fn: AsyncFunc): Test
    /**
      * [bdd, tdd, qunit] Describe a specification or test-case with the given callback `fn`
      * acting as a thunk. The name of the function is used as the name of the test. Indicates
      * this test should not be executed.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Describes a pending test case.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def xit(fn: Func): Test
    /**
      * [bdd, tdd, qunit] Describe a specification or test-case with the given `title` and
      * callback `fn` acting as a thunk. Indicates this test should not be executed.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Describes a pending test case.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def xit(title: String): Test
    /**
      * Describe a specification or test-case with the given `title`, TestOptions, and callback `fn` acting
      * as a thunk.
      */
    /**
      * Describes a pending test case.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def xit(title: String, config: TestConfigOverrides): Test
    def xit(title: String, config: TestConfigOverrides, fn: AsyncFunc): Test
    def xit(title: String, config: TestConfigOverrides, fn: Func): Test
    def xit(title: String, fn: AsyncFunc): Test
    def xit(title: String, fn: Func): Test
    /**
      * Describes a pending test case.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    @JSName("xit")
    var xit_Original: PendingTestFunction
    
    /**
      * [bdd, tdd, qunit] Describe a specification or test-case with the given callback `fn`
      * acting as a thunk. The name of the function is used as the name of the test. Indicates
      * this test should not be executed.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Describes a pending test case.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def xspecify(fn: AsyncFunc): Test
    /**
      * [bdd, tdd, qunit] Describe a specification or test-case with the given callback `fn`
      * acting as a thunk. The name of the function is used as the name of the test. Indicates
      * this test should not be executed.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Describes a pending test case.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def xspecify(fn: Func): Test
    /**
      * [bdd, tdd, qunit] Describe a specification or test-case with the given `title` and
      * callback `fn` acting as a thunk. Indicates this test should not be executed.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Describes a pending test case.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def xspecify(title: String): Test
    /**
      * Describe a specification or test-case with the given `title`, TestOptions, and callback `fn` acting
      * as a thunk.
      */
    /**
      * Describes a pending test case.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def xspecify(title: String, config: TestConfigOverrides): Test
    def xspecify(title: String, config: TestConfigOverrides, fn: AsyncFunc): Test
    def xspecify(title: String, config: TestConfigOverrides, fn: Func): Test
    def xspecify(title: String, fn: AsyncFunc): Test
    def xspecify(title: String, fn: Func): Test
    /**
      * Describes a pending test case.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    @JSName("xspecify")
    var xspecify_Original: PendingTestFunction
  }
  object MochaGlobals {
    
    inline def apply(
      after: HookFunction,
      afterEach: HookFunction,
      before: HookFunction,
      beforeEach: HookFunction,
      context: SuiteFunction,
      describe: SuiteFunction,
      it: TestFunction,
      run: () => Unit,
      setup: HookFunction,
      specify: TestFunction,
      suite: SuiteFunction,
      suiteSetup: HookFunction,
      suiteTeardown: HookFunction,
      teardown: HookFunction,
      test: TestFunction,
      xcontext: PendingSuiteFunction,
      xdescribe: PendingSuiteFunction,
      xit: PendingTestFunction,
      xspecify: PendingTestFunction
    ): MochaGlobals = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], afterEach = afterEach.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], beforeEach = beforeEach.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], describe = describe.asInstanceOf[js.Any], it = it.asInstanceOf[js.Any], run = js.Any.fromFunction0(run), setup = setup.asInstanceOf[js.Any], specify = specify.asInstanceOf[js.Any], suite = suite.asInstanceOf[js.Any], suiteSetup = suiteSetup.asInstanceOf[js.Any], suiteTeardown = suiteTeardown.asInstanceOf[js.Any], teardown = teardown.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], xcontext = xcontext.asInstanceOf[js.Any], xdescribe = xdescribe.asInstanceOf[js.Any], xit = xit.asInstanceOf[js.Any], xspecify = xspecify.asInstanceOf[js.Any])
      __obj.asInstanceOf[MochaGlobals]
    }
    
    extension [Self <: MochaGlobals](x: Self) {
      
      inline def setAfter(value: HookFunction): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterEach(value: HookFunction): Self = StObject.set(x, "afterEach", value.asInstanceOf[js.Any])
      
      inline def setBefore(value: HookFunction): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeEach(value: HookFunction): Self = StObject.set(x, "beforeEach", value.asInstanceOf[js.Any])
      
      inline def setContext(value: SuiteFunction): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setDescribe(value: SuiteFunction): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
      
      inline def setIt(value: TestFunction): Self = StObject.set(x, "it", value.asInstanceOf[js.Any])
      
      inline def setRun(value: () => Unit): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
      
      inline def setSetup(value: HookFunction): Self = StObject.set(x, "setup", value.asInstanceOf[js.Any])
      
      inline def setSpecify(value: TestFunction): Self = StObject.set(x, "specify", value.asInstanceOf[js.Any])
      
      inline def setSuite(value: SuiteFunction): Self = StObject.set(x, "suite", value.asInstanceOf[js.Any])
      
      inline def setSuiteSetup(value: HookFunction): Self = StObject.set(x, "suiteSetup", value.asInstanceOf[js.Any])
      
      inline def setSuiteTeardown(value: HookFunction): Self = StObject.set(x, "suiteTeardown", value.asInstanceOf[js.Any])
      
      inline def setTeardown(value: HookFunction): Self = StObject.set(x, "teardown", value.asInstanceOf[js.Any])
      
      inline def setTest(value: TestFunction): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setXcontext(value: PendingSuiteFunction): Self = StObject.set(x, "xcontext", value.asInstanceOf[js.Any])
      
      inline def setXdescribe(value: PendingSuiteFunction): Self = StObject.set(x, "xdescribe", value.asInstanceOf[js.Any])
      
      inline def setXit(value: PendingTestFunction): Self = StObject.set(x, "xit", value.asInstanceOf[js.Any])
      
      inline def setXspecify(value: PendingTestFunction): Self = StObject.set(x, "xspecify", value.asInstanceOf[js.Any])
    }
  }
  
  trait MochaInstanceOptions
    extends StObject
       with MochaOptions {
    
    var files: js.UndefOr[js.Array[String]] = js.undefined
  }
  object MochaInstanceOptions {
    
    inline def apply(): MochaInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MochaInstanceOptions]
    }
    
    extension [Self <: MochaInstanceOptions](x: Self) {
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
    }
  }
  
  /**
    * Options to pass to Mocha.
    */
  trait MochaOptions extends StObject {
    
    var allowUncaught: js.UndefOr[Boolean] = js.undefined
    
    var asyncOnly: js.UndefOr[Boolean] = js.undefined
    
    /** bail on the first test failure. */
    var bail: js.UndefOr[Boolean] = js.undefined
    
    /** check for global variable leaks. */
    var checkLeaks: js.UndefOr[Boolean] = js.undefined
    
    /** Color TTY output from reporter */
    var color: js.UndefOr[Boolean] = js.undefined
    
    var delay: js.UndefOr[Boolean] = js.undefined
    
    var forbidOnly: js.UndefOr[Boolean] = js.undefined
    
    var forbidPending: js.UndefOr[Boolean] = js.undefined
    
    /** display the full stack trace on failure. */
    var fullStackTrace: js.UndefOr[Boolean] = js.undefined
    
    var fullTrace: js.UndefOr[Boolean] = js.undefined
    
    /** Array of accepted globals. */
    var globals: js.UndefOr[js.Array[String]] = js.undefined
    
    /** string or regexp to filter tests with. */
    var grep: js.UndefOr[String | js.RegExp] = js.undefined
    
    /** Enable growl support. */
    var growl: js.UndefOr[Boolean] = js.undefined
    
    /** Do not show diffs at all. */
    var hideDiff: js.UndefOr[Boolean] = js.undefined
    
    /** Use inline diffs rather than +/-. */
    var inlineDiffs: js.UndefOr[Boolean] = js.undefined
    
    /** Max number of worker processes for parallel runs */
    var jobs: js.UndefOr[Double] = js.undefined
    
    var noHighlighting: js.UndefOr[Boolean] = js.undefined
    
    /** Run job in parallel */
    var parallel: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Reporter constructor, built-in reporter name, or reporter module path. Defaults to
      * `"spec"`.
      */
    var reporter: js.UndefOr[String | ReporterConstructor] = js.undefined
    
    /** Options to pass to the reporter. */
    var reporterOptions: js.UndefOr[Any] = js.undefined
    
    /** number of times to retry failed tests. */
    var retries: js.UndefOr[Double] = js.undefined
    
    /** Assigns hooks to the root suite */
    var rootHooks: js.UndefOr[RootHookObject] = js.undefined
    
    /** milliseconds to wait before considering a test slow. */
    var slow: js.UndefOr[Double] = js.undefined
    
    /** timeout in milliseconds or time string like '1s'. */
    var timeout: js.UndefOr[Double | String] = js.undefined
    
    /** Test interfaces ("bdd", "tdd", "exports", etc.). */
    var ui: js.UndefOr[Interface] = js.undefined
  }
  object MochaOptions {
    
    inline def apply(): MochaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MochaOptions]
    }
    
    extension [Self <: MochaOptions](x: Self) {
      
      inline def setAllowUncaught(value: Boolean): Self = StObject.set(x, "allowUncaught", value.asInstanceOf[js.Any])
      
      inline def setAllowUncaughtUndefined: Self = StObject.set(x, "allowUncaught", js.undefined)
      
      inline def setAsyncOnly(value: Boolean): Self = StObject.set(x, "asyncOnly", value.asInstanceOf[js.Any])
      
      inline def setAsyncOnlyUndefined: Self = StObject.set(x, "asyncOnly", js.undefined)
      
      inline def setBail(value: Boolean): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
      
      inline def setBailUndefined: Self = StObject.set(x, "bail", js.undefined)
      
      inline def setCheckLeaks(value: Boolean): Self = StObject.set(x, "checkLeaks", value.asInstanceOf[js.Any])
      
      inline def setCheckLeaksUndefined: Self = StObject.set(x, "checkLeaks", js.undefined)
      
      inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDelay(value: Boolean): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setForbidOnly(value: Boolean): Self = StObject.set(x, "forbidOnly", value.asInstanceOf[js.Any])
      
      inline def setForbidOnlyUndefined: Self = StObject.set(x, "forbidOnly", js.undefined)
      
      inline def setForbidPending(value: Boolean): Self = StObject.set(x, "forbidPending", value.asInstanceOf[js.Any])
      
      inline def setForbidPendingUndefined: Self = StObject.set(x, "forbidPending", js.undefined)
      
      inline def setFullStackTrace(value: Boolean): Self = StObject.set(x, "fullStackTrace", value.asInstanceOf[js.Any])
      
      inline def setFullStackTraceUndefined: Self = StObject.set(x, "fullStackTrace", js.undefined)
      
      inline def setFullTrace(value: Boolean): Self = StObject.set(x, "fullTrace", value.asInstanceOf[js.Any])
      
      inline def setFullTraceUndefined: Self = StObject.set(x, "fullTrace", js.undefined)
      
      inline def setGlobals(value: js.Array[String]): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
      
      inline def setGlobalsVarargs(value: String*): Self = StObject.set(x, "globals", js.Array(value*))
      
      inline def setGrep(value: String | js.RegExp): Self = StObject.set(x, "grep", value.asInstanceOf[js.Any])
      
      inline def setGrepUndefined: Self = StObject.set(x, "grep", js.undefined)
      
      inline def setGrowl(value: Boolean): Self = StObject.set(x, "growl", value.asInstanceOf[js.Any])
      
      inline def setGrowlUndefined: Self = StObject.set(x, "growl", js.undefined)
      
      inline def setHideDiff(value: Boolean): Self = StObject.set(x, "hideDiff", value.asInstanceOf[js.Any])
      
      inline def setHideDiffUndefined: Self = StObject.set(x, "hideDiff", js.undefined)
      
      inline def setInlineDiffs(value: Boolean): Self = StObject.set(x, "inlineDiffs", value.asInstanceOf[js.Any])
      
      inline def setInlineDiffsUndefined: Self = StObject.set(x, "inlineDiffs", js.undefined)
      
      inline def setJobs(value: Double): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
      
      inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
      
      inline def setNoHighlighting(value: Boolean): Self = StObject.set(x, "noHighlighting", value.asInstanceOf[js.Any])
      
      inline def setNoHighlightingUndefined: Self = StObject.set(x, "noHighlighting", js.undefined)
      
      inline def setParallel(value: Boolean): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      inline def setReporter(value: String | ReporterConstructor): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
      
      inline def setReporterOptions(value: Any): Self = StObject.set(x, "reporterOptions", value.asInstanceOf[js.Any])
      
      inline def setReporterOptionsUndefined: Self = StObject.set(x, "reporterOptions", js.undefined)
      
      inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      inline def setRootHooks(value: RootHookObject): Self = StObject.set(x, "rootHooks", value.asInstanceOf[js.Any])
      
      inline def setRootHooksUndefined: Self = StObject.set(x, "rootHooks", js.undefined)
      
      inline def setSlow(value: Double): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
      
      inline def setSlowUndefined: Self = StObject.set(x, "slow", js.undefined)
      
      inline def setTimeout(value: Double | String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUi(value: Interface): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
      
      inline def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
    }
  }
  
  /**
    * [bdd, tdd] Describe a "suite" with the given `title` and callback `fn` containing
    * nested suites. Indicates this suite should not be executed.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @returns [bdd] `Suite`
    * @returns [tdd] `void`
    */
  @js.native
  trait PendingSuiteFunction extends StObject {
    
    def apply(title: String, config: TestConfigOverrides, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite | Unit = js.native
    def apply(title: String, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite | Unit = js.native
  }
  
  @js.native
  trait PendingTestFunction extends StObject {
    
    /**
      * [bdd, tdd, qunit] Describe a specification or test-case with the given callback `fn`
      * acting as a thunk. The name of the function is used as the name of the test. Indicates
      * this test should not be executed.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def apply(fn: AsyncFunc): Test = js.native
    /**
      * [bdd, tdd, qunit] Describe a specification or test-case with the given callback `fn`
      * acting as a thunk. The name of the function is used as the name of the test. Indicates
      * this test should not be executed.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def apply(fn: Func): Test = js.native
    /**
      * [bdd, tdd, qunit] Describe a specification or test-case with the given `title` and
      * callback `fn` acting as a thunk. Indicates this test should not be executed.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def apply(title: String): Test = js.native
    /**
      * Describe a specification or test-case with the given `title`, TestOptions, and callback `fn` acting
      * as a thunk.
      */
    def apply(title: String, config: TestConfigOverrides): Test = js.native
    def apply(title: String, config: TestConfigOverrides, fn: AsyncFunc): Test = js.native
    def apply(title: String, config: TestConfigOverrides, fn: Func): Test = js.native
    def apply(title: String, fn: AsyncFunc): Test = js.native
    def apply(title: String, fn: Func): Test = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cypress.cypressStrings.Base
    - typings.cypress.cypressStrings.base_
    - typings.cypress.cypressStrings.Dot
    - typings.cypress.cypressStrings.dot_
    - typings.cypress.cypressStrings.TAP
    - typings.cypress.cypressStrings.tap_
    - typings.cypress.cypressStrings.JSON
    - typings.cypress.cypressStrings.json_
    - typings.cypress.cypressStrings.HTML
    - typings.cypress.cypressStrings.html_
    - typings.cypress.cypressStrings.List
    - typings.cypress.cypressStrings.list_
    - typings.cypress.cypressStrings.Min
    - typings.cypress.cypressStrings.min_
    - typings.cypress.cypressStrings.Spec
    - typings.cypress.cypressStrings.spec_
    - typings.cypress.cypressStrings.Nyan
    - typings.cypress.cypressStrings.nyan_
    - typings.cypress.cypressStrings.XUnit
    - typings.cypress.cypressStrings.xunit_
    - typings.cypress.cypressStrings.Markdown
    - typings.cypress.cypressStrings.markdown_
    - typings.cypress.cypressStrings.Progress
    - typings.cypress.cypressStrings.progress_
    - typings.cypress.cypressStrings.Landing
    - typings.cypress.cypressStrings.landing_
    - typings.cypress.cypressStrings.JSONStream
    - typings.cypress.cypressStrings.`json-stream`
  */
  trait Reporter extends StObject
  
  @js.native
  trait ReporterConstructor
    extends StObject
       with Instantiable2[/* runner */ Runner, /* options */ MochaOptions, Base_]
  
  /**
    * Third-party declarations that want to add new entries to the `Reporter` union can
    * contribute names here.
    */
  trait ReporterContributions extends StObject
  
  /**
    * An alternative way to define root hooks that works with parallel runs.
    *
    * Root hooks work with any interface, but the property names do not change.
    * In other words, if you are using the tdd interface, suiteSetup maps to beforeAll, and setup maps to beforeEach.
    *
    * As with other hooks, `this` refers to to the current context object.
    *
    * @see https://mochajs.org/#root-hook-plugins
    */
  trait RootHookObject extends StObject {
    
    /**
      * In serial mode, run after all tests end, once only.
      * In parallel mode, run after all tests end, for each file.
      */
    var afterAll: js.UndefOr[Func | AsyncFunc | (js.Array[AsyncFunc | Func])] = js.undefined
    
    /**
      * In both modes, run after every test.
      */
    var afterEach: js.UndefOr[Func | AsyncFunc | (js.Array[AsyncFunc | Func])] = js.undefined
    
    /**
      * In serial mode (Mocha's default), before all tests begin, once only.
      * In parallel mode, run before all tests begin, for each file.
      */
    var beforeAll: js.UndefOr[Func | AsyncFunc | (js.Array[AsyncFunc | Func])] = js.undefined
    
    /**
      * In both modes, run before each test.
      */
    var beforeEach: js.UndefOr[Func | AsyncFunc | (js.Array[AsyncFunc | Func])] = js.undefined
  }
  object RootHookObject {
    
    inline def apply(): RootHookObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RootHookObject]
    }
    
    extension [Self <: RootHookObject](x: Self) {
      
      inline def setAfterAll(value: Func | AsyncFunc | (js.Array[AsyncFunc | Func])): Self = StObject.set(x, "afterAll", value.asInstanceOf[js.Any])
      
      inline def setAfterAllUndefined: Self = StObject.set(x, "afterAll", js.undefined)
      
      inline def setAfterAllVarargs(value: (AsyncFunc | Func)*): Self = StObject.set(x, "afterAll", js.Array(value*))
      
      inline def setAfterEach(value: Func | AsyncFunc | (js.Array[AsyncFunc | Func])): Self = StObject.set(x, "afterEach", value.asInstanceOf[js.Any])
      
      inline def setAfterEachUndefined: Self = StObject.set(x, "afterEach", js.undefined)
      
      inline def setAfterEachVarargs(value: (AsyncFunc | Func)*): Self = StObject.set(x, "afterEach", js.Array(value*))
      
      inline def setBeforeAll(value: Func | AsyncFunc | (js.Array[AsyncFunc | Func])): Self = StObject.set(x, "beforeAll", value.asInstanceOf[js.Any])
      
      inline def setBeforeAllUndefined: Self = StObject.set(x, "beforeAll", js.undefined)
      
      inline def setBeforeAllVarargs(value: (AsyncFunc | Func)*): Self = StObject.set(x, "beforeAll", js.Array(value*))
      
      inline def setBeforeEach(value: Func | AsyncFunc | (js.Array[AsyncFunc | Func])): Self = StObject.set(x, "beforeEach", value.asInstanceOf[js.Any])
      
      inline def setBeforeEachUndefined: Self = StObject.set(x, "beforeEach", js.undefined)
      
      inline def setBeforeEachVarargs(value: (AsyncFunc | Func)*): Self = StObject.set(x, "beforeEach", js.Array(value*))
    }
  }
  
  // #endregion Runnable "error" event
  // #region Runnable untyped events
  // #region Runnable "error" event
  /**
    * Initialize a new `Runnable` with the given `title` and callback `fn`.
    *
    * @see https://mochajs.org/api/Runnable.html
    */
  @js.native
  trait Runnable
    extends StObject
       with EventEmitter {
    
    /* private */ var _currentRetry: Any = js.native
    
    /* private */ var _retries: Any = js.native
    
    /* private */ var _slow: Any = js.native
    
    /* private */ var _timeout: Any = js.native
    
    /* private */ var _timeoutError: Any = js.native
    
    def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* error */ Any, Unit]): this.type = js.native
    
    var allowUncaught: js.UndefOr[Boolean] = js.native
    
    var async: Boolean = js.native
    
    var body: String = js.native
    
    var callback: js.UndefOr[Done] = js.native
    
    /**
      * Clear the timeout.
      *
      * @see https://mochajs.org/api/Runnable.html#clearTimeout
      */
    def clearTimeout(): Unit = js.native
    
    var ctx: js.UndefOr[Context] = js.native
    
    /**
      * Set or get current retry
      *
      * @see https://mochajs.org/api/Runnable.html#currentRetry
      */
    /* protected */ def currentRetry(): Double = js.native
    /**
      * Set or get current retry
      *
      * @see https://mochajs.org/api/Runnable.html#currentRetry
      */
    /* protected */ def currentRetry(n: Double): Unit = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    def emit(name: String, args: Any*): Boolean = js.native
    @JSName("emit")
    def emit_error(name: error, error: Any): Boolean = js.native
    
    var file: js.UndefOr[String] = js.native
    
    var fn: js.UndefOr[Func | AsyncFunc] = js.native
    
    /**
      * Return the full title generated by recursively concatenating the parent's full title.
      */
    def fullTitle(): String = js.native
    
    /**
      * Get a list of whitelisted globals for this test run.
      *
      * @see https://mochajs.org/api/Runnable.html#globals
      */
    def globals(): js.Array[String] = js.native
    /**
      * Set a list of whitelisted globals for this test run.
      *
      * @see https://mochajs.org/api/Runnable.html#globals
      */
    def globals(globals: js.Array[String]): Unit = js.native
    
    /**
      * Inspect the runnable void of private properties.
      *
      * @see https://mochajs.org/api/Runnable.html#inspect
      */
    def inspect(): String = js.native
    
    /**
      * Return `true` if this Runnable has failed.
      */
    def isFailed(): Boolean = js.native
    
    /**
      * Return `true` if this Runnable has passed.
      */
    def isPassed(): Boolean = js.native
    
    /**
      * Check if this runnable or its parent suite is marked as pending.
      *
      * @see https://mochajs.org/api/Runnable.html#isPending
      */
    def isPending(): Boolean = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* error */ Any, Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* error */ Any, Unit]): this.type = js.native
    
    var parent: js.UndefOr[Suite] = js.native
    
    var pending: Boolean = js.native
    
    def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* error */ Any, Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* error */ Any, Unit]): this.type = js.native
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* error */ Any, Unit]): this.type = js.native
    
    /**
      * Reset the timeout.
      *
      * @see https://mochajs.org/api/Runnable.html#resetTimeout
      */
    def resetTimeout(): Unit = js.native
    
    /**
      * Set or get number of retries.
      *
      * @see https://mochajs.org/api/Runnable.html#retries
      */
    def retries(): Double = js.native
    /**
      * Set or get number of retries.
      *
      * @see https://mochajs.org/api/Runnable.html#retries
      */
    def retries(n: Double): Unit = js.native
    
    /**
      * Run the test and invoke `fn(err)`.
      *
      * @see https://mochajs.org/api/Runnable.html#run
      */
    def run(fn: Done): Unit = js.native
    
    /**
      * Halt and mark as pending.
      */
    def skip(): scala.Nothing = js.native
    
    /**
      * Get test slowness threshold.
      *
      * @see https://mochajs.org/api/Runnable.html#slow
      */
    def slow(): Double = js.native
    /**
      * Set test slowness threshold.
      *
      * @see https://mochajs.org/api/Runnable.html#slow
      */
    def slow(ms: String): this.type = js.native
    def slow(ms: Double): this.type = js.native
    
    var state: js.UndefOr[failed | passed] = js.native
    
    var sync: Boolean = js.native
    
    var timedOut: Boolean = js.native
    
    /**
      * Get test timeout.
      *
      * @see https://mochajs.org/api/Runnable.html#timeout
      */
    def timeout(): Double = js.native
    /**
      * Set test timeout.
      *
      * @see https://mochajs.org/api/Runnable.html#timeout
      */
    def timeout(ms: String): this.type = js.native
    def timeout(ms: Double): this.type = js.native
    
    var timer: js.UndefOr[Any] = js.native
    
    var title: String = js.native
    
    /**
      * Return the title path generated by concatenating the parent's title path with the title.
      */
    def titlePath(): js.Array[String] = js.native
  }
  
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
  trait Runner
    extends StObject
       with EventEmitter {
    
    /* private */ var _abort: Any = js.native
    
    /* private */ var _defaultGrep: Any = js.native
    
    /* private */ var _delay: Any = js.native
    
    /* private */ var _globals: Any = js.native
    
    /**
      * Cleanly abort execution.
      *
      * @see https://mochajs.org/api/Mocha.Runner.html#.Runner#abort
      */
    def abort(): this.type = js.native
    
    def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_fail(event: fail, listener: js.Function2[/* test */ Test, /* err */ Any, Unit]): this.type = js.native
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
    
    var allowUncaught: js.UndefOr[Boolean] = js.native
    
    var asyncOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * Check for global variable leaks.
      *
      * @see https://mochajs.org/api/Mocha.Runner.html#checkGlobals
      */
    /* protected */ def checkGlobals(test: Test): Unit = js.native
    
    var checkLeaks: js.UndefOr[Boolean] = js.native
    
    var currentRunnable: js.UndefOr[Runnable] = js.native
    
    def emit(name: String, args: Any*): Boolean = js.native
    @JSName("emit")
    def emit_end(name: end): Boolean = js.native
    @JSName("emit")
    def emit_fail(name: fail, test: Test, err: Any): Boolean = js.native
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
    /* protected */ def fail(test: Test, err: Any): Unit = js.native
    
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
    /* protected */ def failHook(hook: Hook, err: Any): Unit = js.native
    
    var failures: Double = js.native
    
    var forbidOnly: js.UndefOr[Boolean] = js.native
    
    var forbidPending: js.UndefOr[Boolean] = js.native
    
    var fullStackTrace: js.UndefOr[Boolean] = js.native
    
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
    def grep(re: js.RegExp, invert: Boolean): this.type = js.native
    
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
    /* protected */ def hookDown(name: String, fn: js.Function2[/* err */ js.UndefOr[Any], /* errSuite */ js.UndefOr[Suite], Unit]): Unit = js.native
    
    /* private */ var hookErr: Any = js.native
    
    /**
      * Run hooks from the top level down.
      *
      * @see https://mochajs.org/api/Mocha.Runner.html#hookUp
      */
    /* protected */ def hookUp(name: String, fn: js.Function2[/* err */ js.UndefOr[Any], /* errSuite */ js.UndefOr[Suite], Unit]): Unit = js.native
    
    /**
      * Run hook `name` for the given array of `suites`
      * in order, and callback `fn(err, errSuite)`.
      *
      * @see https://mochajs.org/api/Mocha.Runner.html#hooks
      */
    /* protected */ def hooks(
      name: String,
      suites: js.Array[Suite],
      fn: js.Function2[/* err */ js.UndefOr[Any], /* errSuite */ js.UndefOr[Suite], Unit]
    ): Unit = js.native
    
    /* private */ var next: Any = js.native
    
    /* private */ var nextSuite: Any = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_fail(event: fail, listener: js.Function2[/* test */ Test, /* err */ Any, Unit]): this.type = js.native
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
    
    def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("once")
    def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_fail(event: fail, listener: js.Function2[/* test */ Test, /* err */ Any, Unit]): this.type = js.native
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
    
    def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_fail(event: fail, listener: js.Function2[/* test */ Test, /* err */ Any, Unit]): this.type = js.native
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
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_fail(event: fail, listener: js.Function2[/* test */ Test, /* err */ Any, Unit]): this.type = js.native
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
    
    /* private */ var prevGlobalsLength: Any = js.native
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_fail(event: fail, listener: js.Function2[/* test */ Test, /* err */ Any, Unit]): this.type = js.native
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
    /* protected */ def runTest(fn: Done): Any = js.native
    
    /**
      * Run tests in the given `suite` and invoke the callback `fn()` when complete.
      *
      * @see https://mochajs.org/api/Mocha.Runner.html#runTests
      */
    /* protected */ def runTests(suite: Suite, fn: js.Function1[/* errSuite */ js.UndefOr[Suite], Unit]): Unit = js.native
    
    var started: Boolean = js.native
    
    var stats: js.UndefOr[Stats] = js.native
    
    var suite: Suite = js.native
    
    var test: js.UndefOr[Test] = js.native
    
    var total: Double = js.native
    
    /**
      * Handle uncaught exceptions.
      *
      * @see https://mochajs.org/api/Mocha.Runner.html#uncaught
      */
    def uncaught(err: Any): Unit = js.native
  }
  
  trait RunnerConstants extends StObject {
    
    val EVENT_DELAY_BEGIN: waiting
    
    val EVENT_DELAY_END: ready
    
    val EVENT_HOOK_BEGIN: hook
    
    val EVENT_HOOK_END: `hook end`
    
    val EVENT_RUN_BEGIN: start
    
    val EVENT_RUN_END: end
    
    val EVENT_SUITE_BEGIN: suite
    
    val EVENT_SUITE_END: `suite end`
    
    val EVENT_TEST_BEGIN: test
    
    val EVENT_TEST_END: `test end`
    
    val EVENT_TEST_FAIL: fail
    
    val EVENT_TEST_PASS: pass
    
    val EVENT_TEST_PENDING: pending
    
    val EVENT_TEST_RETRY: retry
  }
  object RunnerConstants {
    
    inline def apply(): RunnerConstants = {
      val __obj = js.Dynamic.literal(EVENT_DELAY_BEGIN = "waiting", EVENT_DELAY_END = "ready", EVENT_HOOK_BEGIN = "hook", EVENT_HOOK_END = "hook end", EVENT_RUN_BEGIN = "start", EVENT_RUN_END = "end", EVENT_SUITE_BEGIN = "suite", EVENT_SUITE_END = "suite end", EVENT_TEST_BEGIN = "test", EVENT_TEST_END = "test end", EVENT_TEST_FAIL = "fail", EVENT_TEST_PASS = "pass", EVENT_TEST_PENDING = "pending", EVENT_TEST_RETRY = "retry")
      __obj.asInstanceOf[RunnerConstants]
    }
    
    extension [Self <: RunnerConstants](x: Self) {
      
      inline def setEVENT_DELAY_BEGIN(value: waiting): Self = StObject.set(x, "EVENT_DELAY_BEGIN", value.asInstanceOf[js.Any])
      
      inline def setEVENT_DELAY_END(value: ready): Self = StObject.set(x, "EVENT_DELAY_END", value.asInstanceOf[js.Any])
      
      inline def setEVENT_HOOK_BEGIN(value: hook): Self = StObject.set(x, "EVENT_HOOK_BEGIN", value.asInstanceOf[js.Any])
      
      inline def setEVENT_HOOK_END(value: `hook end`): Self = StObject.set(x, "EVENT_HOOK_END", value.asInstanceOf[js.Any])
      
      inline def setEVENT_RUN_BEGIN(value: start): Self = StObject.set(x, "EVENT_RUN_BEGIN", value.asInstanceOf[js.Any])
      
      inline def setEVENT_RUN_END(value: end): Self = StObject.set(x, "EVENT_RUN_END", value.asInstanceOf[js.Any])
      
      inline def setEVENT_SUITE_BEGIN(value: suite): Self = StObject.set(x, "EVENT_SUITE_BEGIN", value.asInstanceOf[js.Any])
      
      inline def setEVENT_SUITE_END(value: `suite end`): Self = StObject.set(x, "EVENT_SUITE_END", value.asInstanceOf[js.Any])
      
      inline def setEVENT_TEST_BEGIN(value: test): Self = StObject.set(x, "EVENT_TEST_BEGIN", value.asInstanceOf[js.Any])
      
      inline def setEVENT_TEST_END(value: `test end`): Self = StObject.set(x, "EVENT_TEST_END", value.asInstanceOf[js.Any])
      
      inline def setEVENT_TEST_FAIL(value: fail): Self = StObject.set(x, "EVENT_TEST_FAIL", value.asInstanceOf[js.Any])
      
      inline def setEVENT_TEST_PASS(value: pass): Self = StObject.set(x, "EVENT_TEST_PASS", value.asInstanceOf[js.Any])
      
      inline def setEVENT_TEST_PENDING(value: pending): Self = StObject.set(x, "EVENT_TEST_PENDING", value.asInstanceOf[js.Any])
      
      inline def setEVENT_TEST_RETRY(value: retry): Self = StObject.set(x, "EVENT_TEST_RETRY", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Test statistics
    */
  trait Stats extends StObject {
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var end: js.UndefOr[js.Date] = js.undefined
    
    var failures: Double
    
    var passes: Double
    
    var pending: Double
    
    var start: js.UndefOr[js.Date] = js.undefined
    
    var suites: Double
    
    var tests: Double
  }
  object Stats {
    
    inline def apply(failures: Double, passes: Double, pending: Double, suites: Double, tests: Double): Stats = {
      val __obj = js.Dynamic.literal(failures = failures.asInstanceOf[js.Any], passes = passes.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], suites = suites.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    extension [Self <: Stats](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setFailures(value: Double): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
      
      inline def setPasses(value: Double): Self = StObject.set(x, "passes", value.asInstanceOf[js.Any])
      
      inline def setPending(value: Double): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setSuites(value: Double): Self = StObject.set(x, "suites", value.asInstanceOf[js.Any])
      
      inline def setTests(value: Double): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
    }
  }
  
  // #endregion Suite "post-require" event
  // #region Suite untyped events
  // #endregion Suite "require" event
  // #region Suite "post-require" event
  // #endregion Suite "pre-require" event
  // #region Suite "require" event
  // #endregion Suite "run" event
  // #region Suite "pre-require" event
  // #endregion Suite "test" event
  // #region Suite "run" event
  // #endregion Suite "suite" event
  // #region Suite "test" event
  // #endregion Suite "afterEach" event
  // #region Suite "suite" event
  // #endregion Suite "beforeEach" event
  // #region Suite "afterEach" event
  // #endregion Suite "afterAll" event
  // #region Suite "beforeEach" event
  // #endregion Suite "beforeAll" event
  // #region Suite "afterAll" event
  // #region Suite "beforeAll" event
  /**
    * Initialize a new `Suite` with the given `title` and `ctx`.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html
    */
  @js.native
  trait Suite
    extends StObject
       with EventEmitter {
    
    /* private */ var _afterAll: Any = js.native
    
    /* private */ var _afterEach: Any = js.native
    
    /* private */ var _bail: Any = js.native
    
    /* private */ var _beforeAll: Any = js.native
    
    /* private */ var _beforeEach: Any = js.native
    
    /**
      * Generic hook-creator.
      */
    /* protected */ def _createHook(title: String): Hook = js.native
    /* protected */ def _createHook(title: String, fn: AsyncFunc): Hook = js.native
    /* protected */ def _createHook(title: String, fn: Func): Hook = js.native
    
    /* private */ var _onlySuites: Any = js.native
    
    /* private */ var _onlyTests: Any = js.native
    
    /* private */ var _retries: Any = js.native
    
    /* private */ var _slow: Any = js.native
    
    /* private */ var _timeout: Any = js.native
    
    def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_afterAll(event: afterAll, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_afterEach(event: afterEach, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_beforeAll(event: beforeAll, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_beforeEach(event: beforeEach, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_postrequire(
      event: `post-require`,
      listener: js.Function3[/* context */ MochaGlobals, /* file */ String, /* mocha */ Mocha, Unit]
    ): this.type = js.native
    @JSName("addListener")
    def addListener_prerequire(
      event: `pre-require`,
      listener: js.Function3[/* context */ MochaGlobals, /* file */ String, /* mocha */ Mocha, Unit]
    ): this.type = js.native
    @JSName("addListener")
    def addListener_require(
      event: require,
      listener: js.Function3[/* module */ Any, /* file */ String, /* mocha */ Mocha, Unit]
    ): this.type = js.native
    @JSName("addListener")
    def addListener_run(event: run, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_suite(event: suite, listener: js.Function1[/* suite */ this.type, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_test(event: test, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
    
    /**
      * Add a test `suite`.
      *
      * @see https://mochajs.org/api/Mocha.Suite.html#addSuite
      */
    def addSuite(suite: Suite): this.type = js.native
    
    /**
      * Add a `test` to this suite.
      *
      * @see https://mochajs.org/api/Mocha.Suite.html#addTest
      */
    def addTest(test: Test): this.type = js.native
    
    /**
      * Run `fn(test[, done])` after running tests.
      *
      * @see https://mochajs.org/api/Mocha.Suite.html#afterAll
      */
    def afterAll(): this.type = js.native
    def afterAll(fn: AsyncFunc): this.type = js.native
    def afterAll(fn: Func): this.type = js.native
    /**
      * Run `fn(test[, done])` after running tests.
      *
      * @see https://mochajs.org/api/Mocha.Suite.html#afterAll
      */
    def afterAll(title: String): this.type = js.native
    def afterAll(title: String, fn: AsyncFunc): this.type = js.native
    def afterAll(title: String, fn: Func): this.type = js.native
    
    /**
      * Run `fn(test[, done])` after each test case.
      *
      * @see https://mochajs.org/api/Mocha.Suite.html#afterEach
      */
    def afterEach(): this.type = js.native
    def afterEach(fn: AsyncFunc): this.type = js.native
    def afterEach(fn: Func): this.type = js.native
    /**
      * Run `fn(test[, done])` after each test case.
      *
      * @see https://mochajs.org/api/Mocha.Suite.html#afterEach
      */
    def afterEach(title: String): this.type = js.native
    def afterEach(title: String, fn: AsyncFunc): this.type = js.native
    def afterEach(title: String, fn: Func): this.type = js.native
    
    /**
      * Get whether to bail after first error.
      *
      * @see https://mochajs.org/api/Mocha.Suite.html#bail
      */
    def bail(): Boolean = js.native
    /**
      * Set whether to bail after first error.
      *
      * @see https://mochajs.org/api/Mocha.Suite.html#bail
      */
    def bail(bail: Boolean): this.type = js.native
    
    /**
      * Run `fn(test[, done])` before running tests.
      *
      * @see https://mochajs.org/api/Mocha.Suite.html#beforeAll
      */
    def beforeAll(): this.type = js.native
    def beforeAll(fn: AsyncFunc): this.type = js.native
    def beforeAll(fn: Func): this.type = js.native
    /**
      * Run `fn(test[, done])` before running tests.
      *
      * @see https://mochajs.org/api/Mocha.Suite.html#beforeAll
      */
    def beforeAll(title: String): this.type = js.native
    def beforeAll(title: String, fn: AsyncFunc): this.type = js.native
    def beforeAll(title: String, fn: Func): this.type = js.native
    
    /**
      * Run `fn(test[, done])` before each test case.
      *
      * @see https://mochajs.org/api/Mocha.Suite.html#beforeEach
      */
    def beforeEach(): this.type = js.native
    def beforeEach(fn: AsyncFunc): this.type = js.native
    def beforeEach(fn: Func): this.type = js.native
    /**
      * Run `fn(test[, done])` before each test case.
      *
      * @see https://mochajs.org/api/Mocha.Suite.html#beforeEach
      */
    def beforeEach(title: String): this.type = js.native
    def beforeEach(title: String, fn: AsyncFunc): this.type = js.native
    def beforeEach(title: String, fn: Func): this.type = js.native
    
    var ctx: Context = js.native
    
    var delayed: Boolean = js.native
    
    /**
      * Iterates through each suite recursively to find all tests. Applies a
      * function in the format `fn(test)`.
      *
      * @see https://mochajs.org/api/Mocha.Suite.html#eachTest
      */
    def eachTest(fn: js.Function1[/* test */ Test, Unit]): this.type = js.native
    
    def emit(name: String, args: Any*): Boolean = js.native
    @JSName("emit")
    def emit_afterAll(name: afterAll, hook: Hook): Boolean = js.native
    @JSName("emit")
    def emit_afterEach(name: afterEach, hook: Hook): Boolean = js.native
    @JSName("emit")
    def emit_beforeAll(name: beforeAll, hook: Hook): Boolean = js.native
    @JSName("emit")
    def emit_beforeEach(name: beforeEach, hook: Hook): Boolean = js.native
    @JSName("emit")
    def emit_postrequire(name: `post-require`, context: MochaGlobals, file: String, mocha: Mocha): Boolean = js.native
    @JSName("emit")
    def emit_prerequire(name: `pre-require`, context: MochaGlobals, file: String, mocha: Mocha): Boolean = js.native
    @JSName("emit")
    def emit_require(name: require, module: Any, file: String, mocha: Mocha): Boolean = js.native
    @JSName("emit")
    def emit_run(name: run): Boolean = js.native
    @JSName("emit")
    def emit_suite(name: suite, suite: Suite): Boolean = js.native
    @JSName("emit")
    def emit_test(name: test, test: Test): Boolean = js.native
    
    var file: js.UndefOr[String] = js.native
    
    /**
      * Return the full title generated by recursively concatenating the parent's
      * full title.
      *
      * @see https://mochajs.org/api/Mocha.Suite.html#.Suite#fullTitle
      */
    def fullTitle(): String = js.native
    
    /**
      * Check if this suite or its parent suite is marked as pending.
      *
      * @see https://mochajs.org/api/Mocha.Suite.html#isPending
      */
    def isPending(): Boolean = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_afterAll(event: afterAll, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
    @JSName("on")
    def on_afterEach(event: afterEach, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
    @JSName("on")
    def on_beforeAll(event: beforeAll, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
    @JSName("on")
    def on_beforeEach(event: beforeEach, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
    @JSName("on")
    def on_postrequire(
      event: `post-require`,
      listener: js.Function3[/* context */ MochaGlobals, /* file */ String, /* mocha */ Mocha, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_prerequire(
      event: `pre-require`,
      listener: js.Function3[/* context */ MochaGlobals, /* file */ String, /* mocha */ Mocha, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_require(
      event: require,
      listener: js.Function3[/* module */ Any, /* file */ String, /* mocha */ Mocha, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_run(event: run, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_suite(event: suite, listener: js.Function1[/* suite */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_test(event: test, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("once")
    def once_afterAll(event: afterAll, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
    @JSName("once")
    def once_afterEach(event: afterEach, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
    @JSName("once")
    def once_beforeAll(event: beforeAll, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
    @JSName("once")
    def once_beforeEach(event: beforeEach, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
    @JSName("once")
    def once_postrequire(
      event: `post-require`,
      listener: js.Function3[/* context */ MochaGlobals, /* file */ String, /* mocha */ Mocha, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_prerequire(
      event: `pre-require`,
      listener: js.Function3[/* context */ MochaGlobals, /* file */ String, /* mocha */ Mocha, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_require(
      event: require,
      listener: js.Function3[/* module */ Any, /* file */ String, /* mocha */ Mocha, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_run(event: run, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_suite(event: suite, listener: js.Function1[/* suite */ this.type, Unit]): this.type = js.native
    @JSName("once")
    def once_test(event: test, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
    
    var parent: js.UndefOr[Suite] = js.native
    
    var pending: Boolean = js.native
    
    def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_afterAll(event: afterAll, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_afterEach(event: afterEach, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_beforeAll(event: beforeAll, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_beforeEach(event: beforeEach, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_postrequire(
      event: `post-require`,
      listener: js.Function3[/* context */ MochaGlobals, /* file */ String, /* mocha */ Mocha, Unit]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_prerequire(
      event: `pre-require`,
      listener: js.Function3[/* context */ MochaGlobals, /* file */ String, /* mocha */ Mocha, Unit]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_require(
      event: require,
      listener: js.Function3[/* module */ Any, /* file */ String, /* mocha */ Mocha, Unit]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_run(event: run, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_suite(event: suite, listener: js.Function1[/* suite */ this.type, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_test(event: test, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_afterAll(event: afterAll, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_afterEach(event: afterEach, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_beforeAll(event: beforeAll, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_beforeEach(event: beforeEach, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_postrequire(
      event: `post-require`,
      listener: js.Function3[/* context */ MochaGlobals, /* file */ String, /* mocha */ Mocha, Unit]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_prerequire(
      event: `pre-require`,
      listener: js.Function3[/* context */ MochaGlobals, /* file */ String, /* mocha */ Mocha, Unit]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_require(
      event: require,
      listener: js.Function3[/* module */ Any, /* file */ String, /* mocha */ Mocha, Unit]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_run(event: run, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_suite(event: suite, listener: js.Function1[/* suite */ this.type, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_test(event: test, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_afterAll(event: afterAll, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_afterEach(event: afterEach, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_beforeAll(event: beforeAll, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_beforeEach(event: beforeEach, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_postrequire(
      event: `post-require`,
      listener: js.Function3[/* context */ MochaGlobals, /* file */ String, /* mocha */ Mocha, Unit]
    ): this.type = js.native
    @JSName("removeListener")
    def removeListener_prerequire(
      event: `pre-require`,
      listener: js.Function3[/* context */ MochaGlobals, /* file */ String, /* mocha */ Mocha, Unit]
    ): this.type = js.native
    @JSName("removeListener")
    def removeListener_require(
      event: require,
      listener: js.Function3[/* module */ Any, /* file */ String, /* mocha */ Mocha, Unit]
    ): this.type = js.native
    @JSName("removeListener")
    def removeListener_run(event: run, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_suite(event: suite, listener: js.Function1[/* suite */ this.type, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_test(event: test, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
    
    /**
      * Get number of times to retry a failed test.
      *
      * @see https://mochajs.org/api/Mocha.Suite.html#retries
      */
    def retries(): Double = js.native
    /**
      * Set number of times to retry a failed test.
      *
      * @see https://mochajs.org/api/Mocha.Suite.html#retries
      */
    def retries(n: String): this.type = js.native
    def retries(n: Double): this.type = js.native
    
    var root: Boolean = js.native
    
    /**
      * This will run the root suite if we happen to be running in delayed mode.
      *
      * @see https://mochajs.org/api/Mocha.Suite.html#run
      */
    def run(): Unit = js.native
    
    /**
      * Get slow `ms`.
      *
      * @see https://mochajs.org/api/Mocha.Suite.html#slow
      */
    def slow(): Double = js.native
    /**
      * Set slow `ms` or short-hand such as "2s".
      *
      * @see https://mochajs.org/api/Mocha.Suite.html#slow
      */
    def slow(ms: String): this.type = js.native
    def slow(ms: Double): this.type = js.native
    
    var suites: js.Array[Suite] = js.native
    
    var tests: js.Array[Test] = js.native
    
    /**
      * Get timeout `ms`.
      *
      * @see https://mochajs.org/api/Mocha.Suite.html#timeout
      */
    def timeout(): Double = js.native
    /**
      * Set timeout `ms` or short-hand such as "2s".
      *
      * @see https://mochajs.org/api/Mocha.Suite.html#timeout
      */
    def timeout(ms: String): this.type = js.native
    def timeout(ms: Double): this.type = js.native
    
    var title: String = js.native
    
    /**
      * Return the title path generated by recursively concatenating the parent's
      * title path.
      *
      * @see https://mochajs.org/api/Mocha.Suite.html#.Suite#titlePath
      */
    def titlePath(): js.Array[String] = js.native
    
    /**
      * Return the total number of tests.
      *
      * @see https://mochajs.org/api/Mocha.Suite.html#.Suite#total
      */
    def total(): Double = js.native
  }
  
  // #endregion Runner untyped events
  trait SuiteConstants extends StObject {
    
    val EVENT_FILE_POST_REQUIRE: `post-require`
    
    val EVENT_FILE_PRE_REQUIRE: `pre-require`
    
    val EVENT_FILE_REQUIRE: require
    
    val EVENT_ROOT_SUITE_RUN: run
    
    val EVENT_SUITE_ADD_HOOK_AFTER_ALL: afterAll
    
    val EVENT_SUITE_ADD_HOOK_AFTER_EACH: afterEach
    
    val EVENT_SUITE_ADD_HOOK_BEFORE_ALL: beforeAll
    
    val EVENT_SUITE_ADD_HOOK_BEFORE_EACH: beforeEach
    
    val EVENT_SUITE_ADD_SUITE: suite
    
    val EVENT_SUITE_ADD_TEST: test
    
    val HOOK_TYPE_AFTER_ALL: afterAll
    
    val HOOK_TYPE_AFTER_EACH: afterEach
    
    val HOOK_TYPE_BEFORE_ALL: beforeAll
    
    val HOOK_TYPE_BEFORE_EACH: beforeEach
  }
  object SuiteConstants {
    
    inline def apply(): SuiteConstants = {
      val __obj = js.Dynamic.literal(EVENT_FILE_POST_REQUIRE = "post-require", EVENT_FILE_PRE_REQUIRE = "pre-require", EVENT_FILE_REQUIRE = "require", EVENT_ROOT_SUITE_RUN = "run", EVENT_SUITE_ADD_HOOK_AFTER_ALL = "afterAll", EVENT_SUITE_ADD_HOOK_AFTER_EACH = "afterEach", EVENT_SUITE_ADD_HOOK_BEFORE_ALL = "beforeAll", EVENT_SUITE_ADD_HOOK_BEFORE_EACH = "beforeEach", EVENT_SUITE_ADD_SUITE = "suite", EVENT_SUITE_ADD_TEST = "test", HOOK_TYPE_AFTER_ALL = "afterAll", HOOK_TYPE_AFTER_EACH = "afterEach", HOOK_TYPE_BEFORE_ALL = "beforeAll", HOOK_TYPE_BEFORE_EACH = "beforeEach")
      __obj.asInstanceOf[SuiteConstants]
    }
    
    extension [Self <: SuiteConstants](x: Self) {
      
      inline def setEVENT_FILE_POST_REQUIRE(value: `post-require`): Self = StObject.set(x, "EVENT_FILE_POST_REQUIRE", value.asInstanceOf[js.Any])
      
      inline def setEVENT_FILE_PRE_REQUIRE(value: `pre-require`): Self = StObject.set(x, "EVENT_FILE_PRE_REQUIRE", value.asInstanceOf[js.Any])
      
      inline def setEVENT_FILE_REQUIRE(value: require): Self = StObject.set(x, "EVENT_FILE_REQUIRE", value.asInstanceOf[js.Any])
      
      inline def setEVENT_ROOT_SUITE_RUN(value: run): Self = StObject.set(x, "EVENT_ROOT_SUITE_RUN", value.asInstanceOf[js.Any])
      
      inline def setEVENT_SUITE_ADD_HOOK_AFTER_ALL(value: afterAll): Self = StObject.set(x, "EVENT_SUITE_ADD_HOOK_AFTER_ALL", value.asInstanceOf[js.Any])
      
      inline def setEVENT_SUITE_ADD_HOOK_AFTER_EACH(value: afterEach): Self = StObject.set(x, "EVENT_SUITE_ADD_HOOK_AFTER_EACH", value.asInstanceOf[js.Any])
      
      inline def setEVENT_SUITE_ADD_HOOK_BEFORE_ALL(value: beforeAll): Self = StObject.set(x, "EVENT_SUITE_ADD_HOOK_BEFORE_ALL", value.asInstanceOf[js.Any])
      
      inline def setEVENT_SUITE_ADD_HOOK_BEFORE_EACH(value: beforeEach): Self = StObject.set(x, "EVENT_SUITE_ADD_HOOK_BEFORE_EACH", value.asInstanceOf[js.Any])
      
      inline def setEVENT_SUITE_ADD_SUITE(value: suite): Self = StObject.set(x, "EVENT_SUITE_ADD_SUITE", value.asInstanceOf[js.Any])
      
      inline def setEVENT_SUITE_ADD_TEST(value: test): Self = StObject.set(x, "EVENT_SUITE_ADD_TEST", value.asInstanceOf[js.Any])
      
      inline def setHOOK_TYPE_AFTER_ALL(value: afterAll): Self = StObject.set(x, "HOOK_TYPE_AFTER_ALL", value.asInstanceOf[js.Any])
      
      inline def setHOOK_TYPE_AFTER_EACH(value: afterEach): Self = StObject.set(x, "HOOK_TYPE_AFTER_EACH", value.asInstanceOf[js.Any])
      
      inline def setHOOK_TYPE_BEFORE_ALL(value: beforeAll): Self = StObject.set(x, "HOOK_TYPE_BEFORE_ALL", value.asInstanceOf[js.Any])
      
      inline def setHOOK_TYPE_BEFORE_EACH(value: beforeEach): Self = StObject.set(x, "HOOK_TYPE_BEFORE_EACH", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SuiteFunction extends StObject {
    
    /**
      * [qunit] Describe a "suite" with the given `title`.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def apply(title: String): Suite = js.native
    /**
      * Describe a "suite" with the given `title`, TestOptions, and callback `fn` containing
      * nested suites.
      */
    def apply(title: String, config: TestConfigOverrides, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite = js.native
    /**
      * [bdd, tdd] Describe a "suite" with the given `title` and callback `fn` containing
      * nested suites.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def apply(title: String, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite = js.native
    
    /**
      * [qunit] Describe a "suite" with the given `title`. Indicates this suite should be executed
      * exclusively.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * [bdd, tdd, qunit] Indicates this suite should be executed exclusively.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def only(title: String): Suite = js.native
    /**
      * Describe a "suite" with the given `title`, TestOptions, and callback `fn` containing
      * nested suites. Indicates this suite should be executed exclusively.
      */
    /**
      * [bdd, tdd, qunit] Indicates this suite should be executed exclusively.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def only(title: String, config: TestConfigOverrides, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite = js.native
    /**
      * [bdd, tdd] Describe a "suite" with the given `title` and callback `fn` containing
      * nested suites. Indicates this suite should be executed exclusively.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * [bdd, tdd, qunit] Indicates this suite should be executed exclusively.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def only(title: String, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite = js.native
    /**
      * [bdd, tdd, qunit] Indicates this suite should be executed exclusively.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    @JSName("only")
    var only_Original: ExclusiveSuiteFunction = js.native
    
    /**
      * [bdd, tdd] Indicates this suite should not be executed.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def skip(title: String, config: TestConfigOverrides, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite | Unit = js.native
    /**
      * [bdd, tdd] Indicates this suite should not be executed.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def skip(title: String, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite | Unit = js.native
    /**
      * [bdd, tdd] Indicates this suite should not be executed.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    @JSName("skip")
    var skip_Original: PendingSuiteFunction = js.native
  }
  
  /**
    * Initialize a new `Test` with the given `title` and callback `fn`.
    *
    * @see https://mochajs.org/api/Test.html
    */
  @js.native
  trait Test
    extends StObject
       with Runnable {
    
    // added by reporters
    var err: js.UndefOr[js.Error] = js.native
    
    var speed: js.UndefOr[slow | medium | fast] = js.native
    
    var `type`: test = js.native
  }
  
  @js.native
  trait TestFunction extends StObject {
    
    /**
      * Describe a specification or test-case with the given callback `fn` acting as a thunk.
      * The name of the function is used as the name of the test.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def apply(fn: AsyncFunc): Test = js.native
    /**
      * Describe a specification or test-case with the given callback `fn` acting as a thunk.
      * The name of the function is used as the name of the test.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def apply(fn: Func): Test = js.native
    /**
      * Describe a specification or test-case with the given `title` and callback `fn` acting
      * as a thunk.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def apply(title: String): Test = js.native
    /**
      * Describe a specification or test-case with the given `title`, TestOptions, and callback `fn` acting
      * as a thunk.
      */
    def apply(title: String, config: TestConfigOverrides): Test = js.native
    def apply(title: String, config: TestConfigOverrides, fn: AsyncFunc): Test = js.native
    def apply(title: String, config: TestConfigOverrides, fn: Func): Test = js.native
    def apply(title: String, fn: AsyncFunc): Test = js.native
    def apply(title: String, fn: Func): Test = js.native
    
    /**
      * [bdd, tdd, qunit] Describe a specification or test-case with the given callback `fn`
      * acting as a thunk. The name of the function is used as the name of the test. Indicates
      * this test should be executed exclusively.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Indicates this test should be executed exclusively.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def only(fn: AsyncFunc): Test = js.native
    /**
      * [bdd, tdd, qunit] Describe a specification or test-case with the given callback `fn`
      * acting as a thunk. The name of the function is used as the name of the test. Indicates
      * this test should be executed exclusively.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Indicates this test should be executed exclusively.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def only(fn: Func): Test = js.native
    /**
      * [bdd, tdd, qunit] Describe a specification or test-case with the given `title` and
      * callback `fn` acting as a thunk. Indicates this test should be executed exclusively.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Indicates this test should be executed exclusively.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def only(title: String): Test = js.native
    /**
      * Describe a specification or test-case with the given `title`, TestOptions, and callback `fn` acting
      * as a thunk.
      */
    /**
      * Indicates this test should be executed exclusively.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def only(title: String, config: TestConfigOverrides): Test = js.native
    def only(title: String, config: TestConfigOverrides, fn: AsyncFunc): Test = js.native
    def only(title: String, config: TestConfigOverrides, fn: Func): Test = js.native
    def only(title: String, fn: AsyncFunc): Test = js.native
    def only(title: String, fn: Func): Test = js.native
    /**
      * Indicates this test should be executed exclusively.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    @JSName("only")
    var only_Original: ExclusiveTestFunction = js.native
    
    /**
      * Number of attempts to retry.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def retries(n: Double): Unit = js.native
    
    /**
      * [bdd, tdd, qunit] Describe a specification or test-case with the given callback `fn`
      * acting as a thunk. The name of the function is used as the name of the test. Indicates
      * this test should not be executed.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Indicates this test should not be executed.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def skip(fn: AsyncFunc): Test = js.native
    /**
      * [bdd, tdd, qunit] Describe a specification or test-case with the given callback `fn`
      * acting as a thunk. The name of the function is used as the name of the test. Indicates
      * this test should not be executed.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Indicates this test should not be executed.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def skip(fn: Func): Test = js.native
    /**
      * [bdd, tdd, qunit] Describe a specification or test-case with the given `title` and
      * callback `fn` acting as a thunk. Indicates this test should not be executed.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    /**
      * Indicates this test should not be executed.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def skip(title: String): Test = js.native
    /**
      * Describe a specification or test-case with the given `title`, TestOptions, and callback `fn` acting
      * as a thunk.
      */
    /**
      * Indicates this test should not be executed.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    def skip(title: String, config: TestConfigOverrides): Test = js.native
    def skip(title: String, config: TestConfigOverrides, fn: AsyncFunc): Test = js.native
    def skip(title: String, config: TestConfigOverrides, fn: Func): Test = js.native
    def skip(title: String, fn: AsyncFunc): Test = js.native
    def skip(title: String, fn: Func): Test = js.native
    /**
      * Indicates this test should not be executed.
      *
      * - _Only available when invoked via the mocha CLI._
      */
    @JSName("skip")
    var skip_Original: PendingTestFunction = js.native
  }
  
  type TestInterface = js.Function1[/* suite */ Suite, Unit]
  
  // #endregion Test interface augmentations
  object reporters {
    
    /**
      * Initialize a new `Base` reporter.
      *
      * All other reporters generally inherit from this reporter, providing stats such as test duration,
      * number of tests passed / failed, etc.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Base.html
      */
    trait Base_ extends StObject {
      
      var done: js.UndefOr[
            js.Function2[
              /* failures */ Double, 
              /* fn */ js.UndefOr[js.Function1[/* failures */ Double, Unit]], 
              Unit
            ]
          ] = js.undefined
      
      /**
        * Output common epilogue used by many of the bundled reporters.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
        */
      def epilogue(): Unit
      
      /**
        * Test failures
        */
      var failures: js.Array[Test]
      
      /**
        * The configured runner
        */
      var runner: Runner
      
      /**
        * Test run statistics
        */
      var stats: Stats
    }
    object Base_ {
      
      inline def apply(epilogue: () => Unit, failures: js.Array[Test], runner: Runner, stats: Stats): Base_ = {
        val __obj = js.Dynamic.literal(epilogue = js.Any.fromFunction0(epilogue), failures = failures.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
        __obj.asInstanceOf[Base_]
      }
      
      extension [Self <: Base_](x: Self) {
        
        inline def setDone(
          value: (/* failures */ Double, /* fn */ js.UndefOr[js.Function1[/* failures */ Double, Unit]]) => Unit
        ): Self = StObject.set(x, "done", js.Any.fromFunction2(value))
        
        inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
        
        inline def setEpilogue(value: () => Unit): Self = StObject.set(x, "epilogue", js.Any.fromFunction0(value))
        
        inline def setFailures(value: js.Array[Test]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
        
        inline def setFailuresVarargs(value: Test*): Self = StObject.set(x, "failures", js.Array(value*))
        
        inline def setRunner(value: Runner): Self = StObject.set(x, "runner", value.asInstanceOf[js.Any])
        
        inline def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      }
      
      /**
        * Default color map
        *
        * @see https://mochajs.org/api/module-base#.colors
        */
      trait ColorMap
        extends StObject
           with /* key */ StringDictionary[Double] {
        
        var `bright fail`: Double
        
        var `bright pass`: Double
        
        var `bright yellow`: Double
        
        var checkmark: Double
        
        var `diff added`: Double
        
        var `diff gutter`: Double
        
        var `diff removed`: Double
        
        var `error message`: Double
        
        var `error stack`: Double
        
        var `error title`: Double
        
        var fail: Double
        
        var fast: Double
        
        var green: Double
        
        var light: Double
        
        var medium: Double
        
        // added by Base
        var pass: Double
        
        var pending: Double
        
        // added by Landing
        var plane: Double
        
        var `plane crash`: Double
        
        // added by Progress
        var progress: Double
        
        var runway: Double
        
        var slow: Double
        
        var suite: Double
      }
      object ColorMap {
        
        inline def apply(
          `bright fail`: Double,
          `bright pass`: Double,
          `bright yellow`: Double,
          checkmark: Double,
          `diff added`: Double,
          `diff gutter`: Double,
          `diff removed`: Double,
          `error message`: Double,
          `error stack`: Double,
          `error title`: Double,
          fail: Double,
          fast: Double,
          green: Double,
          light: Double,
          medium: Double,
          pass: Double,
          pending: Double,
          plane: Double,
          `plane crash`: Double,
          progress: Double,
          runway: Double,
          slow: Double,
          suite: Double
        ): ColorMap = {
          val __obj = js.Dynamic.literal(checkmark = checkmark.asInstanceOf[js.Any], fail = fail.asInstanceOf[js.Any], fast = fast.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], plane = plane.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], runway = runway.asInstanceOf[js.Any], slow = slow.asInstanceOf[js.Any], suite = suite.asInstanceOf[js.Any])
          __obj.updateDynamic("bright fail")((`bright fail`).asInstanceOf[js.Any])
          __obj.updateDynamic("bright pass")((`bright pass`).asInstanceOf[js.Any])
          __obj.updateDynamic("bright yellow")((`bright yellow`).asInstanceOf[js.Any])
          __obj.updateDynamic("diff added")((`diff added`).asInstanceOf[js.Any])
          __obj.updateDynamic("diff gutter")((`diff gutter`).asInstanceOf[js.Any])
          __obj.updateDynamic("diff removed")((`diff removed`).asInstanceOf[js.Any])
          __obj.updateDynamic("error message")((`error message`).asInstanceOf[js.Any])
          __obj.updateDynamic("error stack")((`error stack`).asInstanceOf[js.Any])
          __obj.updateDynamic("error title")((`error title`).asInstanceOf[js.Any])
          __obj.updateDynamic("plane crash")((`plane crash`).asInstanceOf[js.Any])
          __obj.asInstanceOf[ColorMap]
        }
        
        extension [Self <: ColorMap](x: Self) {
          
          inline def `setBright fail`(value: Double): Self = StObject.set(x, "bright fail", value.asInstanceOf[js.Any])
          
          inline def `setBright pass`(value: Double): Self = StObject.set(x, "bright pass", value.asInstanceOf[js.Any])
          
          inline def `setBright yellow`(value: Double): Self = StObject.set(x, "bright yellow", value.asInstanceOf[js.Any])
          
          inline def setCheckmark(value: Double): Self = StObject.set(x, "checkmark", value.asInstanceOf[js.Any])
          
          inline def `setDiff added`(value: Double): Self = StObject.set(x, "diff added", value.asInstanceOf[js.Any])
          
          inline def `setDiff gutter`(value: Double): Self = StObject.set(x, "diff gutter", value.asInstanceOf[js.Any])
          
          inline def `setDiff removed`(value: Double): Self = StObject.set(x, "diff removed", value.asInstanceOf[js.Any])
          
          inline def `setError message`(value: Double): Self = StObject.set(x, "error message", value.asInstanceOf[js.Any])
          
          inline def `setError stack`(value: Double): Self = StObject.set(x, "error stack", value.asInstanceOf[js.Any])
          
          inline def `setError title`(value: Double): Self = StObject.set(x, "error title", value.asInstanceOf[js.Any])
          
          inline def setFail(value: Double): Self = StObject.set(x, "fail", value.asInstanceOf[js.Any])
          
          inline def setFast(value: Double): Self = StObject.set(x, "fast", value.asInstanceOf[js.Any])
          
          inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
          
          inline def setLight(value: Double): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
          
          inline def setMedium(value: Double): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
          
          inline def setPass(value: Double): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
          
          inline def setPending(value: Double): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
          
          inline def setPlane(value: Double): Self = StObject.set(x, "plane", value.asInstanceOf[js.Any])
          
          inline def `setPlane crash`(value: Double): Self = StObject.set(x, "plane crash", value.asInstanceOf[js.Any])
          
          inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
          
          inline def setRunway(value: Double): Self = StObject.set(x, "runway", value.asInstanceOf[js.Any])
          
          inline def setSlow(value: Double): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
          
          inline def setSuite(value: Double): Self = StObject.set(x, "suite", value.asInstanceOf[js.Any])
        }
      }
      
      /**
        * Default symbol map
        *
        * @see https://mochajs.org/api/module-base#.symbols
        */
      trait SymbolMap
        extends StObject
           with /* key */ StringDictionary[String] {
        
        var bang: String
        
        var comma: String
        
        var dot: String
        
        var err: String
        
        var ok: String
      }
      object SymbolMap {
        
        inline def apply(bang: String, comma: String, dot: String, err: String, ok: String): SymbolMap = {
          val __obj = js.Dynamic.literal(bang = bang.asInstanceOf[js.Any], comma = comma.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], err = err.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
          __obj.asInstanceOf[SymbolMap]
        }
        
        extension [Self <: SymbolMap](x: Self) {
          
          inline def setBang(value: String): Self = StObject.set(x, "bang", value.asInstanceOf[js.Any])
          
          inline def setComma(value: String): Self = StObject.set(x, "comma", value.asInstanceOf[js.Any])
          
          inline def setDot(value: String): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
          
          inline def setErr(value: String): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
          
          inline def setOk(value: String): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
        }
      }
    }
    
    /**
      * Initialize a new `Doc` reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Doc.html
      */
    type Doc_ = Base_
    
    /**
      * Initialize a new `Dot` matrix test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Dot.html
      */
    type Dot_ = Base_
    
    /**
      * Initialize a new `HTML` reporter.
      *
      * - _This reporter cannot be used on the console._
      *
      * @see https://mochajs.org/api/Mocha.reporters.HTML.html
      */
    trait HTML_
      extends StObject
         with Base_ {
      
      /**
        * Adds code toggle functionality for the provided test's list element.
        *
        * @see https://mochajs.org/api/Mocha.reporters.HTML.html#addCodeToggle
        */
      def addCodeToggle(el: HTMLLIElement, contents: String): Unit
      
      /**
        * Provide suite URL.
        *
        * @see https://mochajs.org/api/Mocha.reporters.HTML.html#suiteURL
        */
      def suiteURL(suite: Suite): String
      
      /**
        * Provide test URL.
        *
        * @see https://mochajs.org/api/Mocha.reporters.HTML.html#testURL
        */
      def testURL(test: Test): String
    }
    object HTML_ {
      
      inline def apply(
        addCodeToggle: (HTMLLIElement, String) => Unit,
        epilogue: () => Unit,
        failures: js.Array[Test],
        runner: Runner,
        stats: Stats,
        suiteURL: Suite => String,
        testURL: Test => String
      ): HTML_ = {
        val __obj = js.Dynamic.literal(addCodeToggle = js.Any.fromFunction2(addCodeToggle), epilogue = js.Any.fromFunction0(epilogue), failures = failures.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], suiteURL = js.Any.fromFunction1(suiteURL), testURL = js.Any.fromFunction1(testURL))
        __obj.asInstanceOf[HTML_]
      }
      
      extension [Self <: HTML_](x: Self) {
        
        inline def setAddCodeToggle(value: (HTMLLIElement, String) => Unit): Self = StObject.set(x, "addCodeToggle", js.Any.fromFunction2(value))
        
        inline def setSuiteURL(value: Suite => String): Self = StObject.set(x, "suiteURL", js.Any.fromFunction1(value))
        
        inline def setTestURL(value: Test => String): Self = StObject.set(x, "testURL", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * Initialize a new `JSONStream` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.JSONStream.html
      */
    type JSONStream = Base_
    
    /**
      * Initialize a new `JSON` reporter
      *
      * @see https://mochajs.org/api/Mocha.reporters.JSON.html
      */
    type JSON_ = Base_
    
    /**
      * Initialize a new `Landing` reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Landing.html
      */
    type Landing_ = Base_
    
    /**
      * Initialize a new `List` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.List.html
      */
    type List_ = Base_
    
    /**
      * Initialize a new `Markdown` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Markdown.html
      */
    type Markdown_ = Base_
    
    /**
      * Initialize a new `Min` minimal test reporter (best used with --watch).
      *
      * @see https://mochajs.org/api/Mocha.reporters.Min.html
      */
    type Min = Base_
    
    /**
      * Initialize a new `NyanCat` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Nyan.html
      */
    trait Nyan_
      extends StObject
         with Base_ {
      
      /* private */ var appendRainbow: Any
      
      /* private */ var colorIndex: Any
      
      /* private */ var cursorDown: Any
      
      /* private */ var cursorUp: Any
      
      /* private */ var draw: Any
      
      /* private */ var drawNyanCat: Any
      
      /* private */ var drawRainbow: Any
      
      /* private */ var drawScoreboard: Any
      
      /* private */ var face: Any
      
      /* private */ var generateColors: Any
      
      /* private */ var numberOfLines: Any
      
      /* private */ var rainbowColors: Any
      
      /* private */ var rainbowify: Any
      
      /* private */ var scoreboardWidth: Any
      
      /* private */ var tick: Any
      
      /* private */ var trajectories: Any
      
      /* private */ var trajectoryWidthMax: Any
    }
    object Nyan_ {
      
      inline def apply(
        appendRainbow: Any,
        colorIndex: Any,
        cursorDown: Any,
        cursorUp: Any,
        draw: Any,
        drawNyanCat: Any,
        drawRainbow: Any,
        drawScoreboard: Any,
        epilogue: () => Unit,
        face: Any,
        failures: js.Array[Test],
        generateColors: Any,
        numberOfLines: Any,
        rainbowColors: Any,
        rainbowify: Any,
        runner: Runner,
        scoreboardWidth: Any,
        stats: Stats,
        tick: Any,
        trajectories: Any,
        trajectoryWidthMax: Any
      ): Nyan_ = {
        val __obj = js.Dynamic.literal(appendRainbow = appendRainbow.asInstanceOf[js.Any], colorIndex = colorIndex.asInstanceOf[js.Any], cursorDown = cursorDown.asInstanceOf[js.Any], cursorUp = cursorUp.asInstanceOf[js.Any], draw = draw.asInstanceOf[js.Any], drawNyanCat = drawNyanCat.asInstanceOf[js.Any], drawRainbow = drawRainbow.asInstanceOf[js.Any], drawScoreboard = drawScoreboard.asInstanceOf[js.Any], epilogue = js.Any.fromFunction0(epilogue), face = face.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], generateColors = generateColors.asInstanceOf[js.Any], numberOfLines = numberOfLines.asInstanceOf[js.Any], rainbowColors = rainbowColors.asInstanceOf[js.Any], rainbowify = rainbowify.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], scoreboardWidth = scoreboardWidth.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], tick = tick.asInstanceOf[js.Any], trajectories = trajectories.asInstanceOf[js.Any], trajectoryWidthMax = trajectoryWidthMax.asInstanceOf[js.Any])
        __obj.asInstanceOf[Nyan_]
      }
      
      extension [Self <: Nyan_](x: Self) {
        
        inline def setAppendRainbow(value: Any): Self = StObject.set(x, "appendRainbow", value.asInstanceOf[js.Any])
        
        inline def setColorIndex(value: Any): Self = StObject.set(x, "colorIndex", value.asInstanceOf[js.Any])
        
        inline def setCursorDown(value: Any): Self = StObject.set(x, "cursorDown", value.asInstanceOf[js.Any])
        
        inline def setCursorUp(value: Any): Self = StObject.set(x, "cursorUp", value.asInstanceOf[js.Any])
        
        inline def setDraw(value: Any): Self = StObject.set(x, "draw", value.asInstanceOf[js.Any])
        
        inline def setDrawNyanCat(value: Any): Self = StObject.set(x, "drawNyanCat", value.asInstanceOf[js.Any])
        
        inline def setDrawRainbow(value: Any): Self = StObject.set(x, "drawRainbow", value.asInstanceOf[js.Any])
        
        inline def setDrawScoreboard(value: Any): Self = StObject.set(x, "drawScoreboard", value.asInstanceOf[js.Any])
        
        inline def setFace(value: Any): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
        
        inline def setGenerateColors(value: Any): Self = StObject.set(x, "generateColors", value.asInstanceOf[js.Any])
        
        inline def setNumberOfLines(value: Any): Self = StObject.set(x, "numberOfLines", value.asInstanceOf[js.Any])
        
        inline def setRainbowColors(value: Any): Self = StObject.set(x, "rainbowColors", value.asInstanceOf[js.Any])
        
        inline def setRainbowify(value: Any): Self = StObject.set(x, "rainbowify", value.asInstanceOf[js.Any])
        
        inline def setScoreboardWidth(value: Any): Self = StObject.set(x, "scoreboardWidth", value.asInstanceOf[js.Any])
        
        inline def setTick(value: Any): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
        
        inline def setTrajectories(value: Any): Self = StObject.set(x, "trajectories", value.asInstanceOf[js.Any])
        
        inline def setTrajectoryWidthMax(value: Any): Self = StObject.set(x, "trajectoryWidthMax", value.asInstanceOf[js.Any])
      }
    }
    
    object Progress_ {
      
      trait MochaOptions
        extends StObject
           with typings.cypress.Mocha.MochaOptions
      object MochaOptions {
        
        inline def apply(): typings.cypress.Mocha.reporters.Progress_.MochaOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.cypress.Mocha.reporters.Progress_.MochaOptions]
        }
      }
      
      trait ReporterOptions extends StObject {
        
        var close: js.UndefOr[String] = js.undefined
        
        var complete: js.UndefOr[String] = js.undefined
        
        var incomplete: js.UndefOr[String] = js.undefined
        
        var open: js.UndefOr[String] = js.undefined
        
        var verbose: js.UndefOr[Boolean] = js.undefined
      }
      object ReporterOptions {
        
        inline def apply(): ReporterOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ReporterOptions]
        }
        
        extension [Self <: ReporterOptions](x: Self) {
          
          inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
          
          inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
          
          inline def setComplete(value: String): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
          
          inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
          
          inline def setIncomplete(value: String): Self = StObject.set(x, "incomplete", value.asInstanceOf[js.Any])
          
          inline def setIncompleteUndefined: Self = StObject.set(x, "incomplete", js.undefined)
          
          inline def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
          
          inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
          
          inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
          
          inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
        }
      }
    }
    /**
      * Initialize a new `Progress` bar test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Progress.html
      */
    type Progress_ = Base_
    
    /**
      * Initialize a new `Spec` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Spec.html
      */
    type Spec_ = Base_
    
    /**
      * Initialize a new `TAP` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.TAP.html
      */
    type TAP_ = Base_
    
    /**
      * Initialize a new `XUnit` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.XUnit.html
      */
    trait XUnit_
      extends StObject
         with Base_ {
      
      /**
        * Override done to close the stream (if it's a file).
        *
        * @see https://mochajs.org/api/Mocha.reporters.XUnit.html#done
        */
      @JSName("done")
      def done_MXUnit_(failures: Double, fn: js.Function1[/* failures */ Double, Unit]): Unit
      
      /**
        * Output tag for the given `test.`
        *
        * @see https://mochajs.org/api/Mocha.reporters.XUnit.html#test
        */
      def test(test: Test): Unit
      
      /**
        * Write out the given line.
        *
        * @see https://mochajs.org/api/Mocha.reporters.XUnit.html#write
        */
      def write(line: String): Unit
    }
    object XUnit_ {
      
      inline def apply(
        done: (Double, js.Function1[/* failures */ Double, Unit]) => Unit,
        epilogue: () => Unit,
        failures: js.Array[Test],
        runner: Runner,
        stats: Stats,
        test: Test => Unit,
        write: String => Unit
      ): XUnit_ = {
        val __obj = js.Dynamic.literal(done = js.Any.fromFunction2(done), epilogue = js.Any.fromFunction0(epilogue), failures = failures.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], test = js.Any.fromFunction1(test), write = js.Any.fromFunction1(write))
        __obj.asInstanceOf[XUnit_]
      }
      
      trait MochaOptions
        extends StObject
           with typings.cypress.Mocha.MochaOptions
      object MochaOptions {
        
        inline def apply(): typings.cypress.Mocha.reporters.XUnit_.MochaOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.cypress.Mocha.reporters.XUnit_.MochaOptions]
        }
      }
      
      trait ReporterOptions extends StObject {
        
        var output: js.UndefOr[String] = js.undefined
        
        var suiteName: js.UndefOr[String] = js.undefined
      }
      object ReporterOptions {
        
        inline def apply(): ReporterOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ReporterOptions]
        }
        
        extension [Self <: ReporterOptions](x: Self) {
          
          inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
          
          inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
          
          inline def setSuiteName(value: String): Self = StObject.set(x, "suiteName", value.asInstanceOf[js.Any])
          
          inline def setSuiteNameUndefined: Self = StObject.set(x, "suiteName", js.undefined)
        }
      }
      
      extension [Self <: XUnit_](x: Self) {
        
        inline def setDone(value: (Double, js.Function1[/* failures */ Double, Unit]) => Unit): Self = StObject.set(x, "done", js.Any.fromFunction2(value))
        
        inline def setTest(value: Test => Unit): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
        
        inline def setWrite(value: String => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * Initialize a new `Base` reporter.
      *
      * All other reporters generally inherit from this reporter, providing stats such as test duration,
      * number of tests passed / failed, etc.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Base.html
      */
    /* was `typeof Base` */
    type base = Base_
    
    /**
      * Initialize a new `Doc` reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Doc.html
      */
    /* was `typeof Doc` */
    type doc = Doc_
    
    /**
      * Initialize a new `Dot` matrix test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Dot.html
      */
    /* was `typeof Dot` */
    type dot = Dot_
    
    /**
      * Initialize a new `HTML` reporter.
      *
      * - _This reporter cannot be used on the console._
      *
      * @see https://mochajs.org/api/Mocha.reporters.HTML.html
      */
    /* was `typeof HTML` */
    type html = HTML_
    
    /**
      * Initialize a new `JSON` reporter
      *
      * @see https://mochajs.org/api/Mocha.reporters.JSON.html
      */
    /* was `typeof JSON` */
    type json = JSON_
    
    /**
      * Initialize a new `Landing` reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Landing.html
      */
    /* was `typeof Landing` */
    type landing = Landing_
    
    /**
      * Initialize a new `List` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.List.html
      */
    /* was `typeof List` */
    type list = List_
    
    /**
      * Initialize a new `Markdown` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Markdown.html
      */
    /* was `typeof Markdown` */
    type markdown = Markdown_
    
    /**
      * Initialize a new `NyanCat` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Nyan.html
      */
    /* was `typeof Nyan` */
    type nyan = Nyan_
    
    /**
      * Initialize a new `Progress` bar test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Progress.html
      */
    /* was `typeof Progress` */
    type progress = Progress_
    
    /**
      * Initialize a new `Spec` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Spec.html
      */
    /* was `typeof Spec` */
    type spec = Spec_
    
    /**
      * Initialize a new `TAP` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.TAP.html
      */
    /* was `typeof TAP` */
    type tap = TAP_
    
    /**
      * Initialize a new `XUnit` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.XUnit.html
      */
    /* was `typeof XUnit` */
    type xunit = XUnit_
  }
}
