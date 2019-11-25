package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesProvisionedThroughputExceededExceptionMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesGetRecordsExceptionsUnionMod.GetRecordsExceptionsUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesGetShardIteratorExceptionsUnionMod.GetShardIteratorExceptionsUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesPutRecordExceptionsUnionMod.PutRecordExceptionsUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesPutRecordsExceptionsUnionMod.PutRecordsExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisionedThroughputExceededException
  extends ServiceException[_ProvisionedThroughputExceededExceptionDetails]
     with GetRecordsExceptionsUnion
     with GetShardIteratorExceptionsUnion
     with PutRecordExceptionsUnion
     with PutRecordsExceptionsUnion {
  @JSName("name")
  var name_ProvisionedThroughputExceededException: typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.ProvisionedThroughputExceededException
}

object ProvisionedThroughputExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _ProvisionedThroughputExceededExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.ProvisionedThroughputExceededException,
    stack: String = null
  ): ProvisionedThroughputExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionedThroughputExceededException]
  }
}

