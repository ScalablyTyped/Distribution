package typings
package cypressLib.cypressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cypress single test result
  */
trait TestResult extends js.Object {
  var body: java.lang.String
  /**
    * Error message if there is an error
    */
  var error: java.lang.String | scala.Null
  var failedFromHookId: hookId | scala.Null
  /**
    * Error stack string if there is an error
    */
  var stack: java.lang.String | scala.Null
  var state: java.lang.String
  var testId: cypressLib.cypressMod.testId
  var timings: js.Any
  var title: js.Array[java.lang.String]
  var videoTimestamp: ms
  var wallClockDuration: ms
  var wallClockStartedAt: dateTimeISO
}

object TestResult {
  @scala.inline
  def apply(
    body: java.lang.String,
    state: java.lang.String,
    testId: testId,
    timings: js.Any,
    title: js.Array[java.lang.String],
    videoTimestamp: ms,
    wallClockDuration: ms,
    wallClockStartedAt: dateTimeISO,
    error: java.lang.String = null,
    failedFromHookId: hookId = null,
    stack: java.lang.String = null
  ): TestResult = {
    val __obj = js.Dynamic.literal(body = body, state = state, testId = testId, timings = timings, title = title, videoTimestamp = videoTimestamp, wallClockDuration = wallClockDuration, wallClockStartedAt = wallClockStartedAt)
    if (error != null) __obj.updateDynamic("error")(error)
    if (failedFromHookId != null) __obj.updateDynamic("failedFromHookId")(failedFromHookId)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[TestResult]
  }
}

