package typings.axeDashCore.axeDashCoreMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxeResults extends js.Object {
  var inapplicable: js.Array[Result]
  var incomplete: js.Array[Result]
  var passes: js.Array[Result]
  var testEngine: TestEngine
  var testEnvironment: TestEnvironment
  var testRunner: TestRunner
  var timestamp: String
  var toolOptions: RunOptions
  var url: String
  var violations: js.Array[Result]
}

/**
	 * Object for axe Results
	 */
@JSImport("axe-core", "AxeResults")
@js.native
object AxeResults extends TopLevel[AxeResults]

