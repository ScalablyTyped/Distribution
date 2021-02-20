package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMissionProfilesResponse extends StObject {
  
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
  implicit class ListMissionProfilesResponseMutableBuilder[Self <: ListMissionProfilesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMissionProfileList(value: MissionProfileList): Self = StObject.set(x, "missionProfileList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissionProfileListUndefined: Self = StObject.set(x, "missionProfileList", js.undefined)
    
    @scala.inline
    def setMissionProfileListVarargs(value: MissionProfileListItem*): Self = StObject.set(x, "missionProfileList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
