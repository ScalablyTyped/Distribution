package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUImageDataLayout extends StObject {
  
  var bytesPerRow: GPUSize32
  
  var offset: js.UndefOr[GPUSize64] = js.undefined
  
  var rowsPerImage: js.UndefOr[GPUSize32] = js.undefined
}
object GPUImageDataLayout {
  
  inline def apply(bytesPerRow: GPUSize32): GPUImageDataLayout = {
    val __obj = js.Dynamic.literal(bytesPerRow = bytesPerRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUImageDataLayout]
  }
  
  extension [Self <: GPUImageDataLayout](x: Self) {
    
    inline def setBytesPerRow(value: GPUSize32): Self = StObject.set(x, "bytesPerRow", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: GPUSize64): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setRowsPerImage(value: GPUSize32): Self = StObject.set(x, "rowsPerImage", value.asInstanceOf[js.Any])
    
    inline def setRowsPerImageUndefined: Self = StObject.set(x, "rowsPerImage", js.undefined)
  }
}
