package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WebXRNearControllerMode extends StObject
@JSGlobal("BABYLON.WebXRNearControllerMode")
@js.native
object WebXRNearControllerMode extends StObject {
  
  /**
    * The interaction point for motion controllers will be in front of the controller
    */
  @js.native
  sealed trait CENTERED_IN_FRONT
    extends StObject
       with WebXRNearControllerMode
  
  /**
    * The interaction point for motion controllers will be inside of them
    */
  @js.native
  sealed trait CENTERED_ON_CONTROLLER
    extends StObject
       with WebXRNearControllerMode
  
  /**
    * Motion controllers will not support near interaction
    */
  @js.native
  sealed trait DISABLED
    extends StObject
       with WebXRNearControllerMode
}
