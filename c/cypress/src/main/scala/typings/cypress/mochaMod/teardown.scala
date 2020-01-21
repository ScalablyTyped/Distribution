package typings.cypress.mochaMod

import org.scalablytyped.runtime.TopLevel
import typings.cypress.Mocha_.HookFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Execute after each test case.
  *
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#afterEach
  */
@JSImport("mocha", "teardown")
@js.native
object teardown extends TopLevel[HookFunction]

