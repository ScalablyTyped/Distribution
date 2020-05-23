package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delta extends js.Object {
  var delta: js.UndefOr[Double] = js.undefined
  var facetNb: js.UndefOr[Double] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var storage: js.UndefOr[js.Array[js.Any]] = js.undefined
}

object Delta {
  @scala.inline
  def apply(
    delta: js.UndefOr[Double] = js.undefined,
    facetNb: js.UndefOr[Double] = js.undefined,
    number: js.UndefOr[Double] = js.undefined,
    storage: js.Array[js.Any] = null
  ): Delta = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delta)) __obj.updateDynamic("delta")(delta.get.asInstanceOf[js.Any])
    if (!js.isUndefined(facetNb)) __obj.updateDynamic("facetNb")(facetNb.get.asInstanceOf[js.Any])
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number.get.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta]
  }
}

