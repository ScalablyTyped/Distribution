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
    val __obj = js.Dynamic.literal(duration = duration, errorCount = errorCount, results = results)
  
    __obj.asInstanceOf[TestReport]
  }
}

