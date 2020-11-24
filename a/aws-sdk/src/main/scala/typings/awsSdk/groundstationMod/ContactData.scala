package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactData extends js.Object {
  
  /**
    * UUID of a contact.
    */
  var contactId: js.UndefOr[String] = js.native
  
  /**
    * Status of a contact.
    */
  var contactStatus: js.UndefOr[ContactStatus] = js.native
  
  /**
    * End time of a contact.
    */
  var endTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * Error message of a contact.
    */
  var errorMessage: js.UndefOr[String] = js.native
  
  /**
    * Name of a ground station.
    */
  var groundStation: js.UndefOr[String] = js.native
  
  /**
    * Maximum elevation angle of a contact.
    */
  var maximumElevation: js.UndefOr[Elevation] = js.native
  
  /**
    * ARN of a mission profile.
    */
  var missionProfileArn: js.UndefOr[MissionProfileArn] = js.native
  
  /**
    * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has finished.
    */
  var postPassEndTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * Amount of time prior to contact start you’d like to receive a CloudWatch event indicating an upcoming pass.
    */
  var prePassStartTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * Region of a contact.
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * ARN of a satellite.
    */
  var satelliteArn: js.UndefOr[typings.awsSdk.groundstationMod.satelliteArn] = js.native
  
  /**
    * Start time of a contact.
    */
  var startTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * Tags assigned to a contact.
    */
  var tags: js.UndefOr[TagsMap] = js.native
}
object ContactData {
  
  @scala.inline
  def apply(): ContactData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactData]
  }
  
  @scala.inline
  implicit class ContactDataOps[Self <: ContactData] (val x: Self) extends AnyVal {
    
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
    def setContactId(value: String): Self = this.set("contactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactId: Self = this.set("contactId", js.undefined)
    
    @scala.inline
    def setContactStatus(value: ContactStatus): Self = this.set("contactStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactStatus: Self = this.set("contactStatus", js.undefined)
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setGroundStation(value: String): Self = this.set("groundStation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroundStation: Self = this.set("groundStation", js.undefined)
    
    @scala.inline
    def setMaximumElevation(value: Elevation): Self = this.set("maximumElevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumElevation: Self = this.set("maximumElevation", js.undefined)
    
    @scala.inline
    def setMissionProfileArn(value: MissionProfileArn): Self = this.set("missionProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMissionProfileArn: Self = this.set("missionProfileArn", js.undefined)
    
    @scala.inline
    def setPostPassEndTime(value: Timestamp): Self = this.set("postPassEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostPassEndTime: Self = this.set("postPassEndTime", js.undefined)
    
    @scala.inline
    def setPrePassStartTime(value: Timestamp): Self = this.set("prePassStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrePassStartTime: Self = this.set("prePassStartTime", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setSatelliteArn(value: satelliteArn): Self = this.set("satelliteArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSatelliteArn: Self = this.set("satelliteArn", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setTags(value: TagsMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
