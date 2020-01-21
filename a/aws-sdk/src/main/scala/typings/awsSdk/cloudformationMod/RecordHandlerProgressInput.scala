package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordHandlerProgressInput extends js.Object {
  /**
    * Reserved for use by the CloudFormation CLI.
    */
  var BearerToken: ClientToken = js.native
  /**
    * Reserved for use by the CloudFormation CLI.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.cloudformationMod.ClientRequestToken] = js.native
  /**
    * Reserved for use by the CloudFormation CLI.
    */
  var CurrentOperationStatus: js.UndefOr[OperationStatus] = js.native
  /**
    * Reserved for use by the CloudFormation CLI.
    */
  var ErrorCode: js.UndefOr[HandlerErrorCode] = js.native
  /**
    * Reserved for use by the CloudFormation CLI.
    */
  var OperationStatus: typings.awsSdk.cloudformationMod.OperationStatus = js.native
  /**
    * Reserved for use by the CloudFormation CLI.
    */
  var ResourceModel: js.UndefOr[typings.awsSdk.cloudformationMod.ResourceModel] = js.native
  /**
    * Reserved for use by the CloudFormation CLI.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.cloudformationMod.StatusMessage] = js.native
}

object RecordHandlerProgressInput {
  @scala.inline
  def apply(
    BearerToken: ClientToken,
    OperationStatus: OperationStatus,
    ClientRequestToken: ClientRequestToken = null,
    CurrentOperationStatus: OperationStatus = null,
    ErrorCode: HandlerErrorCode = null,
    ResourceModel: ResourceModel = null,
    StatusMessage: StatusMessage = null
  ): RecordHandlerProgressInput = {
    val __obj = js.Dynamic.literal(BearerToken = BearerToken.asInstanceOf[js.Any], OperationStatus = OperationStatus.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    if (CurrentOperationStatus != null) __obj.updateDynamic("CurrentOperationStatus")(CurrentOperationStatus.asInstanceOf[js.Any])
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ResourceModel != null) __obj.updateDynamic("ResourceModel")(ResourceModel.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordHandlerProgressInput]
  }
}

