package typings.cesium

import typings.cesium.mod.Ellipsoid
import typings.cesium.mod.Material
import typings.cesium.mod.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTextureRotationAngle extends js.Object {
  var asynchronous: js.UndefOr[Boolean] = js.undefined
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var granularity: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[js.Any] = js.undefined
  var material: js.UndefOr[Material] = js.undefined
  var rectangle: js.UndefOr[Rectangle] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var textureRotationAngle: js.UndefOr[Double] = js.undefined
}

object AnonTextureRotationAngle {
  @scala.inline
  def apply(
    asynchronous: js.UndefOr[Boolean] = js.undefined,
    debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined,
    ellipsoid: Ellipsoid = null,
    granularity: Int | Double = null,
    height: Int | Double = null,
    id: js.Any = null,
    material: Material = null,
    rectangle: Rectangle = null,
    rotation: Int | Double = null,
    show: js.UndefOr[Boolean] = js.undefined,
    textureRotationAngle: Int | Double = null
  ): AnonTextureRotationAngle = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asynchronous)) __obj.updateDynamic("asynchronous")(asynchronous.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowBoundingVolume)) __obj.updateDynamic("debugShowBoundingVolume")(debugShowBoundingVolume.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (textureRotationAngle != null) __obj.updateDynamic("textureRotationAngle")(textureRotationAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTextureRotationAngle]
  }
}

