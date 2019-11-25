package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesGlobalTableNotFoundExceptionMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDescribeGlobalTableExceptionsUnionMod.DescribeGlobalTableExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDescribeGlobalTableSettingsExceptionsUnionMod.DescribeGlobalTableSettingsExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUpdateGlobalTableExceptionsUnionMod.UpdateGlobalTableExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUpdateGlobalTableSettingsExceptionsUnionMod.UpdateGlobalTableSettingsExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalTableNotFoundException
  extends ServiceException[_GlobalTableNotFoundExceptionDetails]
     with DescribeGlobalTableExceptionsUnion
     with DescribeGlobalTableSettingsExceptionsUnion
     with UpdateGlobalTableExceptionsUnion
     with UpdateGlobalTableSettingsExceptionsUnion {
  @JSName("name")
  var name_GlobalTableNotFoundException: typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.GlobalTableNotFoundException
}

object GlobalTableNotFoundException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _GlobalTableNotFoundExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.GlobalTableNotFoundException,
    stack: String = null
  ): GlobalTableNotFoundException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalTableNotFoundException]
  }
}

