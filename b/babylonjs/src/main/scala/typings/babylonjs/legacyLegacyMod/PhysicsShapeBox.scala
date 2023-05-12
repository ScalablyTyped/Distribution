package typings.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "PhysicsShapeBox")
@js.native
open class PhysicsShapeBox protected ()
  extends typings.babylonjs.indexMod.PhysicsShapeBox {
  /**
    *
    * @param center local center of the sphere
    * @param rotation local orientation
    * @param extents size of the box in each direction
    * @param scene scene to attach to
    */
  def this(
    center: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    rotation: typings.babylonjs.mathsMathDotvectorMod.Quaternion,
    extents: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
}
/* static members */
object PhysicsShapeBox {
  
  @JSImport("babylonjs/Legacy/legacy", "PhysicsShapeBox")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * @param mesh
    * @returns PhysicsShapeBox
    */
  inline def FromMesh(mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh): typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShapeBox = ^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShapeBox]
}
