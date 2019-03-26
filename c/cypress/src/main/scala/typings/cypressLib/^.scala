package typings
package cypressLib

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
    * @example
  ```
  Cypress.config("pageLoadTimeout") // => 60000
  Cypress.version // => "1.4.0"
  Cypress._ // => Lodash _
  ```
    */
  val Cypress: cypressLib.CypressNs.Cypress = js.native
  val assert: cypressLib.ChaiNs.AssertStatic = js.native
  /* Extracted nested Instantiables into classes in chaiNs */
  val chai: cypressLib.ChaiNs.ChaiStatic = js.native
  // alias for `describe`
  var context: cypressLib.MochaNs.IContextDefinition = js.native
  /**
    * Global variables `cy` added by Cypress with all API commands.
    * @see https://on.cypress.io/api
    * @example
  ```
  cy.get('button').click()
  cy.get('.result').contains('Expected text')
  ```
    */
  val cy: cypressLib.CypressNs.Chainable[js.UndefOr[scala.Nothing]] = js.native
  var describe: cypressLib.MochaNs.IContextDefinition = js.native
  // Cypress adds chai expect and assert to global
  val expect: cypressLib.ChaiNs.ExpectStatic = js.native
  var it: cypressLib.MochaNs.ITestDefinition = js.native
  val jQuery: JQueryStatic = js.native
  var mocha: Mocha = js.native
  var specify: cypressLib.MochaNs.ITestDefinition = js.native
  // alias for `describe`
  var suite: cypressLib.MochaNs.IContextDefinition = js.native
  // alias for `it`
  var test: cypressLib.MochaNs.ITestDefinition = js.native
  var xdescribe: cypressLib.MochaNs.IContextDefinition = js.native
  var xit: cypressLib.MochaNs.ITestDefinition = js.native
  def after(
    callback: js.ThisFunction1[/* this */ cypressLib.MochaNs.IHookCallbackContext, /* done */ MochaDone, _]
  ): scala.Unit = js.native
  def after(
    description: java.lang.String,
    callback: js.ThisFunction1[/* this */ cypressLib.MochaNs.IHookCallbackContext, /* done */ MochaDone, _]
  ): scala.Unit = js.native
  def afterEach(
    callback: js.ThisFunction1[/* this */ cypressLib.MochaNs.IBeforeAndAfterContext, /* done */ MochaDone, _]
  ): scala.Unit = js.native
  def afterEach(
    description: java.lang.String,
    callback: js.ThisFunction1[/* this */ cypressLib.MochaNs.IBeforeAndAfterContext, /* done */ MochaDone, _]
  ): scala.Unit = js.native
  def before(
    callback: js.ThisFunction1[/* this */ cypressLib.MochaNs.IHookCallbackContext, /* done */ MochaDone, _]
  ): scala.Unit = js.native
  def before(
    description: java.lang.String,
    callback: js.ThisFunction1[/* this */ cypressLib.MochaNs.IHookCallbackContext, /* done */ MochaDone, _]
  ): scala.Unit = js.native
  def beforeEach(
    callback: js.ThisFunction1[/* this */ cypressLib.MochaNs.IBeforeAndAfterContext, /* done */ MochaDone, _]
  ): scala.Unit = js.native
  def beforeEach(
    description: java.lang.String,
    callback: js.ThisFunction1[/* this */ cypressLib.MochaNs.IBeforeAndAfterContext, /* done */ MochaDone, _]
  ): scala.Unit = js.native
  // Used with the --delay flag; see https://mochajs.org/#hooks
  def run(): scala.Unit = js.native
  def setup(
    callback: js.ThisFunction1[/* this */ cypressLib.MochaNs.IBeforeAndAfterContext, /* done */ MochaDone, _]
  ): scala.Unit = js.native
  def suiteSetup(
    callback: js.ThisFunction1[/* this */ cypressLib.MochaNs.IHookCallbackContext, /* done */ MochaDone, _]
  ): scala.Unit = js.native
  def suiteTeardown(
    callback: js.ThisFunction1[/* this */ cypressLib.MochaNs.IHookCallbackContext, /* done */ MochaDone, _]
  ): scala.Unit = js.native
  def teardown(
    callback: js.ThisFunction1[/* this */ cypressLib.MochaNs.IBeforeAndAfterContext, /* done */ MochaDone, _]
  ): scala.Unit = js.native
}

