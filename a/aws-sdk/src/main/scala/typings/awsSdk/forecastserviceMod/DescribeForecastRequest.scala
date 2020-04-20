package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeForecastRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the forecast.
    */
  var ForecastArn: Arn = js.native
}

object DescribeForecastRequest {
  @scala.inline
  def apply(ForecastArn: Arn): DescribeForecastRequest = {
    val __obj = js.Dynamic.literal(ForecastArn = ForecastArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeForecastRequest]
  }
}

