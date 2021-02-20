package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.anon.PartialISkeletonViewerOpt
import typings.babylonjs.boneMod.Bone
import typings.babylonjs.iskeletonviewerMod.IBoneWeightShaderOptions
import typings.babylonjs.iskeletonviewerMod.ISkeletonMapShaderOptions
import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.rayMod.Ray
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.shaderMaterialMod.ShaderMaterial
import typings.babylonjs.skeletonMod.Skeleton
import typings.babylonjs.transformNodeMod.TransformNode
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debugIndexMod {
  
  @JSImport("babylonjs/Debug/index", "AxesViewer")
  @js.native
  class AxesViewer protected ()
    extends typings.babylonjs.axesViewerMod.AxesViewer {
    /**
      * Creates a new AxesViewer
      * @param scene defines the hosting scene
      * @param scaleLines defines a number used to scale line length (1 by default)
      * @param renderingGroupId defines a number used to set the renderingGroupId of the meshes (2 by default)
      * @param xAxis defines the node hierarchy used to render the x-axis
      * @param yAxis defines the node hierarchy used to render the y-axis
      * @param zAxis defines the node hierarchy used to render the z-axis
      */
    def this(scene: Scene) = this()
    def this(scene: Scene, scaleLines: Double) = this()
    def this(scene: Scene, scaleLines: js.UndefOr[scala.Nothing], renderingGroupId: Nullable[Double]) = this()
    def this(scene: Scene, scaleLines: Double, renderingGroupId: Nullable[Double]) = this()
    def this(
      scene: Scene,
      scaleLines: js.UndefOr[scala.Nothing],
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: TransformNode
    ) = this()
    def this(
      scene: Scene,
      scaleLines: Double,
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: TransformNode
    ) = this()
    def this(
      scene: Scene,
      scaleLines: js.UndefOr[scala.Nothing],
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: js.UndefOr[scala.Nothing],
      yAxis: TransformNode
    ) = this()
    def this(
      scene: Scene,
      scaleLines: js.UndefOr[scala.Nothing],
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: TransformNode,
      yAxis: TransformNode
    ) = this()
    def this(
      scene: Scene,
      scaleLines: Double,
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: js.UndefOr[scala.Nothing],
      yAxis: TransformNode
    ) = this()
    def this(
      scene: Scene,
      scaleLines: Double,
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: TransformNode,
      yAxis: TransformNode
    ) = this()
    def this(
      scene: Scene,
      scaleLines: js.UndefOr[scala.Nothing],
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: js.UndefOr[scala.Nothing],
      yAxis: js.UndefOr[scala.Nothing],
      zAxis: TransformNode
    ) = this()
    def this(
      scene: Scene,
      scaleLines: js.UndefOr[scala.Nothing],
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: js.UndefOr[scala.Nothing],
      yAxis: TransformNode,
      zAxis: TransformNode
    ) = this()
    def this(
      scene: Scene,
      scaleLines: js.UndefOr[scala.Nothing],
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: TransformNode,
      yAxis: js.UndefOr[scala.Nothing],
      zAxis: TransformNode
    ) = this()
    def this(
      scene: Scene,
      scaleLines: js.UndefOr[scala.Nothing],
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: TransformNode,
      yAxis: TransformNode,
      zAxis: TransformNode
    ) = this()
    def this(
      scene: Scene,
      scaleLines: Double,
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: js.UndefOr[scala.Nothing],
      yAxis: js.UndefOr[scala.Nothing],
      zAxis: TransformNode
    ) = this()
    def this(
      scene: Scene,
      scaleLines: Double,
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: js.UndefOr[scala.Nothing],
      yAxis: TransformNode,
      zAxis: TransformNode
    ) = this()
    def this(
      scene: Scene,
      scaleLines: Double,
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: TransformNode,
      yAxis: js.UndefOr[scala.Nothing],
      zAxis: TransformNode
    ) = this()
    def this(
      scene: Scene,
      scaleLines: Double,
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: TransformNode,
      yAxis: TransformNode,
      zAxis: TransformNode
    ) = this()
  }
  /* static members */
  object AxesViewer {
    
    @JSImport("babylonjs/Debug/index", "AxesViewer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Debug/index", "AxesViewer._SetRenderingGroupId")
    @js.native
    def _SetRenderingGroupId: js.Any = js.native
    @scala.inline
    def _SetRenderingGroupId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SetRenderingGroupId")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Debug/index", "BoneAxesViewer")
  @js.native
  class BoneAxesViewer protected ()
    extends typings.babylonjs.boneAxesViewerMod.BoneAxesViewer {
    /**
      * Creates a new BoneAxesViewer
      * @param scene defines the hosting scene
      * @param bone defines the target bone
      * @param mesh defines the target mesh
      * @param scaleLines defines a scaling factor for line length (1 by default)
      */
    def this(scene: Scene, bone: Bone, mesh: Mesh) = this()
    def this(scene: Scene, bone: Bone, mesh: Mesh, scaleLines: Double) = this()
  }
  
  @JSImport("babylonjs/Debug/index", "DebugLayer")
  @js.native
  class DebugLayer protected ()
    extends typings.babylonjs.debugLayerMod.DebugLayer {
    /**
      * Instantiates a new debug layer.
      * The debug layer (aka Inspector) is the go to tool in order to better understand
      * what is happening in your scene
      * @see https://doc.babylonjs.com/features/playground_debuglayer
      * @param scene Defines the scene to inspect
      */
    def this(scene: Scene) = this()
  }
  /* static members */
  object DebugLayer {
    
    @JSImport("babylonjs/Debug/index", "DebugLayer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Define the url to get the inspector script from.
      * By default it uses the babylonjs CDN.
      * @ignoreNaming
      */
    @JSImport("babylonjs/Debug/index", "DebugLayer.InspectorURL")
    @js.native
    def InspectorURL: String = js.native
    @scala.inline
    def InspectorURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InspectorURL")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Debug/index", "DebugLayerTab")
  @js.native
  object DebugLayerTab extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.babylonjs.debugLayerMod.DebugLayerTab with Double] = js.native
    
    /* 1 */ val Debug: typings.babylonjs.debugLayerMod.DebugLayerTab.Debug with Double = js.native
    
    /* 0 */ val Properties: typings.babylonjs.debugLayerMod.DebugLayerTab.Properties with Double = js.native
    
    /* 4 */ val Settings: typings.babylonjs.debugLayerMod.DebugLayerTab.Settings with Double = js.native
    
    /* 2 */ val Statistics: typings.babylonjs.debugLayerMod.DebugLayerTab.Statistics with Double = js.native
    
    /* 3 */ val Tools: typings.babylonjs.debugLayerMod.DebugLayerTab.Tools with Double = js.native
  }
  
  @JSImport("babylonjs/Debug/index", "PhysicsViewer")
  @js.native
  class PhysicsViewer protected ()
    extends typings.babylonjs.physicsViewerMod.PhysicsViewer {
    /**
      * Creates a new PhysicsViewer
      * @param scene defines the hosting scene
      */
    def this(scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Debug/index", "RayHelper")
  @js.native
  class RayHelper protected ()
    extends typings.babylonjs.rayHelperMod.RayHelper {
    /**
      * Instantiate a new ray helper.
      * As raycast might be hard to debug, the RayHelper can help rendering the different rays
      * in order to better appreciate the issue one might have.
      * @see https://doc.babylonjs.com/babylon101/raycasts#debugging
      * @param ray Defines the ray we are currently tryin to visualize
      */
    def this(ray: Ray) = this()
  }
  /* static members */
  object RayHelper {
    
    /**
      * Helper function to create a colored helper in a scene in one line.
      * @param ray Defines the ray we are currently tryin to visualize
      * @param scene Defines the scene the ray is used in
      * @param color Defines the color we want to see the ray in
      * @returns The newly created ray helper.
      */
    @JSImport("babylonjs/Debug/index", "RayHelper.CreateAndShow")
    @js.native
    def CreateAndShow(ray: Ray, scene: Scene, color: Color3): typings.babylonjs.rayHelperMod.RayHelper = js.native
  }
  
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
      * @param options All of the extra constructor options for the SkeletonViewer
      */
    def this(
      /** defines the skeleton to render */
    skeleton: Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: AbstractMesh,
      /** The Scene scope*/
    scene: Scene
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: AbstractMesh,
      /** The Scene scope*/
    scene: Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Boolean
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: AbstractMesh,
      /** The Scene scope*/
    scene: Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: js.UndefOr[scala.Nothing],
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: Double
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: AbstractMesh,
      /** The Scene scope*/
    scene: Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Boolean,
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: Double
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: AbstractMesh,
      /** The Scene scope*/
    scene: Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: js.UndefOr[scala.Nothing],
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: js.UndefOr[scala.Nothing],
      /** is the options for the viewer */
    options: PartialISkeletonViewerOpt
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: AbstractMesh,
      /** The Scene scope*/
    scene: Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: js.UndefOr[scala.Nothing],
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: Double,
      /** is the options for the viewer */
    options: PartialISkeletonViewerOpt
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: AbstractMesh,
      /** The Scene scope*/
    scene: Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Boolean,
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: js.UndefOr[scala.Nothing],
      /** is the options for the viewer */
    options: PartialISkeletonViewerOpt
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: AbstractMesh,
      /** The Scene scope*/
    scene: Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Boolean,
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: Double,
      /** is the options for the viewer */
    options: PartialISkeletonViewerOpt
    ) = this()
  }
  /* static members */
  object SkeletonViewer {
    
    @JSImport("babylonjs/Debug/index", "SkeletonViewer")
    @js.native
    val ^ : js.Any = js.native
    
    /** public static method to create a BoneWeight Shader
      * @param options The constructor options
      * @param scene The scene that the shader is scoped to
      * @returns The created ShaderMaterial
      * @see http://www.babylonjs-playground.com/#1BZJVJ#395
      */
    @JSImport("babylonjs/Debug/index", "SkeletonViewer.CreateBoneWeightShader")
    @js.native
    def CreateBoneWeightShader(options: IBoneWeightShaderOptions, scene: Scene): ShaderMaterial = js.native
    
    /** public static method to create a BoneWeight Shader
      * @param options The constructor options
      * @param scene The scene that the shader is scoped to
      * @returns The created ShaderMaterial
      */
    @JSImport("babylonjs/Debug/index", "SkeletonViewer.CreateSkeletonMapShader")
    @js.native
    def CreateSkeletonMapShader(options: ISkeletonMapShaderOptions, scene: Scene): ShaderMaterial = js.native
    
    /** public Display constants BABYLON.SkeletonViewer.DISPLAY_LINES */
    @JSImport("babylonjs/Debug/index", "SkeletonViewer.DISPLAY_LINES")
    @js.native
    val DISPLAY_LINES: Double = js.native
    
    /** public Display constants BABYLON.SkeletonViewer.DISPLAY_SPHERES */
    @JSImport("babylonjs/Debug/index", "SkeletonViewer.DISPLAY_SPHERES")
    @js.native
    val DISPLAY_SPHERES: Double = js.native
    
    /** public Display constants BABYLON.SkeletonViewer.DISPLAY_SPHERE_AND_SPURS */
    @JSImport("babylonjs/Debug/index", "SkeletonViewer.DISPLAY_SPHERE_AND_SPURS")
    @js.native
    val DISPLAY_SPHERE_AND_SPURS: Double = js.native
    
    /** private static method to create a BoneWeight Shader
      * @param size The size of the buffer to create (usually the bone count)
      * @param colorMap The gradient data to generate
      * @param scene The scene that the shader is scoped to
      * @returns an Array of floats from the color gradient values
      */
    @JSImport("babylonjs/Debug/index", "SkeletonViewer._CreateBoneMapColorBuffer")
    @js.native
    def _CreateBoneMapColorBuffer: js.Any = js.native
    @scala.inline
    def _CreateBoneMapColorBuffer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateBoneMapColorBuffer")(x.asInstanceOf[js.Any])
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /**
        * @hidden
        * Backing field
        */
      var _debugLayer: typings.babylonjs.debugLayerMod.DebugLayer = js.native
      
      /**
        * Gets the debug layer (aka Inspector) associated with the scene
        * @see https://doc.babylonjs.com/features/playground_debuglayer
        */
      var debugLayer: typings.babylonjs.debugLayerMod.DebugLayer = js.native
    }
    object Scene {
      
      @scala.inline
      def apply(
        _debugLayer: typings.babylonjs.debugLayerMod.DebugLayer,
        debugLayer: typings.babylonjs.debugLayerMod.DebugLayer
      ): typings.babylonjs.debugIndexMod.babylonjsSceneAugmentingMod.Scene = {
        val __obj = js.Dynamic.literal(_debugLayer = _debugLayer.asInstanceOf[js.Any], debugLayer = debugLayer.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.babylonjs.debugIndexMod.babylonjsSceneAugmentingMod.Scene]
      }
      
      @scala.inline
      implicit class SceneMutableBuilder[Self <: typings.babylonjs.debugIndexMod.babylonjsSceneAugmentingMod.Scene] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDebugLayer(value: typings.babylonjs.debugLayerMod.DebugLayer): Self = StObject.set(x, "debugLayer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_debugLayer(value: typings.babylonjs.debugLayerMod.DebugLayer): Self = StObject.set(x, "_debugLayer", value.asInstanceOf[js.Any])
      }
    }
  }
}
