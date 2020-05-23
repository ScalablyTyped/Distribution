package typings.babylonjs.anon

import typings.babylonjs.mathVectorMod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arc extends js.Object {
  var arc: js.UndefOr[Double] = js.undefined
  var backUVs: js.UndefOr[Vector4] = js.undefined
  var diameter: js.UndefOr[Double] = js.undefined
  var diameterX: js.UndefOr[Double] = js.undefined
  var diameterY: js.UndefOr[Double] = js.undefined
  var diameterZ: js.UndefOr[Double] = js.undefined
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  var segments: js.UndefOr[Double] = js.undefined
  var sideOrientation: js.UndefOr[Double] = js.undefined
  var slice: js.UndefOr[Double] = js.undefined
}

object Arc {
  @scala.inline
  def apply(
    arc: js.UndefOr[Double] = js.undefined,
    backUVs: Vector4 = null,
    diameter: js.UndefOr[Double] = js.undefined,
    diameterX: js.UndefOr[Double] = js.undefined,
    diameterY: js.UndefOr[Double] = js.undefined,
    diameterZ: js.UndefOr[Double] = js.undefined,
    frontUVs: Vector4 = null,
    segments: js.UndefOr[Double] = js.undefined,
    sideOrientation: js.UndefOr[Double] = js.undefined,
    slice: js.UndefOr[Double] = js.undefined
  ): Arc = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arc)) __obj.updateDynamic("arc")(arc.get.asInstanceOf[js.Any])
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs.asInstanceOf[js.Any])
    if (!js.isUndefined(diameter)) __obj.updateDynamic("diameter")(diameter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(diameterX)) __obj.updateDynamic("diameterX")(diameterX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(diameterY)) __obj.updateDynamic("diameterY")(diameterY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(diameterZ)) __obj.updateDynamic("diameterZ")(diameterZ.get.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs.asInstanceOf[js.Any])
    if (!js.isUndefined(segments)) __obj.updateDynamic("segments")(segments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sideOrientation)) __obj.updateDynamic("sideOrientation")(sideOrientation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slice)) __obj.updateDynamic("slice")(slice.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arc]
  }
}

