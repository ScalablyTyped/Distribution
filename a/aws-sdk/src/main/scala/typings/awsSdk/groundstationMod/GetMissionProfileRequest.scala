package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMissionProfileRequest extends StObject {
  
  /**
    * UUID of a mission profile.
    */
  var missionProfileId: String
}
object GetMissionProfileRequest {
  
  @scala.inline
  def apply(missionProfileId: String): GetMissionProfileRequest = {
    val __obj = js.Dynamic.literal(missionProfileId = missionProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMissionProfileRequest]
  }
  
  @scala.inline
  implicit class GetMissionProfileRequestMutableBuilder[Self <: GetMissionProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMissionProfileId(value: String): Self = StObject.set(x, "missionProfileId", value.asInstanceOf[js.Any])
  }
}
