package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PhysicsShapeSphere")
@js.native
open class PhysicsShapeSphere protected ()
  extends StObject
     with typings.babylonjs.BABYLON.PhysicsShape {
  /**
    * Constructor for the Sphere Shape
    * @param center local center of the sphere
    * @param radius radius
    * @param scene scene to attach to
    */
  def this(center: typings.babylonjs.BABYLON.Vector3, radius: Double, scene: typings.babylonjs.BABYLON.Scene) = this()
}
/* static members */
object PhysicsShapeSphere {
  
  @JSGlobal("BABYLON.PhysicsShapeSphere")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * @param mesh
    * @returns PhysicsShapeSphere
    */
  inline def FromMesh(mesh: typings.babylonjs.BABYLON.AbstractMesh): typings.babylonjs.BABYLON.PhysicsShapeSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.PhysicsShapeSphere]
}
