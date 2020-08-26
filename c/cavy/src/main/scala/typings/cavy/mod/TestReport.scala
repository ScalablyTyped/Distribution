package typings.cavy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestReport extends js.Object {
  var duration: Double = js.native
  var errorCount: Double = js.native
  var results: js.Array[TestResult] = js.native
}

object TestReport {
  @scala.inline
  def apply(duration: Double, errorCount: Double, results: js.Array[TestResult]): TestReport = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], errorCount = errorCount.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestReport]
  }
  @scala.inline
  implicit class TestReportOps[Self <: TestReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorCount(value: Double): Self = this.set("errorCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultsVarargs(value: TestResult*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[TestResult]): Self = this.set("results", value.asInstanceOf[js.Any])
  }
  
}

