package typings.babylonjs.camerasIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/index", "ArcRotateCameraPointersInput")
@js.native
open class ArcRotateCameraPointersInput ()
  extends typings.babylonjs.camerasInputsIndexMod.ArcRotateCameraPointersInput
/* static members */
object ArcRotateCameraPointersInput {
  
  @JSImport("babylonjs/Cameras/index", "ArcRotateCameraPointersInput")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The minimum radius used for pinch, to avoid radius lock at 0
    */
  @JSImport("babylonjs/Cameras/index", "ArcRotateCameraPointersInput.MinimumRadiusForPinch")
  @js.native
  def MinimumRadiusForPinch: Double = js.native
  inline def MinimumRadiusForPinch_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MinimumRadiusForPinch")(x.asInstanceOf[js.Any])
}
