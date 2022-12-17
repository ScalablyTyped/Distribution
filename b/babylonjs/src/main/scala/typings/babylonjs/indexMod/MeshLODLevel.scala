package typings.babylonjs.indexMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "MeshLODLevel")
@js.native
open class MeshLODLevel protected ()
  extends typings.babylonjs.meshesIndexMod.MeshLODLevel {
  /**
    * Creates a new LOD level
    * @param distanceOrScreenCoverage defines either the distance or the screen coverage where this level should start being displayed
    * @param mesh defines the mesh to use to render this level
    */
  def this(
    /** Either distance from the center of the object to show this level or the screen coverage if `useLODScreenCoverage` is set to `true` on the mesh*/
  distanceOrScreenCoverage: Double,
    /** Defines the mesh to use to render this level */
  mesh: Nullable[typings.babylonjs.meshesMeshMod.Mesh]
  ) = this()
}
