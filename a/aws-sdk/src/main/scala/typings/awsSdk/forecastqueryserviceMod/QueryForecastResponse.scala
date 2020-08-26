package typings.awsSdk.forecastqueryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryForecastResponse extends js.Object {
  /**
    * The forecast.
    */
  var Forecast: js.UndefOr[typings.awsSdk.forecastqueryserviceMod.Forecast] = js.native
}

object QueryForecastResponse {
  @scala.inline
  def apply(): QueryForecastResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryForecastResponse]
  }
  @scala.inline
  implicit class QueryForecastResponseOps[Self <: QueryForecastResponse] (val x: Self) extends AnyVal {
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
    def setForecast(value: Forecast): Self = this.set("Forecast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForecast: Self = this.set("Forecast", js.undefined)
  }
  
}

