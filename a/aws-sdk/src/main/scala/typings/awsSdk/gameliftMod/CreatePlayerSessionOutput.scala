package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePlayerSessionOutput extends js.Object {
  /**
    * Object that describes the newly created player session record.
    */
  var PlayerSession: js.UndefOr[typings.awsSdk.gameliftMod.PlayerSession] = js.native
}

object CreatePlayerSessionOutput {
  @scala.inline
  def apply(): CreatePlayerSessionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePlayerSessionOutput]
  }
  @scala.inline
  implicit class CreatePlayerSessionOutputOps[Self <: CreatePlayerSessionOutput] (val x: Self) extends AnyVal {
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
    def setPlayerSession(value: PlayerSession): Self = this.set("PlayerSession", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayerSession: Self = this.set("PlayerSession", js.undefined)
  }
  
}

