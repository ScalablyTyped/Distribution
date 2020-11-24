package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IBoneWeightShaderOptions
import typings.babylonjs.BABYLON.ISkeletonMapShaderOptions
import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.anon.PartialISkeletonViewerOptComputeBonesUsingShaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Debug")
@js.native
object Debug extends js.Object {
  
  @js.native
  class AxesViewer protected ()
    extends typings.babylonjs.BABYLON.Debug.AxesViewer {
    /**
      * Creates a new AxesViewer
      * @param scene defines the hosting scene
      * @param scaleLines defines a number used to scale line length (1 by default)
      * @param renderingGroupId defines a number used to set the renderingGroupId of the meshes (2 by default)
      * @param xAxis defines the node hierarchy used to render the x-axis
      * @param yAxis defines the node hierarchy used to render the y-axis
      * @param zAxis defines the node hierarchy used to render the z-axis
      */
    def this(scene: typings.babylonjs.BABYLON.Scene) = this()
    def this(scene: typings.babylonjs.BABYLON.Scene, scaleLines: Double) = this()
    def this(
      scene: typings.babylonjs.BABYLON.Scene,
      scaleLines: js.UndefOr[scala.Nothing],
      renderingGroupId: Nullable[Double]
    ) = this()
    def this(scene: typings.babylonjs.BABYLON.Scene, scaleLines: Double, renderingGroupId: Nullable[Double]) = this()
    def this(
      scene: typings.babylonjs.BABYLON.Scene,
      scaleLines: js.UndefOr[scala.Nothing],
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: typings.babylonjs.BABYLON.TransformNode
    ) = this()
    def this(
      scene: typings.babylonjs.BABYLON.Scene,
      scaleLines: Double,
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: typings.babylonjs.BABYLON.TransformNode
    ) = this()
    def this(
      scene: typings.babylonjs.BABYLON.Scene,
      scaleLines: js.UndefOr[scala.Nothing],
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: js.UndefOr[scala.Nothing],
      yAxis: typings.babylonjs.BABYLON.TransformNode
    ) = this()
    def this(
      scene: typings.babylonjs.BABYLON.Scene,
      scaleLines: js.UndefOr[scala.Nothing],
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: typings.babylonjs.BABYLON.TransformNode,
      yAxis: typings.babylonjs.BABYLON.TransformNode
    ) = this()
    def this(
      scene: typings.babylonjs.BABYLON.Scene,
      scaleLines: Double,
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: js.UndefOr[scala.Nothing],
      yAxis: typings.babylonjs.BABYLON.TransformNode
    ) = this()
    def this(
      scene: typings.babylonjs.BABYLON.Scene,
      scaleLines: Double,
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: typings.babylonjs.BABYLON.TransformNode,
      yAxis: typings.babylonjs.BABYLON.TransformNode
    ) = this()
    def this(
      scene: typings.babylonjs.BABYLON.Scene,
      scaleLines: js.UndefOr[scala.Nothing],
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: js.UndefOr[scala.Nothing],
      yAxis: js.UndefOr[scala.Nothing],
      zAxis: typings.babylonjs.BABYLON.TransformNode
    ) = this()
    def this(
      scene: typings.babylonjs.BABYLON.Scene,
      scaleLines: js.UndefOr[scala.Nothing],
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: js.UndefOr[scala.Nothing],
      yAxis: typings.babylonjs.BABYLON.TransformNode,
      zAxis: typings.babylonjs.BABYLON.TransformNode
    ) = this()
    def this(
      scene: typings.babylonjs.BABYLON.Scene,
      scaleLines: js.UndefOr[scala.Nothing],
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: typings.babylonjs.BABYLON.TransformNode,
      yAxis: js.UndefOr[scala.Nothing],
      zAxis: typings.babylonjs.BABYLON.TransformNode
    ) = this()
    def this(
      scene: typings.babylonjs.BABYLON.Scene,
      scaleLines: js.UndefOr[scala.Nothing],
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: typings.babylonjs.BABYLON.TransformNode,
      yAxis: typings.babylonjs.BABYLON.TransformNode,
      zAxis: typings.babylonjs.BABYLON.TransformNode
    ) = this()
    def this(
      scene: typings.babylonjs.BABYLON.Scene,
      scaleLines: Double,
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: js.UndefOr[scala.Nothing],
      yAxis: js.UndefOr[scala.Nothing],
      zAxis: typings.babylonjs.BABYLON.TransformNode
    ) = this()
    def this(
      scene: typings.babylonjs.BABYLON.Scene,
      scaleLines: Double,
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: js.UndefOr[scala.Nothing],
      yAxis: typings.babylonjs.BABYLON.TransformNode,
      zAxis: typings.babylonjs.BABYLON.TransformNode
    ) = this()
    def this(
      scene: typings.babylonjs.BABYLON.Scene,
      scaleLines: Double,
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: typings.babylonjs.BABYLON.TransformNode,
      yAxis: js.UndefOr[scala.Nothing],
      zAxis: typings.babylonjs.BABYLON.TransformNode
    ) = this()
    def this(
      scene: typings.babylonjs.BABYLON.Scene,
      scaleLines: Double,
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: typings.babylonjs.BABYLON.TransformNode,
      yAxis: typings.babylonjs.BABYLON.TransformNode,
      zAxis: typings.babylonjs.BABYLON.TransformNode
    ) = this()
  }
  /* static members */
  @js.native
  object AxesViewer extends js.Object {
    
    var _SetRenderingGroupId: js.Any = js.native
  }
  
  @js.native
  class BoneAxesViewer protected ()
    extends typings.babylonjs.BABYLON.Debug.BoneAxesViewer {
    /**
      * Creates a new BoneAxesViewer
      * @param scene defines the hosting scene
      * @param bone defines the target bone
      * @param mesh defines the target mesh
      * @param scaleLines defines a scaling factor for line length (1 by default)
      */
    def this(
      scene: typings.babylonjs.BABYLON.Scene,
      bone: typings.babylonjs.BABYLON.Bone,
      mesh: typings.babylonjs.BABYLON.Mesh
    ) = this()
    def this(
      scene: typings.babylonjs.BABYLON.Scene,
      bone: typings.babylonjs.BABYLON.Bone,
      mesh: typings.babylonjs.BABYLON.Mesh,
      scaleLines: Double
    ) = this()
  }
  
  @js.native
  class PhysicsViewer protected ()
    extends typings.babylonjs.BABYLON.Debug.PhysicsViewer {
    /**
      * Creates a new PhysicsViewer
      * @param scene defines the hosting scene
      */
    def this(scene: typings.babylonjs.BABYLON.Scene) = this()
  }
  
  @js.native
  class SkeletonViewer protected ()
    extends typings.babylonjs.BABYLON.Debug.SkeletonViewer {
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
    skeleton: typings.babylonjs.BABYLON.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
      /** The Scene scope*/
    scene: typings.babylonjs.BABYLON.Scene
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: typings.babylonjs.BABYLON.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
      /** The Scene scope*/
    scene: typings.babylonjs.BABYLON.Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Boolean
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: typings.babylonjs.BABYLON.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
      /** The Scene scope*/
    scene: typings.babylonjs.BABYLON.Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: js.UndefOr[scala.Nothing],
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: Double
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: typings.babylonjs.BABYLON.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
      /** The Scene scope*/
    scene: typings.babylonjs.BABYLON.Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Boolean,
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: Double
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: typings.babylonjs.BABYLON.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
      /** The Scene scope*/
    scene: typings.babylonjs.BABYLON.Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: js.UndefOr[scala.Nothing],
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: js.UndefOr[scala.Nothing],
      /** is the options for the viewer */
    options: PartialISkeletonViewerOptComputeBonesUsingShaders
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: typings.babylonjs.BABYLON.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
      /** The Scene scope*/
    scene: typings.babylonjs.BABYLON.Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: js.UndefOr[scala.Nothing],
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: Double,
      /** is the options for the viewer */
    options: PartialISkeletonViewerOptComputeBonesUsingShaders
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: typings.babylonjs.BABYLON.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
      /** The Scene scope*/
    scene: typings.babylonjs.BABYLON.Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Boolean,
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: js.UndefOr[scala.Nothing],
      /** is the options for the viewer */
    options: PartialISkeletonViewerOptComputeBonesUsingShaders
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: typings.babylonjs.BABYLON.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
      /** The Scene scope*/
    scene: typings.babylonjs.BABYLON.Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Boolean,
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: Double,
      /** is the options for the viewer */
    options: PartialISkeletonViewerOptComputeBonesUsingShaders
    ) = this()
  }
  /* static members */
  @js.native
  object SkeletonViewer extends js.Object {
    
    /** public static method to create a BoneWeight Shader
      * @param options The constructor options
      * @param scene The scene that the shader is scoped to
      * @returns The created ShaderMaterial
      * @see http://www.babylonjs-playground.com/#1BZJVJ#395
      */
    def CreateBoneWeightShader(options: IBoneWeightShaderOptions, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.ShaderMaterial = js.native
    
    /** public static method to create a BoneWeight Shader
      * @param options The constructor options
      * @param scene The scene that the shader is scoped to
      * @returns The created ShaderMaterial
      */
    def CreateSkeletonMapShader(options: ISkeletonMapShaderOptions, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.ShaderMaterial = js.native
    
    /** public Display constants BABYLON.SkeletonViewer.DISPLAY_LINES */
    val DISPLAY_LINES: Double = js.native
    
    /** public Display constants BABYLON.SkeletonViewer.DISPLAY_SPHERES */
    val DISPLAY_SPHERES: Double = js.native
    
    /** public Display constants BABYLON.SkeletonViewer.DISPLAY_SPHERE_AND_SPURS */
    val DISPLAY_SPHERE_AND_SPURS: Double = js.native
    
    /** private static method to create a BoneWeight Shader
      * @param size The size of the buffer to create (usually the bone count)
      * @param colorMap The gradient data to generate
      * @param scene The scene that the shader is scoped to
      * @returns an Array of floats from the color gradient values
      */
    var _CreateBoneMapColorBuffer: js.Any = js.native
  }
}
