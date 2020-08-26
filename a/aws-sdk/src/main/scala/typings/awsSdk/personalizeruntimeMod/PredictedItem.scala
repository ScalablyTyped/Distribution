package typings.awsSdk.personalizeruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredictedItem extends js.Object {
  /**
    * The recommended item ID.
    */
  var itemId: js.UndefOr[ItemID] = js.native
  /**
    * A numeric representation of the model's certainty that the item will be the next user selection. For more information on scoring logic, see how-scores-work.
    */
  var score: js.UndefOr[Score] = js.native
}

object PredictedItem {
  @scala.inline
  def apply(): PredictedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PredictedItem]
  }
  @scala.inline
  implicit class PredictedItemOps[Self <: PredictedItem] (val x: Self) extends AnyVal {
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
    def setItemId(value: ItemID): Self = this.set("itemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemId: Self = this.set("itemId", js.undefined)
    @scala.inline
    def setScore(value: Score): Self = this.set("score", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
  }
  
}

