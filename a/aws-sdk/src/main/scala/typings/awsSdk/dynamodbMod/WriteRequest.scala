package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteRequest extends StObject {
  
  /**
    * A request to perform a DeleteItem operation.
    */
  var DeleteRequest: js.UndefOr[typings.awsSdk.dynamodbMod.DeleteRequest] = js.native
  
  /**
    * A request to perform a PutItem operation.
    */
  var PutRequest: js.UndefOr[typings.awsSdk.dynamodbMod.PutRequest] = js.native
}
object WriteRequest {
  
  @scala.inline
  def apply(): WriteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteRequest]
  }
  
  @scala.inline
  implicit class WriteRequestMutableBuilder[Self <: WriteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteRequest(value: DeleteRequest): Self = StObject.set(x, "DeleteRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteRequestUndefined: Self = StObject.set(x, "DeleteRequest", js.undefined)
    
    @scala.inline
    def setPutRequest(value: PutRequest): Self = StObject.set(x, "PutRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPutRequestUndefined: Self = StObject.set(x, "PutRequest", js.undefined)
  }
}
