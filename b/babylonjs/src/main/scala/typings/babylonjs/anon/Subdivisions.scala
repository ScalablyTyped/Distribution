package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subdivisions extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var subdivisions: js.UndefOr[Double] = js.undefined
  var subdivisionsX: js.UndefOr[Double] = js.undefined
  var subdivisionsY: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Subdivisions {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    subdivisions: js.UndefOr[Double] = js.undefined,
    subdivisionsX: js.UndefOr[Double] = js.undefined,
    subdivisionsY: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): Subdivisions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(subdivisions)) __obj.updateDynamic("subdivisions")(subdivisions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(subdivisionsX)) __obj.updateDynamic("subdivisionsX")(subdivisionsX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(subdivisionsY)) __obj.updateDynamic("subdivisionsY")(subdivisionsY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subdivisions]
  }
}

