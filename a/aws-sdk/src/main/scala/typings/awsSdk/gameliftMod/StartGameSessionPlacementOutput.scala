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
  def apply(): StartGameSessionPlacementOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartGameSessionPlacementOutput]
  }
  @scala.inline
  implicit class StartGameSessionPlacementOutputOps[Self <: StartGameSessionPlacementOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGameSessionPlacement(value: GameSessionPlacement): Self = this.set("GameSessionPlacement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGameSessionPlacement: Self = this.set("GameSessionPlacement", js.undefined)
  }
  
}

