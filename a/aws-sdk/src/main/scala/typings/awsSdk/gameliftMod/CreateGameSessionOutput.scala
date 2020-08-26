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
  def apply(): CreateGameSessionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGameSessionOutput]
  }
  @scala.inline
  implicit class CreateGameSessionOutputOps[Self <: CreateGameSessionOutput] (val x: Self) extends AnyVal {
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
    def setGameSession(value: GameSession): Self = this.set("GameSession", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGameSession: Self = this.set("GameSession", js.undefined)
  }
  
}

