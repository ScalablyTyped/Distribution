package typings.babylonjs

import typings.babylonjs.BABYLON.Color4
import typings.babylonjs.BABYLON.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTileWidth extends js.Object {
  var alignHorizontal: js.UndefOr[Double] = js.undefined
  var alignVertical: js.UndefOr[Double] = js.undefined
  var depth: js.UndefOr[Double] = js.undefined
  var faceColors: js.UndefOr[js.Array[Color4]] = js.undefined
  var faceUV: js.UndefOr[js.Array[Vector4]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var pattern: js.UndefOr[Double] = js.undefined
  var sideOrientation: js.UndefOr[Double] = js.undefined
  var tileHeight: js.UndefOr[Double] = js.undefined
  var tileSize: js.UndefOr[Double] = js.undefined
  var tileWidth: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonTileWidth {
  @scala.inline
  def apply(
    alignHorizontal: Int | Double = null,
    alignVertical: Int | Double = null,
    depth: Int | Double = null,
    faceColors: js.Array[Color4] = null,
    faceUV: js.Array[Vector4] = null,
    height: Int | Double = null,
    pattern: Int | Double = null,
    sideOrientation: Int | Double = null,
    tileHeight: Int | Double = null,
    tileSize: Int | Double = null,
    tileWidth: Int | Double = null,
    width: Int | Double = null
  ): AnonTileWidth = {
    val __obj = js.Dynamic.literal()
    if (alignHorizontal != null) __obj.updateDynamic("alignHorizontal")(alignHorizontal.asInstanceOf[js.Any])
    if (alignVertical != null) __obj.updateDynamic("alignVertical")(alignVertical.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (faceColors != null) __obj.updateDynamic("faceColors")(faceColors.asInstanceOf[js.Any])
    if (faceUV != null) __obj.updateDynamic("faceUV")(faceUV.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (tileHeight != null) __obj.updateDynamic("tileHeight")(tileHeight.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (tileWidth != null) __obj.updateDynamic("tileWidth")(tileWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTileWidth]
  }
}

