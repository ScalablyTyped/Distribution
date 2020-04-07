package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.mathVectorMod.Vector4
import typings.babylonjs.meshMod.Mesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRadiusFunction extends js.Object {
  var arc: js.UndefOr[Double] = js.undefined
  var backUVs: js.UndefOr[Vector4] = js.undefined
  var cap: js.UndefOr[Double] = js.undefined
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  var instance: js.UndefOr[Mesh] = js.undefined
  var invertUV: js.UndefOr[Boolean] = js.undefined
  var path: js.Array[Vector3]
  var radius: js.UndefOr[Double] = js.undefined
  var radiusFunction: js.UndefOr[js.Function2[/* i */ Double, /* distance */ Double, Double]] = js.undefined
  var sideOrientation: js.UndefOr[Double] = js.undefined
  var tessellation: js.UndefOr[Double] = js.undefined
  var updatable: js.UndefOr[Boolean] = js.undefined
}

object AnonRadiusFunction {
  @scala.inline
  def apply(
    path: js.Array[Vector3],
    arc: Int | Double = null,
    backUVs: Vector4 = null,
    cap: Int | Double = null,
    frontUVs: Vector4 = null,
    instance: Mesh = null,
    invertUV: js.UndefOr[Boolean] = js.undefined,
    radius: Int | Double = null,
    radiusFunction: (/* i */ Double, /* distance */ Double) => Double = null,
    sideOrientation: Int | Double = null,
    tessellation: Int | Double = null,
    updatable: js.UndefOr[Boolean] = js.undefined
  ): AnonRadiusFunction = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (arc != null) __obj.updateDynamic("arc")(arc.asInstanceOf[js.Any])
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs.asInstanceOf[js.Any])
    if (cap != null) __obj.updateDynamic("cap")(cap.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (!js.isUndefined(invertUV)) __obj.updateDynamic("invertUV")(invertUV.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (radiusFunction != null) __obj.updateDynamic("radiusFunction")(js.Any.fromFunction2(radiusFunction))
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (tessellation != null) __obj.updateDynamic("tessellation")(tessellation.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRadiusFunction]
  }
}

