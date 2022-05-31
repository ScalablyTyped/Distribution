package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.VRCameraMetrics")
@js.native
class VRCameraMetrics ()
  extends StObject
     with typings.babylonjs.BABYLON.VRCameraMetrics
/* static members */
object VRCameraMetrics {
  
  @JSGlobal("BABYLON.VRCameraMetrics")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get the default VRMetrics based on the most generic setup.
    * @returns the default vr metrics
    */
  inline def GetDefault(): typings.babylonjs.BABYLON.VRCameraMetrics = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDefault")().asInstanceOf[typings.babylonjs.BABYLON.VRCameraMetrics]
}
