package typings.cavy.cavyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestReport extends js.Object {
  var duration: Double
  var errorCount: Double
  var results: js.Array[TestResult]
}

object TestReport {
  @scala.inline
  def apply(duration: Double, errorCount: Double, results: js.Array[TestResult]): TestReport = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], errorCount = errorCount.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestReport]
  }
}

