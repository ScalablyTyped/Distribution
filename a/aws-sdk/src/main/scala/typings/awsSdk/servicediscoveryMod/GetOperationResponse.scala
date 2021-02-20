package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOperationResponse extends StObject {
  
  /**
    * A complex type that contains information about the operation.
    */
  var Operation: js.UndefOr[typings.awsSdk.servicediscoveryMod.Operation] = js.native
}
object GetOperationResponse {
  
  @scala.inline
  def apply(): GetOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOperationResponse]
  }
  
  @scala.inline
  implicit class GetOperationResponseMutableBuilder[Self <: GetOperationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperation(value: Operation): Self = StObject.set(x, "Operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "Operation", js.undefined)
  }
}
