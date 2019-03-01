package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackUVsCap extends js.Object {
  var backUVs: js.UndefOr[babylonjsLib.BABYLONNs.Vector4] = js.undefined
  var cap: js.UndefOr[scala.Double] = js.undefined
  var frontUVs: js.UndefOr[babylonjsLib.BABYLONNs.Vector4] = js.undefined
  var instance: js.UndefOr[babylonjsLib.BABYLONNs.Mesh] = js.undefined
  var invertUV: js.UndefOr[scala.Boolean] = js.undefined
  var path: js.Array[babylonjsLib.BABYLONNs.Vector3]
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var scale: js.UndefOr[scala.Double] = js.undefined
  var shape: js.Array[babylonjsLib.BABYLONNs.Vector3]
  var sideOrientation: js.UndefOr[scala.Double] = js.undefined
  var updatable: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_BackUVsCap {
  @scala.inline
  def apply(
    path: js.Array[babylonjsLib.BABYLONNs.Vector3],
    shape: js.Array[babylonjsLib.BABYLONNs.Vector3],
    backUVs: babylonjsLib.BABYLONNs.Vector4 = null,
    cap: scala.Int | scala.Double = null,
    frontUVs: babylonjsLib.BABYLONNs.Vector4 = null,
    instance: babylonjsLib.BABYLONNs.Mesh = null,
    invertUV: js.UndefOr[scala.Boolean] = js.undefined,
    rotation: scala.Int | scala.Double = null,
    scale: scala.Int | scala.Double = null,
    sideOrientation: scala.Int | scala.Double = null,
    updatable: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_BackUVsCap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("shape")(shape)
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs)
    if (cap != null) __obj.updateDynamic("cap")(cap.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs)
    if (instance != null) __obj.updateDynamic("instance")(instance)
    if (!js.isUndefined(invertUV)) __obj.updateDynamic("invertUV")(invertUV)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable)
    __obj.asInstanceOf[Anon_BackUVsCap]
  }
}

