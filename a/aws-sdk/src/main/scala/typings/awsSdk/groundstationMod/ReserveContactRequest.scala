package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReserveContactRequest extends js.Object {
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
  implicit class ReserveContactRequestOps[Self <: ReserveContactRequest] (val x: Self) extends AnyVal {
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
    def setEndTime(value: Timestamp): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroundStation(value: String): Self = this.set("groundStation", value.asInstanceOf[js.Any])
    @scala.inline
    def setMissionProfileArn(value: MissionProfileArn): Self = this.set("missionProfileArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setSatelliteArn(value: satelliteArn): Self = this.set("satelliteArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: TagsMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

