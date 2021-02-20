package typings.azureArmResource.resourceModelsMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentOperationProperties extends StObject {
  
  /**
    * The state of the provisioning.
    */
  val provisioningState: js.UndefOr[String] = js.native
  
  /**
    * The HTTP request message.
    */
  val request: js.UndefOr[HttpMessage] = js.native
  
  /**
    * The HTTP response message.
    */
  val response: js.UndefOr[HttpMessage] = js.native
  
  /**
    * Deployment operation service request id.
    */
  val serviceRequestId: js.UndefOr[String] = js.native
  
  /**
    * Operation status code.
    */
  val statusCode: js.UndefOr[String] = js.native
  
  /**
    * Operation status message.
    */
  val statusMessage: js.UndefOr[js.Any] = js.native
  
  /**
    * The target resource.
    */
  val targetResource: js.UndefOr[TargetResource] = js.native
  
  /**
    * The date and time of the operation.
    */
  val timestamp: js.UndefOr[Date] = js.native
}
object DeploymentOperationProperties {
  
  @scala.inline
  def apply(): DeploymentOperationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentOperationProperties]
  }
  
  @scala.inline
  implicit class DeploymentOperationPropertiesMutableBuilder[Self <: DeploymentOperationProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvisioningState(value: String): Self = StObject.set(x, "provisioningState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningStateUndefined: Self = StObject.set(x, "provisioningState", js.undefined)
    
    @scala.inline
    def setRequest(value: HttpMessage): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setResponse(value: HttpMessage): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    @scala.inline
    def setServiceRequestId(value: String): Self = StObject.set(x, "serviceRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRequestIdUndefined: Self = StObject.set(x, "serviceRequestId", js.undefined)
    
    @scala.inline
    def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: js.Any): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    @scala.inline
    def setTargetResource(value: TargetResource): Self = StObject.set(x, "targetResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetResourceUndefined: Self = StObject.set(x, "targetResource", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
