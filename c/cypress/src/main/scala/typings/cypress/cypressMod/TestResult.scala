package typings.cypress.cypressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cypress single test result
  */
trait TestResult extends js.Object {
  var body: String
  /**
    * Error message if there is an error
    */
  var error: String | Null
  var failedFromHookId: hookId | Null
  /**
    * Error stack string if there is an error
    */
  var stack: String | Null
  var state: String
  var testId: typings.cypress.cypressMod.testId
  var timings: js.Any
  var title: js.Array[String]
  var videoTimestamp: ms
  var wallClockDuration: ms
  var wallClockStartedAt: dateTimeISO
}

object TestResult {
  @scala.inline
  def apply(
    body: String,
    state: String,
    testId: testId,
    timings: js.Any,
    title: js.Array[String],
    videoTimestamp: ms,
    wallClockDuration: ms,
    wallClockStartedAt: dateTimeISO,
    error: String = null,
    failedFromHookId: hookId = null,
    stack: String = null
  ): TestResult = {
    val __obj = js.Dynamic.literal(body = body, state = state, testId = testId, timings = timings, title = title, videoTimestamp = videoTimestamp, wallClockDuration = wallClockDuration, wallClockStartedAt = wallClockStartedAt)
    if (error != null) __obj.updateDynamic("error")(error)
    if (failedFromHookId != null) __obj.updateDynamic("failedFromHookId")(failedFromHookId)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[TestResult]
  }
}

