package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUSupportedLimits
  extends StObject
     with /* name */ StringDictionary[Double] {
  
  val maxBindGroups: Double
  
  val maxBindingsPerBindGroup: Double
  
  val maxBufferSize: Double
  
  val maxColorAttachmentBytesPerSample: Double
  
  val maxColorAttachments: Double
  
  val maxComputeInvocationsPerWorkgroup: Double
  
  val maxComputeWorkgroupSizeX: Double
  
  val maxComputeWorkgroupSizeY: Double
  
  val maxComputeWorkgroupSizeZ: Double
  
  val maxComputeWorkgroupStorageSize: Double
  
  val maxComputeWorkgroupsPerDimension: Double
  
  val maxDynamicStorageBuffersPerPipelineLayout: Double
  
  val maxDynamicUniformBuffersPerPipelineLayout: Double
  
  val maxFragmentCombinedOutputResources: Double
  
  val maxInterStageShaderComponents: Double
  
  val maxInterStageShaderVariables: Double
  
  val maxSampledTexturesPerShaderStage: Double
  
  val maxSamplersPerShaderStage: Double
  
  val maxStorageBufferBindingSize: Double
  
  val maxStorageBuffersPerShaderStage: Double
  
  val maxStorageTexturesPerShaderStage: Double
  
  val maxTextureArrayLayers: Double
  
  val maxTextureDimension1D: Double
  
  val maxTextureDimension2D: Double
  
  val maxTextureDimension3D: Double
  
  val maxUniformBufferBindingSize: Double
  
  val maxUniformBuffersPerShaderStage: Double
  
  val maxVertexAttributes: Double
  
  val maxVertexBufferArrayStride: Double
  
  val maxVertexBuffers: Double
  
  val minStorageBufferOffsetAlignment: Double
  
  val minUniformBufferOffsetAlignment: Double
}
object GPUSupportedLimits {
  
  inline def apply(
    maxBindGroups: Double,
    maxBindingsPerBindGroup: Double,
    maxBufferSize: Double,
    maxColorAttachmentBytesPerSample: Double,
    maxColorAttachments: Double,
    maxComputeInvocationsPerWorkgroup: Double,
    maxComputeWorkgroupSizeX: Double,
    maxComputeWorkgroupSizeY: Double,
    maxComputeWorkgroupSizeZ: Double,
    maxComputeWorkgroupStorageSize: Double,
    maxComputeWorkgroupsPerDimension: Double,
    maxDynamicStorageBuffersPerPipelineLayout: Double,
    maxDynamicUniformBuffersPerPipelineLayout: Double,
    maxFragmentCombinedOutputResources: Double,
    maxInterStageShaderComponents: Double,
    maxInterStageShaderVariables: Double,
    maxSampledTexturesPerShaderStage: Double,
    maxSamplersPerShaderStage: Double,
    maxStorageBufferBindingSize: Double,
    maxStorageBuffersPerShaderStage: Double,
    maxStorageTexturesPerShaderStage: Double,
    maxTextureArrayLayers: Double,
    maxTextureDimension1D: Double,
    maxTextureDimension2D: Double,
    maxTextureDimension3D: Double,
    maxUniformBufferBindingSize: Double,
    maxUniformBuffersPerShaderStage: Double,
    maxVertexAttributes: Double,
    maxVertexBufferArrayStride: Double,
    maxVertexBuffers: Double,
    minStorageBufferOffsetAlignment: Double,
    minUniformBufferOffsetAlignment: Double
  ): GPUSupportedLimits = {
    val __obj = js.Dynamic.literal(maxBindGroups = maxBindGroups.asInstanceOf[js.Any], maxBindingsPerBindGroup = maxBindingsPerBindGroup.asInstanceOf[js.Any], maxBufferSize = maxBufferSize.asInstanceOf[js.Any], maxColorAttachmentBytesPerSample = maxColorAttachmentBytesPerSample.asInstanceOf[js.Any], maxColorAttachments = maxColorAttachments.asInstanceOf[js.Any], maxComputeInvocationsPerWorkgroup = maxComputeInvocationsPerWorkgroup.asInstanceOf[js.Any], maxComputeWorkgroupSizeX = maxComputeWorkgroupSizeX.asInstanceOf[js.Any], maxComputeWorkgroupSizeY = maxComputeWorkgroupSizeY.asInstanceOf[js.Any], maxComputeWorkgroupSizeZ = maxComputeWorkgroupSizeZ.asInstanceOf[js.Any], maxComputeWorkgroupStorageSize = maxComputeWorkgroupStorageSize.asInstanceOf[js.Any], maxComputeWorkgroupsPerDimension = maxComputeWorkgroupsPerDimension.asInstanceOf[js.Any], maxDynamicStorageBuffersPerPipelineLayout = maxDynamicStorageBuffersPerPipelineLayout.asInstanceOf[js.Any], maxDynamicUniformBuffersPerPipelineLayout = maxDynamicUniformBuffersPerPipelineLayout.asInstanceOf[js.Any], maxFragmentCombinedOutputResources = maxFragmentCombinedOutputResources.asInstanceOf[js.Any], maxInterStageShaderComponents = maxInterStageShaderComponents.asInstanceOf[js.Any], maxInterStageShaderVariables = maxInterStageShaderVariables.asInstanceOf[js.Any], maxSampledTexturesPerShaderStage = maxSampledTexturesPerShaderStage.asInstanceOf[js.Any], maxSamplersPerShaderStage = maxSamplersPerShaderStage.asInstanceOf[js.Any], maxStorageBufferBindingSize = maxStorageBufferBindingSize.asInstanceOf[js.Any], maxStorageBuffersPerShaderStage = maxStorageBuffersPerShaderStage.asInstanceOf[js.Any], maxStorageTexturesPerShaderStage = maxStorageTexturesPerShaderStage.asInstanceOf[js.Any], maxTextureArrayLayers = maxTextureArrayLayers.asInstanceOf[js.Any], maxTextureDimension1D = maxTextureDimension1D.asInstanceOf[js.Any], maxTextureDimension2D = maxTextureDimension2D.asInstanceOf[js.Any], maxTextureDimension3D = maxTextureDimension3D.asInstanceOf[js.Any], maxUniformBufferBindingSize = maxUniformBufferBindingSize.asInstanceOf[js.Any], maxUniformBuffersPerShaderStage = maxUniformBuffersPerShaderStage.asInstanceOf[js.Any], maxVertexAttributes = maxVertexAttributes.asInstanceOf[js.Any], maxVertexBufferArrayStride = maxVertexBufferArrayStride.asInstanceOf[js.Any], maxVertexBuffers = maxVertexBuffers.asInstanceOf[js.Any], minStorageBufferOffsetAlignment = minStorageBufferOffsetAlignment.asInstanceOf[js.Any], minUniformBufferOffsetAlignment = minUniformBufferOffsetAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUSupportedLimits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUSupportedLimits] (val x: Self) extends AnyVal {
    
    inline def setMaxBindGroups(value: Double): Self = StObject.set(x, "maxBindGroups", value.asInstanceOf[js.Any])
    
    inline def setMaxBindingsPerBindGroup(value: Double): Self = StObject.set(x, "maxBindingsPerBindGroup", value.asInstanceOf[js.Any])
    
    inline def setMaxBufferSize(value: Double): Self = StObject.set(x, "maxBufferSize", value.asInstanceOf[js.Any])
    
    inline def setMaxColorAttachmentBytesPerSample(value: Double): Self = StObject.set(x, "maxColorAttachmentBytesPerSample", value.asInstanceOf[js.Any])
    
    inline def setMaxColorAttachments(value: Double): Self = StObject.set(x, "maxColorAttachments", value.asInstanceOf[js.Any])
    
    inline def setMaxComputeInvocationsPerWorkgroup(value: Double): Self = StObject.set(x, "maxComputeInvocationsPerWorkgroup", value.asInstanceOf[js.Any])
    
    inline def setMaxComputeWorkgroupSizeX(value: Double): Self = StObject.set(x, "maxComputeWorkgroupSizeX", value.asInstanceOf[js.Any])
    
    inline def setMaxComputeWorkgroupSizeY(value: Double): Self = StObject.set(x, "maxComputeWorkgroupSizeY", value.asInstanceOf[js.Any])
    
    inline def setMaxComputeWorkgroupSizeZ(value: Double): Self = StObject.set(x, "maxComputeWorkgroupSizeZ", value.asInstanceOf[js.Any])
    
    inline def setMaxComputeWorkgroupStorageSize(value: Double): Self = StObject.set(x, "maxComputeWorkgroupStorageSize", value.asInstanceOf[js.Any])
    
    inline def setMaxComputeWorkgroupsPerDimension(value: Double): Self = StObject.set(x, "maxComputeWorkgroupsPerDimension", value.asInstanceOf[js.Any])
    
    inline def setMaxDynamicStorageBuffersPerPipelineLayout(value: Double): Self = StObject.set(x, "maxDynamicStorageBuffersPerPipelineLayout", value.asInstanceOf[js.Any])
    
    inline def setMaxDynamicUniformBuffersPerPipelineLayout(value: Double): Self = StObject.set(x, "maxDynamicUniformBuffersPerPipelineLayout", value.asInstanceOf[js.Any])
    
    inline def setMaxFragmentCombinedOutputResources(value: Double): Self = StObject.set(x, "maxFragmentCombinedOutputResources", value.asInstanceOf[js.Any])
    
    inline def setMaxInterStageShaderComponents(value: Double): Self = StObject.set(x, "maxInterStageShaderComponents", value.asInstanceOf[js.Any])
    
    inline def setMaxInterStageShaderVariables(value: Double): Self = StObject.set(x, "maxInterStageShaderVariables", value.asInstanceOf[js.Any])
    
    inline def setMaxSampledTexturesPerShaderStage(value: Double): Self = StObject.set(x, "maxSampledTexturesPerShaderStage", value.asInstanceOf[js.Any])
    
    inline def setMaxSamplersPerShaderStage(value: Double): Self = StObject.set(x, "maxSamplersPerShaderStage", value.asInstanceOf[js.Any])
    
    inline def setMaxStorageBufferBindingSize(value: Double): Self = StObject.set(x, "maxStorageBufferBindingSize", value.asInstanceOf[js.Any])
    
    inline def setMaxStorageBuffersPerShaderStage(value: Double): Self = StObject.set(x, "maxStorageBuffersPerShaderStage", value.asInstanceOf[js.Any])
    
    inline def setMaxStorageTexturesPerShaderStage(value: Double): Self = StObject.set(x, "maxStorageTexturesPerShaderStage", value.asInstanceOf[js.Any])
    
    inline def setMaxTextureArrayLayers(value: Double): Self = StObject.set(x, "maxTextureArrayLayers", value.asInstanceOf[js.Any])
    
    inline def setMaxTextureDimension1D(value: Double): Self = StObject.set(x, "maxTextureDimension1D", value.asInstanceOf[js.Any])
    
    inline def setMaxTextureDimension2D(value: Double): Self = StObject.set(x, "maxTextureDimension2D", value.asInstanceOf[js.Any])
    
    inline def setMaxTextureDimension3D(value: Double): Self = StObject.set(x, "maxTextureDimension3D", value.asInstanceOf[js.Any])
    
    inline def setMaxUniformBufferBindingSize(value: Double): Self = StObject.set(x, "maxUniformBufferBindingSize", value.asInstanceOf[js.Any])
    
    inline def setMaxUniformBuffersPerShaderStage(value: Double): Self = StObject.set(x, "maxUniformBuffersPerShaderStage", value.asInstanceOf[js.Any])
    
    inline def setMaxVertexAttributes(value: Double): Self = StObject.set(x, "maxVertexAttributes", value.asInstanceOf[js.Any])
    
    inline def setMaxVertexBufferArrayStride(value: Double): Self = StObject.set(x, "maxVertexBufferArrayStride", value.asInstanceOf[js.Any])
    
    inline def setMaxVertexBuffers(value: Double): Self = StObject.set(x, "maxVertexBuffers", value.asInstanceOf[js.Any])
    
    inline def setMinStorageBufferOffsetAlignment(value: Double): Self = StObject.set(x, "minStorageBufferOffsetAlignment", value.asInstanceOf[js.Any])
    
    inline def setMinUniformBufferOffsetAlignment(value: Double): Self = StObject.set(x, "minUniformBufferOffsetAlignment", value.asInstanceOf[js.Any])
  }
}
