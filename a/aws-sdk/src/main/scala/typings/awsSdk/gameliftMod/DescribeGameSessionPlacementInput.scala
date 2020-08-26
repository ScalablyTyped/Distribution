package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGameSessionPlacementInput extends js.Object {
  /**
    * A unique identifier for a game session placement to retrieve.
    */
  var PlacementId: IdStringModel = js.native
}

object DescribeGameSessionPlacementInput {
  @scala.inline
  def apply(PlacementId: IdStringModel): DescribeGameSessionPlacementInput = {
    val __obj = js.Dynamic.literal(PlacementId = PlacementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGameSessionPlacementInput]
  }
  @scala.inline
  implicit class DescribeGameSessionPlacementInputOps[Self <: DescribeGameSessionPlacementInput] (val x: Self) extends AnyVal {
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
    def setPlacementId(value: IdStringModel): Self = this.set("PlacementId", value.asInstanceOf[js.Any])
  }
  
}

