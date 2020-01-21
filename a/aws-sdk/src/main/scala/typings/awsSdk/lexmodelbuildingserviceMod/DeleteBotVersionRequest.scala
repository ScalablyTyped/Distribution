package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBotVersionRequest extends js.Object {
  /**
    * The name of the bot.
    */
  var name: BotName = js.native
  /**
    * The version of the bot to delete. You cannot delete the $LATEST version of the bot. To delete the $LATEST version, use the DeleteBot operation.
    */
  var version: NumericalVersion = js.native
}

object DeleteBotVersionRequest {
  @scala.inline
  def apply(name: BotName, version: NumericalVersion): DeleteBotVersionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteBotVersionRequest]
  }
}

