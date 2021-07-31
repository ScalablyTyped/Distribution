package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetStreamKeyResponse extends StObject {
  
  var errors: js.UndefOr[BatchErrors] = js.undefined
  
  var streamKeys: js.UndefOr[StreamKeys] = js.undefined
}
object BatchGetStreamKeyResponse {
  
  @scala.inline
  def apply(): BatchGetStreamKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetStreamKeyResponse]
  }
  
  @scala.inline
  implicit class BatchGetStreamKeyResponseMutableBuilder[Self <: BatchGetStreamKeyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: BatchErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: BatchError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setStreamKeys(value: StreamKeys): Self = StObject.set(x, "streamKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamKeysUndefined: Self = StObject.set(x, "streamKeys", js.undefined)
    
    @scala.inline
    def setStreamKeysVarargs(value: StreamKey*): Self = StObject.set(x, "streamKeys", js.Array(value :_*))
  }
}
