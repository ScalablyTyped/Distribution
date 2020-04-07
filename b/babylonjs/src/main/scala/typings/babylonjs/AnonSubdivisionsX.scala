package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSubdivisionsX extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var subdivisions: js.UndefOr[Double] = js.undefined
  var subdivisionsX: js.UndefOr[Double] = js.undefined
  var subdivisionsY: js.UndefOr[Double] = js.undefined
  var updatable: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonSubdivisionsX {
  @scala.inline
  def apply(
    height: Int | Double = null,
    subdivisions: Int | Double = null,
    subdivisionsX: Int | Double = null,
    subdivisionsY: Int | Double = null,
    updatable: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): AnonSubdivisionsX = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (subdivisions != null) __obj.updateDynamic("subdivisions")(subdivisions.asInstanceOf[js.Any])
    if (subdivisionsX != null) __obj.updateDynamic("subdivisionsX")(subdivisionsX.asInstanceOf[js.Any])
    if (subdivisionsY != null) __obj.updateDynamic("subdivisionsY")(subdivisionsY.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSubdivisionsX]
  }
}

