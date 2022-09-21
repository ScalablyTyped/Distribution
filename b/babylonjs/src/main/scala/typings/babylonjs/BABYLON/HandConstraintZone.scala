package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HandConstraintZone extends StObject
@JSGlobal("BABYLON.HandConstraintZone")
@js.native
object HandConstraintZone extends StObject {
  
  /**
    * Above finger tips
    */
  @js.native
  sealed trait ABOVE_FINGER_TIPS
    extends StObject
       with HandConstraintZone
  
  /**
    * Below the wrist
    */
  @js.native
  sealed trait BELOW_WRIST
    extends StObject
       with HandConstraintZone
  
  /**
    * Next to the thumb
    */
  @js.native
  sealed trait RADIAL_SIDE
    extends StObject
       with HandConstraintZone
  
  /**
    * Next to the pinky finger
    */
  @js.native
  sealed trait ULNAR_SIDE
    extends StObject
       with HandConstraintZone
}
