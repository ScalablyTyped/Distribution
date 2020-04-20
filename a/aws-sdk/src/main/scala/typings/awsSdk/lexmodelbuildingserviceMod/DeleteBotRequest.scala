package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBotRequest extends js.Object {
  /**
    * The name of the bot. The name is case sensitive. 
    */
  var name: BotName = js.native
}

object DeleteBotRequest {
  @scala.inline
  def apply(name: BotName): DeleteBotRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBotRequest]
  }
}

