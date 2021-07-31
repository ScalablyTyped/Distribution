package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBackupResponse extends StObject {
  
  /**
    * The ID of the backup deleted.
    */
  var BackupId: js.UndefOr[typings.awsSdk.fsxMod.BackupId] = js.undefined
  
  /**
    * The lifecycle of the backup. Should be DELETED.
    */
  var Lifecycle: js.UndefOr[BackupLifecycle] = js.undefined
}
object DeleteBackupResponse {
  
  @scala.inline
  def apply(): DeleteBackupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBackupResponse]
  }
  
  @scala.inline
  implicit class DeleteBackupResponseMutableBuilder[Self <: DeleteBackupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupId(value: BackupId): Self = StObject.set(x, "BackupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupIdUndefined: Self = StObject.set(x, "BackupId", js.undefined)
    
    @scala.inline
    def setLifecycle(value: BackupLifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
  }
}
