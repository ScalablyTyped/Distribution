package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Operation extends js.Object {
  
  /**
    * The timestamp when the operation was initialized (e.g., 1479816991.349).
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  
  /**
    * The error code.
    */
  var errorCode: js.UndefOr[String] = js.native
  
  /**
    * The error details.
    */
  var errorDetails: js.UndefOr[String] = js.native
  
  /**
    * The ID of the operation.
    */
  var id: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A Boolean value indicating whether the operation is terminal.
    */
  var isTerminal: js.UndefOr[Boolean] = js.native
  
  /**
    * The AWS Region and Availability Zone.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  
  /**
    * Details about the operation (e.g., Debian-1GB-Ohio-1).
    */
  var operationDetails: js.UndefOr[String] = js.native
  
  /**
    * The type of operation. 
    */
  var operationType: js.UndefOr[OperationType] = js.native
  
  /**
    * The resource name.
    */
  var resourceName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The resource type. 
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  
  /**
    * The status of the operation. 
    */
  var status: js.UndefOr[OperationStatus] = js.native
  
  /**
    * The timestamp when the status was changed (e.g., 1479816991.349).
    */
  var statusChangedAt: js.UndefOr[IsoDate] = js.native
}
object Operation {
  
  @scala.inline
  def apply(): Operation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Operation]
  }
  
  @scala.inline
  implicit class OperationOps[Self <: Operation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setErrorCode(value: String): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
    
    @scala.inline
    def setErrorDetails(value: String): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setId(value: NonEmptyString): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsTerminal(value: Boolean): Self = this.set("isTerminal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTerminal: Self = this.set("isTerminal", js.undefined)
    
    @scala.inline
    def setLocation(value: ResourceLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setOperationDetails(value: String): Self = this.set("operationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationDetails: Self = this.set("operationDetails", js.undefined)
    
    @scala.inline
    def setOperationType(value: OperationType): Self = this.set("operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationType: Self = this.set("operationType", js.undefined)
    
    @scala.inline
    def setResourceName(value: ResourceName): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    
    @scala.inline
    def setStatus(value: OperationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusChangedAt(value: IsoDate): Self = this.set("statusChangedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusChangedAt: Self = this.set("statusChangedAt", js.undefined)
  }
}
