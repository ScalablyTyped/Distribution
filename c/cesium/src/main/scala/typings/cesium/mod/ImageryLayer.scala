package typings.cesium.mod

import typings.cesium.anon.Brightness
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ImageryLayer")
@js.native
class ImageryLayer protected () extends js.Object {
  def this(imageryProvider: ImageryProvider) = this()
  def this(imageryProvider: ImageryProvider, options: Brightness) = this()
  var alpha: Double = js.native
  var brightness: Double = js.native
  var contrast: Double = js.native
  var gamma: Double = js.native
  var hue: Double = js.native
  var imageryProvider: ImageryProvider = js.native
  var rectangle: Rectangle = js.native
  var saturation: Double = js.native
  var show: Boolean = js.native
  def destroy(): Unit = js.native
  def isBaseLayer(): Boolean = js.native
  def isDestroyed(): Boolean = js.native
}

/* static members */
@JSImport("cesium", "ImageryLayer")
@js.native
object ImageryLayer extends js.Object {
  var DEFAULT_BRIGHTNESS: Double = js.native
  var DEFAULT_CONTRAST: Double = js.native
  var DEFAULT_GAMMA: Double = js.native
  var DEFAULT_HUE: Double = js.native
  var DEFAULT_SATURATION: Double = js.native
  type ValueFunc = js.Function5[
    /* frameState */ js.Any, 
    /* layer */ ImageryLayer, 
    /* x */ Double, 
    /* y */ Double, 
    /* level */ Double, 
    Double
  ]
}

