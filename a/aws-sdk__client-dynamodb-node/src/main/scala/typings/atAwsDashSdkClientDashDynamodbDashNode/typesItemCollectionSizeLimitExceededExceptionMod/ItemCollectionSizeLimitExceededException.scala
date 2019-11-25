package typings.atAwsDashSdkClientDashDynamodbDashNode.typesItemCollectionSizeLimitExceededExceptionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesBatchWriteItemExceptionsUnionMod.BatchWriteItemExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDeleteItemExceptionsUnionMod.DeleteItemExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesPutItemExceptionsUnionMod.PutItemExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateItemExceptionsUnionMod.UpdateItemExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemCollectionSizeLimitExceededException
  extends ServiceException[_ItemCollectionSizeLimitExceededExceptionDetails]
     with BatchWriteItemExceptionsUnion
     with DeleteItemExceptionsUnion
     with PutItemExceptionsUnion
     with UpdateItemExceptionsUnion {
  @JSName("name")
  var name_ItemCollectionSizeLimitExceededException: typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.ItemCollectionSizeLimitExceededException
}

object ItemCollectionSizeLimitExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _ItemCollectionSizeLimitExceededExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.ItemCollectionSizeLimitExceededException,
    stack: String = null
  ): ItemCollectionSizeLimitExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemCollectionSizeLimitExceededException]
  }
}

