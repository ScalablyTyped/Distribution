package typings.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPlacementsResponse extends js.Object {
  
  /**
    * The token used to retrieve the next set of results - will be effectively empty if there are no further results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * An object listing the requested placements.
    */
  var placements: PlacementSummaryList = js.native
}
object ListPlacementsResponse {
  
  @scala.inline
  def apply(placements: PlacementSummaryList): ListPlacementsResponse = {
    val __obj = js.Dynamic.literal(placements = placements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPlacementsResponse]
  }
  
  @scala.inline
  implicit class ListPlacementsResponseOps[Self <: ListPlacementsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPlacementsVarargs(value: PlacementSummary*): Self = this.set("placements", js.Array(value :_*))
    
    @scala.inline
    def setPlacements(value: PlacementSummaryList): Self = this.set("placements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
