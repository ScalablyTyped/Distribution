package typings.awsSdkClientDynamodbNode.typesTableInUseExceptionMod

import typings.awsSdkClientDynamodbNode.createBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typings.awsSdkClientDynamodbNode.restoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import typings.awsSdkClientDynamodbNode.restoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableInUseException
  extends ServiceException[TableInUseExceptionDetails]
     with CreateBackupExceptionsUnion
     with RestoreTableFromBackupExceptionsUnion
     with RestoreTableToPointInTimeExceptionsUnion {
  @JSName("name")
  var name_TableInUseException: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.TableInUseException
}

object TableInUseException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: TableInUseExceptionDetails,
    message: String,
    name: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.TableInUseException,
    stack: String = null
  ): TableInUseException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableInUseException]
  }
}

