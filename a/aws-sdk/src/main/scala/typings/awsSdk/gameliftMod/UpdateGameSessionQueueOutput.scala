package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGameSessionQueueOutput extends js.Object {
  /**
    * An object that describes the newly updated game session queue.
    */
  var GameSessionQueue: js.UndefOr[typings.awsSdk.gameliftMod.GameSessionQueue] = js.native
}

object UpdateGameSessionQueueOutput {
  @scala.inline
  def apply(GameSessionQueue: GameSessionQueue = null): UpdateGameSessionQueueOutput = {
    val __obj = js.Dynamic.literal()
    if (GameSessionQueue != null) __obj.updateDynamic("GameSessionQueue")(GameSessionQueue.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGameSessionQueueOutput]
  }
}

