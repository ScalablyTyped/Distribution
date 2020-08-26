package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluationResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the algorithm that was evaluated.
    */
  var AlgorithmArn: js.UndefOr[Arn] = js.native
  /**
    * The array of test windows used for evaluating the algorithm. The NumberOfBacktestWindows from the EvaluationParameters object determines the number of windows in the array.
    */
  var TestWindows: js.UndefOr[typings.awsSdk.forecastserviceMod.TestWindows] = js.native
}

object EvaluationResult {
  @scala.inline
  def apply(): EvaluationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationResult]
  }
  @scala.inline
  implicit class EvaluationResultOps[Self <: EvaluationResult] (val x: Self) extends AnyVal {
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
    def setTestWindowsVarargs(value: WindowSummary*): Self = this.set("TestWindows", js.Array(value :_*))
    @scala.inline
    def setTestWindows(value: TestWindows): Self = this.set("TestWindows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestWindows: Self = this.set("TestWindows", js.undefined)
  }
  
}

