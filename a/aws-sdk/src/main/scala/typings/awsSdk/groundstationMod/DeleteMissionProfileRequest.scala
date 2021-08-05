package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMissionProfileRequest extends StObject {
  
  /**
    * UUID of a mission profile.
    */
  var missionProfileId: String
}
object DeleteMissionProfileRequest {
  
  inline def apply(missionProfileId: String): DeleteMissionProfileRequest = {
    val __obj = js.Dynamic.literal(missionProfileId = missionProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMissionProfileRequest]
  }
  
  extension [Self <: DeleteMissionProfileRequest](x: Self) {
    
    inline def setMissionProfileId(value: String): Self = StObject.set(x, "missionProfileId", value.asInstanceOf[js.Any])
  }
}
