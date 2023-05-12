package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhysicsConstraintType extends StObject
@JSGlobal("BABYLON.PhysicsConstraintType")
@js.native
object PhysicsConstraintType extends StObject {
  
  /**
    * A ball and socket constraint will attempt to line up the pivot
    * positions in each body, and have no restrictions on rotation
    */
  @js.native
  sealed trait BALL_AND_SOCKET
    extends StObject
       with PhysicsConstraintType
  
  /**
    * A distance constraint will attempt to keep the pivot locations
    * within a specified distance.
    */
  @js.native
  sealed trait DISTANCE
    extends StObject
       with PhysicsConstraintType
  
  /**
    * A hinge constraint will keep the pivot positions aligned as well
    * as two angular axes. The remaining angular axis will be free to rotate.
    */
  @js.native
  sealed trait HINGE
    extends StObject
       with PhysicsConstraintType
  
  /**
    * A lock constraint will attempt to keep the pivots completely lined
    * up between both bodies, allowing no relative movement.
    */
  @js.native
  sealed trait LOCK
    extends StObject
       with PhysicsConstraintType
  
  @js.native
  sealed trait PRISMATIC
    extends StObject
       with PhysicsConstraintType
  
  @js.native
  sealed trait SIX_DOF
    extends StObject
       with PhysicsConstraintType
  
  /**
    * A slider constraint allows bodies to translate along one axis and
    * rotate about the same axis. The remaining two axes are locked in
    * place
    */
  @js.native
  sealed trait SLIDER
    extends StObject
       with PhysicsConstraintType
}
