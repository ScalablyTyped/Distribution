package typings.babylonjs.physicsV2IphysicsenginepluginMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhysicsConstraintMotorType extends StObject
@JSImport("babylonjs/Physics/v2/IPhysicsEnginePlugin", "PhysicsConstraintMotorType")
@js.native
object PhysicsConstraintMotorType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhysicsConstraintMotorType & Double] = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with PhysicsConstraintMotorType
  /* 0 */ val NONE: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintMotorType.NONE & Double = js.native
  
  @js.native
  sealed trait POSITION
    extends StObject
       with PhysicsConstraintMotorType
  /* 2 */ val POSITION: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintMotorType.POSITION & Double = js.native
  
  @js.native
  sealed trait VELOCITY
    extends StObject
       with PhysicsConstraintMotorType
  /* 1 */ val VELOCITY: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintMotorType.VELOCITY & Double = js.native
}
