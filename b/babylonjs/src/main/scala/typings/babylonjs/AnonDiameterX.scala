package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDiameterX extends js.Object {
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
  var updatable: js.UndefOr[Boolean] = js.undefined
}

object AnonDiameterX {
  @scala.inline
  def apply(
    arc: Int | Double = null,
    backUVs: Vector4 = null,
    diameter: Int | Double = null,
    diameterX: Int | Double = null,
    diameterY: Int | Double = null,
    diameterZ: Int | Double = null,
    frontUVs: Vector4 = null,
    segments: Int | Double = null,
    sideOrientation: Int | Double = null,
    slice: Int | Double = null,
    updatable: js.UndefOr[Boolean] = js.undefined
  ): AnonDiameterX = {
    val __obj = js.Dynamic.literal()
    if (arc != null) __obj.updateDynamic("arc")(arc.asInstanceOf[js.Any])
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs.asInstanceOf[js.Any])
    if (diameter != null) __obj.updateDynamic("diameter")(diameter.asInstanceOf[js.Any])
    if (diameterX != null) __obj.updateDynamic("diameterX")(diameterX.asInstanceOf[js.Any])
    if (diameterY != null) __obj.updateDynamic("diameterY")(diameterY.asInstanceOf[js.Any])
    if (diameterZ != null) __obj.updateDynamic("diameterZ")(diameterZ.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs.asInstanceOf[js.Any])
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (slice != null) __obj.updateDynamic("slice")(slice.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDiameterX]
  }
}

