package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArcBackUVsFrontUVs extends js.Object {
  var arc: js.UndefOr[scala.Double] = js.undefined
  var backUVs: js.UndefOr[babylonjsLib.BABYLONNs.Vector4] = js.undefined
  var frontUVs: js.UndefOr[babylonjsLib.BABYLONNs.Vector4] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
  var sideOrientation: js.UndefOr[scala.Double] = js.undefined
  var tessellation: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ArcBackUVsFrontUVs {
  @scala.inline
  def apply(
    arc: scala.Int | scala.Double = null,
    backUVs: babylonjsLib.BABYLONNs.Vector4 = null,
    frontUVs: babylonjsLib.BABYLONNs.Vector4 = null,
    radius: scala.Int | scala.Double = null,
    sideOrientation: scala.Int | scala.Double = null,
    tessellation: scala.Int | scala.Double = null
  ): Anon_ArcBackUVsFrontUVs = {
    val __obj = js.Dynamic.literal()
    if (arc != null) __obj.updateDynamic("arc")(arc.asInstanceOf[js.Any])
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs)
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (tessellation != null) __obj.updateDynamic("tessellation")(tessellation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArcBackUVsFrontUVs]
  }
}

