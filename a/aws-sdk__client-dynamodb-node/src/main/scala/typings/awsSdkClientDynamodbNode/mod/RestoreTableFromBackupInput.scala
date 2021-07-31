package typings.awsSdkClientDynamodbNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreTableFromBackupInput
  extends StObject
     with typings.awsSdkClientDynamodbNode.typesRestoreTableFromBackupInputMod.RestoreTableFromBackupInput
object RestoreTableFromBackupInput {
  
  @scala.inline
  def apply(BackupArn: String, TargetTableName: String): RestoreTableFromBackupInput = {
    val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any], TargetTableName = TargetTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreTableFromBackupInput]
  }
}
