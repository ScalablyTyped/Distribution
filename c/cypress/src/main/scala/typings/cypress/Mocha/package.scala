package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Mocha {
  /**
    * Async callback function used for tests and hooks.
    */
  type AsyncFunc = js.ThisFunction0[/* this */ typings.cypress.Mocha.Context, js.Thenable[js.Any]]
  type Done = js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  /**
    * Callback function used for tests and hooks.
    */
  type Func = js.ThisFunction1[
    /* this */ typings.cypress.Mocha.Context, 
    /* done */ typings.cypress.Mocha.Done, 
    scala.Unit
  ]
  /** @deprecated use `Mocha.Stats` instead. */
  type IStats = typings.cypress.Mocha.Stats
  type TestInterface = js.Function1[/* suite */ typings.cypress.Mocha.Suite, scala.Unit]
}
