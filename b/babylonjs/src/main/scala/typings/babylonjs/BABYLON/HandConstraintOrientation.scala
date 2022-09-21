package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HandConstraintOrientation extends StObject
@JSGlobal("BABYLON.HandConstraintOrientation")
@js.native
object HandConstraintOrientation extends StObject {
  
  /**
    * Orientation is determined by the rotation of the palm
    */
  @js.native
  sealed trait HAND_ROTATION
    extends StObject
       with HandConstraintOrientation
  
  /**
    * Orientation is towards the camera
    */
  @js.native
  sealed trait LOOK_AT_CAMERA
    extends StObject
       with HandConstraintOrientation
}
