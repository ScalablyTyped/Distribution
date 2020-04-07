package typings.awsSdkClientDynamodbNode.typesContinuousBackupsUnavailableExceptionMod

import typings.awsSdkClientDynamodbNode.createBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typings.awsSdkClientDynamodbNode.updateContinuousBackupsExceptionsUnionMod.UpdateContinuousBackupsExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinuousBackupsUnavailableException
  extends ServiceException[ContinuousBackupsUnavailableExceptionDetails]
     with CreateBackupExceptionsUnion
     with UpdateContinuousBackupsExceptionsUnion {
  @JSName("name")
  var name_ContinuousBackupsUnavailableException: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ContinuousBackupsUnavailableException
}

object ContinuousBackupsUnavailableException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ContinuousBackupsUnavailableExceptionDetails,
    message: String,
    name: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ContinuousBackupsUnavailableException,
    stack: String = null
  ): ContinuousBackupsUnavailableException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousBackupsUnavailableException]
  }
}

