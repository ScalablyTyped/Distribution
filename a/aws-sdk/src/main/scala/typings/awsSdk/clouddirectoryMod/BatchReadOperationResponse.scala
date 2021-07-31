package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchReadOperationResponse extends StObject {
  
  /**
    * Identifies which operation in a batch has failed.
    */
  var ExceptionResponse: js.UndefOr[BatchReadException] = js.undefined
  
  /**
    * Identifies which operation in a batch has succeeded.
    */
  var SuccessfulResponse: js.UndefOr[BatchReadSuccessfulResponse] = js.undefined
}
object BatchReadOperationResponse {
  
  @scala.inline
  def apply(): BatchReadOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchReadOperationResponse]
  }
  
  @scala.inline
  implicit class BatchReadOperationResponseMutableBuilder[Self <: BatchReadOperationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExceptionResponse(value: BatchReadException): Self = StObject.set(x, "ExceptionResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionResponseUndefined: Self = StObject.set(x, "ExceptionResponse", js.undefined)
    
    @scala.inline
    def setSuccessfulResponse(value: BatchReadSuccessfulResponse): Self = StObject.set(x, "SuccessfulResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessfulResponseUndefined: Self = StObject.set(x, "SuccessfulResponse", js.undefined)
  }
}
