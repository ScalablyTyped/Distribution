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

@js.native
trait ItemCollectionSizeLimitExceededException
  extends ServiceException[ItemCollectionSizeLimitExceededExceptionDetails]
     with BatchWriteItemExceptionsUnion
     with DeleteItemExceptionsUnion
     with PutItemExceptionsUnion
     with UpdateItemExceptionsUnion {
  @JSName("name")
  var name_ItemCollectionSizeLimitExceededException: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ItemCollectionSizeLimitExceededException = js.native
}

object ItemCollectionSizeLimitExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ItemCollectionSizeLimitExceededExceptionDetails,
    message: String,
    name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ItemCollectionSizeLimitExceededException
  ): ItemCollectionSizeLimitExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemCollectionSizeLimitExceededException]
  }
  @scala.inline
  implicit class ItemCollectionSizeLimitExceededExceptionOps[Self <: ItemCollectionSizeLimitExceededException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(
      value: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ItemCollectionSizeLimitExceededException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

