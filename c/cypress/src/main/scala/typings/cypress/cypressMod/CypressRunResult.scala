package typings.cypress.cypressMod

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
    message: String = null
  ): CypressRunResult = {
    val __obj = js.Dynamic.literal(browserName = browserName, browserPath = browserPath, browserVersion = browserVersion, config = config, cypressVersion = cypressVersion, endedTestsAt = endedTestsAt, osName = osName, osVersion = osVersion, runs = runs, startedTestsAt = startedTestsAt, totalDuration = totalDuration, totalFailed = totalFailed, totalPassed = totalPassed, totalPending = totalPending, totalSkipped = totalSkipped, totalSuites = totalSuites, totalTests = totalTests)
    if (failures != null) __obj.updateDynamic("failures")(failures.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[CypressRunResult]
  }
}

