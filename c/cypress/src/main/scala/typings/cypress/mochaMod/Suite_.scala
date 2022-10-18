package typings.cypress.mochaMod

import typings.cypress.Mocha.Suite
import typings.cypress.Mocha.SuiteConstants
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("mocha", "Suite")
@js.native
open class Suite_ protected ()
  extends StObject
     with Suite {
  def this(title: String) = this()
  def this(title: String, parentContext: typings.cypress.Mocha.Context) = this()
}
object Suite_ {
  
  @JSImport("mocha", "Suite")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mocha", "Suite.constants")
  @js.native
  val constants: SuiteConstants = js.native
  
  /**
    * Create a new `Suite` with the given `title` and parent `Suite`. When a suite
    * with the same title is already present, that suite is returned to provide
    * nicer reporter and more flexible meta-testing.
    *
    * @see https://mochajs.org/api/mocha#.exports.create
    */
  /* static member */
  inline def create(parent: Suite, title: String): Suite = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(parent.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[Suite]
}
