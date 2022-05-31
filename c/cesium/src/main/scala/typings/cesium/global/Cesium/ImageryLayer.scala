package typings.cesium.global.Cesium

import typings.cesium.anon.Brightness
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.ImageryLayer")
@js.native
class ImageryLayer protected ()
  extends typings.cesium.mod.ImageryLayer {
  def this(imageryProvider: typings.cesium.mod.ImageryProvider) = this()
  def this(imageryProvider: typings.cesium.mod.ImageryProvider, options: Brightness) = this()
}
object ImageryLayer {
  
  @JSGlobal("Cesium.ImageryLayer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Cesium.ImageryLayer.DEFAULT_BRIGHTNESS")
  @js.native
  def DEFAULT_BRIGHTNESS: Double = js.native
  inline def DEFAULT_BRIGHTNESS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_BRIGHTNESS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.ImageryLayer.DEFAULT_CONTRAST")
  @js.native
  def DEFAULT_CONTRAST: Double = js.native
  inline def DEFAULT_CONTRAST_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_CONTRAST")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.ImageryLayer.DEFAULT_GAMMA")
  @js.native
  def DEFAULT_GAMMA: Double = js.native
  inline def DEFAULT_GAMMA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_GAMMA")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.ImageryLayer.DEFAULT_HUE")
  @js.native
  def DEFAULT_HUE: Double = js.native
  inline def DEFAULT_HUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_HUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.ImageryLayer.DEFAULT_SATURATION")
  @js.native
  def DEFAULT_SATURATION: Double = js.native
  inline def DEFAULT_SATURATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_SATURATION")(x.asInstanceOf[js.Any])
}
