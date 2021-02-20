package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBackupInput extends StObject {
  
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
  
  @scala.inline
  implicit class CreateBackupInputMutableBuilder[Self <: CreateBackupInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupName(value: BackupName): Self = StObject.set(x, "BackupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
