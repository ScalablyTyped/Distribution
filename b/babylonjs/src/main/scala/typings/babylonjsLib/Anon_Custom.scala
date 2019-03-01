package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Custom extends js.Object {
  var custom: js.UndefOr[js.Any] = js.undefined
  var faceColors: js.UndefOr[js.Array[babylonjsLib.BABYLONNs.Color4]] = js.undefined
  var faceUV: js.UndefOr[js.Array[babylonjsLib.BABYLONNs.Vector4]] = js.undefined
  var sideOrientation: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var sizeX: js.UndefOr[scala.Double] = js.undefined
  var sizeY: js.UndefOr[scala.Double] = js.undefined
  var sizeZ: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[scala.Double] = js.undefined
  var updatable: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Custom {
  @scala.inline
  def apply(
    custom: js.Any = null,
    faceColors: js.Array[babylonjsLib.BABYLONNs.Color4] = null,
    faceUV: js.Array[babylonjsLib.BABYLONNs.Vector4] = null,
    sideOrientation: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null,
    sizeX: scala.Int | scala.Double = null,
    sizeY: scala.Int | scala.Double = null,
    sizeZ: scala.Int | scala.Double = null,
    `type`: scala.Int | scala.Double = null,
    updatable: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Custom = {
    val __obj = js.Dynamic.literal()
    if (custom != null) __obj.updateDynamic("custom")(custom)
    if (faceColors != null) __obj.updateDynamic("faceColors")(faceColors)
    if (faceUV != null) __obj.updateDynamic("faceUV")(faceUV)
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sizeX != null) __obj.updateDynamic("sizeX")(sizeX.asInstanceOf[js.Any])
    if (sizeY != null) __obj.updateDynamic("sizeY")(sizeY.asInstanceOf[js.Any])
    if (sizeZ != null) __obj.updateDynamic("sizeZ")(sizeZ.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable)
    __obj.asInstanceOf[Anon_Custom]
  }
}

