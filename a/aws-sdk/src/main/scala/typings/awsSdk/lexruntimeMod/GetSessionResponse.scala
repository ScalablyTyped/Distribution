package typings.awsSdk.lexruntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSessionResponse extends StObject {
  
  /**
    * A list of active contexts for the session. A context can be set when an intent is fulfilled or by calling the PostContent, PostText, or PutSession operation. You can use a context to control the intents that can follow up an intent, or to modify the operation of your application.
    */
  var activeContexts: js.UndefOr[ActiveContextsList] = js.undefined
  
  /**
    * Describes the current state of the bot.
    */
  var dialogAction: js.UndefOr[DialogAction] = js.undefined
  
  /**
    * An array of information about the intents used in the session. The array can contain a maximum of three summaries. If more than three intents are used in the session, the recentIntentSummaryView operation contains information about the last three intents used. If you set the checkpointLabelFilter parameter in the request, the array contains only the intents with the specified label.
    */
  var recentIntentSummaryView: js.UndefOr[IntentSummaryList] = js.undefined
  
  /**
    * Map of key/value pairs representing the session-specific context information. It contains application information passed between Amazon Lex and a client application.
    */
  var sessionAttributes: js.UndefOr[StringMap] = js.undefined
  
  /**
    * A unique identifier for the session.
    */
  var sessionId: js.UndefOr[String] = js.undefined
}
object GetSessionResponse {
  
  @scala.inline
  def apply(): GetSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSessionResponse]
  }
  
  @scala.inline
  implicit class GetSessionResponseMutableBuilder[Self <: GetSessionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveContexts(value: ActiveContextsList): Self = StObject.set(x, "activeContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveContextsUndefined: Self = StObject.set(x, "activeContexts", js.undefined)
    
    @scala.inline
    def setActiveContextsVarargs(value: ActiveContext*): Self = StObject.set(x, "activeContexts", js.Array(value :_*))
    
    @scala.inline
    def setDialogAction(value: DialogAction): Self = StObject.set(x, "dialogAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogActionUndefined: Self = StObject.set(x, "dialogAction", js.undefined)
    
    @scala.inline
    def setRecentIntentSummaryView(value: IntentSummaryList): Self = StObject.set(x, "recentIntentSummaryView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecentIntentSummaryViewUndefined: Self = StObject.set(x, "recentIntentSummaryView", js.undefined)
    
    @scala.inline
    def setRecentIntentSummaryViewVarargs(value: IntentSummary*): Self = StObject.set(x, "recentIntentSummaryView", js.Array(value :_*))
    
    @scala.inline
    def setSessionAttributes(value: StringMap): Self = StObject.set(x, "sessionAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionAttributesUndefined: Self = StObject.set(x, "sessionAttributes", js.undefined)
    
    @scala.inline
    def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
  }
}
