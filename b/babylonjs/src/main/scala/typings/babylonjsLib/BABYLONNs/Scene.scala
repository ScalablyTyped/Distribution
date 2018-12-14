package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents a scene to be rendered by the engine.
     * @see http://doc.babylonjs.com/features/scene
     */
/* RemoveMultipleInheritance: Dropped parents List(babylonjsLib.BABYLONNs.IAnimatable because Would inherit conflicting mutable fields List(animations))*/
@JSGlobal("BABYLON.Scene")
@js.native
class Scene protected () extends AbstractScene {
  /**
           * Creates a new Scene
           * @param engine defines the engine to use to render this scene
           */
  def this(engine: Engine) = this()
  /** @hidden */
  var _activeAnimatables: js.Array[Animatable] = js.native
  /** @hidden */
  var _activeBones: PerfCounter = js.native
  /** @hidden */
  var _activeIndices: PerfCounter = js.native
  var _activeMesh: js.Any = js.native
  /**
           * @hidden
           * Defines the actions happening during the active mesh stage.
           */
  var _activeMeshStage: Stage[ActiveMeshStageAction] = js.native
  var _activeMeshes: js.Any = js.native
  var _activeMeshesFrozen: js.Any = js.native
  /** @hidden */
  var _activeParticleSystems: SmartArray[IParticleSystem] = js.native
  /** @hidden */
  var _activeParticles: PerfCounter = js.native
  var _activeRequests: js.Any = js.native
  var _activeSkeletons: js.Any = js.native
  /**
           * @hidden
           * Defines the actions happening just after the active camera has been drawn.
           */
  var _afterCameraDrawStage: Stage[CameraStageAction] = js.native
  /**
           * @hidden
           * Defines the actions happening just after rendering all cameras and computing intersections.
           */
  var _afterRenderStage: Stage[SimpleStageAction] = js.native
  /**
           * @hidden
           * Defines the actions happening just after a rendering group has been drawn.
           */
  var _afterRenderingGroupDrawStage: Stage[RenderingGroupStageAction] = js.native
  /**
           * @hidden
           * Defines the actions happening just after a mesh has been drawn.
           */
  var _afterRenderingMeshStage: Stage[RenderingMeshStageAction] = js.native
  /** @hidden */
  var _allowPostProcessClearColor: scala.Boolean = js.native
  var _alternateProjectionMatrix: js.Any = js.native
  var _alternateProjectionUpdateFlag: js.Any = js.native
  var _alternateRendering: js.Any = js.native
  var _alternateSceneUbo: js.Any = js.native
  var _alternateTransformMatrix: js.Any = js.native
  var _alternateViewMatrix: js.Any = js.native
  var _alternateViewUpdateFlag: js.Any = js.native
  var _animate: js.Any = js.native
  var _animationPropertiesOverride: js.Any = js.native
  var _animationRatio: js.Any = js.native
  var _animationTime: js.Any = js.native
  var _animationTimeLast: js.Any = js.native
  /**
           * @hidden
           * Defines the actions happening just before the active camera is drawing.
           */
  var _beforeCameraDrawStage: Stage[CameraStageAction] = js.native
  /**
           * @hidden
           * Defines the actions happening before camera updates.
           */
  var _beforeCameraUpdateStage: Stage[SimpleStageAction] = js.native
  /**
           * @hidden
           * Defines the actions happening before clear the canvas.
           */
  var _beforeClearStage: Stage[SimpleStageAction] = js.native
  /**
           * @hidden
           * Defines the actions happening before evaluate active mesh checks.
           */
  var _beforeEvaluateActiveMeshStage: Stage[SimpleStageAction] = js.native
  /**
           * @hidden
           * Defines the actions happening just before a rendering group is drawing.
           */
  var _beforeRenderingGroupDrawStage: Stage[RenderingGroupStageAction] = js.native
  /**
           * @hidden
           * Defines the actions happening just before a mesh is drawing.
           */
  var _beforeRenderingMeshStage: Stage[RenderingMeshStageAction] = js.native
  var _blockMaterialDirtyMechanism: js.Any = js.native
  /** @hidden (Backing field) */
  var _boundingBoxRenderer: BoundingBoxRenderer = js.native
  /** @hidden */
  var _cachedEffect: Nullable[Effect] = js.native
  /** @hidden */
  var _cachedMaterial: Nullable[Material] = js.native
  var _cachedRayForTransform: js.Any = js.native
  /** @hidden */
  var _cachedVisibility: Nullable[scala.Double] = js.native
  /**
           * @hidden
           * Defines the actions happening during the per camera render target step.
           */
  var _cameraDrawRenderTargetStage: Stage[CameraStageAction] = js.native
  var _checkIntersections: js.Any = js.native
  var _checkPrePointerObservable: js.Any = js.native
  /**
           * @hidden
           * Backing store of defined scene components.
           */
  var _components: js.Array[ISceneComponent] = js.native
  var _createAlternateUbo: js.Any = js.native
  var _createUbo: js.Any = js.native
  var _currentInternalStep: js.Any = js.native
  var _currentPickResult: js.Any = js.native
  var _currentStepId: js.Any = js.native
  /**
           * @hidden
           * Backing field
           */
  var _debugLayer: DebugLayer = js.native
  var _defaultMaterial: js.Any = js.native
  var _defaultMeshCandidates: js.Any = js.native
  var _defaultSubMeshCandidates: js.Any = js.native
  var _delayedSimpleClick: js.Any = js.native
  var _delayedSimpleClickTimeout: js.Any = js.native
  /** @hidden (Backing field) */
  var _depthRenderer: org.scalablytyped.runtime.StringDictionary[DepthRenderer] = js.native
  var _doubleClickOccured: js.Any = js.native
  var _engine: js.Any = js.native
  /** @hidden */
  var _environmentBRDFTexture: BaseTexture = js.native
  /** @hidden */
  var _environmentTexture: BaseTexture = js.native
  var _evaluateActiveMeshes: js.Any = js.native
  var _evaluateSubMesh: js.Any = js.native
  /**
           * @hidden
           * Defines the actions happening during the evaluate sub mesh checks.
           */
  var _evaluateSubMeshStage: Stage[EvaluateSubMeshStageAction] = js.native
  var _executeOnceBeforeRender: js.Any = js.native
  var _executeWhenReadyTimeoutId: js.Any = js.native
  var _externalData: js.Any = js.native
  var _fogEnabled: js.Any = js.native
  var _fogMode: js.Any = js.native
  var _forcePointsCloud: js.Any = js.native
  /** @hidden (Backing field) */
  var _forceShowBoundingBoxes: scala.Boolean = js.native
  var _forceWireframe: js.Any = js.native
  /** @hidden */
  var _forcedViewPosition: Nullable[Vector3] = js.native
  var _frameId: js.Any = js.native
  var _frustumPlanes: js.Any = js.native
  /** @hidden */
  var _gamepadManager: Nullable[GamepadManager] = js.native
  /**
           * @hidden
           * Defines the actions happening for one camera in the frame.
           */
  var _gatherActiveCameraRenderTargetsStage: Stage[RenderTargetsStageAction] = js.native
  /**
           * @hidden
           * Defines the actions when collecting render targets for the frame.
           */
  var _gatherRenderTargetsStage: Stage[RenderTargetsStageAction] = js.native
  /** @hidden (Backing field) */
  var _geometryBufferRenderer: Nullable[GeometryBufferRenderer] = js.native
  var _getByTags: js.Any = js.native
  /** @hidden */
  var _imageProcessingConfiguration: ImageProcessingConfiguration = js.native
  var _initActionManager: js.Any = js.native
  var _initClickEvent: js.Any = js.native
  var _intermediateRendering: js.Any = js.native
  var _internalMultiPick: js.Any = js.native
  var _internalPick: js.Any = js.native
  /** @hidden */
  val _isAlternateRenderingEnabled: scala.Boolean = js.native
  var _isDisposed: js.Any = js.native
  /**
           * @hidden
           * Defines the actions happening during the per mesh ready checks.
           */
  var _isReadyForMeshStage: Stage[MeshStageAction] = js.native
  var _lightsEnabled: js.Any = js.native
  /**
           * @hidden
           * Backing field
           */
  var _mainSoundTrack: SoundTrack = js.native
  var _meshPickProceed: js.Any = js.native
  var _meshesForIntersections: js.Any = js.native
  /** @hidden */
  var _mirroredCameraPosition: Nullable[Vector3] = js.native
  var _onAfterCameraRenderObserver: js.Any = js.native
  var _onAfterRenderObserver: js.Any = js.native
  var _onBeforeCameraRenderObserver: js.Any = js.native
  var _onBeforeRenderObserver: js.Any = js.native
  var _onCanvasBlurObserver: js.Any = js.native
  var _onCanvasFocusObserver: js.Any = js.native
  var _onDisposeObserver: js.Any = js.native
  var _onKeyDown: js.Any = js.native
  var _onKeyUp: js.Any = js.native
  var _onPointerDown: js.Any = js.native
  var _onPointerMove: js.Any = js.native
  var _onPointerUp: js.Any = js.native
  /** @hidden */
  var _outlineRenderer: OutlineRenderer = js.native
  var _pendingData: js.Any = js.native
  /** @hidden (Backing field) */
  var _physicsEngine: Nullable[IPhysicsEngine] = js.native
  var _pickWithRayInverseMatrix: js.Any = js.native
  var _pickedDownMesh: js.Any = js.native
  /** @hidden */
  var _pickedDownSprite: Nullable[Sprite] = js.native
  var _pickedUpMesh: js.Any = js.native
  var _pointerCaptures: js.Any = js.native
  /**
           * @hidden
           * Defines the actions happening when a pointer down event happens.
           */
  var _pointerDownStage: Stage[PointerUpDownStageAction] = js.native
  /**
           * @hidden
           * Defines the actions happening when a pointer move event happens.
           */
  var _pointerMoveStage: Stage[PointerMoveStageAction] = js.native
  var _pointerOverMesh: js.Any = js.native
  /** @hidden */
  var _pointerOverSprite: Nullable[Sprite] = js.native
  /**
           * @hidden
           * Defines the actions happening when a pointer up event happens.
           */
  var _pointerUpStage: Stage[PointerUpDownStageAction] = js.native
  var _pointerX: js.Any = js.native
  var _pointerY: js.Any = js.native
  /** @hidden (Backing field) */
  var _postProcessRenderPipelineManager: PostProcessRenderPipelineManager = js.native
  var _previousButtonPressed: js.Any = js.native
  var _previousDelayedSimpleClickTimeout: js.Any = js.native
  var _previousPickResult: js.Any = js.native
  var _previousStartingPointerPosition: js.Any = js.native
  var _previousStartingPointerTime: js.Any = js.native
  var _processLateAnimationBindings: js.Any = js.native
  var _processLateAnimationBindingsForMatrices: js.Any = js.native
  var _processLateAnimationBindingsForQuaternions: js.Any = js.native
  var _processPointerDown: js.Any = js.native
  var _processPointerMove: js.Any = js.native
  var _processPointerUp: js.Any = js.native
  var _processSubCameras: js.Any = js.native
  var _processedMaterials: js.Any = js.native
  var _projectionMatrix: js.Any = js.native
  var _projectionUpdateFlag: js.Any = js.native
  /**
           * Registers the transient components if needed.
           */
  var _registerTransientComponents: js.Any = js.native
  var _registeredForLateAnimationBindings: js.Any = js.native
  var _renderForCamera: js.Any = js.native
  var _renderId: js.Any = js.native
  var _renderTargets: js.Any = js.native
  var _renderingManager: js.Any = js.native
  var _sceneUbo: js.Any = js.native
  /**
           * @hidden
           * Backing Filed
           */
  var _selectionOctree: Octree[AbstractMesh] = js.native
  /**
           * @hidden
           * Backing store of defined scene components.
           */
  var _serializableComponents: js.Array[ISceneSerializableComponent] = js.native
  var _setRayOnPointerInfo: js.Any = js.native
  var _shadowsEnabled: js.Any = js.native
  /** @hidden (Backing field) */
  var _simplificationQueue: SimplificationQueue = js.native
  var _skeletonsEnabled: js.Any = js.native
  var _softwareSkinnedMeshes: js.Any = js.native
  var _startingPointerPosition: js.Any = js.native
  var _startingPointerTime: js.Any = js.native
  var _tempPickingRay: js.Any = js.native
  /** @hidden */
  var _tempSpritePickingRay: Nullable[Ray] = js.native
  var _texturesEnabled: js.Any = js.native
  var _timeAccumulator: js.Any = js.native
  /** @hidden */
  var _toBeDisposed: js.Array[Nullable[IDisposable]] = js.native
  var _totalPointersPressed: js.Any = js.native
  var _totalVertices: js.Any = js.native
  var _transformMatrix: js.Any = js.native
  /**
           * List of components to register on the next registration step.
           */
  var _transientComponents: js.Any = js.native
  var _uid: js.Any = js.native
  var _unTranslatedPointerX: js.Any = js.native
  var _unTranslatedPointerY: js.Any = js.native
  var _updatePointerPosition: js.Any = js.native
  var _useAlternateCameraConfiguration: js.Any = js.native
  var _useRightHandedSystem: js.Any = js.native
  var _viewMatrix: js.Any = js.native
  var _viewUpdateFlag: js.Any = js.native
  var _workerCollisions: js.Any = js.native
  /**
           * Gets or sets the action manager associated with the scene
           * @see http://doc.babylonjs.com/how_to/how_to_use_actions
          */
  var actionManager: ActionManager = js.native
  /**
           * Gets the performance counter for active bones
           * @see http://doc.babylonjs.com/how_to/optimizing_your_scene#instrumentation
           */
  val activeBonesPerfCounter: PerfCounter = js.native
  /** The current active camera */
  var activeCamera: Nullable[Camera] = js.native
  /** All of the active cameras added to this scene. */
  var activeCameras: js.Array[Camera] = js.native
  /**
           * Gets the performance counter for active particles
           * @see http://doc.babylonjs.com/how_to/optimizing_your_scene#instrumentation
           */
  val activeParticlesPerfCounter: PerfCounter = js.native
  /** Sets a function to be executed after rendering this scene */
  var afterRender: Nullable[js.Function0[scala.Unit]] = js.native
  /**
           * Defines the color used to simulate the ambient color (Default is (0, 0, 0))
           */
  var ambientColor: Color3 = js.native
  /**
           * Gets all animatable attached to the scene
           */
  val animatables: js.Array[Animatable] = js.native
  /**
           * Gets or sets the animation properties override
           */
  var animationPropertiesOverride: Nullable[AnimationPropertiesOverride] = js.native
  /**
           * Gets or sets a general scale for animation speed
           * @see https://www.babylonjs-playground.com/#IBU2W7#3
           */
  var animationTimeScale: scala.Double = js.native
  /**
           * Gets or sets a boolean indicating if animations are enabled
           */
  var animationsEnabled: scala.Boolean = js.native
  /**
           * Gets or sets if audio support is enabled
           * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music
           */
  var audioEnabled: scala.Boolean = js.native
  /**
           * Gets or sets a boolean that indicates if the scene must clear the render buffer before rendering a frame
           */
  var autoClear: scala.Boolean = js.native
  /**
           * Gets or sets a boolean that indicates if the scene must clear the depth and stencil buffers before rendering a frame
           */
  var autoClearDepthAndStencil: scala.Boolean = js.native
  /** Sets a function to be executed before rendering this scene */
  var beforeRender: Nullable[js.Function0[scala.Unit]] = js.native
  /** Gets or sets a boolean blocking all the calls to markAllMaterialsAsDirty (ie. the materials won't be updated if they are out of sync) */
  var blockMaterialDirtyMechanism: scala.Boolean = js.native
  /** Define this parameter if you are using multiple cameras and you want to specify which one should be used for pointer position */
  var cameraToUseForPointers: Nullable[Camera] = js.native
  /**
           * Defines the color used to clear the render buffer (Default is (0.2, 0.2, 0.3, 1.0))
           */
  var clearColor: Color4 = js.native
  /**
           * Gets or sets the active clipplane 1
           */
  var clipPlane: Nullable[Plane] = js.native
  /**
           * Gets or sets the active clipplane 2
           */
  var clipPlane2: Nullable[Plane] = js.native
  /**
           * Gets or sets the active clipplane 3
           */
  var clipPlane3: Nullable[Plane] = js.native
  /**
           * Gets or sets the active clipplane 4
           */
  var clipPlane4: Nullable[Plane] = js.native
  /** @hidden */
  var collisionCoordinator: ICollisionCoordinator = js.native
  /**
          * Gets or sets a boolean indicating if collisions are enabled on this scene
          * @see http://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity
          */
  var collisionsEnabled: scala.Boolean = js.native
  /**
           * Gets or sets a boolean indicating if the scene must keep the meshUnderPointer property updated
           * Please note that it requires to run a ray cast through the scene on every frame
           */
  var constantlyUpdateMeshUnderPointer: scala.Boolean = js.native
  /**
           * The list of user defined render targets added to the scene
           */
  var customRenderTargets: js.Array[RenderTargetTexture] = js.native
  /**
           * @hidden
           */
  var database: Database = js.native
  /**
           * Gets the debug layer (aka Inspector) associated with the scene
           * @see http://doc.babylonjs.com/features/playground_debuglayer
           */
  var debugLayer: DebugLayer = js.native
  /**
           * Defines the HTML default cursor to use (empty by default)
           */
  var defaultCursor: java.lang.String = js.native
  /** The default material used on meshes when no material is affected */
  /** The default material used on meshes when no material is affected */
  var defaultMaterial: Material = js.native
  /**
           * Use this array to add regular expressions used to disable offline support for specific urls
           */
  var disableOfflineSupportExceptionRules: js.Array[stdLib.RegExp] = js.native
  /**
           * Gets or sets a boolean indicating that all submeshes of active meshes must be rendered
           * Use this boolean to avoid computing frustum clipping on submeshes (This could help when you are CPU bound)
           */
  var dispatchAllSubMeshesOfActiveMeshes: scala.Boolean = js.native
  /**
          * Gets or sets a boolean indicating if next render targets must be dumped as image for debugging purposes
          * We recommend not using it and instead rely on Spector.js: http://spector.babylonjs.com
          */
  var dumpNextRenderTargets: scala.Boolean = js.native
  /**
           * Texture used in all pbr material as the reflection texture.
           * As in the majority of the scene they are the same (exception for multi room and so on),
           * this is easier to reference from here than from all the materials.
           */
  /**
          * Texture used in all pbr material as the reflection texture.
          * As in the majority of the scene they are the same (exception for multi room and so on),
          * this is easier to set here than in all the materials.
          */
  var environmentTexture: BaseTexture = js.native
  /** @hidden */
  val evaluateActiveMeshesDurationPerfCounter: Nullable[PerfCounter] = js.native
  /**
          * Gets or sets the fog color to use
          * @see http://doc.babylonjs.com/babylon101/environment#fog
          * (Default is Color3(0.2, 0.2, 0.3))
          */
  var fogColor: Color3 = js.native
  /**
          * Gets or sets the fog density to use
          * @see http://doc.babylonjs.com/babylon101/environment#fog
          * (Default is 0.1)
          */
  var fogDensity: scala.Double = js.native
  /**
          * Gets or sets a boolean indicating if fog is enabled on this scene
          * @see http://doc.babylonjs.com/babylon101/environment#fog
          * (Default is true)
          */
  var fogEnabled: scala.Boolean = js.native
  /**
          * Gets or sets the fog end distance to use
          * @see http://doc.babylonjs.com/babylon101/environment#fog
          * (Default is 1000)
          */
  var fogEnd: scala.Double = js.native
  /**
          * Gets or sets the fog mode to use
          * @see http://doc.babylonjs.com/babylon101/environment#fog
          * | mode | value |
          * | --- | --- |
          * | FOGMODE_NONE | 0 |
          * | FOGMODE_EXP | 1 |
          * | FOGMODE_EXP2 | 2 |
          * | FOGMODE_LINEAR | 3 |
          */
  var fogMode: scala.Double = js.native
  /**
          * Gets or sets the fog start distance to use
          * @see http://doc.babylonjs.com/babylon101/environment#fog
          * (Default is 0)
          */
  var fogStart: scala.Double = js.native
  /**
           * Gets or sets a boolean indicating if all rendering must be done in point cloud
           */
  var forcePointsCloud: scala.Boolean = js.native
  /**
           * Gets or sets a boolean indicating if all bounding boxes must be rendered
           */
  var forceShowBoundingBoxes: scala.Boolean = js.native
  /**
           * Gets or sets a boolean indicating if all rendering must be done in wireframe
           */
  var forceWireframe: scala.Boolean = js.native
  /**
           * Gets the list of frustum planes (built from the active camera)
           */
  val frustumPlanes: js.Array[Plane] = js.native
  /**
           * Gets the gamepad manager associated with the scene
           * @see http://doc.babylonjs.com/how_to/how_to_use_gamepads
           */
  var gamepadManager: GamepadManager = js.native
  /**
           * Gets or Sets the current geometry buffer associated to the scene.
           */
  var geometryBufferRenderer: Nullable[GeometryBufferRenderer] = js.native
  /**
           * Defines the gravity applied to this scene (used only for collisions)
           * @see http://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity
           */
  var gravity: Vector3 = js.native
  /**
           * Gets or sets if audio will be output to headphones
           * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music
           */
  var headphone: scala.Boolean = js.native
  /**
           * Defines the HTML cursor to use when hovering over interactive elements
           */
  var hoverCursor: java.lang.String = js.native
  /**
           * Default image processing configuration used either in the rendering
           * Forward main pass or through the imageProcessingPostProcess if present.
           * As in the majority of the scene they are the same (exception for multi camera),
           * this is easier to reference from here than from all the materials and post process.
           *
           * No setter as we it is a shared configuration, you can set the values instead.
           */
  val imageProcessingConfiguration: ImageProcessingConfiguration = js.native
  /**
           * Gets the list of meshes imported to the scene through SceneLoader
           */
  var importedMeshesFiles: js.Array[nodeLib.String] = js.native
  /** @hidden */
  val interFramePerfCounter: Nullable[PerfCounter] = js.native
  /**
           * Gets if the scene is already disposed
           */
  val isDisposed: scala.Boolean = js.native
  /**
           * Returns a boolean indicating if the scene is still loading data
           */
  val isLoading: scala.Boolean = js.native
  /** @hidden */
  val lastFramePerfCounter: Nullable[PerfCounter] = js.native
  /**
          * Gets or sets a boolean indicating if lens flares are enabled on this scene
          */
  var lensFlaresEnabled: scala.Boolean = js.native
  /**
          * Gets or sets a boolean indicating if lights are enabled on this scene
          */
  var lightsEnabled: scala.Boolean = js.native
  /**
           * Gets the name of the plugin used to load this scene (null by default)
           */
  var loadingPluginName: java.lang.String = js.native
  /**
           * The main sound track played by the scene.
           * It cotains your primary collection of sounds.
           */
  var mainSoundTrack: SoundTrack = js.native
  /**
           * Gets the mesh that is currently under the pointer
           */
  val meshUnderPointer: Nullable[AbstractMesh] = js.native
  /**
           * Gets or sets user defined metadata
           */
  var metadata: js.Any = js.native
  /**
          * An event triggered when active meshes evaluation is done
          */
  var onAfterActiveMeshesEvaluationObservable: Observable[Scene] = js.native
  /**
          * An event triggered after animations processing
          */
  var onAfterAnimationsObservable: Observable[Scene] = js.native
  /**
          * An event triggered after rendering a camera
          */
  var onAfterCameraRenderObservable: Observable[Camera] = js.native
  /**
          * An event triggered after draw calls have been sent
          */
  var onAfterDrawPhaseObservable: Observable[Scene] = js.native
  /**
          * An event triggered when particles rendering is done
          * Note: This event can be trigger more than once per frame (because particles can be rendered by render target textures as well)
          */
  var onAfterParticlesRenderingObservable: Observable[Scene] = js.native
  /**
           * An event triggered when physic simulation has been done
           */
  var onAfterPhysicsObservable: Observable[Scene] = js.native
  /**
          * An event triggered after rendering the scene
          */
  var onAfterRenderObservable: Observable[Scene] = js.native
  /**
          * An event triggered when render targets were rendered.
          * Can happen multiple times per frame.
          */
  var onAfterRenderTargetsRenderObservable: Observable[Scene] = js.native
  /**
           * This Observable will be triggered after rendering each renderingGroup of each rendered camera.
           * The RenderinGroupInfo class contains all the information about the context in which the observable is called
           * If you wish to register an Observer only for a given set of renderingGroup, use the mask with a combination of the renderingGroup index elevated to the power of two (1 for renderingGroup 0, 2 for renderingrOup1, 4 for 2 and 8 for 3)
           */
  var onAfterRenderingGroupObservable: Observable[RenderingGroupInfo] = js.native
  /**
           * An event triggered when sprites rendering is done
           * Note: This event can be trigger more than once per frame (because sprites can be rendered by render target textures as well)
           */
  var onAfterSpritesRenderingObservable: Observable[Scene] = js.native
  /**
          * An event triggered after calculating deterministic simulation step
          */
  var onAfterStepObservable: Observable[Scene] = js.native
  /**
          * An event triggered when active meshes evaluation is about to start
          */
  var onBeforeActiveMeshesEvaluationObservable: Observable[Scene] = js.native
  /**
          * An event triggered before animating the scene
          */
  var onBeforeAnimationsObservable: Observable[Scene] = js.native
  /**
          * An event triggered before rendering a camera
          */
  var onBeforeCameraRenderObservable: Observable[Camera] = js.native
  /**
          * An event triggered before draw calls are ready to be sent
          */
  var onBeforeDrawPhaseObservable: Observable[Scene] = js.native
  /**
          * An event triggered when particles rendering is about to start
          * Note: This event can be trigger more than once per frame (because particles can be rendered by render target textures as well)
          */
  var onBeforeParticlesRenderingObservable: Observable[Scene] = js.native
  /**
          * An event triggered when physic simulation is about to be run
          */
  var onBeforePhysicsObservable: Observable[Scene] = js.native
  /**
          * An event triggered before rendering the scene (right after animations and physics)
          */
  var onBeforeRenderObservable: Observable[Scene] = js.native
  /**
          * An event triggered when render targets are about to be rendered
          * Can happen multiple times per frame.
          */
  var onBeforeRenderTargetsRenderObservable: Observable[Scene] = js.native
  /**
           * This Observable will be triggered before rendering each renderingGroup of each rendered camera.
           * The RenderinGroupInfo class contains all the information about the context in which the observable is called
           * If you wish to register an Observer only for a given set of renderingGroup, use the mask with a combination of the renderingGroup index elevated to the power of two (1 for renderingGroup 0, 2 for renderingrOup1, 4 for 2 and 8 for 3)
           */
  var onBeforeRenderingGroupObservable: Observable[RenderingGroupInfo] = js.native
  /**
           * An event triggered when sprites rendering is about to start
           * Note: This event can be trigger more than once per frame (because sprites can be rendered by render target textures as well)
           */
  var onBeforeSpritesRenderingObservable: Observable[Scene] = js.native
  /**
          * An event triggered before calculating deterministic simulation step
          */
  var onBeforeStepObservable: Observable[Scene] = js.native
  /**
          * An event triggered when a camera is removed
          */
  var onCameraRemovedObservable: Observable[Camera] = js.native
  /**
          * An event triggered when SceneLoader.Append or SceneLoader.Load or SceneLoader.ImportMesh were successfully executed
          */
  var onDataLoadedObservable: Observable[Scene] = js.native
  /**
          * An event triggered when the scene is disposed.
          */
  var onDisposeObservable: Observable[Scene] = js.native
  /**
          * An event triggered when a geometry is removed
          */
  var onGeometryRemovedObservable: Observable[Geometry] = js.native
  /**
           * Observable event triggered each time an keyboard event is received from the hosting window
           */
  var onKeyboardObservable: Observable[KeyboardInfo] = js.native
  /**
          * An event triggered when a light is removed
          */
  var onLightRemovedObservable: Observable[Light] = js.native
  /**
          * An event triggered when a material is removed
          */
  var onMaterialRemovedObservable: Observable[Material] = js.native
  /**
           * This Observable will when a mesh has been imported into the scene.
           */
  var onMeshImportedObservable: Observable[AbstractMesh] = js.native
  /**
          * An event triggered when a mesh is removed
          */
  var onMeshRemovedObservable: Observable[AbstractMesh] = js.native
  /**
          * An event triggered when a camera is created
          */
  var onNewCameraAddedObservable: Observable[Camera] = js.native
  /**
          * An event triggered when a geometry is created
          */
  var onNewGeometryAddedObservable: Observable[Geometry] = js.native
  /**
          * An event triggered when a light is created
          */
  var onNewLightAddedObservable: Observable[Light] = js.native
  /**
          * An event triggered when a material is created
          */
  var onNewMaterialAddedObservable: Observable[Material] = js.native
  /**
          * An event triggered when a mesh is created
          */
  var onNewMeshAddedObservable: Observable[AbstractMesh] = js.native
  /**
          * An event triggered when a texture is created
          */
  var onNewTextureAddedObservable: Observable[BaseTexture] = js.native
  /**
          * An event triggered when a transform node is created
          */
  var onNewTransformNodeAddedObservable: Observable[TransformNode] = js.native
  /**
           * Observable event triggered each time an input event is received from the rendering canvas
           */
  var onPointerObservable: Observable[PointerInfo] = js.native
  /**
           * This observable event is triggered when any keyboard event si raised and registered during Scene.attachControl()
           * You have the possibility to skip the process and the call to onKeyboardObservable by setting KeyboardInfoPre.skipOnPointerObservable to true
           */
  var onPreKeyboardObservable: Observable[KeyboardInfoPre] = js.native
  /**
           * This observable event is triggered when any ponter event is triggered. It is registered during Scene.attachControl() and it is called BEFORE the 3D engine process anything (mesh/sprite picking for instance).
           * You have the possibility to skip the process and the call to onPointerObservable by setting PointerInfoPre.skipOnPointerObservable to true
           */
  var onPrePointerObservable: Observable[PointerInfoPre] = js.native
  /**
          * An event triggered when the scene is ready
          */
  var onReadyObservable: Observable[Scene] = js.native
  /**
          * An event triggered when a texture is removed
          */
  var onTextureRemovedObservable: Observable[BaseTexture] = js.native
  /**
          * An event triggered when a transform node is removed
          */
  var onTransformNodeRemovedObservable: Observable[TransformNode] = js.native
  /** @hidden */
  val particlesDurationPerfCounter: Nullable[PerfCounter] = js.native
  /**
          * Gets or sets a boolean indicating if particles are enabled on this scene
          */
  var particlesEnabled: scala.Boolean = js.native
  /**
           * Gets the current on-screen X position of the pointer
           */
  val pointerX: scala.Double = js.native
  /**
           * Gets the current on-screen Y position of the pointer
           */
  val pointerY: scala.Double = js.native
  /**
           * Gets the current postprocess manager
           */
  var postProcessManager: PostProcessManager = js.native
  /**
           * Gets the postprocess render pipeline manager
           * @see http://doc.babylonjs.com/how_to/how_to_use_postprocessrenderpipeline
           * @see http://doc.babylonjs.com/how_to/using_default_rendering_pipeline
           */
  val postProcessRenderPipelineManager: PostProcessRenderPipelineManager = js.native
  /**
           * The list of postprocesses added to the scene
           */
  var postProcesses: js.Array[PostProcess] = js.native
  /**
          * Gets or sets a boolean indicating if postprocesses are enabled on this scene
          */
  var postProcessesEnabled: scala.Boolean = js.native
  /**
           * This is used to call preventDefault() on pointer down
           * in order to block unwanted artifacts like system double clicks
           */
  var preventDefaultOnPointerDown: scala.Boolean = js.native
  /**
          * Gets or sets a boolean indicating if probes are enabled on this scene
          */
  var probesEnabled: scala.Boolean = js.native
  /**
          * Gets or sets a boolean indicating if procedural textures are enabled on this scene
          */
  var proceduralTexturesEnabled: scala.Boolean = js.native
  /**
           * The list of reflection probes added to the scene
           * @see http://doc.babylonjs.com/how_to/how_to_use_reflection_probes
           */
  var reflectionProbes: js.Array[ReflectionProbe] = js.native
  /** @hidden */
  val renderDurationPerfCounter: Nullable[PerfCounter] = js.native
  /**
          * Gets or sets a boolean indicating if render targets are enabled on this scene
          */
  var renderTargetsEnabled: scala.Boolean = js.native
  /**
           * Gets or sets a boolean indicating if lights must be sorted by priority (off by default)
           * This is useful if there are more lights that the maximum simulteanous authorized
           */
  var requireLightSorting: scala.Boolean = js.native
  /**
           * Gets the octree used to boost mesh selection (picking)
           * @see http://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
           */
  var selectionOctree: Octree[AbstractMesh] = js.native
  /**
          * Gets or sets a boolean indicating if shadows are enabled on this scene
          */
  var shadowsEnabled: scala.Boolean = js.native
  /**
           * Gets or sets the simplification queue attached to the scene
           * @see http://doc.babylonjs.com/how_to/in-browser_mesh_simplification
           */
  var simplificationQueue: SimplificationQueue = js.native
  /**
          * Gets or sets a boolean indicating if skeletons are enabled on this scene
          */
  var skeletonsEnabled: scala.Boolean = js.native
  /**
           * The list of sound tracks added to the scene
           * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music
           */
  var soundTracks: Nullable[js.Array[SoundTrack]] = js.native
  /** @hidden */
  val spriteDuractionPerfCounter: Nullable[PerfCounter] = js.native
  /**
           * All of the sprite managers added to this scene
           * @see http://doc.babylonjs.com/babylon101/sprites
           */
  var spriteManagers: js.Array[ISpriteManager] = js.native
  /**
          * Gets or sets a boolean indicating if sprites are enabled on this scene
          */
  var spritesEnabled: scala.Boolean = js.native
  /**
          * Gets or sets a boolean indicating if textures are enabled on this scene
          */
  var texturesEnabled: scala.Boolean = js.native
  /**
           * Gets the performance counter for active indices
           * @see http://doc.babylonjs.com/how_to/optimizing_your_scene#instrumentation
           */
  val totalActiveIndicesPerfCounter: PerfCounter = js.native
  /**
           * Gets the performance counter for total vertices
           * @see http://doc.babylonjs.com/how_to/optimizing_your_scene#instrumentation
           */
  val totalVerticesPerfCounter: PerfCounter = js.native
  /**
           * Return a unique id as a string which can serve as an identifier for the scene
           */
  val uid: java.lang.String = js.native
  /**
           * Gets the pointer coordinates without any translation (ie. straight out of the pointer event)
           */
  val unTranslatedPointer: Vector2 = js.native
  /**
           * Gets or sets a boolean indicating if a constant deltatime has to be used
           * This is mostly useful for testing purposes when you do not want the animations to scale with the framerate
           */
  var useConstantAnimationDeltaTime: scala.Boolean = js.native
  /**
           * Defines if texture loading must be delayed
           * If true, textures will only be loaded when they need to be rendered
           */
  var useDelayedTextureLoading: scala.Boolean = js.native
  /**
          * Gets or sets a boolean indicating if the scene must use right-handed coordinates system
          */
  var useRightHandedSystem: scala.Boolean = js.native
  /**
          * Gets a boolean indicating if collisions are processed on a web worker
          * @see http://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity#web-worker-based-collision-system-since-21
          */
  var workerCollisions: scala.Boolean = js.native
  /**
           * @hidden
           * Add a component to the scene.
           * Note that the ccomponent could be registered on th next frame if this is called after
           * the register component stage.
           * @param component Defines the component to add to the scene
           */
  def _addComponent(component: ISceneComponent): scala.Unit = js.native
  /** @hidden */
  def _addPendingData(data: js.Any): scala.Unit = js.native
  /** @hidden */
  def _advancePhysicsEngineStep(step: scala.Double): scala.Unit = js.native
  /** @hidden */
  def _checkIsReady(): scala.Unit = js.native
  /**
           * @hidden
           * Gets a component from the scene.
           * @param name defines the name of the component to retrieve
           * @returns the component or null if not present
           */
  def _getComponent(name: java.lang.String): Nullable[ISceneComponent] = js.native
  /**
           * @hidden
           */
  def _getDefaultMeshCandidates(): ISmartArrayLike[AbstractMesh] = js.native
  /**
           * @hidden
           */
  def _getDefaultSubMeshCandidates(mesh: AbstractMesh): ISmartArrayLike[SubMesh] = js.native
  /** @hidden */
  def _internalPickSprites(ray: Ray): Nullable[PickingInfo] = js.native
  /** @hidden */
  def _internalPickSprites(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, scala.Boolean]): Nullable[PickingInfo] = js.native
  /** @hidden */
  def _internalPickSprites(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, scala.Boolean], fastCheck: scala.Boolean): Nullable[PickingInfo] = js.native
  /** @hidden */
  def _internalPickSprites(
    ray: Ray,
    predicate: js.Function1[/* sprite */ Sprite, scala.Boolean],
    fastCheck: scala.Boolean,
    camera: Camera
  ): Nullable[PickingInfo] = js.native
  /** @hidden */
  def _isInIntermediateRendering(): scala.Boolean = js.native
  /** @hidden */
  def _isPointerSwiping(): scala.Boolean = js.native
  /** @hidden */
  def _loadFile(
    url: java.lang.String,
    onSuccess: js.Function2[
      /* data */ java.lang.String | stdLib.ArrayBuffer, 
      /* responseURL */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): IFileRequest = js.native
  /** @hidden */
  def _loadFile(
    url: java.lang.String,
    onSuccess: js.Function2[
      /* data */ java.lang.String | stdLib.ArrayBuffer, 
      /* responseURL */ js.UndefOr[java.lang.String], 
      scala.Unit
    ],
    onProgress: js.Function1[/* data */ js.Any, scala.Unit]
  ): IFileRequest = js.native
  /** @hidden */
  def _loadFile(
    url: java.lang.String,
    onSuccess: js.Function2[
      /* data */ java.lang.String | stdLib.ArrayBuffer, 
      /* responseURL */ js.UndefOr[java.lang.String], 
      scala.Unit
    ],
    onProgress: js.Function1[/* data */ js.Any, scala.Unit],
    useDatabase: scala.Boolean
  ): IFileRequest = js.native
  /** @hidden */
  def _loadFile(
    url: java.lang.String,
    onSuccess: js.Function2[
      /* data */ java.lang.String | stdLib.ArrayBuffer, 
      /* responseURL */ js.UndefOr[java.lang.String], 
      scala.Unit
    ],
    onProgress: js.Function1[/* data */ js.Any, scala.Unit],
    useDatabase: scala.Boolean,
    useArrayBuffer: scala.Boolean
  ): IFileRequest = js.native
  /** @hidden */
  def _loadFile(
    url: java.lang.String,
    onSuccess: js.Function2[
      /* data */ java.lang.String | stdLib.ArrayBuffer, 
      /* responseURL */ js.UndefOr[java.lang.String], 
      scala.Unit
    ],
    onProgress: js.Function1[/* data */ js.Any, scala.Unit],
    useDatabase: scala.Boolean,
    useArrayBuffer: scala.Boolean,
    onError: js.Function2[
      /* request */ js.UndefOr[stdLib.XMLHttpRequest], 
      /* exception */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): IFileRequest = js.native
  /** @hidden */
  def _loadFileAsync(url: java.lang.String): js.Promise[java.lang.String | stdLib.ArrayBuffer] = js.native
  /** @hidden */
  def _loadFileAsync(url: java.lang.String, useDatabase: scala.Boolean): js.Promise[java.lang.String | stdLib.ArrayBuffer] = js.native
  /** @hidden */
  def _loadFileAsync(url: java.lang.String, useDatabase: scala.Boolean, useArrayBuffer: scala.Boolean): js.Promise[java.lang.String | stdLib.ArrayBuffer] = js.native
  /** @hidden */
  def _rebuildGeometries(): scala.Unit = js.native
  /** @hidden */
  def _rebuildTextures(): scala.Unit = js.native
  /** @hidden */
  def _registerTargetForLateAnimationBinding(runtimeAnimation: RuntimeAnimation, originalValue: js.Any): scala.Unit = js.native
  /** @hidden */
  def _removePendingData(data: js.Any): scala.Unit = js.native
  /** @hidden */
  def _setAlternateTransformMatrix(view: Matrix, projection: Matrix): scala.Unit = js.native
  /** @hidden */
  def _switchToAlternateCameraConfiguration(active: scala.Boolean): scala.Unit = js.native
  /**
           * Adds the given action manager to this scene
           * @param newActionManager The action manager to add
           */
  def addActionManager(newActionManager: ActionManager): scala.Unit = js.native
  /**
           * Adds the given animation to this scene
           * @param newAnimation The animation to add
           */
  def addAnimation(newAnimation: Animation): scala.Unit = js.native
  /**
           * Adds the given animation group to this scene.
           * @param newAnimationGroup The animation group to add
           */
  def addAnimationGroup(newAnimationGroup: AnimationGroup): scala.Unit = js.native
  /**
           * Adds the given camera to this scene
           * @param newCamera The camera to add
           */
  def addCamera(newCamera: Camera): scala.Unit = js.native
  /**
           * Add an externaly attached data from its key.
           * This method call will fail and return false, if such key already exists.
           * If you don't care and just want to get the data no matter what, use the more convenient getOrAddExternalDataWithFactory() method.
           * @param key the unique key that identifies the data
           * @param data the data object to associate to the key for this Engine instance
           * @return true if no such key were already present and the data was added successfully, false otherwise
           */
  def addExternalData[T](key: java.lang.String, data: T): scala.Boolean = js.native
  /**
           * Adds the given geometry to this scene
           * @param newGeometry The geometry to add
           */
  def addGeometry(newGeometry: Geometry): scala.Unit = js.native
  /**
           * Adds the given light to this scene
           * @param newLight The light to add
           */
  def addLight(newLight: Light): scala.Unit = js.native
  /**
           * Adds the given material to this scene
           * @param newMaterial The material to add
           */
  def addMaterial(newMaterial: Material): scala.Unit = js.native
  /**
           * Add a mesh to the list of scene's meshes
           * @param newMesh defines the mesh to add
           * @param recursive if all child meshes should also be added to the scene
           */
  def addMesh(newMesh: AbstractMesh): scala.Unit = js.native
  /**
           * Add a mesh to the list of scene's meshes
           * @param newMesh defines the mesh to add
           * @param recursive if all child meshes should also be added to the scene
           */
  def addMesh(newMesh: AbstractMesh, recursive: scala.Boolean): scala.Unit = js.native
  /**
           * Adds the given morph target to this scene
           * @param newMorphTargetManager The morph target to add
           */
  def addMorphTargetManager(newMorphTargetManager: MorphTargetManager): scala.Unit = js.native
  /**
           * Adds the given multi-material to this scene
           * @param newMultiMaterial The multi-material to add
           */
  def addMultiMaterial(newMultiMaterial: MultiMaterial): scala.Unit = js.native
  /**
           * Adds the given particle system to this scene
           * @param newParticleSystem The particle system to add
           */
  def addParticleSystem(newParticleSystem: IParticleSystem): scala.Unit = js.native
  /**
           * Adds the given skeleton to this scene
           * @param newSkeleton The skeleton to add
           */
  def addSkeleton(newSkeleton: Skeleton): scala.Unit = js.native
  /**
           * Adds the given texture to this scene.
           * @param newTexture The texture to add
           */
  def addTexture(newTexture: BaseTexture): scala.Unit = js.native
  /**
           * Add a transform node to the list of scene's transform nodes
           * @param newTransformNode defines the transform node to add
           */
  def addTransformNode(newTransformNode: TransformNode): scala.Unit = js.native
  /** Sets a function to be executed after rendering a camera*/
  def afterCameraRender(): scala.Unit = js.native
  /**
          * Attach events to the canvas (To handle actionManagers triggers and raise onPointerMove, onPointerDown and onPointerUp
          * @param attachUp defines if you want to attach events to pointerup
          * @param attachDown defines if you want to attach events to pointerdown
          * @param attachMove defines if you want to attach events to pointermove
          */
  def attachControl(): scala.Unit = js.native
  /**
          * Attach events to the canvas (To handle actionManagers triggers and raise onPointerMove, onPointerDown and onPointerUp
          * @param attachUp defines if you want to attach events to pointerup
          * @param attachDown defines if you want to attach events to pointerdown
          * @param attachMove defines if you want to attach events to pointermove
          */
  def attachControl(attachUp: scala.Boolean): scala.Unit = js.native
  /**
          * Attach events to the canvas (To handle actionManagers triggers and raise onPointerMove, onPointerDown and onPointerUp
          * @param attachUp defines if you want to attach events to pointerup
          * @param attachDown defines if you want to attach events to pointerdown
          * @param attachMove defines if you want to attach events to pointermove
          */
  def attachControl(attachUp: scala.Boolean, attachDown: scala.Boolean): scala.Unit = js.native
  /**
          * Attach events to the canvas (To handle actionManagers triggers and raise onPointerMove, onPointerDown and onPointerUp
          * @param attachUp defines if you want to attach events to pointerup
          * @param attachDown defines if you want to attach events to pointerdown
          * @param attachMove defines if you want to attach events to pointermove
          */
  def attachControl(attachUp: scala.Boolean, attachDown: scala.Boolean, attachMove: scala.Boolean): scala.Unit = js.native
  /** Sets a function to be executed before rendering a camera*/
  def beforeCameraRender(): scala.Unit = js.native
  /**
           * Will start the animation sequence of a given target
           * @param target defines the target
           * @param from defines from which frame should animation start
           * @param to defines until which frame should animation run.
           * @param loop defines if the animation loops
           * @param speedRatio defines the speed in which to run the animation (1.0 by default)
           * @param onAnimationEnd defines the function to be executed when the animation ends
           * @param animatable defines an animatable object. If not provided a new one will be created from the given params
           * @param stopCurrent defines if the current animations must be stopped first (true by default)
           * @param targetMask defines if the target should be animated if animations are present (this is called recursively on descendant animatables regardless of return value)
           * @returns the animatable object created for this animation
           */
  def beginAnimation(
    target: js.Any,
    from: scala.Double,
    to: scala.Double,
    loop: js.UndefOr[scala.Boolean],
    speedRatio: js.UndefOr[scala.Double],
    onAnimationEnd: js.UndefOr[js.Function0[scala.Unit]],
    animatable: js.UndefOr[Animatable],
    stopCurrent: js.UndefOr[scala.Boolean],
    targetMask: js.UndefOr[js.Function1[/* target */ js.Any, scala.Boolean]]
  ): Animatable = js.native
  /**
           * Begin a new animation on a given node
           * @param target defines the target where the animation will take place
           * @param animations defines the list of animations to start
           * @param from defines the initial value
           * @param to defines the final value
           * @param loop defines if you want animation to loop (off by default)
           * @param speedRatio defines the speed ratio to apply to all animations
           * @param onAnimationEnd defines the callback to call when an animation ends (will be called once per node)
           * @returns the list of created animatables
           */
  def beginDirectAnimation(target: js.Any, animations: js.Array[Animation], from: scala.Double, to: scala.Double): Animatable = js.native
  /**
           * Begin a new animation on a given node
           * @param target defines the target where the animation will take place
           * @param animations defines the list of animations to start
           * @param from defines the initial value
           * @param to defines the final value
           * @param loop defines if you want animation to loop (off by default)
           * @param speedRatio defines the speed ratio to apply to all animations
           * @param onAnimationEnd defines the callback to call when an animation ends (will be called once per node)
           * @returns the list of created animatables
           */
  def beginDirectAnimation(
    target: js.Any,
    animations: js.Array[Animation],
    from: scala.Double,
    to: scala.Double,
    loop: scala.Boolean
  ): Animatable = js.native
  /**
           * Begin a new animation on a given node
           * @param target defines the target where the animation will take place
           * @param animations defines the list of animations to start
           * @param from defines the initial value
           * @param to defines the final value
           * @param loop defines if you want animation to loop (off by default)
           * @param speedRatio defines the speed ratio to apply to all animations
           * @param onAnimationEnd defines the callback to call when an animation ends (will be called once per node)
           * @returns the list of created animatables
           */
  def beginDirectAnimation(
    target: js.Any,
    animations: js.Array[Animation],
    from: scala.Double,
    to: scala.Double,
    loop: scala.Boolean,
    speedRatio: scala.Double
  ): Animatable = js.native
  /**
           * Begin a new animation on a given node
           * @param target defines the target where the animation will take place
           * @param animations defines the list of animations to start
           * @param from defines the initial value
           * @param to defines the final value
           * @param loop defines if you want animation to loop (off by default)
           * @param speedRatio defines the speed ratio to apply to all animations
           * @param onAnimationEnd defines the callback to call when an animation ends (will be called once per node)
           * @returns the list of created animatables
           */
  def beginDirectAnimation(
    target: js.Any,
    animations: js.Array[Animation],
    from: scala.Double,
    to: scala.Double,
    loop: scala.Boolean,
    speedRatio: scala.Double,
    onAnimationEnd: js.Function0[scala.Unit]
  ): Animatable = js.native
  /**
           * Begin a new animation on a given node and its hierarchy
           * @param target defines the root node where the animation will take place
           * @param directDescendantsOnly if true only direct descendants will be used, if false direct and also indirect (children of children, an so on in a recursive manner) descendants will be used.
           * @param animations defines the list of animations to start
           * @param from defines the initial value
           * @param to defines the final value
           * @param loop defines if you want animation to loop (off by default)
           * @param speedRatio defines the speed ratio to apply to all animations
           * @param onAnimationEnd defines the callback to call when an animation ends (will be called once per node)
           * @returns the list of animatables created for all nodes
           */
  def beginDirectHierarchyAnimation(
    target: Node,
    directDescendantsOnly: scala.Boolean,
    animations: js.Array[Animation],
    from: scala.Double,
    to: scala.Double
  ): js.Array[Animatable] = js.native
  /**
           * Begin a new animation on a given node and its hierarchy
           * @param target defines the root node where the animation will take place
           * @param directDescendantsOnly if true only direct descendants will be used, if false direct and also indirect (children of children, an so on in a recursive manner) descendants will be used.
           * @param animations defines the list of animations to start
           * @param from defines the initial value
           * @param to defines the final value
           * @param loop defines if you want animation to loop (off by default)
           * @param speedRatio defines the speed ratio to apply to all animations
           * @param onAnimationEnd defines the callback to call when an animation ends (will be called once per node)
           * @returns the list of animatables created for all nodes
           */
  def beginDirectHierarchyAnimation(
    target: Node,
    directDescendantsOnly: scala.Boolean,
    animations: js.Array[Animation],
    from: scala.Double,
    to: scala.Double,
    loop: scala.Boolean
  ): js.Array[Animatable] = js.native
  /**
           * Begin a new animation on a given node and its hierarchy
           * @param target defines the root node where the animation will take place
           * @param directDescendantsOnly if true only direct descendants will be used, if false direct and also indirect (children of children, an so on in a recursive manner) descendants will be used.
           * @param animations defines the list of animations to start
           * @param from defines the initial value
           * @param to defines the final value
           * @param loop defines if you want animation to loop (off by default)
           * @param speedRatio defines the speed ratio to apply to all animations
           * @param onAnimationEnd defines the callback to call when an animation ends (will be called once per node)
           * @returns the list of animatables created for all nodes
           */
  def beginDirectHierarchyAnimation(
    target: Node,
    directDescendantsOnly: scala.Boolean,
    animations: js.Array[Animation],
    from: scala.Double,
    to: scala.Double,
    loop: scala.Boolean,
    speedRatio: scala.Double
  ): js.Array[Animatable] = js.native
  /**
           * Begin a new animation on a given node and its hierarchy
           * @param target defines the root node where the animation will take place
           * @param directDescendantsOnly if true only direct descendants will be used, if false direct and also indirect (children of children, an so on in a recursive manner) descendants will be used.
           * @param animations defines the list of animations to start
           * @param from defines the initial value
           * @param to defines the final value
           * @param loop defines if you want animation to loop (off by default)
           * @param speedRatio defines the speed ratio to apply to all animations
           * @param onAnimationEnd defines the callback to call when an animation ends (will be called once per node)
           * @returns the list of animatables created for all nodes
           */
  def beginDirectHierarchyAnimation(
    target: Node,
    directDescendantsOnly: scala.Boolean,
    animations: js.Array[Animation],
    from: scala.Double,
    to: scala.Double,
    loop: scala.Boolean,
    speedRatio: scala.Double,
    onAnimationEnd: js.Function0[scala.Unit]
  ): js.Array[Animatable] = js.native
  /**
           * Will start the animation sequence of a given target
           * @param target defines the target
           * @param from defines from which frame should animation start
           * @param to defines until which frame should animation run.
           * @param weight defines the weight to apply to the animation (1.0 by default)
           * @param loop defines if the animation loops
           * @param speedRatio defines the speed in which to run the animation (1.0 by default)
           * @param onAnimationEnd defines the function to be executed when the animation ends
           * @param animatable defines an animatable object. If not provided a new one will be created from the given params
           * @param targetMask defines if the target should be animated if animations are present (this is called recursively on descendant animatables regardless of return value)
           * @returns the animatable object created for this animation
           */
  def beginWeightedAnimation(
    target: js.Any,
    from: scala.Double,
    to: scala.Double,
    weight: js.UndefOr[scala.Double],
    loop: js.UndefOr[scala.Boolean],
    speedRatio: js.UndefOr[scala.Double],
    onAnimationEnd: js.UndefOr[js.Function0[scala.Unit]],
    animatable: js.UndefOr[Animatable],
    targetMask: js.UndefOr[js.Function1[/* target */ js.Any, scala.Boolean]]
  ): Animatable = js.native
  /**
           * This function will remove the local cached buffer data from texture.
           * It will save memory but will prevent the texture from being rebuilt
           */
  def cleanCachedTextureBuffer(): scala.Unit = js.native
  /**
           * Call this function to reduce memory footprint of the scene.
           * Vertex buffers will not store CPU data anymore (this will prevent picking, collisions or physics to work correctly)
           */
  def clearCachedVertexData(): scala.Unit = js.native
  /**
           * Creates a default camera for the scene.
           * @see http://doc.babylonjs.com/How_To/Fast_Build#create-default-camera
           * @param createArcRotateCamera has the default false which creates a free camera, when true creates an arc rotate camera
           * @param replace has default false, when true replaces the active camera in the scene
           * @param attachCameraControls has default false, when true attaches camera controls to the canvas.
           */
  def createDefaultCamera(): scala.Unit = js.native
  /**
           * Creates a default camera for the scene.
           * @see http://doc.babylonjs.com/How_To/Fast_Build#create-default-camera
           * @param createArcRotateCamera has the default false which creates a free camera, when true creates an arc rotate camera
           * @param replace has default false, when true replaces the active camera in the scene
           * @param attachCameraControls has default false, when true attaches camera controls to the canvas.
           */
  def createDefaultCamera(createArcRotateCamera: scala.Boolean): scala.Unit = js.native
  /**
           * Creates a default camera for the scene.
           * @see http://doc.babylonjs.com/How_To/Fast_Build#create-default-camera
           * @param createArcRotateCamera has the default false which creates a free camera, when true creates an arc rotate camera
           * @param replace has default false, when true replaces the active camera in the scene
           * @param attachCameraControls has default false, when true attaches camera controls to the canvas.
           */
  def createDefaultCamera(createArcRotateCamera: scala.Boolean, replace: scala.Boolean): scala.Unit = js.native
  /**
           * Creates a default camera for the scene.
           * @see http://doc.babylonjs.com/How_To/Fast_Build#create-default-camera
           * @param createArcRotateCamera has the default false which creates a free camera, when true creates an arc rotate camera
           * @param replace has default false, when true replaces the active camera in the scene
           * @param attachCameraControls has default false, when true attaches camera controls to the canvas.
           */
  def createDefaultCamera(createArcRotateCamera: scala.Boolean, replace: scala.Boolean, attachCameraControls: scala.Boolean): scala.Unit = js.native
  /**
           * Creates a default camera and a default light.
           * @see http://doc.babylonjs.com/how_to/Fast_Build#create-default-camera-or-light
           * @param createArcRotateCamera has the default false which creates a free camera, when true creates an arc rotate camera
           * @param replace has the default false, when true replaces the active camera/light in the scene
           * @param attachCameraControls has the default false, when true attaches camera controls to the canvas.
           */
  def createDefaultCameraOrLight(): scala.Unit = js.native
  /**
           * Creates a default camera and a default light.
           * @see http://doc.babylonjs.com/how_to/Fast_Build#create-default-camera-or-light
           * @param createArcRotateCamera has the default false which creates a free camera, when true creates an arc rotate camera
           * @param replace has the default false, when true replaces the active camera/light in the scene
           * @param attachCameraControls has the default false, when true attaches camera controls to the canvas.
           */
  def createDefaultCameraOrLight(createArcRotateCamera: scala.Boolean): scala.Unit = js.native
  /**
           * Creates a default camera and a default light.
           * @see http://doc.babylonjs.com/how_to/Fast_Build#create-default-camera-or-light
           * @param createArcRotateCamera has the default false which creates a free camera, when true creates an arc rotate camera
           * @param replace has the default false, when true replaces the active camera/light in the scene
           * @param attachCameraControls has the default false, when true attaches camera controls to the canvas.
           */
  def createDefaultCameraOrLight(createArcRotateCamera: scala.Boolean, replace: scala.Boolean): scala.Unit = js.native
  /**
           * Creates a default camera and a default light.
           * @see http://doc.babylonjs.com/how_to/Fast_Build#create-default-camera-or-light
           * @param createArcRotateCamera has the default false which creates a free camera, when true creates an arc rotate camera
           * @param replace has the default false, when true replaces the active camera/light in the scene
           * @param attachCameraControls has the default false, when true attaches camera controls to the canvas.
           */
  def createDefaultCameraOrLight(createArcRotateCamera: scala.Boolean, replace: scala.Boolean, attachCameraControls: scala.Boolean): scala.Unit = js.native
  /**
           * Creates a new environment
           * @see http://doc.babylonjs.com/How_To/Fast_Build#create-default-environment
           * @param options defines the options you can use to configure the environment
           * @returns the new EnvironmentHelper
           */
  def createDefaultEnvironment(): Nullable[EnvironmentHelper] = js.native
  /**
           * Creates a new environment
           * @see http://doc.babylonjs.com/How_To/Fast_Build#create-default-environment
           * @param options defines the options you can use to configure the environment
           * @returns the new EnvironmentHelper
           */
  def createDefaultEnvironment(options: stdLib.Partial[IEnvironmentHelperOptions]): Nullable[EnvironmentHelper] = js.native
  /**
           * Creates a default light for the scene.
           * @see http://doc.babylonjs.com/How_To/Fast_Build#create-default-light
           * @param replace has the default false, when true replaces the existing lights in the scene with a hemispheric light
           */
  def createDefaultLight(): scala.Unit = js.native
  /**
           * Creates a default light for the scene.
           * @see http://doc.babylonjs.com/How_To/Fast_Build#create-default-light
           * @param replace has the default false, when true replaces the existing lights in the scene with a hemispheric light
           */
  def createDefaultLight(replace: scala.Boolean): scala.Unit = js.native
  /**
           * Creates a new sky box
           * @see http://doc.babylonjs.com/how_to/Fast_Build#create-default-skybox
           * @param environmentTexture defines the texture to use as environment texture
           * @param pbr has default false which requires the StandardMaterial to be used, when true PBRMaterial must be used
           * @param scale defines the overall scale of the skybox
           * @param blur is only available when pbr is true, default is 0, no blur, maximum value is 1
           * @param setGlobalEnvTexture has default true indicating that scene.environmentTexture must match the current skybox texture
           * @returns a new mesh holding the sky box
           */
  def createDefaultSkybox(): Nullable[Mesh] = js.native
  /**
           * Creates a new sky box
           * @see http://doc.babylonjs.com/how_to/Fast_Build#create-default-skybox
           * @param environmentTexture defines the texture to use as environment texture
           * @param pbr has default false which requires the StandardMaterial to be used, when true PBRMaterial must be used
           * @param scale defines the overall scale of the skybox
           * @param blur is only available when pbr is true, default is 0, no blur, maximum value is 1
           * @param setGlobalEnvTexture has default true indicating that scene.environmentTexture must match the current skybox texture
           * @returns a new mesh holding the sky box
           */
  def createDefaultSkybox(environmentTexture: BaseTexture): Nullable[Mesh] = js.native
  /**
           * Creates a new sky box
           * @see http://doc.babylonjs.com/how_to/Fast_Build#create-default-skybox
           * @param environmentTexture defines the texture to use as environment texture
           * @param pbr has default false which requires the StandardMaterial to be used, when true PBRMaterial must be used
           * @param scale defines the overall scale of the skybox
           * @param blur is only available when pbr is true, default is 0, no blur, maximum value is 1
           * @param setGlobalEnvTexture has default true indicating that scene.environmentTexture must match the current skybox texture
           * @returns a new mesh holding the sky box
           */
  def createDefaultSkybox(environmentTexture: BaseTexture, pbr: scala.Boolean): Nullable[Mesh] = js.native
  /**
           * Creates a new sky box
           * @see http://doc.babylonjs.com/how_to/Fast_Build#create-default-skybox
           * @param environmentTexture defines the texture to use as environment texture
           * @param pbr has default false which requires the StandardMaterial to be used, when true PBRMaterial must be used
           * @param scale defines the overall scale of the skybox
           * @param blur is only available when pbr is true, default is 0, no blur, maximum value is 1
           * @param setGlobalEnvTexture has default true indicating that scene.environmentTexture must match the current skybox texture
           * @returns a new mesh holding the sky box
           */
  def createDefaultSkybox(environmentTexture: BaseTexture, pbr: scala.Boolean, scale: scala.Double): Nullable[Mesh] = js.native
  /**
           * Creates a new sky box
           * @see http://doc.babylonjs.com/how_to/Fast_Build#create-default-skybox
           * @param environmentTexture defines the texture to use as environment texture
           * @param pbr has default false which requires the StandardMaterial to be used, when true PBRMaterial must be used
           * @param scale defines the overall scale of the skybox
           * @param blur is only available when pbr is true, default is 0, no blur, maximum value is 1
           * @param setGlobalEnvTexture has default true indicating that scene.environmentTexture must match the current skybox texture
           * @returns a new mesh holding the sky box
           */
  def createDefaultSkybox(environmentTexture: BaseTexture, pbr: scala.Boolean, scale: scala.Double, blur: scala.Double): Nullable[Mesh] = js.native
  /**
           * Creates a new sky box
           * @see http://doc.babylonjs.com/how_to/Fast_Build#create-default-skybox
           * @param environmentTexture defines the texture to use as environment texture
           * @param pbr has default false which requires the StandardMaterial to be used, when true PBRMaterial must be used
           * @param scale defines the overall scale of the skybox
           * @param blur is only available when pbr is true, default is 0, no blur, maximum value is 1
           * @param setGlobalEnvTexture has default true indicating that scene.environmentTexture must match the current skybox texture
           * @returns a new mesh holding the sky box
           */
  def createDefaultSkybox(
    environmentTexture: BaseTexture,
    pbr: scala.Boolean,
    scale: scala.Double,
    blur: scala.Double,
    setGlobalEnvTexture: scala.Boolean
  ): Nullable[Mesh] = js.native
  /**
           * Creates a new VREXperienceHelper
           * @see http://doc.babylonjs.com/how_to/webvr_helper
           * @param webVROptions defines the options used to create the new VREXperienceHelper
           * @returns a new VREXperienceHelper
           */
  def createDefaultVRExperience(): VRExperienceHelper = js.native
  /**
           * Creates a new VREXperienceHelper
           * @see http://doc.babylonjs.com/how_to/webvr_helper
           * @param webVROptions defines the options used to create the new VREXperienceHelper
           * @returns a new VREXperienceHelper
           */
  def createDefaultVRExperience(webVROptions: VRExperienceHelperOptions): VRExperienceHelper = js.native
  /**
           * Creates or updates the octree used to boost selection (picking)
           * @see http://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
           * @param maxCapacity defines the maximum capacity per leaf
           * @param maxDepth defines the maximum depth of the octree
           * @returns an octree of AbstractMesh
           */
  def createOrUpdateSelectionOctree(): Octree[AbstractMesh] = js.native
  /**
           * Creates or updates the octree used to boost selection (picking)
           * @see http://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
           * @param maxCapacity defines the maximum capacity per leaf
           * @param maxDepth defines the maximum depth of the octree
           * @returns an octree of AbstractMesh
           */
  def createOrUpdateSelectionOctree(maxCapacity: scala.Double): Octree[AbstractMesh] = js.native
  /**
           * Creates or updates the octree used to boost selection (picking)
           * @see http://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
           * @param maxCapacity defines the maximum capacity per leaf
           * @param maxDepth defines the maximum depth of the octree
           * @returns an octree of AbstractMesh
           */
  def createOrUpdateSelectionOctree(maxCapacity: scala.Double, maxDepth: scala.Double): Octree[AbstractMesh] = js.native
  /**
           * Creates a ray that can be used to pick in the scene
           * @param x defines the x coordinate of the origin (on-screen)
           * @param y defines the y coordinate of the origin (on-screen)
           * @param world defines the world matrix to use if you want to pick in object space (instead of world space)
           * @param camera defines the camera to use for the picking
           * @param cameraViewSpace defines if picking will be done in view space (false by default)
           * @returns a Ray
           */
  def createPickingRay(x: scala.Double, y: scala.Double, world: Matrix, camera: Nullable[Camera]): Ray = js.native
  /**
           * Creates a ray that can be used to pick in the scene
           * @param x defines the x coordinate of the origin (on-screen)
           * @param y defines the y coordinate of the origin (on-screen)
           * @param world defines the world matrix to use if you want to pick in object space (instead of world space)
           * @param camera defines the camera to use for the picking
           * @param cameraViewSpace defines if picking will be done in view space (false by default)
           * @returns a Ray
           */
  def createPickingRay(
    x: scala.Double,
    y: scala.Double,
    world: Matrix,
    camera: Nullable[Camera],
    cameraViewSpace: scala.Boolean
  ): Ray = js.native
  /**
           * Creates a ray that can be used to pick in the scene
           * @param x defines the x coordinate of the origin (on-screen)
           * @param y defines the y coordinate of the origin (on-screen)
           * @param camera defines the camera to use for the picking
           * @returns a Ray
           */
  def createPickingRayInCameraSpace(x: scala.Double, y: scala.Double): Ray = js.native
  /**
           * Creates a ray that can be used to pick in the scene
           * @param x defines the x coordinate of the origin (on-screen)
           * @param y defines the y coordinate of the origin (on-screen)
           * @param camera defines the camera to use for the picking
           * @returns a Ray
           */
  def createPickingRayInCameraSpace(x: scala.Double, y: scala.Double, camera: Camera): Ray = js.native
  /**
           * Creates a ray that can be used to pick in the scene
           * @param x defines the x coordinate of the origin (on-screen)
           * @param y defines the y coordinate of the origin (on-screen)
           * @param result defines the ray where to store the picking ray
           * @param camera defines the camera to use for the picking
           * @returns the current scene
           */
  def createPickingRayInCameraSpaceToRef(x: scala.Double, y: scala.Double, result: Ray): Scene = js.native
  /**
           * Creates a ray that can be used to pick in the scene
           * @param x defines the x coordinate of the origin (on-screen)
           * @param y defines the y coordinate of the origin (on-screen)
           * @param result defines the ray where to store the picking ray
           * @param camera defines the camera to use for the picking
           * @returns the current scene
           */
  def createPickingRayInCameraSpaceToRef(x: scala.Double, y: scala.Double, result: Ray, camera: Camera): Scene = js.native
  /**
           * Creates a ray that can be used to pick in the scene
           * @param x defines the x coordinate of the origin (on-screen)
           * @param y defines the y coordinate of the origin (on-screen)
           * @param world defines the world matrix to use if you want to pick in object space (instead of world space)
           * @param result defines the ray where to store the picking ray
           * @param camera defines the camera to use for the picking
           * @param cameraViewSpace defines if picking will be done in view space (false by default)
           * @returns the current scene
           */
  def createPickingRayToRef(x: scala.Double, y: scala.Double, world: Matrix, result: Ray, camera: Nullable[Camera]): Scene = js.native
  /**
           * Creates a ray that can be used to pick in the scene
           * @param x defines the x coordinate of the origin (on-screen)
           * @param y defines the y coordinate of the origin (on-screen)
           * @param world defines the world matrix to use if you want to pick in object space (instead of world space)
           * @param result defines the ray where to store the picking ray
           * @param camera defines the camera to use for the picking
           * @param cameraViewSpace defines if picking will be done in view space (false by default)
           * @returns the current scene
           */
  def createPickingRayToRef(
    x: scala.Double,
    y: scala.Double,
    world: Matrix,
    result: Ray,
    camera: Nullable[Camera],
    cameraViewSpace: scala.Boolean
  ): Scene = js.native
  /**
           * Deletes a physics compound impostor
           * @param compound defines the compound to delete
           */
  def deleteCompoundImpostor(compound: js.Any): scala.Unit = js.native
  /** Detaches all event handlers*/
  def detachControl(): scala.Unit = js.native
  /**
           * Disables a depth renderer for a given camera
           * @param camera The camera to disable the depth renderer on (default: scene's active camera)
           */
  def disableDepthRenderer(): scala.Unit = js.native
  /**
           * Disables a depth renderer for a given camera
           * @param camera The camera to disable the depth renderer on (default: scene's active camera)
           */
  def disableDepthRenderer(camera: Nullable[Camera]): scala.Unit = js.native
  /**
           * Disables the GeometryBufferRender associated with the scene
           */
  def disableGeometryBufferRenderer(): scala.Unit = js.native
  /**
           * Disables and disposes the physics engine associated with the scene
           */
  def disablePhysicsEngine(): scala.Unit = js.native
  /**
           * Releases all held ressources
           */
  def dispose(): scala.Unit = js.native
  /**
           * Creates a depth renderer a given camera which contains a depth map which can be used for post processing.
           * @param camera The camera to create the depth renderer on (default: scene's active camera)
           * @returns the created depth renderer
           */
  def enableDepthRenderer(): DepthRenderer = js.native
  /**
           * Creates a depth renderer a given camera which contains a depth map which can be used for post processing.
           * @param camera The camera to create the depth renderer on (default: scene's active camera)
           * @returns the created depth renderer
           */
  def enableDepthRenderer(camera: Nullable[Camera]): DepthRenderer = js.native
  /**
           * Enables a GeometryBufferRender and associates it with the scene
           * @param ratio defines the scaling ratio to apply to the renderer (1 by default which means same resolution)
           * @returns the GeometryBufferRenderer
           */
  def enableGeometryBufferRenderer(): Nullable[GeometryBufferRenderer] = js.native
  /**
           * Enables a GeometryBufferRender and associates it with the scene
           * @param ratio defines the scaling ratio to apply to the renderer (1 by default which means same resolution)
           * @returns the GeometryBufferRenderer
           */
  def enableGeometryBufferRenderer(ratio: scala.Double): Nullable[GeometryBufferRenderer] = js.native
  /**
           * Enables physics to the current scene
           * @param gravity defines the scene's gravity for the physics engine
           * @param plugin defines the physics engine to be used. defaults to OimoJS.
           * @return a boolean indicating if the physics engine was initialized
           */
  def enablePhysics(gravity: Nullable[Vector3]): scala.Boolean = js.native
  /**
           * Enables physics to the current scene
           * @param gravity defines the scene's gravity for the physics engine
           * @param plugin defines the physics engine to be used. defaults to OimoJS.
           * @return a boolean indicating if the physics engine was initialized
           */
  def enablePhysics(gravity: Nullable[Vector3], plugin: IPhysicsEnginePlugin): scala.Boolean = js.native
  /**
           * The provided function will run before render once and will be disposed afterwards.
           * A timeout delay can be provided so that the function will be executed in N ms.
           * The timeout is using the browser's native setTimeout so time percision cannot be guaranteed.
           * @param func The function to be executed.
           * @param timeout optional delay in ms
           */
  def executeOnceBeforeRender(func: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
           * The provided function will run before render once and will be disposed afterwards.
           * A timeout delay can be provided so that the function will be executed in N ms.
           * The timeout is using the browser's native setTimeout so time percision cannot be guaranteed.
           * @param func The function to be executed.
           * @param timeout optional delay in ms
           */
  def executeOnceBeforeRender(func: js.Function0[scala.Unit], timeout: scala.Double): scala.Unit = js.native
  /**
           * Registers a function to be executed when the scene is ready
           * @param {Function} func - the function to be executed
           */
  def executeWhenReady(func: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
           * Clear the active meshes smart array preventing retention point in mesh dispose.
           */
  def freeActiveMeshes(): scala.Unit = js.native
  /**
           * Clear the processed materials smart array preventing retention point in material dispose.
           */
  def freeProcessedMaterials(): scala.Unit = js.native
  /**
           * Clear the info related to rendering groups preventing retention points during dispose.
           */
  def freeRenderingGroups(): scala.Unit = js.native
  /**
           * Use this function to stop evaluating active meshes. The current list will be keep alive between frames
           * @returns the current scene
           */
  def freezeActiveMeshes(): Scene = js.native
  /**
           * Freeze all materials
           * A frozen material will not be updatable but should be faster to render
           */
  def freezeMaterials(): scala.Unit = js.native
  /**
           * Gets the total number of active bones rendered per frame
           * @returns the total number of active bones rendered per frame
           */
  def getActiveBones(): scala.Double = js.native
  /**
           * Gets the total number of active indices rendered per frame (You can deduce the number of rendered triangles by dividing this number by 3)
           * @returns the total number of active indices rendered per frame
           */
  def getActiveIndices(): scala.Double = js.native
  /**
           * Lambda returning the list of potentially active meshes.
           */
  def getActiveMeshCandidates(): ISmartArrayLike[AbstractMesh] = js.native
  /**
           * Gets the array of active meshes
           * @returns an array of AbstractMesh
           */
  def getActiveMeshes(): SmartArray[AbstractMesh] = js.native
  /**
           * Gets the total number of active particles rendered per frame
           * @returns the total number of active particles rendered per frame
           */
  def getActiveParticles(): scala.Double = js.native
  /**
           * Lambda returning the list of potentially active sub meshes.
           */
  def getActiveSubMeshCandidates(mesh: AbstractMesh): ISmartArrayLike[SubMesh] = js.native
  /**
           * Gets all animatables associated with a given target
           * @param target defines the target to look animatables for
           * @returns an array of Animatables
           */
  def getAllAnimatablesByTarget(target: js.Any): js.Array[Animatable] = js.native
  /**
           * Gets the animatable associated with a specific target
           * @param target defines the target of the animatable
           * @returns the required animatable if found
           */
  def getAnimatableByTarget(target: js.Any): Nullable[Animatable] = js.native
  /**
           * get an animation group using its name
           * @param name defines the material's name
           * @return the animation group or null if none found.
           */
  def getAnimationGroupByName(name: java.lang.String): Nullable[AnimationGroup] = js.native
  /**
           * Gets the animation ratio (which is 1.0 is the scene renders at 60fps and 2 if the scene renders at 30fps, etc.)
           * @returns a number
           */
  def getAnimationRatio(): scala.Double = js.native
  /**
           * Gets the current auto clear configuration for one rendering group of the rendering
           * manager.
           * @param index the rendering group index to get the information for
           * @returns The auto clear setup for the requested rendering group
           */
  def getAutoClearDepthStencilSetup(index: scala.Double): IRenderingManagerAutoClearSetup = js.native
  /**
           * Gets a bone using its id
           * @param id defines the bone's id
           * @return the bone or null if not found
           */
  def getBoneByID(id: java.lang.String): Nullable[Bone] = js.native
  /**
          * Gets a bone using its id
          * @param name defines the bone's name
          * @return the bone or null if not found
          */
  def getBoneByName(name: java.lang.String): Nullable[Bone] = js.native
  /**
           * Gets the bounding box renderer associated with the scene
           * @returns a BoundingBoxRenderer
           */
  def getBoundingBoxRenderer(): BoundingBoxRenderer = js.native
  /**
           * Gets the cached effect (ie. the latest rendered one)
           * @returns the cached effect
           */
  def getCachedEffect(): Nullable[Effect] = js.native
  /**
           * Gets the cached material (ie. the latest rendered one)
           * @returns the cached material
           */
  def getCachedMaterial(): Nullable[Material] = js.native
  /**
           * Gets the cached visibility state (ie. the latest rendered one)
           * @returns the cached visibility state
           */
  def getCachedVisibility(): Nullable[scala.Double] = js.native
  /**
           * Gets a camera using its id
           * @param id defines the id to look for
           * @returns the camera or null if not found
           */
  def getCameraByID(id: java.lang.String): Nullable[Camera] = js.native
  /**
           * Gets a camera using its name
           * @param name defines the camera's name
           * @return the camera or null if none found.
           */
  def getCameraByName(name: java.lang.String): Nullable[Camera] = js.native
  /**
           * Gets a camera using its unique id
           * @param uniqueId defines the unique id to look for
           * @returns the camera or null if not found
           */
  def getCameraByUniqueID(uniqueId: scala.Double): Nullable[Camera] = js.native
  /**
           * Get a list of cameras by tags
           * @param tagsQuery defines the tags query to use
           * @param forEach defines a predicate used to filter results
           * @returns an array of Camera
           */
  def getCamerasByTags(tagsQuery: java.lang.String): js.Array[Camera] = js.native
  /**
           * Get a list of cameras by tags
           * @param tagsQuery defines the tags query to use
           * @param forEach defines a predicate used to filter results
           * @returns an array of Camera
           */
  def getCamerasByTags(tagsQuery: java.lang.String, forEach: js.Function1[/* camera */ Camera, scala.Unit]): js.Array[Camera] = js.native
  /**
           * Lambda returning the list of potentially colliding sub meshes.
           */
  def getCollidingSubMeshCandidates(mesh: AbstractMesh, collider: Collider): ISmartArrayLike[SubMesh] = js.native
  /**
           * User updatable function that will return a deterministic frame time when engine is in deterministic lock step mode
           */
  def getDeterministicFrameTime(): scala.Double = js.native
  /**
           * Gets the engine associated with the scene
           * @returns an Engine
           */
  def getEngine(): Engine = js.native
  /** @hidden */
  def getEvaluateActiveMeshesDuration(): scala.Double = js.native
  /**
           * Get an externaly attached data from its key
           * @param key the unique key that identifies the data
           * @return the associated data, if present (can be null), or undefined if not present
           */
  def getExternalData[T](key: java.lang.String): Nullable[T] = js.native
  /**
           * Gets an unique Id for the current frame
           * @returns a number
           */
  def getFrameId(): scala.Double = js.native
  /**
           * Gets the list of geometries attached to the scene
           * @returns an array of Geometry
           */
  def getGeometries(): js.Array[Geometry] = js.native
  /**
           * Gets a geometry using its ID
           * @param id defines the geometry's id
           * @return the geometry or null if none found.
           */
  def getGeometryByID(id: java.lang.String): Nullable[Geometry] = js.native
  /** @hidden */
  def getInterFramePerfCounter(): scala.Double = js.native
  /**
           * Gets the internal step used by deterministic lock step
           * @see http://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
           * @returns the internal step
           */
  def getInternalStep(): scala.Double = js.native
  /**
           * Lambda returning the list of potentially intersecting sub meshes.
           */
  def getIntersectingSubMeshCandidates(mesh: AbstractMesh, localRay: Ray): ISmartArrayLike[SubMesh] = js.native
  /**
           * Gets a the last added node (Mesh, Camera, Light) using a given id
           * @param id defines the id to search for
           * @return the found node or null if not found at all
           */
  def getLastEntryByID(id: java.lang.String): Nullable[Node] = js.native
  /** @hidden */
  def getLastFrameDuration(): scala.Double = js.native
  /**
           * Gets a the last added mesh using a given id
           * @param id defines the id to search for
           * @return the found mesh or null if not found at all.
           */
  def getLastMeshByID(id: java.lang.String): Nullable[AbstractMesh] = js.native
  /**
           * Gets a skeleton using a given id (if many are found, this function will pick the last one)
           * @param id defines the id to search for
           * @return the found skeleton or null if not found at all.
           */
  def getLastSkeletonByID(id: java.lang.String): Nullable[Skeleton] = js.native
  /**
           * Gets a light node using its id
           * @param id defines the light's id
           * @return the light or null if none found.
           */
  def getLightByID(id: java.lang.String): Nullable[Light] = js.native
  /**
           * Gets a light node using its name
           * @param name defines the the light's name
           * @return the light or null if none found.
           */
  def getLightByName(name: java.lang.String): Nullable[Light] = js.native
  /**
           * Gets a light node using its scene-generated unique ID
           * @param uniqueId defines the light's unique id
           * @return the light or null if none found.
           */
  def getLightByUniqueID(uniqueId: scala.Double): Nullable[Light] = js.native
  /**
           * Get a list of lights by tags
           * @param tagsQuery defines the tags query to use
           * @param forEach defines a predicate used to filter results
           * @returns an array of Light
           */
  def getLightsByTags(tagsQuery: java.lang.String): js.Array[Light] = js.native
  /**
           * Get a list of lights by tags
           * @param tagsQuery defines the tags query to use
           * @param forEach defines a predicate used to filter results
           * @returns an array of Light
           */
  def getLightsByTags(tagsQuery: java.lang.String, forEach: js.Function1[/* light */ Light, scala.Unit]): js.Array[Light] = js.native
  /**
           * get a material using its id
           * @param id defines the material's ID
           * @return the material or null if none found.
           */
  def getMaterialByID(id: java.lang.String): Nullable[Material] = js.native
  /**
           * Gets a material using its name
           * @param name defines the material's name
           * @return the material or null if none found.
           */
  def getMaterialByName(name: java.lang.String): Nullable[Material] = js.native
  /**
           * Get a list of materials by tags
           * @param tagsQuery defines the tags query to use
           * @param forEach defines a predicate used to filter results
           * @returns an array of Material
           */
  def getMaterialByTags(tagsQuery: java.lang.String): js.Array[Material] = js.native
  /**
           * Get a list of materials by tags
           * @param tagsQuery defines the tags query to use
           * @param forEach defines a predicate used to filter results
           * @returns an array of Material
           */
  def getMaterialByTags(tagsQuery: java.lang.String, forEach: js.Function1[/* material */ Material, scala.Unit]): js.Array[Material] = js.native
  /**
           * Gets the first added mesh found of a given ID
           * @param id defines the id to search for
           * @return the mesh found or null if not found at all
           */
  def getMeshByID(id: java.lang.String): Nullable[AbstractMesh] = js.native
  /**
           * Gets a mesh using a given name
           * @param name defines the name to search for
           * @return the found mesh or null if not found at all.
           */
  def getMeshByName(name: java.lang.String): Nullable[AbstractMesh] = js.native
  /**
           * Gets a mesh with its auto-generated unique id
           * @param uniqueId defines the unique id to search for
           * @return the found mesh or null if not found at all.
           */
  def getMeshByUniqueID(uniqueId: scala.Double): Nullable[AbstractMesh] = js.native
  /**
           * Gets a list of meshes using their id
           * @param id defines the id to search for
           * @returns a list of meshes
           */
  def getMeshesByID(id: java.lang.String): js.Array[AbstractMesh] = js.native
  /**
           * Get a list of meshes by tags
           * @param tagsQuery defines the tags query to use
           * @param forEach defines a predicate used to filter results
           * @returns an array of Mesh
           */
  def getMeshesByTags(tagsQuery: java.lang.String): js.Array[Mesh] = js.native
  /**
           * Get a list of meshes by tags
           * @param tagsQuery defines the tags query to use
           * @param forEach defines a predicate used to filter results
           * @returns an array of Mesh
           */
  def getMeshesByTags(tagsQuery: java.lang.String, forEach: js.Function1[/* mesh */ AbstractMesh, scala.Unit]): js.Array[Mesh] = js.native
  /**
           * Gets a morph target manager  using a given id (if many are found, this function will pick the last one)
           * @param id defines the id to search for
           * @return the found morph target manager or null if not found at all.
           */
  def getMorphTargetManagerById(id: scala.Double): Nullable[MorphTargetManager] = js.native
  /**
           * Gets a node (Mesh, Camera, Light) using a given id
           * @param id defines the id to search for
           * @return the found node or null if not found at all
           */
  def getNodeByID(id: java.lang.String): Nullable[Node] = js.native
  /**
           * Gets a node (Mesh, Camera, Light) using a given name
           * @param name defines the name to search for
           * @return the found node or null if not found at all.
           */
  def getNodeByName(name: java.lang.String): Nullable[Node] = js.native
  /**
           * Get an externaly attached data from its key, create it using a factory if it's not already present
           * @param key the unique key that identifies the data
           * @param factory the factory that will be called to create the instance if and only if it doesn't exists
           * @return the associated data, can be null if the factory returned null.
           */
  def getOrAddExternalDataWithFactory[T](key: java.lang.String, factory: js.Function1[/* k */ java.lang.String, T]): T = js.native
  /**
           * Gets the outline renderer associated with the scene
           * @returns a OutlineRenderer
           */
  def getOutlineRenderer(): OutlineRenderer = js.native
  /**
           * Gets a particle system by id
           * @param id defines the particle system id
           * @return the corresponding system or null if none found
           */
  def getParticleSystemByID(id: java.lang.String): Nullable[IParticleSystem] = js.native
  /** @hidden */
  def getParticlesDuration(): scala.Double = js.native
  /**
           * Gets the current physics engine
           * @returns a IPhysicsEngine or null if none attached
           */
  def getPhysicsEngine(): Nullable[IPhysicsEngine] = js.native
  /**
           * Gets the mesh under the pointer
           * @returns a Mesh or null if no mesh is under the pointer
           */
  def getPointerOverMesh(): Nullable[AbstractMesh] = js.native
  /**
           * Gets the sprite under the pointer
           * @returns a Sprite or null if no sprite is under the pointer
           */
  def getPointerOverSprite(): Nullable[Sprite] = js.native
  /**
           * Gets the current projection matrix
           * @returns a Matrix
           */
  def getProjectionMatrix(): Matrix = js.native
  /** @hidden */
  def getRenderDuration(): scala.Double = js.native
  /**
           * Gets an unique Id for the current render phase
           * @returns a number
           */
  def getRenderId(): scala.Double = js.native
  /** @hidden */
  def getRenderTargetsDuration(): scala.Double = js.native
  /**
           * Gets the uniform buffer used to store scene data
           * @returns a UniformBuffer
           */
  def getSceneUniformBuffer(): UniformBuffer = js.native
  /**
           * Gets a skeleton using a given id (if many are found, this function will pick the first one)
           * @param id defines the id to search for
           * @return the found skeleton or null if not found at all.
           */
  def getSkeletonById(id: java.lang.String): Nullable[Skeleton] = js.native
  /**
           * Gets a skeleton using a given name
           * @param name defines the name to search for
           * @return the found skeleton or null if not found at all.
           */
  def getSkeletonByName(name: java.lang.String): Nullable[Skeleton] = js.native
  /**
           * Gets a sound using a given name
           * @param name defines the name to search for
           * @return the found sound or null if not found at all.
           */
  def getSoundByName(name: java.lang.String): Nullable[Sound] = js.native
  /** @hidden */
  def getSpritesDuration(): scala.Double = js.native
  /**
           * Gets the step Id used by deterministic lock step
           * @see http://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
           * @returns the step Id
           */
  def getStepId(): scala.Double = js.native
  /**
           * Gets the total number of vertices rendered per frame
           * @returns the total number of vertices rendered per frame
           */
  def getTotalVertices(): scala.Double = js.native
  /**
           * Gets the current transform matrix
           * @returns a Matrix made of View * Projection
           */
  def getTransformMatrix(): Matrix = js.native
  /**
           * Gets the first added transform node found of a given ID
           * @param id defines the id to search for
           * @return the found transform node or null if not found at all.
           */
  def getTransformNodeByID(id: java.lang.String): Nullable[TransformNode] = js.native
  /**
           * Gets a transform node using a given name
           * @param name defines the name to search for
           * @return the found transform node or null if not found at all.
           */
  def getTransformNodeByName(name: java.lang.String): Nullable[TransformNode] = js.native
  /**
           * Gets a list of transform nodes using their id
           * @param id defines the id to search for
           * @returns a list of transform nodes
           */
  def getTransformNodesByID(id: java.lang.String): js.Array[TransformNode] = js.native
  /**
           * Gets an unique (relatively to the current scene) Id
           * @returns an unique number for the scene
           */
  def getUniqueId(): scala.Double = js.native
  /**
           * Gets the current view matrix
           * @returns a Matrix
           */
  def getViewMatrix(): Matrix = js.native
  /**
           * Returns the number of items waiting to be loaded
           * @returns the number of items waiting to be loaded
           */
  def getWaitingItemsCount(): scala.Double = js.native
  /**
           * Get the world extend vectors with an optional filter
           *
           * @param filterPredicate the predicate - which meshes should be included when calculating the world size
           * @returns {{ min: Vector3; max: Vector3 }} min and max vectors
           */
  def getWorldExtends(): babylonjsLib.Anon_Max = js.native
  /**
           * Get the world extend vectors with an optional filter
           *
           * @param filterPredicate the predicate - which meshes should be included when calculating the world size
           * @returns {{ min: Vector3; max: Vector3 }} min and max vectors
           */
  def getWorldExtends(filterPredicate: js.Function1[/* mesh */ AbstractMesh, scala.Boolean]): babylonjsLib.Anon_Max = js.native
  /** Call this function if you want to manually increment the render Id*/
  def incrementRenderId(): scala.Unit = js.native
  /**
           * Gets a boolean indicating if the given mesh is active
           * @param mesh defines the mesh to look for
           * @returns true if the mesh is in the active list
           */
  def isActiveMesh(mesh: AbstractMesh): scala.Boolean = js.native
  /**
           * Gets a boolean indicating if the current material / effect / visibility must be bind again
           * @param material defines the current material
           * @param effect defines the current effect
           * @param visibility defines the current visibility state
           * @returns true if one parameter is not cached
           */
  def isCachedMaterialInvalid(material: Material, effect: Effect): scala.Boolean = js.native
  /**
           * Gets a boolean indicating if the current material / effect / visibility must be bind again
           * @param material defines the current material
           * @param effect defines the current effect
           * @param visibility defines the current visibility state
           * @returns true if one parameter is not cached
           */
  def isCachedMaterialInvalid(material: Material, effect: Effect, visibility: scala.Double): scala.Boolean = js.native
  /**
           * Gets a boolean indicating if there is an active physics engine
           * @returns a boolean indicating if there is an active physics engine
           */
  def isPhysicsEnabled(): scala.Boolean = js.native
  /**
           * Gets a boolean indicating if the current pointer event is captured (meaning that the scene has already handled the pointer down)
           * @param pointerId defines the pointer id to use in a multi-touch scenario (0 by default)
           * @returns true if the pointer was captured
           */
  def isPointerCaptured(): scala.Boolean = js.native
  /**
           * Gets a boolean indicating if the current pointer event is captured (meaning that the scene has already handled the pointer down)
           * @param pointerId defines the pointer id to use in a multi-touch scenario (0 by default)
           * @returns true if the pointer was captured
           */
  def isPointerCaptured(pointerId: scala.Double): scala.Boolean = js.native
  /**
           * This function will check if the scene can be rendered (textures are loaded, shaders are compiled)
           * Delay loaded resources are not taking in account
           * @return true if all required resources are ready
           */
  def isReady(): scala.Boolean = js.native
  /**
           * Will flag all materials as dirty to trigger new shader compilation
           * @param flag defines the flag used to specify which material part must be marked as dirty
           * @param predicate If not null, it will be used to specifiy if a material has to be marked as dirty
           */
  def markAllMaterialsAsDirty(flag: scala.Double): scala.Unit = js.native
  /**
           * Will flag all materials as dirty to trigger new shader compilation
           * @param flag defines the flag used to specify which material part must be marked as dirty
           * @param predicate If not null, it will be used to specifiy if a material has to be marked as dirty
           */
  def markAllMaterialsAsDirty(flag: scala.Double, predicate: js.Function1[/* mat */ Material, scala.Boolean]): scala.Unit = js.native
  /**
           * Launch a ray to try to pick a mesh in the scene
           * @param x X position on screen
           * @param y Y position on screen
           * @param predicate Predicate function used to determine eligible meshes. Can be set to null. In this case, a mesh must be enabled, visible and with isPickable set to true
           * @param camera camera to use for computing the picking ray. Can be set to null. In this case, the scene.activeCamera will be used
           * @returns an array of PickingInfo
           */
  def multiPick(x: scala.Double, y: scala.Double): Nullable[js.Array[PickingInfo]] = js.native
  /**
           * Launch a ray to try to pick a mesh in the scene
           * @param x X position on screen
           * @param y Y position on screen
           * @param predicate Predicate function used to determine eligible meshes. Can be set to null. In this case, a mesh must be enabled, visible and with isPickable set to true
           * @param camera camera to use for computing the picking ray. Can be set to null. In this case, the scene.activeCamera will be used
           * @returns an array of PickingInfo
           */
  def multiPick(x: scala.Double, y: scala.Double, predicate: js.Function1[/* mesh */ AbstractMesh, scala.Boolean]): Nullable[js.Array[PickingInfo]] = js.native
  /**
           * Launch a ray to try to pick a mesh in the scene
           * @param x X position on screen
           * @param y Y position on screen
           * @param predicate Predicate function used to determine eligible meshes. Can be set to null. In this case, a mesh must be enabled, visible and with isPickable set to true
           * @param camera camera to use for computing the picking ray. Can be set to null. In this case, the scene.activeCamera will be used
           * @returns an array of PickingInfo
           */
  def multiPick(
    x: scala.Double,
    y: scala.Double,
    predicate: js.Function1[/* mesh */ AbstractMesh, scala.Boolean],
    camera: Camera
  ): Nullable[js.Array[PickingInfo]] = js.native
  /**
           * Launch a ray to try to pick a mesh in the scene
           * @param ray Ray to use
           * @param predicate Predicate function used to determine eligible meshes. Can be set to null. In this case, a mesh must be enabled, visible and with isPickable set to true
           * @returns an array of PickingInfo
           */
  def multiPickWithRay(ray: Ray, predicate: js.Function1[/* mesh */ AbstractMesh, scala.Boolean]): Nullable[js.Array[PickingInfo]] = js.native
  /** Sets a function to be executed when this scene is disposed. */
  def onDispose(): scala.Unit = js.native
  /** Deprecated. Use onPointerObservable instead */
  def onPointerDown(evt: stdLib.PointerEvent, pickInfo: PickingInfo, `type`: PointerEventTypes): scala.Unit = js.native
  /** Deprecated. Use onPointerObservable instead */
  def onPointerMove(evt: stdLib.PointerEvent, pickInfo: PickingInfo, `type`: PointerEventTypes): scala.Unit = js.native
  /** Deprecated. Use onPointerObservable instead */
  def onPointerPick(evt: stdLib.PointerEvent, pickInfo: PickingInfo): scala.Unit = js.native
  /** Deprecated. Use onPointerObservable instead */
  def onPointerUp(evt: stdLib.PointerEvent, pickInfo: Nullable[PickingInfo], `type`: PointerEventTypes): scala.Unit = js.native
  /** Launch a ray to try to pick a mesh in the scene
           * @param x position on screen
           * @param y position on screen
           * @param predicate Predicate function used to determine eligible meshes. Can be set to null. In this case, a mesh must be enabled, visible and with isPickable set to true
           * @param fastCheck Launch a fast check only using the bounding boxes. Can be set to null.
           * @param camera to use for computing the picking ray. Can be set to null. In this case, the scene.activeCamera will be used
           * @returns a PickingInfo
           */
  def pick(x: scala.Double, y: scala.Double): Nullable[PickingInfo] = js.native
  /** Launch a ray to try to pick a mesh in the scene
           * @param x position on screen
           * @param y position on screen
           * @param predicate Predicate function used to determine eligible meshes. Can be set to null. In this case, a mesh must be enabled, visible and with isPickable set to true
           * @param fastCheck Launch a fast check only using the bounding boxes. Can be set to null.
           * @param camera to use for computing the picking ray. Can be set to null. In this case, the scene.activeCamera will be used
           * @returns a PickingInfo
           */
  def pick(x: scala.Double, y: scala.Double, predicate: js.Function1[/* mesh */ AbstractMesh, scala.Boolean]): Nullable[PickingInfo] = js.native
  /** Launch a ray to try to pick a mesh in the scene
           * @param x position on screen
           * @param y position on screen
           * @param predicate Predicate function used to determine eligible meshes. Can be set to null. In this case, a mesh must be enabled, visible and with isPickable set to true
           * @param fastCheck Launch a fast check only using the bounding boxes. Can be set to null.
           * @param camera to use for computing the picking ray. Can be set to null. In this case, the scene.activeCamera will be used
           * @returns a PickingInfo
           */
  def pick(
    x: scala.Double,
    y: scala.Double,
    predicate: js.Function1[/* mesh */ AbstractMesh, scala.Boolean],
    fastCheck: scala.Boolean
  ): Nullable[PickingInfo] = js.native
  /** Launch a ray to try to pick a mesh in the scene
           * @param x position on screen
           * @param y position on screen
           * @param predicate Predicate function used to determine eligible meshes. Can be set to null. In this case, a mesh must be enabled, visible and with isPickable set to true
           * @param fastCheck Launch a fast check only using the bounding boxes. Can be set to null.
           * @param camera to use for computing the picking ray. Can be set to null. In this case, the scene.activeCamera will be used
           * @returns a PickingInfo
           */
  def pick(
    x: scala.Double,
    y: scala.Double,
    predicate: js.Function1[/* mesh */ AbstractMesh, scala.Boolean],
    fastCheck: scala.Boolean,
    camera: Nullable[Camera]
  ): Nullable[PickingInfo] = js.native
  /** Launch a ray to try to pick a sprite in the scene
           * @param x position on screen
           * @param y position on screen
           * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
           * @param fastCheck Launch a fast check only using the bounding boxes. Can be set to null.
           * @param camera camera to use for computing the picking ray. Can be set to null. In this case, the scene.activeCamera will be used
           * @returns a PickingInfo
           */
  def pickSprite(x: scala.Double, y: scala.Double): Nullable[PickingInfo] = js.native
  /** Launch a ray to try to pick a sprite in the scene
           * @param x position on screen
           * @param y position on screen
           * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
           * @param fastCheck Launch a fast check only using the bounding boxes. Can be set to null.
           * @param camera camera to use for computing the picking ray. Can be set to null. In this case, the scene.activeCamera will be used
           * @returns a PickingInfo
           */
  def pickSprite(x: scala.Double, y: scala.Double, predicate: js.Function1[/* sprite */ Sprite, scala.Boolean]): Nullable[PickingInfo] = js.native
  /** Launch a ray to try to pick a sprite in the scene
           * @param x position on screen
           * @param y position on screen
           * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
           * @param fastCheck Launch a fast check only using the bounding boxes. Can be set to null.
           * @param camera camera to use for computing the picking ray. Can be set to null. In this case, the scene.activeCamera will be used
           * @returns a PickingInfo
           */
  def pickSprite(
    x: scala.Double,
    y: scala.Double,
    predicate: js.Function1[/* sprite */ Sprite, scala.Boolean],
    fastCheck: scala.Boolean
  ): Nullable[PickingInfo] = js.native
  /** Launch a ray to try to pick a sprite in the scene
           * @param x position on screen
           * @param y position on screen
           * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
           * @param fastCheck Launch a fast check only using the bounding boxes. Can be set to null.
           * @param camera camera to use for computing the picking ray. Can be set to null. In this case, the scene.activeCamera will be used
           * @returns a PickingInfo
           */
  def pickSprite(
    x: scala.Double,
    y: scala.Double,
    predicate: js.Function1[/* sprite */ Sprite, scala.Boolean],
    fastCheck: scala.Boolean,
    camera: Camera
  ): Nullable[PickingInfo] = js.native
  /** Use the given ray to pick a sprite in the scene
           * @param ray The ray (in world space) to use to pick meshes
           * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
           * @param fastCheck Launch a fast check only using the bounding boxes. Can be set to null.
           * @param camera camera to use. Can be set to null. In this case, the scene.activeCamera will be used
           * @returns a PickingInfo
           */
  def pickSpriteWithRay(ray: Ray): Nullable[PickingInfo] = js.native
  /** Use the given ray to pick a sprite in the scene
           * @param ray The ray (in world space) to use to pick meshes
           * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
           * @param fastCheck Launch a fast check only using the bounding boxes. Can be set to null.
           * @param camera camera to use. Can be set to null. In this case, the scene.activeCamera will be used
           * @returns a PickingInfo
           */
  def pickSpriteWithRay(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, scala.Boolean]): Nullable[PickingInfo] = js.native
  /** Use the given ray to pick a sprite in the scene
           * @param ray The ray (in world space) to use to pick meshes
           * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
           * @param fastCheck Launch a fast check only using the bounding boxes. Can be set to null.
           * @param camera camera to use. Can be set to null. In this case, the scene.activeCamera will be used
           * @returns a PickingInfo
           */
  def pickSpriteWithRay(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, scala.Boolean], fastCheck: scala.Boolean): Nullable[PickingInfo] = js.native
  /** Use the given ray to pick a sprite in the scene
           * @param ray The ray (in world space) to use to pick meshes
           * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
           * @param fastCheck Launch a fast check only using the bounding boxes. Can be set to null.
           * @param camera camera to use. Can be set to null. In this case, the scene.activeCamera will be used
           * @returns a PickingInfo
           */
  def pickSpriteWithRay(
    ray: Ray,
    predicate: js.Function1[/* sprite */ Sprite, scala.Boolean],
    fastCheck: scala.Boolean,
    camera: Camera
  ): Nullable[PickingInfo] = js.native
  /** Use the given ray to pick a mesh in the scene
           * @param ray The ray to use to pick meshes
           * @param predicate Predicate function used to determine eligible meshes. Can be set to null. In this case, a mesh must have isPickable set to true
           * @param fastCheck Launch a fast check only using the bounding boxes. Can be set to null
           * @returns a PickingInfo
           */
  def pickWithRay(ray: Ray): Nullable[PickingInfo] = js.native
  /** Use the given ray to pick a mesh in the scene
           * @param ray The ray to use to pick meshes
           * @param predicate Predicate function used to determine eligible meshes. Can be set to null. In this case, a mesh must have isPickable set to true
           * @param fastCheck Launch a fast check only using the bounding boxes. Can be set to null
           * @returns a PickingInfo
           */
  def pickWithRay(ray: Ray, predicate: js.Function1[/* mesh */ AbstractMesh, scala.Boolean]): Nullable[PickingInfo] = js.native
  /** Use the given ray to pick a mesh in the scene
           * @param ray The ray to use to pick meshes
           * @param predicate Predicate function used to determine eligible meshes. Can be set to null. In this case, a mesh must have isPickable set to true
           * @param fastCheck Launch a fast check only using the bounding boxes. Can be set to null
           * @returns a PickingInfo
           */
  def pickWithRay(
    ray: Ray,
    predicate: js.Function1[/* mesh */ AbstractMesh, scala.Boolean],
    fastCheck: scala.Boolean
  ): Nullable[PickingInfo] = js.native
  /**
           * Gets or sets a predicate used to select candidate meshes for a pointer down event
           */
  def pointerDownPredicate(Mesh: AbstractMesh): scala.Boolean = js.native
  /**
           * Gets or sets a predicate used to select candidate meshes for a pointer move event
           */
  def pointerMovePredicate(Mesh: AbstractMesh): scala.Boolean = js.native
  /**
           * Gets or sets a predicate used to select candidate meshes for a pointer up event
           */
  def pointerUpPredicate(Mesh: AbstractMesh): scala.Boolean = js.native
  /**
           * Add a new geometry to this scene
           * @param geometry defines the geometry to be added to the scene.
           * @param force defines if the geometry must be pushed even if a geometry with this id already exists
           * @return a boolean defining if the geometry was added or not
           */
  def pushGeometry(geometry: Geometry): scala.Boolean = js.native
  /**
           * Add a new geometry to this scene
           * @param geometry defines the geometry to be added to the scene.
           * @param force defines if the geometry must be pushed even if a geometry with this id already exists
           * @return a boolean defining if the geometry was added or not
           */
  def pushGeometry(geometry: Geometry, force: scala.Boolean): scala.Boolean = js.native
  /**
           * Registers a function to be called after every frame render
           * @param func defines the function to register
           */
  def registerAfterRender(func: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
           * Registers a function to be called before every frame render
           * @param func defines the function to register
           */
  def registerBeforeRender(func: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
           * Removes the given action manager from this scene.
           * @param toRemove The action manager to remove
           * @returns The index of the removed action manager
           */
  def removeActionManager(toRemove: ActionManager): scala.Double = js.native
  /**
           * Remove a animation for the list of scene's animations
           * @param toRemove defines the animation to remove
           * @returns the index where the animation was in the animation list
           */
  def removeAnimation(toRemove: Animation): scala.Double = js.native
  /**
           * Removes the given animation group from this scene.
           * @param toRemove The animation group to remove
           * @returns The index of the removed animation group
           */
  def removeAnimationGroup(toRemove: AnimationGroup): scala.Double = js.native
  /**
           * Remove a camera for the list of scene's cameras
           * @param toRemove defines the camera to remove
           * @returns the index where the camera was in the camera list
           */
  def removeCamera(toRemove: Camera): scala.Double = js.native
  /**
           * Remove an externaly attached data from the Engine instance
           * @param key the unique key that identifies the data
           * @return true if the data was successfully removed, false if it doesn't exist
           */
  def removeExternalData(key: java.lang.String): scala.Boolean = js.native
  /**
           * Removes an existing geometry
           * @param geometry defines the geometry to be removed from the scene
           * @return a boolean defining if the geometry was removed or not
           */
  def removeGeometry(geometry: Geometry): scala.Boolean = js.native
  /**
           * Remove a light for the list of scene's lights
           * @param toRemove defines the light to remove
           * @returns the index where the light was in the light list
           */
  def removeLight(toRemove: Light): scala.Double = js.native
  /**
           * Removes the given material from this scene.
           * @param toRemove The material to remove
           * @returns The index of the removed material
           */
  def removeMaterial(toRemove: Material): scala.Double = js.native
  /**
           * Remove a mesh for the list of scene's meshes
           * @param toRemove defines the mesh to remove
           * @param recursive if all child meshes should also be removed from the scene
           * @returns the index where the mesh was in the mesh list
           */
  def removeMesh(toRemove: AbstractMesh): scala.Double = js.native
  /**
           * Remove a mesh for the list of scene's meshes
           * @param toRemove defines the mesh to remove
           * @param recursive if all child meshes should also be removed from the scene
           * @returns the index where the mesh was in the mesh list
           */
  def removeMesh(toRemove: AbstractMesh, recursive: scala.Boolean): scala.Double = js.native
  /**
           * Remove a morph target for the list of scene's morph targets
           * @param toRemove defines the morph target to remove
           * @returns the index where the morph target was in the morph target list
           */
  def removeMorphTargetManager(toRemove: MorphTargetManager): scala.Double = js.native
  /**
           * Removes the given multi-material from this scene.
           * @param toRemove The multi-material to remove
           * @returns The index of the removed multi-material
           */
  def removeMultiMaterial(toRemove: MultiMaterial): scala.Double = js.native
  /**
           * Remove a particle system for the list of scene's particle systems
           * @param toRemove defines the particle system to remove
           * @returns the index where the particle system was in the particle system list
           */
  def removeParticleSystem(toRemove: IParticleSystem): scala.Double = js.native
  /**
           * Remove a skeleton for the list of scene's skeletons
           * @param toRemove defines the skeleton to remove
           * @returns the index where the skeleton was in the skeleton list
           */
  def removeSkeleton(toRemove: Skeleton): scala.Double = js.native
  /**
           * Removes the given texture from this scene.
           * @param toRemove The texture to remove
           * @returns The index of the removed texture
           */
  def removeTexture(toRemove: BaseTexture): scala.Double = js.native
  /**
           * Remove a transform node for the list of scene's transform nodes
           * @param toRemove defines the transform node to remove
           * @returns the index where the transform node was in the transform node list
           */
  def removeTransformNode(toRemove: TransformNode): scala.Double = js.native
  /**
           * Render the scene
           * @param updateCameras defines a boolean indicating if cameras must update according to their inputs (true by default)
           */
  def render(): scala.Unit = js.native
  /**
           * Render the scene
           * @param updateCameras defines a boolean indicating if cameras must update according to their inputs (true by default)
           */
  def render(updateCameras: scala.Boolean): scala.Unit = js.native
  /** Resets all cached information relative to material (including effect and visibility) */
  def resetCachedMaterial(): scala.Unit = js.native
  /**
           * sets the active camera of the scene using its ID
           * @param id defines the camera's ID
           * @return the new active camera or null if none found.
           */
  def setActiveCameraByID(id: java.lang.String): Nullable[Camera] = js.native
  /**
           * sets the active camera of the scene using its name
           * @param name defines the camera's name
           * @returns the new active camera or null if none found.
           */
  def setActiveCameraByName(name: java.lang.String): Nullable[Camera] = js.native
  /**
           * Sets the default candidate providers for the scene.
           * This sets the getActiveMeshCandidates, getActiveSubMeshCandidates, getIntersectingSubMeshCandidates
           * and getCollidingSubMeshCandidates to their default function
           */
  def setDefaultCandidateProviders(): scala.Unit = js.native
  /**
           * Force the value of meshUnderPointer
           * @param mesh defines the mesh to use
           */
  def setPointerOverMesh(mesh: Nullable[AbstractMesh]): scala.Unit = js.native
  /**
           * Force the sprite under the pointer
           * @param sprite defines the sprite to use
           */
  def setPointerOverSprite(sprite: Nullable[Sprite]): scala.Unit = js.native
  /**
           * Specifies whether or not the stencil and depth buffer are cleared between two rendering groups.
           *
           * @param renderingGroupId The rendering group id corresponding to its index
           * @param autoClearDepthStencil Automatically clears depth and stencil between groups if true.
           * @param depth Automatically clears depth between groups if true and autoClear is true.
           * @param stencil Automatically clears stencil between groups if true and autoClear is true.
           */
  def setRenderingAutoClearDepthStencil(renderingGroupId: scala.Double, autoClearDepthStencil: scala.Boolean): scala.Unit = js.native
  /**
           * Specifies whether or not the stencil and depth buffer are cleared between two rendering groups.
           *
           * @param renderingGroupId The rendering group id corresponding to its index
           * @param autoClearDepthStencil Automatically clears depth and stencil between groups if true.
           * @param depth Automatically clears depth between groups if true and autoClear is true.
           * @param stencil Automatically clears stencil between groups if true and autoClear is true.
           */
  def setRenderingAutoClearDepthStencil(renderingGroupId: scala.Double, autoClearDepthStencil: scala.Boolean, depth: scala.Boolean): scala.Unit = js.native
  /**
           * Specifies whether or not the stencil and depth buffer are cleared between two rendering groups.
           *
           * @param renderingGroupId The rendering group id corresponding to its index
           * @param autoClearDepthStencil Automatically clears depth and stencil between groups if true.
           * @param depth Automatically clears depth between groups if true and autoClear is true.
           * @param stencil Automatically clears stencil between groups if true and autoClear is true.
           */
  def setRenderingAutoClearDepthStencil(
    renderingGroupId: scala.Double,
    autoClearDepthStencil: scala.Boolean,
    depth: scala.Boolean,
    stencil: scala.Boolean
  ): scala.Unit = js.native
  /**
           * Overrides the default sort function applied in the renderging group to prepare the meshes.
           * This allowed control for front to back rendering or reversly depending of the special needs.
           *
           * @param renderingGroupId The rendering group id corresponding to its index
           * @param opaqueSortCompareFn The opaque queue comparison function use to sort.
           * @param alphaTestSortCompareFn The alpha test queue comparison function use to sort.
           * @param transparentSortCompareFn The transparent queue comparison function use to sort.
           */
  def setRenderingOrder(renderingGroupId: scala.Double): scala.Unit = js.native
  /**
           * Overrides the default sort function applied in the renderging group to prepare the meshes.
           * This allowed control for front to back rendering or reversly depending of the special needs.
           *
           * @param renderingGroupId The rendering group id corresponding to its index
           * @param opaqueSortCompareFn The opaque queue comparison function use to sort.
           * @param alphaTestSortCompareFn The alpha test queue comparison function use to sort.
           * @param transparentSortCompareFn The transparent queue comparison function use to sort.
           */
  def setRenderingOrder(
    renderingGroupId: scala.Double,
    opaqueSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, scala.Double]]
  ): scala.Unit = js.native
  /**
           * Overrides the default sort function applied in the renderging group to prepare the meshes.
           * This allowed control for front to back rendering or reversly depending of the special needs.
           *
           * @param renderingGroupId The rendering group id corresponding to its index
           * @param opaqueSortCompareFn The opaque queue comparison function use to sort.
           * @param alphaTestSortCompareFn The alpha test queue comparison function use to sort.
           * @param transparentSortCompareFn The transparent queue comparison function use to sort.
           */
  def setRenderingOrder(
    renderingGroupId: scala.Double,
    opaqueSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, scala.Double]],
    alphaTestSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, scala.Double]]
  ): scala.Unit = js.native
  /**
           * Overrides the default sort function applied in the renderging group to prepare the meshes.
           * This allowed control for front to back rendering or reversly depending of the special needs.
           *
           * @param renderingGroupId The rendering group id corresponding to its index
           * @param opaqueSortCompareFn The opaque queue comparison function use to sort.
           * @param alphaTestSortCompareFn The alpha test queue comparison function use to sort.
           * @param transparentSortCompareFn The transparent queue comparison function use to sort.
           */
  def setRenderingOrder(
    renderingGroupId: scala.Double,
    opaqueSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, scala.Double]],
    alphaTestSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, scala.Double]],
    transparentSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, scala.Double]]
  ): scala.Unit = js.native
  /**
           * Sets the step Id used by deterministic lock step
           * @see http://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
           * @param newStepId defines the step Id
           */
  def setStepId(newStepId: scala.Double): scala.Unit = js.native
  /**
           * Sets the current transform matrix
           * @param view defines the View matrix to use
           * @param projection defines the Projection matrix to use
           */
  def setTransformMatrix(view: Matrix, projection: Matrix): scala.Unit = js.native
  /**
           * Use this method to simulate a pointer down on a mesh
           * The pickResult parameter can be obtained from a scene.pick or scene.pickWithRay
           * @param pickResult pickingInfo of the object wished to simulate pointer event on
           * @param pointerEventInit pointer event state to be used when simulating the pointer event (eg. pointer id for multitouch)
           * @returns the current scene
           */
  def simulatePointerDown(pickResult: PickingInfo): Scene = js.native
  /**
           * Use this method to simulate a pointer down on a mesh
           * The pickResult parameter can be obtained from a scene.pick or scene.pickWithRay
           * @param pickResult pickingInfo of the object wished to simulate pointer event on
           * @param pointerEventInit pointer event state to be used when simulating the pointer event (eg. pointer id for multitouch)
           * @returns the current scene
           */
  def simulatePointerDown(pickResult: PickingInfo, pointerEventInit: stdLib.PointerEventInit): Scene = js.native
  /**
           * Use this method to simulate a pointer move on a mesh
           * The pickResult parameter can be obtained from a scene.pick or scene.pickWithRay
           * @param pickResult pickingInfo of the object wished to simulate pointer event on
           * @param pointerEventInit pointer event state to be used when simulating the pointer event (eg. pointer id for multitouch)
           * @returns the current scene
           */
  def simulatePointerMove(pickResult: PickingInfo): Scene = js.native
  /**
           * Use this method to simulate a pointer move on a mesh
           * The pickResult parameter can be obtained from a scene.pick or scene.pickWithRay
           * @param pickResult pickingInfo of the object wished to simulate pointer event on
           * @param pointerEventInit pointer event state to be used when simulating the pointer event (eg. pointer id for multitouch)
           * @returns the current scene
           */
  def simulatePointerMove(pickResult: PickingInfo, pointerEventInit: stdLib.PointerEventInit): Scene = js.native
  /**
           * Use this method to simulate a pointer up on a mesh
           * The pickResult parameter can be obtained from a scene.pick or scene.pickWithRay
           * @param pickResult pickingInfo of the object wished to simulate pointer event on
           * @param pointerEventInit pointer event state to be used when simulating the pointer event (eg. pointer id for multitouch)
           * @returns the current scene
           */
  def simulatePointerUp(pickResult: PickingInfo): Scene = js.native
  /**
           * Use this method to simulate a pointer up on a mesh
           * The pickResult parameter can be obtained from a scene.pick or scene.pickWithRay
           * @param pickResult pickingInfo of the object wished to simulate pointer event on
           * @param pointerEventInit pointer event state to be used when simulating the pointer event (eg. pointer id for multitouch)
           * @returns the current scene
           */
  def simulatePointerUp(pickResult: PickingInfo, pointerEventInit: stdLib.PointerEventInit): Scene = js.native
  /**
           * Sorts the list list based on light priorities
           */
  def sortLightsByPriority(): scala.Unit = js.native
  /**
           * Stops and removes all animations that have been applied to the scene
           */
  def stopAllAnimations(): scala.Unit = js.native
  /**
           * Will stop the animation of the given target
           * @param target - the target
           * @param animationName - the name of the animation to stop (all animations will be stopped if both this and targetMask are empty)
           * @param targetMask - a function that determines if the animation should be stopped based on its target (all animations will be stopped if both this and animationName are empty)
           */
  def stopAnimation(target: js.Any): scala.Unit = js.native
  /**
           * Will stop the animation of the given target
           * @param target - the target
           * @param animationName - the name of the animation to stop (all animations will be stopped if both this and targetMask are empty)
           * @param targetMask - a function that determines if the animation should be stopped based on its target (all animations will be stopped if both this and animationName are empty)
           */
  def stopAnimation(target: js.Any, animationName: java.lang.String): scala.Unit = js.native
  /**
           * Will stop the animation of the given target
           * @param target - the target
           * @param animationName - the name of the animation to stop (all animations will be stopped if both this and targetMask are empty)
           * @param targetMask - a function that determines if the animation should be stopped based on its target (all animations will be stopped if both this and animationName are empty)
           */
  def stopAnimation(
    target: js.Any,
    animationName: java.lang.String,
    targetMask: js.Function1[/* target */ js.Any, scala.Boolean]
  ): scala.Unit = js.native
  /**
           * Switch active camera
           * @param newCamera defines the new active camera
           * @param attachControl defines if attachControl must be called for the new active camera (default: true)
           */
  def switchActiveCamera(newCamera: Camera): scala.Unit = js.native
  /**
           * Switch active camera
           * @param newCamera defines the new active camera
           * @param attachControl defines if attachControl must be called for the new active camera (default: true)
           */
  def switchActiveCamera(newCamera: Camera, attachControl: scala.Boolean): scala.Unit = js.native
  /**
           * Use this function to restart evaluating active meshes on every frame
           * @returns the current scene
           */
  def unfreezeActiveMeshes(): Scene = js.native
  /**
           * Unfreeze all materials
           * A frozen material will not be updatable but should be faster to render
           */
  def unfreezeMaterials(): scala.Unit = js.native
  /**
           * Unregisters a function called after every frame render
           * @param func defines the function to unregister
           */
  def unregisterAfterRender(func: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
           * Unregisters a function called before every frame render
           * @param func defines the function to unregister
           */
  def unregisterBeforeRender(func: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
           * Defines an alternate camera (used mostly in VR-like scenario where two cameras can render the same scene from a slightly different point of view)
           * @param alternateCamera defines the camera to use
           */
  def updateAlternateTransformMatrix(alternateCamera: Camera): scala.Unit = js.native
  /**
           * Update the transform matrix to update from the current active camera
           * @param force defines a boolean used to force the update even if cache is up to date
           */
  def updateTransformMatrix(): scala.Unit = js.native
  /**
           * Update the transform matrix to update from the current active camera
           * @param force defines a boolean used to force the update even if cache is up to date
           */
  def updateTransformMatrix(force: scala.Boolean): scala.Unit = js.native
  /**
           * Returns a promise that resolves when the scene is ready
           * @returns A promise that resolves when the scene is ready
           */
  def whenReadyAsync(): js.Promise[scala.Unit] = js.native
}

/**
     * Represents a scene to be rendered by the engine.
     * @see http://doc.babylonjs.com/features/scene
     */
@JSGlobal("BABYLON.Scene")
@js.native
object Scene extends js.Object {
  /** Time in milliseconds with two consecutive clicks will be considered as a double click */
  var DoubleClickDelay: scala.Double = js.native
  /** The distance in pixel that you have to move to prevent some events */
  var DragMovementThreshold: scala.Double = js.native
  /** If you need to check double click without raising a single click at first click, enable this flag */
  var ExclusiveDoubleClickMode: scala.Boolean = js.native
  /** The fog density is following an exponential function */
  val FOGMODE_EXP: scala.Double = js.native
  /** The fog density is following an exponential function faster than FOGMODE_EXP */
  val FOGMODE_EXP2: scala.Double = js.native
  /** The fog density is following a linear function. */
  val FOGMODE_LINEAR: scala.Double = js.native
  /** The fog is deactivated */
  val FOGMODE_NONE: scala.Double = js.native
  /** Time in milliseconds to wait to raise long press events if button is still pressed */
  var LongPressDelay: scala.Double = js.native
  /**
           * Gets or sets the maximum deltatime when deterministic lock step is enabled
           * @see http://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
           */
  var MaxDeltaTime: scala.Double = js.native
  /**
           * Gets or sets the minimum deltatime when deterministic lock step is enabled
           * @see http://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
           */
  var MinDeltaTime: scala.Double = js.native
  var _uniqueIdCounter: js.Any = js.native
}

