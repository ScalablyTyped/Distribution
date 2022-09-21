package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBotAliasResponse extends StObject {
  
  /**
    * A list of events that affect a bot alias. For example, an event is recorded when the version that the alias points to changes.
    */
  var botAliasHistoryEvents: js.UndefOr[BotAliasHistoryEventsList] = js.undefined
  
  /**
    * The identifier of the bot alias.
    */
  var botAliasId: js.UndefOr[BotAliasId] = js.undefined
  
  /**
    * The locale settings that are unique to the alias.
    */
  var botAliasLocaleSettings: js.UndefOr[BotAliasLocaleSettingsMap] = js.undefined
  
  /**
    * The name of the bot alias.
    */
  var botAliasName: js.UndefOr[Name] = js.undefined
  
  /**
    * The current status of the alias. When the alias is Available, the alias is ready for use with your bot.
    */
  var botAliasStatus: js.UndefOr[BotAliasStatus] = js.undefined
  
  /**
    * The identifier of the bot associated with the bot alias.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The version of the bot associated with the bot alias.
    */
  var botVersion: js.UndefOr[BotVersion] = js.undefined
  
  /**
    * Specifics of how Amazon Lex logs text and audio conversations with the bot associated with the alias.
    */
  var conversationLogSettings: js.UndefOr[ConversationLogSettings] = js.undefined
  
  /**
    * A timestamp of the date and time that the alias was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the bot alias.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * A timestamp of the date and time that the alias was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  var sentimentAnalysisSettings: js.UndefOr[SentimentAnalysisSettings] = js.undefined
}
object DescribeBotAliasResponse {
  
  inline def apply(): DescribeBotAliasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBotAliasResponse]
  }
  
  extension [Self <: DescribeBotAliasResponse](x: Self) {
    
    inline def setBotAliasHistoryEvents(value: BotAliasHistoryEventsList): Self = StObject.set(x, "botAliasHistoryEvents", value.asInstanceOf[js.Any])
    
    inline def setBotAliasHistoryEventsUndefined: Self = StObject.set(x, "botAliasHistoryEvents", js.undefined)
    
    inline def setBotAliasHistoryEventsVarargs(value: BotAliasHistoryEvent*): Self = StObject.set(x, "botAliasHistoryEvents", js.Array(value*))
    
    inline def setBotAliasId(value: BotAliasId): Self = StObject.set(x, "botAliasId", value.asInstanceOf[js.Any])
    
    inline def setBotAliasIdUndefined: Self = StObject.set(x, "botAliasId", js.undefined)
    
    inline def setBotAliasLocaleSettings(value: BotAliasLocaleSettingsMap): Self = StObject.set(x, "botAliasLocaleSettings", value.asInstanceOf[js.Any])
    
    inline def setBotAliasLocaleSettingsUndefined: Self = StObject.set(x, "botAliasLocaleSettings", js.undefined)
    
    inline def setBotAliasName(value: Name): Self = StObject.set(x, "botAliasName", value.asInstanceOf[js.Any])
    
    inline def setBotAliasNameUndefined: Self = StObject.set(x, "botAliasName", js.undefined)
    
    inline def setBotAliasStatus(value: BotAliasStatus): Self = StObject.set(x, "botAliasStatus", value.asInstanceOf[js.Any])
    
    inline def setBotAliasStatusUndefined: Self = StObject.set(x, "botAliasStatus", js.undefined)
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setConversationLogSettings(value: ConversationLogSettings): Self = StObject.set(x, "conversationLogSettings", value.asInstanceOf[js.Any])
    
    inline def setConversationLogSettingsUndefined: Self = StObject.set(x, "conversationLogSettings", js.undefined)
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setSentimentAnalysisSettings(value: SentimentAnalysisSettings): Self = StObject.set(x, "sentimentAnalysisSettings", value.asInstanceOf[js.Any])
    
    inline def setSentimentAnalysisSettingsUndefined: Self = StObject.set(x, "sentimentAnalysisSettings", js.undefined)
  }
}
