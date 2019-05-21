package typings
package cypressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailuresPasses extends js.Object {
  var failures: scala.Double
  var passes: scala.Double
  var pending: scala.Double
  var suites: scala.Double
  var tests: scala.Double
}

object Anon_FailuresPasses {
  @scala.inline
  def apply(
    failures: scala.Double,
    passes: scala.Double,
    pending: scala.Double,
    suites: scala.Double,
    tests: scala.Double
  ): Anon_FailuresPasses = {
    val __obj = js.Dynamic.literal(failures = failures, passes = passes, pending = pending, suites = suites, tests = tests)
  
    __obj.asInstanceOf[Anon_FailuresPasses]
  }
}

