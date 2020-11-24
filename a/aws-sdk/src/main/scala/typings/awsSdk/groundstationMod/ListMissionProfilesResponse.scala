package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMissionProfilesResponse extends js.Object {
  
  /**
    * List of mission profiles.
    */
  var missionProfileList: js.UndefOr[MissionProfileList] = js.native
  
  /**
    * Next token returned in the response of a previous ListMissionProfiles call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object ListMissionProfilesResponse {
  
  @scala.inline
  def apply(): ListMissionProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMissionProfilesResponse]
  }
  
  @scala.inline
  implicit class ListMissionProfilesResponseOps[Self <: ListMissionProfilesResponse] (val x: Self) extends AnyVal {
    
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
    def setMissionProfileListVarargs(value: MissionProfileListItem*): Self = this.set("missionProfileList", js.Array(value :_*))
    
    @scala.inline
    def setMissionProfileList(value: MissionProfileList): Self = this.set("missionProfileList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMissionProfileList: Self = this.set("missionProfileList", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
