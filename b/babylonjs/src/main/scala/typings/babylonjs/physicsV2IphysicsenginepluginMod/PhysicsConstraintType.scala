package typings.babylonjs.physicsV2IphysicsenginepluginMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhysicsConstraintType extends StObject
@JSImport("babylonjs/Physics/v2/IPhysicsEnginePlugin", "PhysicsConstraintType")
@js.native
object PhysicsConstraintType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhysicsConstraintType & Double] = js.native
  
  /**
    * A ball and socket constraint will attempt to line up the pivot
    * positions in each body, and have no restrictions on rotation
    */
  @js.native
  sealed trait BALL_AND_SOCKET
    extends StObject
       with PhysicsConstraintType
  /* 1 */ val BALL_AND_SOCKET: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintType.BALL_AND_SOCKET & Double = js.native
  
  /**
    * A distance constraint will attempt to keep the pivot locations
    * within a specified distance.
    */
  @js.native
  sealed trait DISTANCE
    extends StObject
       with PhysicsConstraintType
  /* 2 */ val DISTANCE: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintType.DISTANCE & Double = js.native
  
  /**
    * A hinge constraint will keep the pivot positions aligned as well
    * as two angular axes. The remaining angular axis will be free to rotate.
    */
  @js.native
  sealed trait HINGE
    extends StObject
       with PhysicsConstraintType
  /* 3 */ val HINGE: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintType.HINGE & Double = js.native
  
  /**
    * A lock constraint will attempt to keep the pivots completely lined
    * up between both bodies, allowing no relative movement.
    */
  @js.native
  sealed trait LOCK
    extends StObject
       with PhysicsConstraintType
  /* 5 */ val LOCK: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintType.LOCK & Double = js.native
  
  @js.native
  sealed trait PRISMATIC
    extends StObject
       with PhysicsConstraintType
  /* 6 */ val PRISMATIC: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintType.PRISMATIC & Double = js.native
  
  @js.native
  sealed trait SIX_DOF
    extends StObject
       with PhysicsConstraintType
  /* 7 */ val SIX_DOF: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintType.SIX_DOF & Double = js.native
  
  /**
    * A slider constraint allows bodies to translate along one axis and
    * rotate about the same axis. The remaining two axes are locked in
    * place
    */
  @js.native
  sealed trait SLIDER
    extends StObject
       with PhysicsConstraintType
  /* 4 */ val SLIDER: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintType.SLIDER & Double = js.native
}
