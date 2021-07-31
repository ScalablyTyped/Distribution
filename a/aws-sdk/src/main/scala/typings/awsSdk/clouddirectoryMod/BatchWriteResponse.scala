package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchWriteResponse extends StObject {
  
  /**
    * A list of all the responses for each batch write.
    */
  var Responses: js.UndefOr[BatchWriteOperationResponseList] = js.undefined
}
object BatchWriteResponse {
  
  @scala.inline
  def apply(): BatchWriteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchWriteResponse]
  }
  
  @scala.inline
  implicit class BatchWriteResponseMutableBuilder[Self <: BatchWriteResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponses(value: BatchWriteOperationResponseList): Self = StObject.set(x, "Responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesUndefined: Self = StObject.set(x, "Responses", js.undefined)
    
    @scala.inline
    def setResponsesVarargs(value: BatchWriteOperationResponse*): Self = StObject.set(x, "Responses", js.Array(value :_*))
  }
}
