package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "ArcRotateCameraPointersInput")
@js.native
open class ArcRotateCameraPointersInput ()
  extends typings.babylonjs.legacyLegacyMod.ArcRotateCameraPointersInput
/* static members */
object ArcRotateCameraPointersInput {
  
  @JSImport("babylonjs", "ArcRotateCameraPointersInput")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The minimum radius used for pinch, to avoid radius lock at 0
    */
  @JSImport("babylonjs", "ArcRotateCameraPointersInput.MinimumRadiusForPinch")
  @js.native
  def MinimumRadiusForPinch: Double = js.native
  inline def MinimumRadiusForPinch_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MinimumRadiusForPinch")(x.asInstanceOf[js.Any])
}
