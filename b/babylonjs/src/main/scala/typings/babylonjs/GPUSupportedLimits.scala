package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUSupportedLimits extends StObject {
  
  val maxBindGroups: GPUSize32
  
  val maxComputeInvocationsPerWorkgroup: GPUSize32
  
  val maxComputeWorkgroupSizeX: GPUSize32
  
  val maxComputeWorkgroupSizeY: GPUSize32
  
  val maxComputeWorkgroupSizeZ: GPUSize32
  
  val maxComputeWorkgroupStorageSize: GPUSize32
  
  val maxComputeWorkgroupsPerDimension: GPUSize32
  
  val maxDynamicStorageBuffersPerPipelineLayout: GPUSize32
  
  val maxDynamicUniformBuffersPerPipelineLayout: GPUSize32
  
  val maxInterStageShaderComponents: GPUSize32
  
  val maxSampledTexturesPerShaderStage: GPUSize32
  
  val maxSamplersPerShaderStage: GPUSize32
  
  val maxStorageBufferBindingSize: GPUSize64
  
  val maxStorageBuffersPerShaderStage: GPUSize32
  
  val maxStorageTexturesPerShaderStage: GPUSize32
  
  val maxTextureArrayLayers: GPUSize32
  
  val maxTextureDimension1D: GPUSize32
  
  val maxTextureDimension2D: GPUSize32
  
  val maxTextureDimension3D: GPUSize32
  
  val maxUniformBufferBindingSize: GPUSize64
  
  val maxUniformBuffersPerShaderStage: GPUSize32
  
  val maxVertexAttributes: GPUSize32
  
  val maxVertexBufferArrayStride: GPUSize32
  
  val maxVertexBuffers: GPUSize32
  
  val minStorageBufferOffsetAlignment: GPUSize32
  
  val minUniformBufferOffsetAlignment: GPUSize32
}
object GPUSupportedLimits {
  
  inline def apply(
    maxBindGroups: GPUSize32,
    maxComputeInvocationsPerWorkgroup: GPUSize32,
    maxComputeWorkgroupSizeX: GPUSize32,
    maxComputeWorkgroupSizeY: GPUSize32,
    maxComputeWorkgroupSizeZ: GPUSize32,
    maxComputeWorkgroupStorageSize: GPUSize32,
    maxComputeWorkgroupsPerDimension: GPUSize32,
    maxDynamicStorageBuffersPerPipelineLayout: GPUSize32,
    maxDynamicUniformBuffersPerPipelineLayout: GPUSize32,
    maxInterStageShaderComponents: GPUSize32,
    maxSampledTexturesPerShaderStage: GPUSize32,
    maxSamplersPerShaderStage: GPUSize32,
    maxStorageBufferBindingSize: GPUSize64,
    maxStorageBuffersPerShaderStage: GPUSize32,
    maxStorageTexturesPerShaderStage: GPUSize32,
    maxTextureArrayLayers: GPUSize32,
    maxTextureDimension1D: GPUSize32,
    maxTextureDimension2D: GPUSize32,
    maxTextureDimension3D: GPUSize32,
    maxUniformBufferBindingSize: GPUSize64,
    maxUniformBuffersPerShaderStage: GPUSize32,
    maxVertexAttributes: GPUSize32,
    maxVertexBufferArrayStride: GPUSize32,
    maxVertexBuffers: GPUSize32,
    minStorageBufferOffsetAlignment: GPUSize32,
    minUniformBufferOffsetAlignment: GPUSize32
  ): GPUSupportedLimits = {
    val __obj = js.Dynamic.literal(maxBindGroups = maxBindGroups.asInstanceOf[js.Any], maxComputeInvocationsPerWorkgroup = maxComputeInvocationsPerWorkgroup.asInstanceOf[js.Any], maxComputeWorkgroupSizeX = maxComputeWorkgroupSizeX.asInstanceOf[js.Any], maxComputeWorkgroupSizeY = maxComputeWorkgroupSizeY.asInstanceOf[js.Any], maxComputeWorkgroupSizeZ = maxComputeWorkgroupSizeZ.asInstanceOf[js.Any], maxComputeWorkgroupStorageSize = maxComputeWorkgroupStorageSize.asInstanceOf[js.Any], maxComputeWorkgroupsPerDimension = maxComputeWorkgroupsPerDimension.asInstanceOf[js.Any], maxDynamicStorageBuffersPerPipelineLayout = maxDynamicStorageBuffersPerPipelineLayout.asInstanceOf[js.Any], maxDynamicUniformBuffersPerPipelineLayout = maxDynamicUniformBuffersPerPipelineLayout.asInstanceOf[js.Any], maxInterStageShaderComponents = maxInterStageShaderComponents.asInstanceOf[js.Any], maxSampledTexturesPerShaderStage = maxSampledTexturesPerShaderStage.asInstanceOf[js.Any], maxSamplersPerShaderStage = maxSamplersPerShaderStage.asInstanceOf[js.Any], maxStorageBufferBindingSize = maxStorageBufferBindingSize.asInstanceOf[js.Any], maxStorageBuffersPerShaderStage = maxStorageBuffersPerShaderStage.asInstanceOf[js.Any], maxStorageTexturesPerShaderStage = maxStorageTexturesPerShaderStage.asInstanceOf[js.Any], maxTextureArrayLayers = maxTextureArrayLayers.asInstanceOf[js.Any], maxTextureDimension1D = maxTextureDimension1D.asInstanceOf[js.Any], maxTextureDimension2D = maxTextureDimension2D.asInstanceOf[js.Any], maxTextureDimension3D = maxTextureDimension3D.asInstanceOf[js.Any], maxUniformBufferBindingSize = maxUniformBufferBindingSize.asInstanceOf[js.Any], maxUniformBuffersPerShaderStage = maxUniformBuffersPerShaderStage.asInstanceOf[js.Any], maxVertexAttributes = maxVertexAttributes.asInstanceOf[js.Any], maxVertexBufferArrayStride = maxVertexBufferArrayStride.asInstanceOf[js.Any], maxVertexBuffers = maxVertexBuffers.asInstanceOf[js.Any], minStorageBufferOffsetAlignment = minStorageBufferOffsetAlignment.asInstanceOf[js.Any], minUniformBufferOffsetAlignment = minUniformBufferOffsetAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUSupportedLimits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUSupportedLimits] (val x: Self) extends AnyVal {
    
    inline def setMaxBindGroups(value: GPUSize32): Self = StObject.set(x, "maxBindGroups", value.asInstanceOf[js.Any])
    
    inline def setMaxComputeInvocationsPerWorkgroup(value: GPUSize32): Self = StObject.set(x, "maxComputeInvocationsPerWorkgroup", value.asInstanceOf[js.Any])
    
    inline def setMaxComputeWorkgroupSizeX(value: GPUSize32): Self = StObject.set(x, "maxComputeWorkgroupSizeX", value.asInstanceOf[js.Any])
    
    inline def setMaxComputeWorkgroupSizeY(value: GPUSize32): Self = StObject.set(x, "maxComputeWorkgroupSizeY", value.asInstanceOf[js.Any])
    
    inline def setMaxComputeWorkgroupSizeZ(value: GPUSize32): Self = StObject.set(x, "maxComputeWorkgroupSizeZ", value.asInstanceOf[js.Any])
    
    inline def setMaxComputeWorkgroupStorageSize(value: GPUSize32): Self = StObject.set(x, "maxComputeWorkgroupStorageSize", value.asInstanceOf[js.Any])
    
    inline def setMaxComputeWorkgroupsPerDimension(value: GPUSize32): Self = StObject.set(x, "maxComputeWorkgroupsPerDimension", value.asInstanceOf[js.Any])
    
    inline def setMaxDynamicStorageBuffersPerPipelineLayout(value: GPUSize32): Self = StObject.set(x, "maxDynamicStorageBuffersPerPipelineLayout", value.asInstanceOf[js.Any])
    
    inline def setMaxDynamicUniformBuffersPerPipelineLayout(value: GPUSize32): Self = StObject.set(x, "maxDynamicUniformBuffersPerPipelineLayout", value.asInstanceOf[js.Any])
    
    inline def setMaxInterStageShaderComponents(value: GPUSize32): Self = StObject.set(x, "maxInterStageShaderComponents", value.asInstanceOf[js.Any])
    
    inline def setMaxSampledTexturesPerShaderStage(value: GPUSize32): Self = StObject.set(x, "maxSampledTexturesPerShaderStage", value.asInstanceOf[js.Any])
    
    inline def setMaxSamplersPerShaderStage(value: GPUSize32): Self = StObject.set(x, "maxSamplersPerShaderStage", value.asInstanceOf[js.Any])
    
    inline def setMaxStorageBufferBindingSize(value: GPUSize64): Self = StObject.set(x, "maxStorageBufferBindingSize", value.asInstanceOf[js.Any])
    
    inline def setMaxStorageBuffersPerShaderStage(value: GPUSize32): Self = StObject.set(x, "maxStorageBuffersPerShaderStage", value.asInstanceOf[js.Any])
    
    inline def setMaxStorageTexturesPerShaderStage(value: GPUSize32): Self = StObject.set(x, "maxStorageTexturesPerShaderStage", value.asInstanceOf[js.Any])
    
    inline def setMaxTextureArrayLayers(value: GPUSize32): Self = StObject.set(x, "maxTextureArrayLayers", value.asInstanceOf[js.Any])
    
    inline def setMaxTextureDimension1D(value: GPUSize32): Self = StObject.set(x, "maxTextureDimension1D", value.asInstanceOf[js.Any])
    
    inline def setMaxTextureDimension2D(value: GPUSize32): Self = StObject.set(x, "maxTextureDimension2D", value.asInstanceOf[js.Any])
    
    inline def setMaxTextureDimension3D(value: GPUSize32): Self = StObject.set(x, "maxTextureDimension3D", value.asInstanceOf[js.Any])
    
    inline def setMaxUniformBufferBindingSize(value: GPUSize64): Self = StObject.set(x, "maxUniformBufferBindingSize", value.asInstanceOf[js.Any])
    
    inline def setMaxUniformBuffersPerShaderStage(value: GPUSize32): Self = StObject.set(x, "maxUniformBuffersPerShaderStage", value.asInstanceOf[js.Any])
    
    inline def setMaxVertexAttributes(value: GPUSize32): Self = StObject.set(x, "maxVertexAttributes", value.asInstanceOf[js.Any])
    
    inline def setMaxVertexBufferArrayStride(value: GPUSize32): Self = StObject.set(x, "maxVertexBufferArrayStride", value.asInstanceOf[js.Any])
    
    inline def setMaxVertexBuffers(value: GPUSize32): Self = StObject.set(x, "maxVertexBuffers", value.asInstanceOf[js.Any])
    
    inline def setMinStorageBufferOffsetAlignment(value: GPUSize32): Self = StObject.set(x, "minStorageBufferOffsetAlignment", value.asInstanceOf[js.Any])
    
    inline def setMinUniformBufferOffsetAlignment(value: GPUSize32): Self = StObject.set(x, "minUniformBufferOffsetAlignment", value.asInstanceOf[js.Any])
  }
}
