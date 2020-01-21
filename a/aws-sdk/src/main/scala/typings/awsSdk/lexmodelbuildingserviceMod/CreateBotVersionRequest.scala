package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBotVersionRequest extends js.Object {
  /**
    * Identifies a specific revision of the $LATEST version of the bot. If you specify a checksum and the $LATEST version of the bot has a different checksum, a PreconditionFailedException exception is returned and Amazon Lex doesn't publish a new version. If you don't specify a checksum, Amazon Lex publishes the $LATEST version.
    */
  var checksum: js.UndefOr[String] = js.native
  /**
    * The name of the bot that you want to create a new version of. The name is case sensitive. 
    */
  var name: BotName = js.native
}

object CreateBotVersionRequest {
  @scala.inline
  def apply(name: BotName, checksum: String = null): CreateBotVersionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (checksum != null) __obj.updateDynamic("checksum")(checksum.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBotVersionRequest]
  }
}

