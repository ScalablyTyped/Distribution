package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesResourceNotFoundExceptionMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesBatchGetItemExceptionsUnionMod.BatchGetItemExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesBatchWriteItemExceptionsUnionMod.BatchWriteItemExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDeleteItemExceptionsUnionMod.DeleteItemExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDeleteTableExceptionsUnionMod.DeleteTableExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDescribeTableExceptionsUnionMod.DescribeTableExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDescribeTimeToLiveExceptionsUnionMod.DescribeTimeToLiveExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesGetItemExceptionsUnionMod.GetItemExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesListTagsOfResourceExceptionsUnionMod.ListTagsOfResourceExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesPutItemExceptionsUnionMod.PutItemExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesQueryExceptionsUnionMod.QueryExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesScanExceptionsUnionMod.ScanExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesTagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUntagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUpdateItemExceptionsUnionMod.UpdateItemExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUpdateTableExceptionsUnionMod.UpdateTableExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUpdateTimeToLiveExceptionsUnionMod.UpdateTimeToLiveExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceNotFoundException
  extends ServiceException[_ResourceNotFoundExceptionDetails]
     with BatchGetItemExceptionsUnion
     with BatchWriteItemExceptionsUnion
     with DeleteItemExceptionsUnion
     with DeleteTableExceptionsUnion
     with DescribeTableExceptionsUnion
     with DescribeTimeToLiveExceptionsUnion
     with GetItemExceptionsUnion
     with ListTagsOfResourceExceptionsUnion
     with PutItemExceptionsUnion
     with QueryExceptionsUnion
     with ScanExceptionsUnion
     with TagResourceExceptionsUnion
     with UntagResourceExceptionsUnion
     with UpdateItemExceptionsUnion
     with UpdateTableExceptionsUnion
     with UpdateTimeToLiveExceptionsUnion {
  @JSName("name")
  var name_ResourceNotFoundException: typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.ResourceNotFoundException
}

object ResourceNotFoundException {
  @scala.inline
  def apply(
    details: _ResourceNotFoundExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.ResourceNotFoundException,
    stack: String = null
  ): ResourceNotFoundException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ResourceNotFoundException]
  }
}

