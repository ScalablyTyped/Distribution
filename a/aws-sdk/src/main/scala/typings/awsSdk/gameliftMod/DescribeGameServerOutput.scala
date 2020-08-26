package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGameServerOutput extends js.Object {
  /**
    * Object that describes the requested game server resource.
    */
  var GameServer: js.UndefOr[typings.awsSdk.gameliftMod.GameServer] = js.native
}

object DescribeGameServerOutput {
  @scala.inline
  def apply(): DescribeGameServerOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGameServerOutput]
  }
  @scala.inline
  implicit class DescribeGameServerOutputOps[Self <: DescribeGameServerOutput] (val x: Self) extends AnyVal {
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
    def setGameServer(value: GameServer): Self = this.set("GameServer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGameServer: Self = this.set("GameServer", js.undefined)
  }
  
}

