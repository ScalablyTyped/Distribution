package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackUVsFrontUVsPQ extends js.Object {
  var backUVs: js.UndefOr[babylonjsLib.BABYLONNs.Vector4] = js.undefined
  var frontUVs: js.UndefOr[babylonjsLib.BABYLONNs.Vector4] = js.undefined
  var p: js.UndefOr[scala.Double] = js.undefined
  var q: js.UndefOr[scala.Double] = js.undefined
  var radialSegments: js.UndefOr[scala.Double] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
  var sideOrientation: js.UndefOr[scala.Double] = js.undefined
  var tube: js.UndefOr[scala.Double] = js.undefined
  var tubularSegments: js.UndefOr[scala.Double] = js.undefined
  var updatable: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_BackUVsFrontUVsPQ {
  @scala.inline
  def apply(
    backUVs: babylonjsLib.BABYLONNs.Vector4 = null,
    frontUVs: babylonjsLib.BABYLONNs.Vector4 = null,
    p: scala.Int | scala.Double = null,
    q: scala.Int | scala.Double = null,
    radialSegments: scala.Int | scala.Double = null,
    radius: scala.Int | scala.Double = null,
    sideOrientation: scala.Int | scala.Double = null,
    tube: scala.Int | scala.Double = null,
    tubularSegments: scala.Int | scala.Double = null,
    updatable: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_BackUVsFrontUVsPQ = {
    val __obj = js.Dynamic.literal()
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs)
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs)
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (radialSegments != null) __obj.updateDynamic("radialSegments")(radialSegments.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (tube != null) __obj.updateDynamic("tube")(tube.asInstanceOf[js.Any])
    if (tubularSegments != null) __obj.updateDynamic("tubularSegments")(tubularSegments.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable)
    __obj.asInstanceOf[Anon_BackUVsFrontUVsPQ]
  }
}

