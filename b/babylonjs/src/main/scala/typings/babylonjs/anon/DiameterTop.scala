package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Color4
import typings.babylonjs.BABYLON.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiameterTop extends js.Object {
  var arc: js.UndefOr[Double] = js.undefined
  var backUVs: js.UndefOr[Vector4] = js.undefined
  var cap: js.UndefOr[Double] = js.undefined
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
  var updatable: js.UndefOr[Boolean] = js.undefined
}

object DiameterTop {
  @scala.inline
  def apply(
    arc: js.UndefOr[Double] = js.undefined,
    backUVs: Vector4 = null,
    cap: js.UndefOr[Double] = js.undefined,
    diameter: js.UndefOr[Double] = js.undefined,
    diameterBottom: js.UndefOr[Double] = js.undefined,
    diameterTop: js.UndefOr[Double] = js.undefined,
    enclose: js.UndefOr[Boolean] = js.undefined,
    faceColors: js.Array[Color4] = null,
    faceUV: js.Array[Vector4] = null,
    frontUVs: Vector4 = null,
    hasRings: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    sideOrientation: js.UndefOr[Double] = js.undefined,
    subdivisions: js.UndefOr[Double] = js.undefined,
    tessellation: js.UndefOr[Double] = js.undefined,
    updatable: js.UndefOr[Boolean] = js.undefined
  ): DiameterTop = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arc)) __obj.updateDynamic("arc")(arc.get.asInstanceOf[js.Any])
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs.asInstanceOf[js.Any])
    if (!js.isUndefined(cap)) __obj.updateDynamic("cap")(cap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(diameter)) __obj.updateDynamic("diameter")(diameter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(diameterBottom)) __obj.updateDynamic("diameterBottom")(diameterBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(diameterTop)) __obj.updateDynamic("diameterTop")(diameterTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enclose)) __obj.updateDynamic("enclose")(enclose.get.asInstanceOf[js.Any])
    if (faceColors != null) __obj.updateDynamic("faceColors")(faceColors.asInstanceOf[js.Any])
    if (faceUV != null) __obj.updateDynamic("faceUV")(faceUV.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs.asInstanceOf[js.Any])
    if (!js.isUndefined(hasRings)) __obj.updateDynamic("hasRings")(hasRings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sideOrientation)) __obj.updateDynamic("sideOrientation")(sideOrientation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(subdivisions)) __obj.updateDynamic("subdivisions")(subdivisions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tessellation)) __obj.updateDynamic("tessellation")(tessellation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiameterTop]
  }
}

