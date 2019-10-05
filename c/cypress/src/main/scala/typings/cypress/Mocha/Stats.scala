package typings.cypress.Mocha

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Test statistics
  */
trait Stats extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var end: js.UndefOr[Date] = js.undefined
  var failures: Double
  var passes: Double
  var pending: Double
  var start: js.UndefOr[Date] = js.undefined
  var suites: Double
  var tests: Double
}

object Stats {
  @scala.inline
  def apply(
    failures: Double,
    passes: Double,
    pending: Double,
    suites: Double,
    tests: Double,
    duration: Int | Double = null,
    end: Date = null,
    start: Date = null
  ): Stats = {
    val __obj = js.Dynamic.literal(failures = failures, passes = passes, pending = pending, suites = suites, tests = tests)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Stats]
  }
}

