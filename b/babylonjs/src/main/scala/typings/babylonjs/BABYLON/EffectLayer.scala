package typings.babylonjs.BABYLON

import typings.babylonjs.anon.PartialIEffectLayerOptionAlphaBlendingMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EffectLayer extends StObject {
  
  /**
    * Adds specific effects defines.
    * @param defines The defines to add specifics to.
    */
  /* protected */ def _addCustomEffectDefines(defines: js.Array[String]): Unit = js.native
  
  /* private */ var _cachedDefines: js.Any = js.native
  
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
  /* private */ var _disposeTextureAndPostProcesses: js.Any = js.native
  
  /* private */ var _effectLayerMapGenerationEffect: js.Any = js.native
  
  /* private */ var _effectLayerOptions: js.Any = js.native
  
  /* protected */ var _emissiveTextureAndColor: typings.babylonjs.anon.Texture = js.native
  
  /* protected */ var _engine: Engine = js.native
  
  /**
    * Generates the index buffer of the full screen quad blending to the main canvas.
    */
  /* private */ var _generateIndexBuffer: js.Any = js.native
  
  /**
    * Generates the vertex buffer of the full screen quad blending to the main canvas.
    */
  /* private */ var _generateVertexBuffer: js.Any = js.native
  
  /* private */ var _indexBuffer: js.Any = js.native
  
  /**
    * Initializes the effect layer with the required options.
    * @param options Sets of none mandatory options to use with the layer (see IEffectLayerOptions for more information)
    */
  /* protected */ def _init(options: PartialIEffectLayerOptionAlphaBlendingMode): Unit = js.native
  
  /**
    * Implementation specific of rendering the generating effect on the main canvas.
    * @param effect The effect used to render through
    */
  /* protected */ def _internalRender(effect: Effect): Unit = js.native
  
  /**
    * Checks for the readiness of the element composing the layer.
    * @param subMesh the mesh to check for
    * @param useInstances specify whether or not to use instances to render the mesh
    * @param emissiveTexture the associated emissive texture used to generate the glow
    * @return true if ready otherwise, false
    */
  /* protected */ def _isReady(subMesh: SubMesh, useInstances: Boolean, emissiveTexture: Nullable[BaseTexture]): Boolean = js.native
  
  /* protected */ var _mainTexture: RenderTargetTexture = js.native
  
  /* protected */ var _mainTextureDesiredSize: ISize = js.native
  
  /* protected */ var _maxSize: Double = js.native
  
  /* private */ var _mergeEffect: js.Any = js.native
  
  /* protected */ var _postProcesses: js.Array[PostProcess] = js.native
  
  /**
    * Rebuild the required buffers.
    * @hidden Internal use only.
    */
  def _rebuild(): Unit = js.native
  
  /**
    * Renders the submesh passed in parameter to the generation map.
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
  /* private */ var _setMainTextureSize: js.Any = js.native
  
  /* protected */ var _shouldRender: Boolean = js.native
  
  /**
    * Returns true if the mesh should render, otherwise false.
    * @param mesh The mesh to render
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
  
  /* private */ var _vertexBuffers: js.Any = js.native
  
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
    * @return The effect name
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
    * @return true if ready otherwise, false
    */
  def isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = js.native
  
  /**
    * The name of the layer
    */
  var name: String = js.native
  
  /**
    * Returns whether or nood the layer needs stencil enabled during the mesh rendering.
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
    * An event triggered when the efffect layer changes its size.
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
  var serialize: js.UndefOr[js.Function0[js.Any]] = js.native
  
  /**
    * Returns true if the layer contains information to display, otherwise false.
    * @returns true if the glow layer should be rendered
    */
  def shouldRender(): Boolean = js.native
}
