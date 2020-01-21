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
  def apply(GameSessionPlacement: GameSessionPlacement = null): DescribeGameSessionPlacementOutput = {
    val __obj = js.Dynamic.literal()
    if (GameSessionPlacement != null) __obj.updateDynamic("GameSessionPlacement")(GameSessionPlacement.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGameSessionPlacementOutput]
  }
}

