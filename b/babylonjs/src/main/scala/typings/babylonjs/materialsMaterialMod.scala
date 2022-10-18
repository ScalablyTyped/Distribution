package typings.babylonjs

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.abstractSceneMod.AbstractScene
import typings.babylonjs.animationsAnimatableDotinterfaceMod.IAnimatable
import typings.babylonjs.animationsAnimationMod.Animation
import typings.babylonjs.anon.PartialIMaterialCompilati
import typings.babylonjs.enginesImaterialcontextMod.IMaterialContext
import typings.babylonjs.enginesProcessorsShaderProcessingOptionsMod.ShaderCustomProcessingFunction
import typings.babylonjs.materialsDrawWrapperMod.DrawWrapper
import typings.babylonjs.materialsEffectMod.Effect
import typings.babylonjs.materialsMaterialDefinesMod.MaterialDefines
import typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginBindForSubMesh
import typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginCreated
import typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginDisposed
import typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginFillRenderTargetTextures
import typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginGetActiveTextures
import typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginGetAnimatables
import typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginGetDefineNames
import typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginHardBindForSubMesh
import typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginHasRenderTargetTextures
import typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginHasTexture
import typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginIsReadyForSubMesh
import typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginPrepareDefines
import typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginPrepareEffect
import typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginPrepareUniformBuffer
import typings.babylonjs.materialsMaterialPluginManagerMod.MaterialPluginManager
import typings.babylonjs.materialsMaterialStencilStateMod.MaterialStencilState
import typings.babylonjs.materialsShadowDepthWrapperMod.ShadowDepthWrapper
import typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture
import typings.babylonjs.materialsTexturesRenderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.materialsUniformBufferMod.UniformBuffer
import typings.babylonjs.mathsMathDotvectorMod.Matrix
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.meshesSubMeshMod.SubMesh
import typings.babylonjs.miscIInspectableMod.IInspectable
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.miscSmartArrayMod.SmartArray
import typings.babylonjs.renderingPrePassRendererMod.PrePassRenderer
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsMaterialMod {
  
  @JSImport("babylonjs/Materials/material", "Material")
  @js.native
  open class Material protected ()
    extends StObject
       with IAnimatable {
    /**
      * Creates a material instance
      * @param name defines the name of the material
      * @param scene defines the scene to reference
      * @param doNotAdd specifies if the material should be added to the scene
      */
    def this(name: String) = this()
    def this(name: String, scene: Nullable[Scene]) = this()
    def this(name: String, scene: Unit, doNotAdd: Boolean) = this()
    def this(name: String, scene: Nullable[Scene], doNotAdd: Boolean) = this()
    
    /**
      * Processes to execute after binding the material to a mesh
      * @param mesh defines the rendered mesh
      * @param effect
      */
    /* protected */ def _afterBind(): Unit = js.native
    /* protected */ def _afterBind(mesh: Unit, effect: Nullable[Effect]): Unit = js.native
    /* protected */ def _afterBind(mesh: Mesh): Unit = js.native
    /* protected */ def _afterBind(mesh: Mesh, effect: Nullable[Effect]): Unit = js.native
    
    /**
      * The alpha value of the material
      */
    /* protected */ var _alpha: Double = js.native
    
    /**
      * Stores the value of the alpha mode
      */
    /* private */ var _alphaMode: Any = js.native
    
    /**
      * Specifies if back face culling is enabled
      */
    /* protected */ var _backFaceCulling: Boolean = js.native
    
    /* private */ var _blockDirtyMechanism: Any = js.native
    
    /**
      * Specifies if the color write state should be cached
      */
    /* private */ var _cachedColorWriteState: Any = js.native
    
    /**
      * Specifies if the depth function state should be cached
      */
    /* private */ var _cachedDepthFunctionState: Any = js.native
    
    /**
      * Specifies if the depth write state should be cached
      */
    /* private */ var _cachedDepthWriteState: Any = js.native
    
    /** @internal */
    def _callbackPluginEventBindForSubMesh(eventData: MaterialPluginBindForSubMesh): Unit = js.native
    
    /** @internal */
    def _callbackPluginEventFillRenderTargetTextures(eventData: MaterialPluginFillRenderTargetTextures): Unit = js.native
    
    def _callbackPluginEventGeneric(id: Double, info: MaterialPluginDisposed): Unit = js.native
    /** @internal */
    def _callbackPluginEventGeneric(id: Double, info: MaterialPluginGetActiveTextures): Unit = js.native
    def _callbackPluginEventGeneric(id: Double, info: MaterialPluginGetAnimatables): Unit = js.native
    def _callbackPluginEventGeneric(id: Double, info: MaterialPluginGetDefineNames): Unit = js.native
    def _callbackPluginEventGeneric(id: Double, info: MaterialPluginHasTexture): Unit = js.native
    def _callbackPluginEventGeneric(id: Double, info: MaterialPluginPrepareEffect): Unit = js.native
    def _callbackPluginEventGeneric(id: Double, info: MaterialPluginPrepareUniformBuffer): Unit = js.native
    
    /** @internal */
    def _callbackPluginEventHardBindForSubMesh(eventData: MaterialPluginHardBindForSubMesh): Unit = js.native
    
    /** @internal */
    def _callbackPluginEventHasRenderTargetTextures(eventData: MaterialPluginHasRenderTargetTextures): Unit = js.native
    
    /** @internal */
    def _callbackPluginEventIsReadyForSubMesh(eventData: MaterialPluginIsReadyForSubMesh): Unit = js.native
    
    /** @internal */
    def _callbackPluginEventPrepareDefines(eventData: MaterialPluginPrepareDefines): Unit = js.native
    
    /** @internal */
    def _callbackPluginEventPrepareDefinesBeforeAttributes(eventData: MaterialPluginPrepareDefines): Unit = js.native
    
    /**
      * Specifies if back or front faces should be culled (when culling is enabled)
      */
    /* protected */ var _cullBackFaces: Boolean = js.native
    
    /** @internal */
    var _dirtyCallbacks: NumberDictionary[js.Function0[Unit]] = js.native
    
    /**
      * Returns true if alpha blending should be disabled.
      */
    /* protected */ def _disableAlphaBlending: Boolean = js.native
    
    /* protected */ var _drawWrapper: DrawWrapper = js.native
    
    /* protected */ var _eventInfo: MaterialPluginCreated & MaterialPluginDisposed & MaterialPluginHasTexture & MaterialPluginIsReadyForSubMesh & MaterialPluginGetDefineNames & MaterialPluginPrepareEffect & MaterialPluginPrepareDefines & MaterialPluginPrepareUniformBuffer & MaterialPluginBindForSubMesh & MaterialPluginGetAnimatables & MaterialPluginGetActiveTextures & MaterialPluginFillRenderTargetTextures & MaterialPluginHasRenderTargetTextures & MaterialPluginHardBindForSubMesh = js.native
    
    /**
      * Stores the fill mode state
      */
    /* private */ var _fillMode: Any = js.native
    
    /**
      * Stores the state specifying if fog should be enabled
      */
    /* private */ var _fogEnabled: Any = js.native
    
    /**
      * Enforces alpha test in opaque or blend mode in order to improve the performances of some situations.
      */
    /* protected */ var _forceAlphaTest: Boolean = js.native
    
    /** @internal */
    def _getDrawWrapper(): DrawWrapper = js.native
    
    /** @internal */
    var _indexInSceneMaterialArray: Double = js.native
    
    /** @internal */
    var _loadedUniqueId: String = js.native
    
    /**
      * Indicates that we need to re-calculated for all submeshes
      */
    /* protected */ def _markAllSubMeshesAsAllDirty(): Unit = js.native
    
    /**
      * Indicates that attributes need to be re-calculated for all submeshes
      */
    /* protected */ def _markAllSubMeshesAsAttributesDirty(): Unit = js.native
    
    /**
      * Marks all submeshes of a material to indicate that their material defines need to be re-calculated
      * @param func defines a function which checks material defines against the submeshes
      */
    /* protected */ def _markAllSubMeshesAsDirty(func: js.Function1[/* defines */ MaterialDefines, Unit]): Unit = js.native
    
    /**
      * Indicates that fresnel and misc need to be re-calculated for all submeshes
      */
    /* protected */ def _markAllSubMeshesAsFresnelAndMiscDirty(): Unit = js.native
    
    /**
      * Indicates that fresnel needs to be re-calculated for all submeshes
      */
    /* protected */ def _markAllSubMeshesAsFresnelDirty(): Unit = js.native
    
    /**
      * Indicates that image processing needs to be re-calculated for all submeshes
      */
    /* protected */ def _markAllSubMeshesAsImageProcessingDirty(): Unit = js.native
    
    /**
      * Indicates that lights need to be re-calculated for all submeshes
      */
    /* protected */ def _markAllSubMeshesAsLightsDirty(): Unit = js.native
    
    /**
      * Indicates that misc needs to be re-calculated for all submeshes
      */
    /* protected */ def _markAllSubMeshesAsMiscDirty(): Unit = js.native
    
    /**
      * Indicates that prepass needs to be re-calculated for all submeshes
      */
    /* protected */ def _markAllSubMeshesAsPrePassDirty(): Unit = js.native
    
    /**
      * Indicates that textures and misc need to be re-calculated for all submeshes
      */
    /* protected */ def _markAllSubMeshesAsTexturesAndMiscDirty(): Unit = js.native
    
    /**
      * Indicates that textures need to be re-calculated for all submeshes
      */
    /* protected */ def _markAllSubMeshesAsTexturesDirty(): Unit = js.native
    
    /**
      * Indicates that the scene should check if the rendering now needs a prepass
      */
    /* protected */ def _markScenePrePassDirty(): Unit = js.native
    
    /**
      * @internal
      * Stores the effects for the material
      */
    /* protected */ var _materialContext: js.UndefOr[IMaterialContext] = js.native
    
    /**
      * Stores the state of the need depth pre-pass value
      */
    /* private */ var _needDepthPrePass: Any = js.native
    
    /* protected */ var _needToBindSceneUbo: Boolean = js.native
    
    /* private */ var _onBindObservable: Any = js.native
    
    /**
      * An observer which watches for bind events
      */
    /* private */ var _onBindObserver: Any = js.native
    
    /**
      * An observer which watches for dispose events
      */
    /* private */ var _onDisposeObserver: Any = js.native
    
    /* protected */ var _onEffectCreatedObservable: Nullable[Observable[typings.babylonjs.anon.Effect]] = js.native
    
    /* private */ var _onUnBindObservable: Any = js.native
    
    /** @internal */
    var _parentContainer: Nullable[AbstractScene] = js.native
    
    /**
      * @internal
      */
    def _preBind(): Boolean = js.native
    def _preBind(effect: Unit, overrideOrientation: Nullable[Double]): Boolean = js.native
    def _preBind(effect: DrawWrapper): Boolean = js.native
    def _preBind(effect: DrawWrapper, overrideOrientation: Nullable[Double]): Boolean = js.native
    def _preBind(effect: Effect): Boolean = js.native
    def _preBind(effect: Effect, overrideOrientation: Nullable[Double]): Boolean = js.native
    
    /**
      * Stores a reference to the scene
      */
    /* private */ var _scene: Any = js.native
    
    /**
      * @internal
      */
    def _setDrawWrapper(drawWrapper: DrawWrapper): Unit = js.native
    
    /**
      * Specifies if material alpha testing should be turned on for the mesh
      * @param mesh defines the mesh to check
      */
    /* protected */ def _shouldTurnAlphaTestOn(mesh: AbstractMesh): Boolean = js.native
    
    /**
      * @internal
      */
    var _storeEffectOnSubMeshes: Boolean = js.native
    
    /**
      * The transparency mode of the material.
      */
    /* protected */ var _transparencyMode: Nullable[Double] = js.native
    
    /**
      * Stores the uniform buffer
      * @internal
      */
    var _uniformBuffer: UniformBuffer = js.native
    
    /** @internal */
    var _uniformBufferLayoutBuilt: Boolean = js.native
    
    /**
      * Specifies if uniform buffers should be used
      */
    /* private */ var _useUBO: Any = js.native
    
    /**
      * Gets or sets a boolean indicating that the material is allowed (if supported) to do shader hot swapping.
      * This means that the material can keep using a previous shader while a new one is being compiled.
      * This is mostly used when shader parallel compilation is supported (true by default)
      */
    var allowShaderHotSwapping: Boolean = js.native
    
    /**
      * Gets the alpha value of the material
      */
    def alpha: Double = js.native
    
    /**
      * Gets the value of the alpha mode
      */
    def alphaMode: Double = js.native
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
    def alphaMode_=(value: Double): Unit = js.native
    
    /**
      * Sets the alpha value of the material
      */
    def alpha_=(value: Double): Unit = js.native
    
    /**
      * Array of animations
      */
    /* CompleteClass */
    var animations: Nullable[js.Array[Animation]] = js.native
    
    /**
      * This allows you to modify the material without marking it as dirty after every change.
      * This function should be used if you need to make more than one dirty-enabling change to the material - adding a texture, setting a new fill mode and so on.
      * The callback will pass the material as an argument, so you can make your changes to it.
      * @param callback the callback to be executed that will update the material
      */
    def atomicMaterialsUpdate(callback: js.Function1[/* material */ this.type, Unit]): Unit = js.native
    
    /**
      * Gets the culling state
      */
    def backFaceCulling: Boolean = js.native
    /**
      * Sets the culling state (true to enable culling, false to disable)
      */
    def backFaceCulling_=(value: Boolean): Unit = js.native
    
    /**
      * Binds the material to the mesh
      * @param world defines the world transformation matrix
      * @param mesh defines the mesh to bind the material to
      */
    def bind(world: Matrix): Unit = js.native
    def bind(world: Matrix, mesh: Mesh): Unit = js.native
    
    /**
      * Binds the view matrix to the effect
      * @param effect defines the effect to bind the view matrix to
      * @param variableName name of the shader variable that will hold the eye position
      */
    def bindEyePosition(effect: Effect): Unit = js.native
    def bindEyePosition(effect: Effect, variableName: String): Unit = js.native
    
    /**
      * Binds the submesh to the material
      * @param world defines the world transformation matrix
      * @param mesh defines the mesh containing the submesh
      * @param subMesh defines the submesh to bind the material to
      */
    def bindForSubMesh(world: Matrix, mesh: Mesh, subMesh: SubMesh): Unit = js.native
    
    /**
      * Binds the world matrix to the material
      * @param world defines the world transformation matrix
      */
    def bindOnlyWorldMatrix(world: Matrix): Unit = js.native
    
    /**
      * Binds the view matrix to the effect
      * @param effect defines the effect to bind the view matrix to
      */
    def bindView(effect: Effect): Unit = js.native
    
    /**
      * Binds the view projection and projection matrices to the effect
      * @param effect defines the effect to bind the view projection and projection matrices to
      */
    def bindViewProjection(effect: Effect): Unit = js.native
    
    /**
      * Block the dirty-mechanism for this specific material
      * When set to false after being true the material will be marked as dirty.
      */
    def blockDirtyMechanism: Boolean = js.native
    def blockDirtyMechanism_=(value: Boolean): Unit = js.native
    
    /**
      * Initializes the uniform buffer layout for the shader.
      */
    def buildUniformLayout(): Unit = js.native
    
    /**
      * If the material can be rendered to several textures with MRT extension
      */
    def canRenderToMRT: Boolean = js.native
    
    /**
      * Specifies if the ready state should be checked on each call
      */
    var checkReadyOnEveryCall: Boolean = js.native
    
    /**
      * Specifies if the ready state should be checked once
      */
    var checkReadyOnlyOnce: Boolean = js.native
    
    /**
      * Makes a duplicate of the material, and gives it a new name
      * @param name defines the new name for the duplicated material
      * @returns the cloned material
      */
    def clone(name: String): Nullable[Material] = js.native
    
    /**
      * Gets the type of faces that should be culled
      */
    def cullBackFaces: Boolean = js.native
    /**
      * Sets the type of faces that should be culled (true for back faces, false for front faces)
      */
    def cullBackFaces_=(value: Boolean): Unit = js.native
    
    def customShaderNameResolve(
      shaderName: String,
      uniforms: js.Array[String],
      uniformBuffers: js.Array[String],
      samplers: js.Array[String],
      defines: js.Array[String]
    ): String = js.native
    def customShaderNameResolve(
      shaderName: String,
      uniforms: js.Array[String],
      uniformBuffers: js.Array[String],
      samplers: js.Array[String],
      defines: js.Array[String],
      attributes: js.Array[String]
    ): String = js.native
    def customShaderNameResolve(
      shaderName: String,
      uniforms: js.Array[String],
      uniformBuffers: js.Array[String],
      samplers: js.Array[String],
      defines: js.Array[String],
      attributes: js.Array[String],
      options: ICustomShaderNameResolveOptions
    ): String = js.native
    def customShaderNameResolve(
      shaderName: String,
      uniforms: js.Array[String],
      uniformBuffers: js.Array[String],
      samplers: js.Array[String],
      defines: js.Array[String],
      attributes: Unit,
      options: ICustomShaderNameResolveOptions
    ): String = js.native
    /**
      * Custom callback helping to override the default shader used in the material.
      */
    def customShaderNameResolve(
      shaderName: String,
      uniforms: js.Array[String],
      uniformBuffers: js.Array[String],
      samplers: js.Array[String],
      defines: MaterialDefines
    ): String = js.native
    def customShaderNameResolve(
      shaderName: String,
      uniforms: js.Array[String],
      uniformBuffers: js.Array[String],
      samplers: js.Array[String],
      defines: MaterialDefines,
      attributes: js.Array[String]
    ): String = js.native
    def customShaderNameResolve(
      shaderName: String,
      uniforms: js.Array[String],
      uniformBuffers: js.Array[String],
      samplers: js.Array[String],
      defines: MaterialDefines,
      attributes: js.Array[String],
      options: ICustomShaderNameResolveOptions
    ): String = js.native
    def customShaderNameResolve(
      shaderName: String,
      uniforms: js.Array[String],
      uniformBuffers: js.Array[String],
      samplers: js.Array[String],
      defines: MaterialDefines,
      attributes: Unit,
      options: ICustomShaderNameResolveOptions
    ): String = js.native
    
    /**
      * Specifies the depth function that should be used. 0 means the default engine function
      */
    var depthFunction: Double = js.native
    
    /**
      * Specifies if color writing should be disabled
      */
    var disableColorWrite: Boolean = js.native
    
    /**
      * Specifies if depth writing should be disabled
      */
    var disableDepthWrite: Boolean = js.native
    
    /**
      * Disposes the material
      * @param forceDisposeEffect specifies if effects should be forcefully disposed
      * @param forceDisposeTextures specifies if textures should be forcefully disposed
      * @param notBoundToMesh specifies if the material that is being disposed is known to be not bound to any mesh
      */
    def dispose(): Unit = js.native
    def dispose(forceDisposeEffect: Boolean): Unit = js.native
    def dispose(forceDisposeEffect: Boolean, forceDisposeTextures: Boolean): Unit = js.native
    def dispose(forceDisposeEffect: Boolean, forceDisposeTextures: Boolean, notBoundToMesh: Boolean): Unit = js.native
    def dispose(forceDisposeEffect: Boolean, forceDisposeTextures: Unit, notBoundToMesh: Boolean): Unit = js.native
    def dispose(forceDisposeEffect: Unit, forceDisposeTextures: Boolean): Unit = js.native
    def dispose(forceDisposeEffect: Unit, forceDisposeTextures: Boolean, notBoundToMesh: Boolean): Unit = js.native
    def dispose(forceDisposeEffect: Unit, forceDisposeTextures: Unit, notBoundToMesh: Boolean): Unit = js.native
    
    /**
      * Specifies if the material should be serialized
      */
    var doNotSerialize: Boolean = js.native
    
    /**
      * Gets the material fill mode
      */
    def fillMode: Double = js.native
    /**
      * Sets the material fill mode
      */
    def fillMode_=(value: Double): Unit = js.native
    
    /**
      * Gets the value of the fog enabled state
      */
    def fogEnabled: Boolean = js.native
    /**
      * Sets the state for enabling fog
      */
    def fogEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Force shader compilation
      * @param mesh defines the mesh associated with this material
      * @param onCompiled defines a function to execute once the material is compiled
      * @param options defines the options to configure the compilation
      * @param onError defines a function to execute if the material fails compiling
      */
    def forceCompilation(mesh: AbstractMesh): Unit = js.native
    def forceCompilation(mesh: AbstractMesh, onCompiled: js.Function1[/* material */ this.type, Unit]): Unit = js.native
    def forceCompilation(
      mesh: AbstractMesh,
      onCompiled: js.Function1[/* material */ this.type, Unit],
      options: Unit,
      onError: js.Function1[/* reason */ String, Unit]
    ): Unit = js.native
    def forceCompilation(
      mesh: AbstractMesh,
      onCompiled: js.Function1[/* material */ this.type, Unit],
      options: PartialIMaterialCompilati
    ): Unit = js.native
    def forceCompilation(
      mesh: AbstractMesh,
      onCompiled: js.Function1[/* material */ this.type, Unit],
      options: PartialIMaterialCompilati,
      onError: js.Function1[/* reason */ String, Unit]
    ): Unit = js.native
    def forceCompilation(
      mesh: AbstractMesh,
      onCompiled: Unit,
      options: Unit,
      onError: js.Function1[/* reason */ String, Unit]
    ): Unit = js.native
    def forceCompilation(mesh: AbstractMesh, onCompiled: Unit, options: PartialIMaterialCompilati): Unit = js.native
    def forceCompilation(
      mesh: AbstractMesh,
      onCompiled: Unit,
      options: PartialIMaterialCompilati,
      onError: js.Function1[/* reason */ String, Unit]
    ): Unit = js.native
    
    /**
      * Force shader compilation
      * @param mesh defines the mesh that will use this material
      * @param options defines additional options for compiling the shaders
      * @returns a promise that resolves when the compilation completes
      */
    def forceCompilationAsync(mesh: AbstractMesh): js.Promise[Unit] = js.native
    def forceCompilationAsync(mesh: AbstractMesh, options: PartialIMaterialCompilati): js.Promise[Unit] = js.native
    
    /**
      * Specifies if depth writing should be forced
      */
    var forceDepthWrite: Boolean = js.native
    
    /**
      * Locks updates for the material
      */
    def freeze(): Unit = js.native
    
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
      * Returns the animatable textures.
      * @returns - Array of animatable textures.
      */
    def getAnimatables(): js.Array[IAnimatable] = js.native
    
    /**
      * Gets the meshes bound to the material
      * @returns an array of meshes bound to the material
      */
    def getBindedMeshes(): js.Array[AbstractMesh] = js.native
    
    /**
      * Gets the class name of the material
      * @returns a string with the class name of the material
      */
    def getClassName(): String = js.native
    
    /**
      * Returns the material effect
      * @returns the effect associated with the material
      */
    def getEffect(): Nullable[Effect] = js.native
    
    /**
      * Callback triggered to get the render target textures
      */
    var getRenderTargetTextures: Nullable[js.Function0[SmartArray[RenderTargetTexture]]] = js.native
    
    /**
      * Returns the current scene
      * @returns a Scene
      */
    def getScene(): Scene = js.native
    
    /**
      * Gets a boolean indicating that current material needs to register RTT
      */
    def hasRenderTargetTextures: Boolean = js.native
    
    /**
      * Specifies if the material uses a texture
      * @param texture defines the texture to check against the material
      * @returns a boolean specifying if the material uses the texture
      */
    def hasTexture(texture: BaseTexture): Boolean = js.native
    
    /**
      * The ID of the material
      */
    var id: String = js.native
    
    /**
      * List of inspectable custom properties (used by the Inspector)
      * @see https://doc.babylonjs.com/how_to/debug_layer#extensibility
      */
    var inspectableCustomProperties: js.Array[IInspectable] = js.native
    
    /**
      * Specifies if updates for the material been locked
      */
    def isFrozen: Boolean = js.native
    
    /**
      * Can this material render to prepass
      */
    def isPrePassCapable: Boolean = js.native
    
    /**
      * Specifies if the material is ready to be used
      * @param mesh defines the mesh to check
      * @param useInstances specifies if instances should be used
      * @returns a boolean indicating if the material is ready to be used
      */
    def isReady(): Boolean = js.native
    def isReady(mesh: Unit, useInstances: Boolean): Boolean = js.native
    def isReady(mesh: AbstractMesh): Boolean = js.native
    def isReady(mesh: AbstractMesh, useInstances: Boolean): Boolean = js.native
    
    /**
      * Specifies that the submesh is ready to be used
      * @param mesh defines the mesh to check
      * @param subMesh defines which submesh to check
      * @param useInstances specifies that instances should be used
      * @returns a boolean indicating that the submesh is ready or not
      */
    def isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh): Boolean = js.native
    def isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh, useInstances: Boolean): Boolean = js.native
    
    /**
      * Marks a define in the material to indicate that it needs to be re-computed
      * @param flag defines a flag used to determine which parts of the material have to be marked as dirty
      */
    def markAsDirty(flag: Double): Unit = js.native
    
    /**
      * Marks the material to indicate that it needs to be re-calculated
      */
    def markDirty(): Unit = js.native
    
    /** @internal */
    var meshMap: Nullable[StringDictionary[js.UndefOr[AbstractMesh]]] = js.native
    
    /**
      * Gets or sets user defined metadata
      */
    var metadata: Any = js.native
    
    /**
      * The name of the material
      */
    var name: String = js.native
    
    /**
      * Specifies whether or not this material should be rendered in alpha blend mode.
      * @returns a boolean specifying if alpha blending is needed
      */
    def needAlphaBlending(): Boolean = js.native
    
    /**
      * Specifies if the mesh will require alpha blending
      * @param mesh defines the mesh to check
      * @returns a boolean specifying if alpha blending is needed for the mesh
      */
    def needAlphaBlendingForMesh(mesh: AbstractMesh): Boolean = js.native
    
    /**
      * Specifies whether or not this material should be rendered in alpha test mode.
      * @returns a boolean specifying if an alpha test is needed.
      */
    def needAlphaTesting(): Boolean = js.native
    
    /**
      * Gets the depth pre-pass value
      */
    def needDepthPrePass: Boolean = js.native
    /**
      * Sets the need depth pre-pass value
      */
    def needDepthPrePass_=(value: Boolean): Unit = js.native
    
    /**
      * An event triggered when the material is bound
      */
    def onBindObservable: Observable[AbstractMesh] = js.native
    
    /**
      * Called during a bind event
      */
    def onBind_=(callback: js.Function1[/* Mesh */ AbstractMesh, Unit]): Unit = js.native
    
    /**
      * Callback triggered when the material is compiled
      */
    var onCompiled: Nullable[js.Function1[/* effect */ Effect, Unit]] = js.native
    
    /**
      * An event triggered when the material is disposed
      */
    var onDisposeObservable: Observable[Material] = js.native
    
    /**
      * Called during a dispose event
      */
    def onDispose_=(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * An event triggered when the effect is (re)created
      */
    def onEffectCreatedObservable: Observable[typings.babylonjs.anon.Effect] = js.native
    
    /**
      * Callback triggered when an error occurs
      */
    var onError: Nullable[js.Function2[/* effect */ Effect, /* errors */ String, Unit]] = js.native
    
    /**
      * An event triggered when the material is unbound
      */
    def onUnBindObservable: Observable[Material] = js.native
    
    /**
      * Plugin manager for this material
      */
    var pluginManager: js.UndefOr[MaterialPluginManager] = js.native
    
    /**
      * Stores the size of points
      */
    var pointSize: Double = js.native
    
    /**
      * Gets the value specifying if point clouds are enabled
      */
    def pointsCloud: Boolean = js.native
    /**
      * Sets the state of point cloud mode
      */
    def pointsCloud_=(value: Boolean): Unit = js.native
    
    /**
      * @internal
      */
    /* private */ var releaseVertexArrayObject: Any = js.native
    
    /**
      * For internal use only. Please do not use.
      */
    var reservedDataStore: Any = js.native
    
    /**
      * Resets the draw wrappers cache for all submeshes that are using this material
      */
    def resetDrawCache(): Unit = js.native
    
    /**
      * Specifies if there should be a separate pass for culling
      */
    var separateCullingPass: Boolean = js.native
    
    /**
      * Serializes this material
      * @returns the serialized material object
      */
    def serialize(): Any = js.native
    
    /**
      * Sets the required values to the prepass renderer.
      * @param prePassRenderer defines the prepass renderer to setup.
      * @returns true if the pre pass is needed.
      */
    def setPrePassRenderer(prePassRenderer: PrePassRenderer): Boolean = js.native
    
    /**
      * Custom shadow depth material to use for shadow rendering instead of the in-built one
      */
    var shadowDepthWrapper: Nullable[ShadowDepthWrapper] = js.native
    
    /**
      * Stores the value for side orientation
      */
    var sideOrientation: Double = js.native
    
    /**
      * The state of the material
      */
    var state: String = js.native
    
    /**
      * Gives access to the stencil properties of the material
      */
    val stencil: MaterialStencilState = js.native
    
    def toString(fullDetails: Boolean): String = js.native
    
    /**
      * Gets the current transparency mode.
      */
    def transparencyMode: Nullable[Double] = js.native
    /**
      * Sets the transparency mode of the material.
      *
      * | Value | Type                                | Description |
      * | ----- | ----------------------------------- | ----------- |
      * | 0     | OPAQUE                              |             |
      * | 1     | ALPHATEST                           |             |
      * | 2     | ALPHABLEND                          |             |
      * | 3     | ALPHATESTANDBLEND                   |             |
      *
      */
    def transparencyMode_=(value: Nullable[Double]): Unit = js.native
    
    /**
      * Unbinds the material from the mesh
      */
    def unbind(): Unit = js.native
    
    /**
      * Unlocks updates for the material
      */
    def unfreeze(): Unit = js.native
    
    /**
      * Gets or sets the unique id of the material
      */
    var uniqueId: Double = js.native
    
    def wireframe: Boolean = js.native
    /**
      * Sets the state of wireframe mode
      */
    def wireframe_=(value: Boolean): Unit = js.native
    
    /**
      * Stores the z offset Factor value
      */
    var zOffset: Double = js.native
    
    /**
      * Stores the z offset Units value
      */
    var zOffsetUnits: Double = js.native
  }
  /* static members */
  object Material {
    
    @JSImport("babylonjs/Materials/material", "Material")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The all dirty flag value
      */
    @JSImport("babylonjs/Materials/material", "Material.AllDirtyFlag")
    @js.native
    val AllDirtyFlag: Double = js.native
    
    /**
      * The dirty attribute flag value
      */
    @JSImport("babylonjs/Materials/material", "Material.AttributesDirtyFlag")
    @js.native
    val AttributesDirtyFlag: Double = js.native
    
    /**
      * Stores the clock-wise side orientation
      */
    @JSImport("babylonjs/Materials/material", "Material.ClockWiseSideOrientation")
    @js.native
    val ClockWiseSideOrientation: Double = js.native
    
    /**
      * Stores the counter clock-wise side orientation
      */
    @JSImport("babylonjs/Materials/material", "Material.CounterClockWiseSideOrientation")
    @js.native
    val CounterClockWiseSideOrientation: Double = js.native
    
    /**
      * The dirty fresnel flag value
      */
    @JSImport("babylonjs/Materials/material", "Material.FresnelDirtyFlag")
    @js.native
    val FresnelDirtyFlag: Double = js.native
    
    /**
      * The dirty light flag value
      */
    @JSImport("babylonjs/Materials/material", "Material.LightDirtyFlag")
    @js.native
    val LightDirtyFlag: Double = js.native
    
    /**
      * Returns the line list draw mode
      */
    @JSImport("babylonjs/Materials/material", "Material.LineListDrawMode")
    @js.native
    val LineListDrawMode: Double = js.native
    
    /**
      * Returns the line loop draw mode
      */
    @JSImport("babylonjs/Materials/material", "Material.LineLoopDrawMode")
    @js.native
    val LineLoopDrawMode: Double = js.native
    
    /**
      * Returns the line strip draw mode
      */
    @JSImport("babylonjs/Materials/material", "Material.LineStripDrawMode")
    @js.native
    val LineStripDrawMode: Double = js.native
    
    /**
      * MaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
      */
    @JSImport("babylonjs/Materials/material", "Material.MATERIAL_ALPHABLEND")
    @js.native
    val MATERIAL_ALPHABLEND: Double = js.native
    
    /**
      * MaterialTransparencyMode: Alpha Test mode, pixel are discarded below a certain threshold defined by the alpha cutoff value.
      */
    @JSImport("babylonjs/Materials/material", "Material.MATERIAL_ALPHATEST")
    @js.native
    val MATERIAL_ALPHATEST: Double = js.native
    
    /**
      * MaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
      * They are also discarded below the alpha cutoff threshold to improve performances.
      */
    @JSImport("babylonjs/Materials/material", "Material.MATERIAL_ALPHATESTANDBLEND")
    @js.native
    val MATERIAL_ALPHATESTANDBLEND: Double = js.native
    
    /**
      * The Reoriented Normal Mapping method is used to blend normals.
      * Details of the algorithm can be found here: https://blog.selfshadow.com/publications/blending-in-detail/
      */
    @JSImport("babylonjs/Materials/material", "Material.MATERIAL_NORMALBLENDMETHOD_RNM")
    @js.native
    val MATERIAL_NORMALBLENDMETHOD_RNM: Double = js.native
    
    /**
      * The Whiteout method is used to blend normals.
      * Details of the algorithm can be found here: https://blog.selfshadow.com/publications/blending-in-detail/
      */
    @JSImport("babylonjs/Materials/material", "Material.MATERIAL_NORMALBLENDMETHOD_WHITEOUT")
    @js.native
    val MATERIAL_NORMALBLENDMETHOD_WHITEOUT: Double = js.native
    
    /**
      * MaterialTransparencyMode: No transparency mode, Alpha channel is not use.
      */
    @JSImport("babylonjs/Materials/material", "Material.MATERIAL_OPAQUE")
    @js.native
    val MATERIAL_OPAQUE: Double = js.native
    
    /**
      * The dirty misc flag value
      */
    @JSImport("babylonjs/Materials/material", "Material.MiscDirtyFlag")
    @js.native
    val MiscDirtyFlag: Double = js.native
    
    /**
      * Event observable which raises global events common to all materials (like MaterialPluginEvent.Created)
      */
    @JSImport("babylonjs/Materials/material", "Material.OnEventObservable")
    @js.native
    def OnEventObservable: Observable[Material] = js.native
    inline def OnEventObservable_=(x: Observable[Material]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OnEventObservable")(x.asInstanceOf[js.Any])
    
    /**
      * Creates a material from parsed material data
      * @param parsedMaterial defines parsed material data
      * @param scene defines the hosting scene
      * @param rootUrl defines the root URL to use to load textures
      * @returns a new material
      */
    inline def Parse(parsedMaterial: Any, scene: Scene, rootUrl: String): Nullable[Material] = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedMaterial.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[Material]]
    
    /**
      * Returns the point fill mode
      */
    @JSImport("babylonjs/Materials/material", "Material.PointFillMode")
    @js.native
    val PointFillMode: Double = js.native
    
    /**
      * Returns the point list draw mode
      */
    @JSImport("babylonjs/Materials/material", "Material.PointListDrawMode")
    @js.native
    val PointListDrawMode: Double = js.native
    
    /**
      * The dirty prepass flag value
      */
    @JSImport("babylonjs/Materials/material", "Material.PrePassDirtyFlag")
    @js.native
    val PrePassDirtyFlag: Double = js.native
    
    /**
      * The dirty texture flag value
      */
    @JSImport("babylonjs/Materials/material", "Material.TextureDirtyFlag")
    @js.native
    val TextureDirtyFlag: Double = js.native
    
    /**
      * Returns the triangle fan draw mode
      */
    @JSImport("babylonjs/Materials/material", "Material.TriangleFanDrawMode")
    @js.native
    val TriangleFanDrawMode: Double = js.native
    
    /**
      * Returns the triangle fill mode
      */
    @JSImport("babylonjs/Materials/material", "Material.TriangleFillMode")
    @js.native
    val TriangleFillMode: Double = js.native
    
    /**
      * Returns the triangle strip draw mode
      */
    @JSImport("babylonjs/Materials/material", "Material.TriangleStripDrawMode")
    @js.native
    val TriangleStripDrawMode: Double = js.native
    
    /**
      * Returns the wireframe mode
      */
    @JSImport("babylonjs/Materials/material", "Material.WireFrameFillMode")
    @js.native
    val WireFrameFillMode: Double = js.native
    
    @JSImport("babylonjs/Materials/material", "Material._AllDirtyCallBack")
    @js.native
    val _AllDirtyCallBack: Any = js.native
    
    @JSImport("babylonjs/Materials/material", "Material._AttributeDirtyCallBack")
    @js.native
    val _AttributeDirtyCallBack: Any = js.native
    
    @JSImport("babylonjs/Materials/material", "Material._DirtyCallbackArray")
    @js.native
    val _DirtyCallbackArray: Any = js.native
    
    @JSImport("babylonjs/Materials/material", "Material._FresnelAndMiscDirtyCallBack")
    @js.native
    def _FresnelAndMiscDirtyCallBack: Any = js.native
    inline def _FresnelAndMiscDirtyCallBack_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FresnelAndMiscDirtyCallBack")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Materials/material", "Material._FresnelDirtyCallBack")
    @js.native
    val _FresnelDirtyCallBack: Any = js.native
    
    @JSImport("babylonjs/Materials/material", "Material._ImageProcessingDirtyCallBack")
    @js.native
    val _ImageProcessingDirtyCallBack: Any = js.native
    
    @JSImport("babylonjs/Materials/material", "Material._LightsDirtyCallBack")
    @js.native
    val _LightsDirtyCallBack: Any = js.native
    
    @JSImport("babylonjs/Materials/material", "Material._MiscDirtyCallBack")
    @js.native
    val _MiscDirtyCallBack: Any = js.native
    
    @JSImport("babylonjs/Materials/material", "Material._PrePassDirtyCallBack")
    @js.native
    val _PrePassDirtyCallBack: Any = js.native
    
    @JSImport("babylonjs/Materials/material", "Material._RunDirtyCallBacks")
    @js.native
    val _RunDirtyCallBacks: Any = js.native
    
    @JSImport("babylonjs/Materials/material", "Material._TextureAndMiscDirtyCallBack")
    @js.native
    def _TextureAndMiscDirtyCallBack: Any = js.native
    inline def _TextureAndMiscDirtyCallBack_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TextureAndMiscDirtyCallBack")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Materials/material", "Material._TextureDirtyCallBack")
    @js.native
    val _TextureDirtyCallBack: Any = js.native
  }
  
  trait ICustomShaderNameResolveOptions extends StObject {
    
    /**
      * If provided, will be called two times with the vertex and fragment code so that this code can be updated before it is compiled by the GPU
      */
    var processFinalCode: js.UndefOr[Nullable[ShaderCustomProcessingFunction]] = js.undefined
  }
  object ICustomShaderNameResolveOptions {
    
    inline def apply(): ICustomShaderNameResolveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICustomShaderNameResolveOptions]
    }
    
    extension [Self <: ICustomShaderNameResolveOptions](x: Self) {
      
      inline def setProcessFinalCode(value: (/* shaderType */ String, /* code */ String) => String): Self = StObject.set(x, "processFinalCode", js.Any.fromFunction2(value))
      
      inline def setProcessFinalCodeNull: Self = StObject.set(x, "processFinalCode", null)
      
      inline def setProcessFinalCodeUndefined: Self = StObject.set(x, "processFinalCode", js.undefined)
    }
  }
  
  trait IMaterialCompilationOptions extends StObject {
    
    /**
      * Defines whether clip planes are enabled.
      */
    var clipPlane: Boolean
    
    /**
      * Defines whether instances are enabled.
      */
    var useInstances: Boolean
  }
  object IMaterialCompilationOptions {
    
    inline def apply(clipPlane: Boolean, useInstances: Boolean): IMaterialCompilationOptions = {
      val __obj = js.Dynamic.literal(clipPlane = clipPlane.asInstanceOf[js.Any], useInstances = useInstances.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMaterialCompilationOptions]
    }
    
    extension [Self <: IMaterialCompilationOptions](x: Self) {
      
      inline def setClipPlane(value: Boolean): Self = StObject.set(x, "clipPlane", value.asInstanceOf[js.Any])
      
      inline def setUseInstances(value: Boolean): Self = StObject.set(x, "useInstances", value.asInstanceOf[js.Any])
    }
  }
}
