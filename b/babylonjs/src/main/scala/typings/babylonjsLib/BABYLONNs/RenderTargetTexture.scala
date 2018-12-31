package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This Helps creating a texture that will be created from a camera in your scene.
  * It is basically a dynamic texture that could be used to create special effects for instance.
  * Actually, It is the base of lot of effects in the framework like post process, shadows, effect layers and rendering pipelines...
  */
@JSGlobal("BABYLON.RenderTargetTexture")
@js.native
class RenderTargetTexture protected () extends Texture {
  def this(name: java.lang.String, size: babylonjsLib.Anon_Height, scene: Nullable[Scene], generateMipMaps: js.UndefOr[scala.Boolean], doNotChangeAspectRatio: js.UndefOr[scala.Boolean], `type`: js.UndefOr[scala.Double], isCube: js.UndefOr[scala.Boolean], samplingMode: js.UndefOr[scala.Double], generateDepthBuffer: js.UndefOr[scala.Boolean], generateStencilBuffer: js.UndefOr[scala.Boolean], isMulti: js.UndefOr[scala.Boolean], format: js.UndefOr[scala.Double]) = this()
  def this(name: java.lang.String, size: babylonjsLib.Anon_Ratio, scene: Nullable[Scene], generateMipMaps: js.UndefOr[scala.Boolean], doNotChangeAspectRatio: js.UndefOr[scala.Boolean], `type`: js.UndefOr[scala.Double], isCube: js.UndefOr[scala.Boolean], samplingMode: js.UndefOr[scala.Double], generateDepthBuffer: js.UndefOr[scala.Boolean], generateStencilBuffer: js.UndefOr[scala.Boolean], isMulti: js.UndefOr[scala.Boolean], format: js.UndefOr[scala.Double]) = this()
  /**
    * Instantiate a render target texture. This is mainly used to render of screen the scene to for instance apply post processse
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
    */
  def this(name: java.lang.String, size: scala.Double, scene: Nullable[Scene], generateMipMaps: js.UndefOr[scala.Boolean], doNotChangeAspectRatio: js.UndefOr[scala.Boolean], `type`: js.UndefOr[scala.Double], isCube: js.UndefOr[scala.Boolean], samplingMode: js.UndefOr[scala.Double], generateDepthBuffer: js.UndefOr[scala.Boolean], generateStencilBuffer: js.UndefOr[scala.Boolean], isMulti: js.UndefOr[scala.Boolean], format: js.UndefOr[scala.Double]) = this()
  var _bestReflectionRenderTargetDimension: js.Any = js.native
  var _boundingBoxSize: js.Any = js.native
  var _currentRefreshId: scala.Double = js.native
  var _doNotChangeAspectRatio: scala.Boolean = js.native
  var _engine: Engine = js.native
  /** @hidden */
  var _generateMipMaps: scala.Boolean = js.native
  var _hookArray: js.Any = js.native
  var _initialSizeParameter: scala.Double | babylonjsLib.Anon_Height | babylonjsLib.Anon_Ratio = js.native
  var _onAfterRenderObserver: js.Any = js.native
  var _onAfterUnbindObserver: js.Any = js.native
  var _onBeforeRenderObserver: js.Any = js.native
  var _onClearObserver: js.Any = js.native
  var _postProcessManager: js.Any = js.native
  var _postProcesses: js.Any = js.native
  var _processSizeParameter: js.Any = js.native
  var _refreshRate: scala.Double = js.native
  var _renderList: js.Any = js.native
  var _renderTargetOptions: RenderTargetCreationOptions = js.native
  var _renderingManager: RenderingManager = js.native
  var _resizeObserver: js.Any = js.native
  var _samples: scala.Double = js.native
  var _size: scala.Double | babylonjsLib.Anon_Height = js.native
  var _sizeRatio: Nullable[scala.Double] = js.native
  var _textureMatrix: Matrix = js.native
  /** @hidden */
  var _waitingRenderList: js.Array[java.lang.String] = js.native
  /**
    * Define the camera used to render the texture.
    */
  var activeCamera: Nullable[Camera] = js.native
  /**
    * Gets or sets the center of the bounding box associated with the texture (when in cube mode)
    * It must define where the camera used to render the texture is set
    */
  var boundingBoxPosition: Vector3 = js.native
  /**
    * Gets or sets the size of the bounding box associated with the texture (when in cube mode)
    * When defined, the cubemap will switch to local mode
    * @see https://community.arm.com/graphics/b/blog/posts/reflections-based-on-local-cubemaps-in-unity
    * @example https://www.babylonjs-playground.com/#RNASML
    */
  var boundingBoxSize: Vector3 = js.native
  /**
    * Define the clear color of the Render Target if it should be different from the scene.
    */
  var clearColor: Color4 = js.native
  /**
    * In case the RTT has been created with a depth texture, get the associated
    * depth texture.
    * Otherwise, return null.
    */
  var depthStencilTexture: Nullable[InternalTexture] = js.native
  /**
    * Define if the camera viewport should be respected while rendering the texture or if the render should be done to the entire texture.
    */
  var ignoreCameraViewport: scala.Boolean = js.native
  /**
    * An event triggered after rendering the texture
    */
  var onAfterRenderObservable: Observable[scala.Double] = js.native
  /**
    * An event triggered when the texture is unbind.
    */
  var onAfterUnbindObservable: Observable[RenderTargetTexture] = js.native
  /**
    * An event triggered when the texture is unbind.
    */
  var onBeforeBindObservable: Observable[RenderTargetTexture] = js.native
  /**
    * An event triggered before rendering the texture
    */
  var onBeforeRenderObservable: Observable[scala.Double] = js.native
  /**
    * An event triggered after the texture clear
    */
  var onClearObservable: Observable[Engine] = js.native
  /**
    * Define the refresh rate of the texture or the rendering frequency.
    * Use 0 to render just once, 1 to render on every frame, 2 to render every two frames and so on...
    */
  var refreshRate: scala.Double = js.native
  /**
    * Use this list to define the list of mesh you want to render.
    */
  var renderList: Nullable[js.Array[AbstractMesh]] = js.native
  /**
    * Define if particles should be rendered in your texture.
    */
  var renderParticles: scala.Boolean = js.native
  /**
    * Define if sprites should be rendered in your texture.
    */
  var renderSprites: scala.Boolean = js.native
  /**
    * Gets render target creation options that were used.
    */
  val renderTargetOptions: RenderTargetCreationOptions = js.native
  var renderToTarget: js.Any = js.native
  /**
    * Define the number of samples to use in case of MSAA.
    * It defaults to one meaning no MSAA has been enabled.
    */
  var samples: scala.Double = js.native
  /**
    * Define if camera post processes should be use while rendering the texture.
    */
  var useCameraPostProcesses: scala.Boolean = js.native
  /* protected */ def _onRatioRescale(): scala.Unit = js.native
  /** @hidden */
  def _shouldRender(): scala.Boolean = js.native
  /**
    * Adds a post process to the render target rendering passes.
    * @param postProcess define the post process to add
    */
  def addPostProcess(postProcess: PostProcess): scala.Unit = js.native
  /**
    * Clear all the post processes attached to the render target
    * @param dispose define if the cleared post processesshould also be disposed (false by default)
    */
  def clearPostProcesses(): scala.Unit = js.native
  def clearPostProcesses(dispose: scala.Boolean): scala.Unit = js.native
  /**
    * Creates a depth stencil texture.
    * This is only available in WebGL 2 or with the depth texture extension available.
    * @param comparisonFunction Specifies the comparison function to set on the texture. If 0 or undefined, the texture is not in comparison mode
    * @param bilinearFiltering Specifies whether or not bilinear filtering is enable on the texture
    * @param generateStencil Specifies whether or not a stencil should be allocated in the texture
    */
  def createDepthStencilTexture(): scala.Unit = js.native
  def createDepthStencilTexture(comparisonFunction: scala.Double): scala.Unit = js.native
  def createDepthStencilTexture(comparisonFunction: scala.Double, bilinearFiltering: scala.Boolean): scala.Unit = js.native
  def createDepthStencilTexture(comparisonFunction: scala.Double, bilinearFiltering: scala.Boolean, generateStencil: scala.Boolean): scala.Unit = js.native
  /**
    * Override the render function of the texture with your own one.
    */
  def customRenderFunction(
    opaqueSubMeshes: SmartArray[SubMesh],
    alphaTestSubMeshes: SmartArray[SubMesh],
    transparentSubMeshes: SmartArray[SubMesh],
    depthOnlySubMeshes: SmartArray[SubMesh]
  ): scala.Unit = js.native
  def customRenderFunction(
    opaqueSubMeshes: SmartArray[SubMesh],
    alphaTestSubMeshes: SmartArray[SubMesh],
    transparentSubMeshes: SmartArray[SubMesh],
    depthOnlySubMeshes: SmartArray[SubMesh],
    beforeTransparents: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
    *  This will remove the attached framebuffer objects. The texture will not be able to be used as render target anymore
    */
  def disposeFramebufferObjects(): scala.Unit = js.native
  /**
    * Clear the info related to rendering groups preventing retention point in material dispose.
    */
  def freeRenderingGroups(): scala.Unit = js.native
  /**
    * Gets the actual render height of the texture.
    * @returns the height of the render size
    */
  def getRenderHeight(): scala.Double = js.native
  /**
    * Gets the actual render size of the texture.
    * @returns the width of the render size
    */
  def getRenderSize(): scala.Double = js.native
  /**
    * Gets the actual render width of the texture.
    * @returns the width of the render size
    */
  def getRenderWidth(): scala.Double = js.native
  /**
    * Set a after render callback in the texture.
    * This has been kept for backward compatibility and use of onAfterRenderObservable is recommended.
    */
  def onAfterRender(faceIndex: scala.Double): scala.Unit = js.native
  /**
    * Set a after unbind callback in the texture.
    * This has been kept for backward compatibility and use of onAfterUnbindObservable is recommended.
    */
  def onAfterUnbind(): scala.Unit = js.native
  /**
    * Set a before render callback in the texture.
    * This has been kept for backward compatibility and use of onBeforeRenderObservable is recommended.
    */
  def onBeforeRender(faceIndex: scala.Double): scala.Unit = js.native
  /**
    * Set a clear callback in the texture.
    * This has been kept for backward compatibility and use of onClearObservable is recommended.
    */
  def onClear(Engine: Engine): scala.Unit = js.native
  /**
    * Remove one of the post process from the list of attached post processes to the texture
    * @param postProcess define the post process to remove from the list
    */
  def removePostProcess(postProcess: PostProcess): scala.Unit = js.native
  /**
    * Renders all the objects from the render list into the texture.
    * @param useCameraPostProcess Define if camera post processes should be used during the rendering
    * @param dumpForDebug Define if the rendering result should be dumped (copied) for debugging purpose
    */
  def render(): scala.Unit = js.native
  def render(useCameraPostProcess: scala.Boolean): scala.Unit = js.native
  def render(useCameraPostProcess: scala.Boolean, dumpForDebug: scala.Boolean): scala.Unit = js.native
  /**
    * Use this predicate to dynamically define the list of mesh you want to render.
    * If set, the renderList property will be overwritten.
    */
  def renderListPredicate(AbstractMesh: AbstractMesh): scala.Boolean = js.native
  /**
    * Resets the refresh counter of the texture and start bak from scratch.
    * Could be usefull to regenerate the texture if it is setup to render only once.
    */
  def resetRefreshCounter(): scala.Unit = js.native
  def resize(size: babylonjsLib.Anon_Height): scala.Unit = js.native
  def resize(size: babylonjsLib.Anon_Ratio): scala.Unit = js.native
  /**
    * Resize the texture to a new desired size.
    * Be carrefull as it will recreate all the data in the new texture.
    * @param size Define the new size. It can be:
    *   - a number for squared texture,
    *   - an object containing { width: number, height: number }
    *   - or an object containing a ratio { ratio: number }
    */
  def resize(size: scala.Double): scala.Unit = js.native
  /**
    * Specifies whether or not the stencil and depth buffer are cleared between two rendering groups.
    *
    * @param renderingGroupId The rendering group id corresponding to its index
    * @param autoClearDepthStencil Automatically clears depth and stencil between groups if true.
    */
  def setRenderingAutoClearDepthStencil(renderingGroupId: scala.Double, autoClearDepthStencil: scala.Boolean): scala.Unit = js.native
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
  def setRenderingOrder(
    renderingGroupId: scala.Double,
    opaqueSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, scala.Double]]
  ): scala.Unit = js.native
  def setRenderingOrder(
    renderingGroupId: scala.Double,
    opaqueSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, scala.Double]],
    alphaTestSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, scala.Double]]
  ): scala.Unit = js.native
  def setRenderingOrder(
    renderingGroupId: scala.Double,
    opaqueSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, scala.Double]],
    alphaTestSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, scala.Double]],
    transparentSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, scala.Double]]
  ): scala.Unit = js.native
  /* protected */ def unbindFrameBuffer(engine: Engine, faceIndex: scala.Double): scala.Unit = js.native
}

/**
  * This Helps creating a texture that will be created from a camera in your scene.
  * It is basically a dynamic texture that could be used to create special effects for instance.
  * Actually, It is the base of lot of effects in the framework like post process, shadows, effect layers and rendering pipelines...
  */
@JSGlobal("BABYLON.RenderTargetTexture")
@js.native
object RenderTargetTexture extends js.Object {
  /**
    * The texture will only be rendered once which can be useful to improve performance if everything in your render is static for instance.
    */
  val REFRESHRATE_RENDER_ONCE: scala.Double = js.native
  /**
    * The texture will only be rendered rendered every frame and is recomended for dynamic contents.
    */
  val REFRESHRATE_RENDER_ONEVERYFRAME: scala.Double = js.native
  /**
    * The texture will be rendered every 2 frames which could be enough if your dynamic objects are not
    * the central point of your effect and can save a lot of performances.
    */
  val REFRESHRATE_RENDER_ONEVERYTWOFRAMES: scala.Double = js.native
}

