package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Module Debug contains the (visual) components to debug a scene correctly
  */
@JSImport("babylonjs", "Debug")
@js.native
object DebugNs extends js.Object {
  /**
    * The Axes viewer will show 3 axes in a specific point in space
    */
  @js.native
  class AxesViewer protected ()
    extends babylonjsLib.BABYLONNs.DebugNs.AxesViewer {
    /**
      * Creates a new AxesViewer
      * @param scene defines the hosting scene
      * @param scaleLines defines a number used to scale line length (1 by default)
      */
    def this(scene: babylonjsLib.BABYLONNs.Scene) = this()
    def this(scene: babylonjsLib.BABYLONNs.Scene, scaleLines: scala.Double) = this()
  }
  
  /**
    * The BoneAxesViewer will attach 3 axes to a specific bone of a specific mesh
    * @see demo here: https://www.babylonjs-playground.com/#0DE8F4#8
    */
  @js.native
  class BoneAxesViewer protected ()
    extends babylonjsLib.BABYLONNs.DebugNs.BoneAxesViewer {
    /**
      * Creates a new BoneAxesViewer
      * @param scene defines the hosting scene
      * @param bone defines the target bone
      * @param mesh defines the target mesh
      * @param scaleLines defines a scaling factor for line length (1 by default)
      */
    def this(scene: babylonjsLib.BABYLONNs.Scene, bone: babylonjsLib.BABYLONNs.Bone, mesh: babylonjsLib.BABYLONNs.Mesh) = this()
    def this(scene: babylonjsLib.BABYLONNs.Scene, bone: babylonjsLib.BABYLONNs.Bone, mesh: babylonjsLib.BABYLONNs.Mesh, scaleLines: scala.Double) = this()
  }
  
  /**
    * Used to show the physics impostor around the specific mesh
    */
  @js.native
  class PhysicsViewer protected ()
    extends babylonjsLib.BABYLONNs.DebugNs.PhysicsViewer {
    /**
      * Creates a new PhysicsViewer
      * @param scene defines the hosting scene
      */
    def this(scene: babylonjsLib.BABYLONNs.Scene) = this()
  }
  
  /**
    * Class used to render a debug view of a given skeleton
    * @see http://www.babylonjs-playground.com/#1BZJVJ#8
    */
  @js.native
  class SkeletonViewer protected ()
    extends babylonjsLib.BABYLONNs.DebugNs.SkeletonViewer {
    /**
      * Creates a new SkeletonViewer
      * @param skeleton defines the skeleton to render
      * @param mesh defines the mesh attached to the skeleton
      * @param scene defines the hosting scene
      * @param autoUpdateBonesMatrices defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)
      * @param renderingGroupId defines the rendering group id to use with the viewer
      */
    def this(/** defines the skeleton to render */
    skeleton: babylonjsLib.BABYLONNs.Skeleton, /** defines the mesh attached to the skeleton */
    mesh: babylonjsLib.BABYLONNs.AbstractMesh, scene: babylonjsLib.BABYLONNs.Scene) = this()
    def this(/** defines the skeleton to render */
    skeleton: babylonjsLib.BABYLONNs.Skeleton, /** defines the mesh attached to the skeleton */
    mesh: babylonjsLib.BABYLONNs.AbstractMesh, scene: babylonjsLib.BABYLONNs.Scene, /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: scala.Boolean) = this()
    def this(/** defines the skeleton to render */
    skeleton: babylonjsLib.BABYLONNs.Skeleton, /** defines the mesh attached to the skeleton */
    mesh: babylonjsLib.BABYLONNs.AbstractMesh, scene: babylonjsLib.BABYLONNs.Scene, /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: scala.Boolean, /** defines the rendering group id to use with the viewer */
    renderingGroupId: scala.Double) = this()
  }
  
}

