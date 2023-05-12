package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PhysicsShapeCylinder")
@js.native
open class PhysicsShapeCylinder protected ()
  extends StObject
     with typings.babylonjs.BABYLON.PhysicsShape {
  /**
    *
    * @param pointA Starting point that defines the cylinder segment
    * @param pointB ending point of that same segment
    * @param radius radius
    * @param scene scene to attach to
    */
  def this(
    pointA: typings.babylonjs.BABYLON.Vector3,
    pointB: typings.babylonjs.BABYLON.Vector3,
    radius: Double,
    scene: typings.babylonjs.BABYLON.Scene
  ) = this()
}
/* static members */
object PhysicsShapeCylinder {
  
  @JSGlobal("BABYLON.PhysicsShapeCylinder")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Derive an approximate cylinder from the transform node. Note, this is
    * not the optimal bounding cylinder.
    * @param TransformNode node Node from which to derive a cylinder shape
    */
  inline def FromMesh(mesh: typings.babylonjs.BABYLON.AbstractMesh): typings.babylonjs.BABYLON.PhysicsShapeCylinder = ^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.PhysicsShapeCylinder]
}
