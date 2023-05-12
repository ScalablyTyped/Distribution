package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPUTexture
  extends StObject
     with GPUObjectBase {
  
  def createView(): GPUTextureView = js.native
  def createView(descriptor: GPUTextureViewDescriptor): GPUTextureView = js.native
  
  val depthOrArrayLayers: GPUIntegerCoordinate = js.native
  
  def destroy(): Unit = js.native
  
  val dimension: GPUTextureDimension = js.native
  
  val format: GPUTextureFormat = js.native
  
  val height: GPUIntegerCoordinate = js.native
  
  val mipLevelCount: GPUIntegerCoordinate = js.native
  
  val sampleCount: GPUSize32 = js.native
  
  val usage: GPUTextureUsageFlags = js.native
  
  val width: GPUIntegerCoordinate = js.native
}
