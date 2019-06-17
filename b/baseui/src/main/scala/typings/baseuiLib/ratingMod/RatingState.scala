package typings
package baseuiLib.ratingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RatingState extends js.Object {
  var previewIndex: js.UndefOr[scala.Double] = js.undefined
}

object RatingState {
  @scala.inline
  def apply(previewIndex: scala.Int | scala.Double = null): RatingState = {
    val __obj = js.Dynamic.literal()
    if (previewIndex != null) __obj.updateDynamic("previewIndex")(previewIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RatingState]
  }
}

