package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBackupOutput extends StObject {
  
  /**
    * Contains the description of the backup created for the table.
    */
  var BackupDescription: js.UndefOr[typings.awsSdk.dynamodbMod.BackupDescription] = js.undefined
}
object DeleteBackupOutput {
  
  @scala.inline
  def apply(): DeleteBackupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBackupOutput]
  }
  
  @scala.inline
  implicit class DeleteBackupOutputMutableBuilder[Self <: DeleteBackupOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupDescription(value: BackupDescription): Self = StObject.set(x, "BackupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupDescriptionUndefined: Self = StObject.set(x, "BackupDescription", js.undefined)
  }
}
