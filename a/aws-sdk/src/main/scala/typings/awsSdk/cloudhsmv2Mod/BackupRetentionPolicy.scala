package typings.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupRetentionPolicy extends StObject {
  
  /**
    * The type of backup retention policy. For the DAYS type, the value is the number of days to retain backups.
    */
  var Type: js.UndefOr[BackupRetentionType] = js.undefined
  
  /**
    * Use a value between 7 - 379.
    */
  var Value: js.UndefOr[BackupRetentionValue] = js.undefined
}
object BackupRetentionPolicy {
  
  @scala.inline
  def apply(): BackupRetentionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupRetentionPolicy]
  }
  
  @scala.inline
  implicit class BackupRetentionPolicyMutableBuilder[Self <: BackupRetentionPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: BackupRetentionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setValue(value: BackupRetentionValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
