package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBotAliasResponse extends StObject {
  
  /**
    * The name of the bot that the alias points to.
    */
  var botName: js.UndefOr[BotName] = js.undefined
  
  /**
    * The version of the bot that the alias points to.
    */
  var botVersion: js.UndefOr[Version] = js.undefined
  
  /**
    * The checksum for the current version of the alias.
    */
  var checksum: js.UndefOr[String] = js.undefined
  
  /**
    * The settings that determine how Amazon Lex uses conversation logs for the alias.
    */
  var conversationLogs: js.UndefOr[ConversationLogsResponse] = js.undefined
  
  /**
    * The date that the bot alias was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * A description of the alias.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The date that the bot alias was updated. When you create a resource, the creation date and the last updated date are the same.
    */
  var lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name of the alias.
    */
  var name: js.UndefOr[AliasName] = js.undefined
  
  /**
    * A list of tags associated with a bot.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object PutBotAliasResponse {
  
  @scala.inline
  def apply(): PutBotAliasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutBotAliasResponse]
  }
  
  @scala.inline
  implicit class PutBotAliasResponseMutableBuilder[Self <: PutBotAliasResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBotName(value: BotName): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotNameUndefined: Self = StObject.set(x, "botName", js.undefined)
    
    @scala.inline
    def setBotVersion(value: Version): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    @scala.inline
    def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    @scala.inline
    def setConversationLogs(value: ConversationLogsResponse): Self = StObject.set(x, "conversationLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversationLogsUndefined: Self = StObject.set(x, "conversationLogs", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: Timestamp): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLastUpdatedDate(value: Timestamp): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDateUndefined: Self = StObject.set(x, "lastUpdatedDate", js.undefined)
    
    @scala.inline
    def setName(value: AliasName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
