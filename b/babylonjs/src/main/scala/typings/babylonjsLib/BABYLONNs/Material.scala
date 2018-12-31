package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base class for the main features of a material in Babylon.js
  */
@JSGlobal("BABYLON.Material")
@js.native
class Material protected () extends IAnimatable {
  /**
    * Creates a material instance
    * @param name defines the name of the material
    * @param scene defines the scene to reference
    * @param doNotAdd specifies if the material should be added to the scene
    */
  def this(name: java.lang.String, scene: Scene) = this()
  def this(name: java.lang.String, scene: Scene, doNotAdd: scala.Boolean) = this()
  /**
    * The alpha value of the material
    */
  var _alpha: scala.Double = js.native
  /**
    * Stores the value of the alpha mode
    */
  var _alphaMode: js.Any = js.native
  /**
    * Specifies if back face culling is enabled
    */
  var _backFaceCulling: scala.Boolean = js.native
  /**
    * Specifies if the depth write state should be cached
    */
  var _cachedDepthWriteState: js.Any = js.native
  /**
    * @hidden
    * Stores the effects for the material
    */
  var _effect: Nullable[Effect] = js.native
  /**
    * Stores the fill mode state
    */
  var _fillMode: js.Any = js.native
  /**
    * Stores the state specifing if fog should be enabled
    */
  var _fogEnabled: js.Any = js.native
  /**
    * Stores the state of the need depth pre-pass value
    */
  var _needDepthPrePass: js.Any = js.native
  var _onBindObservable: js.Any = js.native
  /**
    * An observer which watches for bind events
    */
  var _onBindObserver: js.Any = js.native
  /**
    * An observer which watches for dispose events
    */
  var _onDisposeObserver: js.Any = js.native
  var _onUnBindObservable: js.Any = js.native
  /**
    * Stores a reference to the scene
    */
  var _scene: js.Any = js.native
  /**
    * Stores the uniform buffer
    */
  var _uniformBuffer: UniformBuffer = js.native
  /**
    * Specifies if uniform buffers should be used
    */
  var _useUBO: js.Any = js.native
  /**
    * @hidden
    * Specifies if the material was previously ready
    */
  var _wasPreviouslyReady: scala.Boolean = js.native
  /**
    * Sets the alpha value of the material
    */
  /**
    * Gets the alpha value of the material
    */
  var alpha: scala.Double = js.native
  /**
    * Sets the value of the alpha mode.
    *
    * | Value | Type | Description |
    * | --- | --- | --- |
    * | 0 | ALPHA_DISABLE |   |
    * | 1 | ALPHA_ADD |   |
    * | 2 | ALPHA_COMBINE |   |
    * | 3 | ALPHA_SUBTRACT |   |
    * | 4 | ALPHA_MULTIPLY |   |
    * | 5 | ALPHA_MAXIMIZED |   |
    * | 6 | ALPHA_ONEONE |   |
    * | 7 | ALPHA_PREMULTIPLIED |   |
    * | 8 | ALPHA_PREMULTIPLIED_PORTERDUFF |   |
    * | 9 | ALPHA_INTERPOLATE |   |
    * | 10 | ALPHA_SCREENMODE |   |
    *
    */
  /**
    * Gets the value of the alpha mode
    */
  var alphaMode: scala.Double = js.native
  /**
    * Array of animations
    */
  /* CompleteClass */
  override var animations: js.Array[Animation] = js.native
  /**
    * Sets the back-face culling state
    */
  /**
    * Gets the back-face culling state
    */
  var backFaceCulling: scala.Boolean = js.native
  /**
    * Specifies if the ready state should be checked on each call
    */
  var checkReadyOnEveryCall: scala.Boolean = js.native
  /**
    * Specifies if the ready state should be checked once
    */
  var checkReadyOnlyOnce: scala.Boolean = js.native
  /**
    * Specifies if depth writing should be disabled
    */
  var disableDepthWrite: scala.Boolean = js.native
  /**
    * Specifies if the material should be serialized
    */
  var doNotSerialize: scala.Boolean = js.native
  /**
    * Gets the material fill mode
    */
  /**
    * Sets the material fill mode
    */
  var fillMode: scala.Double = js.native
  /**
    * Sets the state for enabling fog
    */
  /**
    * Gets the value of the fog enabled state
    */
  var fogEnabled: scala.Boolean = js.native
  /**
    * Specifies if depth writing should be forced
    */
  var forceDepthWrite: scala.Boolean = js.native
  /**
    * Gets a boolean indicating that current material needs to register RTT
    */
  val hasRenderTargetTextures: scala.Boolean = js.native
  /**
    * The ID of the material
    */
  var id: java.lang.String = js.native
  /**
    * Specifies if updates for the material been locked
    */
  val isFrozen: scala.Boolean = js.native
  /**
    * The name of the material
    */
  var name: java.lang.String = js.native
  /**
    * Sets the need depth pre-pass value
    */
  /**
    * Gets the depth pre-pass value
    */
  var needDepthPrePass: scala.Boolean = js.native
  /**
    * An event triggered when the material is bound
    */
  val onBindObservable: Observable[AbstractMesh] = js.native
  /**
    * An event triggered when the material is disposed
    */
  var onDisposeObservable: Observable[Material] = js.native
  /**
    * An event triggered when the material is unbound
    */
  val onUnBindObservable: Observable[Material] = js.native
  /**
    * Stores the size of points
    */
  var pointSize: scala.Double = js.native
  /**
    * Gets the value specifying if point clouds are enabled
    */
  /**
    * Sets the state of point cloud mode
    */
  var pointsCloud: scala.Boolean = js.native
  /**
    * Specifies if there should be a separate pass for culling
    */
  var separateCullingPass: scala.Boolean = js.native
  /**
    * Stores the value for side orientation
    */
  var sideOrientation: scala.Double = js.native
  /**
    * The state of the material
    */
  var state: java.lang.String = js.native
  /**
    * Specifies if the effect should be stored on sub meshes
    */
  var storeEffectOnSubMeshes: scala.Boolean = js.native
  /**
    * Gets or sets the unique id of the material
    */
  var uniqueId: scala.Double = js.native
  /**
    * Gets a value specifying if wireframe mode is enabled
    */
  /**
    * Sets the state of wireframe mode
    */
  var wireframe: scala.Boolean = js.native
  /**
    * Stores the z offset value
    */
  var zOffset: scala.Double = js.native
  /**
    * Processes to execute after binding the material to a mesh
    * @param mesh defines the rendered mesh
    */
  /* protected */ def _afterBind(): scala.Unit = js.native
  /* protected */ def _afterBind(mesh: Mesh): scala.Unit = js.native
  /**
    * Indicates that attributes need to be re-calculated for all submeshes
    */
  /* protected */ def _markAllSubMeshesAsAttributesDirty(): scala.Unit = js.native
  /**
    * Marks all submeshes of a material to indicate that their material defines need to be re-calculated
    * @param func defines a function which checks material defines against the submeshes
    */
  /* protected */ def _markAllSubMeshesAsDirty(func: js.Function1[/* defines */ MaterialDefines, scala.Unit]): scala.Unit = js.native
  /**
    * Indicates that fresnel and misc need to be re-calculated for all submeshes
    */
  /* protected */ def _markAllSubMeshesAsFresnelAndMiscDirty(): scala.Unit = js.native
  /**
    * Indicates that fresnel needs to be re-calculated for all submeshes
    */
  /* protected */ def _markAllSubMeshesAsFresnelDirty(): scala.Unit = js.native
  /**
    * Indicates that image processing needs to be re-calculated for all submeshes
    */
  /* protected */ def _markAllSubMeshesAsImageProcessingDirty(): scala.Unit = js.native
  /**
    * Indicates that lights need to be re-calculated for all submeshes
    */
  /* protected */ def _markAllSubMeshesAsLightsDirty(): scala.Unit = js.native
  /**
    * Indicates that misc needs to be re-calculated for all submeshes
    */
  /* protected */ def _markAllSubMeshesAsMiscDirty(): scala.Unit = js.native
  /**
    * Indicates that textures and misc need to be re-calculated for all submeshes
    */
  /* protected */ def _markAllSubMeshesAsTexturesAndMiscDirty(): scala.Unit = js.native
  /**
    * Indicates that textures need to be re-calculated for all submeshes
    */
  /* protected */ def _markAllSubMeshesAsTexturesDirty(): scala.Unit = js.native
  /** @hidden */
  def _preBind(): scala.Boolean = js.native
  def _preBind(effect: Effect): scala.Boolean = js.native
  def _preBind(effect: Effect, overrideOrientation: Nullable[scala.Double]): scala.Boolean = js.native
  /**
    * Specifies if material alpha testing should be turned on for the mesh
    * @param mesh defines the mesh to check
    */
  /* protected */ def _shouldTurnAlphaTestOn(mesh: AbstractMesh): scala.Boolean = js.native
  /**
    * Binds the material to the mesh
    * @param world defines the world transformation matrix
    * @param mesh defines the mesh to bind the material to
    */
  def bind(world: Matrix): scala.Unit = js.native
  def bind(world: Matrix, mesh: Mesh): scala.Unit = js.native
  /**
    * Binds the submesh to the material
    * @param world defines the world transformation matrix
    * @param mesh defines the mesh containing the submesh
    * @param subMesh defines the submesh to bind the material to
    */
  def bindForSubMesh(world: Matrix, mesh: Mesh, subMesh: SubMesh): scala.Unit = js.native
  /**
    * Binds the world matrix to the material
    * @param world defines the world transformation matrix
    */
  def bindOnlyWorldMatrix(world: Matrix): scala.Unit = js.native
  /**
    * Binds the scene's uniform buffer to the effect.
    * @param effect defines the effect to bind to the scene uniform buffer
    * @param sceneUbo defines the uniform buffer storing scene data
    */
  def bindSceneUniformBuffer(effect: Effect, sceneUbo: UniformBuffer): scala.Unit = js.native
  /**
    * Binds the view matrix to the effect
    * @param effect defines the effect to bind the view matrix to
    */
  def bindView(effect: Effect): scala.Unit = js.native
  /**
    * Binds the view projection matrix to the effect
    * @param effect defines the effect to bind the view projection matrix to
    */
  def bindViewProjection(effect: Effect): scala.Unit = js.native
  /**
    * Makes a duplicate of the material, and gives it a new name
    * @param name defines the new name for the duplicated material
    * @returns the cloned material
    */
  def clone(name: java.lang.String): Nullable[Material] = js.native
  /**
    * Disposes the material
    * @param forceDisposeEffect specifies if effects should be forcefully disposed
    * @param forceDisposeTextures specifies if textures should be forcefully disposed
    */
  def dispose(): scala.Unit = js.native
  def dispose(forceDisposeEffect: scala.Boolean): scala.Unit = js.native
  def dispose(forceDisposeEffect: scala.Boolean, forceDisposeTextures: scala.Boolean): scala.Unit = js.native
  /**
    * Force shader compilation
    * @param mesh defines the mesh associated with this material
    * @param onCompiled defines a function to execute once the material is compiled
    * @param options defines the options to configure the compilation
    */
  def forceCompilation(mesh: AbstractMesh): scala.Unit = js.native
  def forceCompilation(mesh: AbstractMesh, onCompiled: js.Function1[/* material */ this.type, scala.Unit]): scala.Unit = js.native
  def forceCompilation(
    mesh: AbstractMesh,
    onCompiled: js.Function1[/* material */ this.type, scala.Unit],
    options: stdLib.Partial[babylonjsLib.Anon_ClipPlane]
  ): scala.Unit = js.native
  /**
    * Force shader compilation
    * @param mesh defines the mesh that will use this material
    * @param options defines additional options for compiling the shaders
    * @returns a promise that resolves when the compilation completes
    */
  def forceCompilationAsync(mesh: AbstractMesh): js.Promise[scala.Unit] = js.native
  def forceCompilationAsync(mesh: AbstractMesh, options: stdLib.Partial[babylonjsLib.Anon_ClipPlane]): js.Promise[scala.Unit] = js.native
  /**
    * Locks updates for the material
    */
  def freeze(): scala.Unit = js.native
  /**
    * Gets the active textures from the material
    * @returns an array of textures
    */
  def getActiveTextures(): js.Array[BaseTexture] = js.native
  /**
    * Gets the texture used for the alpha test
    * @returns the texture to use for alpha testing
    */
  def getAlphaTestTexture(): Nullable[BaseTexture] = js.native
  /**
    * Gets the meshes bound to the material
    * @returns an array of meshes bound to the material
    */
  def getBindedMeshes(): js.Array[AbstractMesh] = js.native
  /**
    * Gets the class name of the material
    * @returns a string with the class name of the material
    */
  def getClassName(): java.lang.String = js.native
  /**
    * Returns the material effect
    * @returns the effect associated with the material
    */
  def getEffect(): Nullable[Effect] = js.native
  /**
    * Callback triggered to get the render target textures
    */
  def getRenderTargetTextures(): SmartArray[RenderTargetTexture] = js.native
  /**
    * Returns the current scene
    * @returns a Scene
    */
  def getScene(): Scene = js.native
  /**
    * Specifies if the material uses a texture
    * @param texture defines the texture to check against the material
    * @returns a boolean specifying if the material uses the texture
    */
  def hasTexture(texture: BaseTexture): scala.Boolean = js.native
  /**
    * Specifies if the material is ready to be used
    * @param mesh defines the mesh to check
    * @param useInstances specifies if instances should be used
    * @returns a boolean indicating if the material is ready to be used
    */
  def isReady(): scala.Boolean = js.native
  def isReady(mesh: AbstractMesh): scala.Boolean = js.native
  def isReady(mesh: AbstractMesh, useInstances: scala.Boolean): scala.Boolean = js.native
  /**
    * Specifies that the submesh is ready to be used
    * @param mesh defines the mesh to check
    * @param subMesh defines which submesh to check
    * @param useInstances specifies that instances should be used
    * @returns a boolean indicating that the submesh is ready or not
    */
  def isReadyForSubMesh(mesh: AbstractMesh, subMesh: BaseSubMesh): scala.Boolean = js.native
  def isReadyForSubMesh(mesh: AbstractMesh, subMesh: BaseSubMesh, useInstances: scala.Boolean): scala.Boolean = js.native
  /**
    * Marks a define in the material to indicate that it needs to be re-computed
    * @param flag defines a flag used to determine which parts of the material have to be marked as dirty
    */
  def markAsDirty(flag: scala.Double): scala.Unit = js.native
  /**
    * Marks the material to indicate that it needs to be re-calculated
    */
  def markDirty(): scala.Unit = js.native
  /**
    * Specifies if the material will require alpha blending
    * @returns a boolean specifying if alpha blending is needed
    */
  def needAlphaBlending(): scala.Boolean = js.native
  /**
    * Specifies if the mesh will require alpha blending
    * @param mesh defines the mesh to check
    * @returns a boolean specifying if alpha blending is needed for the mesh
    */
  def needAlphaBlendingForMesh(mesh: AbstractMesh): scala.Boolean = js.native
  /**
    * Specifies if this material should be rendered in alpha test mode
    * @returns a boolean specifying if an alpha test is needed.
    */
  def needAlphaTesting(): scala.Boolean = js.native
  /**
    * Called during a bind event
    */
  def onBind(Mesh: AbstractMesh): scala.Unit = js.native
  /**
    * Callback triggered when the material is compiled
    */
  def onCompiled(effect: Effect): scala.Unit = js.native
  /**
    * Called during a dispose event
    */
  def onDispose(): scala.Unit = js.native
  /**
    * Callback triggered when an error occurs
    */
  def onError(effect: Effect, errors: java.lang.String): scala.Unit = js.native
  /**
    * Serializes this material
    * @returns the serialized material object
    */
  def serialize(): js.Any = js.native
  def toString(fullDetails: scala.Boolean): java.lang.String = js.native
  /**
    * Unbinds the material from the mesh
    */
  def unbind(): scala.Unit = js.native
  /**
    * Unlocks updates for the material
    */
  def unfreeze(): scala.Unit = js.native
}

/**
  * Base class for the main features of a material in Babylon.js
  */
@JSGlobal("BABYLON.Material")
@js.native
object Material extends js.Object {
  /**
    * The all dirty flag value
    */
  val AllDirtyFlag: scala.Double = js.native
  /**
    * The dirty attribute flag value
    */
  val AttributesDirtyFlag: scala.Double = js.native
  /**
    * Returns the clock-wise side orientation
    */
  val ClockWiseSideOrientation: scala.Double = js.native
  /**
    * Returns the counter clock-wise side orientation
    */
  val CounterClockWiseSideOrientation: scala.Double = js.native
  /**
    * The dirty fresnel flag value
    */
  val FresnelDirtyFlag: scala.Double = js.native
  /**
    * The dirty light flag value
    */
  val LightDirtyFlag: scala.Double = js.native
  /**
    * Returns the line list draw mode
    */
  val LineListDrawMode: scala.Double = js.native
  /**
    * Returns the line loop draw mode
    */
  val LineLoopDrawMode: scala.Double = js.native
  /**
    * Returns the line strip draw mode
    */
  val LineStripDrawMode: scala.Double = js.native
  /**
    * The dirty misc flag value
    */
  val MiscDirtyFlag: scala.Double = js.native
  /**
    * Returns the point fill mode
    */
  val PointFillMode: scala.Double = js.native
  /**
    * Returns the point list draw mode
    */
  val PointListDrawMode: scala.Double = js.native
  /**
    * The dirty texture flag value
    */
  val TextureDirtyFlag: scala.Double = js.native
  /**
    * Returns the triangle fan draw mode
    */
  val TriangleFanDrawMode: scala.Double = js.native
  /**
    * Returns the triangle fill mode
    */
  val TriangleFillMode: scala.Double = js.native
  /**
    * Returns the triangle strip draw mode
    */
  val TriangleStripDrawMode: scala.Double = js.native
  /**
    * Returns the wireframe mode
    */
  val WireFrameFillMode: scala.Double = js.native
  /**
    * Stores the clock-wise side orientation
    */
  var _ClockWiseSideOrientation: js.Any = js.native
  /**
    * Stores the counter clock-wise side orientation
    */
  var _CounterClockWiseSideOrientation: js.Any = js.native
  var _LineListDrawMode: js.Any = js.native
  var _LineLoopDrawMode: js.Any = js.native
  var _LineStripDrawMode: js.Any = js.native
  var _PointFillMode: js.Any = js.native
  var _PointListDrawMode: js.Any = js.native
  var _TriangleFanDrawMode: js.Any = js.native
  var _TriangleFillMode: js.Any = js.native
  var _TriangleStripDrawMode: js.Any = js.native
  var _WireFrameFillMode: js.Any = js.native
  /**
    * Creates a material from parsed material data
    * @param parsedMaterial defines parsed material data
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures
    * @returns a new material
    */
  def Parse(parsedMaterial: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): js.Any = js.native
  /**
    * Creates a MultiMaterial from parsed MultiMaterial data.
    * @param parsedMultiMaterial defines parsed MultiMaterial data.
    * @param scene defines the hosting scene
    * @returns a new MultiMaterial
    */
  def ParseMultiMaterial(parsedMultiMaterial: js.Any, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.MultiMaterial = js.native
}

