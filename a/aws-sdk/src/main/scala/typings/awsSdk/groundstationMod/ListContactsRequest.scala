package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListContactsRequest extends js.Object {
  /**
    * End time of a contact.
    */
  var endTime: Timestamp = js.native
  /**
    * Name of a ground station.
    */
  var groundStation: js.UndefOr[String] = js.native
  /**
    * Maximum number of contacts returned.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  /**
    * ARN of a mission profile.
    */
  var missionProfileArn: js.UndefOr[MissionProfileArn] = js.native
  /**
    * Next token returned in the request of a previous ListContacts call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * ARN of a satellite.
    */
  var satelliteArn: js.UndefOr[typings.awsSdk.groundstationMod.satelliteArn] = js.native
  /**
    * Start time of a contact.
    */
  var startTime: Timestamp = js.native
  /**
    * Status of a contact reservation.
    */
  var statusList: StatusList = js.native
}

object ListContactsRequest {
  @scala.inline
  def apply(endTime: Timestamp, startTime: Timestamp, statusList: StatusList): ListContactsRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], statusList = statusList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContactsRequest]
  }
  @scala.inline
  implicit class ListContactsRequestOps[Self <: ListContactsRequest] (val x: Self) extends AnyVal {
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
    def setStartTime(value: Timestamp): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusListVarargs(value: ContactStatus*): Self = this.set("statusList", js.Array(value :_*))
    @scala.inline
    def setStatusList(value: StatusList): Self = this.set("statusList", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroundStation(value: String): Self = this.set("groundStation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroundStation: Self = this.set("groundStation", js.undefined)
    @scala.inline
    def setMaxResults(value: Integer): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setMissionProfileArn(value: MissionProfileArn): Self = this.set("missionProfileArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMissionProfileArn: Self = this.set("missionProfileArn", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setSatelliteArn(value: satelliteArn): Self = this.set("satelliteArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSatelliteArn: Self = this.set("satelliteArn", js.undefined)
  }
  
}

