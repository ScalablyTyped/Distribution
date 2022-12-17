package typings.babylonjs.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable4
import typings.babylonjs.anon.PartialISkeletonViewerOpt
import typings.babylonjs.anon.TypeofAxesViewer
import typings.babylonjs.anon.TypeofSkeletonViewer
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Debug {
  
  @JSImport("babylonjs", "Debug")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs", "Debug.AxesViewer")
  @js.native
  def AxesViewer: TypeofAxesViewer = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("babylonjs", "Debug.AxesViewer")
  @js.native
  open class AxesViewerCls protected ()
    extends typings.babylonjs.indexMod.AxesViewer {
    /**
      * Creates a new AxesViewer
      * @param scene defines the hosting scene
      * @param scaleLines defines a number used to scale line length (1 by default)
      * @param renderingGroupId defines a number used to set the renderingGroupId of the meshes (2 by default)
      * @param xAxis defines the node hierarchy used to render the x-axis
      * @param yAxis defines the node hierarchy used to render the y-axis
      * @param zAxis defines the node hierarchy used to render the z-axis
      * @param lineThickness The line thickness to use when creating the arrow. defaults to 1.
      */
    def this(
      scene: js.UndefOr[typings.babylonjs.sceneMod.Scene],
      scaleLines: js.UndefOr[Double],
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: js.UndefOr[typings.babylonjs.meshesTransformNodeMod.TransformNode],
      yAxis: js.UndefOr[typings.babylonjs.meshesTransformNodeMod.TransformNode],
      zAxis: js.UndefOr[typings.babylonjs.meshesTransformNodeMod.TransformNode],
      lineThickness: js.UndefOr[Double]
    ) = this()
  }
  
  inline def AxesViewer_=(x: TypeofAxesViewer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AxesViewer")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "Debug.BoneAxesViewer")
  @js.native
  def BoneAxesViewer: Instantiable4[
    /* scene */ typings.babylonjs.sceneMod.Scene, 
    /* bone */ typings.babylonjs.bonesBoneMod.Bone, 
    /* mesh */ typings.babylonjs.meshesMeshMod.Mesh, 
    /* scaleLines */ js.UndefOr[Double], 
    typings.babylonjs.indexMod.BoneAxesViewer
  ] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("babylonjs", "Debug.BoneAxesViewer")
  @js.native
  open class BoneAxesViewerCls protected ()
    extends typings.babylonjs.indexMod.BoneAxesViewer {
    /**
      * Creates a new BoneAxesViewer
      * @param scene defines the hosting scene
      * @param bone defines the target bone
      * @param mesh defines the target mesh
      * @param scaleLines defines a scaling factor for line length (1 by default)
      */
    def this(
      scene: typings.babylonjs.sceneMod.Scene,
      bone: typings.babylonjs.bonesBoneMod.Bone,
      mesh: typings.babylonjs.meshesMeshMod.Mesh
    ) = this()
    def this(
      scene: typings.babylonjs.sceneMod.Scene,
      bone: typings.babylonjs.bonesBoneMod.Bone,
      mesh: typings.babylonjs.meshesMeshMod.Mesh,
      scaleLines: Double
    ) = this()
  }
  
  inline def BoneAxesViewer_=(
    x: Instantiable4[
      /* scene */ typings.babylonjs.sceneMod.Scene, 
      /* bone */ typings.babylonjs.bonesBoneMod.Bone, 
      /* mesh */ typings.babylonjs.meshesMeshMod.Mesh, 
      /* scaleLines */ js.UndefOr[Double], 
      typings.babylonjs.indexMod.BoneAxesViewer
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BoneAxesViewer")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "Debug.PhysicsViewer")
  @js.native
  def PhysicsViewer: Instantiable1[
    /* scene */ js.UndefOr[typings.babylonjs.sceneMod.Scene], 
    typings.babylonjs.indexMod.PhysicsViewer
  ] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("babylonjs", "Debug.PhysicsViewer")
  @js.native
  /**
    * Creates a new PhysicsViewer
    * @param scene defines the hosting scene
    */
  open class PhysicsViewerCls ()
    extends typings.babylonjs.indexMod.PhysicsViewer {
    def this(scene: typings.babylonjs.sceneMod.Scene) = this()
  }
  
  inline def PhysicsViewer_=(
    x: Instantiable1[
      /* scene */ js.UndefOr[typings.babylonjs.sceneMod.Scene], 
      typings.babylonjs.indexMod.PhysicsViewer
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PhysicsViewer")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "Debug.SkeletonViewer")
  @js.native
  def SkeletonViewer: TypeofSkeletonViewer = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("babylonjs", "Debug.SkeletonViewer")
  @js.native
  open class SkeletonViewerCls protected ()
    extends typings.babylonjs.indexMod.SkeletonViewer {
    /**
      * Creates a new SkeletonViewer
      * @param skeleton defines the skeleton to render
      * @param mesh defines the mesh attached to the skeleton
      * @param scene defines the hosting scene
      * @param autoUpdateBonesMatrices defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)
      * @param renderingGroupId defines the rendering group id to use with the viewer
      * @param options All of the extra constructor options for the SkeletonViewer
      */
    def this(
      /** defines the skeleton to render */
    skeleton: typings.babylonjs.bonesSkeletonMod.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
      /** The Scene scope*/
    scene: typings.babylonjs.sceneMod.Scene
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: typings.babylonjs.bonesSkeletonMod.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
      /** The Scene scope*/
    scene: typings.babylonjs.sceneMod.Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Boolean
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: typings.babylonjs.bonesSkeletonMod.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
      /** The Scene scope*/
    scene: typings.babylonjs.sceneMod.Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Boolean,
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: Double
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: typings.babylonjs.bonesSkeletonMod.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
      /** The Scene scope*/
    scene: typings.babylonjs.sceneMod.Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Unit,
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: Double
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: typings.babylonjs.bonesSkeletonMod.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
      /** The Scene scope*/
    scene: typings.babylonjs.sceneMod.Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Boolean,
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: Double,
      /** is the options for the viewer */
    options: PartialISkeletonViewerOpt
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: typings.babylonjs.bonesSkeletonMod.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
      /** The Scene scope*/
    scene: typings.babylonjs.sceneMod.Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Boolean,
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: Unit,
      /** is the options for the viewer */
    options: PartialISkeletonViewerOpt
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: typings.babylonjs.bonesSkeletonMod.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
      /** The Scene scope*/
    scene: typings.babylonjs.sceneMod.Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Unit,
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: Double,
      /** is the options for the viewer */
    options: PartialISkeletonViewerOpt
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: typings.babylonjs.bonesSkeletonMod.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
      /** The Scene scope*/
    scene: typings.babylonjs.sceneMod.Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Unit,
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: Unit,
      /** is the options for the viewer */
    options: PartialISkeletonViewerOpt
    ) = this()
  }
  
  inline def SkeletonViewer_=(x: TypeofSkeletonViewer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SkeletonViewer")(x.asInstanceOf[js.Any])
}
