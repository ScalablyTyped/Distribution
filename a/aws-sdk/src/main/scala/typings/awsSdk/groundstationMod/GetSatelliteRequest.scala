package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSatelliteRequest extends js.Object {
  /**
    * UUID of a satellite.
    */
  var satelliteId: String = js.native
}

object GetSatelliteRequest {
  @scala.inline
  def apply(satelliteId: String): GetSatelliteRequest = {
    val __obj = js.Dynamic.literal(satelliteId = satelliteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSatelliteRequest]
  }
  @scala.inline
  implicit class GetSatelliteRequestOps[Self <: GetSatelliteRequest] (val x: Self) extends AnyVal {
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
    def setSatelliteId(value: String): Self = this.set("satelliteId", value.asInstanceOf[js.Any])
  }
  
}

