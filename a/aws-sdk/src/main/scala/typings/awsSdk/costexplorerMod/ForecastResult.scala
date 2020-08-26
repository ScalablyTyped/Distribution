package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForecastResult extends js.Object {
  /**
    * The mean value of the forecast.
    */
  var MeanValue: js.UndefOr[GenericString] = js.native
  /**
    * The lower limit for the prediction interval. 
    */
  var PredictionIntervalLowerBound: js.UndefOr[GenericString] = js.native
  /**
    * The upper limit for the prediction interval. 
    */
  var PredictionIntervalUpperBound: js.UndefOr[GenericString] = js.native
  /**
    * The period of time that the forecast covers.
    */
  var TimePeriod: js.UndefOr[DateInterval] = js.native
}

object ForecastResult {
  @scala.inline
  def apply(): ForecastResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForecastResult]
  }
  @scala.inline
  implicit class ForecastResultOps[Self <: ForecastResult] (val x: Self) extends AnyVal {
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
    def setMeanValue(value: GenericString): Self = this.set("MeanValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeanValue: Self = this.set("MeanValue", js.undefined)
    @scala.inline
    def setPredictionIntervalLowerBound(value: GenericString): Self = this.set("PredictionIntervalLowerBound", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredictionIntervalLowerBound: Self = this.set("PredictionIntervalLowerBound", js.undefined)
    @scala.inline
    def setPredictionIntervalUpperBound(value: GenericString): Self = this.set("PredictionIntervalUpperBound", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredictionIntervalUpperBound: Self = this.set("PredictionIntervalUpperBound", js.undefined)
    @scala.inline
    def setTimePeriod(value: DateInterval): Self = this.set("TimePeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePeriod: Self = this.set("TimePeriod", js.undefined)
  }
  
}

