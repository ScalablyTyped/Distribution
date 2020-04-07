package typings.awsSdkClientDynamodbBrowser.typesResourceNotFoundExceptionMod

import typings.awsSdkClientDynamodbBrowser.batchGetItemExceptionsUnionMod.BatchGetItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.batchWriteItemExceptionsUnionMod.BatchWriteItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.deleteItemExceptionsUnionMod.DeleteItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.deleteTableExceptionsUnionMod.DeleteTableExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.describeTableExceptionsUnionMod.DescribeTableExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.describeTimeToLiveExceptionsUnionMod.DescribeTimeToLiveExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.getItemExceptionsUnionMod.GetItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.listTagsOfResourceExceptionsUnionMod.ListTagsOfResourceExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.putItemExceptionsUnionMod.PutItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.queryExceptionsUnionMod.QueryExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.scanExceptionsUnionMod.ScanExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.tagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.untagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.updateItemExceptionsUnionMod.UpdateItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.updateTableExceptionsUnionMod.UpdateTableExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.updateTimeToLiveExceptionsUnionMod.UpdateTimeToLiveExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceNotFoundException
  extends ServiceException[ResourceNotFoundExceptionDetails]
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
  var name_ResourceNotFoundException: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ResourceNotFoundException
}

object ResourceNotFoundException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ResourceNotFoundExceptionDetails,
    message: String,
    name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ResourceNotFoundException,
    stack: String = null
  ): ResourceNotFoundException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceNotFoundException]
  }
}

