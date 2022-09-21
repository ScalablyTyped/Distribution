package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AesGcmParams
  extends StObject
     with Algorithm {
  
  var additionalData: js.UndefOr[BufferSource] = js.undefined
  
  var iv: BufferSource
  
  var tagLength: js.UndefOr[Double] = js.undefined
}
object AesGcmParams {
  
  inline def apply(iv: BufferSource, name: java.lang.String): AesGcmParams = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesGcmParams]
  }
  
  extension [Self <: AesGcmParams](x: Self) {
    
    inline def setAdditionalData(value: BufferSource): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
    
    inline def setAdditionalDataUndefined: Self = StObject.set(x, "additionalData", js.undefined)
    
    inline def setIv(value: BufferSource): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    inline def setTagLength(value: Double): Self = StObject.set(x, "tagLength", value.asInstanceOf[js.Any])
    
    inline def setTagLengthUndefined: Self = StObject.set(x, "tagLength", js.undefined)
  }
}
