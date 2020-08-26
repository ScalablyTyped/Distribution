package typings.azureArmResource.resourceModelsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentOperationProperties extends js.Object {
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
  implicit class DeploymentOperationPropertiesOps[Self <: DeploymentOperationProperties] (val x: Self) extends AnyVal {
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
    def setProvisioningState(value: String): Self = this.set("provisioningState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisioningState: Self = this.set("provisioningState", js.undefined)
    @scala.inline
    def setRequest(value: HttpMessage): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    @scala.inline
    def setResponse(value: HttpMessage): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    @scala.inline
    def setServiceRequestId(value: String): Self = this.set("serviceRequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceRequestId: Self = this.set("serviceRequestId", js.undefined)
    @scala.inline
    def setStatusCode(value: String): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
    @scala.inline
    def setStatusMessage(value: js.Any): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
    @scala.inline
    def setTargetResource(value: TargetResource): Self = this.set("targetResource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetResource: Self = this.set("targetResource", js.undefined)
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
  
}

