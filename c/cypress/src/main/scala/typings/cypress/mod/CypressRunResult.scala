package typings.cypress.mod

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
  // TODO add resolved object to the configuration
  var config: CypressConfiguration
  var cypressVersion: String
  var endedTestsAt: dateTimeISO
  /**
    * If Cypress fails to run at all (for example, if there are no spec files to run),
    * then it will set failures to 1 and will have actual error message in the
    * property "message". Check this property before checking other properties.
    *
    * @type {number}
    * @example
    ```
    const result = await cypress.run()
    if (result.failures) {
    console.error(result.message)
    process.exit(result.failures)
    }
    ```
    */
  var failures: js.UndefOr[Double] = js.undefined
  /**
    * If returned result has "failures" set, then this property gives
    * the error message.
    *
    * @type {string}
    */
  var message: js.UndefOr[String] = js.undefined
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
    totalTests: Double,
    failures: Int | Double = null,
    message: String = null,
    runUrl: String = null
  ): CypressRunResult = {
    val __obj = js.Dynamic.literal(browserName = browserName.asInstanceOf[js.Any], browserPath = browserPath.asInstanceOf[js.Any], browserVersion = browserVersion.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], cypressVersion = cypressVersion.asInstanceOf[js.Any], endedTestsAt = endedTestsAt.asInstanceOf[js.Any], osName = osName.asInstanceOf[js.Any], osVersion = osVersion.asInstanceOf[js.Any], runs = runs.asInstanceOf[js.Any], startedTestsAt = startedTestsAt.asInstanceOf[js.Any], totalDuration = totalDuration.asInstanceOf[js.Any], totalFailed = totalFailed.asInstanceOf[js.Any], totalPassed = totalPassed.asInstanceOf[js.Any], totalPending = totalPending.asInstanceOf[js.Any], totalSkipped = totalSkipped.asInstanceOf[js.Any], totalSuites = totalSuites.asInstanceOf[js.Any], totalTests = totalTests.asInstanceOf[js.Any])
    if (failures != null) __obj.updateDynamic("failures")(failures.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (runUrl != null) __obj.updateDynamic("runUrl")(runUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CypressRunResult]
  }
}

