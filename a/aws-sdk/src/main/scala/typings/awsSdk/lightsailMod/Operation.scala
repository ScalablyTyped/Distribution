package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    createdAt: IsoDate = null,
    errorCode: String = null,
    errorDetails: String = null,
    id: NonEmptyString = null,
    isTerminal: js.UndefOr[Boolean] = js.undefined,
    location: ResourceLocation = null,
    operationDetails: String = null,
    operationType: OperationType = null,
    resourceName: ResourceName = null,
    resourceType: ResourceType = null,
    status: OperationStatus = null,
    statusChangedAt: IsoDate = null
  ): Operation = {
    val __obj = js.Dynamic.literal()
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (errorDetails != null) __obj.updateDynamic("errorDetails")(errorDetails.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isTerminal)) __obj.updateDynamic("isTerminal")(isTerminal.get.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (operationDetails != null) __obj.updateDynamic("operationDetails")(operationDetails.asInstanceOf[js.Any])
    if (operationType != null) __obj.updateDynamic("operationType")(operationType.asInstanceOf[js.Any])
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusChangedAt != null) __obj.updateDynamic("statusChangedAt")(statusChangedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
}

