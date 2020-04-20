package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBackupInput extends js.Object {
  /**
    * Specified name for the backup.
    */
  var BackupName: typings.awsSdk.dynamodbMod.BackupName = js.native
  /**
    * The name of the table.
    */
  var TableName: typings.awsSdk.dynamodbMod.TableName = js.native
}

object CreateBackupInput {
  @scala.inline
  def apply(BackupName: BackupName, TableName: TableName): CreateBackupInput = {
    val __obj = js.Dynamic.literal(BackupName = BackupName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackupInput]
  }
}

