package typings.axeDashCore.axeDashCoreMod

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

object AxeResults {
  @scala.inline
  def apply(
    inapplicable: js.Array[Result],
    incomplete: js.Array[Result],
    passes: js.Array[Result],
    testEngine: TestEngine,
    testEnvironment: TestEnvironment,
    testRunner: TestRunner,
    timestamp: String,
    toolOptions: RunOptions,
    url: String,
    violations: js.Array[Result]
  ): AxeResults = {
    val __obj = js.Dynamic.literal(inapplicable = inapplicable, incomplete = incomplete, passes = passes, testEngine = testEngine, testEnvironment = testEnvironment, testRunner = testRunner, timestamp = timestamp, toolOptions = toolOptions, url = url, violations = violations)
  
    __obj.asInstanceOf[AxeResults]
  }
}

