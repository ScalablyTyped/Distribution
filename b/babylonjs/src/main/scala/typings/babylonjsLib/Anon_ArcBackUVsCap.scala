package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArcBackUVsCap extends js.Object {
  var arc: js.UndefOr[scala.Double] = js.undefined
  var backUVs: js.UndefOr[babylonjsLib.BABYLONNs.Vector4] = js.undefined
  var cap: js.UndefOr[scala.Double] = js.undefined
  var clip: js.UndefOr[scala.Double] = js.undefined
  var closed: js.UndefOr[scala.Boolean] = js.undefined
  var frontUVs: js.UndefOr[babylonjsLib.BABYLONNs.Vector4] = js.undefined
  var invertUV: js.UndefOr[scala.Boolean] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
  var shape: js.Array[babylonjsLib.BABYLONNs.Vector3]
  var sideOrientation: js.UndefOr[scala.Double] = js.undefined
  var tessellation: js.UndefOr[scala.Double] = js.undefined
  var updatable: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ArcBackUVsCap {
  @scala.inline
  def apply(
    shape: js.Array[babylonjsLib.BABYLONNs.Vector3],
    arc: scala.Int | scala.Double = null,
    backUVs: babylonjsLib.BABYLONNs.Vector4 = null,
    cap: scala.Int | scala.Double = null,
    clip: scala.Int | scala.Double = null,
    closed: js.UndefOr[scala.Boolean] = js.undefined,
    frontUVs: babylonjsLib.BABYLONNs.Vector4 = null,
    invertUV: js.UndefOr[scala.Boolean] = js.undefined,
    radius: scala.Int | scala.Double = null,
    sideOrientation: scala.Int | scala.Double = null,
    tessellation: scala.Int | scala.Double = null,
    updatable: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ArcBackUVsCap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("shape")(shape)
    if (arc != null) __obj.updateDynamic("arc")(arc.asInstanceOf[js.Any])
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs)
    if (cap != null) __obj.updateDynamic("cap")(cap.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed)
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs)
    if (!js.isUndefined(invertUV)) __obj.updateDynamic("invertUV")(invertUV)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (tessellation != null) __obj.updateDynamic("tessellation")(tessellation.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable)
    __obj.asInstanceOf[Anon_ArcBackUVsCap]
  }
}

