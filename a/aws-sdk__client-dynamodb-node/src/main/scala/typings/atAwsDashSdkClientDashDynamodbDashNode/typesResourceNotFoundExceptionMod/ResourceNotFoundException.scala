package typings.atAwsDashSdkClientDashDynamodbDashNode.typesResourceNotFoundExceptionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesBatchGetItemExceptionsUnionMod.BatchGetItemExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesBatchWriteItemExceptionsUnionMod.BatchWriteItemExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDeleteItemExceptionsUnionMod.DeleteItemExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDeleteTableExceptionsUnionMod.DeleteTableExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDescribeTableExceptionsUnionMod.DescribeTableExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDescribeTimeToLiveExceptionsUnionMod.DescribeTimeToLiveExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesGetItemExceptionsUnionMod.GetItemExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesListTagsOfResourceExceptionsUnionMod.ListTagsOfResourceExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesPutItemExceptionsUnionMod.PutItemExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesQueryExceptionsUnionMod.QueryExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesScanExceptionsUnionMod.ScanExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesTagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUntagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateItemExceptionsUnionMod.UpdateItemExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateTableExceptionsUnionMod.UpdateTableExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateTimeToLiveExceptionsUnionMod.UpdateTimeToLiveExceptionsUnion
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
  var name_ResourceNotFoundException: typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.ResourceNotFoundException
}

object ResourceNotFoundException {
  @scala.inline
  def apply(
    details: _ResourceNotFoundExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.ResourceNotFoundException,
    stack: String = null
  ): ResourceNotFoundException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ResourceNotFoundException]
  }
}

