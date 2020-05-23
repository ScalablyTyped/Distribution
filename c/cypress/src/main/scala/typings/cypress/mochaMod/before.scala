package typings.cypress.mochaMod

import org.scalablytyped.runtime.TopLevel
import typings.cypress.Mocha.HookFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Execute before running tests.
  *
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#before
  */
@JSImport("mocha", "before")
@js.native
object before extends TopLevel[HookFunction]

