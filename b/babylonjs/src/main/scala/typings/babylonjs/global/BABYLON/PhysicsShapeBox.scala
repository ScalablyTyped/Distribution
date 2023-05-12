package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PhysicsShapeBox")
@js.native
open class PhysicsShapeBox protected ()
  extends StObject
     with typings.babylonjs.BABYLON.PhysicsShape {
  /**
    *
    * @param center local center of the sphere
    * @param rotation local orientation
    * @param extents size of the box in each direction
    * @param scene scene to attach to
    */
  def this(
    center: typings.babylonjs.BABYLON.Vector3,
    rotation: typings.babylonjs.BABYLON.Quaternion,
    extents: typings.babylonjs.BABYLON.Vector3,
    scene: typings.babylonjs.BABYLON.Scene
  ) = this()
}
/* static members */
object PhysicsShapeBox {
  
  @JSGlobal("BABYLON.PhysicsShapeBox")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * @param mesh
    * @returns PhysicsShapeBox
    */
  inline def FromMesh(mesh: typings.babylonjs.BABYLON.AbstractMesh): typings.babylonjs.BABYLON.PhysicsShapeBox = ^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.PhysicsShapeBox]
}
