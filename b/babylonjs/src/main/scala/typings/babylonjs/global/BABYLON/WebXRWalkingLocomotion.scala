package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IWebXRWalkingLocomotionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRWalkingLocomotion")
@js.native
open class WebXRWalkingLocomotion protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebXRWalkingLocomotion {
  /**
    * Construct a new Walking Locomotion feature.
    * @param sessionManager manager for the current XR session
    * @param options creation options, prominently including the vector target for locomotion
    */
  def this(
    sessionManager: typings.babylonjs.BABYLON.WebXRSessionManager,
    options: IWebXRWalkingLocomotionOptions
  ) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
