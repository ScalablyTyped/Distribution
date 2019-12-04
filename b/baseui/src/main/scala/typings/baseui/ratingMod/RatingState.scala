package typings.baseui.ratingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RatingState extends js.Object {
  var previewIndex: js.UndefOr[Double] = js.undefined
}

object RatingState {
  @scala.inline
  def apply(previewIndex: Int | Double = null): RatingState = {
    val __obj = js.Dynamic.literal()
    if (previewIndex != null) __obj.updateDynamic("previewIndex")(previewIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RatingState]
  }
}

