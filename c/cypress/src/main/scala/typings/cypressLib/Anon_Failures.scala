package typings
package cypressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Failures extends js.Object {
  var failures: scala.Double
  var passes: scala.Double
  var pending: scala.Double
  var skipped: scala.Double
  var suites: scala.Double
  var tests: scala.Double
  var wallClockDuration: cypressLib.cypressMod.ms
  var wallClockEndedAt: cypressLib.cypressMod.dateTimeISO
  var wallClockStartedAt: cypressLib.cypressMod.dateTimeISO
}

object Anon_Failures {
  @scala.inline
  def apply(
    failures: scala.Double,
    passes: scala.Double,
    pending: scala.Double,
    skipped: scala.Double,
    suites: scala.Double,
    tests: scala.Double,
    wallClockDuration: cypressLib.cypressMod.ms,
    wallClockEndedAt: cypressLib.cypressMod.dateTimeISO,
    wallClockStartedAt: cypressLib.cypressMod.dateTimeISO
  ): Anon_Failures = {
    val __obj = js.Dynamic.literal(failures = failures, passes = passes, pending = pending, skipped = skipped, suites = suites, tests = tests, wallClockDuration = wallClockDuration, wallClockEndedAt = wallClockEndedAt, wallClockStartedAt = wallClockStartedAt)
  
    __obj.asInstanceOf[Anon_Failures]
  }
}

