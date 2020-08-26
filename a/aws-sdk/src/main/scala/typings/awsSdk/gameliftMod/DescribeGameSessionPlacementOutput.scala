package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGameSessionPlacementOutput extends js.Object {
  /**
    * Object that describes the requested game session placement.
    */
  var GameSessionPlacement: js.UndefOr[typings.awsSdk.gameliftMod.GameSessionPlacement] = js.native
}

object DescribeGameSessionPlacementOutput {
  @scala.inline
  def apply(): DescribeGameSessionPlacementOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGameSessionPlacementOutput]
  }
  @scala.inline
  implicit class DescribeGameSessionPlacementOutputOps[Self <: DescribeGameSessionPlacementOutput] (val x: Self) extends AnyVal {
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

