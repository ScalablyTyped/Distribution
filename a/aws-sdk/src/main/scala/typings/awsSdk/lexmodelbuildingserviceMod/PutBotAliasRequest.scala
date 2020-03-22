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
  def apply(
    botName: BotName,
    botVersion: Version,
    name: AliasName,
    checksum: String = null,
    conversationLogs: ConversationLogsRequest = null,
    description: Description = null,
    tags: TagList = null
  ): PutBotAliasRequest = {
    val __obj = js.Dynamic.literal(botName = botName.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (checksum != null) __obj.updateDynamic("checksum")(checksum.asInstanceOf[js.Any])
    if (conversationLogs != null) __obj.updateDynamic("conversationLogs")(conversationLogs.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBotAliasRequest]
  }
}

