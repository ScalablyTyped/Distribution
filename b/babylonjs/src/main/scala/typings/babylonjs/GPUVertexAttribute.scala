package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUVertexAttribute extends StObject {
  
  var format: GPUVertexFormat
  
  var offset: GPUSize64
  
  var shaderLocation: GPUIndex32
}
object GPUVertexAttribute {
  
  inline def apply(format: GPUVertexFormat, offset: GPUSize64, shaderLocation: GPUIndex32): GPUVertexAttribute = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], shaderLocation = shaderLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUVertexAttribute]
  }
  
  extension [Self <: GPUVertexAttribute](x: Self) {
    
    inline def setFormat(value: GPUVertexFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: GPUSize64): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setShaderLocation(value: GPUIndex32): Self = StObject.set(x, "shaderLocation", value.asInstanceOf[js.Any])
  }
}
