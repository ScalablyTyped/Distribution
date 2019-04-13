package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ImageryLayer")
@js.native
class ImageryLayer protected () extends js.Object {
  def this(imageryProvider: ImageryProvider) = this()
  def this(imageryProvider: ImageryProvider, options: cesiumLib.Anon_AlphaBrightness) = this()
  var alpha: scala.Double = js.native
  var brightness: scala.Double = js.native
  var contrast: scala.Double = js.native
  var gamma: scala.Double = js.native
  var hue: scala.Double = js.native
  var imageryProvider: ImageryProvider = js.native
  var rectangle: Rectangle = js.native
  var saturation: scala.Double = js.native
  var show: scala.Boolean = js.native
  def destroy(): scala.Unit = js.native
  def isBaseLayer(): scala.Boolean = js.native
  def isDestroyed(): scala.Boolean = js.native
}

/* static members */
@JSImport("cesium", "ImageryLayer")
@js.native
object ImageryLayer extends js.Object {
  var DEFAULT_BRIGHTNESS: scala.Double = js.native
  var DEFAULT_CONTRAST: scala.Double = js.native
  var DEFAULT_GAMMA: scala.Double = js.native
  var DEFAULT_HUE: scala.Double = js.native
  var DEFAULT_SATURATION: scala.Double = js.native
}

