package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluationParameters extends js.Object {
  /**
    * The point from the end of the dataset where you want to split the data for model training and testing (evaluation). Specify the value as the number of data points. The default is the value of the forecast horizon. BackTestWindowOffset can be used to mimic a past virtual forecast start date. This value must be greater than or equal to the forecast horizon and less than half of the TARGET_TIME_SERIES dataset length.  ForecastHorizon &lt;= BackTestWindowOffset &lt; 1/2 * TARGET_TIME_SERIES dataset length
    */
  var BackTestWindowOffset: js.UndefOr[Integer] = js.native
  /**
    * The number of times to split the input data. The default is 1. Valid values are 1 through 5.
    */
  var NumberOfBacktestWindows: js.UndefOr[Integer] = js.native
}

object EvaluationParameters {
  @scala.inline
  def apply(): EvaluationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationParameters]
  }
  @scala.inline
  implicit class EvaluationParametersOps[Self <: EvaluationParameters] (val x: Self) extends AnyVal {
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
    def setBackTestWindowOffset(value: Integer): Self = this.set("BackTestWindowOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackTestWindowOffset: Self = this.set("BackTestWindowOffset", js.undefined)
    @scala.inline
    def setNumberOfBacktestWindows(value: Integer): Self = this.set("NumberOfBacktestWindows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfBacktestWindows: Self = this.set("NumberOfBacktestWindows", js.undefined)
  }
  
}

