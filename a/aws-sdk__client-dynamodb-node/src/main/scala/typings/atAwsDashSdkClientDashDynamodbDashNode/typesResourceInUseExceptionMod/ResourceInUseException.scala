package typings.atAwsDashSdkClientDashDynamodbDashNode.typesResourceInUseExceptionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesCreateTableExceptionsUnionMod.CreateTableExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDeleteTableExceptionsUnionMod.DeleteTableExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesTagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUntagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateGlobalTableSettingsExceptionsUnionMod.UpdateGlobalTableSettingsExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateTableExceptionsUnionMod.UpdateTableExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateTimeToLiveExceptionsUnionMod.UpdateTimeToLiveExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceInUseException
  extends ServiceException[_ResourceInUseExceptionDetails]
     with CreateTableExceptionsUnion
     with DeleteTableExceptionsUnion
     with TagResourceExceptionsUnion
     with UntagResourceExceptionsUnion
     with UpdateGlobalTableSettingsExceptionsUnion
     with UpdateTableExceptionsUnion
     with UpdateTimeToLiveExceptionsUnion {
  @JSName("name")
  var name_ResourceInUseException: typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.ResourceInUseException
}

object ResourceInUseException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _ResourceInUseExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.ResourceInUseException,
    stack: String = null
  ): ResourceInUseException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceInUseException]
  }
}

