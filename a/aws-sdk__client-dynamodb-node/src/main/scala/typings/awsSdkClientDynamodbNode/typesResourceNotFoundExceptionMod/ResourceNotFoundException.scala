package typings.awsSdkClientDynamodbNode.typesResourceNotFoundExceptionMod

import typings.awsSdkClientDynamodbNode.batchGetItemExceptionsUnionMod.BatchGetItemExceptionsUnion
import typings.awsSdkClientDynamodbNode.batchWriteItemExceptionsUnionMod.BatchWriteItemExceptionsUnion
import typings.awsSdkClientDynamodbNode.deleteItemExceptionsUnionMod.DeleteItemExceptionsUnion
import typings.awsSdkClientDynamodbNode.deleteTableExceptionsUnionMod.DeleteTableExceptionsUnion
import typings.awsSdkClientDynamodbNode.describeTableExceptionsUnionMod.DescribeTableExceptionsUnion
import typings.awsSdkClientDynamodbNode.describeTimeToLiveExceptionsUnionMod.DescribeTimeToLiveExceptionsUnion
import typings.awsSdkClientDynamodbNode.getItemExceptionsUnionMod.GetItemExceptionsUnion
import typings.awsSdkClientDynamodbNode.listTagsOfResourceExceptionsUnionMod.ListTagsOfResourceExceptionsUnion
import typings.awsSdkClientDynamodbNode.putItemExceptionsUnionMod.PutItemExceptionsUnion
import typings.awsSdkClientDynamodbNode.queryExceptionsUnionMod.QueryExceptionsUnion
import typings.awsSdkClientDynamodbNode.scanExceptionsUnionMod.ScanExceptionsUnion
import typings.awsSdkClientDynamodbNode.tagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typings.awsSdkClientDynamodbNode.untagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typings.awsSdkClientDynamodbNode.updateItemExceptionsUnionMod.UpdateItemExceptionsUnion
import typings.awsSdkClientDynamodbNode.updateTableExceptionsUnionMod.UpdateTableExceptionsUnion
import typings.awsSdkClientDynamodbNode.updateTimeToLiveExceptionsUnionMod.UpdateTimeToLiveExceptionsUnion
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
  var name_ResourceNotFoundException: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ResourceNotFoundException
}

object ResourceNotFoundException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ResourceNotFoundExceptionDetails,
    message: String,
    name: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ResourceNotFoundException,
    stack: String = null
  ): ResourceNotFoundException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceNotFoundException]
  }
}

