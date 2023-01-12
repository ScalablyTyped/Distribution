package typings.babylonjs

import typings.babylonjs.anon.PartialISkeletonViewerOpt
import typings.babylonjs.bonesBoneMod.Bone
import typings.babylonjs.bonesSkeletonMod.Skeleton
import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.cullingRayMod.Ray
import typings.babylonjs.debugIskeletonviewerMod.IBoneWeightShaderOptions
import typings.babylonjs.debugIskeletonviewerMod.ISkeletonMapShaderOptions
import typings.babylonjs.lightsDirectionalLightMod.DirectionalLight
import typings.babylonjs.materialsShaderMaterialMod.ShaderMaterial
import typings.babylonjs.mathsMathDotcolorMod.Color3
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.meshesTransformNodeMod.TransformNode
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debugIndexMod {
  
  @JSImport("babylonjs/Debug/index", "AxesViewer")
  @js.native
  open class AxesViewer protected ()
    extends typings.babylonjs.debugAxesViewerMod.AxesViewer {
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
      scene: js.UndefOr[Scene],
      scaleLines: js.UndefOr[Double],
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: js.UndefOr[TransformNode],
      yAxis: js.UndefOr[TransformNode],
      zAxis: js.UndefOr[TransformNode],
      lineThickness: js.UndefOr[Double]
    ) = this()
  }
  /* static members */
  object AxesViewer {
    
    @JSImport("babylonjs/Debug/index", "AxesViewer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Debug/index", "AxesViewer._SetRenderingGroupId")
    @js.native
    def _SetRenderingGroupId: Any = js.native
    inline def _SetRenderingGroupId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SetRenderingGroupId")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Debug/index", "BoneAxesViewer")
  @js.native
  open class BoneAxesViewer protected ()
    extends typings.babylonjs.debugBoneAxesViewerMod.BoneAxesViewer {
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
  /**
    * Instantiates a new debug layer.
    * The debug layer (aka Inspector) is the go to tool in order to better understand
    * what is happening in your scene
    * @see https://doc.babylonjs.com/toolsAndResources/inspector
    * @param scene Defines the scene to inspect
    */
  open class DebugLayer ()
    extends typings.babylonjs.debugDebugLayerMod.DebugLayer {
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
    inline def InspectorURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InspectorURL")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Debug/index", "DebugLayerTab")
  @js.native
  object DebugLayerTab extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.babylonjs.debugDebugLayerMod.DebugLayerTab & Double] = js.native
    
    /* 1 */ val Debug: typings.babylonjs.debugDebugLayerMod.DebugLayerTab.Debug & Double = js.native
    
    /* 0 */ val Properties: typings.babylonjs.debugDebugLayerMod.DebugLayerTab.Properties & Double = js.native
    
    /* 4 */ val Settings: typings.babylonjs.debugDebugLayerMod.DebugLayerTab.Settings & Double = js.native
    
    /* 2 */ val Statistics: typings.babylonjs.debugDebugLayerMod.DebugLayerTab.Statistics & Double = js.native
    
    /* 3 */ val Tools: typings.babylonjs.debugDebugLayerMod.DebugLayerTab.Tools & Double = js.native
  }
  
  @JSImport("babylonjs/Debug/index", "DirectionalLightFrustumViewer")
  @js.native
  open class DirectionalLightFrustumViewer protected ()
    extends typings.babylonjs.debugDirectionalLightFrustumViewerMod.DirectionalLightFrustumViewer {
    /**
      * Creates a new frustum viewer
      * @param light directional light to display the frustum for
      * @param camera camera used to retrieve the minZ / maxZ values if the shadowMinZ/shadowMaxZ values of the light are not setup
      */
    def this(light: DirectionalLight, camera: Camera) = this()
  }
  
  @JSImport("babylonjs/Debug/index", "PhysicsViewer")
  @js.native
  /**
    * Creates a new PhysicsViewer
    * @param scene defines the hosting scene
    */
  open class PhysicsViewer ()
    extends typings.babylonjs.debugPhysicsViewerMod.PhysicsViewer {
    def this(scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Debug/index", "RayHelper")
  @js.native
  open class RayHelper protected ()
    extends typings.babylonjs.debugRayHelperMod.RayHelper {
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
    
    @JSImport("babylonjs/Debug/index", "RayHelper")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Helper function to create a colored helper in a scene in one line.
      * @param ray Defines the ray we are currently tryin to visualize
      * @param scene Defines the scene the ray is used in
      * @param color Defines the color we want to see the ray in
      * @returns The newly created ray helper.
      */
    inline def CreateAndShow(ray: Ray, scene: Scene, color: Color3): typings.babylonjs.debugRayHelperMod.RayHelper = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndShow")(ray.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.debugRayHelperMod.RayHelper]
  }
  
  @JSImport("babylonjs/Debug/index", "SkeletonViewer")
  @js.native
  open class SkeletonViewer protected ()
    extends typings.babylonjs.debugSkeletonViewerMod.SkeletonViewer {
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
    autoUpdateBonesMatrices: Unit,
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
    renderingGroupId: Unit,
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
    autoUpdateBonesMatrices: Unit,
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
    autoUpdateBonesMatrices: Unit,
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: Unit,
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
    inline def CreateBoneWeightShader(options: IBoneWeightShaderOptions, scene: Scene): ShaderMaterial = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBoneWeightShader")(options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[ShaderMaterial]
    
    /** public static method to create a BoneWeight Shader
      * @param options The constructor options
      * @param scene The scene that the shader is scoped to
      * @returns The created ShaderMaterial
      */
    inline def CreateSkeletonMapShader(options: ISkeletonMapShaderOptions, scene: Scene): ShaderMaterial = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSkeletonMapShader")(options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[ShaderMaterial]
    
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
    def _CreateBoneMapColorBuffer: Any = js.native
    inline def _CreateBoneMapColorBuffer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateBoneMapColorBuffer")(x.asInstanceOf[js.Any])
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    trait Scene extends StObject {
      
      /**
        * @internal
        * Backing field
        */
      var _debugLayer: typings.babylonjs.debugDebugLayerMod.DebugLayer
      
      /**
        * Gets the debug layer (aka Inspector) associated with the scene
        * @see https://doc.babylonjs.com/toolsAndResources/inspector
        */
      var debugLayer: typings.babylonjs.debugDebugLayerMod.DebugLayer
    }
    object Scene {
      
      inline def apply(
        _debugLayer: typings.babylonjs.debugDebugLayerMod.DebugLayer,
        debugLayer: typings.babylonjs.debugDebugLayerMod.DebugLayer
      ): typings.babylonjs.debugIndexMod.babylonjsSceneAugmentingMod.Scene = {
        val __obj = js.Dynamic.literal(_debugLayer = _debugLayer.asInstanceOf[js.Any], debugLayer = debugLayer.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.babylonjs.debugIndexMod.babylonjsSceneAugmentingMod.Scene]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.babylonjs.debugIndexMod.babylonjsSceneAugmentingMod.Scene] (val x: Self) extends AnyVal {
        
        inline def setDebugLayer(value: typings.babylonjs.debugDebugLayerMod.DebugLayer): Self = StObject.set(x, "debugLayer", value.asInstanceOf[js.Any])
        
        inline def set_debugLayer(value: typings.babylonjs.debugDebugLayerMod.DebugLayer): Self = StObject.set(x, "_debugLayer", value.asInstanceOf[js.Any])
      }
    }
  }
}
