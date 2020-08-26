package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBotAliasRequest extends js.Object {
  /**
    * The name of the bot.
    */
  var botName: BotName = js.native
  /**
    * The version of the bot.
    */
  var botVersion: Version = js.native
  /**
    * Identifies a specific revision of the $LATEST version. When you create a new bot alias, leave the checksum field blank. If you specify a checksum you get a BadRequestException exception. When you want to update a bot alias, set the checksum field to the checksum of the most recent revision of the $LATEST version. If you don't specify the  checksum field, or if the checksum does not match the $LATEST version, you get a PreconditionFailedException exception.
    */
  var checksum: js.UndefOr[String] = js.native
  /**
    * Settings for conversation logs for the alias.
    */
  var conversationLogs: js.UndefOr[ConversationLogsRequest] = js.native
  /**
    * A description of the alias.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The name of the alias. The name is not case sensitive.
    */
  var name: AliasName = js.native
  /**
    * A list of tags to add to the bot alias. You can only add tags when you create an alias, you can't use the PutBotAlias operation to update the tags on a bot alias. To update tags, use the TagResource operation.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object PutBotAliasRequest {
  @scala.inline
  def apply(botName: BotName, botVersion: Version, name: AliasName): PutBotAliasRequest = {
    val __obj = js.Dynamic.literal(botName = botName.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBotAliasRequest]
  }
  @scala.inline
  implicit class PutBotAliasRequestOps[Self <: PutBotAliasRequest] (val x: Self) extends AnyVal {
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
    def setBotVersion(value: Version): Self = this.set("botVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: AliasName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setChecksum(value: String): Self = this.set("checksum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecksum: Self = this.set("checksum", js.undefined)
    @scala.inline
    def setConversationLogs(value: ConversationLogsRequest): Self = this.set("conversationLogs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConversationLogs: Self = this.set("conversationLogs", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

