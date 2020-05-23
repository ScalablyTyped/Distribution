package typings.cypress.cypressMod

import typings.cypress.Cypress.ResolvedConfigOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Results returned by the test run.
  * @see https://on.cypress.io/module-api
  */
trait CypressRunResult extends js.Object {
  var browserName: String
  var browserPath: String
  var browserVersion: String
  var config: ResolvedConfigOptions
  var cypressVersion: String
  var endedTestsAt: dateTimeISO
  var osName: String
  var osVersion: String
  /**
    * If Cypress test run is being recorded, full url will be provided.
    * @see https://on.cypress.io/dashboard-introduction
    */
  var runUrl: js.UndefOr[String] = js.undefined
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
    config: ResolvedConfigOptions,
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
    totalTests: Double,
    runUrl: String = null
  ): CypressRunResult = {
    val __obj = js.Dynamic.literal(browserName = browserName.asInstanceOf[js.Any], browserPath = browserPath.asInstanceOf[js.Any], browserVersion = browserVersion.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], cypressVersion = cypressVersion.asInstanceOf[js.Any], endedTestsAt = endedTestsAt.asInstanceOf[js.Any], osName = osName.asInstanceOf[js.Any], osVersion = osVersion.asInstanceOf[js.Any], runs = runs.asInstanceOf[js.Any], startedTestsAt = startedTestsAt.asInstanceOf[js.Any], totalDuration = totalDuration.asInstanceOf[js.Any], totalFailed = totalFailed.asInstanceOf[js.Any], totalPassed = totalPassed.asInstanceOf[js.Any], totalPending = totalPending.asInstanceOf[js.Any], totalSkipped = totalSkipped.asInstanceOf[js.Any], totalSuites = totalSuites.asInstanceOf[js.Any], totalTests = totalTests.asInstanceOf[js.Any])
    if (runUrl != null) __obj.updateDynamic("runUrl")(runUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CypressRunResult]
  }
}

