package typings.cypress.cypressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Results returned by the test run.
  */
trait CypressRunResult extends js.Object {
  var browserName: String
  var browserPath: String
  var browserVersion: String
  // TODO add resolved object to the configuration
  var config: CypressConfiguration
  var cypressVersion: String
  var endedTestsAt: dateTimeISO
  var osName: String
  var osVersion: String
  var runs: js.Array[RunResult]
  var startedTestsAt: dateTimeISO
  var totalDuration: ms
  var totalFailed: Double
  var totalPassed: Double
  var totalPending: Double
  var totalSkipped: Double
  var totalSuites: Double
  var totalTests: Double
}

object CypressRunResult {
  @scala.inline
  def apply(
    browserName: String,
    browserPath: String,
    browserVersion: String,
    config: CypressConfiguration,
    cypressVersion: String,
    endedTestsAt: dateTimeISO,
    osName: String,
    osVersion: String,
    runs: js.Array[RunResult],
    startedTestsAt: dateTimeISO,
    totalDuration: ms,
    totalFailed: Double,
    totalPassed: Double,
    totalPending: Double,
    totalSkipped: Double,
    totalSuites: Double,
    totalTests: Double
  ): CypressRunResult = {
    val __obj = js.Dynamic.literal(browserName = browserName, browserPath = browserPath, browserVersion = browserVersion, config = config, cypressVersion = cypressVersion, endedTestsAt = endedTestsAt, osName = osName, osVersion = osVersion, runs = runs, startedTestsAt = startedTestsAt, totalDuration = totalDuration, totalFailed = totalFailed, totalPassed = totalPassed, totalPending = totalPending, totalSkipped = totalSkipped, totalSuites = totalSuites, totalTests = totalTests)
  
    __obj.asInstanceOf[CypressRunResult]
  }
}

