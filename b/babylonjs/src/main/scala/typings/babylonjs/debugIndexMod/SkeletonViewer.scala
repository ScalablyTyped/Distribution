package typings.babylonjs.debugIndexMod

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.skeletonMod.Skeleton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Debug/index", "SkeletonViewer")
@js.native
class SkeletonViewer protected ()
  extends typings.babylonjs.skeletonViewerMod.SkeletonViewer {
  /**
    * Creates a new SkeletonViewer
    * @param skeleton defines the skeleton to render
    * @param mesh defines the mesh attached to the skeleton
    * @param scene defines the hosting scene
    * @param autoUpdateBonesMatrices defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)
    * @param renderingGroupId defines the rendering group id to use with the viewer
    */
  def this(
    /** defines the skeleton to render */
  skeleton: Skeleton,
    /** defines the mesh attached to the skeleton */
  mesh: AbstractMesh,
    scene: Scene
  ) = this()
  def this(
    /** defines the skeleton to render */
  skeleton: Skeleton,
    /** defines the mesh attached to the skeleton */
  mesh: AbstractMesh,
    scene: Scene,
    /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
  autoUpdateBonesMatrices: Boolean
  ) = this()
  def this(
    /** defines the skeleton to render */
  skeleton: Skeleton,
    /** defines the mesh attached to the skeleton */
  mesh: AbstractMesh,
    scene: Scene,
    /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
  autoUpdateBonesMatrices: Boolean,
    /** defines the rendering group id to use with the viewer */
  renderingGroupId: Double
  ) = this()
}

