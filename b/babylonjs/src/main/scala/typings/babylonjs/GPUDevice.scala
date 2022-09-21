package typings.babylonjs

import typings.std.Event
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPUDevice
  extends StObject
     with EventTarget
     with GPUObjectBase {
  
  def createBindGroup(descriptor: GPUBindGroupDescriptor): GPUBindGroup = js.native
  
  def createBindGroupLayout(descriptor: GPUBindGroupLayoutDescriptor): GPUBindGroupLayout = js.native
  
  def createBuffer(descriptor: GPUBufferDescriptor): GPUBuffer = js.native
  
  def createCommandEncoder(): GPUCommandEncoder = js.native
  def createCommandEncoder(descriptor: GPUCommandEncoderDescriptor): GPUCommandEncoder = js.native
  
  def createComputePipeline(descriptor: GPUComputePipelineDescriptor): GPUComputePipeline = js.native
  
  def createComputePipelineAsync(descriptor: GPUComputePipelineDescriptor): js.Promise[GPUComputePipeline] = js.native
  
  def createPipelineLayout(descriptor: GPUPipelineLayoutDescriptor): GPUPipelineLayout = js.native
  
  def createQuerySet(descriptor: GPUQuerySetDescriptor): GPUQuerySet = js.native
  
  def createRenderBundleEncoder(descriptor: GPURenderBundleEncoderDescriptor): GPURenderBundleEncoder = js.native
  
  def createRenderPipeline(descriptor: GPURenderPipelineDescriptor): GPURenderPipeline = js.native
  
  def createRenderPipelineAsync(descriptor: GPURenderPipelineDescriptor): js.Promise[GPURenderPipeline] = js.native
  
  def createSampler(): GPUSampler = js.native
  def createSampler(descriptor: GPUSamplerDescriptor): GPUSampler = js.native
  
  def createShaderModule(descriptor: GPUShaderModuleDescriptor): GPUShaderModule = js.native
  
  def createTexture(descriptor: GPUTextureDescriptor): GPUTexture = js.native
  
  def destroy(): Unit = js.native
  
  val features: GPUSupportedFeatures = js.native
  
  def importExternalTexture(descriptor: GPUExternalTextureDescriptor): GPUExternalTexture = js.native
  
  val limits: GPUSupportedLimits = js.native
  
  val lost: js.Promise[GPUDeviceLostInfo] = js.native
  
  var onuncapturederror: js.UndefOr[Event] = js.native
  
  def popErrorScope(): js.Promise[js.UndefOr[GPUError]] = js.native
  
  def pushErrorScope(filter: GPUErrorFilter): Unit = js.native
  
  val queue: GPUQueue = js.native
}
