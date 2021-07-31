package typings.awsSdk.lexruntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSessionRequest extends StObject {
  
  /**
    * The alias in use for the bot that contains the session data.
    */
  var botAlias: BotAlias
  
  /**
    * The name of the bot that contains the session data.
    */
  var botName: BotName
  
  /**
    * A string used to filter the intents returned in the recentIntentSummaryView structure.  When you specify a filter, only intents with their checkpointLabel field set to that string are returned.
    */
  var checkpointLabelFilter: js.UndefOr[IntentSummaryCheckpointLabel] = js.undefined
  
  /**
    * The ID of the client application user. Amazon Lex uses this to identify a user's conversation with your bot. 
    */
  var userId: UserId
}
object GetSessionRequest {
  
  @scala.inline
  def apply(botAlias: BotAlias, botName: BotName, userId: UserId): GetSessionRequest = {
    val __obj = js.Dynamic.literal(botAlias = botAlias.asInstanceOf[js.Any], botName = botName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSessionRequest]
  }
  
  @scala.inline
  implicit class GetSessionRequestMutableBuilder[Self <: GetSessionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBotAlias(value: BotAlias): Self = StObject.set(x, "botAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotName(value: BotName): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckpointLabelFilter(value: IntentSummaryCheckpointLabel): Self = StObject.set(x, "checkpointLabelFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckpointLabelFilterUndefined: Self = StObject.set(x, "checkpointLabelFilter", js.undefined)
    
    @scala.inline
    def setUserId(value: UserId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
