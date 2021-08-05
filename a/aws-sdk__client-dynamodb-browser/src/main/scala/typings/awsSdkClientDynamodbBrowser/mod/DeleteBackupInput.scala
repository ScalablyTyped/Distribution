package typings.awsSdkClientDynamodbBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBackupInput
  extends StObject
     with typings.awsSdkClientDynamodbBrowser.typesDeleteBackupInputMod.DeleteBackupInput
object DeleteBackupInput {
  
  inline def apply(BackupArn: String): DeleteBackupInput = {
    val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBackupInput]
  }
}
