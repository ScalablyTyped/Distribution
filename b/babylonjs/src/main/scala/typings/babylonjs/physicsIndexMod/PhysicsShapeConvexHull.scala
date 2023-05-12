package typings.babylonjs.physicsIndexMod

import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Physics/index", "PhysicsShapeConvexHull")
@js.native
open class PhysicsShapeConvexHull protected ()
  extends typings.babylonjs.physicsV2IndexMod.PhysicsShapeConvexHull {
  /**
    *
    * @param mesh the mesh to be used as topology infos for the convex hull
    * @param scene scene to attach to
    */
  def this(mesh: Mesh, scene: Scene) = this()
}
