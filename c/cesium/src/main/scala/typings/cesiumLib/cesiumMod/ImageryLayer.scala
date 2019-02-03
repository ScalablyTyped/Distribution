package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ImageryLayer")
@js.native
class ImageryLayer protected ()
  extends cesiumLib.cesiumMod.CesiumNs.ImageryLayer {
  def this(imageryProvider: cesiumLib.cesiumMod.CesiumNs.ImageryProvider) = this()
  def this(imageryProvider: cesiumLib.cesiumMod.CesiumNs.ImageryProvider, options: cesiumLib.Anon_AlphaBrightness) = this()
  /* CompleteClass */
  override var alpha: scala.Double = js.native
  /* CompleteClass */
  override var brightness: scala.Double = js.native
  /* CompleteClass */
  override var contrast: scala.Double = js.native
  /* CompleteClass */
  override var gamma: scala.Double = js.native
  /* CompleteClass */
  override var hue: scala.Double = js.native
  /* CompleteClass */
  override var imageryProvider: cesiumLib.cesiumMod.CesiumNs.ImageryProvider = js.native
  /* CompleteClass */
  override var rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle = js.native
  /* CompleteClass */
  override var saturation: scala.Double = js.native
  /* CompleteClass */
  override var show: scala.Boolean = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def isBaseLayer(): scala.Boolean = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
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

