package typings.babylonjs.BABYLON

import typings.babylonjs.GPUBindGroup
import typings.babylonjs.GPURenderPassDescriptor
import typings.babylonjs.GPUTexture
import typings.babylonjs.GPUTextureFormat
import typings.babylonjs.GPUTextureView
import typings.babylonjs.GPUTextureViewDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGPUHardwareTexture
  extends StObject
     with HardwareTextureWrapper {
  
  /**
    * List of bundles collected in the snapshot rendering mode when the texture is a render target texture
    * The index in this array is the current layer we are rendering into
    * @internal
    */
  var _bundleLists: js.Array[WebGPUBundleList] = js.native
  
  /** @internal */
  var _copyInvertYBindGroup: GPUBindGroup = js.native
  
  /** @internal */
  var _copyInvertYBindGroupWithOfst: GPUBindGroup = js.native
  
  /** @internal */
  var _copyInvertYRenderPassDescr: GPURenderPassDescriptor = js.native
  
  /**
    * Cache for the invertYPreMultiplyAlpha function (see WebGPUTextureHelper)
    * @internal
    */
  var _copyInvertYTempTexture: js.UndefOr[GPUTexture] = js.native
  
  /**
    * Current layer we are rendering into when in snapshot rendering mode (if the texture is a render target texture)
    * @internal
    */
  var _currentLayer: Double = js.native
  
  /** @internal */
  var _mipmapGenBindGroup: js.Array[js.Array[GPUBindGroup]] = js.native
  
  /**
    * Cache of RenderPassDescriptor and BindGroup used when generating mipmaps (see WebGPUTextureHelper.generateMipmaps)
    * @internal
    */
  var _mipmapGenRenderPassDescr: js.Array[js.Array[GPURenderPassDescriptor]] = js.native
  
  /* private */ var _webgpuMSAATexture: Any = js.native
  
  /* private */ var _webgpuTexture: Any = js.native
  
  def createView(): Unit = js.native
  def createView(descriptor: Unit, createViewForWriting: Boolean): Unit = js.native
  def createView(descriptor: GPUTextureViewDescriptor): Unit = js.native
  def createView(descriptor: GPUTextureViewDescriptor, createViewForWriting: Boolean): Unit = js.native
  
  var format: GPUTextureFormat = js.native
  
  def msaaTexture: Nullable[GPUTexture] = js.native
  def msaaTexture_=(texture: Nullable[GPUTexture]): Unit = js.native
  
  def set(hardwareTexture: GPUTexture): Unit = js.native
  
  var textureAdditionalUsages: Double = js.native
  
  var textureUsages: Double = js.native
  
  @JSName("underlyingResource")
  def underlyingResource_MWebGPUHardwareTexture: Nullable[GPUTexture] = js.native
  
  var view: Nullable[GPUTextureView] = js.native
  
  var viewForWriting: Nullable[GPUTextureView] = js.native
}
