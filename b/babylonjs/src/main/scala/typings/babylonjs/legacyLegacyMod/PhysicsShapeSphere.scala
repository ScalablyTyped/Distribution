package typings.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "PhysicsShapeSphere")
@js.native
open class PhysicsShapeSphere protected ()
  extends typings.babylonjs.indexMod.PhysicsShapeSphere {
  /**
    * Constructor for the Sphere Shape
    * @param center local center of the sphere
    * @param radius radius
    * @param scene scene to attach to
    */
  def this(
    center: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    radius: Double,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
}
/* static members */
object PhysicsShapeSphere {
  
  @JSImport("babylonjs/Legacy/legacy", "PhysicsShapeSphere")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * @param mesh
    * @returns PhysicsShapeSphere
    */
  inline def FromMesh(mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh): typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShapeSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShapeSphere]
}
