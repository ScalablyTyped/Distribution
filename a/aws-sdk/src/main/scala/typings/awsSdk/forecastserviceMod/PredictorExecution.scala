package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredictorExecution extends js.Object {
  /**
    * The ARN of the algorithm used to test the predictor.
    */
  var AlgorithmArn: js.UndefOr[Arn] = js.native
  /**
    * An array of test windows used to evaluate the algorithm. The NumberOfBacktestWindows from the object determines the number of windows in the array.
    */
  var TestWindows: js.UndefOr[TestWindowDetails] = js.native
}

object PredictorExecution {
  @scala.inline
  def apply(): PredictorExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PredictorExecution]
  }
  @scala.inline
  implicit class PredictorExecutionOps[Self <: PredictorExecution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlgorithmArn(value: Arn): Self = this.set("AlgorithmArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithmArn: Self = this.set("AlgorithmArn", js.undefined)
    @scala.inline
    def setTestWindowsVarargs(value: TestWindowSummary*): Self = this.set("TestWindows", js.Array(value :_*))
    @scala.inline
    def setTestWindows(value: TestWindowDetails): Self = this.set("TestWindows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestWindows: Self = this.set("TestWindows", js.undefined)
  }
  
}

