package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBotAliasResponse extends StObject {
  
  /**
    * The unique identifier of the bot alias.
    */
  var botAliasId: js.UndefOr[BotAliasId] = js.undefined
  
  /**
    * Configuration information for a specific locale.
    */
  var botAliasLocaleSettings: js.UndefOr[BotAliasLocaleSettingsMap] = js.undefined
  
  /**
    * The name specified for the bot alias.
    */
  var botAliasName: js.UndefOr[Name] = js.undefined
  
  /**
    * The current status of the alias. The alias is first put into the Creating state. When the alias is ready to be used, it is put into the Available state. You can use the DescribeBotAlias operation to get the current state of an alias.
    */
  var botAliasStatus: js.UndefOr[BotAliasStatus] = js.undefined
  
  /**
    * The unique identifier of the bot that this alias applies to.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The version of the bot associated with this alias.
    */
  var botVersion: js.UndefOr[NumericalBotVersion] = js.undefined
  
  /**
    * The conversation log settings specified for the alias.
    */
  var conversationLogSettings: js.UndefOr[ConversationLogSettings] = js.undefined
  
  /**
    * A Unix timestamp indicating the date and time that the bot alias was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description specified for the bot alias.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  var sentimentAnalysisSettings: js.UndefOr[SentimentAnalysisSettings] = js.undefined
  
  /**
    * A list of tags associated with the bot alias.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateBotAliasResponse {
  
  inline def apply(): CreateBotAliasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBotAliasResponse]
  }
  
  extension [Self <: CreateBotAliasResponse](x: Self) {
    
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
    
    inline def setBotVersion(value: NumericalBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setConversationLogSettings(value: ConversationLogSettings): Self = StObject.set(x, "conversationLogSettings", value.asInstanceOf[js.Any])
    
    inline def setConversationLogSettingsUndefined: Self = StObject.set(x, "conversationLogSettings", js.undefined)
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setSentimentAnalysisSettings(value: SentimentAnalysisSettings): Self = StObject.set(x, "sentimentAnalysisSettings", value.asInstanceOf[js.Any])
    
    inline def setSentimentAnalysisSettingsUndefined: Self = StObject.set(x, "sentimentAnalysisSettings", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
