package typings.babylonjs.physicsIndexMod

import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Physics/index", "PhysicsShapeMesh")
@js.native
open class PhysicsShapeMesh protected ()
  extends typings.babylonjs.physicsV2IndexMod.PhysicsShapeMesh {
  /**
    *
    * @param mesh the mesh topology that will be used to create the shape
    * @param scene scene to attach to
    */
  def this(mesh: Mesh, scene: Scene) = this()
}
