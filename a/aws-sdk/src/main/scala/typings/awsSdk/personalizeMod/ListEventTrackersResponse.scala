package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEventTrackersResponse extends StObject {
  
  /**
    * A list of event trackers.
    */
  var eventTrackers: js.UndefOr[EventTrackers] = js.native
  
  /**
    * A token for getting the next set of event trackers (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListEventTrackersResponse {
  
  @scala.inline
  def apply(): ListEventTrackersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventTrackersResponse]
  }
  
  @scala.inline
  implicit class ListEventTrackersResponseMutableBuilder[Self <: ListEventTrackersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventTrackers(value: EventTrackers): Self = StObject.set(x, "eventTrackers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTrackersUndefined: Self = StObject.set(x, "eventTrackers", js.undefined)
    
    @scala.inline
    def setEventTrackersVarargs(value: EventTrackerSummary*): Self = StObject.set(x, "eventTrackers", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
