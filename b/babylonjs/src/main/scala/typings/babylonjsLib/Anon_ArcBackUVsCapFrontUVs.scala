package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArcBackUVsCapFrontUVs extends js.Object {
  var arc: js.UndefOr[scala.Double] = js.undefined
  var backUVs: js.UndefOr[babylonjsLib.BABYLONNs.Vector4] = js.undefined
  var cap: js.UndefOr[scala.Double] = js.undefined
  var frontUVs: js.UndefOr[babylonjsLib.BABYLONNs.Vector4] = js.undefined
  var instance: js.UndefOr[babylonjsLib.BABYLONNs.Mesh] = js.undefined
  var invertUV: js.UndefOr[scala.Boolean] = js.undefined
  var path: js.Array[babylonjsLib.BABYLONNs.Vector3]
  var radius: js.UndefOr[scala.Double] = js.undefined
  var radiusFunction: js.UndefOr[Anon_Distance] = js.undefined
  var sideOrientation: js.UndefOr[scala.Double] = js.undefined
  var tessellation: js.UndefOr[scala.Double] = js.undefined
  var updatable: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ArcBackUVsCapFrontUVs {
  @scala.inline
  def apply(
    path: js.Array[babylonjsLib.BABYLONNs.Vector3],
    arc: scala.Int | scala.Double = null,
    backUVs: babylonjsLib.BABYLONNs.Vector4 = null,
    cap: scala.Int | scala.Double = null,
    frontUVs: babylonjsLib.BABYLONNs.Vector4 = null,
    instance: babylonjsLib.BABYLONNs.Mesh = null,
    invertUV: js.UndefOr[scala.Boolean] = js.undefined,
    radius: scala.Int | scala.Double = null,
    radiusFunction: Anon_Distance = null,
    sideOrientation: scala.Int | scala.Double = null,
    tessellation: scala.Int | scala.Double = null,
    updatable: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ArcBackUVsCapFrontUVs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    if (arc != null) __obj.updateDynamic("arc")(arc.asInstanceOf[js.Any])
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs)
    if (cap != null) __obj.updateDynamic("cap")(cap.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs)
    if (instance != null) __obj.updateDynamic("instance")(instance)
    if (!js.isUndefined(invertUV)) __obj.updateDynamic("invertUV")(invertUV)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (radiusFunction != null) __obj.updateDynamic("radiusFunction")(radiusFunction)
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (tessellation != null) __obj.updateDynamic("tessellation")(tessellation.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable)
    __obj.asInstanceOf[Anon_ArcBackUVsCapFrontUVs]
  }
}

