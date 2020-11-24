package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMissionProfileRequest extends js.Object {
  
  /**
    * UUID of a mission profile.
    */
  var missionProfileId: String = js.native
}
object GetMissionProfileRequest {
  
  @scala.inline
  def apply(missionProfileId: String): GetMissionProfileRequest = {
    val __obj = js.Dynamic.literal(missionProfileId = missionProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMissionProfileRequest]
  }
  
  @scala.inline
  implicit class GetMissionProfileRequestOps[Self <: GetMissionProfileRequest] (val x: Self) extends AnyVal {
    
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
    def setMissionProfileId(value: String): Self = this.set("missionProfileId", value.asInstanceOf[js.Any])
  }
}
