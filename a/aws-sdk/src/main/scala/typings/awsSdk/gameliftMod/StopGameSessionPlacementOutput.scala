package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopGameSessionPlacementOutput extends js.Object {
  /**
    * Object that describes the canceled game session placement, with CANCELLED status and an end time stamp. 
    */
  var GameSessionPlacement: js.UndefOr[typings.awsSdk.gameliftMod.GameSessionPlacement] = js.native
}

object StopGameSessionPlacementOutput {
  @scala.inline
  def apply(GameSessionPlacement: GameSessionPlacement = null): StopGameSessionPlacementOutput = {
    val __obj = js.Dynamic.literal()
    if (GameSessionPlacement != null) __obj.updateDynamic("GameSessionPlacement")(GameSessionPlacement.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopGameSessionPlacementOutput]
  }
}

