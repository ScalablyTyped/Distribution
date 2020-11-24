package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutBotAliasResponse extends js.Object {
  
  /**
    * The name of the bot that the alias points to.
    */
  var botName: js.UndefOr[BotName] = js.native
  
  /**
    * The version of the bot that the alias points to.
    */
  var botVersion: js.UndefOr[Version] = js.native
  
  /**
    * The checksum for the current version of the alias.
    */
  var checksum: js.UndefOr[String] = js.native
  
  /**
    * The settings that determine how Amazon Lex uses conversation logs for the alias.
    */
  var conversationLogs: js.UndefOr[ConversationLogsResponse] = js.native
  
  /**
    * The date that the bot alias was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * A description of the alias.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * The date that the bot alias was updated. When you create a resource, the creation date and the last updated date are the same.
    */
  var lastUpdatedDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the alias.
    */
  var name: js.UndefOr[AliasName] = js.native
  
  /**
    * A list of tags associated with a bot.
    */
  var tags: js.UndefOr[TagList] = js.native
}
object PutBotAliasResponse {
  
  @scala.inline
  def apply(): PutBotAliasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutBotAliasResponse]
  }
  
  @scala.inline
  implicit class PutBotAliasResponseOps[Self <: PutBotAliasResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBotName(value: BotName): Self = this.set("botName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBotName: Self = this.set("botName", js.undefined)
    
    @scala.inline
    def setBotVersion(value: Version): Self = this.set("botVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBotVersion: Self = this.set("botVersion", js.undefined)
    
    @scala.inline
    def setChecksum(value: String): Self = this.set("checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecksum: Self = this.set("checksum", js.undefined)
    
    @scala.inline
    def setConversationLogs(value: ConversationLogsResponse): Self = this.set("conversationLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConversationLogs: Self = this.set("conversationLogs", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: Timestamp): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setLastUpdatedDate(value: Timestamp): Self = this.set("lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedDate: Self = this.set("lastUpdatedDate", js.undefined)
    
    @scala.inline
    def setName(value: AliasName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
