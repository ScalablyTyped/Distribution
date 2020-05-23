package typings.babylonjs.effectLayerMod

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.anon.Color
import typings.babylonjs.anon.PartialIEffectLayerOption
import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.effectMod.Effect
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.materialMod.Material
import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.mathSizeMod.ISize
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.postProcessMod.PostProcess
import typings.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.subMeshMod.SubMesh
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Layers/effectLayer", "EffectLayer")
@js.native
abstract class EffectLayer protected () extends js.Object {
  /**
    * Instantiates a new effect Layer and references it in the scene.
    * @param name The name of the layer
    * @param scene The scene to use the layer in
    */
  def this(/** The Friendly of the effect in the scene */
  name: String, scene: Scene) = this()
  var _cachedDefines: js.Any = js.native
  /**
    * Dispose only the render target textures and post process.
    */
  var _disposeTextureAndPostProcesses: js.Any = js.native
  var _effectLayerMapGenerationEffect: js.Any = js.native
  var _effectLayerOptions: js.Any = js.native
  var _emissiveTextureAndColor: Color = js.native
  var _engine: Engine = js.native
  /**
    * Generates the index buffer of the full screen quad blending to the main canvas.
    */
  var _generateIndexBuffer: js.Any = js.native
  /**
    * Generates the vertex buffer of the full screen quad blending to the main canvas.
    */
  var _generateVertexBuffer: js.Any = js.native
  var _indexBuffer: js.Any = js.native
  var _mainTexture: RenderTargetTexture = js.native
  var _mainTextureDesiredSize: ISize = js.native
  var _maxSize: Double = js.native
  var _mergeEffect: js.Any = js.native
  var _postProcesses: js.Array[PostProcess] = js.native
  var _scene: Scene = js.native
  /**
    * Sets the main texture desired size which is the closest power of two
    * of the engine canvas size.
    */
  var _setMainTextureSize: js.Any = js.native
  var _shouldRender: Boolean = js.native
  var _textures: js.Array[BaseTexture] = js.native
  var _vertexBuffers: js.Any = js.native
  /**
    * Specifies whether the highlight layer is enabled or not.
    */
  var isEnabled: Boolean = js.native
  /**
    * The name of the layer
    */
  var name: String = js.native
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
    * Serializes this layer (Glow or Highlight for example)
    * @returns a serialized layer object
    */
  var serialize: js.UndefOr[js.Function0[_]] = js.native
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
    * Initializes the effect layer with the required options.
    * @param options Sets of none mandatory options to use with the layer (see IEffectLayerOptions for more information)
    */
  /* protected */ def _init(options: PartialIEffectLayerOption): Unit = js.native
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
  /**
    * Sets the required values for both the emissive texture and and the main color.
    */
  /* protected */ def _setEmissiveTextureAndColor(mesh: Mesh, subMesh: SubMesh, material: Material): Unit = js.native
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
  /**
    * Defines whether the current material of the mesh should be use to render the effect.
    * @param mesh defines the current mesh to render
    */
  /* protected */ def _useMeshMaterial(mesh: AbstractMesh): Boolean = js.native
  /**
    * Gets the camera attached to the layer.
    */
  def camera: Nullable[Camera] = js.native
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
    * Checks for the readiness of the element composing the layer.
    * @param subMesh the mesh to check for
    * @param useInstances specify whether or not to use instances to render the mesh
    * @return true if ready otherwise, false
    */
  def isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = js.native
  /**
    * Returns whether or nood the layer needs stencil enabled during the mesh rendering.
    * @returns true if the effect requires stencil during the main canvas render pass.
    */
  def needStencil(): Boolean = js.native
  /**
    * Renders the glowing part of the scene by blending the blurred glowing meshes on top of the rendered scene.
    */
  def render(): Unit = js.native
  /**
    * Gets the rendering group id the layer should render in.
    */
  def renderingGroupId: Double = js.native
  def renderingGroupId(renderingGroupId: Double): js.Any = js.native
  /**
    * Returns true if the layer contains information to display, otherwise false.
    * @returns true if the glow layer should be rendered
    */
  def shouldRender(): Boolean = js.native
}

/* static members */
@JSImport("babylonjs/Layers/effectLayer", "EffectLayer")
@js.native
object EffectLayer extends js.Object {
  /**
    * Creates an effect layer from parsed effect layer data
    * @param parsedEffectLayer defines effect layer data
    * @param scene defines the current scene
    * @param rootUrl defines the root URL containing the effect layer information
    * @returns a parsed effect Layer
    */
  def Parse(parsedEffectLayer: js.Any, scene: Scene, rootUrl: String): EffectLayer = js.native
  /** @hidden */
  def _SceneComponentInitialization(scene: Scene): Unit = js.native
}

