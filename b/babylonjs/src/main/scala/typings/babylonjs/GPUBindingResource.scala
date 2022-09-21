package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babylonjs.GPUSampler
  - typings.babylonjs.GPUTextureView
  - typings.babylonjs.GPUBufferBinding
  - typings.babylonjs.GPUExternalTexture
*/
trait GPUBindingResource extends StObject
object GPUBindingResource {
  
  inline def GPUBufferBinding(buffer: GPUBuffer): typings.babylonjs.GPUBufferBinding = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babylonjs.GPUBufferBinding]
  }
  
  inline def GPUExternalTexture(): typings.babylonjs.GPUExternalTexture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.babylonjs.GPUExternalTexture]
  }
  
  inline def GPUSampler(): typings.babylonjs.GPUSampler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.babylonjs.GPUSampler]
  }
  
  inline def GPUTextureView(): typings.babylonjs.GPUTextureView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.babylonjs.GPUTextureView]
  }
}
