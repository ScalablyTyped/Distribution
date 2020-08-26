package typings.awsSdk.forecastqueryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Forecast extends js.Object {
  /**
    * The forecast. The string of the string-to-array map is one of the following values:   p10   p50   p90  
    */
  var Predictions: js.UndefOr[typings.awsSdk.forecastqueryserviceMod.Predictions] = js.native
}

object Forecast {
  @scala.inline
  def apply(): Forecast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Forecast]
  }
  @scala.inline
  implicit class ForecastOps[Self <: Forecast] (val x: Self) extends AnyVal {
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
    def setPredictions(value: Predictions): Self = this.set("Predictions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredictions: Self = this.set("Predictions", js.undefined)
  }
  
}

