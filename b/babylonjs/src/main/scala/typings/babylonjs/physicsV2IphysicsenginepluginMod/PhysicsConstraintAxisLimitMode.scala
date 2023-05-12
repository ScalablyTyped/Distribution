package typings.babylonjs.physicsV2IphysicsenginepluginMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhysicsConstraintAxisLimitMode extends StObject
@JSImport("babylonjs/Physics/v2/IPhysicsEnginePlugin", "PhysicsConstraintAxisLimitMode")
@js.native
object PhysicsConstraintAxisLimitMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhysicsConstraintAxisLimitMode & Double] = js.native
  
  @js.native
  sealed trait FREE
    extends StObject
       with PhysicsConstraintAxisLimitMode
  /* 0 */ val FREE: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintAxisLimitMode.FREE & Double = js.native
  
  @js.native
  sealed trait LIMITED
    extends StObject
       with PhysicsConstraintAxisLimitMode
  /* 1 */ val LIMITED: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintAxisLimitMode.LIMITED & Double = js.native
  
  @js.native
  sealed trait LOCKED
    extends StObject
       with PhysicsConstraintAxisLimitMode
  /* 2 */ val LOCKED: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintAxisLimitMode.LOCKED & Double = js.native
}
