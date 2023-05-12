package typings.babylonjs.physicsIndexMod

import typings.babylonjs.mathsMathDotvectorMod.Quaternion
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Physics/index", "PhysicsShapeBox")
@js.native
open class PhysicsShapeBox protected ()
  extends typings.babylonjs.physicsV2IndexMod.PhysicsShapeBox {
  /**
    *
    * @param center local center of the sphere
    * @param rotation local orientation
    * @param extents size of the box in each direction
    * @param scene scene to attach to
    */
  def this(center: Vector3, rotation: Quaternion, extents: Vector3, scene: Scene) = this()
}
/* static members */
object PhysicsShapeBox {
  
  @JSImport("babylonjs/Physics/index", "PhysicsShapeBox")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * @param mesh
    * @returns PhysicsShapeBox
    */
  inline def FromMesh(mesh: AbstractMesh): typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShapeBox = ^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShapeBox]
}
