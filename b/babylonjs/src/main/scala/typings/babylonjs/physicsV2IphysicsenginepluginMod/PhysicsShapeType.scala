package typings.babylonjs.physicsV2IphysicsenginepluginMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhysicsShapeType extends StObject
@JSImport("babylonjs/Physics/v2/IPhysicsEnginePlugin", "PhysicsShapeType")
@js.native
object PhysicsShapeType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhysicsShapeType & Double] = js.native
  
  @js.native
  sealed trait BOX
    extends StObject
       with PhysicsShapeType
  /* 3 */ val BOX: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsShapeType.BOX & Double = js.native
  
  @js.native
  sealed trait CAPSULE
    extends StObject
       with PhysicsShapeType
  /* 1 */ val CAPSULE: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsShapeType.CAPSULE & Double = js.native
  
  @js.native
  sealed trait CONTAINER
    extends StObject
       with PhysicsShapeType
  /* 5 */ val CONTAINER: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsShapeType.CONTAINER & Double = js.native
  
  @js.native
  sealed trait CONVEX_HULL
    extends StObject
       with PhysicsShapeType
  /* 4 */ val CONVEX_HULL: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsShapeType.CONVEX_HULL & Double = js.native
  
  @js.native
  sealed trait CYLINDER
    extends StObject
       with PhysicsShapeType
  /* 2 */ val CYLINDER: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsShapeType.CYLINDER & Double = js.native
  
  @js.native
  sealed trait HEIGHTFIELD
    extends StObject
       with PhysicsShapeType
  /* 7 */ val HEIGHTFIELD: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsShapeType.HEIGHTFIELD & Double = js.native
  
  @js.native
  sealed trait MESH
    extends StObject
       with PhysicsShapeType
  /* 6 */ val MESH: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsShapeType.MESH & Double = js.native
  
  @js.native
  sealed trait SPHERE
    extends StObject
       with PhysicsShapeType
  /* 0 */ val SPHERE: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsShapeType.SPHERE & Double = js.native
}
