package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeContactResponse extends StObject {
  
  /**
    * UUID of a contact.
    */
  var contactId: js.UndefOr[String] = js.undefined
  
  /**
    * Status of a contact.
    */
  var contactStatus: js.UndefOr[ContactStatus] = js.undefined
  
  /**
    * List describing source and destination details for each dataflow edge.
    */
  var dataflowList: js.UndefOr[DataflowList] = js.undefined
  
  /**
    * End time of a contact.
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Error message for a contact.
    */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Ground station for a contact.
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
  var postPassEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Amount of time prior to contact start you’d like to receive a CloudWatch event indicating an upcoming pass.
    */
  var prePassStartTime: js.UndefOr[js.Date] = js.undefined
  
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
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Tags assigned to a contact.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object DescribeContactResponse {
  
  inline def apply(): DescribeContactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeContactResponse]
  }
  
  extension [Self <: DescribeContactResponse](x: Self) {
    
    inline def setContactId(value: String): Self = StObject.set(x, "contactId", value.asInstanceOf[js.Any])
    
    inline def setContactIdUndefined: Self = StObject.set(x, "contactId", js.undefined)
    
    inline def setContactStatus(value: ContactStatus): Self = StObject.set(x, "contactStatus", value.asInstanceOf[js.Any])
    
    inline def setContactStatusUndefined: Self = StObject.set(x, "contactStatus", js.undefined)
    
    inline def setDataflowList(value: DataflowList): Self = StObject.set(x, "dataflowList", value.asInstanceOf[js.Any])
    
    inline def setDataflowListUndefined: Self = StObject.set(x, "dataflowList", js.undefined)
    
    inline def setDataflowListVarargs(value: DataflowDetail*): Self = StObject.set(x, "dataflowList", js.Array(value*))
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setGroundStation(value: String): Self = StObject.set(x, "groundStation", value.asInstanceOf[js.Any])
    
    inline def setGroundStationUndefined: Self = StObject.set(x, "groundStation", js.undefined)
    
    inline def setMaximumElevation(value: Elevation): Self = StObject.set(x, "maximumElevation", value.asInstanceOf[js.Any])
    
    inline def setMaximumElevationUndefined: Self = StObject.set(x, "maximumElevation", js.undefined)
    
    inline def setMissionProfileArn(value: MissionProfileArn): Self = StObject.set(x, "missionProfileArn", value.asInstanceOf[js.Any])
    
    inline def setMissionProfileArnUndefined: Self = StObject.set(x, "missionProfileArn", js.undefined)
    
    inline def setPostPassEndTime(value: js.Date): Self = StObject.set(x, "postPassEndTime", value.asInstanceOf[js.Any])
    
    inline def setPostPassEndTimeUndefined: Self = StObject.set(x, "postPassEndTime", js.undefined)
    
    inline def setPrePassStartTime(value: js.Date): Self = StObject.set(x, "prePassStartTime", value.asInstanceOf[js.Any])
    
    inline def setPrePassStartTimeUndefined: Self = StObject.set(x, "prePassStartTime", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSatelliteArn(value: satelliteArn): Self = StObject.set(x, "satelliteArn", value.asInstanceOf[js.Any])
    
    inline def setSatelliteArnUndefined: Self = StObject.set(x, "satelliteArn", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
