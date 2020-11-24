package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PredictorExecutionDetails extends js.Object {
  
  /**
    * An array of the backtests performed to evaluate the accuracy of the predictor against a particular algorithm. The NumberOfBacktestWindows from the object determines the number of windows in the array.
    */
  var PredictorExecutions: js.UndefOr[typings.awsSdk.forecastserviceMod.PredictorExecutions] = js.native
}
object PredictorExecutionDetails {
  
  @scala.inline
  def apply(): PredictorExecutionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PredictorExecutionDetails]
  }
  
  @scala.inline
  implicit class PredictorExecutionDetailsOps[Self <: PredictorExecutionDetails] (val x: Self) extends AnyVal {
    
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
    def setPredictorExecutionsVarargs(value: PredictorExecution*): Self = this.set("PredictorExecutions", js.Array(value :_*))
    
    @scala.inline
    def setPredictorExecutions(value: PredictorExecutions): Self = this.set("PredictorExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredictorExecutions: Self = this.set("PredictorExecutions", js.undefined)
  }
}
