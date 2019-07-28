package typings.cypress

import typings.cypress.ChaiNs.AssertStatic
import typings.cypress.ChaiNs.ChaiStatic
import typings.cypress.ChaiNs.ExpectStatic
import typings.cypress.CypressNs.Chainable
import typings.cypress.MochaNs.IBeforeAndAfterContext
import typings.cypress.MochaNs.IContextDefinition
import typings.cypress.MochaNs.IHookCallbackContext
import typings.cypress.MochaNs.ITestDefinition
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
  val Cypress: typings.cypress.CypressNs.Cypress = js.native
  val assert: AssertStatic = js.native
  /* Extracted nested Instantiables into classes in chaiNs */
  val chai: ChaiStatic = js.native
  // alias for `describe`
  var context: IContextDefinition = js.native
  /**
    * Global variables `cy` added by Cypress with all API commands.
    * @see https://on.cypress.io/api
    * @example
  ```
  cy.get('button').click()
  cy.get('.result').contains('Expected text')
  ```
    */
  val cy: Chainable[js.UndefOr[scala.Nothing]] = js.native
  var describe: IContextDefinition = js.native
  // Cypress adds chai expect and assert to global
  val expect: ExpectStatic = js.native
  var it: ITestDefinition = js.native
  val jQuery: JQueryStatic = js.native
  var mocha: Mocha = js.native
  var specify: ITestDefinition = js.native
  // alias for `describe`
  var suite: IContextDefinition = js.native
  // alias for `it`
  var test: ITestDefinition = js.native
  var xdescribe: IContextDefinition = js.native
  var xit: ITestDefinition = js.native
  def after(callback: js.ThisFunction1[/* this */ IHookCallbackContext, /* done */ MochaDone, _]): Unit = js.native
  def after(
    description: String,
    callback: js.ThisFunction1[/* this */ IHookCallbackContext, /* done */ MochaDone, _]
  ): Unit = js.native
  def afterEach(callback: js.ThisFunction1[/* this */ IBeforeAndAfterContext, /* done */ MochaDone, _]): Unit = js.native
  def afterEach(
    description: String,
    callback: js.ThisFunction1[/* this */ IBeforeAndAfterContext, /* done */ MochaDone, _]
  ): Unit = js.native
  def before(callback: js.ThisFunction1[/* this */ IHookCallbackContext, /* done */ MochaDone, _]): Unit = js.native
  def before(
    description: String,
    callback: js.ThisFunction1[/* this */ IHookCallbackContext, /* done */ MochaDone, _]
  ): Unit = js.native
  def beforeEach(callback: js.ThisFunction1[/* this */ IBeforeAndAfterContext, /* done */ MochaDone, _]): Unit = js.native
  def beforeEach(
    description: String,
    callback: js.ThisFunction1[/* this */ IBeforeAndAfterContext, /* done */ MochaDone, _]
  ): Unit = js.native
  // Used with the --delay flag; see https://mochajs.org/#hooks
  def run(): Unit = js.native
  def setup(callback: js.ThisFunction1[/* this */ IBeforeAndAfterContext, /* done */ MochaDone, _]): Unit = js.native
  def suiteSetup(callback: js.ThisFunction1[/* this */ IHookCallbackContext, /* done */ MochaDone, _]): Unit = js.native
  def suiteTeardown(callback: js.ThisFunction1[/* this */ IHookCallbackContext, /* done */ MochaDone, _]): Unit = js.native
  def teardown(callback: js.ThisFunction1[/* this */ IBeforeAndAfterContext, /* done */ MochaDone, _]): Unit = js.native
}

