package typings.awsSdkClientDynamodbNode.typesInvalidRestoreTimeExceptionMod

import typings.awsSdkClientDynamodbNode.restoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidRestoreTimeException
  extends ServiceException[InvalidRestoreTimeExceptionDetails]
     with RestoreTableToPointInTimeExceptionsUnion {
  @JSName("name")
  var name_InvalidRestoreTimeException: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.InvalidRestoreTimeException
}

object InvalidRestoreTimeException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidRestoreTimeExceptionDetails,
    message: String,
    name: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.InvalidRestoreTimeException,
    stack: String = null
  ): InvalidRestoreTimeException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidRestoreTimeException]
  }
}

