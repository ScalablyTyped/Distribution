package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.MeshLODLevel")
@js.native
class MeshLODLevel protected ()
  extends typings.babylonjs.BABYLON.MeshLODLevel {
  /**
    * Creates a new LOD level
    * @param distance defines the distance where this level should star being displayed
    * @param mesh defines the mesh to use to render this level
    */
  def this(
    /** Defines the distance where this level should start being displayed */
  distance: Double,
    /** Defines the mesh to use to render this level */
  mesh: Nullable[typings.babylonjs.BABYLON.Mesh]
  ) = this()
  /** Defines the distance where this level should start being displayed */
  /* CompleteClass */
  override var distance: Double = js.native
  /** Defines the mesh to use to render this level */
  /* CompleteClass */
  override var mesh: Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
}

