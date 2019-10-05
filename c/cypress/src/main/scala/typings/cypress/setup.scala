package typings.cypress

import org.scalablytyped.runtime.TopLevel
import typings.cypress.Mocha.HookFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Execute before each test case.
  *
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#beforeEach
  */
@JSGlobal("setup")
@js.native
object setup extends TopLevel[HookFunction]

