package typings.awsSdk.connectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTranscriptResponse extends StObject {
  
  /**
    * The initial contact ID for the contact. 
    */
  var InitialContactId: js.UndefOr[ContactId] = js.native
  
  /**
    * The pagination token. Use the value returned previously in the next subsequent request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectparticipantMod.NextToken] = js.native
  
  /**
    * The list of messages in the session.
    */
  var Transcript: js.UndefOr[typings.awsSdk.connectparticipantMod.Transcript] = js.native
}
object GetTranscriptResponse {
  
  @scala.inline
  def apply(): GetTranscriptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTranscriptResponse]
  }
  
  @scala.inline
  implicit class GetTranscriptResponseMutableBuilder[Self <: GetTranscriptResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialContactId(value: ContactId): Self = StObject.set(x, "InitialContactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialContactIdUndefined: Self = StObject.set(x, "InitialContactId", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTranscript(value: Transcript): Self = StObject.set(x, "Transcript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscriptUndefined: Self = StObject.set(x, "Transcript", js.undefined)
    
    @scala.inline
    def setTranscriptVarargs(value: Item*): Self = StObject.set(x, "Transcript", js.Array(value :_*))
  }
}
