package typings.awsSdkClientDynamodbBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBackupInput
  extends StObject
     with typings.awsSdkClientDynamodbBrowser.typesCreateBackupInputMod.CreateBackupInput
object CreateBackupInput {
  
  inline def apply(BackupName: String, TableName: String): CreateBackupInput = {
    val __obj = js.Dynamic.literal(BackupName = BackupName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackupInput]
  }
}
