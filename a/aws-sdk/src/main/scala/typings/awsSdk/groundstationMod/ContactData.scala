package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactData extends StObject {
  
  /**
    * UUID of a contact.
    */
  var contactId: js.UndefOr[String] = js.undefined
  
  /**
    * Status of a contact.
    */
  var contactStatus: js.UndefOr[ContactStatus] = js.undefined
  
  /**
    * End time of a contact.
    */
  var endTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * Error message of a contact.
    */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Name of a ground station.
    */
  var groundStation: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum elevation angle of a contact.
    */
  var maximumElevation: js.UndefOr[Elevation] = js.undefined
  
  /**
    * ARN of a mission profile.
    */
  var missionProfileArn: js.UndefOr[MissionProfileArn] = js.undefined
  
  /**
    * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has finished.
    */
  var postPassEndTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * Amount of time prior to contact start you’d like to receive a CloudWatch event indicating an upcoming pass.
    */
  var prePassStartTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * Region of a contact.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * ARN of a satellite.
    */
  var satelliteArn: js.UndefOr[typings.awsSdk.groundstationMod.satelliteArn] = js.undefined
  
  /**
    * Start time of a contact.
    */
  var startTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * Tags assigned to a contact.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object ContactData {
  
  inline def apply(): ContactData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactData]
  }
  
  extension [Self <: ContactData](x: Self) {
    
    inline def setContactId(value: String): Self = StObject.set(x, "contactId", value.asInstanceOf[js.Any])
    
    inline def setContactIdUndefined: Self = StObject.set(x, "contactId", js.undefined)
    
    inline def setContactStatus(value: ContactStatus): Self = StObject.set(x, "contactStatus", value.asInstanceOf[js.Any])
    
    inline def setContactStatusUndefined: Self = StObject.set(x, "contactStatus", js.undefined)
    
    inline def setEndTime(value: Timestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setGroundStation(value: String): Self = StObject.set(x, "groundStation", value.asInstanceOf[js.Any])
    
    inline def setGroundStationUndefined: Self = StObject.set(x, "groundStation", js.undefined)
    
    inline def setMaximumElevation(value: Elevation): Self = StObject.set(x, "maximumElevation", value.asInstanceOf[js.Any])
    
    inline def setMaximumElevationUndefined: Self = StObject.set(x, "maximumElevation", js.undefined)
    
    inline def setMissionProfileArn(value: MissionProfileArn): Self = StObject.set(x, "missionProfileArn", value.asInstanceOf[js.Any])
    
    inline def setMissionProfileArnUndefined: Self = StObject.set(x, "missionProfileArn", js.undefined)
    
    inline def setPostPassEndTime(value: Timestamp): Self = StObject.set(x, "postPassEndTime", value.asInstanceOf[js.Any])
    
    inline def setPostPassEndTimeUndefined: Self = StObject.set(x, "postPassEndTime", js.undefined)
    
    inline def setPrePassStartTime(value: Timestamp): Self = StObject.set(x, "prePassStartTime", value.asInstanceOf[js.Any])
    
    inline def setPrePassStartTimeUndefined: Self = StObject.set(x, "prePassStartTime", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSatelliteArn(value: satelliteArn): Self = StObject.set(x, "satelliteArn", value.asInstanceOf[js.Any])
    
    inline def setSatelliteArnUndefined: Self = StObject.set(x, "satelliteArn", js.undefined)
    
    inline def setStartTime(value: Timestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
