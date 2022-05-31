package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.Camera")
@js.native
class Camera protected ()
  extends typings.cesium.mod.Camera {
  def this(scene: typings.cesium.mod.Scene) = this()
}
object Camera {
  
  @JSGlobal("Cesium.Camera")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Cesium.Camera.DEFAULT_OFFSET")
  @js.native
  def DEFAULT_OFFSET: typings.cesium.mod.HeadingPitchRange = js.native
  inline def DEFAULT_OFFSET_=(x: typings.cesium.mod.HeadingPitchRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_OFFSET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.Camera.DEFAULT_VIEW_FACTOR")
  @js.native
  def DEFAULT_VIEW_FACTOR: Double = js.native
  inline def DEFAULT_VIEW_FACTOR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_VIEW_FACTOR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.Camera.DEFAULT_VIEW_RECTANGLE")
  @js.native
  def DEFAULT_VIEW_RECTANGLE: typings.cesium.mod.Rectangle = js.native
  inline def DEFAULT_VIEW_RECTANGLE_=(x: typings.cesium.mod.Rectangle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_VIEW_RECTANGLE")(x.asInstanceOf[js.Any])
}
