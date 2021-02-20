package typings.cesium.mod

import typings.cesium.anon.Brightness
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ImageryLayer")
@js.native
class ImageryLayer protected () extends StObject {
  def this(imageryProvider: ImageryProvider) = this()
  def this(imageryProvider: ImageryProvider, options: Brightness) = this()
  
  var alpha: Double = js.native
  
  var brightness: Double = js.native
  
  var contrast: Double = js.native
  
  def destroy(): Unit = js.native
  
  var gamma: Double = js.native
  
  var hue: Double = js.native
  
  var imageryProvider: ImageryProvider = js.native
  
  def isBaseLayer(): Boolean = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var rectangle: Rectangle = js.native
  
  var saturation: Double = js.native
  
  var show: Boolean = js.native
}
object ImageryLayer {
  
  @JSImport("cesium", "ImageryLayer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "ImageryLayer.DEFAULT_BRIGHTNESS")
  @js.native
  def DEFAULT_BRIGHTNESS: Double = js.native
  @scala.inline
  def DEFAULT_BRIGHTNESS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_BRIGHTNESS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "ImageryLayer.DEFAULT_CONTRAST")
  @js.native
  def DEFAULT_CONTRAST: Double = js.native
  @scala.inline
  def DEFAULT_CONTRAST_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_CONTRAST")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "ImageryLayer.DEFAULT_GAMMA")
  @js.native
  def DEFAULT_GAMMA: Double = js.native
  @scala.inline
  def DEFAULT_GAMMA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_GAMMA")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "ImageryLayer.DEFAULT_HUE")
  @js.native
  def DEFAULT_HUE: Double = js.native
  @scala.inline
  def DEFAULT_HUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_HUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "ImageryLayer.DEFAULT_SATURATION")
  @js.native
  def DEFAULT_SATURATION: Double = js.native
  @scala.inline
  def DEFAULT_SATURATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_SATURATION")(x.asInstanceOf[js.Any])
  
  type ValueFunc = js.Function5[
    /* frameState */ js.Any, 
    /* layer */ ImageryLayer, 
    /* x */ Double, 
    /* y */ Double, 
    /* level */ Double, 
    Double
  ]
}
