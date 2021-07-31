package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MissionProfileIdResponse extends StObject {
  
  /**
    * UUID of a mission profile.
    */
  var missionProfileId: js.UndefOr[String] = js.undefined
}
object MissionProfileIdResponse {
  
  @scala.inline
  def apply(): MissionProfileIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MissionProfileIdResponse]
  }
  
  @scala.inline
  implicit class MissionProfileIdResponseMutableBuilder[Self <: MissionProfileIdResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMissionProfileId(value: String): Self = StObject.set(x, "missionProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissionProfileIdUndefined: Self = StObject.set(x, "missionProfileId", js.undefined)
  }
}
