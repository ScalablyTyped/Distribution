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
    * A numeric representation of the model's certainty in the item's suitability. For more information on scoring logic, see how-scores-work.
    */
  var score: js.UndefOr[Score] = js.native
}

object PredictedItem {
  @scala.inline
  def apply(itemId: ItemID = null, score: Int | Double = null): PredictedItem = {
    val __obj = js.Dynamic.literal()
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredictedItem]
  }
}

