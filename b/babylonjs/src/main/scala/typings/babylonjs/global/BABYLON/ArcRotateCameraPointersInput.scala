package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ArcRotateCameraPointersInput")
@js.native
open class ArcRotateCameraPointersInput ()
  extends StObject
     with typings.babylonjs.BABYLON.ArcRotateCameraPointersInput
/* static members */
object ArcRotateCameraPointersInput {
  
  @JSGlobal("BABYLON.ArcRotateCameraPointersInput")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The minimum radius used for pinch, to avoid radius lock at 0
    */
  @JSGlobal("BABYLON.ArcRotateCameraPointersInput.MinimumRadiusForPinch")
  @js.native
  def MinimumRadiusForPinch: Double = js.native
  inline def MinimumRadiusForPinch_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MinimumRadiusForPinch")(x.asInstanceOf[js.Any])
}
