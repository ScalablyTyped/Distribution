package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelta extends js.Object {
  var delta: js.UndefOr[Double] = js.undefined
  var facetNb: js.UndefOr[Double] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var storage: js.UndefOr[js.Array[js.Any]] = js.undefined
}

object AnonDelta {
  @scala.inline
  def apply(
    delta: Int | Double = null,
    facetNb: Int | Double = null,
    number: Int | Double = null,
    storage: js.Array[js.Any] = null
  ): AnonDelta = {
    val __obj = js.Dynamic.literal()
    if (delta != null) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    if (facetNb != null) __obj.updateDynamic("facetNb")(facetNb.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelta]
  }
}

