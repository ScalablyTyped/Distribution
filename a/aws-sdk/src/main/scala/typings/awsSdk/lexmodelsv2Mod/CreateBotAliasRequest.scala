package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBotAliasRequest extends StObject {
  
  /**
    * Maps configuration information to a specific locale. You can use this parameter to specify a specific Lambda function to run different functions in different locales.
    */
  var botAliasLocaleSettings: js.UndefOr[BotAliasLocaleSettingsMap] = js.undefined
  
  /**
    * The alias to create. The name must be unique for the bot.
    */
  var botAliasName: Name
  
  /**
    * The unique identifier of the bot that the alias applies to.
    */
  var botId: Id
  
  /**
    * The version of the bot that this alias points to. You can use the UpdateBotAlias operation to change the bot version associated with the alias.
    */
  var botVersion: js.UndefOr[NumericalBotVersion] = js.undefined
  
  /**
    * Specifies whether Amazon Lex logs text and audio for a conversation with the bot. When you enable conversation logs, text logs store text input, transcripts of audio input, and associated metadata in Amazon CloudWatch Logs. Audio logs store audio input in Amazon S3.
    */
  var conversationLogSettings: js.UndefOr[ConversationLogSettings] = js.undefined
  
  /**
    * A description of the alias. Use this description to help identify the alias.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  var sentimentAnalysisSettings: js.UndefOr[SentimentAnalysisSettings] = js.undefined
  
  /**
    * A list of tags to add to the bot alias. You can only add tags when you create an alias, you can't use the UpdateBotAlias operation to update the tags on a bot alias. To update tags, use the TagResource operation.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateBotAliasRequest {
  
  inline def apply(botAliasName: Name, botId: Id): CreateBotAliasRequest = {
    val __obj = js.Dynamic.literal(botAliasName = botAliasName.asInstanceOf[js.Any], botId = botId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBotAliasRequest]
  }
  
  extension [Self <: CreateBotAliasRequest](x: Self) {
    
    inline def setBotAliasLocaleSettings(value: BotAliasLocaleSettingsMap): Self = StObject.set(x, "botAliasLocaleSettings", value.asInstanceOf[js.Any])
    
    inline def setBotAliasLocaleSettingsUndefined: Self = StObject.set(x, "botAliasLocaleSettings", js.undefined)
    
    inline def setBotAliasName(value: Name): Self = StObject.set(x, "botAliasName", value.asInstanceOf[js.Any])
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: NumericalBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setConversationLogSettings(value: ConversationLogSettings): Self = StObject.set(x, "conversationLogSettings", value.asInstanceOf[js.Any])
    
    inline def setConversationLogSettingsUndefined: Self = StObject.set(x, "conversationLogSettings", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setSentimentAnalysisSettings(value: SentimentAnalysisSettings): Self = StObject.set(x, "sentimentAnalysisSettings", value.asInstanceOf[js.Any])
    
    inline def setSentimentAnalysisSettingsUndefined: Self = StObject.set(x, "sentimentAnalysisSettings", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
