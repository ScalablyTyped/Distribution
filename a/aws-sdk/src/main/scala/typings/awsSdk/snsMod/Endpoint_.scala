package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoint_ extends js.Object {
  /**
    * Attributes for endpoint.
    */
  var Attributes: js.UndefOr[MapStringToString] = js.native
  /**
    * EndpointArn for mobile app and device.
    */
  var EndpointArn: js.UndefOr[String] = js.native
}

object Endpoint_ {
  @scala.inline
  def apply(Attributes: MapStringToString = null, EndpointArn: String = null): Endpoint_ = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (EndpointArn != null) __obj.updateDynamic("EndpointArn")(EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint_]
  }
}

