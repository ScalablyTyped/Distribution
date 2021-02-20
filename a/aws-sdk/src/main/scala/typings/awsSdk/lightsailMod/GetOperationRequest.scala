package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOperationRequest extends StObject {
  
  /**
    * A GUID used to identify the operation.
    */
  var operationId: NonEmptyString = js.native
}
object GetOperationRequest {
  
  @scala.inline
  def apply(operationId: NonEmptyString): GetOperationRequest = {
    val __obj = js.Dynamic.literal(operationId = operationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOperationRequest]
  }
  
  @scala.inline
  implicit class GetOperationRequestMutableBuilder[Self <: GetOperationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationId(value: NonEmptyString): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
  }
}
