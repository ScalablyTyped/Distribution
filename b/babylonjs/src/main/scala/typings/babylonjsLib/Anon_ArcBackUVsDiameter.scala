package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArcBackUVsDiameter extends js.Object {
  var arc: js.UndefOr[scala.Double] = js.undefined
  var backUVs: js.UndefOr[babylonjsLib.BABYLONNs.Vector4] = js.undefined
  var diameter: js.UndefOr[scala.Double] = js.undefined
  var diameterX: js.UndefOr[scala.Double] = js.undefined
  var diameterY: js.UndefOr[scala.Double] = js.undefined
  var diameterZ: js.UndefOr[scala.Double] = js.undefined
  var frontUVs: js.UndefOr[babylonjsLib.BABYLONNs.Vector4] = js.undefined
  var segments: js.UndefOr[scala.Double] = js.undefined
  var sideOrientation: js.UndefOr[scala.Double] = js.undefined
  var slice: js.UndefOr[scala.Double] = js.undefined
  var updatable: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ArcBackUVsDiameter {
  @scala.inline
  def apply(
    arc: scala.Int | scala.Double = null,
    backUVs: babylonjsLib.BABYLONNs.Vector4 = null,
    diameter: scala.Int | scala.Double = null,
    diameterX: scala.Int | scala.Double = null,
    diameterY: scala.Int | scala.Double = null,
    diameterZ: scala.Int | scala.Double = null,
    frontUVs: babylonjsLib.BABYLONNs.Vector4 = null,
    segments: scala.Int | scala.Double = null,
    sideOrientation: scala.Int | scala.Double = null,
    slice: scala.Int | scala.Double = null,
    updatable: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ArcBackUVsDiameter = {
    val __obj = js.Dynamic.literal()
    if (arc != null) __obj.updateDynamic("arc")(arc.asInstanceOf[js.Any])
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs)
    if (diameter != null) __obj.updateDynamic("diameter")(diameter.asInstanceOf[js.Any])
    if (diameterX != null) __obj.updateDynamic("diameterX")(diameterX.asInstanceOf[js.Any])
    if (diameterY != null) __obj.updateDynamic("diameterY")(diameterY.asInstanceOf[js.Any])
    if (diameterZ != null) __obj.updateDynamic("diameterZ")(diameterZ.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs)
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (slice != null) __obj.updateDynamic("slice")(slice.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable)
    __obj.asInstanceOf[Anon_ArcBackUVsDiameter]
  }
}

