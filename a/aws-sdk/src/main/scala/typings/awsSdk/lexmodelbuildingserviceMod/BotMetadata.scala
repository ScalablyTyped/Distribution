package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BotMetadata extends js.Object {
  /**
    * The date that the bot was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.native
  /**
    * A description of the bot.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The date that the bot was updated. When you create a bot, the creation date and last updated date are the same. 
    */
  var lastUpdatedDate: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the bot. 
    */
  var name: js.UndefOr[BotName] = js.native
  /**
    * The status of the bot.
    */
  var status: js.UndefOr[Status] = js.native
  /**
    * The version of the bot. For a new bot, the version is always $LATEST.
    */
  var version: js.UndefOr[Version] = js.native
}

object BotMetadata {
  @scala.inline
  def apply(
    createdDate: Timestamp = null,
    description: Description = null,
    lastUpdatedDate: Timestamp = null,
    name: BotName = null,
    status: Status = null,
    version: Version = null
  ): BotMetadata = {
    val __obj = js.Dynamic.literal()
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (lastUpdatedDate != null) __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotMetadata]
  }
}

