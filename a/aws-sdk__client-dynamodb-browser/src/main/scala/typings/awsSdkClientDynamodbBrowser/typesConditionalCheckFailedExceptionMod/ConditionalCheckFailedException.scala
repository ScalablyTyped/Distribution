package typings.awsSdkClientDynamodbBrowser.typesConditionalCheckFailedExceptionMod

import typings.awsSdkClientDynamodbBrowser.deleteItemExceptionsUnionMod.DeleteItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.putItemExceptionsUnionMod.PutItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.updateItemExceptionsUnionMod.UpdateItemExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionalCheckFailedException
  extends ServiceException[ConditionalCheckFailedExceptionDetails]
     with DeleteItemExceptionsUnion
     with PutItemExceptionsUnion
     with UpdateItemExceptionsUnion {
  @JSName("name")
  var name_ConditionalCheckFailedException: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ConditionalCheckFailedException
}

object ConditionalCheckFailedException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ConditionalCheckFailedExceptionDetails,
    message: String,
    name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ConditionalCheckFailedException,
    stack: String = null
  ): ConditionalCheckFailedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalCheckFailedException]
  }
}

