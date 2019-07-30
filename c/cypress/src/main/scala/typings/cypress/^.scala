package typings.cypress

import typings.cypress.ChaiNs.AssertStatic
import typings.cypress.ChaiNs.ChaiStatic
import typings.cypress.ChaiNs.ExpectStatic
import typings.cypress.MochaNs.HookFunction
import typings.cypress.MochaNs.PendingSuiteFunction
import typings.cypress.MochaNs.PendingTestFunction
import typings.cypress.MochaNs.SuiteFunction
import typings.cypress.MochaNs.TestFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  @JSName("$")
  val $: JQueryStatic = js.native
  /**
    * Global variable `Cypress` holds common utilities and constants.
    * @see https://on.cypress.io/api
    *
  ```
  Cypress.config("pageLoadTimeout") // => 60000
  Cypress.version // => "1.4.0"
  Cypress._ // => Lodash _
  ```
    */
  val Cypress: typings.cypress.CypressNs.Cypress = js.native
  /**
    * Execute after running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#after
    */
  var after: HookFunction = js.native
  /**
    * Execute after each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  var afterEach: HookFunction = js.native
  val assert: AssertStatic = js.native
  /**
    * Execute before running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#before
    */
  var before: HookFunction = js.native
  /**
    * Execute before each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  var beforeEach: HookFunction = js.native
  /* Extracted nested Instantiables into classes in chaiNs */
  val chai: ChaiStatic = js.native
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  var context: SuiteFunction = js.native
  /**
    * Global variables `cy` added by Cypress with all API commands.
    * @see https://on.cypress.io/api
    *
  ```
  cy.get('button').click()
  cy.get('.result').contains('Expected text')
  ```
    */
  val cy: typings.cypress.CypressNs.cy = js.native
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  var describe: SuiteFunction = js.native
  // Cypress adds chai expect and assert to global
  val expect: ExpectStatic = js.native
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  var it: TestFunction = js.native
  val jQuery: JQueryStatic = js.native
  // #endregion Reporter augmentations
  // #region Browser augmentations
  /**
    * Mocha global.
    *
    * - _Only supported in the browser._
    */
  val mocha: BrowserMocha = js.native
  /**
    * Execute before each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  var setup: HookFunction = js.native
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  var specify: TestFunction = js.native
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  var suite: SuiteFunction = js.native
  /**
    * Execute before running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#before
    */
  var suiteSetup: HookFunction = js.native
  /**
    * Execute after running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#after
    */
  var suiteTeardown: HookFunction = js.native
  /**
    * Execute after each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  var teardown: HookFunction = js.native
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  var test: TestFunction = js.native
  /**
    * Pending suite.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  var xcontext: PendingSuiteFunction = js.native
  /**
    * Pending suite.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  var xdescribe: PendingSuiteFunction = js.native
  /**
    * Describes a pending test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  var xit: PendingTestFunction = js.native
  /**
    * Describes a pending test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  var xspecify: PendingTestFunction = js.native
  // #region Test interface augmentations
  /**
    * Triggers root suite execution.
    *
    * - _Only available if flag --delay is passed into Mocha._
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#runWithSuite
    */
  def run(): Unit = js.native
}

