package typings.awsSdkClientDynamodbBrowser.typesProvisionedThroughputExceededExceptionMod

import typings.awsSdkClientDynamodbBrowser.batchGetItemExceptionsUnionMod.BatchGetItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.batchWriteItemExceptionsUnionMod.BatchWriteItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.deleteItemExceptionsUnionMod.DeleteItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.getItemExceptionsUnionMod.GetItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.putItemExceptionsUnionMod.PutItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.queryExceptionsUnionMod.QueryExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.scanExceptionsUnionMod.ScanExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.updateItemExceptionsUnionMod.UpdateItemExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedThroughputExceededException
  extends ServiceException[ProvisionedThroughputExceededExceptionDetails]
     with BatchGetItemExceptionsUnion
     with BatchWriteItemExceptionsUnion
     with DeleteItemExceptionsUnion
     with GetItemExceptionsUnion
     with PutItemExceptionsUnion
     with QueryExceptionsUnion
     with ScanExceptionsUnion
     with UpdateItemExceptionsUnion {
  @JSName("name")
  var name_ProvisionedThroughputExceededException: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ProvisionedThroughputExceededException = js.native
}

object ProvisionedThroughputExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ProvisionedThroughputExceededExceptionDetails,
    message: String,
    name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ProvisionedThroughputExceededException
  ): ProvisionedThroughputExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionedThroughputExceededException]
  }
  @scala.inline
  implicit class ProvisionedThroughputExceededExceptionOps[Self <: ProvisionedThroughputExceededException] (val x: Self) extends AnyVal {
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
      value: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ProvisionedThroughputExceededException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

