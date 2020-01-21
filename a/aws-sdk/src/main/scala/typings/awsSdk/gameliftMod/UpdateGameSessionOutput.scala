package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGameSessionOutput extends js.Object {
  /**
    * The updated game session metadata.
    */
  var GameSession: js.UndefOr[typings.awsSdk.gameliftMod.GameSession] = js.native
}

object UpdateGameSessionOutput {
  @scala.inline
  def apply(GameSession: GameSession = null): UpdateGameSessionOutput = {
    val __obj = js.Dynamic.literal()
    if (GameSession != null) __obj.updateDynamic("GameSession")(GameSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGameSessionOutput]
  }
}

