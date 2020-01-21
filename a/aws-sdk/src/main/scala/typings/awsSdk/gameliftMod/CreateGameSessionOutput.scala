package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGameSessionOutput extends js.Object {
  /**
    * Object that describes the newly created game session record.
    */
  var GameSession: js.UndefOr[typings.awsSdk.gameliftMod.GameSession] = js.native
}

object CreateGameSessionOutput {
  @scala.inline
  def apply(GameSession: GameSession = null): CreateGameSessionOutput = {
    val __obj = js.Dynamic.literal()
    if (GameSession != null) __obj.updateDynamic("GameSession")(GameSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGameSessionOutput]
  }
}

