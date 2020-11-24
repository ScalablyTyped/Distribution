package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGroundStationsResponse extends js.Object {
  
  /**
    * List of ground stations.
    */
  var groundStationList: js.UndefOr[GroundStationList] = js.native
  
  /**
    * Next token that can be supplied in the next call to get the next page of ground stations.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object ListGroundStationsResponse {
  
  @scala.inline
  def apply(): ListGroundStationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroundStationsResponse]
  }
  
  @scala.inline
  implicit class ListGroundStationsResponseOps[Self <: ListGroundStationsResponse] (val x: Self) extends AnyVal {
    
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
    def setGroundStationListVarargs(value: GroundStationData*): Self = this.set("groundStationList", js.Array(value :_*))
    
    @scala.inline
    def setGroundStationList(value: GroundStationList): Self = this.set("groundStationList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroundStationList: Self = this.set("groundStationList", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
