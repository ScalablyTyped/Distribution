package typings.babylonjs.anon

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.mathVectorMod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadiusFunction extends js.Object {
  var arc: js.UndefOr[Double] = js.undefined
  var backUVs: js.UndefOr[Vector4] = js.undefined
  var cap: js.UndefOr[Double] = js.undefined
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  var instance: js.UndefOr[typings.babylonjs.meshMod.Mesh] = js.undefined
  var invertUV: js.UndefOr[Boolean] = js.undefined
  var path: js.Array[Vector3]
  var radius: js.UndefOr[Double] = js.undefined
  var radiusFunction: js.UndefOr[js.Function2[/* i */ Double, /* distance */ Double, Double]] = js.undefined
  var sideOrientation: js.UndefOr[Double] = js.undefined
  var tessellation: js.UndefOr[Double] = js.undefined
  var updatable: js.UndefOr[Boolean] = js.undefined
}

object RadiusFunction {
  @scala.inline
  def apply(
    path: js.Array[Vector3],
    arc: js.UndefOr[Double] = js.undefined,
    backUVs: Vector4 = null,
    cap: js.UndefOr[Double] = js.undefined,
    frontUVs: Vector4 = null,
    instance: typings.babylonjs.meshMod.Mesh = null,
    invertUV: js.UndefOr[Boolean] = js.undefined,
    radius: js.UndefOr[Double] = js.undefined,
    radiusFunction: (/* i */ Double, /* distance */ Double) => Double = null,
    sideOrientation: js.UndefOr[Double] = js.undefined,
    tessellation: js.UndefOr[Double] = js.undefined,
    updatable: js.UndefOr[Boolean] = js.undefined
  ): RadiusFunction = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(arc)) __obj.updateDynamic("arc")(arc.get.asInstanceOf[js.Any])
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs.asInstanceOf[js.Any])
    if (!js.isUndefined(cap)) __obj.updateDynamic("cap")(cap.get.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (!js.isUndefined(invertUV)) __obj.updateDynamic("invertUV")(invertUV.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (radiusFunction != null) __obj.updateDynamic("radiusFunction")(js.Any.fromFunction2(radiusFunction))
    if (!js.isUndefined(sideOrientation)) __obj.updateDynamic("sideOrientation")(sideOrientation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tessellation)) __obj.updateDynamic("tessellation")(tessellation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadiusFunction]
  }
}

