package typings.awsSdkClientDynamodbNode.typesTableNotFoundExceptionMod

import typings.awsSdkClientDynamodbNode.createBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typings.awsSdkClientDynamodbNode.createGlobalTableExceptionsUnionMod.CreateGlobalTableExceptionsUnion
import typings.awsSdkClientDynamodbNode.describeContinuousBackupsExceptionsUnionMod.DescribeContinuousBackupsExceptionsUnion
import typings.awsSdkClientDynamodbNode.restoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import typings.awsSdkClientDynamodbNode.updateContinuousBackupsExceptionsUnionMod.UpdateContinuousBackupsExceptionsUnion
import typings.awsSdkClientDynamodbNode.updateGlobalTableExceptionsUnionMod.UpdateGlobalTableExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableNotFoundException
  extends ServiceException[TableNotFoundExceptionDetails]
     with CreateBackupExceptionsUnion
     with CreateGlobalTableExceptionsUnion
     with DescribeContinuousBackupsExceptionsUnion
     with RestoreTableToPointInTimeExceptionsUnion
     with UpdateContinuousBackupsExceptionsUnion
     with UpdateGlobalTableExceptionsUnion {
  @JSName("name")
  var name_TableNotFoundException: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.TableNotFoundException = js.native
}

object TableNotFoundException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: TableNotFoundExceptionDetails,
    message: String,
    name: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.TableNotFoundException
  ): TableNotFoundException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableNotFoundException]
  }
  @scala.inline
  implicit class TableNotFoundExceptionOps[Self <: TableNotFoundException] (val x: Self) extends AnyVal {
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
    def setName(value: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.TableNotFoundException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

