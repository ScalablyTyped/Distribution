package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.mathVectorMod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClip extends js.Object {
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

object AnonClip {
  @scala.inline
  def apply(
    shape: js.Array[Vector3],
    arc: Int | Double = null,
    backUVs: Vector4 = null,
    cap: Int | Double = null,
    clip: Int | Double = null,
    closed: js.UndefOr[Boolean] = js.undefined,
    frontUVs: Vector4 = null,
    invertUV: js.UndefOr[Boolean] = js.undefined,
    radius: Int | Double = null,
    sideOrientation: Int | Double = null,
    tessellation: Int | Double = null,
    updatable: js.UndefOr[Boolean] = js.undefined
  ): AnonClip = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    if (arc != null) __obj.updateDynamic("arc")(arc.asInstanceOf[js.Any])
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs.asInstanceOf[js.Any])
    if (cap != null) __obj.updateDynamic("cap")(cap.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs.asInstanceOf[js.Any])
    if (!js.isUndefined(invertUV)) __obj.updateDynamic("invertUV")(invertUV.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (tessellation != null) __obj.updateDynamic("tessellation")(tessellation.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClip]
  }
}

