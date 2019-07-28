package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailuresPasses extends js.Object {
  var failures: Double
  var passes: Double
  var pending: Double
  var suites: Double
  var tests: Double
}

object Anon_FailuresPasses {
  @scala.inline
  def apply(failures: Double, passes: Double, pending: Double, suites: Double, tests: Double): Anon_FailuresPasses = {
    val __obj = js.Dynamic.literal(failures = failures, passes = passes, pending = pending, suites = suites, tests = tests)
  
    __obj.asInstanceOf[Anon_FailuresPasses]
  }
}

