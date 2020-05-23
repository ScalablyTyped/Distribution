package typings.babylonjs.anon

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.mathVectorMod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clip extends js.Object {
  var arc: js.UndefOr[Double] = js.undefined
  var backUVs: js.UndefOr[Vector4] = js.undefined
  var cap: js.UndefOr[Double] = js.undefined
  var clip: js.UndefOr[Double] = js.undefined
  var closed: js.UndefOr[Boolean] = js.undefined
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  var invertUV: js.UndefOr[Boolean] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var shape: js.Array[Vector3]
  var sideOrientation: js.UndefOr[Double] = js.undefined
  var tessellation: js.UndefOr[Double] = js.undefined
  var updatable: js.UndefOr[Boolean] = js.undefined
}

object Clip {
  @scala.inline
  def apply(
    shape: js.Array[Vector3],
    arc: js.UndefOr[Double] = js.undefined,
    backUVs: Vector4 = null,
    cap: js.UndefOr[Double] = js.undefined,
    clip: js.UndefOr[Double] = js.undefined,
    closed: js.UndefOr[Boolean] = js.undefined,
    frontUVs: Vector4 = null,
    invertUV: js.UndefOr[Boolean] = js.undefined,
    radius: js.UndefOr[Double] = js.undefined,
    sideOrientation: js.UndefOr[Double] = js.undefined,
    tessellation: js.UndefOr[Double] = js.undefined,
    updatable: js.UndefOr[Boolean] = js.undefined
  ): Clip = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    if (!js.isUndefined(arc)) __obj.updateDynamic("arc")(arc.get.asInstanceOf[js.Any])
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs.asInstanceOf[js.Any])
    if (!js.isUndefined(cap)) __obj.updateDynamic("cap")(cap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clip)) __obj.updateDynamic("clip")(clip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.get.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs.asInstanceOf[js.Any])
    if (!js.isUndefined(invertUV)) __obj.updateDynamic("invertUV")(invertUV.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sideOrientation)) __obj.updateDynamic("sideOrientation")(sideOrientation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tessellation)) __obj.updateDynamic("tessellation")(tessellation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clip]
  }
}

