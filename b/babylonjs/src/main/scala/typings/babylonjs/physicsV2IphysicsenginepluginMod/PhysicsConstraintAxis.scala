package typings.babylonjs.physicsV2IphysicsenginepluginMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhysicsConstraintAxis extends StObject
@JSImport("babylonjs/Physics/v2/IPhysicsEnginePlugin", "PhysicsConstraintAxis")
@js.native
object PhysicsConstraintAxis extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhysicsConstraintAxis & Double] = js.native
  
  @js.native
  sealed trait ANGULAR_X
    extends StObject
       with PhysicsConstraintAxis
  /* 3 */ val ANGULAR_X: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintAxis.ANGULAR_X & Double = js.native
  
  @js.native
  sealed trait ANGULAR_Y
    extends StObject
       with PhysicsConstraintAxis
  /* 4 */ val ANGULAR_Y: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintAxis.ANGULAR_Y & Double = js.native
  
  @js.native
  sealed trait ANGULAR_Z
    extends StObject
       with PhysicsConstraintAxis
  /* 5 */ val ANGULAR_Z: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintAxis.ANGULAR_Z & Double = js.native
  
  @js.native
  sealed trait LINEAR_DISTANCE
    extends StObject
       with PhysicsConstraintAxis
  /* 6 */ val LINEAR_DISTANCE: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintAxis.LINEAR_DISTANCE & Double = js.native
  
  @js.native
  sealed trait LINEAR_X
    extends StObject
       with PhysicsConstraintAxis
  /* 0 */ val LINEAR_X: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintAxis.LINEAR_X & Double = js.native
  
  @js.native
  sealed trait LINEAR_Y
    extends StObject
       with PhysicsConstraintAxis
  /* 1 */ val LINEAR_Y: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintAxis.LINEAR_Y & Double = js.native
  
  @js.native
  sealed trait LINEAR_Z
    extends StObject
       with PhysicsConstraintAxis
  /* 2 */ val LINEAR_Z: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintAxis.LINEAR_Z & Double = js.native
}
