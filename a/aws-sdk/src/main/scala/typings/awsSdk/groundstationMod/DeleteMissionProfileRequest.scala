package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteMissionProfileRequest extends StObject {
  
  /**
    * UUID of a mission profile.
    */
  var missionProfileId: String = js.native
}
object DeleteMissionProfileRequest {
  
  @scala.inline
  def apply(missionProfileId: String): DeleteMissionProfileRequest = {
    val __obj = js.Dynamic.literal(missionProfileId = missionProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMissionProfileRequest]
  }
  
  @scala.inline
  implicit class DeleteMissionProfileRequestMutableBuilder[Self <: DeleteMissionProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMissionProfileId(value: String): Self = StObject.set(x, "missionProfileId", value.asInstanceOf[js.Any])
  }
}
