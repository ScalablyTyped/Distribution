package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupPolicyDescription extends StObject {
  
  /**
    * Describes the file system's backup policy, indicating whether automatic backups are turned on or off..
    */
  var BackupPolicy: js.UndefOr[typings.awsSdk.efsMod.BackupPolicy] = js.undefined
}
object BackupPolicyDescription {
  
  inline def apply(): BackupPolicyDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupPolicyDescription]
  }
  
  extension [Self <: BackupPolicyDescription](x: Self) {
    
    inline def setBackupPolicy(value: BackupPolicy): Self = StObject.set(x, "BackupPolicy", value.asInstanceOf[js.Any])
    
    inline def setBackupPolicyUndefined: Self = StObject.set(x, "BackupPolicy", js.undefined)
  }
}
