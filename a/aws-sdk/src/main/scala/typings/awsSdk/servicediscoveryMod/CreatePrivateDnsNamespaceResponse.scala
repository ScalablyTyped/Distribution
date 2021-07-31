package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePrivateDnsNamespaceResponse extends StObject {
  
  /**
    * A value that you can use to determine whether the request completed successfully. To get the status of the operation, see GetOperation.
    */
  var OperationId: js.UndefOr[typings.awsSdk.servicediscoveryMod.OperationId] = js.undefined
}
object CreatePrivateDnsNamespaceResponse {
  
  @scala.inline
  def apply(): CreatePrivateDnsNamespaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePrivateDnsNamespaceResponse]
  }
  
  @scala.inline
  implicit class CreatePrivateDnsNamespaceResponseMutableBuilder[Self <: CreatePrivateDnsNamespaceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationId(value: OperationId): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "OperationId", js.undefined)
  }
}
