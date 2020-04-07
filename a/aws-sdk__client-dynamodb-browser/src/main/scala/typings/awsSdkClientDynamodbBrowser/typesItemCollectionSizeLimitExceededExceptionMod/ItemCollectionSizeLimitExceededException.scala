package typings.awsSdkClientDynamodbBrowser.typesItemCollectionSizeLimitExceededExceptionMod

import typings.awsSdkClientDynamodbBrowser.batchWriteItemExceptionsUnionMod.BatchWriteItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.deleteItemExceptionsUnionMod.DeleteItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.putItemExceptionsUnionMod.PutItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.updateItemExceptionsUnionMod.UpdateItemExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemCollectionSizeLimitExceededException
  extends ServiceException[ItemCollectionSizeLimitExceededExceptionDetails]
     with BatchWriteItemExceptionsUnion
     with DeleteItemExceptionsUnion
     with PutItemExceptionsUnion
     with UpdateItemExceptionsUnion {
  @JSName("name")
  var name_ItemCollectionSizeLimitExceededException: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ItemCollectionSizeLimitExceededException
}

object ItemCollectionSizeLimitExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ItemCollectionSizeLimitExceededExceptionDetails,
    message: String,
    name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ItemCollectionSizeLimitExceededException,
    stack: String = null
  ): ItemCollectionSizeLimitExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemCollectionSizeLimitExceededException]
  }
}

