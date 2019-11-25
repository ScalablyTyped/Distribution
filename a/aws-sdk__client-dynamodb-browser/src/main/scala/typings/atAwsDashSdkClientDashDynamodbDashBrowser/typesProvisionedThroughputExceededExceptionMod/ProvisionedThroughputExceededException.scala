package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesProvisionedThroughputExceededExceptionMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesBatchGetItemExceptionsUnionMod.BatchGetItemExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesBatchWriteItemExceptionsUnionMod.BatchWriteItemExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDeleteItemExceptionsUnionMod.DeleteItemExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesGetItemExceptionsUnionMod.GetItemExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesPutItemExceptionsUnionMod.PutItemExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesQueryExceptionsUnionMod.QueryExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesScanExceptionsUnionMod.ScanExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUpdateItemExceptionsUnionMod.UpdateItemExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisionedThroughputExceededException
  extends ServiceException[_ProvisionedThroughputExceededExceptionDetails]
     with BatchGetItemExceptionsUnion
     with BatchWriteItemExceptionsUnion
     with DeleteItemExceptionsUnion
     with GetItemExceptionsUnion
     with PutItemExceptionsUnion
     with QueryExceptionsUnion
     with ScanExceptionsUnion
     with UpdateItemExceptionsUnion {
  @JSName("name")
  var name_ProvisionedThroughputExceededException: typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.ProvisionedThroughputExceededException
}

object ProvisionedThroughputExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _ProvisionedThroughputExceededExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.ProvisionedThroughputExceededException,
    stack: String = null
  ): ProvisionedThroughputExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionedThroughputExceededException]
  }
}

