package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackUVsCapFrontUVs extends js.Object {
  var backUVs: js.UndefOr[babylonjsLib.BABYLONNs.Vector4] = js.undefined
  var cap: js.UndefOr[scala.Double] = js.undefined
  var frontUVs: js.UndefOr[babylonjsLib.BABYLONNs.Vector4] = js.undefined
  var instance: js.UndefOr[babylonjsLib.BABYLONNs.Mesh] = js.undefined
  var invertUV: js.UndefOr[scala.Boolean] = js.undefined
  var path: js.Array[babylonjsLib.BABYLONNs.Vector3]
  var ribbonCloseArray: js.UndefOr[scala.Boolean] = js.undefined
  var ribbonClosePath: js.UndefOr[scala.Boolean] = js.undefined
  var rotationFunction: js.UndefOr[js.Any] = js.undefined
  var scaleFunction: js.UndefOr[js.Any] = js.undefined
  var shape: js.Array[babylonjsLib.BABYLONNs.Vector3]
  var sideOrientation: js.UndefOr[scala.Double] = js.undefined
  var updatable: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_BackUVsCapFrontUVs {
  @scala.inline
  def apply(
    path: js.Array[babylonjsLib.BABYLONNs.Vector3],
    shape: js.Array[babylonjsLib.BABYLONNs.Vector3],
    backUVs: babylonjsLib.BABYLONNs.Vector4 = null,
    cap: scala.Int | scala.Double = null,
    frontUVs: babylonjsLib.BABYLONNs.Vector4 = null,
    instance: babylonjsLib.BABYLONNs.Mesh = null,
    invertUV: js.UndefOr[scala.Boolean] = js.undefined,
    ribbonCloseArray: js.UndefOr[scala.Boolean] = js.undefined,
    ribbonClosePath: js.UndefOr[scala.Boolean] = js.undefined,
    rotationFunction: js.Any = null,
    scaleFunction: js.Any = null,
    sideOrientation: scala.Int | scala.Double = null,
    updatable: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_BackUVsCapFrontUVs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("shape")(shape)
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs)
    if (cap != null) __obj.updateDynamic("cap")(cap.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs)
    if (instance != null) __obj.updateDynamic("instance")(instance)
    if (!js.isUndefined(invertUV)) __obj.updateDynamic("invertUV")(invertUV)
    if (!js.isUndefined(ribbonCloseArray)) __obj.updateDynamic("ribbonCloseArray")(ribbonCloseArray)
    if (!js.isUndefined(ribbonClosePath)) __obj.updateDynamic("ribbonClosePath")(ribbonClosePath)
    if (rotationFunction != null) __obj.updateDynamic("rotationFunction")(rotationFunction)
    if (scaleFunction != null) __obj.updateDynamic("scaleFunction")(scaleFunction)
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable)
    __obj.asInstanceOf[Anon_BackUVsCapFrontUVs]
  }
}

