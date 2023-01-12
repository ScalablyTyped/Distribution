package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSpeakersResponse extends StObject {
  
  /**
    * If NextToken is returned, there are more results available. The value of NextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list containing details about each speaker in the Amazon Web Services account. 
    */
  var SpeakerSummaries: js.UndefOr[typings.awsSdk.clientsVoiceidMod.SpeakerSummaries] = js.undefined
}
object ListSpeakersResponse {
  
  inline def apply(): ListSpeakersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSpeakersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSpeakersResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSpeakerSummaries(value: SpeakerSummaries): Self = StObject.set(x, "SpeakerSummaries", value.asInstanceOf[js.Any])
    
    inline def setSpeakerSummariesUndefined: Self = StObject.set(x, "SpeakerSummaries", js.undefined)
    
    inline def setSpeakerSummariesVarargs(value: SpeakerSummary*): Self = StObject.set(x, "SpeakerSummaries", js.Array(value*))
  }
}
