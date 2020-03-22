package typings.cesium

import typings.cesium.mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAsynchronous extends js.Object {
  var allowPicking: js.UndefOr[Boolean] = js.undefined
  var asynchronous: js.UndefOr[Boolean] = js.undefined
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined
  var debugWireframe: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var minimumPixelSize: js.UndefOr[Double] = js.undefined
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var url: String
}

object AnonAsynchronous {
  @scala.inline
  def apply(
    url: String,
    allowPicking: js.UndefOr[Boolean] = js.undefined,
    asynchronous: js.UndefOr[Boolean] = js.undefined,
    debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined,
    debugWireframe: js.UndefOr[Boolean] = js.undefined,
    headers: js.Any = null,
    minimumPixelSize: Int | Double = null,
    modelMatrix: Matrix4 = null,
    scale: Int | Double = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): AnonAsynchronous = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(allowPicking)) __obj.updateDynamic("allowPicking")(allowPicking.asInstanceOf[js.Any])
    if (!js.isUndefined(asynchronous)) __obj.updateDynamic("asynchronous")(asynchronous.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowBoundingVolume)) __obj.updateDynamic("debugShowBoundingVolume")(debugShowBoundingVolume.asInstanceOf[js.Any])
    if (!js.isUndefined(debugWireframe)) __obj.updateDynamic("debugWireframe")(debugWireframe.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (minimumPixelSize != null) __obj.updateDynamic("minimumPixelSize")(minimumPixelSize.asInstanceOf[js.Any])
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAsynchronous]
  }
}

