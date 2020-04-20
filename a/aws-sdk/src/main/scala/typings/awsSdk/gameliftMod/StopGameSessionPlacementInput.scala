package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopGameSessionPlacementInput extends js.Object {
  /**
    * A unique identifier for a game session placement to cancel.
    */
  var PlacementId: IdStringModel = js.native
}

object StopGameSessionPlacementInput {
  @scala.inline
  def apply(PlacementId: IdStringModel): StopGameSessionPlacementInput = {
    val __obj = js.Dynamic.literal(PlacementId = PlacementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopGameSessionPlacementInput]
  }
}

