package typings.azureDashArmDashResource.libResourceModelsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentOperationProperties extends js.Object {
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
  @scala.inline
  def apply(
    provisioningState: String = null,
    request: HttpMessage = null,
    response: HttpMessage = null,
    serviceRequestId: String = null,
    statusCode: String = null,
    statusMessage: js.Any = null,
    targetResource: TargetResource = null,
    timestamp: Date = null
  ): DeploymentOperationProperties = {
    val __obj = js.Dynamic.literal()
    if (provisioningState != null) __obj.updateDynamic("provisioningState")(provisioningState.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (serviceRequestId != null) __obj.updateDynamic("serviceRequestId")(serviceRequestId.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage.asInstanceOf[js.Any])
    if (targetResource != null) __obj.updateDynamic("targetResource")(targetResource.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentOperationProperties]
  }
}

