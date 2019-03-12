package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageryLayer extends js.Object {
  var alpha: scala.Double
  var brightness: scala.Double
  var contrast: scala.Double
  var gamma: scala.Double
  var hue: scala.Double
  var imageryProvider: ImageryProvider
  var rectangle: Rectangle
  var saturation: scala.Double
  var show: scala.Boolean
  def destroy(): scala.Unit
  def isBaseLayer(): scala.Boolean
  def isDestroyed(): scala.Boolean
}

object ImageryLayer {
  @scala.inline
  def apply(
    alpha: scala.Double,
    brightness: scala.Double,
    contrast: scala.Double,
    destroy: () => scala.Unit,
    gamma: scala.Double,
    hue: scala.Double,
    imageryProvider: ImageryProvider,
    isBaseLayer: () => scala.Boolean,
    isDestroyed: () => scala.Boolean,
    rectangle: Rectangle,
    saturation: scala.Double,
    show: scala.Boolean
  ): ImageryLayer = {
    val __obj = js.Dynamic.literal(alpha = alpha, brightness = brightness, contrast = contrast, destroy = js.Any.fromFunction0(destroy), gamma = gamma, hue = hue, imageryProvider = imageryProvider, isBaseLayer = js.Any.fromFunction0(isBaseLayer), isDestroyed = js.Any.fromFunction0(isDestroyed), rectangle = rectangle, saturation = saturation, show = show)
  
    __obj.asInstanceOf[ImageryLayer]
  }
}

