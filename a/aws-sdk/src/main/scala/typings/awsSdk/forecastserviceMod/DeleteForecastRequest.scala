package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteForecastRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the forecast to delete.
    */
  var ForecastArn: Arn = js.native
}

object DeleteForecastRequest {
  @scala.inline
  def apply(ForecastArn: Arn): DeleteForecastRequest = {
    val __obj = js.Dynamic.literal(ForecastArn = ForecastArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteForecastRequest]
  }
}

