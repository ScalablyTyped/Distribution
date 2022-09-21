package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetStreamKeyResponse extends StObject {
  
  /**
    * 
    */
  var errors: js.UndefOr[BatchErrors] = js.undefined
  
  /**
    * 
    */
  var streamKeys: js.UndefOr[StreamKeys] = js.undefined
}
object BatchGetStreamKeyResponse {
  
  inline def apply(): BatchGetStreamKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetStreamKeyResponse]
  }
  
  extension [Self <: BatchGetStreamKeyResponse](x: Self) {
    
    inline def setErrors(value: BatchErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: BatchError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setStreamKeys(value: StreamKeys): Self = StObject.set(x, "streamKeys", value.asInstanceOf[js.Any])
    
    inline def setStreamKeysUndefined: Self = StObject.set(x, "streamKeys", js.undefined)
    
    inline def setStreamKeysVarargs(value: StreamKey*): Self = StObject.set(x, "streamKeys", js.Array(value*))
  }
}
