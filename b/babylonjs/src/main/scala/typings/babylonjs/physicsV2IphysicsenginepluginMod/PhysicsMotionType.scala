package typings.babylonjs.physicsV2IphysicsenginepluginMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhysicsMotionType extends StObject
@JSImport("babylonjs/Physics/v2/IPhysicsEnginePlugin", "PhysicsMotionType")
@js.native
object PhysicsMotionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhysicsMotionType & Double] = js.native
  
  @js.native
  sealed trait ANIMATED
    extends StObject
       with PhysicsMotionType
  /* 1 */ val ANIMATED: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsMotionType.ANIMATED & Double = js.native
  
  @js.native
  sealed trait DYNAMIC
    extends StObject
       with PhysicsMotionType
  /* 2 */ val DYNAMIC: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsMotionType.DYNAMIC & Double = js.native
  
  @js.native
  sealed trait STATIC
    extends StObject
       with PhysicsMotionType
  /* 0 */ val STATIC: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsMotionType.STATIC & Double = js.native
}
