package typings.awsSdk.connectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTranscriptRequest extends StObject {
  
  /**
    * The authentication token associated with the participant's connection.
    */
  var ConnectionToken: ParticipantToken
  
  /**
    * The contactId from the current contact chain for which transcript is needed.
    */
  var ContactId: js.UndefOr[typings.awsSdk.connectparticipantMod.ContactId] = js.undefined
  
  /**
    * The maximum number of results to return in the page. Default: 10. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.connectparticipantMod.MaxResults] = js.undefined
  
  /**
    * The pagination token. Use the value returned previously in the next subsequent request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectparticipantMod.NextToken] = js.undefined
  
  /**
    * The direction from StartPosition from which to retrieve message. Default: BACKWARD when no StartPosition is provided, FORWARD with StartPosition. 
    */
  var ScanDirection: js.UndefOr[typings.awsSdk.connectparticipantMod.ScanDirection] = js.undefined
  
  /**
    * The sort order for the records. Default: DESCENDING.
    */
  var SortOrder: js.UndefOr[SortKey] = js.undefined
  
  /**
    * A filtering option for where to start.
    */
  var StartPosition: js.UndefOr[typings.awsSdk.connectparticipantMod.StartPosition] = js.undefined
}
object GetTranscriptRequest {
  
  inline def apply(ConnectionToken: ParticipantToken): GetTranscriptRequest = {
    val __obj = js.Dynamic.literal(ConnectionToken = ConnectionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTranscriptRequest]
  }
  
  extension [Self <: GetTranscriptRequest](x: Self) {
    
    inline def setConnectionToken(value: ParticipantToken): Self = StObject.set(x, "ConnectionToken", value.asInstanceOf[js.Any])
    
    inline def setContactId(value: ContactId): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    inline def setContactIdUndefined: Self = StObject.set(x, "ContactId", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setScanDirection(value: ScanDirection): Self = StObject.set(x, "ScanDirection", value.asInstanceOf[js.Any])
    
    inline def setScanDirectionUndefined: Self = StObject.set(x, "ScanDirection", js.undefined)
    
    inline def setSortOrder(value: SortKey): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
    
    inline def setStartPosition(value: StartPosition): Self = StObject.set(x, "StartPosition", value.asInstanceOf[js.Any])
    
    inline def setStartPositionUndefined: Self = StObject.set(x, "StartPosition", js.undefined)
  }
}
