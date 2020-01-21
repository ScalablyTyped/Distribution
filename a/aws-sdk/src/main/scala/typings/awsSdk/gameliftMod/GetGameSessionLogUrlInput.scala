package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGameSessionLogUrlInput extends js.Object {
  /**
    * A unique identifier for the game session to get logs for. 
    */
  var GameSessionId: ArnStringModel = js.native
}

object GetGameSessionLogUrlInput {
  @scala.inline
  def apply(GameSessionId: ArnStringModel): GetGameSessionLogUrlInput = {
    val __obj = js.Dynamic.literal(GameSessionId = GameSessionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetGameSessionLogUrlInput]
  }
}

