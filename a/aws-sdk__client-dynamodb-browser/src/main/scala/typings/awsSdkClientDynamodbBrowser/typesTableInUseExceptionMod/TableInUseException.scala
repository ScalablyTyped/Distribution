package typings.awsSdkClientDynamodbBrowser.typesTableInUseExceptionMod

import typings.awsSdkClientDynamodbBrowser.createBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.restoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.restoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
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
  var name_TableInUseException: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.TableInUseException
}

object TableInUseException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: TableInUseExceptionDetails,
    message: String,
    name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.TableInUseException,
    stack: String = null
  ): TableInUseException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableInUseException]
  }
}

