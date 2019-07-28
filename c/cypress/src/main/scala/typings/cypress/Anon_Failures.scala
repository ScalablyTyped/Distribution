package typings.cypress

import typings.cypress.cypressMod.dateTimeISO
import typings.cypress.cypressMod.ms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Failures extends js.Object {
  var failures: Double
  var passes: Double
  var pending: Double
  var skipped: Double
  var suites: Double
  var tests: Double
  var wallClockDuration: ms
  var wallClockEndedAt: dateTimeISO
  var wallClockStartedAt: dateTimeISO
}

object Anon_Failures {
  @scala.inline
  def apply(
    failures: Double,
    passes: Double,
    pending: Double,
    skipped: Double,
    suites: Double,
    tests: Double,
    wallClockDuration: ms,
    wallClockEndedAt: dateTimeISO,
    wallClockStartedAt: dateTimeISO
  ): Anon_Failures = {
    val __obj = js.Dynamic.literal(failures = failures, passes = passes, pending = pending, skipped = skipped, suites = suites, tests = tests, wallClockDuration = wallClockDuration, wallClockEndedAt = wallClockEndedAt, wallClockStartedAt = wallClockStartedAt)
  
    __obj.asInstanceOf[Anon_Failures]
  }
}

