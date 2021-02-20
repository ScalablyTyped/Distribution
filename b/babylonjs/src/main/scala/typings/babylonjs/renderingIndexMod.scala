package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.edgesRendererMod.IEdgesRendererOptions
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.shaderMaterialMod.ShaderMaterial
import typings.babylonjs.subMeshMod.SubMesh
import typings.babylonjs.subSurfaceConfigurationMod.SubSurfaceConfiguration
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderingIndexMod {
  
  @JSImport("babylonjs/Rendering/index", "BoundingBoxRenderer")
  @js.native
  class BoundingBoxRenderer protected ()
    extends typings.babylonjs.boundingBoxRendererMod.BoundingBoxRenderer {
    /**
      * Instantiates a new bounding box renderer in a scene.
      * @param scene the scene the  renderer renders in
      */
    def this(scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Rendering/index", "DepthRenderer")
  @js.native
  class DepthRenderer protected ()
    extends typings.babylonjs.depthRendererMod.DepthRenderer {
    /**
      * Instantiates a depth renderer
      * @param scene The scene the renderer belongs to
      * @param type The texture type of the depth map (default: Engine.TEXTURETYPE_FLOAT)
      * @param camera The camera to be used to render the depth map (default: scene's active camera)
      * @param storeNonLinearDepth Defines whether the depth is stored linearly like in Babylon Shadows or directly like glFragCoord.z
      */
    def this(scene: Scene) = this()
    def this(scene: Scene, `type`: Double) = this()
    def this(scene: Scene, `type`: js.UndefOr[scala.Nothing], camera: Nullable[Camera]) = this()
    def this(scene: Scene, `type`: Double, camera: Nullable[Camera]) = this()
    def this(
      scene: Scene,
      `type`: js.UndefOr[scala.Nothing],
      camera: js.UndefOr[Nullable[Camera]],
      storeNonLinearDepth: Boolean
    ) = this()
    def this(scene: Scene, `type`: Double, camera: js.UndefOr[Nullable[Camera]], storeNonLinearDepth: Boolean) = this()
  }
  /* static members */
  object DepthRenderer {
    
    /** @hidden */
    @JSImport("babylonjs/Rendering/index", "DepthRenderer._SceneComponentInitialization")
    @js.native
    def _SceneComponentInitialization(scene: Scene): Unit = js.native
  }
  
  @JSImport("babylonjs/Rendering/index", "DepthRendererSceneComponent")
  @js.native
  class DepthRendererSceneComponent protected ()
    extends typings.babylonjs.depthRendererSceneComponentMod.DepthRendererSceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Rendering/index", "EdgesRenderer")
  @js.native
  class EdgesRenderer protected ()
    extends typings.babylonjs.edgesRendererMod.EdgesRenderer {
    /**
      * Creates an instance of the EdgesRenderer. It is primarily use to display edges of a mesh.
      * Beware when you use this class with complex objects as the adjacencies computation can be really long
      * @param  source Mesh used to create edges
      * @param  epsilon sum of angles in adjacency to check for edge
      * @param  checkVerticesInsteadOfIndices bases the edges detection on vertices vs indices. Note that this parameter is not used if options.useAlternateEdgeFinder = true
      * @param  generateEdgesLines - should generate Lines or only prepare resources.
      * @param  options The options to apply when generating the edges
      */
    def this(source: AbstractMesh) = this()
    def this(source: AbstractMesh, epsilon: Double) = this()
    def this(source: AbstractMesh, epsilon: js.UndefOr[scala.Nothing], checkVerticesInsteadOfIndices: Boolean) = this()
    def this(source: AbstractMesh, epsilon: Double, checkVerticesInsteadOfIndices: Boolean) = this()
    def this(
      source: AbstractMesh,
      epsilon: js.UndefOr[scala.Nothing],
      checkVerticesInsteadOfIndices: js.UndefOr[scala.Nothing],
      generateEdgesLines: Boolean
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: js.UndefOr[scala.Nothing],
      checkVerticesInsteadOfIndices: Boolean,
      generateEdgesLines: Boolean
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: Double,
      checkVerticesInsteadOfIndices: js.UndefOr[scala.Nothing],
      generateEdgesLines: Boolean
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: Double,
      checkVerticesInsteadOfIndices: Boolean,
      generateEdgesLines: Boolean
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: js.UndefOr[scala.Nothing],
      checkVerticesInsteadOfIndices: js.UndefOr[scala.Nothing],
      generateEdgesLines: js.UndefOr[scala.Nothing],
      options: IEdgesRendererOptions
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: js.UndefOr[scala.Nothing],
      checkVerticesInsteadOfIndices: js.UndefOr[scala.Nothing],
      generateEdgesLines: Boolean,
      options: IEdgesRendererOptions
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: js.UndefOr[scala.Nothing],
      checkVerticesInsteadOfIndices: Boolean,
      generateEdgesLines: js.UndefOr[scala.Nothing],
      options: IEdgesRendererOptions
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: js.UndefOr[scala.Nothing],
      checkVerticesInsteadOfIndices: Boolean,
      generateEdgesLines: Boolean,
      options: IEdgesRendererOptions
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: Double,
      checkVerticesInsteadOfIndices: js.UndefOr[scala.Nothing],
      generateEdgesLines: js.UndefOr[scala.Nothing],
      options: IEdgesRendererOptions
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: Double,
      checkVerticesInsteadOfIndices: js.UndefOr[scala.Nothing],
      generateEdgesLines: Boolean,
      options: IEdgesRendererOptions
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: Double,
      checkVerticesInsteadOfIndices: Boolean,
      generateEdgesLines: js.UndefOr[scala.Nothing],
      options: IEdgesRendererOptions
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: Double,
      checkVerticesInsteadOfIndices: Boolean,
      generateEdgesLines: Boolean,
      options: IEdgesRendererOptions
    ) = this()
  }
  /* static members */
  object EdgesRenderer {
    
    @JSImport("babylonjs/Rendering/index", "EdgesRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Rendering/index", "EdgesRenderer.GetShader")
    @js.native
    def GetShader: js.Any = js.native
    @scala.inline
    def GetShader_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GetShader")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Rendering/index", "GeometryBufferRenderer")
  @js.native
  class GeometryBufferRenderer protected ()
    extends typings.babylonjs.geometryBufferRendererMod.GeometryBufferRenderer {
    /**
      * Creates a new G Buffer for the scene
      * @param scene The scene the buffer belongs to
      * @param ratio How big is the buffer related to the main canvas.
      */
    def this(scene: Scene) = this()
    def this(scene: Scene, ratio: Double) = this()
  }
  /* static members */
  object GeometryBufferRenderer {
    
    /**
      * Constant used to retrieve the depth + normal texture index in the G-Buffer textures array
      * using getIndex(GeometryBufferRenderer.DEPTHNORMAL_TEXTURE_INDEX)
      */
    @JSImport("babylonjs/Rendering/index", "GeometryBufferRenderer.DEPTHNORMAL_TEXTURE_TYPE")
    @js.native
    val DEPTHNORMAL_TEXTURE_TYPE: Double = js.native
    
    /**
      * Constant used to retrieve the position texture index in the G-Buffer textures array
      * using getIndex(GeometryBufferRenderer.POSITION_TEXTURE_INDEX)
      */
    @JSImport("babylonjs/Rendering/index", "GeometryBufferRenderer.POSITION_TEXTURE_TYPE")
    @js.native
    val POSITION_TEXTURE_TYPE: Double = js.native
    
    /**
      * Constant used to retrieve the reflectivity texture index in the G-Buffer textures array
      * using the getIndex(GeometryBufferRenderer.REFLECTIVITY_TEXTURE_TYPE)
      */
    @JSImport("babylonjs/Rendering/index", "GeometryBufferRenderer.REFLECTIVITY_TEXTURE_TYPE")
    @js.native
    val REFLECTIVITY_TEXTURE_TYPE: Double = js.native
    
    /**
      * Constant used to retrieve the velocity texture index in the G-Buffer textures array
      * using getIndex(GeometryBufferRenderer.VELOCITY_TEXTURE_INDEX)
      */
    @JSImport("babylonjs/Rendering/index", "GeometryBufferRenderer.VELOCITY_TEXTURE_TYPE")
    @js.native
    val VELOCITY_TEXTURE_TYPE: Double = js.native
    
    /** @hidden */
    @JSImport("babylonjs/Rendering/index", "GeometryBufferRenderer._SceneComponentInitialization")
    @js.native
    def _SceneComponentInitialization(scene: Scene): Unit = js.native
  }
  
  @JSImport("babylonjs/Rendering/index", "GeometryBufferRendererSceneComponent")
  @js.native
  class GeometryBufferRendererSceneComponent protected ()
    extends typings.babylonjs.geometryBufferRendererSceneComponentMod.GeometryBufferRendererSceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Rendering/index", "LineEdgesRenderer")
  @js.native
  class LineEdgesRenderer protected ()
    extends typings.babylonjs.edgesRendererMod.LineEdgesRenderer {
    /**
      * This constructor turns off auto generating edges line in Edges Renderer to make it here.
      * @param  source LineMesh used to generate edges
      * @param  epsilon not important (specified angle for edge detection)
      * @param  checkVerticesInsteadOfIndices not important for LineMesh
      */
    def this(source: AbstractMesh) = this()
    def this(source: AbstractMesh, epsilon: Double) = this()
    def this(source: AbstractMesh, epsilon: js.UndefOr[scala.Nothing], checkVerticesInsteadOfIndices: Boolean) = this()
    def this(source: AbstractMesh, epsilon: Double, checkVerticesInsteadOfIndices: Boolean) = this()
  }
  
  @JSImport("babylonjs/Rendering/index", "OutlineRenderer")
  @js.native
  class OutlineRenderer protected ()
    extends typings.babylonjs.outlineRendererMod.OutlineRenderer {
    /**
      * Instantiates a new outline renderer. (There could be only one per scene).
      * @param scene Defines the scene it belongs to
      */
    def this(scene: Scene) = this()
  }
  /* static members */
  object OutlineRenderer {
    
    @JSImport("babylonjs/Rendering/index", "OutlineRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Stencil value used to avoid outline being seen within the mesh when the mesh is transparent
      */
    @JSImport("babylonjs/Rendering/index", "OutlineRenderer._StencilReference")
    @js.native
    def _StencilReference: js.Any = js.native
    @scala.inline
    def _StencilReference_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_StencilReference")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Rendering/index", "PrePassRenderer")
  @js.native
  class PrePassRenderer protected ()
    extends typings.babylonjs.prePassRendererMod.PrePassRenderer {
    /**
      * Instanciates a prepass renderer
      * @param scene The scene
      */
    def this(scene: Scene) = this()
  }
  /* static members */
  object PrePassRenderer {
    
    /** @hidden */
    @JSImport("babylonjs/Rendering/index", "PrePassRenderer._SceneComponentInitialization")
    @js.native
    def _SceneComponentInitialization(scene: Scene): Unit = js.native
  }
  
  @JSImport("babylonjs/Rendering/index", "PrePassRendererSceneComponent")
  @js.native
  class PrePassRendererSceneComponent protected ()
    extends typings.babylonjs.prePassRendererSceneComponentMod.PrePassRendererSceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Rendering/index", "RenderingGroup")
  @js.native
  class RenderingGroup protected ()
    extends typings.babylonjs.renderingGroupMod.RenderingGroup {
    /**
      * Creates a new rendering group.
      * @param index The rendering group index
      * @param opaqueSortCompareFn The opaque sort comparison function. If null no order is applied
      * @param alphaTestSortCompareFn The alpha test sort comparison function. If null no order is applied
      * @param transparentSortCompareFn The transparent sort comparison function. If null back to front + alpha index sort is applied
      */
    def this(index: Double, scene: Scene) = this()
    def this(
      index: Double,
      scene: Scene,
      opaqueSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]
    ) = this()
    def this(
      index: Double,
      scene: Scene,
      opaqueSortCompareFn: js.UndefOr[Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]],
      alphaTestSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]
    ) = this()
    def this(
      index: Double,
      scene: Scene,
      opaqueSortCompareFn: js.UndefOr[Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]],
      alphaTestSortCompareFn: js.UndefOr[Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]],
      transparentSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]
    ) = this()
  }
  /* static members */
  object RenderingGroup {
    
    @JSImport("babylonjs/Rendering/index", "RenderingGroup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Rendering/index", "RenderingGroup._zeroVector")
    @js.native
    def _zeroVector: js.Any = js.native
    @scala.inline
    def _zeroVector_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_zeroVector")(x.asInstanceOf[js.Any])
    
    /**
      * Build in function which can be applied to ensure meshes of a special queue (opaque, alpha test, transparent)
      * are rendered back to front.
      *
      * @param a The first submesh
      * @param b The second submesh
      * @returns The result of the comparison
      */
    @JSImport("babylonjs/Rendering/index", "RenderingGroup.backToFrontSortCompare")
    @js.native
    def backToFrontSortCompare(a: SubMesh, b: SubMesh): Double = js.native
    
    /**
      * Build in function which can be applied to ensure meshes of a special queue (opaque, alpha test, transparent)
      * are rendered back to front if in the same alpha index.
      *
      * @param a The first submesh
      * @param b The second submesh
      * @returns The result of the comparison
      */
    @JSImport("babylonjs/Rendering/index", "RenderingGroup.defaultTransparentSortCompare")
    @js.native
    def defaultTransparentSortCompare(a: SubMesh, b: SubMesh): Double = js.native
    
    /**
      * Build in function which can be applied to ensure meshes of a special queue (opaque, alpha test, transparent)
      * are rendered front to back (prevent overdraw).
      *
      * @param a The first submesh
      * @param b The second submesh
      * @returns The result of the comparison
      */
    @JSImport("babylonjs/Rendering/index", "RenderingGroup.frontToBackSortCompare")
    @js.native
    def frontToBackSortCompare(a: SubMesh, b: SubMesh): Double = js.native
    
    /**
      * Renders the submeshes in a specified order.
      * @param subMeshes The submeshes to sort before render
      * @param sortCompareFn The comparison function use to sort
      * @param cameraPosition The camera position use to preprocess the submeshes to help sorting
      * @param transparent Specifies to activate blending if true
      */
    @JSImport("babylonjs/Rendering/index", "RenderingGroup.renderSorted")
    @js.native
    def renderSorted: js.Any = js.native
    @scala.inline
    def renderSorted_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderSorted")(x.asInstanceOf[js.Any])
    
    /**
      * Renders the submeshes in the order they were dispatched (no sort applied).
      * @param subMeshes The submeshes to render
      */
    @JSImport("babylonjs/Rendering/index", "RenderingGroup.renderUnsorted")
    @js.native
    def renderUnsorted: js.Any = js.native
    @scala.inline
    def renderUnsorted_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderUnsorted")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Rendering/index", "RenderingGroupInfo")
  @js.native
  class RenderingGroupInfo ()
    extends typings.babylonjs.renderingManagerMod.RenderingGroupInfo
  
  @JSImport("babylonjs/Rendering/index", "RenderingManager")
  @js.native
  class RenderingManager protected ()
    extends typings.babylonjs.renderingManagerMod.RenderingManager {
    /**
      * Instantiates a new rendering group for a particular scene
      * @param scene Defines the scene the groups belongs to
      */
    def this(scene: Scene) = this()
  }
  /* static members */
  object RenderingManager {
    
    @JSImport("babylonjs/Rendering/index", "RenderingManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Used to globally prevent autoclearing scenes.
      */
    @JSImport("babylonjs/Rendering/index", "RenderingManager.AUTOCLEAR")
    @js.native
    def AUTOCLEAR: Boolean = js.native
    @scala.inline
    def AUTOCLEAR_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTOCLEAR")(x.asInstanceOf[js.Any])
    
    /**
      * The max id used for rendering groups (not included)
      */
    @JSImport("babylonjs/Rendering/index", "RenderingManager.MAX_RENDERINGGROUPS")
    @js.native
    def MAX_RENDERINGGROUPS: Double = js.native
    @scala.inline
    def MAX_RENDERINGGROUPS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_RENDERINGGROUPS")(x.asInstanceOf[js.Any])
    
    /**
      * The min id used for rendering groups (included)
      */
    @JSImport("babylonjs/Rendering/index", "RenderingManager.MIN_RENDERINGGROUPS")
    @js.native
    def MIN_RENDERINGGROUPS: Double = js.native
    @scala.inline
    def MIN_RENDERINGGROUPS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_RENDERINGGROUPS")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Rendering/index", "SubSurfaceSceneComponent")
  @js.native
  class SubSurfaceSceneComponent protected ()
    extends typings.babylonjs.subSurfaceSceneComponentMod.SubSurfaceSceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Rendering/index", "UtilityLayerRenderer")
  @js.native
  class UtilityLayerRenderer protected ()
    extends typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer {
    /**
      * Instantiates a UtilityLayerRenderer
      * @param originalScene the original scene that will be rendered on top of
      * @param handleEvents boolean indicating if the utility layer should handle events
      */
    def this(/** the original scene that will be rendered on top of */
    originalScene: Scene) = this()
    def this(
      /** the original scene that will be rendered on top of */
    originalScene: Scene,
      handleEvents: Boolean
    ) = this()
  }
  /* static members */
  object UtilityLayerRenderer {
    
    @JSImport("babylonjs/Rendering/index", "UtilityLayerRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Rendering/index", "UtilityLayerRenderer._DefaultKeepDepthUtilityLayer")
    @js.native
    def _DefaultKeepDepthUtilityLayer: js.Any = js.native
    @scala.inline
    def _DefaultKeepDepthUtilityLayer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DefaultKeepDepthUtilityLayer")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Rendering/index", "UtilityLayerRenderer._DefaultUtilityLayer")
    @js.native
    def _DefaultUtilityLayer: js.Any = js.native
    @scala.inline
    def _DefaultUtilityLayer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DefaultUtilityLayer")(x.asInstanceOf[js.Any])
  }
  
  /* augmented module */
  object babylonjsAbstractSceneAugmentingMod {
    
    @js.native
    trait AbstractScene extends StObject {
      
      /** @hidden (Backing field) */
      var _prePassRenderer: Nullable[typings.babylonjs.prePassRendererMod.PrePassRenderer] = js.native
      
      /** @hidden (Backing field) */
      var _subSurfaceConfiguration: Nullable[SubSurfaceConfiguration] = js.native
      
      /**
        * Disables the prepass associated with the scene
        */
      def disablePrePassRenderer(): Unit = js.native
      
      /**
        * Disables the subsurface effect for prepass
        */
      def disableSubSurfaceForPrePass(): Unit = js.native
      
      /**
        * Enables the prepass and associates it with the scene
        * @returns the PrePassRenderer
        */
      def enablePrePassRenderer(): Nullable[typings.babylonjs.prePassRendererMod.PrePassRenderer] = js.native
      
      /**
        * Enables the subsurface effect for prepass
        * @returns the SubSurfaceConfiguration
        */
      def enableSubSurfaceForPrePass(): Nullable[SubSurfaceConfiguration] = js.native
      
      /**
        * Gets or Sets the current prepass renderer associated to the scene.
        */
      var prePassRenderer: Nullable[typings.babylonjs.prePassRendererMod.PrePassRenderer] = js.native
      
      /**
        * Gets or Sets the current prepass renderer associated to the scene.
        */
      var subSurfaceConfiguration: Nullable[SubSurfaceConfiguration] = js.native
    }
    object AbstractScene {
      
      @scala.inline
      def apply(
        disablePrePassRenderer: () => Unit,
        disableSubSurfaceForPrePass: () => Unit,
        enablePrePassRenderer: () => Nullable[typings.babylonjs.prePassRendererMod.PrePassRenderer],
        enableSubSurfaceForPrePass: () => Nullable[SubSurfaceConfiguration]
      ): AbstractScene = {
        val __obj = js.Dynamic.literal(disablePrePassRenderer = js.Any.fromFunction0(disablePrePassRenderer), disableSubSurfaceForPrePass = js.Any.fromFunction0(disableSubSurfaceForPrePass), enablePrePassRenderer = js.Any.fromFunction0(enablePrePassRenderer), enableSubSurfaceForPrePass = js.Any.fromFunction0(enableSubSurfaceForPrePass))
        __obj.asInstanceOf[AbstractScene]
      }
      
      @scala.inline
      implicit class AbstractSceneMutableBuilder[Self <: AbstractScene] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDisablePrePassRenderer(value: () => Unit): Self = StObject.set(x, "disablePrePassRenderer", js.Any.fromFunction0(value))
        
        @scala.inline
        def setDisableSubSurfaceForPrePass(value: () => Unit): Self = StObject.set(x, "disableSubSurfaceForPrePass", js.Any.fromFunction0(value))
        
        @scala.inline
        def setEnablePrePassRenderer(value: () => Nullable[typings.babylonjs.prePassRendererMod.PrePassRenderer]): Self = StObject.set(x, "enablePrePassRenderer", js.Any.fromFunction0(value))
        
        @scala.inline
        def setEnableSubSurfaceForPrePass(value: () => Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "enableSubSurfaceForPrePass", js.Any.fromFunction0(value))
        
        @scala.inline
        def setPrePassRenderer(value: Nullable[typings.babylonjs.prePassRendererMod.PrePassRenderer]): Self = StObject.set(x, "prePassRenderer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrePassRendererNull: Self = StObject.set(x, "prePassRenderer", null)
        
        @scala.inline
        def setSubSurfaceConfiguration(value: Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "subSurfaceConfiguration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubSurfaceConfigurationNull: Self = StObject.set(x, "subSurfaceConfiguration", null)
        
        @scala.inline
        def set_prePassRenderer(value: Nullable[typings.babylonjs.prePassRendererMod.PrePassRenderer]): Self = StObject.set(x, "_prePassRenderer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_prePassRendererNull: Self = StObject.set(x, "_prePassRenderer", null)
        
        @scala.inline
        def set_subSurfaceConfiguration(value: Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "_subSurfaceConfiguration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_subSurfaceConfigurationNull: Self = StObject.set(x, "_subSurfaceConfiguration", null)
      }
    }
  }
  
  /* augmented module */
  object babylonjsMeshesAbstractMeshAugmentingMod {
    
    @js.native
    trait AbstractMesh extends StObject {
      
      /** @hidden (Backing field) */
      var _renderOutline: Boolean = js.native
      
      /** @hidden (Backing field) */
      var _renderOverlay: Boolean = js.native
      
      /** @hidden (Backing field) */
      var _showBoundingBox: Boolean = js.native
      
      /**
        * Gets the edgesRenderer associated with the mesh
        */
      var edgesRenderer: Nullable[typings.babylonjs.edgesRendererMod.EdgesRenderer] = js.native
      
      /**
        * Gets or sets a boolean indicating if the outline must be rendered as well
        * @see https://www.babylonjs-playground.com/#10WJ5S#3
        */
      var renderOutline: Boolean = js.native
      
      /**
        * Gets or sets a boolean indicating if the overlay must be rendered as well
        * @see https://www.babylonjs-playground.com/#10WJ5S#2
        */
      var renderOverlay: Boolean = js.native
      
      /**
        * Gets or sets a boolean indicating if the bounding box must be rendered as well (false by default)
        */
      var showBoundingBox: Boolean = js.native
    }
    object AbstractMesh {
      
      @scala.inline
      def apply(
        _renderOutline: Boolean,
        _renderOverlay: Boolean,
        _showBoundingBox: Boolean,
        renderOutline: Boolean,
        renderOverlay: Boolean,
        showBoundingBox: Boolean
      ): typings.babylonjs.renderingIndexMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh = {
        val __obj = js.Dynamic.literal(_renderOutline = _renderOutline.asInstanceOf[js.Any], _renderOverlay = _renderOverlay.asInstanceOf[js.Any], _showBoundingBox = _showBoundingBox.asInstanceOf[js.Any], renderOutline = renderOutline.asInstanceOf[js.Any], renderOverlay = renderOverlay.asInstanceOf[js.Any], showBoundingBox = showBoundingBox.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.babylonjs.renderingIndexMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh]
      }
      
      @scala.inline
      implicit class AbstractMeshMutableBuilder[Self <: typings.babylonjs.renderingIndexMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEdgesRenderer(value: Nullable[typings.babylonjs.edgesRendererMod.EdgesRenderer]): Self = StObject.set(x, "edgesRenderer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEdgesRendererNull: Self = StObject.set(x, "edgesRenderer", null)
        
        @scala.inline
        def setRenderOutline(value: Boolean): Self = StObject.set(x, "renderOutline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenderOverlay(value: Boolean): Self = StObject.set(x, "renderOverlay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowBoundingBox(value: Boolean): Self = StObject.set(x, "showBoundingBox", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_renderOutline(value: Boolean): Self = StObject.set(x, "_renderOutline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_renderOverlay(value: Boolean): Self = StObject.set(x, "_renderOverlay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_showBoundingBox(value: Boolean): Self = StObject.set(x, "_showBoundingBox", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object babylonjsMeshesLinesMeshAugmentingMod {
    
    @js.native
    trait InstancedLinesMesh extends StObject {
      
      /**
        * Enables the edge rendering mode on the mesh.
        * This mode makes the mesh edges visible
        * @param epsilon defines the maximal distance between two angles to detect a face
        * @param checkVerticesInsteadOfIndices indicates that we should check vertex list directly instead of faces
        * @returns the current InstancedLinesMesh
        * @see https://www.babylonjs-playground.com/#19O9TU#0
        */
      def enableEdgesRendering(): typings.babylonjs.edgesRendererMod.babylonjsMeshesLinesMeshAugmentingMod.InstancedLinesMesh = js.native
      def enableEdgesRendering(epsilon: js.UndefOr[scala.Nothing], checkVerticesInsteadOfIndices: Boolean): typings.babylonjs.edgesRendererMod.babylonjsMeshesLinesMeshAugmentingMod.InstancedLinesMesh = js.native
      def enableEdgesRendering(epsilon: Double): typings.babylonjs.edgesRendererMod.babylonjsMeshesLinesMeshAugmentingMod.InstancedLinesMesh = js.native
      def enableEdgesRendering(epsilon: Double, checkVerticesInsteadOfIndices: Boolean): typings.babylonjs.edgesRendererMod.babylonjsMeshesLinesMeshAugmentingMod.InstancedLinesMesh = js.native
    }
    
    @js.native
    trait LinesMesh extends StObject {
      
      /**
        * Enables the edge rendering mode on the mesh.
        * This mode makes the mesh edges visible
        * @param epsilon defines the maximal distance between two angles to detect a face
        * @param checkVerticesInsteadOfIndices indicates that we should check vertex list directly instead of faces
        * @returns the currentAbstractMesh
        * @see https://www.babylonjs-playground.com/#19O9TU#0
        */
      def enableEdgesRendering(): AbstractMesh = js.native
      def enableEdgesRendering(epsilon: js.UndefOr[scala.Nothing], checkVerticesInsteadOfIndices: Boolean): AbstractMesh = js.native
      def enableEdgesRendering(epsilon: Double): AbstractMesh = js.native
      def enableEdgesRendering(epsilon: Double, checkVerticesInsteadOfIndices: Boolean): AbstractMesh = js.native
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /** @hidden (Backing field) */
      var _boundingBoxRenderer: typings.babylonjs.boundingBoxRendererMod.BoundingBoxRenderer = js.native
      
      /** @hidden (Backing field) */
      var _depthRenderer: StringDictionary[typings.babylonjs.depthRendererMod.DepthRenderer] = js.native
      
      /** @hidden */
      var _edgeRenderLineShader: Nullable[ShaderMaterial] = js.native
      
      /** @hidden (Backing field) */
      var _forceShowBoundingBoxes: Boolean = js.native
      
      /** @hidden (Backing field) */
      var _geometryBufferRenderer: Nullable[typings.babylonjs.geometryBufferRendererMod.GeometryBufferRenderer] = js.native
      
      /** @hidden */
      var _outlineRenderer: typings.babylonjs.outlineRendererMod.OutlineRenderer = js.native
      
      /**
        * Disables a depth renderer for a given camera
        * @param camera The camera to disable the depth renderer on (default: scene's active camera)
        */
      def disableDepthRenderer(): Unit = js.native
      def disableDepthRenderer(camera: Nullable[Camera]): Unit = js.native
      
      /**
        * Disables the GeometryBufferRender associated with the scene
        */
      def disableGeometryBufferRenderer(): Unit = js.native
      
      /**
        * Creates a depth renderer a given camera which contains a depth map which can be used for post processing.
        * @param camera The camera to create the depth renderer on (default: scene's active camera)
        * @param storeNonLinearDepth Defines whether the depth is stored linearly like in Babylon Shadows or directly like glFragCoord.z
        * @param force32bitsFloat Forces 32 bits float when supported (else 16 bits float is prioritized over 32 bits float if supported)
        * @returns the created depth renderer
        */
      def enableDepthRenderer(): typings.babylonjs.depthRendererMod.DepthRenderer = js.native
      def enableDepthRenderer(
        camera: js.UndefOr[Nullable[Camera]],
        storeNonLinearDepth: js.UndefOr[scala.Nothing],
        force32bitsFloat: Boolean
      ): typings.babylonjs.depthRendererMod.DepthRenderer = js.native
      def enableDepthRenderer(camera: js.UndefOr[Nullable[Camera]], storeNonLinearDepth: Boolean): typings.babylonjs.depthRendererMod.DepthRenderer = js.native
      def enableDepthRenderer(camera: js.UndefOr[Nullable[Camera]], storeNonLinearDepth: Boolean, force32bitsFloat: Boolean): typings.babylonjs.depthRendererMod.DepthRenderer = js.native
      def enableDepthRenderer(camera: Nullable[Camera]): typings.babylonjs.depthRendererMod.DepthRenderer = js.native
      
      /**
        * Enables a GeometryBufferRender and associates it with the scene
        * @param ratio defines the scaling ratio to apply to the renderer (1 by default which means same resolution)
        * @returns the GeometryBufferRenderer
        */
      def enableGeometryBufferRenderer(): Nullable[typings.babylonjs.geometryBufferRendererMod.GeometryBufferRenderer] = js.native
      def enableGeometryBufferRenderer(ratio: Double): Nullable[typings.babylonjs.geometryBufferRendererMod.GeometryBufferRenderer] = js.native
      
      /**
        * Gets or sets a boolean indicating if all bounding boxes must be rendered
        */
      var forceShowBoundingBoxes: Boolean = js.native
      
      /**
        * Gets or Sets the current geometry buffer associated to the scene.
        */
      var geometryBufferRenderer: Nullable[typings.babylonjs.geometryBufferRendererMod.GeometryBufferRenderer] = js.native
      
      /**
        * Gets the bounding box renderer associated with the scene
        * @returns a BoundingBoxRenderer
        */
      def getBoundingBoxRenderer(): typings.babylonjs.boundingBoxRendererMod.BoundingBoxRenderer = js.native
      
      /**
        * Gets the outline renderer associated with the scene
        * @returns a OutlineRenderer
        */
      def getOutlineRenderer(): typings.babylonjs.outlineRendererMod.OutlineRenderer = js.native
    }
  }
}
