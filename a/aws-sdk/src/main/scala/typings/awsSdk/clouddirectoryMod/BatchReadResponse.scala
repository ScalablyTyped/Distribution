package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchReadResponse extends StObject {
  
  /**
    * A list of all the responses for each batch read.
    */
  var Responses: js.UndefOr[BatchReadOperationResponseList] = js.native
}
object BatchReadResponse {
  
  @scala.inline
  def apply(): BatchReadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchReadResponse]
  }
  
  @scala.inline
  implicit class BatchReadResponseMutableBuilder[Self <: BatchReadResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponses(value: BatchReadOperationResponseList): Self = StObject.set(x, "Responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesUndefined: Self = StObject.set(x, "Responses", js.undefined)
    
    @scala.inline
    def setResponsesVarargs(value: BatchReadOperationResponse*): Self = StObject.set(x, "Responses", js.Array(value :_*))
  }
}
