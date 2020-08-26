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
  def apply(): Endpoint_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Endpoint_]
  }
  @scala.inline
  implicit class Endpoint_Ops[Self <: Endpoint_] (val x: Self) extends AnyVal {
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
    def setAttributes(value: MapStringToString): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    @scala.inline
    def setEndpointArn(value: String): Self = this.set("EndpointArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointArn: Self = this.set("EndpointArn", js.undefined)
  }
  
}

