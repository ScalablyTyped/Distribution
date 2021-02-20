package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSatelliteRequest extends StObject {
  
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
  implicit class GetSatelliteRequestMutableBuilder[Self <: GetSatelliteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSatelliteId(value: String): Self = StObject.set(x, "satelliteId", value.asInstanceOf[js.Any])
  }
}
