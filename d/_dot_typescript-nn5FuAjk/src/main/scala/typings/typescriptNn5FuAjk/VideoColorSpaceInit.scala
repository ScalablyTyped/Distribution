package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoColorSpaceInit extends StObject {
  
  var fullRange: js.UndefOr[scala.Boolean] = js.undefined
  
  var matrix: js.UndefOr[VideoMatrixCoefficients] = js.undefined
  
  var primaries: js.UndefOr[VideoColorPrimaries] = js.undefined
  
  var transfer: js.UndefOr[VideoTransferCharacteristics] = js.undefined
}
object VideoColorSpaceInit {
  
  inline def apply(): VideoColorSpaceInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoColorSpaceInit]
  }
  
  extension [Self <: VideoColorSpaceInit](x: Self) {
    
    inline def setFullRange(value: scala.Boolean): Self = StObject.set(x, "fullRange", value.asInstanceOf[js.Any])
    
    inline def setFullRangeUndefined: Self = StObject.set(x, "fullRange", js.undefined)
    
    inline def setMatrix(value: VideoMatrixCoefficients): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
    
    inline def setPrimaries(value: VideoColorPrimaries): Self = StObject.set(x, "primaries", value.asInstanceOf[js.Any])
    
    inline def setPrimariesUndefined: Self = StObject.set(x, "primaries", js.undefined)
    
    inline def setTransfer(value: VideoTransferCharacteristics): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
    
    inline def setTransferUndefined: Self = StObject.set(x, "transfer", js.undefined)
  }
}
