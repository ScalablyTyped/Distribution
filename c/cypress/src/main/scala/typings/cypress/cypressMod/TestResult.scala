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
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], testId = testId.asInstanceOf[js.Any], timings = timings.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], videoTimestamp = videoTimestamp.asInstanceOf[js.Any], wallClockDuration = wallClockDuration.asInstanceOf[js.Any], wallClockStartedAt = wallClockStartedAt.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (failedFromHookId != null) __obj.updateDynamic("failedFromHookId")(failedFromHookId.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResult]
  }
}

