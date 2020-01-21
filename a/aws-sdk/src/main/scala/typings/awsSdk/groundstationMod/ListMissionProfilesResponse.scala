package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMissionProfilesResponse extends js.Object {
  /**
    * List of mission profiles
    */
  var missionProfileList: js.UndefOr[MissionProfileList] = js.native
  /**
    * Next token returned in the response of a previous ListMissionProfiles call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListMissionProfilesResponse {
  @scala.inline
  def apply(missionProfileList: MissionProfileList = null, nextToken: String = null): ListMissionProfilesResponse = {
    val __obj = js.Dynamic.literal()
    if (missionProfileList != null) __obj.updateDynamic("missionProfileList")(missionProfileList.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMissionProfilesResponse]
  }
}

