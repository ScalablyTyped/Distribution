package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "PhysicsShapeCapsule")
@js.native
open class PhysicsShapeCapsule protected ()
  extends typings.babylonjs.legacyLegacyMod.PhysicsShapeCapsule {
  /**
    *
    * @param pointA Starting point that defines the capsule segment
    * @param pointB ending point of that same segment
    * @param radius radius
    * @param scene scene to attach to
    */
  def this(
    pointA: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    pointB: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    radius: Double,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
}
/* static members */
object PhysicsShapeCapsule {
  
  @JSImport("babylonjs", "PhysicsShapeCapsule")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Derive an approximate capsule from the transform node. Note, this is
    * not the optimal bounding capsule.
    * @param TransformNode node Node from which to derive a cylinder shape
    */
  inline def FromMesh(mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh): typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShapeCapsule = ^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShapeCapsule]
}
