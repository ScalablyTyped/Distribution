package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: js.UndefOr[js.Any] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
  var modelMatrix: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Matrix4] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply(
    id: js.Any = null,
    length: scala.Int | scala.Double = null,
    modelMatrix: cesiumLib.cesiumMod.CesiumNs.Matrix4 = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): Anon_Id = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Id]
  }
}

