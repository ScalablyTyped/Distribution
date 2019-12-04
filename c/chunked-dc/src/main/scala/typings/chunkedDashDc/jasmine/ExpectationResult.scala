package typings.chunkedDashDc.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpectationResult extends Result {
  var actual: js.Any
  var expected: js.Any
  var matcherName: String
  var message: String
  var trace: Trace
  def passed(): Boolean
}

object ExpectationResult {
  @scala.inline
  def apply(
    actual: js.Any,
    expected: js.Any,
    matcherName: String,
    message: String,
    passed: () => Boolean,
    trace: Trace,
    `type`: String
  ): ExpectationResult = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], matcherName = matcherName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], passed = js.Any.fromFunction0(passed), trace = trace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpectationResult]
  }
}

