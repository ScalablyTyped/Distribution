package typings.babylonjs.physicsIndexMod

import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Physics/index", "PhysicsShapeSphere")
@js.native
open class PhysicsShapeSphere protected ()
  extends typings.babylonjs.physicsV2IndexMod.PhysicsShapeSphere {
  /**
    * Constructor for the Sphere Shape
    * @param center local center of the sphere
    * @param radius radius
    * @param scene scene to attach to
    */
  def this(center: Vector3, radius: Double, scene: Scene) = this()
}
/* static members */
object PhysicsShapeSphere {
  
  @JSImport("babylonjs/Physics/index", "PhysicsShapeSphere")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * @param mesh
    * @returns PhysicsShapeSphere
    */
  inline def FromMesh(mesh: AbstractMesh): typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShapeSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShapeSphere]
}
