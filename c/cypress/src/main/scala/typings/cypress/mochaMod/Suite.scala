package typings.cypress.mochaMod

import typings.cypress.MochaNs.IContext
import typings.cypress.MochaNs.ISuite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
// #endregion Runner untyped events
/**
  * Initialize a new `Suite` with the given `title` and `ctx`.
  *
  * @see https://mochajs.org/api/Mocha.Suite.html
  */
@JSImport("mocha", "Suite")
@js.native
class Suite protected ()
  extends typings.cypress.MochaNs.Suite {
  def this(title: String) = this()
  def this(title: String, parentContext: typings.cypress.MochaNs.Context) = this()
  def this(title: String, parentContext: IContext) = this()
}

/* static members */
@JSImport("mocha", "Suite")
@js.native
object Suite extends js.Object {
  /** @deprecated Use the overload that accepts `Mocha.Suite` instead. */
  def create(parent: ISuite, title: String): typings.cypress.MochaNs.Suite = js.native
  /**
    * Create a new `Suite` with the given `title` and parent `Suite`. When a suite
    * with the same title is already present, that suite is returned to provide
    * nicer reporter and more flexible meta-testing.
    *
    * @see https://mochajs.org/api/mocha#.exports.create
    */
  def create(parent: typings.cypress.MochaNs.Suite, title: String): typings.cypress.MochaNs.Suite = js.native
}

