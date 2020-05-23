package typings.cypress.cypressMod

import typings.cypress.anon.Absolute
import typings.cypress.anon.Failures
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cypress test run result for a single spec.
  */
trait RunResult extends js.Object {
  var error: String | Null
  var hooks: js.Array[HookInformation]
  /**
    * Reporter name like "spec"
    */
  var reporter: String
  /**
    * This is controlled by the reporter, and Cypress cannot guarantee
    * the properties. Usually this object has suites, tests, passes, etc
    */
  var reporterStats: js.Object
  var screenshots: js.Array[ScreenshotInformation]
  var shouldUploadVideo: Boolean
  /**
    * information about the spec test file.
    */
  var spec: Absolute
  /**
    * Accurate test results collected by Cypress.
    */
  var stats: Failures
  var tests: js.Array[TestResult]
  var video: String | Null
}

object RunResult {
  @scala.inline
  def apply(
    hooks: js.Array[HookInformation],
    reporter: String,
    reporterStats: js.Object,
    screenshots: js.Array[ScreenshotInformation],
    shouldUploadVideo: Boolean,
    spec: Absolute,
    stats: Failures,
    tests: js.Array[TestResult],
    error: String = null,
    video: String = null
  ): RunResult = {
    val __obj = js.Dynamic.literal(hooks = hooks.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], reporterStats = reporterStats.asInstanceOf[js.Any], screenshots = screenshots.asInstanceOf[js.Any], shouldUploadVideo = shouldUploadVideo.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunResult]
  }
}

