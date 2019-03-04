package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowPickingAsynchronous extends js.Object {
  var allowPicking: js.UndefOr[scala.Boolean] = js.undefined
  var asynchronous: js.UndefOr[scala.Boolean] = js.undefined
  var debugShowBoundingVolume: js.UndefOr[scala.Boolean] = js.undefined
  var debugWireframe: js.UndefOr[scala.Boolean] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var minimumPixelSize: js.UndefOr[scala.Double] = js.undefined
  var modelMatrix: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Matrix4] = js.undefined
  var scale: js.UndefOr[scala.Double] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var url: java.lang.String
}

object Anon_AllowPickingAsynchronous {
  @scala.inline
  def apply(
    url: java.lang.String,
    allowPicking: js.UndefOr[scala.Boolean] = js.undefined,
    asynchronous: js.UndefOr[scala.Boolean] = js.undefined,
    debugShowBoundingVolume: js.UndefOr[scala.Boolean] = js.undefined,
    debugWireframe: js.UndefOr[scala.Boolean] = js.undefined,
    headers: js.Any = null,
    minimumPixelSize: scala.Int | scala.Double = null,
    modelMatrix: cesiumLib.cesiumMod.CesiumNs.Matrix4 = null,
    scale: scala.Int | scala.Double = null,
    show: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AllowPickingAsynchronous = {
    val __obj = js.Dynamic.literal(url = url)
    if (!js.isUndefined(allowPicking)) __obj.updateDynamic("allowPicking")(allowPicking)
    if (!js.isUndefined(asynchronous)) __obj.updateDynamic("asynchronous")(asynchronous)
    if (!js.isUndefined(debugShowBoundingVolume)) __obj.updateDynamic("debugShowBoundingVolume")(debugShowBoundingVolume)
    if (!js.isUndefined(debugWireframe)) __obj.updateDynamic("debugWireframe")(debugWireframe)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (minimumPixelSize != null) __obj.updateDynamic("minimumPixelSize")(minimumPixelSize.asInstanceOf[js.Any])
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Anon_AllowPickingAsynchronous]
  }
}

