package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartGameSessionPlacementOutput extends js.Object {
  /**
    * Object that describes the newly created game session placement. This object includes all the information provided in the request, as well as start/end time stamps and placement status. 
    */
  var GameSessionPlacement: js.UndefOr[typings.awsSdk.gameliftMod.GameSessionPlacement] = js.native
}

object StartGameSessionPlacementOutput {
  @scala.inline
  def apply(GameSessionPlacement: GameSessionPlacement = null): StartGameSessionPlacementOutput = {
    val __obj = js.Dynamic.literal()
    if (GameSessionPlacement != null) __obj.updateDynamic("GameSessionPlacement")(GameSessionPlacement.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartGameSessionPlacementOutput]
  }
}

