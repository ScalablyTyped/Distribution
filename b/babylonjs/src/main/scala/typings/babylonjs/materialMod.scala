package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.animatableInterfaceMod.IAnimatable
import typings.babylonjs.animationMod.Animation
import typings.babylonjs.anon.PartialIMaterialCompilati
import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.effectMod.Effect
import typings.babylonjs.iInspectableMod.IInspectable
import typings.babylonjs.materialDefinesMod.MaterialDefines
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.prePassRendererMod.PrePassRenderer
import typings.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.shadowDepthWrapperMod.ShadowDepthWrapper
import typings.babylonjs.smartArrayMod.SmartArray
import typings.babylonjs.subMeshMod.SubMesh
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.uniformBufferMod.UniformBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialMod {
  
  @JSImport("babylonjs/Materials/material", "Material")
  @js.native
  class Material protected ()
    extends StObject
       with IAnimatable {
    /**
      * Creates a material instance
      * @param name defines the name of the material
      * @param scene defines the scene to reference
      * @param doNotAdd specifies if the material should be added to the scene
      */
    def this(name: String, scene: Scene) = this()
    def this(name: String, scene: Scene, doNotAdd: Boolean) = this()
    
    /**
      * Processes to execute after binding the material to a mesh
      * @param mesh defines the rendered mesh
      */
    /* protected */ def _afterBind(): Unit = js.native
    /* protected */ def _afterBind(mesh: Mesh): Unit = js.native
    
    /**
      * The alpha value of the material
      */
    /* protected */ var _alpha: Double = js.native
    
    /**
      * Stores the value of the alpha mode
      */
    /* private */ var _alphaMode: js.Any = js.native
    
    /**
      * Specifies if back face culling is enabled
      */
    /* protected */ var _backFaceCulling: Boolean = js.native
    
    /**
      * Specifies if the color write state should be cached
      */
    /* private */ var _cachedColorWriteState: js.Any = js.native
    
    /**
      * Specifies if the depth function state should be cached
      */
    /* private */ var _cachedDepthFunctionState: js.Any = js.native
    
    /**
      * Specifies if the depth write state should be cached
      */
    /* private */ var _cachedDepthWriteState: js.Any = js.native
    
    /**
      * Returns true if alpha blending should be disabled.
      */
    /* protected */ def _disableAlphaBlending: Boolean = js.native
    
    /**
      * @hidden
      * Stores the effects for the material
      */
    var _effect: Nullable[Effect] = js.native
    
    /**
      * Stores the fill mode state
      */
    /* private */ var _fillMode: js.Any = js.native
    
    /**
      * Stores the state specifing if fog should be enabled
      */
    /* private */ var _fogEnabled: js.Any = js.native
    
    /**
      * Enforces alpha test in opaque or blend mode in order to improve the performances of some situations.
      */
    /* protected */ var _forceAlphaTest: Boolean = js.native
    
    /** @hidden */
    var _indexInSceneMaterialArray: Double = js.native
    
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
      * Stores the state of the need depth pre-pass value
      */
    /* private */ var _needDepthPrePass: js.Any = js.native
    
    /* private */ var _onBindObservable: js.Any = js.native
    
    /**
      * An observer which watches for bind events
      */
    /* private */ var _onBindObserver: js.Any = js.native
    
    /**
      * An observer which watches for dispose events
      */
    /* private */ var _onDisposeObserver: js.Any = js.native
    
    /* protected */ var _onEffectCreatedObservable: Nullable[Observable[typings.babylonjs.anon.Effect]] = js.native
    
    /* private */ var _onUnBindObservable: js.Any = js.native
    
    /** @hidden */
    def _preBind(): Boolean = js.native
    def _preBind(effect: Unit, overrideOrientation: Nullable[Double]): Boolean = js.native
    def _preBind(effect: Effect): Boolean = js.native
    def _preBind(effect: Effect, overrideOrientation: Nullable[Double]): Boolean = js.native
    
    /**
      * Stores a reference to the scene
      */
    /* private */ var _scene: js.Any = js.native
    
    /**
      * Specifies if material alpha testing should be turned on for the mesh
      * @param mesh defines the mesh to check
      */
    /* protected */ def _shouldTurnAlphaTestOn(mesh: AbstractMesh): Boolean = js.native
    
    /**
      * @hidden
      */
    var _storeEffectOnSubMeshes: Boolean = js.native
    
    /**
      * The transparency mode of the material.
      */
    /* protected */ var _transparencyMode: Nullable[Double] = js.native
    
    /**
      * Stores the uniform buffer
      */
    /* protected */ var _uniformBuffer: UniformBuffer = js.native
    
    /**
      * Specifies if uniform buffers should be used
      */
    /* private */ var _useUBO: js.Any = js.native
    
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
      * Gets the back-face culling state
      */
    def backFaceCulling: Boolean = js.native
    /**
      * Sets the back-face culling state
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
      * Binds the scene's uniform buffer to the effect.
      * @param effect defines the effect to bind to the scene uniform buffer
      * @param sceneUbo defines the uniform buffer storing scene data
      */
    def bindSceneUniformBuffer(effect: Effect, sceneUbo: UniformBuffer): Unit = js.native
    
    /**
      * Binds the view matrix to the effect
      * @param effect defines the effect to bind the view matrix to
      */
    def bindView(effect: Effect): Unit = js.native
    
    /**
      * Binds the view projection matrix to the effect
      * @param effect defines the effect to bind the view projection matrix to
      */
    def bindViewProjection(effect: Effect): Unit = js.native
    
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
    
    /** @hidden */
    var meshMap: Nullable[StringDictionary[js.UndefOr[AbstractMesh]]] = js.native
    
    /**
      * Gets or sets user defined metadata
      */
    var metadata: js.Any = js.native
    
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
    
    /** @hidden */
    /* private */ var releaseVertexArrayObject: js.Any = js.native
    
    /**
      * For internal use only. Please do not use.
      */
    var reservedDataStore: js.Any = js.native
    
    /**
      * Specifies if there should be a separate pass for culling
      */
    var separateCullingPass: Boolean = js.native
    
    /**
      * Serializes this material
      * @returns the serialized material object
      */
    def serialize(): js.Any = js.native
    
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
      * Stores the z offset value
      */
    var zOffset: Double = js.native
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
      * Creates a material from parsed material data
      * @param parsedMaterial defines parsed material data
      * @param scene defines the hosting scene
      * @param rootUrl defines the root URL to use to load textures
      * @returns a new material
      */
    inline def Parse(parsedMaterial: js.Any, scene: Scene, rootUrl: String): Nullable[Material] = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedMaterial.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[Material]]
    
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
    val _AllDirtyCallBack: js.Any = js.native
    
    @JSImport("babylonjs/Materials/material", "Material._AttributeDirtyCallBack")
    @js.native
    val _AttributeDirtyCallBack: js.Any = js.native
    
    @JSImport("babylonjs/Materials/material", "Material._DirtyCallbackArray")
    @js.native
    val _DirtyCallbackArray: js.Any = js.native
    
    @JSImport("babylonjs/Materials/material", "Material._FresnelAndMiscDirtyCallBack")
    @js.native
    def _FresnelAndMiscDirtyCallBack: js.Any = js.native
    inline def _FresnelAndMiscDirtyCallBack_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FresnelAndMiscDirtyCallBack")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Materials/material", "Material._FresnelDirtyCallBack")
    @js.native
    val _FresnelDirtyCallBack: js.Any = js.native
    
    @JSImport("babylonjs/Materials/material", "Material._ImageProcessingDirtyCallBack")
    @js.native
    val _ImageProcessingDirtyCallBack: js.Any = js.native
    
    @JSImport("babylonjs/Materials/material", "Material._LightsDirtyCallBack")
    @js.native
    val _LightsDirtyCallBack: js.Any = js.native
    
    @JSImport("babylonjs/Materials/material", "Material._MiscDirtyCallBack")
    @js.native
    val _MiscDirtyCallBack: js.Any = js.native
    
    @JSImport("babylonjs/Materials/material", "Material._PrePassDirtyCallBack")
    @js.native
    val _PrePassDirtyCallBack: js.Any = js.native
    
    @JSImport("babylonjs/Materials/material", "Material._RunDirtyCallBacks")
    @js.native
    val _RunDirtyCallBacks: js.Any = js.native
    
    @JSImport("babylonjs/Materials/material", "Material._TextureAndMiscDirtyCallBack")
    @js.native
    def _TextureAndMiscDirtyCallBack: js.Any = js.native
    inline def _TextureAndMiscDirtyCallBack_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TextureAndMiscDirtyCallBack")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Materials/material", "Material._TextureDirtyCallBack")
    @js.native
    val _TextureDirtyCallBack: js.Any = js.native
  }
  
  trait ICustomShaderNameResolveOptions extends StObject {
    
    /**
      * If provided, will be called two times with the vertex and fragment code so that this code can be updated before it is compiled by the GPU
      */
    var processFinalCode: js.UndefOr[Nullable[js.Function2[/* shaderType */ String, /* code */ String, String]]] = js.undefined
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
