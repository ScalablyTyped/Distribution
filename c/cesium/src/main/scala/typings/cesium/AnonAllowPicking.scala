package typings.cesium

import typings.cesium.mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowPicking extends js.Object {
  var allowPicking: js.UndefOr[Boolean] = js.undefined
  var asynchronous: js.UndefOr[Boolean] = js.undefined
  var basePath: js.UndefOr[String] = js.undefined
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined
  var debugWireframe: js.UndefOr[Boolean] = js.undefined
  var gltf: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[js.Any] = js.undefined
  var minimumPixelSize: js.UndefOr[Double] = js.undefined
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
}

object AnonAllowPicking {
  @scala.inline
  def apply(
    allowPicking: js.UndefOr[Boolean] = js.undefined,
    asynchronous: js.UndefOr[Boolean] = js.undefined,
    basePath: String = null,
    debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined,
    debugWireframe: js.UndefOr[Boolean] = js.undefined,
    gltf: js.Any = null,
    id: js.Any = null,
    minimumPixelSize: Int | Double = null,
    modelMatrix: Matrix4 = null,
    scale: Int | Double = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): AnonAllowPicking = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPicking)) __obj.updateDynamic("allowPicking")(allowPicking.asInstanceOf[js.Any])
    if (!js.isUndefined(asynchronous)) __obj.updateDynamic("asynchronous")(asynchronous.asInstanceOf[js.Any])
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowBoundingVolume)) __obj.updateDynamic("debugShowBoundingVolume")(debugShowBoundingVolume.asInstanceOf[js.Any])
    if (!js.isUndefined(debugWireframe)) __obj.updateDynamic("debugWireframe")(debugWireframe.asInstanceOf[js.Any])
    if (gltf != null) __obj.updateDynamic("gltf")(gltf.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (minimumPixelSize != null) __obj.updateDynamic("minimumPixelSize")(minimumPixelSize.asInstanceOf[js.Any])
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowPicking]
  }
}

