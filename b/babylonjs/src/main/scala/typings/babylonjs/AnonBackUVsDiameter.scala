package typings.babylonjs

import typings.babylonjs.BABYLON.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackUVsDiameter extends js.Object {
  var backUVs: js.UndefOr[Vector4] = js.undefined
  var diameter: js.UndefOr[Double] = js.undefined
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  var sideOrientation: js.UndefOr[Double] = js.undefined
  var tessellation: js.UndefOr[Double] = js.undefined
  var thickness: js.UndefOr[Double] = js.undefined
}

object AnonBackUVsDiameter {
  @scala.inline
  def apply(
    backUVs: Vector4 = null,
    diameter: Int | Double = null,
    frontUVs: Vector4 = null,
    sideOrientation: Int | Double = null,
    tessellation: Int | Double = null,
    thickness: Int | Double = null
  ): AnonBackUVsDiameter = {
    val __obj = js.Dynamic.literal()
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs.asInstanceOf[js.Any])
    if (diameter != null) __obj.updateDynamic("diameter")(diameter.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs.asInstanceOf[js.Any])
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (tessellation != null) __obj.updateDynamic("tessellation")(tessellation.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackUVsDiameter]
  }
}

