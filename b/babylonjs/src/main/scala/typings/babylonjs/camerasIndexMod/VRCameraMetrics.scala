package typings.babylonjs.camerasIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/index", "VRCameraMetrics")
@js.native
open class VRCameraMetrics ()
  extends typings.babylonjs.camerasVRIndexMod.VRCameraMetrics
/* static members */
object VRCameraMetrics {
  
  @JSImport("babylonjs/Cameras/index", "VRCameraMetrics")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get the default VRMetrics based on the most generic setup.
    * @returns the default vr metrics
    */
  inline def GetDefault(): typings.babylonjs.camerasVRVrCameraMetricsMod.VRCameraMetrics = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDefault")().asInstanceOf[typings.babylonjs.camerasVRVrCameraMetricsMod.VRCameraMetrics]
}
