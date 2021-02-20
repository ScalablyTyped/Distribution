package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOperationRequest extends StObject {
  
  /**
    * The ID of the operation that you want to get more information about.
    */
  var OperationId: ResourceId = js.native
}
object GetOperationRequest {
  
  @scala.inline
  def apply(OperationId: ResourceId): GetOperationRequest = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOperationRequest]
  }
  
  @scala.inline
  implicit class GetOperationRequestMutableBuilder[Self <: GetOperationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationId(value: ResourceId): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
  }
}
