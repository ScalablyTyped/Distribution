package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "SkeletonViewer")
@js.native
class SkeletonViewer protected ()
  extends typings.babylonjs.legacyMod.SkeletonViewer {
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
  skeleton: typings.babylonjs.skeletonMod.Skeleton,
    /** defines the mesh attached to the skeleton */
  mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    /** defines the skeleton to render */
  skeleton: typings.babylonjs.skeletonMod.Skeleton,
    /** defines the mesh attached to the skeleton */
  mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    scene: typings.babylonjs.sceneMod.Scene,
    /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
  autoUpdateBonesMatrices: Boolean
  ) = this()
  def this(
    /** defines the skeleton to render */
  skeleton: typings.babylonjs.skeletonMod.Skeleton,
    /** defines the mesh attached to the skeleton */
  mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    scene: typings.babylonjs.sceneMod.Scene,
    /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
  autoUpdateBonesMatrices: Boolean,
    /** defines the rendering group id to use with the viewer */
  renderingGroupId: Double
  ) = this()
}

