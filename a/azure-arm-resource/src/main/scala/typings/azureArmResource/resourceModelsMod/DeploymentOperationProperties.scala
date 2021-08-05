package typings.azureArmResource.resourceModelsMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentOperationProperties extends StObject {
  
  /**
    * The state of the provisioning.
    */
  val provisioningState: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP request message.
    */
  val request: js.UndefOr[HttpMessage] = js.undefined
  
  /**
    * The HTTP response message.
    */
  val response: js.UndefOr[HttpMessage] = js.undefined
  
  /**
    * Deployment operation service request id.
    */
  val serviceRequestId: js.UndefOr[String] = js.undefined
  
  /**
    * Operation status code.
    */
  val statusCode: js.UndefOr[String] = js.undefined
  
  /**
    * Operation status message.
    */
  val statusMessage: js.UndefOr[js.Any] = js.undefined
  
  /**
    * The target resource.
    */
  val targetResource: js.UndefOr[TargetResource] = js.undefined
  
  /**
    * The date and time of the operation.
    */
  val timestamp: js.UndefOr[Date] = js.undefined
}
object DeploymentOperationProperties {
  
  inline def apply(): DeploymentOperationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentOperationProperties]
  }
  
  extension [Self <: DeploymentOperationProperties](x: Self) {
    
    inline def setProvisioningState(value: String): Self = StObject.set(x, "provisioningState", value.asInstanceOf[js.Any])
    
    inline def setProvisioningStateUndefined: Self = StObject.set(x, "provisioningState", js.undefined)
    
    inline def setRequest(value: HttpMessage): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResponse(value: HttpMessage): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setServiceRequestId(value: String): Self = StObject.set(x, "serviceRequestId", value.asInstanceOf[js.Any])
    
    inline def setServiceRequestIdUndefined: Self = StObject.set(x, "serviceRequestId", js.undefined)
    
    inline def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    inline def setStatusMessage(value: js.Any): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setTargetResource(value: TargetResource): Self = StObject.set(x, "targetResource", value.asInstanceOf[js.Any])
    
    inline def setTargetResourceUndefined: Self = StObject.set(x, "targetResource", js.undefined)
    
    inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
