package typings.babylonjs.physicsIndexMod

import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Physics/index", "PhysicsShapeCylinder")
@js.native
open class PhysicsShapeCylinder protected ()
  extends typings.babylonjs.physicsV2IndexMod.PhysicsShapeCylinder {
  /**
    *
    * @param pointA Starting point that defines the cylinder segment
    * @param pointB ending point of that same segment
    * @param radius radius
    * @param scene scene to attach to
    */
  def this(pointA: Vector3, pointB: Vector3, radius: Double, scene: Scene) = this()
}
/* static members */
object PhysicsShapeCylinder {
  
  @JSImport("babylonjs/Physics/index", "PhysicsShapeCylinder")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Derive an approximate cylinder from the transform node. Note, this is
    * not the optimal bounding cylinder.
    * @param TransformNode node Node from which to derive a cylinder shape
    */
  inline def FromMesh(mesh: AbstractMesh): typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShapeCylinder = ^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShapeCylinder]
}
