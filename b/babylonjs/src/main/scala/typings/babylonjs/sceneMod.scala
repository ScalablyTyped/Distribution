package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.abstractSceneMod.AbstractScene
import typings.babylonjs.actionsAbstractActionManagerMod.AbstractActionManager
import typings.babylonjs.animationsAnimatableMod.Animatable
import typings.babylonjs.animationsAnimationGroupMod.AnimationGroup
import typings.babylonjs.animationsAnimationMod.Animation
import typings.babylonjs.animationsAnimationPropertiesOverrideMod.AnimationPropertiesOverride
import typings.babylonjs.animationsRuntimeAnimationMod.RuntimeAnimation
import typings.babylonjs.anon.AdditiveAnimations
import typings.babylonjs.anon.Animations
import typings.babylonjs.anon.Max
import typings.babylonjs.anon.PartialIEnvironmentHelper
import typings.babylonjs.audioSoundMod.Sound
import typings.babylonjs.audioSoundTrackMod.SoundTrack
import typings.babylonjs.bonesBoneMod.Bone
import typings.babylonjs.bonesSkeletonMod.Skeleton
import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.camerasVRVrExperienceHelperMod.VRExperienceHelper
import typings.babylonjs.camerasVRVrExperienceHelperMod.VRExperienceHelperOptions
import typings.babylonjs.collisionsColliderMod.Collider
import typings.babylonjs.collisionsCollisionCoordinatorMod.ICollisionCoordinator
import typings.babylonjs.collisionsPickingInfoMod.PickingInfo
import typings.babylonjs.cullingOctreesOctreeMod.Octree
import typings.babylonjs.cullingRayMod.Ray
import typings.babylonjs.cullingRayMod.TrianglePickingPredicate
import typings.babylonjs.debugDebugLayerMod.DebugLayer
import typings.babylonjs.enginesEngineMod.Engine
import typings.babylonjs.eventsDeviceInputEventsMod.IPointerEvent
import typings.babylonjs.eventsKeyboardEventsMod.KeyboardInfo
import typings.babylonjs.eventsKeyboardEventsMod.KeyboardInfoPre
import typings.babylonjs.eventsPointerEventsMod.PointerEventTypes
import typings.babylonjs.eventsPointerEventsMod.PointerInfo
import typings.babylonjs.eventsPointerEventsMod.PointerInfoPre
import typings.babylonjs.gamepadsGamepadManagerMod.GamepadManager
import typings.babylonjs.helpersEnvironmentHelperMod.EnvironmentHelper
import typings.babylonjs.inputsSceneDotinputManagerMod.InputManager
import typings.babylonjs.lightsLightMod.Light
import typings.babylonjs.materialsEffectMod.Effect
import typings.babylonjs.materialsImageProcessingConfigurationMod.ImageProcessingConfiguration
import typings.babylonjs.materialsMaterialMod.Material
import typings.babylonjs.materialsMultiMaterialMod.MultiMaterial
import typings.babylonjs.materialsShaderMaterialMod.ShaderMaterial
import typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture
import typings.babylonjs.materialsTexturesRenderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.materialsUniformBufferMod.UniformBuffer
import typings.babylonjs.mathsMathDotcolorMod.Color3
import typings.babylonjs.mathsMathDotcolorMod.Color4
import typings.babylonjs.mathsMathDotplaneMod.Plane
import typings.babylonjs.mathsMathDotvectorMod.Matrix
import typings.babylonjs.mathsMathDotvectorMod.Quaternion
import typings.babylonjs.mathsMathDotvectorMod.Vector2
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.mathsMathDotvectorMod.Vector4
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.meshesGeometryMod.Geometry
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.meshesMeshSimplificationMod.SimplificationQueue
import typings.babylonjs.meshesSubMeshMod.SubMesh
import typings.babylonjs.meshesTransformNodeMod.TransformNode
import typings.babylonjs.miscFileRequestMod.IFileRequest
import typings.babylonjs.miscFileToolsMod.LoadFileError
import typings.babylonjs.miscFileToolsMod.ReadFileError
import typings.babylonjs.miscFileToolsMod.RequestFileError
import typings.babylonjs.miscInterfacesIClipPlanesHolderMod.IClipPlanesHolder
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.miscPerfCounterMod.PerfCounter
import typings.babylonjs.miscPerformanceViewerPerformanceViewerCollectorMod.PerformanceViewerCollector
import typings.babylonjs.miscSmartArrayMod.ISmartArrayLike
import typings.babylonjs.miscSmartArrayMod.SmartArray
import typings.babylonjs.miscSmartArrayMod.SmartArrayNoDuplicate
import typings.babylonjs.miscWebRequestMod.WebRequest
import typings.babylonjs.morphMorphTargetManagerMod.MorphTargetManager
import typings.babylonjs.morphMorphTargetMod.MorphTarget
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.offlineIofflineproviderMod.IOfflineProvider
import typings.babylonjs.particlesIparticlesystemMod.IParticleSystem
import typings.babylonjs.physicsIphysicsengineMod.IPhysicsEngine
import typings.babylonjs.physicsV1IphysicsenginepluginMod.IPhysicsEnginePlugin
import typings.babylonjs.physicsV2IphysicsenginepluginMod.IPhysicsEnginePluginV2
import typings.babylonjs.postProcessesPostProcessManagerMod.PostProcessManager
import typings.babylonjs.postProcessesPostProcessMod.PostProcess
import typings.babylonjs.postProcessesRenderPipelinePostProcessRenderPipelineManagerMod.PostProcessRenderPipelineManager
import typings.babylonjs.renderingBoundingBoxRendererMod.BoundingBoxRenderer
import typings.babylonjs.renderingDepthPeelingRendererMod.DepthPeelingRenderer
import typings.babylonjs.renderingDepthRendererMod.DepthRenderer
import typings.babylonjs.renderingGeometryBufferRendererMod.GeometryBufferRenderer
import typings.babylonjs.renderingOutlineRendererMod.OutlineRenderer
import typings.babylonjs.renderingRenderingManagerMod.IRenderingManagerAutoClearSetup
import typings.babylonjs.renderingRenderingManagerMod.RenderingGroupInfo
import typings.babylonjs.renderingRenderingManagerMod.RenderingManager
import typings.babylonjs.sceneComponentMod.CameraStageAction
import typings.babylonjs.sceneComponentMod.CameraStageFrameBufferAction
import typings.babylonjs.sceneComponentMod.EvaluateSubMeshStageAction
import typings.babylonjs.sceneComponentMod.ISceneComponent
import typings.babylonjs.sceneComponentMod.ISceneSerializableComponent
import typings.babylonjs.sceneComponentMod.MeshStageAction
import typings.babylonjs.sceneComponentMod.PointerMoveStageAction
import typings.babylonjs.sceneComponentMod.PointerUpDownStageAction
import typings.babylonjs.sceneComponentMod.PreActiveMeshStageAction
import typings.babylonjs.sceneComponentMod.RenderTargetStageAction
import typings.babylonjs.sceneComponentMod.RenderTargetsStageAction
import typings.babylonjs.sceneComponentMod.RenderingGroupStageAction
import typings.babylonjs.sceneComponentMod.RenderingMeshStageAction
import typings.babylonjs.sceneComponentMod.SimpleStageAction
import typings.babylonjs.sceneComponentMod.Stage
import typings.babylonjs.spritesSpriteManagerMod.ISpriteManager
import typings.babylonjs.spritesSpriteMod.Sprite
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.xRWebXRDefaultExperienceMod.WebXRDefaultExperience
import typings.babylonjs.xRWebXRDefaultExperienceMod.WebXRDefaultExperienceOptions
import typings.std.EventTarget
import typings.std.File
import typings.std.PointerEventInit
import typings.std.ProgressEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneMod {
  
  /**
    *
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.babylonjs.animationsAnimatableDotinterfaceMod.IAnimatable because var conflicts: animations. Inlined  */ @JSImport("babylonjs/scene", "Scene")
  @js.native
  open class Scene protected ()
    extends AbstractScene
       with IClipPlanesHolder {
    /**
      * Creates a new Scene
      * @param engine defines the engine to use to render this scene
      * @param options defines the scene options
      */
    def this(engine: Engine) = this()
    def this(engine: Engine, options: SceneOptions) = this()
    
    /** @internal */
    var _activeAnimatables: js.Array[Animatable] = js.native
    
    /** @internal */
    var _activeBones: PerfCounter = js.native
    
    /** @internal */
    var _activeCamera: Nullable[Camera] = js.native
    
    /* private */ var _activeCameras: Any = js.native
    
    /** @internal */
    var _activeIndices: PerfCounter = js.native
    
    /* private */ var _activeMesh: Any = js.native
    
    /* private */ var _activeMeshes: Any = js.native
    
    /** @internal */
    var _activeMeshesFrozen: Boolean = js.native
    
    /** @internal */
    var _activeMeshesFrozenButKeepClipping: Boolean = js.native
    
    /** @internal */
    var _activeParticleSystems: SmartArray[IParticleSystem] = js.native
    
    /** @internal */
    var _activeParticles: PerfCounter = js.native
    
    /* private */ var _activeRequests: Any = js.native
    
    /* private */ var _activeSkeletons: Any = js.native
    
    /**
      * @internal
      * Add a component to the scene.
      * Note that the ccomponent could be registered on th next frame if this is called after
      * the register component stage.
      * @param component Defines the component to add to the scene
      */
    def _addComponent(component: ISceneComponent): Unit = js.native
    
    /**
      * @internal
      */
    def _advancePhysicsEngineStep(step: Double): Unit = js.native
    
    /**
      * @internal
      * Defines the actions happening just after the active camera has been drawn.
      */
    var _afterCameraDrawStage: Stage[CameraStageAction] = js.native
    
    /**
      * @internal
      * Defines the actions happening just after the post processing
      */
    var _afterCameraPostProcessStage: Stage[CameraStageAction] = js.native
    
    /**
      * @internal
      * Defines the actions happening just after rendering all cameras and computing intersections.
      */
    var _afterRenderStage: Stage[SimpleStageAction] = js.native
    
    /**
      * @internal
      * Defines the actions happening just after a render target has been drawn.
      */
    var _afterRenderTargetDrawStage: Stage[RenderTargetStageAction] = js.native
    
    /**
      * Defines the actions happening just after the post processing on a render target
      */
    var _afterRenderTargetPostProcessStage: Stage[RenderTargetStageAction] = js.native
    
    /**
      * @internal
      * Defines the actions happening just after a rendering group has been drawn.
      */
    var _afterRenderingGroupDrawStage: Stage[RenderingGroupStageAction] = js.native
    
    /**
      * @internal
      * Defines the actions happening just after a mesh has been drawn.
      */
    var _afterRenderingMeshStage: Stage[RenderingMeshStageAction] = js.native
    
    /** @internal */
    var _allowPostProcessClearColor: Boolean = js.native
    
    /** @internal */
    def _animate(): Unit = js.native
    
    /* private */ var _animationPropertiesOverride: Any = js.native
    
    /* private */ var _animationRatio: Any = js.native
    
    /** @internal */
    var _animationTime: Double = js.native
    
    /** @internal */
    var _animationTimeLast: Double = js.native
    
    /**
      * @internal
      * Defines the actions happening just before the active camera is drawing.
      */
    var _beforeCameraDrawStage: Stage[CameraStageAction] = js.native
    
    /**
      * @internal
      * Defines the actions happening before camera updates.
      */
    var _beforeCameraUpdateStage: Stage[SimpleStageAction] = js.native
    
    /**
      * @internal
      * Defines the actions happening before clear the canvas.
      */
    var _beforeClearStage: Stage[SimpleStageAction] = js.native
    
    /**
      * @internal
      * Defines the actions happening before evaluate active mesh checks.
      */
    var _beforeEvaluateActiveMeshStage: Stage[SimpleStageAction] = js.native
    
    /**
      * @internal
      * Defines the actions happening before clear the canvas.
      */
    var _beforeRenderTargetClearStage: Stage[RenderTargetStageAction] = js.native
    
    /**
      * @internal
      * Defines the actions happening just before a render target is drawing.
      */
    var _beforeRenderTargetDrawStage: Stage[RenderTargetStageAction] = js.native
    
    /**
      * @internal
      * Defines the actions happening just before a rendering group is drawing.
      */
    var _beforeRenderingGroupDrawStage: Stage[RenderingGroupStageAction] = js.native
    
    /**
      * @internal
      * Defines the actions happening just before a mesh is drawing.
      */
    var _beforeRenderingMeshStage: Stage[RenderingMeshStageAction] = js.native
    
    /* private */ var _bindFrameBuffer: Any = js.native
    
    /** @internal */
    var _blockEntityCollection: Boolean = js.native
    
    /* private */ var _blockMaterialDirtyMechanism: Any = js.native
    
    /** @internal (Backing field) */
    var _boundingBoxRenderer: BoundingBoxRenderer = js.native
    
    /** @internal */
    var _cachedEffect: Nullable[Effect] = js.native
    
    /** @internal */
    var _cachedMaterial: Nullable[Material] = js.native
    
    /** @internal */
    var _cachedRayForTransform: Ray = js.native
    
    /** @internal */
    var _cachedVisibility: Nullable[Double] = js.native
    
    /**
      * @internal
      * Defines the actions happening during the per camera render target step.
      */
    var _cameraDrawRenderTargetStage: Stage[CameraStageFrameBufferAction] = js.native
    
    /* private */ var _checkCameraRenderTarget: Any = js.native
    
    /* private */ var _checkIntersections: Any = js.native
    
    /**
      * @internal
      */
    def _checkIsReady(): Unit = js.native
    def _checkIsReady(checkRenderTargets: Boolean): Unit = js.native
    
    /* private */ var _clear: Any = js.native
    
    /* private */ var _clearFrameBuffer: Any = js.native
    
    /* private */ var _collisionCoordinator: Any = js.native
    
    /**
      * @internal
      * Backing store of defined scene components.
      */
    var _components: js.Array[ISceneComponent] = js.native
    
    /** @internal */
    def _createMultiviewUbo(): Unit = js.native
    
    /* private */ var _createUbo: Any = js.native
    
    /* private */ var _currentInternalStep: Any = js.native
    
    /* private */ var _currentStepId: Any = js.native
    
    /**
      * @internal
      * Backing field
      */
    var _debugLayer: DebugLayer = js.native
    
    /* private */ var _defaultFrameBufferCleared: Any = js.native
    
    /* private */ var _defaultMaterial: Any = js.native
    
    /* private */ var _defaultMeshCandidates: Any = js.native
    
    /* private */ var _defaultSubMeshCandidates: Any = js.native
    
    /** @internal (Backing field) */
    var _depthPeelingRenderer: Nullable[DepthPeelingRenderer] = js.native
    
    /** @internal (Backing field) */
    var _depthRenderer: StringDictionary[DepthRenderer] = js.native
    
    /* private */ var _disposeList: Any = js.native
    
    /** @internal */
    var _edgeRenderLineShader: Nullable[ShaderMaterial] = js.native
    
    /* private */ var _engine: Any = js.native
    
    /* private */ var _evaluateActiveMeshes: Any = js.native
    
    /* private */ var _evaluateSubMesh: Any = js.native
    
    /**
      * @internal
      * Defines the actions happening during the evaluate sub mesh checks.
      */
    var _evaluateSubMeshStage: Stage[EvaluateSubMeshStageAction] = js.native
    
    /* private */ var _executeActiveContainerCleanup: Any = js.native
    
    /* private */ var _executeOnceBeforeRender: Any = js.native
    
    /* private */ var _executeWhenReadyTimeoutId: Any = js.native
    
    /* private */ var _externalData: Any = js.native
    
    /* private */ var _fogEnabled: Any = js.native
    
    /* private */ var _fogMode: Any = js.native
    
    /* private */ var _forcePointsCloud: Any = js.native
    
    /** @internal (Backing field) */
    var _forceShowBoundingBoxes: Boolean = js.native
    
    /* private */ var _forceWireframe: Any = js.native
    
    /** @internal */
    var _forcedViewPosition: Nullable[Vector3] = js.native
    
    /* private */ var _frameId: Any = js.native
    
    /** @internal */
    var _frustumPlanes: js.Array[Plane] = js.native
    
    /** @internal */
    var _gamepadManager: Nullable[GamepadManager] = js.native
    
    /**
      * @internal
      * Defines the actions happening for one camera in the frame.
      */
    var _gatherActiveCameraRenderTargetsStage: Stage[RenderTargetsStageAction] = js.native
    
    /**
      * @internal
      * Defines the actions when collecting render targets for the frame.
      */
    var _gatherRenderTargetsStage: Stage[RenderTargetsStageAction] = js.native
    
    /**
      * an optional map from Geometry Id to Geometry index in the 'geometries' array
      */
    /* private */ var _geometriesByUniqueId: Any = js.native
    
    /** @internal (Backing field) */
    var _geometryBufferRenderer: Nullable[GeometryBufferRenderer] = js.native
    
    /* private */ var _getByTags: Any = js.native
    
    /**
      * @internal
      * Gets a component from the scene.
      * @param name defines the name of the component to retrieve
      * @returns the component or null if not present
      */
    def _getComponent(name: String): Nullable[ISceneComponent] = js.native
    
    /**
      * @internal
      */
    def _getDefaultMeshCandidates(): ISmartArrayLike[AbstractMesh] = js.native
    
    /**
      * @internal
      */
    def _getDefaultSubMeshCandidates(mesh: AbstractMesh): ISmartArrayLike[SubMesh] = js.native
    
    /* private */ var _getGeometryByUniqueId: Any = js.native
    
    /* private */ var _getMaterial: Any = js.native
    
    /** @internal */
    /* protected */ var _imageProcessingConfiguration: ImageProcessingConfiguration = js.native
    
    /** @internal */
    var _inputManager: InputManager = js.native
    
    /* private */ var _intermediateRendering: Any = js.native
    
    /** @internal */
    def _internalMultiPick(rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray]): Nullable[js.Array[PickingInfo]] = js.native
    def _internalMultiPick(
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean]
    ): Nullable[js.Array[PickingInfo]] = js.native
    def _internalMultiPick(
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[js.Array[PickingInfo]] = js.native
    def _internalMultiPick(
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      predicate: Unit,
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[js.Array[PickingInfo]] = js.native
    
    /** @internal */
    def _internalMultiPickSprites(ray: Ray): Nullable[js.Array[PickingInfo]] = js.native
    def _internalMultiPickSprites(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, Boolean]): Nullable[js.Array[PickingInfo]] = js.native
    def _internalMultiPickSprites(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, Boolean], camera: Camera): Nullable[js.Array[PickingInfo]] = js.native
    def _internalMultiPickSprites(ray: Ray, predicate: Unit, camera: Camera): Nullable[js.Array[PickingInfo]] = js.native
    
    /** @internal */
    def _internalPick(rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray]): PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean]
    ): PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      fastCheck: Boolean
    ): PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean
    ): PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate
    ): PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      fastCheck: Boolean,
      onlyBoundingInfo: Unit,
      trianglePredicate: TrianglePickingPredicate
    ): PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      fastCheck: Unit,
      onlyBoundingInfo: Boolean
    ): PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      fastCheck: Unit,
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate
    ): PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      fastCheck: Unit,
      onlyBoundingInfo: Unit,
      trianglePredicate: TrianglePickingPredicate
    ): PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      predicate: Unit,
      fastCheck: Boolean
    ): PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      predicate: Unit,
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean
    ): PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      predicate: Unit,
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate
    ): PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      predicate: Unit,
      fastCheck: Boolean,
      onlyBoundingInfo: Unit,
      trianglePredicate: TrianglePickingPredicate
    ): PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      predicate: Unit,
      fastCheck: Unit,
      onlyBoundingInfo: Boolean
    ): PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      predicate: Unit,
      fastCheck: Unit,
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate
    ): PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      predicate: Unit,
      fastCheck: Unit,
      onlyBoundingInfo: Unit,
      trianglePredicate: TrianglePickingPredicate
    ): PickingInfo = js.native
    
    /** @internal */
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      mesh: AbstractMesh,
      world: Matrix
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: Boolean
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean,
      trianglePredicate: Unit,
      skipBoundingInfo: Boolean
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate,
      skipBoundingInfo: Boolean
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: Boolean,
      onlyBoundingInfo: Unit,
      trianglePredicate: Unit,
      skipBoundingInfo: Boolean
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: Boolean,
      onlyBoundingInfo: Unit,
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: Boolean,
      onlyBoundingInfo: Unit,
      trianglePredicate: TrianglePickingPredicate,
      skipBoundingInfo: Boolean
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: Unit,
      onlyBoundingInfo: Boolean
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: Unit,
      onlyBoundingInfo: Boolean,
      trianglePredicate: Unit,
      skipBoundingInfo: Boolean
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: Unit,
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: Unit,
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate,
      skipBoundingInfo: Boolean
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: Unit,
      onlyBoundingInfo: Unit,
      trianglePredicate: Unit,
      skipBoundingInfo: Boolean
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: Unit,
      onlyBoundingInfo: Unit,
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[PickingInfo],
      rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, Ray],
      mesh: AbstractMesh,
      world: Matrix,
      fastCheck: Unit,
      onlyBoundingInfo: Unit,
      trianglePredicate: TrianglePickingPredicate,
      skipBoundingInfo: Boolean
    ): Nullable[PickingInfo] = js.native
    
    /** @internal */
    def _internalPickSprites(ray: Ray): Nullable[PickingInfo] = js.native
    def _internalPickSprites(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, Boolean]): Nullable[PickingInfo] = js.native
    def _internalPickSprites(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, Boolean], fastCheck: Boolean): Nullable[PickingInfo] = js.native
    def _internalPickSprites(
      ray: Ray,
      predicate: js.Function1[/* sprite */ Sprite, Boolean],
      fastCheck: Boolean,
      camera: Camera
    ): Nullable[PickingInfo] = js.native
    def _internalPickSprites(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, Boolean], fastCheck: Unit, camera: Camera): Nullable[PickingInfo] = js.native
    def _internalPickSprites(ray: Ray, predicate: Unit, fastCheck: Boolean): Nullable[PickingInfo] = js.native
    def _internalPickSprites(ray: Ray, predicate: Unit, fastCheck: Boolean, camera: Camera): Nullable[PickingInfo] = js.native
    def _internalPickSprites(ray: Ray, predicate: Unit, fastCheck: Unit, camera: Camera): Nullable[PickingInfo] = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /** @internal */
    def _isInIntermediateRendering(): Boolean = js.native
    
    /**
      * @internal
      * Defines the actions happening during the per mesh ready checks.
      */
    var _isReadyForMeshStage: Stage[MeshStageAction] = js.native
    
    /** @internal */
    val _isScene: Boolean = js.native
    
    /* private */ var _lightsEnabled: Any = js.native
    
    /**
      * @internal
      */
    def _loadFile(
      fileOrUrl: File | String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.UndefOr[js.Function1[/* ev */ ProgressEvent[EventTarget], Unit]],
      useOfflineSupport: js.UndefOr[Boolean],
      useArrayBuffer: js.UndefOr[Boolean],
      onError: js.UndefOr[
          js.Function2[
            /* request */ js.UndefOr[WebRequest], 
            /* exception */ js.UndefOr[LoadFileError], 
            Unit
          ]
        ],
      onOpened: js.UndefOr[js.Function1[/* request */ WebRequest, Unit]]
    ): IFileRequest = js.native
    
    def _loadFileAsync(fileOrUrl: String): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(fileOrUrl: String, onProgress: js.Function1[/* data */ Any, Unit]): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(fileOrUrl: String, onProgress: js.Function1[/* data */ Any, Unit], useOfflineSupport: Boolean): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(
      fileOrUrl: String,
      onProgress: js.Function1[/* data */ Any, Unit],
      useOfflineSupport: Boolean,
      useArrayBuffer: Boolean
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(
      fileOrUrl: String,
      onProgress: js.Function1[/* data */ Any, Unit],
      useOfflineSupport: Boolean,
      useArrayBuffer: Boolean,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(
      fileOrUrl: String,
      onProgress: js.Function1[/* data */ Any, Unit],
      useOfflineSupport: Boolean,
      useArrayBuffer: Unit,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(
      fileOrUrl: String,
      onProgress: js.Function1[/* data */ Any, Unit],
      useOfflineSupport: Unit,
      useArrayBuffer: Boolean
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(
      fileOrUrl: String,
      onProgress: js.Function1[/* data */ Any, Unit],
      useOfflineSupport: Unit,
      useArrayBuffer: Boolean,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(
      fileOrUrl: String,
      onProgress: js.Function1[/* data */ Any, Unit],
      useOfflineSupport: Unit,
      useArrayBuffer: Unit,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(fileOrUrl: String, onProgress: Unit, useOfflineSupport: Boolean): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(fileOrUrl: String, onProgress: Unit, useOfflineSupport: Boolean, useArrayBuffer: Boolean): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(
      fileOrUrl: String,
      onProgress: Unit,
      useOfflineSupport: Boolean,
      useArrayBuffer: Boolean,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(
      fileOrUrl: String,
      onProgress: Unit,
      useOfflineSupport: Boolean,
      useArrayBuffer: Unit,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(fileOrUrl: String, onProgress: Unit, useOfflineSupport: Unit, useArrayBuffer: Boolean): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(
      fileOrUrl: String,
      onProgress: Unit,
      useOfflineSupport: Unit,
      useArrayBuffer: Boolean,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(
      fileOrUrl: String,
      onProgress: Unit,
      useOfflineSupport: Unit,
      useArrayBuffer: Unit,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    /**
      * @internal
      */
    def _loadFileAsync(fileOrUrl: File): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(fileOrUrl: File, onProgress: js.Function1[/* data */ Any, Unit]): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(fileOrUrl: File, onProgress: js.Function1[/* data */ Any, Unit], useOfflineSupport: Boolean): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(
      fileOrUrl: File,
      onProgress: js.Function1[/* data */ Any, Unit],
      useOfflineSupport: Boolean,
      useArrayBuffer: Boolean
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(
      fileOrUrl: File,
      onProgress: js.Function1[/* data */ Any, Unit],
      useOfflineSupport: Boolean,
      useArrayBuffer: Boolean,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(
      fileOrUrl: File,
      onProgress: js.Function1[/* data */ Any, Unit],
      useOfflineSupport: Boolean,
      useArrayBuffer: Unit,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(
      fileOrUrl: File,
      onProgress: js.Function1[/* data */ Any, Unit],
      useOfflineSupport: Unit,
      useArrayBuffer: Boolean
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(
      fileOrUrl: File,
      onProgress: js.Function1[/* data */ Any, Unit],
      useOfflineSupport: Unit,
      useArrayBuffer: Boolean,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(
      fileOrUrl: File,
      onProgress: js.Function1[/* data */ Any, Unit],
      useOfflineSupport: Unit,
      useArrayBuffer: Unit,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(fileOrUrl: File, onProgress: Unit, useOfflineSupport: Boolean): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(fileOrUrl: File, onProgress: Unit, useOfflineSupport: Boolean, useArrayBuffer: Boolean): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(
      fileOrUrl: File,
      onProgress: Unit,
      useOfflineSupport: Boolean,
      useArrayBuffer: Boolean,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(
      fileOrUrl: File,
      onProgress: Unit,
      useOfflineSupport: Boolean,
      useArrayBuffer: Unit,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(fileOrUrl: File, onProgress: Unit, useOfflineSupport: Unit, useArrayBuffer: Boolean): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(
      fileOrUrl: File,
      onProgress: Unit,
      useOfflineSupport: Unit,
      useArrayBuffer: Boolean,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(
      fileOrUrl: File,
      onProgress: Unit,
      useOfflineSupport: Unit,
      useArrayBuffer: Unit,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    
    /**
      * @internal
      * Backing field
      */
    var _mainSoundTrack: SoundTrack = js.native
    
    /* private */ var _materialsRenderTargets: Any = js.native
    
    /** @internal */
    var _meshUVSpaceRendererShader: Nullable[ShaderMaterial] = js.native
    
    /* private */ var _meshesForIntersections: Any = js.native
    
    /** @internal */
    var _mirroredCameraPosition: Nullable[Vector3] = js.native
    
    /** @internal */
    var _multiviewSceneUbo: Nullable[UniformBuffer] = js.native
    
    /* private */ var _onAfterCameraRenderObserver: Any = js.native
    
    /* private */ var _onAfterRenderObserver: Any = js.native
    
    /* private */ var _onBeforeCameraRenderObserver: Any = js.native
    
    /* private */ var _onBeforeRenderObserver: Any = js.native
    
    /* private */ var _onDisposeObserver: Any = js.native
    
    /** @internal */
    var _outlineRenderer: OutlineRenderer = js.native
    
    /** @internal */
    var _pendingData: js.Array[Any] = js.native
    
    /**
      * Internal perfCollector instance used for sharing between inspector and playground.
      * Marked as protected to allow sharing between prototype extensions, but disallow access at toplevel.
      */
    /* protected */ var _perfCollector: Nullable[PerformanceViewerCollector] = js.native
    
    /* private */ var _performancePriority: Any = js.native
    
    /** @internal (Backing field) */
    var _physicsEngine: Nullable[IPhysicsEngine] = js.native
    
    /** @internal */
    var _physicsTimeAccumulator: Double = js.native
    
    /** @internal */
    var _pickWithRayInverseMatrix: Matrix = js.native
    
    /** @internal */
    var _pickedDownSprite: Nullable[Sprite] = js.native
    
    /** @internal */
    def _pickingAvailable: Boolean = js.native
    
    /**
      * @internal
      * Defines the actions happening when a pointer down event happens.
      */
    var _pointerDownStage: Stage[PointerUpDownStageAction] = js.native
    
    /**
      * @internal
      * Defines the actions happening when a pointer move event happens.
      */
    var _pointerMoveStage: Stage[PointerMoveStageAction] = js.native
    
    /** @internal */
    var _pointerOverSprite: Nullable[Sprite] = js.native
    
    /**
      * @internal
      * Defines the actions happening when a pointer up event happens.
      */
    var _pointerUpStage: Stage[PointerUpDownStageAction] = js.native
    
    /** @internal (Backing field) */
    var _postProcessRenderPipelineManager: PostProcessRenderPipelineManager = js.native
    
    /**
      * @internal
      * Defines the actions happening during the active mesh stage.
      */
    var _preActiveMeshStage: Stage[PreActiveMeshStageAction] = js.native
    
    /* private */ var _preventFreeActiveMeshesAndRenderingGroups: Any = js.native
    
    /** @internal */
    def _processLateAnimationBindings(): Unit = js.native
    
    /** @internal */
    def _processLateAnimationBindingsForMatrices(holder: AdditiveAnimations): Any = js.native
    
    /** @internal */
    def _processLateAnimationBindingsForQuaternions(holder: Animations, refQuaternion: Quaternion): Quaternion = js.native
    
    /* private */ var _processSubCameras: Any = js.native
    
    /* private */ var _processedMaterials: Any = js.native
    
    /** @internal */
    var _projectionMatrix: Matrix = js.native
    
    /* private */ var _projectionUpdateFlag: Any = js.native
    
    /**
      * @internal
      */
    def _readFile(file: File, onSuccess: js.Function1[/* data */ String | js.typedarray.ArrayBuffer, Unit]): IFileRequest = js.native
    def _readFile(
      file: File,
      onSuccess: js.Function1[/* data */ String | js.typedarray.ArrayBuffer, Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Any]
    ): IFileRequest = js.native
    def _readFile(
      file: File,
      onSuccess: js.Function1[/* data */ String | js.typedarray.ArrayBuffer, Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Any],
      useArrayBuffer: Boolean
    ): IFileRequest = js.native
    def _readFile(
      file: File,
      onSuccess: js.Function1[/* data */ String | js.typedarray.ArrayBuffer, Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Any],
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ ReadFileError, Unit]
    ): IFileRequest = js.native
    def _readFile(
      file: File,
      onSuccess: js.Function1[/* data */ String | js.typedarray.ArrayBuffer, Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Any],
      useArrayBuffer: Unit,
      onError: js.Function1[/* error */ ReadFileError, Unit]
    ): IFileRequest = js.native
    def _readFile(
      file: File,
      onSuccess: js.Function1[/* data */ String | js.typedarray.ArrayBuffer, Unit],
      onProgress: Unit,
      useArrayBuffer: Boolean
    ): IFileRequest = js.native
    def _readFile(
      file: File,
      onSuccess: js.Function1[/* data */ String | js.typedarray.ArrayBuffer, Unit],
      onProgress: Unit,
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ ReadFileError, Unit]
    ): IFileRequest = js.native
    def _readFile(
      file: File,
      onSuccess: js.Function1[/* data */ String | js.typedarray.ArrayBuffer, Unit],
      onProgress: Unit,
      useArrayBuffer: Unit,
      onError: js.Function1[/* error */ ReadFileError, Unit]
    ): IFileRequest = js.native
    
    /**
      * @internal
      */
    def _readFileAsync(file: File): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _readFileAsync(file: File, onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Any]): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _readFileAsync(
      file: File,
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Any],
      useArrayBuffer: Boolean
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _readFileAsync(file: File, onProgress: Unit, useArrayBuffer: Boolean): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    
    /** @internal */
    def _rebuildGeometries(): Unit = js.native
    
    /** @internal */
    def _rebuildTextures(): Unit = js.native
    
    /** @internal */
    def _registerTargetForLateAnimationBinding(runtimeAnimation: RuntimeAnimation, originalValue: Any): Unit = js.native
    
    /**
      * Registers the transient components if needed.
      */
    /* private */ var _registerTransientComponents: Any = js.native
    
    /** @internal */
    var _registeredActions: Double = js.native
    
    /** @internal */
    var _registeredForLateAnimationBindings: SmartArrayNoDuplicate[Any] = js.native
    
    /**
      * @internal
      */
    def _renderForCamera(camera: Camera): Unit = js.native
    def _renderForCamera(camera: Camera, rigParent: Unit, bindFrameBuffer: Boolean): Unit = js.native
    def _renderForCamera(camera: Camera, rigParent: Camera): Unit = js.native
    def _renderForCamera(camera: Camera, rigParent: Camera, bindFrameBuffer: Boolean): Unit = js.native
    
    /* private */ var _renderId: Any = js.native
    
    /** @internal */
    def _renderMultiviewToSingleView(camera: Camera): Unit = js.native
    
    /* private */ var _renderTargets: Any = js.native
    
    /* private */ var _renderingManager: Any = js.native
    
    /**
      * @internal
      */
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ]
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit]
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      useOfflineSupport: Boolean
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      useOfflineSupport: Boolean,
      useArrayBuffer: Boolean
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      useOfflineSupport: Boolean,
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ RequestFileError, Unit]
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      useOfflineSupport: Boolean,
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ RequestFileError, Unit],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      useOfflineSupport: Boolean,
      useArrayBuffer: Boolean,
      onError: Unit,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      useOfflineSupport: Boolean,
      useArrayBuffer: Unit,
      onError: js.Function1[/* error */ RequestFileError, Unit]
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      useOfflineSupport: Boolean,
      useArrayBuffer: Unit,
      onError: js.Function1[/* error */ RequestFileError, Unit],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      useOfflineSupport: Boolean,
      useArrayBuffer: Unit,
      onError: Unit,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      useOfflineSupport: Unit,
      useArrayBuffer: Boolean
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      useOfflineSupport: Unit,
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ RequestFileError, Unit]
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      useOfflineSupport: Unit,
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ RequestFileError, Unit],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      useOfflineSupport: Unit,
      useArrayBuffer: Boolean,
      onError: Unit,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      useOfflineSupport: Unit,
      useArrayBuffer: Unit,
      onError: js.Function1[/* error */ RequestFileError, Unit]
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      useOfflineSupport: Unit,
      useArrayBuffer: Unit,
      onError: js.Function1[/* error */ RequestFileError, Unit],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      useOfflineSupport: Unit,
      useArrayBuffer: Unit,
      onError: Unit,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: Unit,
      useOfflineSupport: Boolean
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: Unit,
      useOfflineSupport: Boolean,
      useArrayBuffer: Boolean
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: Unit,
      useOfflineSupport: Boolean,
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ RequestFileError, Unit]
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: Unit,
      useOfflineSupport: Boolean,
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ RequestFileError, Unit],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: Unit,
      useOfflineSupport: Boolean,
      useArrayBuffer: Boolean,
      onError: Unit,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: Unit,
      useOfflineSupport: Boolean,
      useArrayBuffer: Unit,
      onError: js.Function1[/* error */ RequestFileError, Unit]
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: Unit,
      useOfflineSupport: Boolean,
      useArrayBuffer: Unit,
      onError: js.Function1[/* error */ RequestFileError, Unit],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: Unit,
      useOfflineSupport: Boolean,
      useArrayBuffer: Unit,
      onError: Unit,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: Unit,
      useOfflineSupport: Unit,
      useArrayBuffer: Boolean
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: Unit,
      useOfflineSupport: Unit,
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ RequestFileError, Unit]
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: Unit,
      useOfflineSupport: Unit,
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ RequestFileError, Unit],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: Unit,
      useOfflineSupport: Unit,
      useArrayBuffer: Boolean,
      onError: Unit,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: Unit,
      useOfflineSupport: Unit,
      useArrayBuffer: Unit,
      onError: js.Function1[/* error */ RequestFileError, Unit]
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: Unit,
      useOfflineSupport: Unit,
      useArrayBuffer: Unit,
      onError: js.Function1[/* error */ RequestFileError, Unit],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    def _requestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: Unit,
      useOfflineSupport: Unit,
      useArrayBuffer: Unit,
      onError: Unit,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    
    /**
      * @internal
      */
    def _requestFileAsync(url: String): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _requestFileAsync(url: String, onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit]): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _requestFileAsync(
      url: String,
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      useOfflineSupport: Boolean
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _requestFileAsync(
      url: String,
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      useOfflineSupport: Boolean,
      useArrayBuffer: Boolean
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _requestFileAsync(
      url: String,
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      useOfflineSupport: Boolean,
      useArrayBuffer: Boolean,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _requestFileAsync(
      url: String,
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      useOfflineSupport: Boolean,
      useArrayBuffer: Unit,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _requestFileAsync(
      url: String,
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      useOfflineSupport: Unit,
      useArrayBuffer: Boolean
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _requestFileAsync(
      url: String,
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      useOfflineSupport: Unit,
      useArrayBuffer: Boolean,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _requestFileAsync(
      url: String,
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      useOfflineSupport: Unit,
      useArrayBuffer: Unit,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _requestFileAsync(url: String, onProgress: Unit, useOfflineSupport: Boolean): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _requestFileAsync(url: String, onProgress: Unit, useOfflineSupport: Boolean, useArrayBuffer: Boolean): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _requestFileAsync(
      url: String,
      onProgress: Unit,
      useOfflineSupport: Boolean,
      useArrayBuffer: Boolean,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _requestFileAsync(
      url: String,
      onProgress: Unit,
      useOfflineSupport: Boolean,
      useArrayBuffer: Unit,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _requestFileAsync(url: String, onProgress: Unit, useOfflineSupport: Unit, useArrayBuffer: Boolean): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _requestFileAsync(
      url: String,
      onProgress: Unit,
      useOfflineSupport: Unit,
      useArrayBuffer: Boolean,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _requestFileAsync(
      url: String,
      onProgress: Unit,
      useOfflineSupport: Unit,
      useArrayBuffer: Unit,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    
    /* private */ var _sceneUbo: Any = js.native
    
    /**
      * @internal
      * Backing Filed
      */
    var _selectionOctree: Octree[AbstractMesh] = js.native
    
    /**
      * @internal
      * Backing store of defined scene components.
      */
    var _serializableComponents: js.Array[ISceneSerializableComponent] = js.native
    
    /* private */ var _shadowsEnabled: Any = js.native
    
    /** @internal (Backing field) */
    var _simplificationQueue: SimplificationQueue = js.native
    
    /* private */ var _skeletonsEnabled: Any = js.native
    
    /* private */ var _skipEvaluateActiveMeshesCompletely: Any = js.native
    
    /* private */ var _skipFrustumClipping: Any = js.native
    
    /* private */ var _softwareSkinnedMeshes: Any = js.native
    
    /** @internal */
    var _tempPickingRay: Nullable[Ray] = js.native
    
    /** @internal */
    var _tempSpritePickingRay: Nullable[Ray] = js.native
    
    /* private */ var _texturesEnabled: Any = js.native
    
    /* private */ var _timeAccumulator: Any = js.native
    
    /** @internal */
    var _toBeDisposed: js.Array[Nullable[IDisposable]] = js.native
    
    /* private */ var _totalVertices: Any = js.native
    
    /* private */ var _transformMatrix: Any = js.native
    
    /** @internal */
    var _transformMatrixR: Matrix = js.native
    
    /**
      * List of components to register on the next registration step.
      */
    /* private */ var _transientComponents: Any = js.native
    
    /* private */ var _uid: Any = js.native
    
    /* private */ var _unObserveActiveCameras: Any = js.native
    
    /** @internal */
    def _updateMultiviewUbo(): Unit = js.native
    def _updateMultiviewUbo(viewR: Unit, projectionR: Matrix): Unit = js.native
    def _updateMultiviewUbo(viewR: Matrix): Unit = js.native
    def _updateMultiviewUbo(viewR: Matrix, projectionR: Matrix): Unit = js.native
    
    /** @internal */
    var _useOrderIndependentTransparency: Boolean = js.native
    
    /* private */ var _useRightHandedSystem: Any = js.native
    
    /** @internal */
    var _viewMatrix: Matrix = js.native
    
    /* private */ var _viewUpdateFlag: Any = js.native
    
    /**
      * Gets or sets the action manager associated with the scene
      * @see https://doc.babylonjs.com/features/featuresDeepDive/events/actions
      */
    var actionManager: AbstractActionManager = js.native
    
    /**
      * Gets the performance counter for active bones
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/optimize_your_scene#instrumentation
      */
    def activeBonesPerfCounter: PerfCounter = js.native
    
    /** Gets or sets the current active camera */
    def activeCamera: Nullable[Camera] = js.native
    def activeCamera_=(value: Nullable[Camera]): Unit = js.native
    
    /** All of the active cameras added to this scene. */
    def activeCameras: Nullable[js.Array[Camera]] = js.native
    def activeCameras_=(cameras: Nullable[js.Array[Camera]]): Unit = js.native
    
    /**
      * Gets the performance counter for active particles
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/optimize_your_scene#instrumentation
      */
    def activeParticlesPerfCounter: PerfCounter = js.native
    
    /**
      * Adds the given action manager to this scene
      * @deprecated
      * @param newActionManager The action manager to add
      */
    def addActionManager(newActionManager: AbstractActionManager): Unit = js.native
    
    /**
      * Adds the given animation to this scene
      * @param newAnimation The animation to add
      */
    def addAnimation(newAnimation: Animation): Unit = js.native
    
    /**
      * Adds the given animation group to this scene.
      * @param newAnimationGroup The animation group to add
      */
    def addAnimationGroup(newAnimationGroup: AnimationGroup): Unit = js.native
    
    /**
      * Adds the given camera to this scene
      * @param newCamera The camera to add
      */
    def addCamera(newCamera: Camera): Unit = js.native
    
    /**
      * Add an externally attached data from its key.
      * This method call will fail and return false, if such key already exists.
      * If you don't care and just want to get the data no matter what, use the more convenient getOrAddExternalDataWithFactory() method.
      * @param key the unique key that identifies the data
      * @param data the data object to associate to the key for this Engine instance
      * @returns true if no such key were already present and the data was added successfully, false otherwise
      */
    def addExternalData[T /* <: js.Object */](key: String, data: T): Boolean = js.native
    
    /**
      * Adds the given geometry to this scene
      * @param newGeometry The geometry to add
      */
    def addGeometry(newGeometry: Geometry): Unit = js.native
    
    /**
      * Adds the given light to this scene
      * @param newLight The light to add
      */
    def addLight(newLight: Light): Unit = js.native
    
    /**
      * Adds the given material to this scene
      * @param newMaterial The material to add
      */
    def addMaterial(newMaterial: Material): Unit = js.native
    
    /**
      * Add a mesh to the list of scene's meshes
      * @param newMesh defines the mesh to add
      * @param recursive if all child meshes should also be added to the scene
      */
    def addMesh(newMesh: AbstractMesh): Unit = js.native
    def addMesh(newMesh: AbstractMesh, recursive: Boolean): Unit = js.native
    
    /**
      * Adds the given morph target to this scene
      * @param newMorphTargetManager The morph target to add
      */
    def addMorphTargetManager(newMorphTargetManager: MorphTargetManager): Unit = js.native
    
    /**
      * Adds the given multi-material to this scene
      * @param newMultiMaterial The multi-material to add
      */
    def addMultiMaterial(newMultiMaterial: MultiMaterial): Unit = js.native
    
    /**
      * Adds the given particle system to this scene
      * @param newParticleSystem The particle system to add
      */
    def addParticleSystem(newParticleSystem: IParticleSystem): Unit = js.native
    
    /**
      * This function can help adding any object to the list of data awaited to be ready in order to check for a complete scene loading.
      * @param data defines the object to wait for
      */
    def addPendingData(data: Any): Unit = js.native
    
    /**
      * Adds the given skeleton to this scene
      * @param newSkeleton The skeleton to add
      */
    def addSkeleton(newSkeleton: Skeleton): Unit = js.native
    
    /**
      * Adds the given texture to this scene.
      * @param newTexture The texture to add
      */
    def addTexture(newTexture: BaseTexture): Unit = js.native
    
    /**
      * Add a transform node to the list of scene's transform nodes
      * @param newTransformNode defines the transform node to add
      */
    def addTransformNode(newTransformNode: TransformNode): Unit = js.native
    
    /** Sets a function to be executed after rendering a camera*/
    def afterCameraRender_=(callback: js.Function0[Unit]): Unit = js.native
    
    /** Sets a function to be executed after rendering this scene */
    def afterRender_=(callback: Nullable[js.Function0[Unit]]): Unit = js.native
    
    /**
      * Defines the color used to simulate the ambient color (Default is (0, 0, 0))
      */
    var ambientColor: Color3 = js.native
    
    /**
      * Gets all animatable attached to the scene
      */
    def animatables: js.Array[Animatable] = js.native
    
    /** Execute all animations (for a frame) */
    def animate(): Unit = js.native
    
    /**
      * Gets or sets the animation properties override
      */
    def animationPropertiesOverride: Nullable[AnimationPropertiesOverride] = js.native
    def animationPropertiesOverride_=(value: Nullable[AnimationPropertiesOverride]): Unit = js.native
    
    /**
      * Gets or sets a general scale for animation speed
      * @see https://www.babylonjs-playground.com/#IBU2W7#3
      */
    var animationTimeScale: Double = js.native
    
    /**
      * Gets or sets a boolean indicating if animations are enabled
      */
    var animationsEnabled: Boolean = js.native
    
    /**
      * Attach events to the canvas (To handle actionManagers triggers and raise onPointerMove, onPointerDown and onPointerUp
      * @param attachUp defines if you want to attach events to pointerup
      * @param attachDown defines if you want to attach events to pointerdown
      * @param attachMove defines if you want to attach events to pointermove
      */
    def attachControl(): Unit = js.native
    def attachControl(attachUp: Boolean): Unit = js.native
    def attachControl(attachUp: Boolean, attachDown: Boolean): Unit = js.native
    def attachControl(attachUp: Boolean, attachDown: Boolean, attachMove: Boolean): Unit = js.native
    def attachControl(attachUp: Boolean, attachDown: Unit, attachMove: Boolean): Unit = js.native
    def attachControl(attachUp: Unit, attachDown: Boolean): Unit = js.native
    def attachControl(attachUp: Unit, attachDown: Boolean, attachMove: Boolean): Unit = js.native
    def attachControl(attachUp: Unit, attachDown: Unit, attachMove: Boolean): Unit = js.native
    
    /**
      * Gets or sets if audio support is enabled
      * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic
      */
    var audioEnabled: Boolean = js.native
    
    /**
      * Gets or sets custom audio listener position provider
      * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic
      */
    var audioListenerPositionProvider: Nullable[js.Function0[Vector3]] = js.native
    
    /**
      * Gets or sets custom audio listener rotation provider
      * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic
      */
    var audioListenerRotationProvider: Nullable[js.Function0[Vector3]] = js.native
    
    /**
      * Gets or sets a refresh rate when using 3D audio positioning
      */
    var audioPositioningRefreshRate: Double = js.native
    
    /**
      * Gets or sets a boolean that indicates if the scene must clear the render buffer before rendering a frame
      */
    var autoClear: Boolean = js.native
    
    /**
      * Gets or sets a boolean that indicates if the scene must clear the depth and stencil buffers before rendering a frame
      */
    var autoClearDepthAndStencil: Boolean = js.native
    
    /** Sets a function to be executed before rendering a camera*/
    def beforeCameraRender_=(callback: js.Function0[Unit]): Unit = js.native
    
    /** Sets a function to be executed before rendering this scene */
    def beforeRender_=(callback: Nullable[js.Function0[Unit]]): Unit = js.native
    
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
      * @param targetMask defines if the target should be animate if animations are present (this is called recursively on descendant animatables regardless of return value)
      * @param onAnimationLoop defines the callback to call when an animation loops
      * @param isAdditive defines whether the animation should be evaluated additively (false by default)
      * @returns the animatable object created for this animation
      */
    def beginAnimation(
      target: Any,
      from: Double,
      to: Double,
      loop: js.UndefOr[Boolean],
      speedRatio: js.UndefOr[Double],
      onAnimationEnd: js.UndefOr[js.Function0[Unit]],
      animatable: js.UndefOr[Animatable],
      stopCurrent: js.UndefOr[Boolean],
      targetMask: js.UndefOr[js.Function1[/* target */ Any, Boolean]],
      onAnimationLoop: js.UndefOr[js.Function0[Unit]],
      isAdditive: js.UndefOr[Boolean]
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
      * @param onAnimationLoop defines the callback to call when an animation loops
      * @param isAdditive defines whether the animation should be evaluated additively (false by default)
      * @returns the list of created animatables
      */
    def beginDirectAnimation(target: Any, animations: js.Array[Animation], from: Double, to: Double): Animatable = js.native
    def beginDirectAnimation(target: Any, animations: js.Array[Animation], from: Double, to: Double, loop: Boolean): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double
    ): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit]
    ): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit]
    ): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit]
    ): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: Unit,
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit]
    ): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit]
    ): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Unit,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit]
    ): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Unit,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Unit,
      onAnimationEnd: Unit,
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double
    ): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit]
    ): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit]
    ): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit]
    ): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double,
      onAnimationEnd: Unit,
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit]
    ): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit]
    ): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Unit,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit]
    ): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Unit,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Unit,
      onAnimationEnd: Unit,
      onAnimationLoop: Unit,
      isAdditive: Boolean
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
      * @param onAnimationLoop defines the callback to call when an animation loops
      * @param isAdditive defines whether the animation should be evaluated additively (false by default)
      * @returns the list of animatables created for all nodes
      */
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit]
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit]
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit]
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: Unit,
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit]
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit]
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Unit,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit]
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Unit,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Unit,
      onAnimationEnd: Unit,
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit]
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit]
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit]
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double,
      onAnimationEnd: Unit,
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit]
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit]
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Unit,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit]
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Unit,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): js.Array[Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Unit,
      onAnimationEnd: Unit,
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): js.Array[Animatable] = js.native
    
    /**
      * Will start the animation sequence of a given target and its hierarchy
      * @param target defines the target
      * @param directDescendantsOnly if true only direct descendants will be used, if false direct and also indirect (children of children, an so on in a recursive manner) descendants will be used.
      * @param from defines from which frame should animation start
      * @param to defines until which frame should animation run.
      * @param loop defines if the animation loops
      * @param speedRatio defines the speed in which to run the animation (1.0 by default)
      * @param onAnimationEnd defines the function to be executed when the animation ends
      * @param animatable defines an animatable object. If not provided a new one will be created from the given params
      * @param stopCurrent defines if the current animations must be stopped first (true by default)
      * @param targetMask defines if the target should be animated if animations are present (this is called recursively on descendant animatables regardless of return value)
      * @param onAnimationLoop defines the callback to call when an animation loops
      * @param isAdditive defines whether the animation should be evaluated additively (false by default)
      * @returns the list of created animatables
      */
    def beginHierarchyAnimation(
      target: Any,
      directDescendantsOnly: Boolean,
      from: Double,
      to: Double,
      loop: js.UndefOr[Boolean],
      speedRatio: js.UndefOr[Double],
      onAnimationEnd: js.UndefOr[js.Function0[Unit]],
      animatable: js.UndefOr[Animatable],
      stopCurrent: js.UndefOr[Boolean],
      targetMask: js.UndefOr[js.Function1[/* target */ Any, Boolean]],
      onAnimationLoop: js.UndefOr[js.Function0[Unit]],
      isAdditive: js.UndefOr[Boolean]
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
      * @param onAnimationLoop defines the callback to call when an animation loops
      * @param isAdditive defines whether the animation should be evaluated additively (false by default)
      * @returns the animatable object created for this animation
      */
    def beginWeightedAnimation(
      target: Any,
      from: Double,
      to: Double,
      weight: Double,
      loop: js.UndefOr[Boolean],
      speedRatio: js.UndefOr[Double],
      onAnimationEnd: js.UndefOr[js.Function0[Unit]],
      animatable: js.UndefOr[Animatable],
      targetMask: js.UndefOr[js.Function1[/* target */ Any, Boolean]],
      onAnimationLoop: js.UndefOr[js.Function0[Unit]],
      isAdditive: js.UndefOr[Boolean]
    ): Animatable = js.native
    
    /**
      * Bind the current view position to an effect.
      * @param effect The effect to be bound
      * @param variableName name of the shader variable that will hold the eye position
      * @param isVector3 true to indicates that variableName is a Vector3 and not a Vector4
      * @returns the computed eye position
      */
    def bindEyePosition(effect: Nullable[Effect]): Vector4 = js.native
    def bindEyePosition(effect: Nullable[Effect], variableName: String): Vector4 = js.native
    def bindEyePosition(effect: Nullable[Effect], variableName: String, isVector3: Boolean): Vector4 = js.native
    def bindEyePosition(effect: Nullable[Effect], variableName: Unit, isVector3: Boolean): Vector4 = js.native
    
    /** Gets or sets a boolean blocking all the calls to markAllMaterialsAsDirty (ie. the materials won't be updated if they are out of sync) */
    def blockMaterialDirtyMechanism: Boolean = js.native
    def blockMaterialDirtyMechanism_=(value: Boolean): Unit = js.native
    
    /** Gets or sets a boolean blocking all the calls to freeActiveMeshes and freeRenderingGroups
      * It can be used in order to prevent going through methods freeRenderingGroups and freeActiveMeshes several times to improve performance
      * when disposing several meshes in a row or a hierarchy of meshes.
      * When used, it is the responsibility of the user to blockfreeActiveMeshesAndRenderingGroups back to false.
      */
    def blockfreeActiveMeshesAndRenderingGroups: Boolean = js.native
    def blockfreeActiveMeshesAndRenderingGroups_=(value: Boolean): Unit = js.native
    
    /** Define this parameter if you are using multiple cameras and you want to specify which one should be used for pointer position */
    var cameraToUseForPointers: Nullable[Camera] = js.native
    
    /**
      * This function will remove the local cached buffer data from texture.
      * It will save memory but will prevent the texture from being rebuilt
      */
    def cleanCachedTextureBuffer(): Unit = js.native
    
    /**
      * Call this function to reduce memory footprint of the scene.
      * Vertex buffers will not store CPU data anymore (this will prevent picking, collisions or physics to work correctly)
      */
    def clearCachedVertexData(): Unit = js.native
    
    /**
      * Defines the color used to clear the render buffer (Default is (0.2, 0.2, 0.3, 1.0))
      */
    var clearColor: Color4 = js.native
    
    /**
      * Gets or sets the active clipplane 1
      */
    /* CompleteClass */
    var clipPlane: Nullable[typings.babylonjs.mathsMathMod.Plane] = js.native
    
    /**
      * Gets or sets the active clipplane 2
      */
    /* CompleteClass */
    var clipPlane2: Nullable[typings.babylonjs.mathsMathMod.Plane] = js.native
    /**
      * Gets or sets the active clipplane 2
      */
    @JSName("clipPlane2")
    var clipPlane2_Scene: Nullable[Plane] = js.native
    
    /**
      * Gets or sets the active clipplane 3
      */
    /* CompleteClass */
    var clipPlane3: Nullable[typings.babylonjs.mathsMathMod.Plane] = js.native
    /**
      * Gets or sets the active clipplane 3
      */
    @JSName("clipPlane3")
    var clipPlane3_Scene: Nullable[Plane] = js.native
    
    /**
      * Gets or sets the active clipplane 4
      */
    /* CompleteClass */
    var clipPlane4: Nullable[typings.babylonjs.mathsMathMod.Plane] = js.native
    /**
      * Gets or sets the active clipplane 4
      */
    @JSName("clipPlane4")
    var clipPlane4_Scene: Nullable[Plane] = js.native
    
    /**
      * Gets or sets the active clipplane 5
      */
    /* CompleteClass */
    var clipPlane5: Nullable[typings.babylonjs.mathsMathMod.Plane] = js.native
    /**
      * Gets or sets the active clipplane 5
      */
    @JSName("clipPlane5")
    var clipPlane5_Scene: Nullable[Plane] = js.native
    
    /**
      * Gets or sets the active clipplane 6
      */
    /* CompleteClass */
    var clipPlane6: Nullable[typings.babylonjs.mathsMathMod.Plane] = js.native
    /**
      * Gets or sets the active clipplane 6
      */
    @JSName("clipPlane6")
    var clipPlane6_Scene: Nullable[Plane] = js.native
    
    /**
      * Gets or sets the active clipplane 1
      */
    @JSName("clipPlane")
    var clipPlane_Scene: Nullable[Plane] = js.native
    
    /** @internal */
    def collisionCoordinator: ICollisionCoordinator = js.native
    
    /**
      * Gets or sets a boolean indicating if collisions are enabled on this scene
      * @see https://doc.babylonjs.com/features/featuresDeepDive/cameras/camera_collisions
      */
    var collisionsEnabled: Boolean = js.native
    
    /**
      * Gets or sets a boolean indicating if the scene must keep the meshUnderPointer property updated
      * Please note that it requires to run a ray cast through the scene on every frame
      */
    var constantlyUpdateMeshUnderPointer: Boolean = js.native
    
    /**
      * Creates a default camera for the scene.
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/fastBuildWorld#create-default-camera
      * @param createArcRotateCamera has the default false which creates a free camera, when true creates an arc rotate camera
      * @param replace has default false, when true replaces the active camera in the scene
      * @param attachCameraControls has default false, when true attaches camera controls to the canvas.
      */
    def createDefaultCamera(): Unit = js.native
    def createDefaultCamera(createArcRotateCamera: Boolean): Unit = js.native
    def createDefaultCamera(createArcRotateCamera: Boolean, replace: Boolean): Unit = js.native
    def createDefaultCamera(createArcRotateCamera: Boolean, replace: Boolean, attachCameraControls: Boolean): Unit = js.native
    def createDefaultCamera(createArcRotateCamera: Boolean, replace: Unit, attachCameraControls: Boolean): Unit = js.native
    def createDefaultCamera(createArcRotateCamera: Unit, replace: Boolean): Unit = js.native
    def createDefaultCamera(createArcRotateCamera: Unit, replace: Boolean, attachCameraControls: Boolean): Unit = js.native
    def createDefaultCamera(createArcRotateCamera: Unit, replace: Unit, attachCameraControls: Boolean): Unit = js.native
    
    /**
      * Creates a default camera and a default light.
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/fastBuildWorld#create-default-camera-or-light
      * @param createArcRotateCamera has the default false which creates a free camera, when true creates an arc rotate camera
      * @param replace has the default false, when true replaces the active camera/light in the scene
      * @param attachCameraControls has the default false, when true attaches camera controls to the canvas.
      */
    def createDefaultCameraOrLight(): Unit = js.native
    def createDefaultCameraOrLight(createArcRotateCamera: Boolean): Unit = js.native
    def createDefaultCameraOrLight(createArcRotateCamera: Boolean, replace: Boolean): Unit = js.native
    def createDefaultCameraOrLight(createArcRotateCamera: Boolean, replace: Boolean, attachCameraControls: Boolean): Unit = js.native
    def createDefaultCameraOrLight(createArcRotateCamera: Boolean, replace: Unit, attachCameraControls: Boolean): Unit = js.native
    def createDefaultCameraOrLight(createArcRotateCamera: Unit, replace: Boolean): Unit = js.native
    def createDefaultCameraOrLight(createArcRotateCamera: Unit, replace: Boolean, attachCameraControls: Boolean): Unit = js.native
    def createDefaultCameraOrLight(createArcRotateCamera: Unit, replace: Unit, attachCameraControls: Boolean): Unit = js.native
    
    /**
      * Creates a new environment
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/fastBuildWorld#create-default-environment
      * @param options defines the options you can use to configure the environment
      * @returns the new EnvironmentHelper
      */
    def createDefaultEnvironment(): Nullable[EnvironmentHelper] = js.native
    def createDefaultEnvironment(options: PartialIEnvironmentHelper): Nullable[EnvironmentHelper] = js.native
    
    /**
      * Creates a default light for the scene.
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/fastBuildWorld#create-default-light
      * @param replace has the default false, when true replaces the existing lights in the scene with a hemispheric light
      */
    def createDefaultLight(): Unit = js.native
    def createDefaultLight(replace: Boolean): Unit = js.native
    
    /**
      * Creates a new sky box
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/fastBuildWorld#create-default-skybox
      * @param environmentTexture defines the texture to use as environment texture
      * @param pbr has default false which requires the StandardMaterial to be used, when true PBRMaterial must be used
      * @param scale defines the overall scale of the skybox
      * @param blur is only available when pbr is true, default is 0, no blur, maximum value is 1
      * @param setGlobalEnvTexture has default true indicating that scene.environmentTexture must match the current skybox texture
      * @returns a new mesh holding the sky box
      */
    def createDefaultSkybox(): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Boolean): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Boolean, scale: Double): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Boolean, scale: Double, blur: Double): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Boolean, scale: Double, blur: Double, setGlobalEnvTexture: Boolean): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Boolean, scale: Double, blur: Unit, setGlobalEnvTexture: Boolean): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Boolean, scale: Unit, blur: Double): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Boolean, scale: Unit, blur: Double, setGlobalEnvTexture: Boolean): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Boolean, scale: Unit, blur: Unit, setGlobalEnvTexture: Boolean): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Unit, scale: Double): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Unit, scale: Double, blur: Double): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Unit, scale: Double, blur: Double, setGlobalEnvTexture: Boolean): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Unit, scale: Double, blur: Unit, setGlobalEnvTexture: Boolean): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Unit, scale: Unit, blur: Double): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Unit, scale: Unit, blur: Double, setGlobalEnvTexture: Boolean): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Unit, scale: Unit, blur: Unit, setGlobalEnvTexture: Boolean): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: BaseTexture): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: BaseTexture, pbr: Boolean): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: BaseTexture, pbr: Boolean, scale: Double): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: BaseTexture, pbr: Boolean, scale: Double, blur: Double): Nullable[Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: BaseTexture,
      pbr: Boolean,
      scale: Double,
      blur: Double,
      setGlobalEnvTexture: Boolean
    ): Nullable[Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: BaseTexture,
      pbr: Boolean,
      scale: Double,
      blur: Unit,
      setGlobalEnvTexture: Boolean
    ): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: BaseTexture, pbr: Boolean, scale: Unit, blur: Double): Nullable[Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: BaseTexture,
      pbr: Boolean,
      scale: Unit,
      blur: Double,
      setGlobalEnvTexture: Boolean
    ): Nullable[Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: BaseTexture,
      pbr: Boolean,
      scale: Unit,
      blur: Unit,
      setGlobalEnvTexture: Boolean
    ): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: BaseTexture, pbr: Unit, scale: Double): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: BaseTexture, pbr: Unit, scale: Double, blur: Double): Nullable[Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: BaseTexture,
      pbr: Unit,
      scale: Double,
      blur: Double,
      setGlobalEnvTexture: Boolean
    ): Nullable[Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: BaseTexture,
      pbr: Unit,
      scale: Double,
      blur: Unit,
      setGlobalEnvTexture: Boolean
    ): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: BaseTexture, pbr: Unit, scale: Unit, blur: Double): Nullable[Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: BaseTexture,
      pbr: Unit,
      scale: Unit,
      blur: Double,
      setGlobalEnvTexture: Boolean
    ): Nullable[Mesh] = js.native
    def createDefaultSkybox(environmentTexture: BaseTexture, pbr: Unit, scale: Unit, blur: Unit, setGlobalEnvTexture: Boolean): Nullable[Mesh] = js.native
    
    /**
      * Creates a new VREXperienceHelper
      * @see https://doc.babylonjs.com/features/featuresDeepDive/cameras/webVRHelper
      * @param webVROptions defines the options used to create the new VREXperienceHelper
      * @deprecated Please use createDefaultXRExperienceAsync instead
      * @returns a new VREXperienceHelper
      */
    def createDefaultVRExperience(): VRExperienceHelper = js.native
    def createDefaultVRExperience(webVROptions: VRExperienceHelperOptions): VRExperienceHelper = js.native
    
    /**
      * Creates a new WebXRDefaultExperience
      * @see https://doc.babylonjs.com/features/featuresDeepDive/webXR/introToWebXR
      * @param options experience options
      * @returns a promise for a new WebXRDefaultExperience
      */
    def createDefaultXRExperienceAsync(): js.Promise[WebXRDefaultExperience] = js.native
    def createDefaultXRExperienceAsync(options: WebXRDefaultExperienceOptions): js.Promise[WebXRDefaultExperience] = js.native
    
    /**
      * Creates or updates the octree used to boost selection (picking)
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/optimizeOctrees
      * @param maxCapacity defines the maximum capacity per leaf
      * @param maxDepth defines the maximum depth of the octree
      * @returns an octree of AbstractMesh
      */
    def createOrUpdateSelectionOctree(): Octree[AbstractMesh] = js.native
    def createOrUpdateSelectionOctree(maxCapacity: Double): Octree[AbstractMesh] = js.native
    def createOrUpdateSelectionOctree(maxCapacity: Double, maxDepth: Double): Octree[AbstractMesh] = js.native
    def createOrUpdateSelectionOctree(maxCapacity: Unit, maxDepth: Double): Octree[AbstractMesh] = js.native
    
    /**
      * Creates a ray that can be used to pick in the scene
      * @param x defines the x coordinate of the origin (on-screen)
      * @param y defines the y coordinate of the origin (on-screen)
      * @param world defines the world matrix to use if you want to pick in object space (instead of world space)
      * @param camera defines the camera to use for the picking
      * @param cameraViewSpace defines if picking will be done in view space (false by default)
      * @returns a Ray
      */
    def createPickingRay(x: Double, y: Double, world: Nullable[Matrix], camera: Nullable[Camera]): Ray = js.native
    def createPickingRay(x: Double, y: Double, world: Nullable[Matrix], camera: Nullable[Camera], cameraViewSpace: Boolean): Ray = js.native
    
    /**
      * Creates a ray that can be used to pick in the scene
      * @param x defines the x coordinate of the origin (on-screen)
      * @param y defines the y coordinate of the origin (on-screen)
      * @param camera defines the camera to use for the picking
      * @returns a Ray
      */
    def createPickingRayInCameraSpace(x: Double, y: Double): Ray = js.native
    def createPickingRayInCameraSpace(x: Double, y: Double, camera: Camera): Ray = js.native
    
    /**
      * Creates a ray that can be used to pick in the scene
      * @param x defines the x coordinate of the origin (on-screen)
      * @param y defines the y coordinate of the origin (on-screen)
      * @param result defines the ray where to store the picking ray
      * @param camera defines the camera to use for the picking
      * @returns the current scene
      */
    def createPickingRayInCameraSpaceToRef(x: Double, y: Double, result: Ray): Scene = js.native
    def createPickingRayInCameraSpaceToRef(x: Double, y: Double, result: Ray, camera: Camera): Scene = js.native
    
    /**
      * Creates a ray that can be used to pick in the scene
      * @param x defines the x coordinate of the origin (on-screen)
      * @param y defines the y coordinate of the origin (on-screen)
      * @param world defines the world matrix to use if you want to pick in object space (instead of world space)
      * @param result defines the ray where to store the picking ray
      * @param camera defines the camera to use for the picking
      * @param cameraViewSpace defines if picking will be done in view space (false by default)
      * @param enableDistantPicking defines if picking should handle large values for mesh position/scaling (false by default)
      * @returns the current scene
      */
    def createPickingRayToRef(x: Double, y: Double, world: Nullable[Matrix], result: Ray, camera: Nullable[Camera]): Scene = js.native
    def createPickingRayToRef(
      x: Double,
      y: Double,
      world: Nullable[Matrix],
      result: Ray,
      camera: Nullable[Camera],
      cameraViewSpace: Boolean
    ): Scene = js.native
    def createPickingRayToRef(
      x: Double,
      y: Double,
      world: Nullable[Matrix],
      result: Ray,
      camera: Nullable[Camera],
      cameraViewSpace: Boolean,
      enableDistantPicking: Boolean
    ): Scene = js.native
    def createPickingRayToRef(
      x: Double,
      y: Double,
      world: Nullable[Matrix],
      result: Ray,
      camera: Nullable[Camera],
      cameraViewSpace: Unit,
      enableDistantPicking: Boolean
    ): Scene = js.native
    
    /**
      * Creates a scene UBO
      * @param name name of the uniform buffer (optional, for debugging purpose only)
      * @returns a new ubo
      */
    def createSceneUniformBuffer(): UniformBuffer = js.native
    def createSceneUniformBuffer(name: String): UniformBuffer = js.native
    
    /**
      * Gets or sets a user defined funtion to select LOD from a mesh and a camera.
      * By default this function is undefined and Babylon.js will select LOD based on distance to camera
      */
    def customLODSelector(mesh: AbstractMesh, camera: Camera): Nullable[AbstractMesh] = js.native
    
    /**
      * The list of user defined render targets added to the scene
      */
    var customRenderTargets: js.Array[RenderTargetTexture] = js.native
    
    /**
      * Gets the debug layer (aka Inspector) associated with the scene
      * @see https://doc.babylonjs.com/toolsAndResources/inspector
      */
    var debugLayer: DebugLayer = js.native
    
    /**
      * Defines the HTML default cursor to use (empty by default)
      */
    var defaultCursor: String = js.native
    
    /** The default material used on meshes when no material is affected */
    def defaultMaterial: Material = js.native
    /** The default material used on meshes when no material is affected */
    def defaultMaterial_=(value: Material): Unit = js.native
    
    /**
      * Deletes a physics compound impostor
      * @param compound defines the compound to delete
      */
    def deleteCompoundImpostor(compound: Any): Unit = js.native
    
    /**
      * Gets the current delta time used by animation engine
      */
    var deltaTime: Double = js.native
    
    /**
      * The depth peeling renderer
      */
    var depthPeelingRenderer: Nullable[DepthPeelingRenderer] = js.native
    
    /** Detaches all event handlers*/
    def detachControl(): Unit = js.native
    
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
      * Use this array to add regular expressions used to disable offline support for specific urls
      */
    var disableOfflineSupportExceptionRules: js.Array[js.RegExp] = js.native
    
    /**
      * Disables and disposes the physics engine associated with the scene
      */
    def disablePhysicsEngine(): Unit = js.native
    
    /**
      * Gets or sets a boolean indicating that all submeshes of active meshes must be rendered
      * Use this boolean to avoid computing frustum clipping on submeshes (This could help when you are CPU bound)
      */
    var dispatchAllSubMeshesOfActiveMeshes: Boolean = js.native
    
    /**
      * Releases all held resources
      */
    def dispose(): Unit = js.native
    
    /**
      * Defines whether cursors are handled by the scene.
      */
    var doNotHandleCursors: Boolean = js.native
    
    /**
      * Gets or sets a boolean indicating if next render targets must be dumped as image for debugging purposes
      * We recommend not using it and instead rely on Spector.js: http://spector.babylonjs.com
      */
    var dumpNextRenderTargets: Boolean = js.native
    
    /**
      * Creates a depth renderer a given camera which contains a depth map which can be used for post processing.
      * @param camera The camera to create the depth renderer on (default: scene's active camera)
      * @param storeNonLinearDepth Defines whether the depth is stored linearly like in Babylon Shadows or directly like glFragCoord.z
      * @param force32bitsFloat Forces 32 bits float when supported (else 16 bits float is prioritized over 32 bits float if supported)
      * @param samplingMode The sampling mode to be used with the render target (Linear, Nearest...)
      * @param storeCameraSpaceZ Defines whether the depth stored is the Z coordinate in camera space. If true, storeNonLinearDepth has no effect. (Default: false)
      * @returns the created depth renderer
      */
    def enableDepthRenderer(): DepthRenderer = js.native
    def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Boolean): DepthRenderer = js.native
    def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Boolean, force32bitsFloat: Boolean): DepthRenderer = js.native
    def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Boolean, force32bitsFloat: Boolean, samplingMode: Double): DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Unit,
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Boolean,
      samplingMode: Double,
      storeCameraSpaceZ: Boolean
    ): DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Unit,
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Boolean,
      samplingMode: Unit,
      storeCameraSpaceZ: Boolean
    ): DepthRenderer = js.native
    def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Boolean, force32bitsFloat: Unit, samplingMode: Double): DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Unit,
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Unit,
      samplingMode: Double,
      storeCameraSpaceZ: Boolean
    ): DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Unit,
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Unit,
      samplingMode: Unit,
      storeCameraSpaceZ: Boolean
    ): DepthRenderer = js.native
    def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Unit, force32bitsFloat: Boolean): DepthRenderer = js.native
    def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Unit, force32bitsFloat: Boolean, samplingMode: Double): DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Unit,
      storeNonLinearDepth: Unit,
      force32bitsFloat: Boolean,
      samplingMode: Double,
      storeCameraSpaceZ: Boolean
    ): DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Unit,
      storeNonLinearDepth: Unit,
      force32bitsFloat: Boolean,
      samplingMode: Unit,
      storeCameraSpaceZ: Boolean
    ): DepthRenderer = js.native
    def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Unit, force32bitsFloat: Unit, samplingMode: Double): DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Unit,
      storeNonLinearDepth: Unit,
      force32bitsFloat: Unit,
      samplingMode: Double,
      storeCameraSpaceZ: Boolean
    ): DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Unit,
      storeNonLinearDepth: Unit,
      force32bitsFloat: Unit,
      samplingMode: Unit,
      storeCameraSpaceZ: Boolean
    ): DepthRenderer = js.native
    def enableDepthRenderer(camera: Nullable[Camera]): DepthRenderer = js.native
    def enableDepthRenderer(camera: Nullable[Camera], storeNonLinearDepth: Boolean): DepthRenderer = js.native
    def enableDepthRenderer(camera: Nullable[Camera], storeNonLinearDepth: Boolean, force32bitsFloat: Boolean): DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[Camera],
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Boolean,
      samplingMode: Double
    ): DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[Camera],
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Boolean,
      samplingMode: Double,
      storeCameraSpaceZ: Boolean
    ): DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[Camera],
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Boolean,
      samplingMode: Unit,
      storeCameraSpaceZ: Boolean
    ): DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[Camera],
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Unit,
      samplingMode: Double
    ): DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[Camera],
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Unit,
      samplingMode: Double,
      storeCameraSpaceZ: Boolean
    ): DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[Camera],
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Unit,
      samplingMode: Unit,
      storeCameraSpaceZ: Boolean
    ): DepthRenderer = js.native
    def enableDepthRenderer(camera: Nullable[Camera], storeNonLinearDepth: Unit, force32bitsFloat: Boolean): DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[Camera],
      storeNonLinearDepth: Unit,
      force32bitsFloat: Boolean,
      samplingMode: Double
    ): DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[Camera],
      storeNonLinearDepth: Unit,
      force32bitsFloat: Boolean,
      samplingMode: Double,
      storeCameraSpaceZ: Boolean
    ): DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[Camera],
      storeNonLinearDepth: Unit,
      force32bitsFloat: Boolean,
      samplingMode: Unit,
      storeCameraSpaceZ: Boolean
    ): DepthRenderer = js.native
    def enableDepthRenderer(camera: Nullable[Camera], storeNonLinearDepth: Unit, force32bitsFloat: Unit, samplingMode: Double): DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[Camera],
      storeNonLinearDepth: Unit,
      force32bitsFloat: Unit,
      samplingMode: Double,
      storeCameraSpaceZ: Boolean
    ): DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[Camera],
      storeNonLinearDepth: Unit,
      force32bitsFloat: Unit,
      samplingMode: Unit,
      storeCameraSpaceZ: Boolean
    ): DepthRenderer = js.native
    
    /**
      * Enables a GeometryBufferRender and associates it with the scene
      * @param ratio defines the scaling ratio to apply to the renderer (1 by default which means same resolution)
      * @param depthFormat Format of the depth texture (default: Constants.TEXTUREFORMAT_DEPTH16)
      * @returns the GeometryBufferRenderer
      */
    def enableGeometryBufferRenderer(): Nullable[GeometryBufferRenderer] = js.native
    def enableGeometryBufferRenderer(ratio: Double): Nullable[GeometryBufferRenderer] = js.native
    def enableGeometryBufferRenderer(ratio: Double, depthFormat: Double): Nullable[GeometryBufferRenderer] = js.native
    def enableGeometryBufferRenderer(ratio: Unit, depthFormat: Double): Nullable[GeometryBufferRenderer] = js.native
    
    /**
      * Enables physics to the current scene
      * @param gravity defines the scene's gravity for the physics engine. defaults to real earth gravity : (0, -9.81, 0)
      * @param plugin defines the physics engine to be used. defaults to CannonJS.
      * @returns a boolean indicating if the physics engine was initialized
      */
    def enablePhysics(): Boolean = js.native
    def enablePhysics(gravity: Unit, plugin: IPhysicsEnginePlugin): Boolean = js.native
    def enablePhysics(gravity: Unit, plugin: IPhysicsEnginePluginV2): Boolean = js.native
    def enablePhysics(gravity: Nullable[Vector3]): Boolean = js.native
    def enablePhysics(gravity: Nullable[Vector3], plugin: IPhysicsEnginePlugin): Boolean = js.native
    def enablePhysics(gravity: Nullable[Vector3], plugin: IPhysicsEnginePluginV2): Boolean = js.native
    
    /**
      * This is use to store the default BRDF lookup for PBR materials in your scene.
      * It should only be one of the following (if not the default embedded one):
      * * For uncorrelated BRDF (pbr.brdf.useEnergyConservation = false and pbr.brdf.useSmithVisibilityHeightCorrelated = false) : https://assets.babylonjs.com/environments/uncorrelatedBRDF.dds
      * * For correlated BRDF (pbr.brdf.useEnergyConservation = false and pbr.brdf.useSmithVisibilityHeightCorrelated = true) : https://assets.babylonjs.com/environments/correlatedBRDF.dds
      * * For correlated multi scattering BRDF (pbr.brdf.useEnergyConservation = true and pbr.brdf.useSmithVisibilityHeightCorrelated = true) : https://assets.babylonjs.com/environments/correlatedMSBRDF.dds
      * The material properties need to be setup according to the type of texture in use.
      */
    var environmentBRDFTexture: BaseTexture = js.native
    
    /**
      * Intensity of the environment in all pbr material.
      * This dims or reinforces the IBL lighting overall (reflection and diffuse).
      * As in the majority of the scene they are the same (exception for multi room and so on),
      * this is easier to reference from here than from all the materials.
      */
    var environmentIntensity: Double = js.native
    
    /**
      * The provided function will run before render once and will be disposed afterwards.
      * A timeout delay can be provided so that the function will be executed in N ms.
      * The timeout is using the browser's native setTimeout so time percision cannot be guaranteed.
      * @param func The function to be executed.
      * @param timeout optional delay in ms
      */
    def executeOnceBeforeRender(func: js.Function0[Unit]): Unit = js.native
    def executeOnceBeforeRender(func: js.Function0[Unit], timeout: Double): Unit = js.native
    
    /**
      * Registers a function to be executed when the scene is ready
      * @param func - the function to be executed
      * @param checkRenderTargets true to also check that the meshes rendered as part of a render target are ready (default: false)
      */
    def executeWhenReady(func: js.Function0[Unit]): Unit = js.native
    def executeWhenReady(func: js.Function0[Unit], checkRenderTargets: Boolean): Unit = js.native
    
    /**
      * Update the scene ubo before it can be used in rendering processing
      * @returns the scene UniformBuffer
      */
    def finalizeSceneUbo(): UniformBuffer = js.native
    
    /**
      * Gets or sets the fog color to use
      * @see https://doc.babylonjs.com/features/featuresDeepDive/environment/environment_introduction#fog
      * (Default is Color3(0.2, 0.2, 0.3))
      */
    var fogColor: Color3 = js.native
    
    /**
      * Gets or sets the fog density to use
      * @see https://doc.babylonjs.com/features/featuresDeepDive/environment/environment_introduction#fog
      * (Default is 0.1)
      */
    var fogDensity: Double = js.native
    
    def fogEnabled: Boolean = js.native
    /**
      * Gets or sets a boolean indicating if fog is enabled on this scene
      * @see https://doc.babylonjs.com/features/featuresDeepDive/environment/environment_introduction#fog
      * (Default is true)
      */
    def fogEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Gets or sets the fog end distance to use
      * @see https://doc.babylonjs.com/features/featuresDeepDive/environment/environment_introduction#fog
      * (Default is 1000)
      */
    var fogEnd: Double = js.native
    
    def fogMode: Double = js.native
    /**
      * Gets or sets the fog mode to use
      * @see https://doc.babylonjs.com/features/featuresDeepDive/environment/environment_introduction#fog
      * | mode | value |
      * | --- | --- |
      * | FOGMODE_NONE | 0 |
      * | FOGMODE_EXP | 1 |
      * | FOGMODE_EXP2 | 2 |
      * | FOGMODE_LINEAR | 3 |
      */
    def fogMode_=(value: Double): Unit = js.native
    
    /**
      * Gets or sets the fog start distance to use
      * @see https://doc.babylonjs.com/features/featuresDeepDive/environment/environment_introduction#fog
      * (Default is 0)
      */
    var fogStart: Double = js.native
    
    def forcePointsCloud: Boolean = js.native
    /**
      * Gets or sets a boolean indicating if all rendering must be done in point cloud
      */
    def forcePointsCloud_=(value: Boolean): Unit = js.native
    
    /**
      * Gets or sets a boolean indicating if all bounding boxes must be rendered
      */
    var forceShowBoundingBoxes: Boolean = js.native
    
    def forceWireframe: Boolean = js.native
    /**
      * Gets or sets a boolean indicating if all rendering must be done in wireframe
      */
    def forceWireframe_=(value: Boolean): Unit = js.native
    
    /**
      * Clear the active meshes smart array preventing retention point in mesh dispose.
      */
    def freeActiveMeshes(): Unit = js.native
    
    /**
      * Clear the processed materials smart array preventing retention point in material dispose.
      */
    def freeProcessedMaterials(): Unit = js.native
    
    /**
      * Clear the info related to rendering groups preventing retention points during dispose.
      */
    def freeRenderingGroups(): Unit = js.native
    
    /**
      * Use this function to stop evaluating active meshes. The current list will be keep alive between frames
      * @param skipEvaluateActiveMeshes defines an optional boolean indicating that the evaluate active meshes step must be completely skipped
      * @param onSuccess optional success callback
      * @param onError optional error callback
      * @param freezeMeshes defines if meshes should be frozen (true by default)
      * @param keepFrustumCulling defines if you want to keep running the frustum clipping (false by default)
      * @returns the current scene
      */
    def freezeActiveMeshes(): Scene = js.native
    def freezeActiveMeshes(skipEvaluateActiveMeshes: Boolean): Scene = js.native
    def freezeActiveMeshes(skipEvaluateActiveMeshes: Boolean, onSuccess: js.Function0[Unit]): Scene = js.native
    def freezeActiveMeshes(
      skipEvaluateActiveMeshes: Boolean,
      onSuccess: js.Function0[Unit],
      onError: js.Function1[/* message */ String, Unit]
    ): Scene = js.native
    def freezeActiveMeshes(
      skipEvaluateActiveMeshes: Boolean,
      onSuccess: js.Function0[Unit],
      onError: js.Function1[/* message */ String, Unit],
      freezeMeshes: Boolean
    ): Scene = js.native
    def freezeActiveMeshes(
      skipEvaluateActiveMeshes: Boolean,
      onSuccess: js.Function0[Unit],
      onError: js.Function1[/* message */ String, Unit],
      freezeMeshes: Boolean,
      keepFrustumCulling: Boolean
    ): Scene = js.native
    def freezeActiveMeshes(
      skipEvaluateActiveMeshes: Boolean,
      onSuccess: js.Function0[Unit],
      onError: js.Function1[/* message */ String, Unit],
      freezeMeshes: Unit,
      keepFrustumCulling: Boolean
    ): Scene = js.native
    def freezeActiveMeshes(
      skipEvaluateActiveMeshes: Boolean,
      onSuccess: js.Function0[Unit],
      onError: Unit,
      freezeMeshes: Boolean
    ): Scene = js.native
    def freezeActiveMeshes(
      skipEvaluateActiveMeshes: Boolean,
      onSuccess: js.Function0[Unit],
      onError: Unit,
      freezeMeshes: Boolean,
      keepFrustumCulling: Boolean
    ): Scene = js.native
    def freezeActiveMeshes(
      skipEvaluateActiveMeshes: Boolean,
      onSuccess: js.Function0[Unit],
      onError: Unit,
      freezeMeshes: Unit,
      keepFrustumCulling: Boolean
    ): Scene = js.native
    def freezeActiveMeshes(
      skipEvaluateActiveMeshes: Boolean,
      onSuccess: Unit,
      onError: js.Function1[/* message */ String, Unit]
    ): Scene = js.native
    def freezeActiveMeshes(
      skipEvaluateActiveMeshes: Boolean,
      onSuccess: Unit,
      onError: js.Function1[/* message */ String, Unit],
      freezeMeshes: Boolean
    ): Scene = js.native
    def freezeActiveMeshes(
      skipEvaluateActiveMeshes: Boolean,
      onSuccess: Unit,
      onError: js.Function1[/* message */ String, Unit],
      freezeMeshes: Boolean,
      keepFrustumCulling: Boolean
    ): Scene = js.native
    def freezeActiveMeshes(
      skipEvaluateActiveMeshes: Boolean,
      onSuccess: Unit,
      onError: js.Function1[/* message */ String, Unit],
      freezeMeshes: Unit,
      keepFrustumCulling: Boolean
    ): Scene = js.native
    def freezeActiveMeshes(skipEvaluateActiveMeshes: Boolean, onSuccess: Unit, onError: Unit, freezeMeshes: Boolean): Scene = js.native
    def freezeActiveMeshes(
      skipEvaluateActiveMeshes: Boolean,
      onSuccess: Unit,
      onError: Unit,
      freezeMeshes: Boolean,
      keepFrustumCulling: Boolean
    ): Scene = js.native
    def freezeActiveMeshes(
      skipEvaluateActiveMeshes: Boolean,
      onSuccess: Unit,
      onError: Unit,
      freezeMeshes: Unit,
      keepFrustumCulling: Boolean
    ): Scene = js.native
    def freezeActiveMeshes(skipEvaluateActiveMeshes: Unit, onSuccess: js.Function0[Unit]): Scene = js.native
    def freezeActiveMeshes(
      skipEvaluateActiveMeshes: Unit,
      onSuccess: js.Function0[Unit],
      onError: js.Function1[/* message */ String, Unit]
    ): Scene = js.native
    def freezeActiveMeshes(
      skipEvaluateActiveMeshes: Unit,
      onSuccess: js.Function0[Unit],
      onError: js.Function1[/* message */ String, Unit],
      freezeMeshes: Boolean
    ): Scene = js.native
    def freezeActiveMeshes(
      skipEvaluateActiveMeshes: Unit,
      onSuccess: js.Function0[Unit],
      onError: js.Function1[/* message */ String, Unit],
      freezeMeshes: Boolean,
      keepFrustumCulling: Boolean
    ): Scene = js.native
    def freezeActiveMeshes(
      skipEvaluateActiveMeshes: Unit,
      onSuccess: js.Function0[Unit],
      onError: js.Function1[/* message */ String, Unit],
      freezeMeshes: Unit,
      keepFrustumCulling: Boolean
    ): Scene = js.native
    def freezeActiveMeshes(
      skipEvaluateActiveMeshes: Unit,
      onSuccess: js.Function0[Unit],
      onError: Unit,
      freezeMeshes: Boolean
    ): Scene = js.native
    def freezeActiveMeshes(
      skipEvaluateActiveMeshes: Unit,
      onSuccess: js.Function0[Unit],
      onError: Unit,
      freezeMeshes: Boolean,
      keepFrustumCulling: Boolean
    ): Scene = js.native
    def freezeActiveMeshes(
      skipEvaluateActiveMeshes: Unit,
      onSuccess: js.Function0[Unit],
      onError: Unit,
      freezeMeshes: Unit,
      keepFrustumCulling: Boolean
    ): Scene = js.native
    def freezeActiveMeshes(skipEvaluateActiveMeshes: Unit, onSuccess: Unit, onError: js.Function1[/* message */ String, Unit]): Scene = js.native
    def freezeActiveMeshes(
      skipEvaluateActiveMeshes: Unit,
      onSuccess: Unit,
      onError: js.Function1[/* message */ String, Unit],
      freezeMeshes: Boolean
    ): Scene = js.native
    def freezeActiveMeshes(
      skipEvaluateActiveMeshes: Unit,
      onSuccess: Unit,
      onError: js.Function1[/* message */ String, Unit],
      freezeMeshes: Boolean,
      keepFrustumCulling: Boolean
    ): Scene = js.native
    def freezeActiveMeshes(
      skipEvaluateActiveMeshes: Unit,
      onSuccess: Unit,
      onError: js.Function1[/* message */ String, Unit],
      freezeMeshes: Unit,
      keepFrustumCulling: Boolean
    ): Scene = js.native
    def freezeActiveMeshes(skipEvaluateActiveMeshes: Unit, onSuccess: Unit, onError: Unit, freezeMeshes: Boolean): Scene = js.native
    def freezeActiveMeshes(
      skipEvaluateActiveMeshes: Unit,
      onSuccess: Unit,
      onError: Unit,
      freezeMeshes: Boolean,
      keepFrustumCulling: Boolean
    ): Scene = js.native
    def freezeActiveMeshes(
      skipEvaluateActiveMeshes: Unit,
      onSuccess: Unit,
      onError: Unit,
      freezeMeshes: Unit,
      keepFrustumCulling: Boolean
    ): Scene = js.native
    
    /**
      * Freeze all materials
      * A frozen material will not be updatable but should be faster to render
      * Note: multimaterials will not be frozen, but their submaterials will
      */
    def freezeMaterials(): Unit = js.native
    
    /**
      * Gets the list of frustum planes (built from the active camera)
      */
    def frustumPlanes: js.Array[Plane] = js.native
    
    /**
      * Gets the gamepad manager associated with the scene
      * @see https://doc.babylonjs.com/features/featuresDeepDive/input/gamepads
      */
    var gamepadManager: GamepadManager = js.native
    
    /**
      * Gets or Sets the current geometry buffer associated to the scene.
      */
    var geometryBufferRenderer: Nullable[GeometryBufferRenderer] = js.native
    
    /**
      * Gets the total number of active bones rendered per frame
      * @returns the total number of active bones rendered per frame
      */
    def getActiveBones(): Double = js.native
    
    /**
      * Gets the total number of active indices rendered per frame (You can deduce the number of rendered triangles by dividing this number by 3)
      * @returns the total number of active indices rendered per frame
      */
    def getActiveIndices(): Double = js.native
    
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
    def getActiveParticles(): Double = js.native
    
    /**
      * Lambda returning the list of potentially active sub meshes.
      */
    def getActiveSubMeshCandidates(mesh: AbstractMesh): ISmartArrayLike[SubMesh] = js.native
    
    /**
      * Gets all animatables associated with a given target
      * @param target defines the target to look animatables for
      * @returns an array of Animatables
      */
    def getAllAnimatablesByTarget(target: Any): js.Array[Animatable] = js.native
    
    /**
      * Gets the animatable associated with a specific target
      * @param target defines the target of the animatable
      * @returns the required animatable if found
      */
    def getAnimatableByTarget(target: Any): Nullable[Animatable] = js.native
    
    /**
      * get an animation group using its name
      * @param name defines the material's name
      * @returns the animation group or null if none found.
      */
    def getAnimationGroupByName(name: String): Nullable[AnimationGroup] = js.native
    
    /**
      * Gets the animation ratio (which is 1.0 is the scene renders at 60fps and 2 if the scene renders at 30fps, etc.)
      * @returns a number
      */
    def getAnimationRatio(): Double = js.native
    
    /**
      * Gets the current auto clear configuration for one rendering group of the rendering
      * manager.
      * @param index the rendering group index to get the information for
      * @returns The auto clear setup for the requested rendering group
      */
    def getAutoClearDepthStencilSetup(index: Double): IRenderingManagerAutoClearSetup = js.native
    
    /**
      * Gets a bone using its Id
      * @param id defines the bone's Id
      * @returns the bone or null if not found
      * @deprecated Please use getBoneById instead
      */
    def getBoneByID(id: String): Nullable[Bone] = js.native
    
    /**
      * Gets a bone using its Id
      * @param id defines the bone's Id
      * @returns the bone or null if not found
      */
    def getBoneById(id: String): Nullable[Bone] = js.native
    
    /**
      * Gets a bone using its id
      * @param name defines the bone's name
      * @returns the bone or null if not found
      */
    def getBoneByName(name: String): Nullable[Bone] = js.native
    
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
    def getCachedVisibility(): Nullable[Double] = js.native
    
    /**
      * Gets a camera using its Id
      * @param id defines the Id to look for
      * @returns the camera or null if not found
      * @deprecated Please use getCameraById instead
      */
    def getCameraByID(id: String): Nullable[Camera] = js.native
    
    /**
      * Gets a camera using its Id
      * @param id defines the Id to look for
      * @returns the camera or null if not found
      */
    def getCameraById(id: String): Nullable[Camera] = js.native
    
    /**
      * Gets a camera using its name
      * @param name defines the camera's name
      * @returns the camera or null if none found.
      */
    def getCameraByName(name: String): Nullable[Camera] = js.native
    
    /**
      * Gets a camera using its unique Id
      * @param uniqueId defines the unique Id to look for
      * @returns the camera or null if not found
      * @deprecated Please use getCameraByUniqueId instead
      */
    def getCameraByUniqueID(uniqueId: Double): Nullable[Camera] = js.native
    
    /**
      * Gets a camera using its unique Id
      * @param uniqueId defines the unique Id to look for
      * @returns the camera or null if not found
      */
    def getCameraByUniqueId(uniqueId: Double): Nullable[Camera] = js.native
    
    /**
      * Get a list of cameras by tags
      * @param tagsQuery defines the tags query to use
      * @param forEach defines a predicate used to filter results
      * @returns an array of Camera
      */
    def getCamerasByTags(tagsQuery: String): js.Array[Camera] = js.native
    def getCamerasByTags(tagsQuery: String, forEach: js.Function1[/* camera */ Camera, Unit]): js.Array[Camera] = js.native
    
    /**
      * Gets a string identifying the name of the class
      * @returns "Scene" string
      */
    def getClassName(): String = js.native
    
    /**
      * Lambda returning the list of potentially colliding sub meshes.
      */
    def getCollidingSubMeshCandidates(mesh: AbstractMesh, collider: Collider): ISmartArrayLike[SubMesh] = js.native
    
    /**
      * User updatable function that will return a deterministic frame time when engine is in deterministic lock step mode
      */
    def getDeterministicFrameTime(): Double = js.native
    
    /**
      * Gets the engine associated with the scene
      * @returns an Engine
      */
    def getEngine(): Engine = js.native
    
    /**
      * Get an externally attached data from its key
      * @param key the unique key that identifies the data
      * @returns the associated data, if present (can be null), or undefined if not present
      */
    def getExternalData[T](key: String): Nullable[T] = js.native
    
    /**
      * Gets an unique Id for the current frame
      * @returns a number
      */
    def getFrameId(): Double = js.native
    
    /**
      * Gets the list of geometries attached to the scene
      * @returns an array of Geometry
      */
    def getGeometries(): js.Array[Geometry] = js.native
    
    /**
      * Gets a geometry using its Id
      * @param id defines the geometry's Id
      * @returns the geometry or null if none found.
      * @deprecated Please use getGeometryById instead
      */
    def getGeometryByID(id: String): Nullable[Geometry] = js.native
    
    /**
      * Gets a geometry using its Id
      * @param id defines the geometry's Id
      * @returns the geometry or null if none found.
      */
    def getGeometryById(id: String): Nullable[Geometry] = js.native
    
    /**
      * Gets the internal step used by deterministic lock step
      * @see https://doc.babylonjs.com/features/featuresDeepDive/animation/advanced_animations#deterministic-lockstep
      * @returns the internal step
      */
    def getInternalStep(): Double = js.native
    
    /**
      * Lambda returning the list of potentially intersecting sub meshes.
      */
    def getIntersectingSubMeshCandidates(mesh: AbstractMesh, localRay: Ray): ISmartArrayLike[SubMesh] = js.native
    
    /**
      * Gets a the last added node (Mesh, Camera, Light) using a given Id
      * @param id defines the Id to search for
      * @returns the found node or null if not found at all
      * @deprecated Please use getLastEntryById instead
      */
    def getLastEntryByID(id: String): Nullable[Node] = js.native
    
    /**
      * Gets a the last added node (Mesh, Camera, Light) using a given Id
      * @param id defines the Id to search for
      * @returns the found node or null if not found at all
      */
    def getLastEntryById(id: String): Nullable[Node] = js.native
    
    /**
      * Gets a the last added material using a given id
      * @param id defines the material's Id
      * @returns the last material with the given id or null if none found.
      * @deprecated Please use getLastMaterialById instead
      */
    def getLastMaterialByID(id: String): Nullable[Material] = js.native
    
    /**
      * Gets a last added material using a given id
      * @param id defines the material's id
      * @param allowMultiMaterials determines whether multimaterials should be considered
      * @returns the last material with the given id or null if none found.
      */
    def getLastMaterialById(id: String): Nullable[Material] = js.native
    def getLastMaterialById(id: String, allowMultiMaterials: Boolean): Nullable[Material] = js.native
    
    /**
      * Gets a the last added mesh using a given Id
      * @param id defines the Id to search for
      * @returns the found mesh or null if not found at all.
      * @deprecated Please use getLastMeshById instead
      */
    def getLastMeshByID(id: String): Nullable[AbstractMesh] = js.native
    
    /**
      * Gets a the last added mesh using a given Id
      * @param id defines the Id to search for
      * @returns the found mesh or null if not found at all.
      */
    def getLastMeshById(id: String): Nullable[AbstractMesh] = js.native
    
    /**
      * Gets a skeleton using a given Id (if many are found, this function will pick the last one)
      * @param id defines the Id to search for
      * @returns the found skeleton or null if not found at all.
      * @deprecated Please use getLastSkeletonById instead
      */
    def getLastSkeletonByID(id: String): Nullable[Skeleton] = js.native
    
    /**
      * Gets a skeleton using a given Id (if many are found, this function will pick the last one)
      * @param id defines the Id to search for
      * @returns the found skeleton or null if not found at all.
      */
    def getLastSkeletonById(id: String): Nullable[Skeleton] = js.native
    
    /**
      * Gets a light node using its Id
      * @param id defines the light's Id
      * @returns the light or null if none found.
      * @deprecated Please use getLightById instead
      */
    def getLightByID(id: String): Nullable[Light] = js.native
    
    /**
      * Gets a light node using its Id
      * @param id defines the light's Id
      * @returns the light or null if none found.
      */
    def getLightById(id: String): Nullable[Light] = js.native
    
    /**
      * Gets a light node using its name
      * @param name defines the the light's name
      * @returns the light or null if none found.
      */
    def getLightByName(name: String): Nullable[Light] = js.native
    
    /**
      * Gets a light node using its scene-generated unique Id
      * @param uniqueId defines the light's unique Id
      * @returns the light or null if none found.
      * @deprecated Please use getLightByUniqueId instead
      */
    def getLightByUniqueID(uniqueId: Double): Nullable[Light] = js.native
    
    /**
      * Gets a light node using its scene-generated unique Id
      * @param uniqueId defines the light's unique Id
      * @returns the light or null if none found.
      */
    def getLightByUniqueId(uniqueId: Double): Nullable[Light] = js.native
    
    /**
      * Get a list of lights by tags
      * @param tagsQuery defines the tags query to use
      * @param forEach defines a predicate used to filter results
      * @returns an array of Light
      */
    def getLightsByTags(tagsQuery: String): js.Array[Light] = js.native
    def getLightsByTags(tagsQuery: String, forEach: js.Function1[/* light */ Light, Unit]): js.Array[Light] = js.native
    
    /**
      * Get a material using its id
      * @param id defines the material's Id
      * @returns the material or null if none found.
      * @deprecated Please use getMaterialById instead
      */
    def getMaterialByID(id: String): Nullable[Material] = js.native
    
    /**
      * get a material using its id
      * @param id defines the material's Id
      * @param allowMultiMaterials determines whether multimaterials should be considered
      * @returns the material or null if none found.
      */
    def getMaterialById(id: String): Nullable[Material] = js.native
    def getMaterialById(id: String, allowMultiMaterials: Boolean): Nullable[Material] = js.native
    
    /**
      * Gets a material using its name
      * @param name defines the material's name
      * @param allowMultiMaterials determines whether multimaterials should be considered
      * @returns the material or null if none found.
      */
    def getMaterialByName(name: String): Nullable[Material] = js.native
    def getMaterialByName(name: String, allowMultiMaterials: Boolean): Nullable[Material] = js.native
    
    /**
      * Get a list of materials by tags
      * @param tagsQuery defines the tags query to use
      * @param forEach defines a predicate used to filter results
      * @returns an array of Material
      */
    def getMaterialByTags(tagsQuery: String): js.Array[Material] = js.native
    def getMaterialByTags(tagsQuery: String, forEach: js.Function1[/* material */ Material, Unit]): js.Array[Material] = js.native
    
    /**
      * Get a material using its unique id
      * @param uniqueId defines the material's unique id
      * @param allowMultiMaterials determines whether multimaterials should be considered
      * @returns the material or null if none found.
      */
    def getMaterialByUniqueID(uniqueId: Double): Nullable[Material] = js.native
    def getMaterialByUniqueID(uniqueId: Double, allowMultiMaterials: Boolean): Nullable[Material] = js.native
    
    /**
      * Gets the first added mesh found of a given Id
      * @param id defines the Id to search for
      * @returns the mesh found or null if not found at all
      * @deprecated Please use getMeshById instead
      */
    def getMeshByID(id: String): Nullable[AbstractMesh] = js.native
    
    /**
      * Gets the first added mesh found of a given Id
      * @param id defines the Id to search for
      * @returns the mesh found or null if not found at all
      */
    def getMeshById(id: String): Nullable[AbstractMesh] = js.native
    
    /**
      * Gets a mesh using a given name
      * @param name defines the name to search for
      * @returns the found mesh or null if not found at all.
      */
    def getMeshByName(name: String): Nullable[AbstractMesh] = js.native
    
    /**
      * Gets a mesh with its auto-generated unique Id
      * @param uniqueId defines the unique Id to search for
      * @returns the found mesh or null if not found at all.
      * @deprecated Please use getMeshByUniqueId instead
      */
    def getMeshByUniqueID(uniqueId: Double): Nullable[AbstractMesh] = js.native
    
    /**
      * Gets a mesh with its auto-generated unique Id
      * @param uniqueId defines the unique Id to search for
      * @returns the found mesh or null if not found at all.
      */
    def getMeshByUniqueId(uniqueId: Double): Nullable[AbstractMesh] = js.native
    
    /**
      * Gets a list of meshes using their Id
      * @param id defines the Id to search for
      * @returns a list of meshes
      * @deprecated Please use getMeshesById instead
      */
    def getMeshesByID(id: String): js.Array[AbstractMesh] = js.native
    
    /**
      * Gets a list of meshes using their Id
      * @param id defines the Id to search for
      * @returns a list of meshes
      */
    def getMeshesById(id: String): js.Array[AbstractMesh] = js.native
    
    /**
      * Get a list of meshes by tags
      * @param tagsQuery defines the tags query to use
      * @param forEach defines a predicate used to filter results
      * @returns an array of Mesh
      */
    def getMeshesByTags(tagsQuery: String): js.Array[Mesh] = js.native
    def getMeshesByTags(tagsQuery: String, forEach: js.Function1[/* mesh */ AbstractMesh, Unit]): js.Array[Mesh] = js.native
    
    /**
      * Gets a morph target using a given id (if many are found, this function will pick the first one)
      * @param id defines the id to search for
      * @returns the found morph target or null if not found at all.
      */
    def getMorphTargetById(id: String): Nullable[MorphTarget] = js.native
    
    /**
      * Gets a morph target using a given name (if many are found, this function will pick the first one)
      * @param name defines the name to search for
      * @returns the found morph target or null if not found at all.
      */
    def getMorphTargetByName(name: String): Nullable[MorphTarget] = js.native
    
    /**
      * Gets a morph target manager  using a given id (if many are found, this function will pick the last one)
      * @param id defines the id to search for
      * @returns the found morph target manager or null if not found at all.
      */
    def getMorphTargetManagerById(id: Double): Nullable[MorphTargetManager] = js.native
    
    /**
      * Gets a node (Mesh, Camera, Light) using a given Id
      * @param id defines the Id to search for
      * @returns the found node or null if not found at all
      * @deprecated Please use getNodeById instead
      */
    def getNodeByID(id: String): Nullable[Node] = js.native
    
    /**
      * Gets a node (Mesh, Camera, Light) using a given Id
      * @param id defines the Id to search for
      * @returns the found node or null if not found at all
      */
    def getNodeById(id: String): Nullable[Node] = js.native
    
    /**
      * Gets a node (Mesh, Camera, Light) using a given name
      * @param name defines the name to search for
      * @returns the found node or null if not found at all.
      */
    def getNodeByName(name: String): Nullable[Node] = js.native
    
    /**
      * Get an externally attached data from its key, create it using a factory if it's not already present
      * @param key the unique key that identifies the data
      * @param factory the factory that will be called to create the instance if and only if it doesn't exists
      * @returns the associated data, can be null if the factory returned null.
      */
    def getOrAddExternalDataWithFactory[T /* <: js.Object */](key: String, factory: js.Function1[/* k */ String, T]): T = js.native
    
    /**
      * Gets the outline renderer associated with the scene
      * @returns a OutlineRenderer
      */
    def getOutlineRenderer(): OutlineRenderer = js.native
    
    /**
      * Gets a particle system by Id
      * @param id defines the particle system Id
      * @returns the corresponding system or null if none found
      * @deprecated Please use getParticleSystemById instead
      */
    def getParticleSystemByID(id: String): Nullable[IParticleSystem] = js.native
    
    /**
      * Gets a particle system by Id
      * @param id defines the particle system Id
      * @returns the corresponding system or null if none found
      */
    def getParticleSystemById(id: String): Nullable[IParticleSystem] = js.native
    
    /**
      * This method gets the performance collector belonging to the scene, which is generally shared with the inspector.
      * @returns the perf collector belonging to the scene.
      */
    def getPerfCollector(): PerformanceViewerCollector = js.native
    
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
      * Gets a post process using a given name (if many are found, this function will pick the first one)
      * @param name defines the name to search for
      * @returns the found post process or null if not found at all.
      */
    def getPostProcessByName(name: String): Nullable[PostProcess] = js.native
    
    /**
      * Gets the current projection matrix
      * @returns a Matrix
      */
    def getProjectionMatrix(): Matrix = js.native
    
    /**
      * Gets an unique Id for the current render phase
      * @returns a number
      */
    def getRenderId(): Double = js.native
    
    /**
      * Gets the uniform buffer used to store scene data
      * @returns a UniformBuffer
      */
    def getSceneUniformBuffer(): UniformBuffer = js.native
    
    /**
      * Gets a skeleton using a given id (if many are found, this function will pick the first one)
      * @param id defines the id to search for
      * @returns the found skeleton or null if not found at all.
      */
    def getSkeletonById(id: String): Nullable[Skeleton] = js.native
    
    /**
      * Gets a skeleton using a given name
      * @param name defines the name to search for
      * @returns the found skeleton or null if not found at all.
      */
    def getSkeletonByName(name: String): Nullable[Skeleton] = js.native
    
    /**
      * Gets a skeleton using a given auto generated unique id
      * @param  uniqueId defines the unique id to search for
      * @returns the found skeleton or null if not found at all.
      */
    def getSkeletonByUniqueId(uniqueId: Double): Nullable[Skeleton] = js.native
    
    /**
      * Gets a sound using a given name
      * @param name defines the name to search for
      * @returns the found sound or null if not found at all.
      */
    def getSoundByName(name: String): Nullable[Sound] = js.native
    
    /**
      * Gets the step Id used by deterministic lock step
      * @see https://doc.babylonjs.com/features/featuresDeepDive/animation/advanced_animations#deterministic-lockstep
      * @returns the step Id
      */
    def getStepId(): Double = js.native
    
    /**
      * Gets a texture using its name
      * @param name defines the texture's name
      * @returns the texture or null if none found.
      */
    def getTextureByName(name: String): Nullable[BaseTexture] = js.native
    
    /**
      * Get a texture using its unique id
      * @param uniqueId defines the texture's unique id
      * @returns the texture or null if none found.
      * @deprecated Please use getTextureByUniqueId instead
      */
    def getTextureByUniqueID(uniqueId: Double): Nullable[BaseTexture] = js.native
    
    /**
      * Get a texture using its unique id
      * @param uniqueId defines the texture's unique id
      * @returns the texture or null if none found.
      */
    def getTextureByUniqueId(uniqueId: Double): Nullable[BaseTexture] = js.native
    
    /**
      * Gets the total number of vertices rendered per frame
      * @returns the total number of vertices rendered per frame
      */
    def getTotalVertices(): Double = js.native
    
    /**
      * Gets the current transform matrix
      * @returns a Matrix made of View * Projection
      */
    def getTransformMatrix(): Matrix = js.native
    
    /**
      * Gets the first added transform node found of a given Id
      * @param id defines the Id to search for
      * @returns the found transform node or null if not found at all.
      * @deprecated Please use getTransformNodeById instead
      */
    def getTransformNodeByID(id: String): Nullable[TransformNode] = js.native
    
    /**
      * Gets the first added transform node found of a given Id
      * @param id defines the Id to search for
      * @returns the found transform node or null if not found at all.
      */
    def getTransformNodeById(id: String): Nullable[TransformNode] = js.native
    
    /**
      * Gets a transform node using a given name
      * @param name defines the name to search for
      * @returns the found transform node or null if not found at all.
      */
    def getTransformNodeByName(name: String): Nullable[TransformNode] = js.native
    
    /**
      * Gets a transform node with its auto-generated unique Id
      * @param uniqueId defines the unique Id to search for
      * @returns the found transform node or null if not found at all.
      * @deprecated Please use getTransformNodeByUniqueId instead
      */
    def getTransformNodeByUniqueID(uniqueId: Double): Nullable[TransformNode] = js.native
    
    /**
      * Gets a transform node with its auto-generated unique Id
      * @param uniqueId defines the unique Id to search for
      * @returns the found transform node or null if not found at all.
      */
    def getTransformNodeByUniqueId(uniqueId: Double): Nullable[TransformNode] = js.native
    
    /**
      * Gets a list of transform nodes using their Id
      * @param id defines the Id to search for
      * @returns a list of transform nodes
      * @deprecated Please use getTransformNodesById instead
      */
    def getTransformNodesByID(id: String): js.Array[TransformNode] = js.native
    
    /**
      * Gets a list of transform nodes using their Id
      * @param id defines the Id to search for
      * @returns a list of transform nodes
      */
    def getTransformNodesById(id: String): js.Array[TransformNode] = js.native
    
    /**
      * Get a list of transform nodes by tags
      * @param tagsQuery defines the tags query to use
      * @param forEach defines a predicate used to filter results
      * @returns an array of TransformNode
      */
    def getTransformNodesByTags(tagsQuery: String): js.Array[TransformNode] = js.native
    def getTransformNodesByTags(tagsQuery: String, forEach: js.Function1[/* transform */ TransformNode, Unit]): js.Array[TransformNode] = js.native
    
    /**
      * Gets an unique (relatively to the current scene) Id
      * @returns an unique number for the scene
      */
    def getUniqueId(): Double = js.native
    
    /**
      * Gets the current view matrix
      * @returns a Matrix
      */
    def getViewMatrix(): Matrix = js.native
    
    /**
      * Returns the number of items waiting to be loaded
      * @returns the number of items waiting to be loaded
      */
    def getWaitingItemsCount(): Double = js.native
    
    /**
      * Get the world extend vectors with an optional filter
      *
      * @param filterPredicate the predicate - which meshes should be included when calculating the world size
      * @returns {{ min: Vector3; max: Vector3 }} min and max vectors
      */
    def getWorldExtends(): Max = js.native
    def getWorldExtends(filterPredicate: js.Function1[/* mesh */ AbstractMesh, Boolean]): Max = js.native
    
    /**
      * Defines the gravity applied to this scene (used only for collisions)
      * @see https://doc.babylonjs.com/features/featuresDeepDive/cameras/camera_collisions
      */
    var gravity: Vector3 = js.native
    
    /**
      * Gets or sets if audio will be output to headphones
      * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic
      */
    var headphone: Boolean = js.native
    
    /**
      * Defines the HTML cursor to use when hovering over interactive elements
      */
    var hoverCursor: String = js.native
    
    /**
      * Default image processing configuration used either in the rendering
      * Forward main pass or through the imageProcessingPostProcess if present.
      * As in the majority of the scene they are the same (exception for multi camera),
      * this is easier to reference from here than from all the materials and post process.
      *
      * No setter as we it is a shared configuration, you can set the values instead.
      */
    def imageProcessingConfiguration: ImageProcessingConfiguration = js.native
    
    /**
      * Gets the list of meshes imported to the scene through SceneLoader
      */
    var importedMeshesFiles: js.Array[String] = js.native
    
    /** Call this function if you want to manually increment the render Id*/
    def incrementRenderId(): Unit = js.native
    
    /**
      * Gets a boolean indicating if the given mesh is active
      * @param mesh defines the mesh to look for
      * @returns true if the mesh is in the active list
      */
    def isActiveMesh(mesh: AbstractMesh): Boolean = js.native
    
    /**
      * Gets a boolean indicating if the current material / effect / visibility must be bind again
      * @param material defines the current material
      * @param effect defines the current effect
      * @param visibility defines the current visibility state
      * @returns true if one parameter is not cached
      */
    def isCachedMaterialInvalid(material: Material, effect: Effect): Boolean = js.native
    def isCachedMaterialInvalid(material: Material, effect: Effect, visibility: Double): Boolean = js.native
    
    /**
      * Gets if the scene is already disposed
      */
    def isDisposed: Boolean = js.native
    
    /**
      * Returns a boolean indicating if the scene is still loading data
      */
    def isLoading: Boolean = js.native
    
    /**
      * Gets a boolean indicating if there is an active physics engine
      * @returns a boolean indicating if there is an active physics engine
      */
    def isPhysicsEnabled(): Boolean = js.native
    
    /**
      * Gets a boolean indicating if the current pointer event is captured (meaning that the scene has already handled the pointer down)
      * @param pointerId defines the pointer id to use in a multi-touch scenario (0 by default)
      * @returns true if the pointer was captured
      */
    def isPointerCaptured(): Boolean = js.native
    def isPointerCaptured(pointerId: Double): Boolean = js.native
    
    /**
      * This function will check if the scene can be rendered (textures are loaded, shaders are compiled)
      * Delay loaded resources are not taking in account
      * @param checkRenderTargets true to also check that the meshes rendered as part of a render target are ready (default: true)
      * @returns true if all required resources are ready
      */
    def isReady(): Boolean = js.native
    def isReady(checkRenderTargets: Boolean): Boolean = js.native
    
    /**
      * Gets or sets a boolean indicating if lens flares are enabled on this scene
      */
    var lensFlaresEnabled: Boolean = js.native
    
    def lightsEnabled: Boolean = js.native
    /**
      * Gets or sets a boolean indicating if lights are enabled on this scene
      */
    def lightsEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Gets the name of the plugin used to load this scene (null by default)
      */
    var loadingPluginName: String = js.native
    
    /**
      * The main sound track played by the scene.
      * It contains your primary collection of sounds.
      */
    var mainSoundTrack: SoundTrack = js.native
    
    /**
      * Will flag all materials as dirty to trigger new shader compilation
      * @param flag defines the flag used to specify which material part must be marked as dirty
      * @param predicate If not null, it will be used to specify if a material has to be marked as dirty
      */
    def markAllMaterialsAsDirty(flag: Double): Unit = js.native
    def markAllMaterialsAsDirty(flag: Double, predicate: js.Function1[/* mat */ Material, Boolean]): Unit = js.native
    
    /**
      * Gets the mesh that is currently under the pointer
      */
    def meshUnderPointer: Nullable[AbstractMesh] = js.native
    
    /**
      * Gets or sets user defined metadata
      */
    var metadata: Any = js.native
    
    /**
      * Launch a ray to try to pick a mesh in the scene
      * @param x X position on screen
      * @param y Y position on screen
      * @param predicate Predicate function used to determine eligible meshes. Can be set to null. In this case, a mesh must be enabled, visible and with isPickable set to true
      * @param camera camera to use for computing the picking ray. Can be set to null. In this case, the scene.activeCamera will be used
      * @param trianglePredicate defines an optional predicate used to select faces when a mesh intersection is detected
      * @returns an array of PickingInfo
      */
    def multiPick(x: Double, y: Double): Nullable[js.Array[PickingInfo]] = js.native
    def multiPick(x: Double, y: Double, predicate: js.Function1[/* mesh */ AbstractMesh, Boolean]): Nullable[js.Array[PickingInfo]] = js.native
    def multiPick(
      x: Double,
      y: Double,
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      camera: Unit,
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[js.Array[PickingInfo]] = js.native
    def multiPick(x: Double, y: Double, predicate: js.Function1[/* mesh */ AbstractMesh, Boolean], camera: Camera): Nullable[js.Array[PickingInfo]] = js.native
    def multiPick(
      x: Double,
      y: Double,
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      camera: Camera,
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[js.Array[PickingInfo]] = js.native
    def multiPick(x: Double, y: Double, predicate: Unit, camera: Unit, trianglePredicate: TrianglePickingPredicate): Nullable[js.Array[PickingInfo]] = js.native
    def multiPick(x: Double, y: Double, predicate: Unit, camera: Camera): Nullable[js.Array[PickingInfo]] = js.native
    def multiPick(x: Double, y: Double, predicate: Unit, camera: Camera, trianglePredicate: TrianglePickingPredicate): Nullable[js.Array[PickingInfo]] = js.native
    
    /** Launch a ray to try to pick sprites in the scene
      * @param x position on screen
      * @param y position on screen
      * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
      * @param camera camera to use for computing the picking ray. Can be set to null. In this case, the scene.activeCamera will be used
      * @returns a PickingInfo array
      */
    def multiPickSprite(x: Double, y: Double): Nullable[js.Array[PickingInfo]] = js.native
    def multiPickSprite(x: Double, y: Double, predicate: js.Function1[/* sprite */ Sprite, Boolean]): Nullable[js.Array[PickingInfo]] = js.native
    def multiPickSprite(x: Double, y: Double, predicate: js.Function1[/* sprite */ Sprite, Boolean], camera: Camera): Nullable[js.Array[PickingInfo]] = js.native
    def multiPickSprite(x: Double, y: Double, predicate: Unit, camera: Camera): Nullable[js.Array[PickingInfo]] = js.native
    
    /** Use the given ray to pick sprites in the scene
      * @param ray The ray (in world space) to use to pick meshes
      * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
      * @param camera camera to use. Can be set to null. In this case, the scene.activeCamera will be used
      * @returns a PickingInfo array
      */
    def multiPickSpriteWithRay(ray: Ray): Nullable[js.Array[PickingInfo]] = js.native
    def multiPickSpriteWithRay(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, Boolean]): Nullable[js.Array[PickingInfo]] = js.native
    def multiPickSpriteWithRay(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, Boolean], camera: Camera): Nullable[js.Array[PickingInfo]] = js.native
    def multiPickSpriteWithRay(ray: Ray, predicate: Unit, camera: Camera): Nullable[js.Array[PickingInfo]] = js.native
    
    /**
      * Launch a ray to try to pick a mesh in the scene
      * @param ray Ray to use
      * @param predicate Predicate function used to determine eligible meshes. Can be set to null. In this case, a mesh must be enabled, visible and with isPickable set to true
      * @param trianglePredicate defines an optional predicate used to select faces when a mesh intersection is detected
      * @returns an array of PickingInfo
      */
    def multiPickWithRay(ray: Ray): Nullable[js.Array[PickingInfo]] = js.native
    def multiPickWithRay(ray: Ray, predicate: js.Function1[/* mesh */ AbstractMesh, Boolean]): Nullable[js.Array[PickingInfo]] = js.native
    def multiPickWithRay(
      ray: Ray,
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[js.Array[PickingInfo]] = js.native
    def multiPickWithRay(ray: Ray, predicate: Unit, trianglePredicate: TrianglePickingPredicate): Nullable[js.Array[PickingInfo]] = js.native
    
    /**
      * Flag indicating if we need to store previous matrices when rendering
      */
    var needsPreviousWorldMatrices: Boolean = js.native
    
    /**
      * Gets or sets the current offline provider to use to store scene data
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/optimizeCached
      */
    var offlineProvider: IOfflineProvider = js.native
    
    /**
      * An event triggered when the activeCamera property is updated
      */
    var onActiveCameraChanged: Observable[Scene] = js.native
    
    /**
      * An event triggered when the activeCameras property is updated
      */
    var onActiveCamerasChanged: Observable[Scene] = js.native
    
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
      * This is triggered for the full rig Camera only unlike onAfterRenderCameraObservable
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
    var onAfterPhysicsObservable: Observable[
        typings.babylonjs.physicsJoinedPhysicsEngineComponentMod.babylonjsSceneAugmentingMod.Scene
      ] = js.native
    
    /**
      * An event triggered after rendering the scene for an active camera (When scene.render is called this will be called after each camera)
      * This is triggered for each "sub" camera in a Camera Rig unlike onAfterCameraRenderObservable
      */
    var onAfterRenderCameraObservable: Observable[Camera] = js.native
    
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
      * The RenderingGroupInfo class contains all the information about the context in which the observable is called
      * If you wish to register an Observer only for a given set of renderingGroup, use the mask with a combination of the renderingGroup index elevated to the power of two (1 for renderingGroup 0, 2 for renderingrOup1, 4 for 2 and 8 for 3)
      */
    var onAfterRenderingGroupObservable: Observable[RenderingGroupInfo] = js.native
    
    /**
      * An event triggered when sprites rendering is done
      * Note: This event can be trigger more than once per frame (because sprites can be rendered by render target textures as well)
      */
    var onAfterSpritesRenderingObservable: Observable[
        typings.babylonjs.spritesSpriteSceneComponentMod.babylonjsSceneAugmentingMod.Scene
      ] = js.native
    
    /**
      * An event triggered after calculating deterministic simulation step
      */
    var onAfterStepObservable: Observable[Scene] = js.native
    
    /**
      * This Observable will when an animation file has been imported into the scene.
      */
    var onAnimationFileImportedObservable: Observable[Scene] = js.native
    
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
    var onBeforePhysicsObservable: Observable[
        typings.babylonjs.physicsJoinedPhysicsEngineComponentMod.babylonjsSceneAugmentingMod.Scene
      ] = js.native
    
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
      * The RenderingGroupInfo class contains all the information about the context in which the observable is called
      * If you wish to register an Observer only for a given set of renderingGroup, use the mask with a combination of the renderingGroup index elevated to the power of two (1 for renderingGroup 0, 2 for renderingrOup1, 4 for 2 and 8 for 3)
      */
    var onBeforeRenderingGroupObservable: Observable[RenderingGroupInfo] = js.native
    
    /**
      * An event triggered when sprites rendering is about to start
      * Note: This event can be trigger more than once per frame (because sprites can be rendered by render target textures as well)
      */
    var onBeforeSpritesRenderingObservable: Observable[
        typings.babylonjs.spritesSpriteSceneComponentMod.babylonjsSceneAugmentingMod.Scene
      ] = js.native
    
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
    
    /** Sets a function to be executed when this scene is disposed. */
    def onDispose_=(callback: js.Function0[Unit]): Unit = js.native
    
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
      * An event triggered when a multi material is removed
      */
    var onMultiMaterialRemovedObservable: Observable[MultiMaterial] = js.native
    
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
      * An event triggered when a multi material is created
      */
    var onNewMultiMaterialAddedObservable: Observable[MultiMaterial] = js.native
    
    /**
      * An event triggered when a skeleton is created
      */
    var onNewSkeletonAddedObservable: Observable[Skeleton] = js.native
    
    /**
      * An event triggered when a texture is created
      */
    var onNewTextureAddedObservable: Observable[BaseTexture] = js.native
    
    /**
      * An event triggered when a transform node is created
      */
    var onNewTransformNodeAddedObservable: Observable[TransformNode] = js.native
    
    /** Callback called when a pointer down is detected  */
    var onPointerDown: js.UndefOr[
        js.Function3[
          /* evt */ IPointerEvent, 
          /* pickInfo */ PickingInfo, 
          /* type */ PointerEventTypes, 
          Unit
        ]
      ] = js.native
    
    /** Callback called when a pointer move is detected */
    var onPointerMove: js.UndefOr[
        js.Function3[
          /* evt */ IPointerEvent, 
          /* pickInfo */ PickingInfo, 
          /* type */ PointerEventTypes, 
          Unit
        ]
      ] = js.native
    
    /**
      * Observable event triggered each time an input event is received from the rendering canvas
      */
    var onPointerObservable: Observable[PointerInfo] = js.native
    
    /** Callback called when a pointer pick is detected */
    var onPointerPick: js.UndefOr[js.Function2[/* evt */ IPointerEvent, /* pickInfo */ PickingInfo, Unit]] = js.native
    
    /** Callback called when a pointer up is detected  */
    var onPointerUp: js.UndefOr[
        js.Function3[
          /* evt */ IPointerEvent, 
          /* pickInfo */ Nullable[PickingInfo], 
          /* type */ PointerEventTypes, 
          Unit
        ]
      ] = js.native
    
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
      * Observable triggered when the performance priority is changed
      */
    var onScenePerformancePriorityChangedObservable: Observable[ScenePerformancePriority] = js.native
    
    /**
      * An event triggered when a skeleton is removed
      */
    var onSkeletonRemovedObservable: Observable[Skeleton] = js.native
    
    /**
      * An event triggered when a texture is removed
      */
    var onTextureRemovedObservable: Observable[BaseTexture] = js.native
    
    /**
      * An event triggered when a transform node is removed
      */
    var onTransformNodeRemovedObservable: Observable[TransformNode] = js.native
    
    /**
      * Gets or sets a boolean indicating if particles are enabled on this scene
      */
    var particlesEnabled: Boolean = js.native
    
    /**
      * Gets or sets a value indicating how to treat performance relatively to ease of use and backward compatibility
      */
    def performancePriority: ScenePerformancePriority = js.native
    def performancePriority_=(value: ScenePerformancePriority): Unit = js.native
    
    /**
      * Gets or sets a boolean indicating if physic engines are enabled on this scene
      */
    var physicsEnabled: Boolean = js.native
    
    /** Launch a ray to try to pick a mesh in the scene
      * @param x position on screen
      * @param y position on screen
      * @param predicate Predicate function used to determine eligible meshes. Can be set to null. In this case, a mesh must be enabled, visible and with isPickable set to true
      * @param fastCheck defines if the first intersection will be used (and not the closest)
      * @param camera to use for computing the picking ray. Can be set to null. In this case, the scene.activeCamera will be used
      * @param trianglePredicate defines an optional predicate used to select faces when a mesh intersection is detected
      * @returns a PickingInfo
      */
    def pick(x: Double, y: Double): PickingInfo = js.native
    def pick(x: Double, y: Double, predicate: js.Function1[/* mesh */ AbstractMesh, Boolean]): PickingInfo = js.native
    def pick(
      x: Double,
      y: Double,
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      fastCheck: Boolean
    ): PickingInfo = js.native
    def pick(
      x: Double,
      y: Double,
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      fastCheck: Boolean,
      camera: Unit,
      trianglePredicate: TrianglePickingPredicate
    ): PickingInfo = js.native
    def pick(
      x: Double,
      y: Double,
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      fastCheck: Boolean,
      camera: Nullable[Camera]
    ): PickingInfo = js.native
    def pick(
      x: Double,
      y: Double,
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      fastCheck: Boolean,
      camera: Nullable[Camera],
      trianglePredicate: TrianglePickingPredicate
    ): PickingInfo = js.native
    def pick(
      x: Double,
      y: Double,
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      fastCheck: Unit,
      camera: Unit,
      trianglePredicate: TrianglePickingPredicate
    ): PickingInfo = js.native
    def pick(
      x: Double,
      y: Double,
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      fastCheck: Unit,
      camera: Nullable[Camera]
    ): PickingInfo = js.native
    def pick(
      x: Double,
      y: Double,
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      fastCheck: Unit,
      camera: Nullable[Camera],
      trianglePredicate: TrianglePickingPredicate
    ): PickingInfo = js.native
    def pick(x: Double, y: Double, predicate: Unit, fastCheck: Boolean): PickingInfo = js.native
    def pick(
      x: Double,
      y: Double,
      predicate: Unit,
      fastCheck: Boolean,
      camera: Unit,
      trianglePredicate: TrianglePickingPredicate
    ): PickingInfo = js.native
    def pick(x: Double, y: Double, predicate: Unit, fastCheck: Boolean, camera: Nullable[Camera]): PickingInfo = js.native
    def pick(
      x: Double,
      y: Double,
      predicate: Unit,
      fastCheck: Boolean,
      camera: Nullable[Camera],
      trianglePredicate: TrianglePickingPredicate
    ): PickingInfo = js.native
    def pick(
      x: Double,
      y: Double,
      predicate: Unit,
      fastCheck: Unit,
      camera: Unit,
      trianglePredicate: TrianglePickingPredicate
    ): PickingInfo = js.native
    def pick(x: Double, y: Double, predicate: Unit, fastCheck: Unit, camera: Nullable[Camera]): PickingInfo = js.native
    def pick(
      x: Double,
      y: Double,
      predicate: Unit,
      fastCheck: Unit,
      camera: Nullable[Camera],
      trianglePredicate: TrianglePickingPredicate
    ): PickingInfo = js.native
    
    /** Launch a ray to try to pick a sprite in the scene
      * @param x position on screen
      * @param y position on screen
      * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
      * @param fastCheck defines if the first intersection will be used (and not the closest)
      * @param camera camera to use for computing the picking ray. Can be set to null. In this case, the scene.activeCamera will be used
      * @returns a PickingInfo
      */
    def pickSprite(x: Double, y: Double): Nullable[PickingInfo] = js.native
    def pickSprite(x: Double, y: Double, predicate: js.Function1[/* sprite */ Sprite, Boolean]): Nullable[PickingInfo] = js.native
    def pickSprite(x: Double, y: Double, predicate: js.Function1[/* sprite */ Sprite, Boolean], fastCheck: Boolean): Nullable[PickingInfo] = js.native
    def pickSprite(
      x: Double,
      y: Double,
      predicate: js.Function1[/* sprite */ Sprite, Boolean],
      fastCheck: Boolean,
      camera: Camera
    ): Nullable[PickingInfo] = js.native
    def pickSprite(
      x: Double,
      y: Double,
      predicate: js.Function1[/* sprite */ Sprite, Boolean],
      fastCheck: Unit,
      camera: Camera
    ): Nullable[PickingInfo] = js.native
    def pickSprite(x: Double, y: Double, predicate: Unit, fastCheck: Boolean): Nullable[PickingInfo] = js.native
    def pickSprite(x: Double, y: Double, predicate: Unit, fastCheck: Boolean, camera: Camera): Nullable[PickingInfo] = js.native
    def pickSprite(x: Double, y: Double, predicate: Unit, fastCheck: Unit, camera: Camera): Nullable[PickingInfo] = js.native
    
    /** Use the given ray to pick a sprite in the scene
      * @param ray The ray (in world space) to use to pick meshes
      * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
      * @param fastCheck defines if the first intersection will be used (and not the closest)
      * @param camera camera to use. Can be set to null. In this case, the scene.activeCamera will be used
      * @returns a PickingInfo
      */
    def pickSpriteWithRay(ray: Ray): Nullable[PickingInfo] = js.native
    def pickSpriteWithRay(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, Boolean]): Nullable[PickingInfo] = js.native
    def pickSpriteWithRay(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, Boolean], fastCheck: Boolean): Nullable[PickingInfo] = js.native
    def pickSpriteWithRay(
      ray: Ray,
      predicate: js.Function1[/* sprite */ Sprite, Boolean],
      fastCheck: Boolean,
      camera: Camera
    ): Nullable[PickingInfo] = js.native
    def pickSpriteWithRay(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, Boolean], fastCheck: Unit, camera: Camera): Nullable[PickingInfo] = js.native
    def pickSpriteWithRay(ray: Ray, predicate: Unit, fastCheck: Boolean): Nullable[PickingInfo] = js.native
    def pickSpriteWithRay(ray: Ray, predicate: Unit, fastCheck: Boolean, camera: Camera): Nullable[PickingInfo] = js.native
    def pickSpriteWithRay(ray: Ray, predicate: Unit, fastCheck: Unit, camera: Camera): Nullable[PickingInfo] = js.native
    
    /** Launch a ray to try to pick a mesh in the scene using only bounding information of the main mesh (not using submeshes)
      * @param x position on screen
      * @param y position on screen
      * @param predicate Predicate function used to determine eligible meshes. Can be set to null. In this case, a mesh must be enabled, visible and with isPickable set to true
      * @param fastCheck defines if the first intersection will be used (and not the closest)
      * @param camera to use for computing the picking ray. Can be set to null. In this case, the scene.activeCamera will be used
      * @returns a PickingInfo (Please note that some info will not be set like distance, bv, bu and everything that cannot be capture by only using bounding infos)
      */
    def pickWithBoundingInfo(x: Double, y: Double): Nullable[PickingInfo] = js.native
    def pickWithBoundingInfo(x: Double, y: Double, predicate: js.Function1[/* mesh */ AbstractMesh, Boolean]): Nullable[PickingInfo] = js.native
    def pickWithBoundingInfo(
      x: Double,
      y: Double,
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      fastCheck: Boolean
    ): Nullable[PickingInfo] = js.native
    def pickWithBoundingInfo(
      x: Double,
      y: Double,
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      fastCheck: Boolean,
      camera: Nullable[Camera]
    ): Nullable[PickingInfo] = js.native
    def pickWithBoundingInfo(
      x: Double,
      y: Double,
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      fastCheck: Unit,
      camera: Nullable[Camera]
    ): Nullable[PickingInfo] = js.native
    def pickWithBoundingInfo(x: Double, y: Double, predicate: Unit, fastCheck: Boolean): Nullable[PickingInfo] = js.native
    def pickWithBoundingInfo(x: Double, y: Double, predicate: Unit, fastCheck: Boolean, camera: Nullable[Camera]): Nullable[PickingInfo] = js.native
    def pickWithBoundingInfo(x: Double, y: Double, predicate: Unit, fastCheck: Unit, camera: Nullable[Camera]): Nullable[PickingInfo] = js.native
    
    /** Use the given ray to pick a mesh in the scene
      * @param ray The ray to use to pick meshes
      * @param predicate Predicate function used to determine eligible meshes. Can be set to null. In this case, a mesh must have isPickable set to true
      * @param fastCheck defines if the first intersection will be used (and not the closest)
      * @param trianglePredicate defines an optional predicate used to select faces when a mesh intersection is detected
      * @returns a PickingInfo
      */
    def pickWithRay(ray: Ray): Nullable[PickingInfo] = js.native
    def pickWithRay(ray: Ray, predicate: js.Function1[/* mesh */ AbstractMesh, Boolean]): Nullable[PickingInfo] = js.native
    def pickWithRay(ray: Ray, predicate: js.Function1[/* mesh */ AbstractMesh, Boolean], fastCheck: Boolean): Nullable[PickingInfo] = js.native
    def pickWithRay(
      ray: Ray,
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      fastCheck: Boolean,
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[PickingInfo] = js.native
    def pickWithRay(
      ray: Ray,
      predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
      fastCheck: Unit,
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[PickingInfo] = js.native
    def pickWithRay(ray: Ray, predicate: Unit, fastCheck: Boolean): Nullable[PickingInfo] = js.native
    def pickWithRay(ray: Ray, predicate: Unit, fastCheck: Boolean, trianglePredicate: TrianglePickingPredicate): Nullable[PickingInfo] = js.native
    def pickWithRay(ray: Ray, predicate: Unit, fastCheck: Unit, trianglePredicate: TrianglePickingPredicate): Nullable[PickingInfo] = js.native
    
    /**
      * Gets or sets a predicate used to select candidate meshes for a pointer down event
      */
    def pointerDownPredicate(Mesh: AbstractMesh): Boolean = js.native
    
    /**
      * Gets or sets a predicate used to select candidate meshes for a pointer move event
      */
    def pointerMovePredicate(Mesh: AbstractMesh): Boolean = js.native
    
    /**
      * Gets or sets a predicate used to select candidate faces for a pointer move event
      */
    var pointerMoveTrianglePredicate: js.UndefOr[
        js.Function4[/* p0 */ Vector3, /* p1 */ Vector3, /* p2 */ Vector3, /* ray */ Ray, Boolean]
      ] = js.native
    
    /**
      * Gets or sets a predicate used to select candidate meshes for a pointer up event
      */
    def pointerUpPredicate(Mesh: AbstractMesh): Boolean = js.native
    
    /**
      * Gets or sets the current on-screen X position of the pointer
      */
    def pointerX: Double = js.native
    def pointerX_=(value: Double): Unit = js.native
    
    /**
      * Gets or sets the current on-screen Y position of the pointer
      */
    def pointerY: Double = js.native
    def pointerY_=(value: Double): Unit = js.native
    
    /**
      * Gets the current postprocess manager
      */
    var postProcessManager: PostProcessManager = js.native
    
    /**
      * Gets the postprocess render pipeline manager
      * @see https://doc.babylonjs.com/features/featuresDeepDive/postProcesses/postProcessRenderPipeline
      * @see https://doc.babylonjs.com/features/featuresDeepDive/postProcesses/defaultRenderingPipeline
      */
    val postProcessRenderPipelineManager: PostProcessRenderPipelineManager = js.native
    
    /**
      * Gets or sets a boolean indicating if postprocesses are enabled on this scene
      */
    var postProcessesEnabled: Boolean = js.native
    
    /**
      * Flag indicating that the frame buffer binding is handled by another component
      */
    def prePass: Boolean = js.native
    
    /**
      * This is used to call preventDefault() on pointer down
      * in order to block unwanted artifacts like system double clicks
      */
    var preventDefaultOnPointerDown: Boolean = js.native
    
    /**
      * This is used to call preventDefault() on pointer up
      * in order to block unwanted artifacts like system double clicks
      */
    var preventDefaultOnPointerUp: Boolean = js.native
    
    /**
      * Gets or sets a boolean indicating if probes are enabled on this scene
      */
    var probesEnabled: Boolean = js.native
    
    /**
      * Gets or sets a boolean indicating if procedural textures are enabled on this scene
      */
    var proceduralTexturesEnabled: Boolean = js.native
    
    /**
      * Add a new geometry to this scene
      * @param geometry defines the geometry to be added to the scene.
      * @param force defines if the geometry must be pushed even if a geometry with this id already exists
      * @returns a boolean defining if the geometry was added or not
      */
    def pushGeometry(geometry: Geometry): Boolean = js.native
    def pushGeometry(geometry: Geometry, force: Boolean): Boolean = js.native
    
    /**
      * Registers a function to be called after every frame render
      * @param func defines the function to register
      */
    def registerAfterRender(func: js.Function0[Unit]): Unit = js.native
    
    /**
      * Registers a function to be called before every frame render
      * @param func defines the function to register
      */
    def registerBeforeRender(func: js.Function0[Unit]): Unit = js.native
    
    /**
      * Removes the given action manager from this scene.
      * @deprecated
      * @param toRemove The action manager to remove
      * @returns The index of the removed action manager
      */
    def removeActionManager(toRemove: AbstractActionManager): Double = js.native
    
    /**
      * Remove a animation for the list of scene's animations
      * @param toRemove defines the animation to remove
      * @returns the index where the animation was in the animation list
      */
    def removeAnimation(toRemove: Animation): Double = js.native
    
    /**
      * Removes the given animation group from this scene.
      * @param toRemove The animation group to remove
      * @returns The index of the removed animation group
      */
    def removeAnimationGroup(toRemove: AnimationGroup): Double = js.native
    
    /**
      * Remove a camera for the list of scene's cameras
      * @param toRemove defines the camera to remove
      * @returns the index where the camera was in the camera list
      */
    def removeCamera(toRemove: Camera): Double = js.native
    
    /**
      * Remove an externally attached data from the Engine instance
      * @param key the unique key that identifies the data
      * @returns true if the data was successfully removed, false if it doesn't exist
      */
    def removeExternalData(key: String): Boolean = js.native
    
    /**
      * Removes an existing geometry
      * @param geometry defines the geometry to be removed from the scene
      * @returns a boolean defining if the geometry was removed or not
      */
    def removeGeometry(geometry: Geometry): Boolean = js.native
    
    /**
      * Remove a light for the list of scene's lights
      * @param toRemove defines the light to remove
      * @returns the index where the light was in the light list
      */
    def removeLight(toRemove: Light): Double = js.native
    
    /**
      * Removes the given material from this scene.
      * @param toRemove The material to remove
      * @returns The index of the removed material
      */
    def removeMaterial(toRemove: Material): Double = js.native
    
    /**
      * Remove a mesh for the list of scene's meshes
      * @param toRemove defines the mesh to remove
      * @param recursive if all child meshes should also be removed from the scene
      * @returns the index where the mesh was in the mesh list
      */
    def removeMesh(toRemove: AbstractMesh): Double = js.native
    def removeMesh(toRemove: AbstractMesh, recursive: Boolean): Double = js.native
    
    /**
      * Remove a morph target for the list of scene's morph targets
      * @param toRemove defines the morph target to remove
      * @returns the index where the morph target was in the morph target list
      */
    def removeMorphTargetManager(toRemove: MorphTargetManager): Double = js.native
    
    /**
      * Removes the given multi-material from this scene.
      * @param toRemove The multi-material to remove
      * @returns The index of the removed multi-material
      */
    def removeMultiMaterial(toRemove: MultiMaterial): Double = js.native
    
    /**
      * Remove a particle system for the list of scene's particle systems
      * @param toRemove defines the particle system to remove
      * @returns the index where the particle system was in the particle system list
      */
    def removeParticleSystem(toRemove: IParticleSystem): Double = js.native
    
    /**
      * Remove a pending data from the loading list which has previously been added with addPendingData.
      * @param data defines the object to remove from the pending list
      */
    def removePendingData(data: Any): Unit = js.native
    
    /**
      * Remove a skeleton for the list of scene's skeletons
      * @param toRemove defines the skeleton to remove
      * @returns the index where the skeleton was in the skeleton list
      */
    def removeSkeleton(toRemove: Skeleton): Double = js.native
    
    /**
      * Removes the given texture from this scene.
      * @param toRemove The texture to remove
      * @returns The index of the removed texture
      */
    def removeTexture(toRemove: BaseTexture): Double = js.native
    
    /**
      * Remove a transform node for the list of scene's transform nodes
      * @param toRemove defines the transform node to remove
      * @returns the index where the transform node was in the transform node list
      */
    def removeTransformNode(toRemove: TransformNode): Double = js.native
    
    /**
      * Render the scene
      * @param updateCameras defines a boolean indicating if cameras must update according to their inputs (true by default)
      * @param ignoreAnimations defines a boolean indicating if animations should not be executed (false by default)
      */
    def render(): Unit = js.native
    def render(updateCameras: Boolean): Unit = js.native
    def render(updateCameras: Boolean, ignoreAnimations: Boolean): Unit = js.native
    def render(updateCameras: Unit, ignoreAnimations: Boolean): Unit = js.native
    
    /**
      * Gets or sets a boolean indicating if render targets are enabled on this scene
      */
    var renderTargetsEnabled: Boolean = js.native
    
    /**
      * Gets the scene's rendering manager
      */
    def renderingManager: RenderingManager = js.native
    
    /**
      * Gets or sets a boolean indicating if lights must be sorted by priority (off by default)
      * This is useful if there are more lights that the maximum simulteanous authorized
      */
    var requireLightSorting: Boolean = js.native
    
    /**
      * For internal use only. Please do not use.
      */
    var reservedDataStore: Any = js.native
    
    /** Resets all cached information relative to material (including effect and visibility) */
    def resetCachedMaterial(): Unit = js.native
    
    /**
      * Resets the draw wrappers cache of all meshes
      * @param passId If provided, releases only the draw wrapper corresponding to this render pass id
      */
    def resetDrawCache(): Unit = js.native
    def resetDrawCache(passId: Double): Unit = js.native
    
    /**
      * Resets the last animation time frame.
      * Useful to override when animations start running when loading a scene for the first time.
      */
    def resetLastAnimationTimeFrame(): Unit = js.native
    
    /**
      * Gets the octree used to boost mesh selection (picking)
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/optimizeOctrees
      */
    var selectionOctree: Octree[AbstractMesh] = js.native
    
    /**
      * Sets the active camera of the scene using its Id
      * @param id defines the camera's Id
      * @returns the new active camera or null if none found.
      * @deprecated Please use setActiveCameraById instead
      */
    def setActiveCameraByID(id: String): Nullable[Camera] = js.native
    
    /**
      * sets the active camera of the scene using its Id
      * @param id defines the camera's Id
      * @returns the new active camera or null if none found.
      */
    def setActiveCameraById(id: String): Nullable[Camera] = js.native
    
    /**
      * sets the active camera of the scene using its name
      * @param name defines the camera's name
      * @returns the new active camera or null if none found.
      */
    def setActiveCameraByName(name: String): Nullable[Camera] = js.native
    
    /**
      * Sets the default candidate providers for the scene.
      * This sets the getActiveMeshCandidates, getActiveSubMeshCandidates, getIntersectingSubMeshCandidates
      * and getCollidingSubMeshCandidates to their default function
      */
    def setDefaultCandidateProviders(): Unit = js.native
    
    /**
      * Force the value of meshUnderPointer
      * @param mesh defines the mesh to use
      * @param pointerId optional pointer id when using more than one pointer
      * @param pickResult optional pickingInfo data used to find mesh
      */
    def setPointerOverMesh(mesh: Nullable[AbstractMesh]): Unit = js.native
    def setPointerOverMesh(mesh: Nullable[AbstractMesh], pointerId: Double): Unit = js.native
    def setPointerOverMesh(mesh: Nullable[AbstractMesh], pointerId: Double, pickResult: Nullable[PickingInfo]): Unit = js.native
    def setPointerOverMesh(mesh: Nullable[AbstractMesh], pointerId: Unit, pickResult: Nullable[PickingInfo]): Unit = js.native
    
    /**
      * Force the sprite under the pointer
      * @param sprite defines the sprite to use
      */
    def setPointerOverSprite(sprite: Nullable[Sprite]): Unit = js.native
    
    /**
      * Specifies whether or not the stencil and depth buffer are cleared between two rendering groups.
      *
      * @param renderingGroupId The rendering group id corresponding to its index
      * @param autoClearDepthStencil Automatically clears depth and stencil between groups if true.
      * @param depth Automatically clears depth between groups if true and autoClear is true.
      * @param stencil Automatically clears stencil between groups if true and autoClear is true.
      */
    def setRenderingAutoClearDepthStencil(renderingGroupId: Double, autoClearDepthStencil: Boolean): Unit = js.native
    def setRenderingAutoClearDepthStencil(renderingGroupId: Double, autoClearDepthStencil: Boolean, depth: Boolean): Unit = js.native
    def setRenderingAutoClearDepthStencil(renderingGroupId: Double, autoClearDepthStencil: Boolean, depth: Boolean, stencil: Boolean): Unit = js.native
    def setRenderingAutoClearDepthStencil(renderingGroupId: Double, autoClearDepthStencil: Boolean, depth: Unit, stencil: Boolean): Unit = js.native
    
    /**
      * Overrides the default sort function applied in the rendering group to prepare the meshes.
      * This allowed control for front to back rendering or reversly depending of the special needs.
      *
      * @param renderingGroupId The rendering group id corresponding to its index
      * @param opaqueSortCompareFn The opaque queue comparison function use to sort.
      * @param alphaTestSortCompareFn The alpha test queue comparison function use to sort.
      * @param transparentSortCompareFn The transparent queue comparison function use to sort.
      */
    def setRenderingOrder(renderingGroupId: Double): Unit = js.native
    def setRenderingOrder(
      renderingGroupId: Double,
      opaqueSortCompareFn: Unit,
      alphaTestSortCompareFn: Unit,
      transparentSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]
    ): Unit = js.native
    def setRenderingOrder(
      renderingGroupId: Double,
      opaqueSortCompareFn: Unit,
      alphaTestSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]
    ): Unit = js.native
    def setRenderingOrder(
      renderingGroupId: Double,
      opaqueSortCompareFn: Unit,
      alphaTestSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]],
      transparentSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]
    ): Unit = js.native
    def setRenderingOrder(
      renderingGroupId: Double,
      opaqueSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]
    ): Unit = js.native
    def setRenderingOrder(
      renderingGroupId: Double,
      opaqueSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]],
      alphaTestSortCompareFn: Unit,
      transparentSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]
    ): Unit = js.native
    def setRenderingOrder(
      renderingGroupId: Double,
      opaqueSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]],
      alphaTestSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]
    ): Unit = js.native
    def setRenderingOrder(
      renderingGroupId: Double,
      opaqueSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]],
      alphaTestSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]],
      transparentSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]
    ): Unit = js.native
    
    /**
      * Sets the scene ubo
      * @param ubo the ubo to set for the scene
      */
    def setSceneUniformBuffer(ubo: UniformBuffer): Unit = js.native
    
    /**
      * Sets the step Id used by deterministic lock step
      * @see https://doc.babylonjs.com/features/featuresDeepDive/animation/advanced_animations#deterministic-lockstep
      * @param newStepId defines the step Id
      */
    def setStepId(newStepId: Double): Unit = js.native
    
    /**
      * Sets the current transform matrix
      * @param viewL defines the View matrix to use
      * @param projectionL defines the Projection matrix to use
      * @param viewR defines the right View matrix to use (if provided)
      * @param projectionR defines the right Projection matrix to use (if provided)
      */
    def setTransformMatrix(viewL: Matrix, projectionL: Matrix): Unit = js.native
    def setTransformMatrix(viewL: Matrix, projectionL: Matrix, viewR: Unit, projectionR: Matrix): Unit = js.native
    def setTransformMatrix(viewL: Matrix, projectionL: Matrix, viewR: Matrix): Unit = js.native
    def setTransformMatrix(viewL: Matrix, projectionL: Matrix, viewR: Matrix, projectionR: Matrix): Unit = js.native
    
    def shadowsEnabled: Boolean = js.native
    /**
      * Gets or sets a boolean indicating if shadows are enabled on this scene
      */
    def shadowsEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Gets or sets the simplification queue attached to the scene
      * @see https://doc.babylonjs.com/features/featuresDeepDive/mesh/simplifyingMeshes
      */
    var simplificationQueue: SimplificationQueue = js.native
    
    /**
      * Use this method to simulate a pointer down on a mesh
      * The pickResult parameter can be obtained from a scene.pick or scene.pickWithRay
      * @param pickResult pickingInfo of the object wished to simulate pointer event on
      * @param pointerEventInit pointer event state to be used when simulating the pointer event (eg. pointer id for multitouch)
      * @returns the current scene
      */
    def simulatePointerDown(pickResult: PickingInfo): Scene = js.native
    def simulatePointerDown(pickResult: PickingInfo, pointerEventInit: PointerEventInit): Scene = js.native
    
    /**
      * Use this method to simulate a pointer move on a mesh
      * The pickResult parameter can be obtained from a scene.pick or scene.pickWithRay
      * @param pickResult pickingInfo of the object wished to simulate pointer event on
      * @param pointerEventInit pointer event state to be used when simulating the pointer event (eg. pointer id for multitouch)
      * @returns the current scene
      */
    def simulatePointerMove(pickResult: PickingInfo): Scene = js.native
    def simulatePointerMove(pickResult: PickingInfo, pointerEventInit: PointerEventInit): Scene = js.native
    
    /**
      * Use this method to simulate a pointer up on a mesh
      * The pickResult parameter can be obtained from a scene.pick or scene.pickWithRay
      * @param pickResult pickingInfo of the object wished to simulate pointer event on
      * @param pointerEventInit pointer event state to be used when simulating the pointer event (eg. pointer id for multitouch)
      * @param doubleTap indicates that the pointer up event should be considered as part of a double click (false by default)
      * @returns the current scene
      */
    def simulatePointerUp(pickResult: PickingInfo): Scene = js.native
    def simulatePointerUp(pickResult: PickingInfo, pointerEventInit: Unit, doubleTap: Boolean): Scene = js.native
    def simulatePointerUp(pickResult: PickingInfo, pointerEventInit: PointerEventInit): Scene = js.native
    def simulatePointerUp(pickResult: PickingInfo, pointerEventInit: PointerEventInit, doubleTap: Boolean): Scene = js.native
    
    def skeletonsEnabled: Boolean = js.native
    /**
      * Gets or sets a boolean indicating if skeletons are enabled on this scene
      */
    def skeletonsEnabled_=(value: Boolean): Unit = js.native
    
    def skipFrustumClipping: Boolean = js.native
    /**
      * Gets or sets a boolean indicating if we should skip the frustum clipping part of the active meshes selection
      */
    def skipFrustumClipping_=(value: Boolean): Unit = js.native
    
    /**
      * Gets or sets a boolean indicating if the user want to entirely skip the picking phase when a pointer down event occurs.
      */
    var skipPointerDownPicking: Boolean = js.native
    
    /**
      * Gets or sets a boolean indicating if the user want to entirely skip the picking phase when a pointer move event occurs.
      */
    var skipPointerMovePicking: Boolean = js.native
    
    /**
      * Gets or sets a boolean indicating if the user want to entirely skip the picking phase when a pointer up event occurs.  Off by default.
      */
    var skipPointerUpPicking: Boolean = js.native
    
    /**
      * Sorts the list list based on light priorities
      */
    def sortLightsByPriority(): Unit = js.native
    
    /**
      * The list of sound tracks added to the scene
      * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic
      */
    var soundTracks: Nullable[js.Array[SoundTrack]] = js.native
    
    /**
      * All of the sprite managers added to this scene
      * @see https://doc.babylonjs.com/features/featuresDeepDive/sprites
      */
    var spriteManagers: js.UndefOr[js.Array[ISpriteManager]] = js.native
    
    /**
      * Gets or sets a boolean indicating if sprites are enabled on this scene
      */
    var spritesEnabled: Boolean = js.native
    
    /**
      * Stops and removes all animations that have been applied to the scene
      */
    def stopAllAnimations(): Unit = js.native
    
    /**
      * Will stop the animation of the given target
      * @param target - the target
      * @param animationName - the name of the animation to stop (all animations will be stopped if both this and targetMask are empty)
      * @param targetMask - a function that determines if the animation should be stopped based on its target (all animations will be stopped if both this and animationName are empty)
      */
    def stopAnimation(target: Any): Unit = js.native
    def stopAnimation(target: Any, animationName: String): Unit = js.native
    def stopAnimation(target: Any, animationName: String, targetMask: js.Function1[/* target */ Any, Boolean]): Unit = js.native
    def stopAnimation(target: Any, animationName: Unit, targetMask: js.Function1[/* target */ Any, Boolean]): Unit = js.native
    
    /**
      * Switch active camera
      * @param newCamera defines the new active camera
      * @param attachControl defines if attachControl must be called for the new active camera (default: true)
      */
    def switchActiveCamera(newCamera: Camera): Unit = js.native
    def switchActiveCamera(newCamera: Camera, attachControl: Boolean): Unit = js.native
    
    def texturesEnabled: Boolean = js.native
    /**
      * Gets or sets a boolean indicating if textures are enabled on this scene
      */
    def texturesEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Gets the performance counter for active indices
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/optimize_your_scene#instrumentation
      */
    def totalActiveIndicesPerfCounter: PerfCounter = js.native
    
    /**
      * Gets the performance counter for total vertices
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/optimize_your_scene#instrumentation
      */
    def totalVerticesPerfCounter: PerfCounter = js.native
    
    /**
      * Return a unique id as a string which can serve as an identifier for the scene
      */
    def uid: String = js.native
    
    /**
      * Gets the pointer coordinates without any translation (ie. straight out of the pointer event)
      */
    def unTranslatedPointer: Vector2 = js.native
    
    /**
      * Use this function to restart evaluating active meshes on every frame
      * @returns the current scene
      */
    def unfreezeActiveMeshes(): Scene = js.native
    
    /**
      * Unfreeze all materials
      * A frozen material will not be updatable but should be faster to render
      */
    def unfreezeMaterials(): Unit = js.native
    
    /**
      * Unregisters a function called after every frame render
      * @param func defines the function to unregister
      */
    def unregisterAfterRender(func: js.Function0[Unit]): Unit = js.native
    
    /**
      * Unregisters a function called before every frame render
      * @param func defines the function to unregister
      */
    def unregisterBeforeRender(func: js.Function0[Unit]): Unit = js.native
    
    /**
      * Update the transform matrix to update from the current active camera
      * @param force defines a boolean used to force the update even if cache is up to date
      */
    def updateTransformMatrix(): Unit = js.native
    def updateTransformMatrix(force: Boolean): Unit = js.native
    
    /** @internal */
    val useClonedMeshMap: Boolean = js.native
    
    /**
      * Gets or sets a boolean indicating if a constant deltatime has to be used
      * This is mostly useful for testing purposes when you do not want the animations to scale with the framerate
      */
    var useConstantAnimationDeltaTime: Boolean = js.native
    
    /**
      * Defines if texture loading must be delayed
      * If true, textures will only be loaded when they need to be rendered
      */
    var useDelayedTextureLoading: Boolean = js.native
    
    /** @internal */
    val useMaterialMeshMap: Boolean = js.native
    
    /**
      * Flag to indicate if we want to use order independent transparency, despite the performance hit
      */
    var useOrderIndependentTransparency: Boolean = js.native
    
    def useRightHandedSystem: Boolean = js.native
    /**
      * Gets or sets a boolean indicating if the scene must use right-handed coordinates system
      */
    def useRightHandedSystem_=(value: Boolean): Unit = js.native
    
    /**
      * Returns a promise that resolves when the scene is ready
      * @param checkRenderTargets true to also check that the meshes rendered as part of a render target are ready (default: false)
      * @returns A promise that resolves when the scene is ready
      */
    def whenReadyAsync(): js.Promise[Unit] = js.native
    def whenReadyAsync(checkRenderTargets: Boolean): js.Promise[Unit] = js.native
  }
  /* static members */
  object Scene {
    
    @JSImport("babylonjs/scene", "Scene")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Factory used to create the a collision coordinator.
      * @returns The collision coordinator
      */
    inline def CollisionCoordinatorFactory(): ICollisionCoordinator = ^.asInstanceOf[js.Dynamic].applyDynamic("CollisionCoordinatorFactory")().asInstanceOf[ICollisionCoordinator]
    
    /**
      * Factory used to create the default material.
      * @param scene The scene to create the material for
      * @returns The default material
      */
    inline def DefaultMaterialFactory(scene: Scene): Material = ^.asInstanceOf[js.Dynamic].applyDynamic("DefaultMaterialFactory")(scene.asInstanceOf[js.Any]).asInstanceOf[Material]
    
    /** The fog density is following an exponential function */
    @JSImport("babylonjs/scene", "Scene.FOGMODE_EXP")
    @js.native
    val FOGMODE_EXP: Double = js.native
    
    /** The fog density is following an exponential function faster than FOGMODE_EXP */
    @JSImport("babylonjs/scene", "Scene.FOGMODE_EXP2")
    @js.native
    val FOGMODE_EXP2: Double = js.native
    
    /** The fog density is following a linear function. */
    @JSImport("babylonjs/scene", "Scene.FOGMODE_LINEAR")
    @js.native
    val FOGMODE_LINEAR: Double = js.native
    
    /** The fog is deactivated */
    @JSImport("babylonjs/scene", "Scene.FOGMODE_NONE")
    @js.native
    val FOGMODE_NONE: Double = js.native
    
    /**
      * Gets or sets the maximum deltatime when deterministic lock step is enabled
      * @see https://doc.babylonjs.com/features/featuresDeepDive/animation/advanced_animations#deterministic-lockstep
      */
    @JSImport("babylonjs/scene", "Scene.MaxDeltaTime")
    @js.native
    def MaxDeltaTime: Double = js.native
    inline def MaxDeltaTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MaxDeltaTime")(x.asInstanceOf[js.Any])
    
    /**
      * Gets or sets the minimum deltatime when deterministic lock step is enabled
      * @see https://doc.babylonjs.com/features/featuresDeepDive/animation/advanced_animations#deterministic-lockstep
      */
    @JSImport("babylonjs/scene", "Scene.MinDeltaTime")
    @js.native
    def MinDeltaTime: Double = js.native
    inline def MinDeltaTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MinDeltaTime")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait ScenePerformancePriority extends StObject
  @JSImport("babylonjs/scene", "ScenePerformancePriority")
  @js.native
  object ScenePerformancePriority extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ScenePerformancePriority & Double] = js.native
    
    /** Performance will be top priority */
    @js.native
    sealed trait Aggressive
      extends StObject
         with ScenePerformancePriority
    /* 2 */ val Aggressive: typings.babylonjs.sceneMod.ScenePerformancePriority.Aggressive & Double = js.native
    
    /** Default mode. No change. Performance will be treated as less important than backward compatibility */
    @js.native
    sealed trait BackwardCompatible
      extends StObject
         with ScenePerformancePriority
    /* 0 */ val BackwardCompatible: typings.babylonjs.sceneMod.ScenePerformancePriority.BackwardCompatible & Double = js.native
    
    /** Some performance options will be turned on trying to strike a balance between perf and ease of use */
    @js.native
    sealed trait Intermediate
      extends StObject
         with ScenePerformancePriority
    /* 1 */ val Intermediate: typings.babylonjs.sceneMod.ScenePerformancePriority.Intermediate & Double = js.native
  }
  
  trait IDisposable extends StObject {
    
    /**
      * Releases all held resources
      */
    def dispose(): Unit
  }
  object IDisposable {
    
    inline def apply(dispose: () => Unit): IDisposable = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
      __obj.asInstanceOf[IDisposable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDisposable] (val x: Self) extends AnyVal {
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    }
  }
  
  trait SceneOptions extends StObject {
    
    /**
      * Defines that each mesh of the scene should keep up-to-date a map of referencing cloned meshes for fast disposing
      * It will improve performance when the number of mesh becomes important, but might consume a bit more memory
      */
    var useClonedMeshMap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines that scene should keep up-to-date a map of geometry to enable fast look-up by uniqueId
      * It will improve performance when the number of geometries becomes important.
      */
    var useGeometryUniqueIdsMap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines that each material of the scene should keep up-to-date a map of referencing meshes for fast disposing
      * It will improve performance when the number of mesh becomes important, but might consume a bit more memory
      */
    var useMaterialMeshMap: js.UndefOr[Boolean] = js.undefined
    
    /** Defines if the creation of the scene should impact the engine (Eg. UtilityLayer's scene) */
    var virtual: js.UndefOr[Boolean] = js.undefined
  }
  object SceneOptions {
    
    inline def apply(): SceneOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SceneOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SceneOptions] (val x: Self) extends AnyVal {
      
      inline def setUseClonedMeshMap(value: Boolean): Self = StObject.set(x, "useClonedMeshMap", value.asInstanceOf[js.Any])
      
      inline def setUseClonedMeshMapUndefined: Self = StObject.set(x, "useClonedMeshMap", js.undefined)
      
      inline def setUseGeometryUniqueIdsMap(value: Boolean): Self = StObject.set(x, "useGeometryUniqueIdsMap", value.asInstanceOf[js.Any])
      
      inline def setUseGeometryUniqueIdsMapUndefined: Self = StObject.set(x, "useGeometryUniqueIdsMap", js.undefined)
      
      inline def setUseMaterialMeshMap(value: Boolean): Self = StObject.set(x, "useMaterialMeshMap", value.asInstanceOf[js.Any])
      
      inline def setUseMaterialMeshMapUndefined: Self = StObject.set(x, "useMaterialMeshMap", js.undefined)
      
      inline def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      inline def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    trait Scene extends StObject {
      
      /**
        * Gets a bone using its Id
        * @param id defines the bone's Id
        * @returns the bone or null if not found
        * @deprecated Please use getBoneById instead
        */
      def getBoneByID(id: String): Nullable[Bone]
      
      /**
        * Gets a camera using its Id
        * @param id defines the Id to look for
        * @returns the camera or null if not found
        * @deprecated Please use getCameraById instead
        */
      def getCameraByID(id: String): Nullable[Camera]
      
      /**
        * Gets a camera using its unique Id
        * @param uniqueId defines the unique Id to look for
        * @returns the camera or null if not found
        * @deprecated Please use getCameraByUniqueId instead
        */
      def getCameraByUniqueID(uniqueId: Double): Nullable[Camera]
      
      /**
        * Gets a geometry using its Id
        * @param id defines the geometry's Id
        * @returns the geometry or null if none found.
        * @deprecated Please use getGeometryById instead
        */
      def getGeometryByID(id: String): Nullable[Geometry]
      
      /**
        * Gets a the last added node (Mesh, Camera, Light) using a given Id
        * @param id defines the Id to search for
        * @returns the found node or null if not found at all
        * @deprecated Please use getLastEntryById instead
        */
      def getLastEntryByID(id: String): Nullable[Node]
      
      /**
        * Gets a the last added material using a given id
        * @param id defines the material's Id
        * @returns the last material with the given id or null if none found.
        * @deprecated Please use getLastMaterialById instead
        */
      def getLastMaterialByID(id: String): Nullable[Material]
      
      /**
        * Gets a the last added mesh using a given Id
        * @param id defines the Id to search for
        * @returns the found mesh or null if not found at all.
        * @deprecated Please use getLastMeshById instead
        */
      def getLastMeshByID(id: String): Nullable[AbstractMesh]
      
      /**
        * Gets a skeleton using a given Id (if many are found, this function will pick the last one)
        * @param id defines the Id to search for
        * @returns the found skeleton or null if not found at all.
        * @deprecated Please use getLastSkeletonById instead
        */
      def getLastSkeletonByID(id: String): Nullable[Skeleton]
      
      /**
        * Gets a light node using its Id
        * @param id defines the light's Id
        * @returns the light or null if none found.
        * @deprecated Please use getLightById instead
        */
      def getLightByID(id: String): Nullable[Light]
      
      /**
        * Gets a light node using its scene-generated unique Id
        * @param uniqueId defines the light's unique Id
        * @returns the light or null if none found.
        * @deprecated Please use getLightByUniqueId instead
        */
      def getLightByUniqueID(uniqueId: Double): Nullable[Light]
      
      /**
        * Get a material using its id
        * @param id defines the material's Id
        * @returns the material or null if none found.
        * @deprecated Please use getMaterialById instead
        */
      def getMaterialByID(id: String): Nullable[Material]
      
      /**
        * Gets the first added mesh found of a given Id
        * @param id defines the Id to search for
        * @returns the mesh found or null if not found at all
        * @deprecated Please use getMeshById instead
        */
      def getMeshByID(id: String): Nullable[AbstractMesh]
      
      /**
        * Gets a mesh with its auto-generated unique Id
        * @param uniqueId defines the unique Id to search for
        * @returns the found mesh or null if not found at all.
        * @deprecated Please use getMeshByUniqueId instead
        */
      def getMeshByUniqueID(uniqueId: Double): Nullable[AbstractMesh]
      
      /**
        * Gets a list of meshes using their Id
        * @param id defines the Id to search for
        * @returns a list of meshes
        * @deprecated Please use getMeshesById instead
        */
      def getMeshesByID(id: String): js.Array[AbstractMesh]
      
      /**
        * Gets a node (Mesh, Camera, Light) using a given Id
        * @param id defines the Id to search for
        * @returns the found node or null if not found at all
        * @deprecated Please use getNodeById instead
        */
      def getNodeByID(id: String): Nullable[Node]
      
      /**
        * Gets a particle system by Id
        * @param id defines the particle system Id
        * @returns the corresponding system or null if none found
        * @deprecated Please use getParticleSystemById instead
        */
      def getParticleSystemByID(id: String): Nullable[IParticleSystem]
      
      /**
        * Get a texture using its unique id
        * @param uniqueId defines the texture's unique id
        * @returns the texture or null if none found.
        * @deprecated Please use getTextureByUniqueId instead
        */
      def getTextureByUniqueID(uniqueId: Double): Nullable[BaseTexture]
      
      /**
        * Gets the first added transform node found of a given Id
        * @param id defines the Id to search for
        * @returns the found transform node or null if not found at all.
        * @deprecated Please use getTransformNodeById instead
        */
      def getTransformNodeByID(id: String): Nullable[TransformNode]
      
      /**
        * Gets a transform node with its auto-generated unique Id
        * @param uniqueId defines the unique Id to search for
        * @returns the found transform node or null if not found at all.
        * @deprecated Please use getTransformNodeByUniqueId instead
        */
      def getTransformNodeByUniqueID(uniqueId: Double): Nullable[TransformNode]
      
      /**
        * Gets a list of transform nodes using their Id
        * @param id defines the Id to search for
        * @returns a list of transform nodes
        * @deprecated Please use getTransformNodesById instead
        */
      def getTransformNodesByID(id: String): js.Array[TransformNode]
      
      /**
        * Sets the active camera of the scene using its Id
        * @param id defines the camera's Id
        * @returns the new active camera or null if none found.
        * @deprecated Please use setActiveCameraById instead
        */
      def setActiveCameraByID(id: String): Nullable[Camera]
    }
    object Scene {
      
      inline def apply(
        getBoneByID: String => Nullable[Bone],
        getCameraByID: String => Nullable[Camera],
        getCameraByUniqueID: Double => Nullable[Camera],
        getGeometryByID: String => Nullable[Geometry],
        getLastEntryByID: String => Nullable[Node],
        getLastMaterialByID: String => Nullable[Material],
        getLastMeshByID: String => Nullable[AbstractMesh],
        getLastSkeletonByID: String => Nullable[Skeleton],
        getLightByID: String => Nullable[Light],
        getLightByUniqueID: Double => Nullable[Light],
        getMaterialByID: String => Nullable[Material],
        getMeshByID: String => Nullable[AbstractMesh],
        getMeshByUniqueID: Double => Nullable[AbstractMesh],
        getMeshesByID: String => js.Array[AbstractMesh],
        getNodeByID: String => Nullable[Node],
        getParticleSystemByID: String => Nullable[IParticleSystem],
        getTextureByUniqueID: Double => Nullable[BaseTexture],
        getTransformNodeByID: String => Nullable[TransformNode],
        getTransformNodeByUniqueID: Double => Nullable[TransformNode],
        getTransformNodesByID: String => js.Array[TransformNode],
        setActiveCameraByID: String => Nullable[Camera]
      ): typings.babylonjs.sceneMod.babylonjsSceneAugmentingMod.Scene = {
        val __obj = js.Dynamic.literal(getBoneByID = js.Any.fromFunction1(getBoneByID), getCameraByID = js.Any.fromFunction1(getCameraByID), getCameraByUniqueID = js.Any.fromFunction1(getCameraByUniqueID), getGeometryByID = js.Any.fromFunction1(getGeometryByID), getLastEntryByID = js.Any.fromFunction1(getLastEntryByID), getLastMaterialByID = js.Any.fromFunction1(getLastMaterialByID), getLastMeshByID = js.Any.fromFunction1(getLastMeshByID), getLastSkeletonByID = js.Any.fromFunction1(getLastSkeletonByID), getLightByID = js.Any.fromFunction1(getLightByID), getLightByUniqueID = js.Any.fromFunction1(getLightByUniqueID), getMaterialByID = js.Any.fromFunction1(getMaterialByID), getMeshByID = js.Any.fromFunction1(getMeshByID), getMeshByUniqueID = js.Any.fromFunction1(getMeshByUniqueID), getMeshesByID = js.Any.fromFunction1(getMeshesByID), getNodeByID = js.Any.fromFunction1(getNodeByID), getParticleSystemByID = js.Any.fromFunction1(getParticleSystemByID), getTextureByUniqueID = js.Any.fromFunction1(getTextureByUniqueID), getTransformNodeByID = js.Any.fromFunction1(getTransformNodeByID), getTransformNodeByUniqueID = js.Any.fromFunction1(getTransformNodeByUniqueID), getTransformNodesByID = js.Any.fromFunction1(getTransformNodesByID), setActiveCameraByID = js.Any.fromFunction1(setActiveCameraByID))
        __obj.asInstanceOf[typings.babylonjs.sceneMod.babylonjsSceneAugmentingMod.Scene]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.babylonjs.sceneMod.babylonjsSceneAugmentingMod.Scene] (val x: Self) extends AnyVal {
        
        inline def setGetBoneByID(value: String => Nullable[Bone]): Self = StObject.set(x, "getBoneByID", js.Any.fromFunction1(value))
        
        inline def setGetCameraByID(value: String => Nullable[Camera]): Self = StObject.set(x, "getCameraByID", js.Any.fromFunction1(value))
        
        inline def setGetCameraByUniqueID(value: Double => Nullable[Camera]): Self = StObject.set(x, "getCameraByUniqueID", js.Any.fromFunction1(value))
        
        inline def setGetGeometryByID(value: String => Nullable[Geometry]): Self = StObject.set(x, "getGeometryByID", js.Any.fromFunction1(value))
        
        inline def setGetLastEntryByID(value: String => Nullable[Node]): Self = StObject.set(x, "getLastEntryByID", js.Any.fromFunction1(value))
        
        inline def setGetLastMaterialByID(value: String => Nullable[Material]): Self = StObject.set(x, "getLastMaterialByID", js.Any.fromFunction1(value))
        
        inline def setGetLastMeshByID(value: String => Nullable[AbstractMesh]): Self = StObject.set(x, "getLastMeshByID", js.Any.fromFunction1(value))
        
        inline def setGetLastSkeletonByID(value: String => Nullable[Skeleton]): Self = StObject.set(x, "getLastSkeletonByID", js.Any.fromFunction1(value))
        
        inline def setGetLightByID(value: String => Nullable[Light]): Self = StObject.set(x, "getLightByID", js.Any.fromFunction1(value))
        
        inline def setGetLightByUniqueID(value: Double => Nullable[Light]): Self = StObject.set(x, "getLightByUniqueID", js.Any.fromFunction1(value))
        
        inline def setGetMaterialByID(value: String => Nullable[Material]): Self = StObject.set(x, "getMaterialByID", js.Any.fromFunction1(value))
        
        inline def setGetMeshByID(value: String => Nullable[AbstractMesh]): Self = StObject.set(x, "getMeshByID", js.Any.fromFunction1(value))
        
        inline def setGetMeshByUniqueID(value: Double => Nullable[AbstractMesh]): Self = StObject.set(x, "getMeshByUniqueID", js.Any.fromFunction1(value))
        
        inline def setGetMeshesByID(value: String => js.Array[AbstractMesh]): Self = StObject.set(x, "getMeshesByID", js.Any.fromFunction1(value))
        
        inline def setGetNodeByID(value: String => Nullable[Node]): Self = StObject.set(x, "getNodeByID", js.Any.fromFunction1(value))
        
        inline def setGetParticleSystemByID(value: String => Nullable[IParticleSystem]): Self = StObject.set(x, "getParticleSystemByID", js.Any.fromFunction1(value))
        
        inline def setGetTextureByUniqueID(value: Double => Nullable[BaseTexture]): Self = StObject.set(x, "getTextureByUniqueID", js.Any.fromFunction1(value))
        
        inline def setGetTransformNodeByID(value: String => Nullable[TransformNode]): Self = StObject.set(x, "getTransformNodeByID", js.Any.fromFunction1(value))
        
        inline def setGetTransformNodeByUniqueID(value: Double => Nullable[TransformNode]): Self = StObject.set(x, "getTransformNodeByUniqueID", js.Any.fromFunction1(value))
        
        inline def setGetTransformNodesByID(value: String => js.Array[TransformNode]): Self = StObject.set(x, "getTransformNodesByID", js.Any.fromFunction1(value))
        
        inline def setSetActiveCameraByID(value: String => Nullable[Camera]): Self = StObject.set(x, "setActiveCameraByID", js.Any.fromFunction1(value))
      }
    }
  }
}
