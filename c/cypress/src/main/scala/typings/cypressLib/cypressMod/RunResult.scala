package typings
package cypressLib.cypressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cypress test run result for a single spec.
  */
trait RunResult extends js.Object {
  var error: java.lang.String | scala.Null
  var hooks: js.Array[HookInformation]
  /**
    * Reporter name like "spec"
    */
  var reporter: java.lang.String
  /**
    * This is controlled by the reporter, and Cypress cannot guarantee
    * the properties. Usually this object has suites, tests, passes, etc
    */
  var reporterStats: js.Object
  var screenshots: js.Array[ScreenshotInformation]
  var shouldUploadVideo: scala.Boolean
  /**
    * information about the spec test file.
    */
  var spec: cypressLib.Anon_AbsoluteName
  /**
    * Accurate test results collected by Cypress.
    */
  var stats: cypressLib.Anon_Failures
  var tests: js.Array[TestResult]
  var video: java.lang.String | scala.Null
}

object RunResult {
  @scala.inline
  def apply(
    hooks: js.Array[HookInformation],
    reporter: java.lang.String,
    reporterStats: js.Object,
    screenshots: js.Array[ScreenshotInformation],
    shouldUploadVideo: scala.Boolean,
    spec: cypressLib.Anon_AbsoluteName,
    stats: cypressLib.Anon_Failures,
    tests: js.Array[TestResult],
    error: java.lang.String = null,
    video: java.lang.String = null
  ): RunResult = {
    val __obj = js.Dynamic.literal(hooks = hooks, reporter = reporter, reporterStats = reporterStats, screenshots = screenshots, shouldUploadVideo = shouldUploadVideo, spec = spec, stats = stats, tests = tests)
    if (error != null) __obj.updateDynamic("error")(error)
    if (video != null) __obj.updateDynamic("video")(video)
    __obj.asInstanceOf[RunResult]
  }
}

