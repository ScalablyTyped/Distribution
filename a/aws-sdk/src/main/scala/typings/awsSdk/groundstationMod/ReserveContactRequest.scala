package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReserveContactRequest extends StObject {
  
  /**
    * End time of a contact.
    */
  var endTime: Timestamp = js.native
  
  /**
    * Name of a ground station.
    */
  var groundStation: String = js.native
  
  /**
    * ARN of a mission profile.
    */
  var missionProfileArn: MissionProfileArn = js.native
  
  /**
    * ARN of a satellite
    */
  var satelliteArn: typings.awsSdk.groundstationMod.satelliteArn = js.native
  
  /**
    * Start time of a contact.
    */
  var startTime: Timestamp = js.native
  
  /**
    * Tags assigned to a contact.
    */
  var tags: js.UndefOr[TagsMap] = js.native
}
object ReserveContactRequest {
  
  @scala.inline
  def apply(
    endTime: Timestamp,
    groundStation: String,
    missionProfileArn: MissionProfileArn,
    satelliteArn: satelliteArn,
    startTime: Timestamp
  ): ReserveContactRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], groundStation = groundStation.asInstanceOf[js.Any], missionProfileArn = missionProfileArn.asInstanceOf[js.Any], satelliteArn = satelliteArn.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReserveContactRequest]
  }
  
  @scala.inline
  implicit class ReserveContactRequestMutableBuilder[Self <: ReserveContactRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroundStation(value: String): Self = StObject.set(x, "groundStation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissionProfileArn(value: MissionProfileArn): Self = StObject.set(x, "missionProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSatelliteArn(value: satelliteArn): Self = StObject.set(x, "satelliteArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
