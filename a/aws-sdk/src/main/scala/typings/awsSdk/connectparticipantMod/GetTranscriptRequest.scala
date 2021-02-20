package typings.awsSdk.connectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTranscriptRequest extends StObject {
  
  /**
    * The authentication token associated with the participant's connection.
    */
  var ConnectionToken: ParticipantToken = js.native
  
  /**
    * The contactId from the current contact chain for which transcript is needed.
    */
  var ContactId: js.UndefOr[typings.awsSdk.connectparticipantMod.ContactId] = js.native
  
  /**
    * The maximum number of results to return in the page. Default: 10. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.connectparticipantMod.MaxResults] = js.native
  
  /**
    * The pagination token. Use the value returned previously in the next subsequent request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectparticipantMod.NextToken] = js.native
  
  /**
    * The direction from StartPosition from which to retrieve message. Default: BACKWARD when no StartPosition is provided, FORWARD with StartPosition. 
    */
  var ScanDirection: js.UndefOr[typings.awsSdk.connectparticipantMod.ScanDirection] = js.native
  
  /**
    * The sort order for the records. Default: DESCENDING.
    */
  var SortOrder: js.UndefOr[SortKey] = js.native
  
  /**
    * A filtering option for where to start.
    */
  var StartPosition: js.UndefOr[typings.awsSdk.connectparticipantMod.StartPosition] = js.native
}
object GetTranscriptRequest {
  
  @scala.inline
  def apply(ConnectionToken: ParticipantToken): GetTranscriptRequest = {
    val __obj = js.Dynamic.literal(ConnectionToken = ConnectionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTranscriptRequest]
  }
  
  @scala.inline
  implicit class GetTranscriptRequestMutableBuilder[Self <: GetTranscriptRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionToken(value: ParticipantToken): Self = StObject.set(x, "ConnectionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactId(value: ContactId): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactIdUndefined: Self = StObject.set(x, "ContactId", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setScanDirection(value: ScanDirection): Self = StObject.set(x, "ScanDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanDirectionUndefined: Self = StObject.set(x, "ScanDirection", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortKey): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
    
    @scala.inline
    def setStartPosition(value: StartPosition): Self = StObject.set(x, "StartPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPositionUndefined: Self = StObject.set(x, "StartPosition", js.undefined)
  }
}
