package typings.babylonjs

import typings.babylonjs.anon.Color
import typings.babylonjs.anon.PartialIEffectLayerOption
import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.enginesEngineMod.Engine
import typings.babylonjs.materialsEffectMod.Effect
import typings.babylonjs.materialsMaterialMod.Material
import typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture
import typings.babylonjs.materialsTexturesRenderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.mathsMathDotcolorMod.Color4
import typings.babylonjs.mathsMathDotsizeMod.ISize
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.meshesSubMeshMod.SubMesh
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.postProcessesPostProcessMod.PostProcess
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layersEffectLayerMod {
  
  /* note: abstract class */ @JSImport("babylonjs/Layers/effectLayer", "EffectLayer")
  @js.native
  open class EffectLayer protected () extends StObject {
    /**
      * Instantiates a new effect Layer and references it in the scene.
      * @param name The name of the layer
      * @param scene The scene to use the layer in
      */
    def this(/** The Friendly of the effect in the scene */
    name: String) = this()
    def this(/** The Friendly of the effect in the scene */
    name: String, scene: Scene) = this()
    
    /**
      * Adds specific effects defines.
      * @param defines The defines to add specifics to.
      */
    /* protected */ def _addCustomEffectDefines(defines: js.Array[String]): Unit = js.native
    
    /**
      * Returns true if the mesh can be rendered, otherwise false.
      * @param mesh The mesh to render
      * @param material The material used on the mesh
      * @returns true if it can be rendered otherwise false
      */
    /* protected */ def _canRenderMesh(mesh: AbstractMesh, material: Material): Boolean = js.native
    
    /**
      * Creates the main texture for the effect layer.
      */
    /* protected */ def _createMainTexture(): Unit = js.native
    
    /**
      * Create the merge effect. This is the shader use to blit the information back
      * to the main canvas at the end of the scene rendering.
      * @returns The effect containing the shader used to merge the effect on the  main canvas
      */
    /* protected */ def _createMergeEffect(): Effect = js.native
    
    /**
      * Creates the render target textures and post processes used in the effect layer.
      */
    /* protected */ def _createTextureAndPostProcesses(): Unit = js.native
    
    /**
      * Free any resources and references associated to a mesh.
      * Internal use
      * @param mesh The mesh to free.
      */
    def _disposeMesh(mesh: Mesh): Unit = js.native
    
    /**
      * Dispose only the render target textures and post process.
      */
    /* private */ var _disposeTextureAndPostProcesses: Any = js.native
    
    /* private */ var _effectLayerOptions: Any = js.native
    
    /* protected */ var _emissiveTextureAndColor: Color = js.native
    
    /* protected */ var _engine: Engine = js.native
    
    /**
      * Generates the index buffer of the full screen quad blending to the main canvas.
      */
    /* private */ var _generateIndexBuffer: Any = js.native
    
    /**
      * Generates the vertex buffer of the full screen quad blending to the main canvas.
      */
    /* private */ var _generateVertexBuffer: Any = js.native
    
    /* private */ var _indexBuffer: Any = js.native
    
    /**
      * Initializes the effect layer with the required options.
      * @param options Sets of none mandatory options to use with the layer (see IEffectLayerOptions for more information)
      */
    /* protected */ def _init(options: PartialIEffectLayerOption): Unit = js.native
    
    /**
      * Implementation specific of rendering the generating effect on the main canvas.
      * @param effect The effect used to render through
      * @param renderNum Index of the _internalRender call (0 for the first time _internalRender is called, 1 for the second time, etc. _internalRender is called the number of times returned by _numInternalDraws())
      */
    /* protected */ def _internalRender(effect: Effect, renderIndex: Double): Unit = js.native
    
    /**
      * Checks for the readiness of the element composing the layer.
      * @param subMesh the mesh to check for
      * @param useInstances specify whether or not to use instances to render the mesh
      * @param emissiveTexture the associated emissive texture used to generate the glow
      * @returns true if ready otherwise, false
      */
    /* protected */ def _isReady(subMesh: SubMesh, useInstances: Boolean, emissiveTexture: Nullable[BaseTexture]): Boolean = js.native
    
    /* protected */ var _mainTexture: RenderTargetTexture = js.native
    
    /* protected */ var _mainTextureDesiredSize: ISize = js.native
    
    /* private */ var _materialForRendering: Any = js.native
    
    /* protected */ var _maxSize: Double = js.native
    
    /* private */ var _mergeDrawWrapper: Any = js.native
    
    /**
      * Number of times _internalRender will be called. Some effect layers need to render the mesh several times, so they should override this method with the number of times the mesh should be rendered
      * @returns Number of times a mesh must be rendered in the layer
      */
    /* protected */ def _numInternalDraws(): Double = js.native
    
    /* protected */ var _postProcesses: js.Array[PostProcess] = js.native
    
    /**
      * Rebuild the required buffers.
      * @internal Internal use only.
      */
    def _rebuild(): Unit = js.native
    
    /**
      * Renders the submesh passed in parameter to the generation map.
      * @param subMesh
      * @param enableAlphaMode
      */
    /* protected */ def _renderSubMesh(subMesh: SubMesh): Unit = js.native
    /* protected */ def _renderSubMesh(subMesh: SubMesh, enableAlphaMode: Boolean): Unit = js.native
    
    /* protected */ var _scene: Scene = js.native
    
    /**
      * Sets the required values for both the emissive texture and and the main color.
      */
    /* protected */ def _setEmissiveTextureAndColor(mesh: Mesh, subMesh: SubMesh, material: Material): Unit = js.native
    
    /**
      * Sets the main texture desired size which is the closest power of two
      * of the engine canvas size.
      */
    /* private */ var _setMainTextureSize: Any = js.native
    
    /* protected */ var _shouldRender: Boolean = js.native
    
    /**
      * Returns true if the mesh should render, otherwise false.
      * @returns true if it should render otherwise false
      */
    /* protected */ def _shouldRenderEmissiveTextureForMesh(): Boolean = js.native
    
    /**
      * Returns true if the mesh should render, otherwise false.
      * @param mesh The mesh to render
      * @returns true if it should render otherwise false
      */
    /* protected */ def _shouldRenderMesh(mesh: AbstractMesh): Boolean = js.native
    
    /* protected */ var _textures: js.Array[BaseTexture] = js.native
    
    /**
      * Defines whether the current material of the mesh should be use to render the effect.
      * @param mesh defines the current mesh to render
      */
    /* protected */ def _useMeshMaterial(mesh: AbstractMesh): Boolean = js.native
    
    /* private */ var _vertexBuffers: Any = js.native
    
    /**
      * Gets the camera attached to the layer.
      */
    def camera: Nullable[Camera] = js.native
    
    /**
      * Specifies if the bounding boxes should be rendered normally or if they should undergo the effect of the layer
      */
    var disableBoundingBoxesFromEffectLayer: Boolean = js.native
    
    /**
      * Dispose the highlight layer and free resources.
      */
    def dispose(): Unit = js.native
    
    /**
      * Gets the class name of the effect layer
      * @returns the string with the class name of the effect layer
      */
    def getClassName(): String = js.native
    
    /**
      * Get the effect name of the layer.
      * @returns The effect name
      */
    def getEffectName(): String = js.native
    
    /**
      * Determine if a given mesh will be used in the current effect.
      * @param mesh mesh to test
      * @returns true if the mesh will be used
      */
    def hasMesh(mesh: AbstractMesh): Boolean = js.native
    
    /**
      * Specifies whether the highlight layer is enabled or not.
      */
    var isEnabled: Boolean = js.native
    
    /**
      * Checks for the readiness of the element composing the layer.
      * @param subMesh the mesh to check for
      * @param useInstances specify whether or not to use instances to render the mesh
      * @returns true if ready otherwise, false
      */
    def isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = js.native
    
    /**
      * Gets the main texture where the effect is rendered
      */
    def mainTexture: RenderTargetTexture = js.native
    
    /**
      * The name of the layer
      */
    var name: String = js.native
    
    /**
      * Returns whether or not the layer needs stencil enabled during the mesh rendering.
      * @returns true if the effect requires stencil during the main canvas render pass.
      */
    def needStencil(): Boolean = js.native
    
    /**
      * The clear color of the texture used to generate the glow map.
      */
    var neutralColor: Color4 = js.native
    
    /**
      * An event triggered when the generated texture has been merged in the scene.
      */
    var onAfterComposeObservable: Observable[EffectLayer] = js.native
    
    /**
      * An event triggered after the mesh has been rendered into the effect render target.
      */
    var onAfterRenderMeshToEffect: Observable[AbstractMesh] = js.native
    
    /**
      * An event triggered when the generated texture is being merged in the scene.
      */
    var onBeforeComposeObservable: Observable[EffectLayer] = js.native
    
    /**
      * An event triggered when the effect layer is about rendering the main texture with the glowy parts.
      */
    var onBeforeRenderMainTextureObservable: Observable[EffectLayer] = js.native
    
    /**
      * An event triggered when the mesh is rendered into the effect render target.
      */
    var onBeforeRenderMeshToEffect: Observable[AbstractMesh] = js.native
    
    /**
      * An event triggered when the effect layer has been disposed.
      */
    var onDisposeObservable: Observable[EffectLayer] = js.native
    
    /**
      * An event triggered when the effect layer changes its size.
      */
    var onSizeChangedObservable: Observable[EffectLayer] = js.native
    
    /**
      * Renders the glowing part of the scene by blending the blurred glowing meshes on top of the rendered scene.
      */
    def render(): Unit = js.native
    
    /**
      * Gets the rendering group id the layer should render in.
      */
    def renderingGroupId: Double = js.native
    def renderingGroupId_=(renderingGroupId: Double): Unit = js.native
    
    /**
      * Serializes this layer (Glow or Highlight for example)
      * @returns a serialized layer object
      */
    var serialize: js.UndefOr[js.Function0[Any]] = js.native
    
    def setMaterialForRendering(mesh: js.Array[AbstractMesh]): Unit = js.native
    def setMaterialForRendering(mesh: js.Array[AbstractMesh], material: Material): Unit = js.native
    /**
      * Sets a specific material to be used to render a mesh/a list of meshes in the layer
      * @param mesh mesh or array of meshes
      * @param material material to use by the layer when rendering the mesh(es). If undefined is passed, the specific material created by the layer will be used.
      */
    def setMaterialForRendering(mesh: AbstractMesh): Unit = js.native
    def setMaterialForRendering(mesh: AbstractMesh, material: Material): Unit = js.native
    
    /**
      * Returns true if the layer contains information to display, otherwise false.
      * @returns true if the glow layer should be rendered
      */
    def shouldRender(): Boolean = js.native
  }
  /* static members */
  object EffectLayer {
    
    @JSImport("babylonjs/Layers/effectLayer", "EffectLayer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an effect layer from parsed effect layer data
      * @param parsedEffectLayer defines effect layer data
      * @param scene defines the current scene
      * @param rootUrl defines the root URL containing the effect layer information
      * @returns a parsed effect Layer
      */
    inline def Parse(parsedEffectLayer: Any, scene: Scene, rootUrl: String): EffectLayer = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedEffectLayer.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[EffectLayer]
    
    /**
      * @internal
      */
    inline def _SceneComponentInitialization(scene: Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  trait IEffectLayerOptions extends StObject {
    
    /**
      * Alpha blending mode used to apply the blur. Default depends of the implementation.
      */
    var alphaBlendingMode: Double
    
    /**
      * The camera attached to the layer.
      */
    var camera: Nullable[Camera]
    
    /**
      * Enforces a fixed size texture to ensure effect stability across devices.
      */
    var mainTextureFixedSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Multiplication factor apply to the canvas size to compute the render target size
      * used to generated the objects (the smaller the faster).
      */
    var mainTextureRatio: Double
    
    /**
      * The rendering group to draw the layer in.
      */
    var renderingGroupId: Double
  }
  object IEffectLayerOptions {
    
    inline def apply(alphaBlendingMode: Double, mainTextureRatio: Double, renderingGroupId: Double): IEffectLayerOptions = {
      val __obj = js.Dynamic.literal(alphaBlendingMode = alphaBlendingMode.asInstanceOf[js.Any], mainTextureRatio = mainTextureRatio.asInstanceOf[js.Any], renderingGroupId = renderingGroupId.asInstanceOf[js.Any], camera = null)
      __obj.asInstanceOf[IEffectLayerOptions]
    }
    
    extension [Self <: IEffectLayerOptions](x: Self) {
      
      inline def setAlphaBlendingMode(value: Double): Self = StObject.set(x, "alphaBlendingMode", value.asInstanceOf[js.Any])
      
      inline def setCamera(value: Nullable[Camera]): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      inline def setCameraNull: Self = StObject.set(x, "camera", null)
      
      inline def setMainTextureFixedSize(value: Double): Self = StObject.set(x, "mainTextureFixedSize", value.asInstanceOf[js.Any])
      
      inline def setMainTextureFixedSizeUndefined: Self = StObject.set(x, "mainTextureFixedSize", js.undefined)
      
      inline def setMainTextureRatio(value: Double): Self = StObject.set(x, "mainTextureRatio", value.asInstanceOf[js.Any])
      
      inline def setRenderingGroupId(value: Double): Self = StObject.set(x, "renderingGroupId", value.asInstanceOf[js.Any])
    }
  }
}
