package typings.baseui.ratingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RatingState extends js.Object {
  var previewIndex: js.UndefOr[Double] = js.undefined
}

object RatingState {
  @scala.inline
  def apply(previewIndex: js.UndefOr[Double] = js.undefined): RatingState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(previewIndex)) __obj.updateDynamic("previewIndex")(previewIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RatingState]
  }
}

