package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HandConstraintVisibility extends StObject
@JSGlobal("BABYLON.HandConstraintVisibility")
@js.native
object HandConstraintVisibility extends StObject {
  
  /**
    * Constraint is always visible
    */
  @js.native
  sealed trait ALWAYS_VISIBLE
    extends StObject
       with HandConstraintVisibility
  
  /**
    * Constraint is only visible when the user is looking at the constraint.
    * Uses XR Eye Tracking if enabled/available, otherwise uses camera direction
    */
  @js.native
  sealed trait GAZE_FOCUS
    extends StObject
       with HandConstraintVisibility
  
  /**
    * Constraint is only visible when the palm is up and the user is looking at it
    */
  @js.native
  sealed trait PALM_AND_GAZE
    extends StObject
       with HandConstraintVisibility
  
  /**
    * Constraint is only visible when the palm is up
    */
  @js.native
  sealed trait PALM_UP
    extends StObject
       with HandConstraintVisibility
}
