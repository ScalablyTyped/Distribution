package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlignVertical extends js.Object {
  var alignHorizontal: js.UndefOr[Double] = js.undefined
  var alignVertical: js.UndefOr[Double] = js.undefined
  var backUVs: js.UndefOr[Vector4] = js.undefined
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var pattern: js.UndefOr[Double] = js.undefined
  var sideOrientation: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var tileHeight: js.UndefOr[Double] = js.undefined
  var tileSize: js.UndefOr[Double] = js.undefined
  var tileWidth: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonAlignVertical {
  @scala.inline
  def apply(
    alignHorizontal: Int | Double = null,
    alignVertical: Int | Double = null,
    backUVs: Vector4 = null,
    frontUVs: Vector4 = null,
    height: Int | Double = null,
    pattern: Int | Double = null,
    sideOrientation: Int | Double = null,
    size: Int | Double = null,
    tileHeight: Int | Double = null,
    tileSize: Int | Double = null,
    tileWidth: Int | Double = null,
    width: Int | Double = null
  ): AnonAlignVertical = {
    val __obj = js.Dynamic.literal()
    if (alignHorizontal != null) __obj.updateDynamic("alignHorizontal")(alignHorizontal.asInstanceOf[js.Any])
    if (alignVertical != null) __obj.updateDynamic("alignVertical")(alignVertical.asInstanceOf[js.Any])
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (tileHeight != null) __obj.updateDynamic("tileHeight")(tileHeight.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (tileWidth != null) __obj.updateDynamic("tileWidth")(tileWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlignVertical]
  }
}

