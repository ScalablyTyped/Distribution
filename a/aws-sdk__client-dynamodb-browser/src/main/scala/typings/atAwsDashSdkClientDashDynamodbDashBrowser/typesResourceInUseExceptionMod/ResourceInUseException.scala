package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesResourceInUseExceptionMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesCreateTableExceptionsUnionMod.CreateTableExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDeleteTableExceptionsUnionMod.DeleteTableExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesTagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUntagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUpdateGlobalTableSettingsExceptionsUnionMod.UpdateGlobalTableSettingsExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUpdateTableExceptionsUnionMod.UpdateTableExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUpdateTimeToLiveExceptionsUnionMod.UpdateTimeToLiveExceptionsUnion
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
  var name_ResourceInUseException: typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.ResourceInUseException
}

object ResourceInUseException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _ResourceInUseExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.ResourceInUseException,
    stack: String = null
  ): ResourceInUseException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceInUseException]
  }
}

