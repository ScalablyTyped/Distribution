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
}

