package typings.babylonjs

import typings.babylonjs.BABYLON.Color4
import typings.babylonjs.BABYLON.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDiameterBottom extends js.Object {
  var arc: js.UndefOr[Double] = js.undefined
  var backUVs: js.UndefOr[Vector4] = js.undefined
  var diameter: js.UndefOr[Double] = js.undefined
  var diameterBottom: js.UndefOr[Double] = js.undefined
  var diameterTop: js.UndefOr[Double] = js.undefined
  var enclose: js.UndefOr[Boolean] = js.undefined
  var faceColors: js.UndefOr[js.Array[Color4]] = js.undefined
  var faceUV: js.UndefOr[js.Array[Vector4]] = js.undefined
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  var hasRings: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var sideOrientation: js.UndefOr[Double] = js.undefined
  var subdivisions: js.UndefOr[Double] = js.undefined
  var tessellation: js.UndefOr[Double] = js.undefined
}

object AnonDiameterBottom {
  @scala.inline
  def apply(
    arc: Int | Double = null,
    backUVs: Vector4 = null,
    diameter: Int | Double = null,
    diameterBottom: Int | Double = null,
    diameterTop: Int | Double = null,
    enclose: js.UndefOr[Boolean] = js.undefined,
    faceColors: js.Array[Color4] = null,
    faceUV: js.Array[Vector4] = null,
    frontUVs: Vector4 = null,
    hasRings: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    sideOrientation: Int | Double = null,
    subdivisions: Int | Double = null,
    tessellation: Int | Double = null
  ): AnonDiameterBottom = {
    val __obj = js.Dynamic.literal()
    if (arc != null) __obj.updateDynamic("arc")(arc.asInstanceOf[js.Any])
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs.asInstanceOf[js.Any])
    if (diameter != null) __obj.updateDynamic("diameter")(diameter.asInstanceOf[js.Any])
    if (diameterBottom != null) __obj.updateDynamic("diameterBottom")(diameterBottom.asInstanceOf[js.Any])
    if (diameterTop != null) __obj.updateDynamic("diameterTop")(diameterTop.asInstanceOf[js.Any])
    if (!js.isUndefined(enclose)) __obj.updateDynamic("enclose")(enclose.asInstanceOf[js.Any])
    if (faceColors != null) __obj.updateDynamic("faceColors")(faceColors.asInstanceOf[js.Any])
    if (faceUV != null) __obj.updateDynamic("faceUV")(faceUV.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs.asInstanceOf[js.Any])
    if (!js.isUndefined(hasRings)) __obj.updateDynamic("hasRings")(hasRings.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (subdivisions != null) __obj.updateDynamic("subdivisions")(subdivisions.asInstanceOf[js.Any])
    if (tessellation != null) __obj.updateDynamic("tessellation")(tessellation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDiameterBottom]
  }
}

