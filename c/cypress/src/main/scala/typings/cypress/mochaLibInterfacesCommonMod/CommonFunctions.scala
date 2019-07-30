package typings.cypress.mochaLibInterfacesCommonMod

import typings.cypress.MochaNs.AsyncFunc
import typings.cypress.MochaNs.Func
import typings.cypress.MochaNs.Suite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonFunctions extends js.Object {
  var suite: SuiteFunctions = js.native
  var test: TestFunctions = js.native
  /**
    * Execute after running tests.
    */
  def after(): Unit = js.native
  def after(fn: AsyncFunc): Unit = js.native
  def after(fn: Func): Unit = js.native
  /**
    * Execute after running tests.
    */
  def after(name: String): Unit = js.native
  def after(name: String, fn: AsyncFunc): Unit = js.native
  def after(name: String, fn: Func): Unit = js.native
  /**
    * Execute after each test case.
    */
  def afterEach(): Unit = js.native
  def afterEach(fn: AsyncFunc): Unit = js.native
  def afterEach(fn: Func): Unit = js.native
  /**
    * Execute after each test case.
    */
  def afterEach(name: String): Unit = js.native
  def afterEach(name: String, fn: AsyncFunc): Unit = js.native
  def afterEach(name: String, fn: Func): Unit = js.native
  /**
    * Execute before running tests.
    */
  def before(): Unit = js.native
  def before(fn: AsyncFunc): Unit = js.native
  def before(fn: Func): Unit = js.native
  /**
    * Execute before running tests.
    */
  def before(name: String): Unit = js.native
  def before(name: String, fn: AsyncFunc): Unit = js.native
  def before(name: String, fn: Func): Unit = js.native
  /**
    * Execute before each test case.
    */
  def beforeEach(): Unit = js.native
  def beforeEach(fn: AsyncFunc): Unit = js.native
  def beforeEach(fn: Func): Unit = js.native
  /**
    * Execute before each test case.
    */
  def beforeEach(name: String): Unit = js.native
  def beforeEach(name: String, fn: AsyncFunc): Unit = js.native
  def beforeEach(name: String, fn: Func): Unit = js.native
  /**
    * This is only present if flag --delay is passed into Mocha. It triggers
    * root suite execution.
    */
  def runWithSuite(suite: Suite): js.Function0[Unit] = js.native
}

