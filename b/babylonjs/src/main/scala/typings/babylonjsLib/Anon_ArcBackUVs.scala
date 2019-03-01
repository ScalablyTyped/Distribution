package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArcBackUVs extends js.Object {
  var arc: js.UndefOr[scala.Double] = js.undefined
  var backUVs: js.UndefOr[babylonjsLib.BABYLONNs.Vector4] = js.undefined
  var diameter: js.UndefOr[scala.Double] = js.undefined
  var diameterBottom: js.UndefOr[scala.Double] = js.undefined
  var diameterTop: js.UndefOr[scala.Double] = js.undefined
  var enclose: js.UndefOr[scala.Boolean] = js.undefined
  var faceColors: js.UndefOr[js.Array[babylonjsLib.BABYLONNs.Color4]] = js.undefined
  var faceUV: js.UndefOr[js.Array[babylonjsLib.BABYLONNs.Vector4]] = js.undefined
  var frontUVs: js.UndefOr[babylonjsLib.BABYLONNs.Vector4] = js.undefined
  var hasRings: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var sideOrientation: js.UndefOr[scala.Double] = js.undefined
  var subdivisions: js.UndefOr[scala.Double] = js.undefined
  var tessellation: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ArcBackUVs {
  @scala.inline
  def apply(
    arc: scala.Int | scala.Double = null,
    backUVs: babylonjsLib.BABYLONNs.Vector4 = null,
    diameter: scala.Int | scala.Double = null,
    diameterBottom: scala.Int | scala.Double = null,
    diameterTop: scala.Int | scala.Double = null,
    enclose: js.UndefOr[scala.Boolean] = js.undefined,
    faceColors: js.Array[babylonjsLib.BABYLONNs.Color4] = null,
    faceUV: js.Array[babylonjsLib.BABYLONNs.Vector4] = null,
    frontUVs: babylonjsLib.BABYLONNs.Vector4 = null,
    hasRings: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    sideOrientation: scala.Int | scala.Double = null,
    subdivisions: scala.Int | scala.Double = null,
    tessellation: scala.Int | scala.Double = null
  ): Anon_ArcBackUVs = {
    val __obj = js.Dynamic.literal()
    if (arc != null) __obj.updateDynamic("arc")(arc.asInstanceOf[js.Any])
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs)
    if (diameter != null) __obj.updateDynamic("diameter")(diameter.asInstanceOf[js.Any])
    if (diameterBottom != null) __obj.updateDynamic("diameterBottom")(diameterBottom.asInstanceOf[js.Any])
    if (diameterTop != null) __obj.updateDynamic("diameterTop")(diameterTop.asInstanceOf[js.Any])
    if (!js.isUndefined(enclose)) __obj.updateDynamic("enclose")(enclose)
    if (faceColors != null) __obj.updateDynamic("faceColors")(faceColors)
    if (faceUV != null) __obj.updateDynamic("faceUV")(faceUV)
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs)
    if (!js.isUndefined(hasRings)) __obj.updateDynamic("hasRings")(hasRings)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (subdivisions != null) __obj.updateDynamic("subdivisions")(subdivisions.asInstanceOf[js.Any])
    if (tessellation != null) __obj.updateDynamic("tessellation")(tessellation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArcBackUVs]
  }
}

