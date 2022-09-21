package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBotAliasResponse extends StObject {
  
  /**
    * The identifier of the updated bot alias.
    */
  var botAliasId: js.UndefOr[BotAliasId] = js.undefined
  
  /**
    * The updated Lambda functions to use in each locale for the bot alias.
    */
  var botAliasLocaleSettings: js.UndefOr[BotAliasLocaleSettingsMap] = js.undefined
  
  /**
    * The updated name of the bot alias.
    */
  var botAliasName: js.UndefOr[Name] = js.undefined
  
  /**
    * The current status of the bot alias. When the status is Available the alias is ready for use.
    */
  var botAliasStatus: js.UndefOr[BotAliasStatus] = js.undefined
  
  /**
    * The identifier of the bot with the updated alias.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The updated version of the bot that the alias points to.
    */
  var botVersion: js.UndefOr[BotVersion] = js.undefined
  
  /**
    * The updated settings for storing conversation logs in Amazon CloudWatch Logs and Amazon S3 buckets.
    */
  var conversationLogSettings: js.UndefOr[ConversationLogSettings] = js.undefined
  
  /**
    * A timestamp of the date and time that the bot was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The updated description of the bot alias.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * A timestamp of the date and time that the bot was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  var sentimentAnalysisSettings: js.UndefOr[SentimentAnalysisSettings] = js.undefined
}
object UpdateBotAliasResponse {
  
  inline def apply(): UpdateBotAliasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBotAliasResponse]
  }
  
  extension [Self <: UpdateBotAliasResponse](x: Self) {
    
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
