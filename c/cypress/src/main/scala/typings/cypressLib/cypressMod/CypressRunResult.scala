package typings
package cypressLib.cypressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Results returned by the test run.
  */
trait CypressRunResult extends js.Object {
  var browserName: java.lang.String
  var browserPath: java.lang.String
  var browserVersion: java.lang.String
  // TODO add resolved object to the configuration
  var config: CypressConfiguration
  var cypressVersion: java.lang.String
  var endedTestsAt: dateTimeISO
  var osName: java.lang.String
  var osVersion: java.lang.String
  var runs: js.Array[RunResult]
  var startedTestsAt: dateTimeISO
  var totalDuration: ms
  var totalFailed: scala.Double
  var totalPassed: scala.Double
  var totalPending: scala.Double
  var totalSkipped: scala.Double
  var totalSuites: scala.Double
  var totalTests: scala.Double
}

object CypressRunResult {
  @scala.inline
  def apply(
    browserName: java.lang.String,
    browserPath: java.lang.String,
    browserVersion: java.lang.String,
    config: CypressConfiguration,
    cypressVersion: java.lang.String,
    endedTestsAt: dateTimeISO,
    osName: java.lang.String,
    osVersion: java.lang.String,
    runs: js.Array[RunResult],
    startedTestsAt: dateTimeISO,
    totalDuration: ms,
    totalFailed: scala.Double,
    totalPassed: scala.Double,
    totalPending: scala.Double,
    totalSkipped: scala.Double,
    totalSuites: scala.Double,
    totalTests: scala.Double
  ): CypressRunResult = {
    val __obj = js.Dynamic.literal(browserName = browserName, browserPath = browserPath, browserVersion = browserVersion, config = config, cypressVersion = cypressVersion, endedTestsAt = endedTestsAt, osName = osName, osVersion = osVersion, runs = runs, startedTestsAt = startedTestsAt, totalDuration = totalDuration, totalFailed = totalFailed, totalPassed = totalPassed, totalPending = totalPending, totalSkipped = totalSkipped, totalSuites = totalSuites, totalTests = totalTests)
  
    __obj.asInstanceOf[CypressRunResult]
  }
}

