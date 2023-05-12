package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteServiceResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the service.
    */
  var arn: js.UndefOr[ServiceArn] = js.undefined
  
  /**
    * The ID of the service.
    */
  var id: js.UndefOr[ServiceId] = js.undefined
  
  /**
    * The name of the service.
    */
  var name: js.UndefOr[ServiceName] = js.undefined
  
  /**
    * The status. You can retry the operation if the status is DELETE_FAILED. However, if you retry it while the status is DELETE_IN_PROGRESS, the status doesn't change.
    */
  var status: js.UndefOr[ServiceStatus] = js.undefined
}
object DeleteServiceResponse {
  
  inline def apply(): DeleteServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteServiceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteServiceResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ServiceArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setId(value: ServiceId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: ServiceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: ServiceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
