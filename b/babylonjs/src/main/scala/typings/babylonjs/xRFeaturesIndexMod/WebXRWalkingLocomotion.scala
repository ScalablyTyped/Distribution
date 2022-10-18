package typings.babylonjs.xRFeaturesIndexMod

import typings.babylonjs.xRFeaturesWebXRWalkingLocomotionMod.IWebXRWalkingLocomotionOptions
import typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/features/index", "WebXRWalkingLocomotion")
@js.native
open class WebXRWalkingLocomotion protected ()
  extends typings.babylonjs.xRFeaturesWebXRWalkingLocomotionMod.WebXRWalkingLocomotion {
  /**
    * Construct a new Walking Locomotion feature.
    * @param sessionManager manager for the current XR session
    * @param options creation options, prominently including the vector target for locomotion
    */
  def this(sessionManager: WebXRSessionManager, options: IWebXRWalkingLocomotionOptions) = this()
}
