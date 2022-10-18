package typings.babylonjs

import typings.babylonjs.anon.Height
import typings.babylonjs.anon.Layers
import typings.babylonjs.anon.Ratio
import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.enginesEngineMod.Engine
import typings.babylonjs.enginesRenderTargetWrapperMod.IRenderTargetTexture
import typings.babylonjs.enginesRenderTargetWrapperMod.RenderTargetWrapper
import typings.babylonjs.materialsMaterialMod.Material
import typings.babylonjs.materialsTexturesInternalTextureMod.InternalTexture
import typings.babylonjs.materialsTexturesPrePassRenderTargetMod.PrePassRenderTarget
import typings.babylonjs.materialsTexturesTextureCreationOptionsMod.RenderTargetCreationOptions
import typings.babylonjs.materialsTexturesTextureCreationOptionsMod.TextureSize
import typings.babylonjs.materialsTexturesTextureMod.Texture
import typings.babylonjs.mathsMathDotcolorMod.Color4
import typings.babylonjs.mathsMathDotvectorMod.Matrix
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.meshesSubMeshMod.SubMesh
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.miscSmartArrayMod.SmartArray
import typings.babylonjs.postProcessesPostProcessMod.PostProcess
import typings.babylonjs.renderingRenderingManagerMod.RenderingManager
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Immutable
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsTexturesRenderTargetTextureMod {
  
  @JSImport("babylonjs/Materials/Textures/renderTargetTexture", "RenderTargetTexture")
  @js.native
  open class RenderTargetTexture protected ()
    extends Texture
       with IRenderTargetTexture {
    /**
      * Instantiate a render target texture. This is mainly used to render of screen the scene to for instance apply post process
      * or used a shadow, depth texture...
      * @param name The friendly name of the texture
      * @param size The size of the RTT (number if square, or {width: number, height:number} or {ratio:} to define a ratio from the main scene)
      * @param scene The scene the RTT belongs to. The latest created scene will be used if not precised.
      * @param generateMipMaps True if mip maps need to be generated after render.
      * @param doNotChangeAspectRatio True to not change the aspect ratio of the scene in the RTT
      * @param type The type of the buffer in the RTT (int, half float, float...)
      * @param isCube True if a cube texture needs to be created
      * @param samplingMode The sampling mode to be usedwith the render target (Linear, Nearest...)
      * @param generateDepthBuffer True to generate a depth buffer
      * @param generateStencilBuffer True to generate a stencil buffer
      * @param isMulti True if multiple textures need to be created (Draw Buffers)
      * @param format The internal format of the buffer in the RTT (RED, RG, RGB, RGBA, ALPHA...)
      * @param delayAllocation if the texture allocation should be delayed (default: false)
      * @param samples sample count to use when creating the RTT
      * @param creationFlags specific flags to use when creating the texture (Constants.TEXTURE_CREATIONFLAG_STORAGE for storage textures, for eg)
      * @param noColorTarget True to indicate that no color target should be created. Useful if you only want to write to the depth buffer, for eg
      * @param useSRGBBuffer True to create a SRGB texture
      */
    def this(
      name: String,
      size: Double | Layers | Ratio,
      scene: js.UndefOr[Nullable[Scene]],
      generateMipMaps: js.UndefOr[Boolean],
      doNotChangeAspectRatio: js.UndefOr[Boolean],
      `type`: js.UndefOr[Double],
      isCube: js.UndefOr[Boolean],
      samplingMode: js.UndefOr[Double],
      generateDepthBuffer: js.UndefOr[Boolean],
      generateStencilBuffer: js.UndefOr[Boolean],
      isMulti: js.UndefOr[Boolean],
      format: js.UndefOr[Double],
      delayAllocation: js.UndefOr[Boolean],
      samples: js.UndefOr[Double],
      creationFlags: js.UndefOr[Double],
      noColorTarget: js.UndefOr[Boolean],
      useSRGBBuffer: js.UndefOr[Boolean]
    ) = this()
    
    /* private */ var _bestReflectionRenderTargetDimension: Any = js.native
    
    /**
      * @internal
      * @param faceIndex face index to bind to if this is a cubetexture
      * @param layer defines the index of the texture to bind in the array
      */
    def _bindFrameBuffer(): Unit = js.native
    def _bindFrameBuffer(faceIndex: Double): Unit = js.native
    def _bindFrameBuffer(faceIndex: Double, layer: Double): Unit = js.native
    def _bindFrameBuffer(faceIndex: Unit, layer: Double): Unit = js.native
    
    /* private */ var _boundingBoxSize: Any = js.native
    
    /* private */ var _canRescale: Any = js.native
    
    /** @internal */
    var _cleared: Boolean = js.native
    
    /* private */ var _createRenderPassId: Any = js.native
    
    /* protected */ var _currentRefreshId: Double = js.native
    
    /* private */ var _defaultRenderListPrepared: Any = js.native
    
    /* protected */ var _doNotChangeAspectRatio: Boolean = js.native
    
    /** @internal */
    var _generateMipMaps: Boolean = js.native
    
    /* protected */ var _initialSizeParameter: Double | Height | Ratio = js.native
    
    /* private */ var _isCubeData: Any = js.native
    
    /* private */ var _onAfterRenderObserver: Any = js.native
    
    /* private */ var _onAfterUnbindObserver: Any = js.native
    
    /* private */ var _onBeforeRenderObserver: Any = js.native
    
    /* private */ var _onClearObserver: Any = js.native
    
    /* protected */ def _onRatioRescale(): Unit = js.native
    
    /* private */ var _postProcessManager: Any = js.native
    
    /* private */ var _postProcesses: Any = js.native
    
    /* private */ def _prePassEnabled: Any = js.native
    
    /** @internal */
    var _prePassRenderTarget: Nullable[PrePassRenderTarget] = js.native
    
    /**
      * @internal
      */
    def _prepareFrame(scene: Scene): Unit = js.native
    def _prepareFrame(scene: Scene, faceIndex: Double): Unit = js.native
    def _prepareFrame(scene: Scene, faceIndex: Double, layer: Double): Unit = js.native
    def _prepareFrame(scene: Scene, faceIndex: Double, layer: Double, useCameraPostProcess: Boolean): Unit = js.native
    def _prepareFrame(scene: Scene, faceIndex: Double, layer: Unit, useCameraPostProcess: Boolean): Unit = js.native
    def _prepareFrame(scene: Scene, faceIndex: Unit, layer: Double): Unit = js.native
    def _prepareFrame(scene: Scene, faceIndex: Unit, layer: Double, useCameraPostProcess: Boolean): Unit = js.native
    def _prepareFrame(scene: Scene, faceIndex: Unit, layer: Unit, useCameraPostProcess: Boolean): Unit = js.native
    
    /* private */ var _prepareRenderingManager: Any = js.native
    
    /* private */ var _processSizeParameter: Any = js.native
    
    /* protected */ var _refreshRate: Double = js.native
    
    /* private */ var _releaseRenderPassId: Any = js.native
    
    /* private */ var _render: Any = js.native
    
    /* private */ var _renderList: Any = js.native
    
    /* private */ var _renderListHasChanged: Any = js.native
    
    /* private */ var _renderPassIds: Any = js.native
    
    /* protected */ var _renderTarget: Nullable[RenderTargetWrapper] = js.native
    
    /* protected */ var _renderTargetOptions: RenderTargetCreationOptions = js.native
    
    /* private */ var _renderToTarget: Any = js.native
    
    /* protected */ var _renderingManager: RenderingManager = js.native
    
    /* private */ var _resizeObserver: Any = js.native
    
    /* protected */ var _samples: Double = js.native
    
    /** @internal */
    def _shouldRender(): Boolean = js.native
    
    /* protected */ var _size: TextureSize = js.native
    
    /* protected */ var _sizeRatio: Nullable[Double] = js.native
    
    /* protected */ var _textureMatrix: Matrix = js.native
    
    /* private */ var _unObserveRenderList: Any = js.native
    
    /* protected */ def _unbindFrameBuffer(engine: Engine, faceIndex: Double): Unit = js.native
    
    /** @internal */
    var _waitingRenderList: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Define the camera used to render the texture.
      */
    var activeCamera: Nullable[Camera] = js.native
    
    /**
      * Adds a post process to the render target rendering passes.
      * @param postProcess define the post process to add
      */
    def addPostProcess(postProcess: PostProcess): Unit = js.native
    
    /**
      * Gets or sets the center of the bounding box associated with the texture (when in cube mode)
      * It must define where the camera used to render the texture is set
      */
    var boundingBoxPosition: Vector3 = js.native
    
    def boundingBoxSize: Vector3 = js.native
    /**
      * Gets or sets the size of the bounding box associated with the texture (when in cube mode)
      * When defined, the cubemap will switch to local mode
      * @see https://community.arm.com/graphics/b/blog/posts/reflections-based-on-local-cubemaps-in-unity
      * @example https://www.babylonjs-playground.com/#RNASML
      */
    def boundingBoxSize_=(value: Vector3): Unit = js.native
    
    /**
      * Define the clear color of the Render Target if it should be different from the scene.
      */
    var clearColor: Color4 = js.native
    
    /**
      * Clear all the post processes attached to the render target
      * @param dispose define if the cleared post processes should also be disposed (false by default)
      */
    def clearPostProcesses(): Unit = js.native
    def clearPostProcesses(dispose: Boolean): Unit = js.native
    
    /**
      * Creates a depth stencil texture.
      * This is only available in WebGL 2 or with the depth texture extension available.
      * @param comparisonFunction Specifies the comparison function to set on the texture. If 0 or undefined, the texture is not in comparison mode (default: 0)
      * @param bilinearFiltering Specifies whether or not bilinear filtering is enable on the texture (default: true)
      * @param generateStencil Specifies whether or not a stencil should be allocated in the texture (default: false)
      * @param samples sample count of the depth/stencil texture (default: 1)
      * @param format format of the depth texture (default: Constants.TEXTUREFORMAT_DEPTH32_FLOAT)
      */
    def createDepthStencilTexture(): Unit = js.native
    def createDepthStencilTexture(comparisonFunction: Double): Unit = js.native
    def createDepthStencilTexture(comparisonFunction: Double, bilinearFiltering: Boolean): Unit = js.native
    def createDepthStencilTexture(comparisonFunction: Double, bilinearFiltering: Boolean, generateStencil: Boolean): Unit = js.native
    def createDepthStencilTexture(comparisonFunction: Double, bilinearFiltering: Boolean, generateStencil: Boolean, samples: Double): Unit = js.native
    def createDepthStencilTexture(
      comparisonFunction: Double,
      bilinearFiltering: Boolean,
      generateStencil: Boolean,
      samples: Double,
      format: Double
    ): Unit = js.native
    def createDepthStencilTexture(
      comparisonFunction: Double,
      bilinearFiltering: Boolean,
      generateStencil: Boolean,
      samples: Unit,
      format: Double
    ): Unit = js.native
    def createDepthStencilTexture(comparisonFunction: Double, bilinearFiltering: Boolean, generateStencil: Unit, samples: Double): Unit = js.native
    def createDepthStencilTexture(
      comparisonFunction: Double,
      bilinearFiltering: Boolean,
      generateStencil: Unit,
      samples: Double,
      format: Double
    ): Unit = js.native
    def createDepthStencilTexture(
      comparisonFunction: Double,
      bilinearFiltering: Boolean,
      generateStencil: Unit,
      samples: Unit,
      format: Double
    ): Unit = js.native
    def createDepthStencilTexture(comparisonFunction: Double, bilinearFiltering: Unit, generateStencil: Boolean): Unit = js.native
    def createDepthStencilTexture(comparisonFunction: Double, bilinearFiltering: Unit, generateStencil: Boolean, samples: Double): Unit = js.native
    def createDepthStencilTexture(
      comparisonFunction: Double,
      bilinearFiltering: Unit,
      generateStencil: Boolean,
      samples: Double,
      format: Double
    ): Unit = js.native
    def createDepthStencilTexture(
      comparisonFunction: Double,
      bilinearFiltering: Unit,
      generateStencil: Boolean,
      samples: Unit,
      format: Double
    ): Unit = js.native
    def createDepthStencilTexture(comparisonFunction: Double, bilinearFiltering: Unit, generateStencil: Unit, samples: Double): Unit = js.native
    def createDepthStencilTexture(
      comparisonFunction: Double,
      bilinearFiltering: Unit,
      generateStencil: Unit,
      samples: Double,
      format: Double
    ): Unit = js.native
    def createDepthStencilTexture(
      comparisonFunction: Double,
      bilinearFiltering: Unit,
      generateStencil: Unit,
      samples: Unit,
      format: Double
    ): Unit = js.native
    def createDepthStencilTexture(comparisonFunction: Unit, bilinearFiltering: Boolean): Unit = js.native
    def createDepthStencilTexture(comparisonFunction: Unit, bilinearFiltering: Boolean, generateStencil: Boolean): Unit = js.native
    def createDepthStencilTexture(comparisonFunction: Unit, bilinearFiltering: Boolean, generateStencil: Boolean, samples: Double): Unit = js.native
    def createDepthStencilTexture(
      comparisonFunction: Unit,
      bilinearFiltering: Boolean,
      generateStencil: Boolean,
      samples: Double,
      format: Double
    ): Unit = js.native
    def createDepthStencilTexture(
      comparisonFunction: Unit,
      bilinearFiltering: Boolean,
      generateStencil: Boolean,
      samples: Unit,
      format: Double
    ): Unit = js.native
    def createDepthStencilTexture(comparisonFunction: Unit, bilinearFiltering: Boolean, generateStencil: Unit, samples: Double): Unit = js.native
    def createDepthStencilTexture(
      comparisonFunction: Unit,
      bilinearFiltering: Boolean,
      generateStencil: Unit,
      samples: Double,
      format: Double
    ): Unit = js.native
    def createDepthStencilTexture(
      comparisonFunction: Unit,
      bilinearFiltering: Boolean,
      generateStencil: Unit,
      samples: Unit,
      format: Double
    ): Unit = js.native
    def createDepthStencilTexture(comparisonFunction: Unit, bilinearFiltering: Unit, generateStencil: Boolean): Unit = js.native
    def createDepthStencilTexture(comparisonFunction: Unit, bilinearFiltering: Unit, generateStencil: Boolean, samples: Double): Unit = js.native
    def createDepthStencilTexture(
      comparisonFunction: Unit,
      bilinearFiltering: Unit,
      generateStencil: Boolean,
      samples: Double,
      format: Double
    ): Unit = js.native
    def createDepthStencilTexture(
      comparisonFunction: Unit,
      bilinearFiltering: Unit,
      generateStencil: Boolean,
      samples: Unit,
      format: Double
    ): Unit = js.native
    def createDepthStencilTexture(comparisonFunction: Unit, bilinearFiltering: Unit, generateStencil: Unit, samples: Double): Unit = js.native
    def createDepthStencilTexture(
      comparisonFunction: Unit,
      bilinearFiltering: Unit,
      generateStencil: Unit,
      samples: Double,
      format: Double
    ): Unit = js.native
    def createDepthStencilTexture(
      comparisonFunction: Unit,
      bilinearFiltering: Unit,
      generateStencil: Unit,
      samples: Unit,
      format: Double
    ): Unit = js.native
    
    /**
      * Gets the current value of the refreshId counter
      */
    def currentRefreshId: Double = js.native
    
    /**
      * Override the mesh isReady function with your own one.
      */
    def customIsReadyFunction(mesh: AbstractMesh, refreshRate: Double): Boolean = js.native
    
    /**
      * Override the render function of the texture with your own one.
      */
    def customRenderFunction(
      opaqueSubMeshes: SmartArray[SubMesh],
      alphaTestSubMeshes: SmartArray[SubMesh],
      transparentSubMeshes: SmartArray[SubMesh],
      depthOnlySubMeshes: SmartArray[SubMesh]
    ): Unit = js.native
    def customRenderFunction(
      opaqueSubMeshes: SmartArray[SubMesh],
      alphaTestSubMeshes: SmartArray[SubMesh],
      transparentSubMeshes: SmartArray[SubMesh],
      depthOnlySubMeshes: SmartArray[SubMesh],
      beforeTransparents: js.Function0[Unit]
    ): Unit = js.native
    
    /**
      * In case the RTT has been created with a depth texture, get the associated
      * depth texture.
      * Otherwise, return null.
      */
    def depthStencilTexture: Nullable[InternalTexture] = js.native
    
    /**
      * Don't allow this render target texture to rescale. Mainly used to prevent rescaling by the scene optimizer.
      */
    def disableRescaling(): Unit = js.native
    
    /**
      *  This will remove the attached framebuffer objects. The texture will not be able to be used as render target anymore
      */
    def disposeFramebufferObjects(): Unit = js.native
    
    /**
      * Clear the info related to rendering groups preventing retention point in material dispose.
      */
    def freeRenderingGroups(): Unit = js.native
    
    /**
      * Use this function to overload the renderList array at rendering time.
      * Return null to render with the current renderList, else return the list of meshes to use for rendering.
      * For 2DArray RTT, layerOrFace is the index of the layer that is going to be rendered, else it is the faceIndex of
      * the cube (if the RTT is a cube, else layerOrFace=0).
      * The renderList passed to the function is the current render list (the one that will be used if the function returns null).
      * The length of this list is passed through renderListLength: don't use renderList.length directly because the array can
      * hold dummy elements!
      */
    def getCustomRenderList(
      layerOrFace: Double,
      renderList: Nullable[Immutable[js.Array[AbstractMesh]]],
      renderListLength: Double
    ): Nullable[js.Array[AbstractMesh]] = js.native
    
    /**
      * Gets the actual render height of the texture.
      * @returns the height of the render size
      */
    def getRenderHeight(): Double = js.native
    
    /**
      * Gets the actual number of layers of the texture.
      * @returns the number of layers
      */
    def getRenderLayers(): Double = js.native
    
    /**
      * Gets the actual render size of the texture.
      * @returns the width of the render size
      */
    def getRenderSize(): Double = js.native
    
    /**
      * Gets the actual render width of the texture.
      * @returns the width of the render size
      */
    def getRenderWidth(): Double = js.native
    
    /**
      * Gets the number of views the corresponding to the texture (eg. a MultiviewRenderTarget will have > 1)
      * @returns the view count
      */
    def getViewCount(): Double = js.native
    
    /**
      * Define if the camera viewport should be respected while rendering the texture or if the render should be done to the entire texture.
      */
    var ignoreCameraViewport: Boolean = js.native
    
    /**
      * This function will check if the render target texture can be rendered (textures are loaded, shaders are compiled)
      * @returns true if all required resources are ready
      */
    def isReadyForRendering(): Boolean = js.native
    
    /**
      * An event triggered after rendering the texture
      */
    var onAfterRenderObservable: Observable[Double] = js.native
    
    /**
      * Set a after render callback in the texture.
      * This has been kept for backward compatibility and use of onAfterRenderObservable is recommended.
      */
    def onAfterRender_=(callback: js.Function1[/* faceIndex */ Double, Unit]): Unit = js.native
    
    /**
      * An event triggered when the texture is unbind.
      */
    var onAfterUnbindObservable: Observable[RenderTargetTexture] = js.native
    
    /**
      * Set a after unbind callback in the texture.
      * This has been kept for backward compatibility and use of onAfterUnbindObservable is recommended.
      */
    def onAfterUnbind_=(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * An event triggered when the texture is unbind.
      */
    var onBeforeBindObservable: Observable[RenderTargetTexture] = js.native
    
    /**
      * An event triggered before rendering the texture
      */
    var onBeforeRenderObservable: Observable[Double] = js.native
    
    /**
      * Set a before render callback in the texture.
      * This has been kept for backward compatibility and use of onBeforeRenderObservable is recommended.
      */
    def onBeforeRender_=(callback: js.Function1[/* faceIndex */ Double, Unit]): Unit = js.native
    
    /**
      * An event triggered after the texture clear
      */
    var onClearObservable: Observable[Engine] = js.native
    
    /**
      * Set a clear callback in the texture.
      * This has been kept for backward compatibility and use of onClearObservable is recommended.
      */
    def onClear_=(callback: js.Function1[/* Engine */ Engine, Unit]): Unit = js.native
    
    /**
      * An event triggered when the texture is resized.
      */
    var onResizeObservable: Observable[RenderTargetTexture] = js.native
    
    /**
      * Post-processes for this render target
      */
    def postProcesses: js.Array[PostProcess] = js.native
    
    /**
      * Define the refresh rate of the texture or the rendering frequency.
      * Use 0 to render just once, 1 to render on every frame, 2 to render every two frames and so on...
      */
    def refreshRate: Double = js.native
    def refreshRate_=(value: Double): Unit = js.native
    
    /**
      * Remove one of the post process from the list of attached post processes to the texture
      * @param postProcess define the post process to remove from the list
      */
    def removePostProcess(postProcess: PostProcess): Unit = js.native
    
    /**
      * Renders all the objects from the render list into the texture.
      * @param useCameraPostProcess Define if camera post processes should be used during the rendering
      * @param dumpForDebug Define if the rendering result should be dumped (copied) for debugging purpose
      */
    def render(): Unit = js.native
    def render(useCameraPostProcess: Boolean): Unit = js.native
    def render(useCameraPostProcess: Boolean, dumpForDebug: Boolean): Unit = js.native
    def render(useCameraPostProcess: Unit, dumpForDebug: Boolean): Unit = js.native
    
    /**
      * Use this list to define the list of mesh you want to render.
      */
    def renderList: Nullable[js.Array[AbstractMesh]] = js.native
    
    /**
      * Use this predicate to dynamically define the list of mesh you want to render.
      * If set, the renderList property will be overwritten.
      */
    def renderListPredicate(AbstractMesh: AbstractMesh): Boolean = js.native
    
    def renderList_=(value: Nullable[js.Array[AbstractMesh]]): Unit = js.native
    
    /**
      * Define if particles should be rendered in your texture.
      */
    var renderParticles: Boolean = js.native
    
    /**
      * Current render pass id of the render target texture. Note it can change over the rendering as there's a separate id for each face of a cube / each layer of an array layer!
      */
    var renderPassId: Double = js.native
    
    /**
      * Gets the render pass ids used by the render target texture. For a single render target the array length will be 1, for a cube texture it will be 6 and for
      * a 2D texture array it will return an array of ids the size of the 2D texture array
      */
    def renderPassIds: js.Array[Double] = js.native
    
    /**
      * Define if sprites should be rendered in your texture.
      */
    var renderSprites: Boolean = js.native
    
    /**
      * Entry point to access the wrapper on a texture.
      */
    /* CompleteClass */
    var renderTarget: Nullable[RenderTargetWrapper] = js.native
    
    /**
      * Gets render target creation options that were used.
      */
    def renderTargetOptions: RenderTargetCreationOptions = js.native
    
    /**
      * Gets the render target wrapper associated with this render target
      */
    @JSName("renderTarget")
    def renderTarget_MRenderTargetTexture: Nullable[RenderTargetWrapper] = js.native
    
    /**
      * Resets the refresh counter of the texture and start bak from scratch.
      * Could be useful to regenerate the texture if it is setup to render only once.
      */
    def resetRefreshCounter(): Unit = js.native
    
    /**
      * Resize the texture to a new desired size.
      * Be careful as it will recreate all the data in the new texture.
      * @param size Define the new size. It can be:
      *   - a number for squared texture,
      *   - an object containing { width: number, height: number }
      *   - or an object containing a ratio { ratio: number }
      */
    def resize(size: Double): Unit = js.native
    def resize(size: Height): Unit = js.native
    def resize(size: Ratio): Unit = js.native
    
    /**
      * Define the number of samples to use in case of MSAA.
      * It defaults to one meaning no MSAA has been enabled.
      */
    def samples: Double = js.native
    def samples_=(value: Double): Unit = js.native
    
    def setMaterialForRendering(mesh: js.Array[AbstractMesh]): Unit = js.native
    def setMaterialForRendering(mesh: js.Array[AbstractMesh], material: js.Array[Material]): Unit = js.native
    def setMaterialForRendering(mesh: js.Array[AbstractMesh], material: Material): Unit = js.native
    /**
      * Sets a specific material to be used to render a mesh/a list of meshes in this render target texture
      * @param mesh mesh or array of meshes
      * @param material material or array of materials to use for this render pass. If undefined is passed, no specific material will be used but the regular material instead (mesh.material). It's possible to provide an array of materials to use a different material for each rendering in the case of a cube texture (6 rendering) and a 2D texture array (as many rendering as the length of the array)
      */
    def setMaterialForRendering(mesh: AbstractMesh): Unit = js.native
    def setMaterialForRendering(mesh: AbstractMesh, material: js.Array[Material]): Unit = js.native
    def setMaterialForRendering(mesh: AbstractMesh, material: Material): Unit = js.native
    
    /**
      * Specifies whether or not the stencil and depth buffer are cleared between two rendering groups.
      *
      * @param renderingGroupId The rendering group id corresponding to its index
      * @param autoClearDepthStencil Automatically clears depth and stencil between groups if true.
      */
    def setRenderingAutoClearDepthStencil(renderingGroupId: Double, autoClearDepthStencil: Boolean): Unit = js.native
    
    /**
      * Overrides the default sort function applied in the rendering group to prepare the meshes.
      * This allowed control for front to back rendering or reversely depending of the special needs.
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
      * Skip the initial clear of the rtt at the beginning of the frame render loop
      */
    var skipInitialClear: Boolean = js.native
    
    /**
      * Define if camera post processes should be use while rendering the texture.
      */
    var useCameraPostProcesses: Boolean = js.native
  }
  /* static members */
  object RenderTargetTexture {
    
    /**
      * The texture will only be rendered once which can be useful to improve performance if everything in your render is static for instance.
      */
    @JSImport("babylonjs/Materials/Textures/renderTargetTexture", "RenderTargetTexture.REFRESHRATE_RENDER_ONCE")
    @js.native
    val REFRESHRATE_RENDER_ONCE: Double = js.native
    
    /**
      * The texture will only be rendered rendered every frame and is recommended for dynamic contents.
      */
    @JSImport("babylonjs/Materials/Textures/renderTargetTexture", "RenderTargetTexture.REFRESHRATE_RENDER_ONEVERYFRAME")
    @js.native
    val REFRESHRATE_RENDER_ONEVERYFRAME: Double = js.native
    
    /**
      * The texture will be rendered every 2 frames which could be enough if your dynamic objects are not
      * the central point of your effect and can save a lot of performances.
      */
    @JSImport("babylonjs/Materials/Textures/renderTargetTexture", "RenderTargetTexture.REFRESHRATE_RENDER_ONEVERYTWOFRAMES")
    @js.native
    val REFRESHRATE_RENDER_ONEVERYTWOFRAMES: Double = js.native
  }
}
