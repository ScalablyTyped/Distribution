package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateForecastResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the forecast.
    */
  var ForecastArn: js.UndefOr[Arn] = js.native
}

object CreateForecastResponse {
  @scala.inline
  def apply(ForecastArn: Arn = null): CreateForecastResponse = {
    val __obj = js.Dynamic.literal()
    if (ForecastArn != null) __obj.updateDynamic("ForecastArn")(ForecastArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateForecastResponse]
  }
}

