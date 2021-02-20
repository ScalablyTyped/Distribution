package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUtterancesViewResponse extends StObject {
  
  /**
    * The name of the bot for which utterance information was returned.
    */
  var botName: js.UndefOr[BotName] = js.native
  
  /**
    * An array of UtteranceList objects, each containing a list of UtteranceData objects describing the utterances that were processed by your bot. The response contains a maximum of 100 UtteranceData objects for each version. Amazon Lex returns the most frequent utterances received by the bot in the last 15 days.
    */
  var utterances: js.UndefOr[ListsOfUtterances] = js.native
}
object GetUtterancesViewResponse {
  
  @scala.inline
  def apply(): GetUtterancesViewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUtterancesViewResponse]
  }
  
  @scala.inline
  implicit class GetUtterancesViewResponseMutableBuilder[Self <: GetUtterancesViewResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBotName(value: BotName): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotNameUndefined: Self = StObject.set(x, "botName", js.undefined)
    
    @scala.inline
    def setUtterances(value: ListsOfUtterances): Self = StObject.set(x, "utterances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtterancesUndefined: Self = StObject.set(x, "utterances", js.undefined)
    
    @scala.inline
    def setUtterancesVarargs(value: UtteranceList*): Self = StObject.set(x, "utterances", js.Array(value :_*))
  }
}
