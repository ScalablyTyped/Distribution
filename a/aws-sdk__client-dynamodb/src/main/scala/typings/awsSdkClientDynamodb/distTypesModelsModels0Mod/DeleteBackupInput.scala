package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBackupInput extends StObject {
  
  /**
    * <p>The ARN associated with the backup.</p>
    */
  var BackupArn: js.UndefOr[String] = js.undefined
}
object DeleteBackupInput {
  
  inline def apply(): DeleteBackupInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBackupInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteBackupInput] (val x: Self) extends AnyVal {
    
    inline def setBackupArn(value: String): Self = StObject.set(x, "BackupArn", value.asInstanceOf[js.Any])
    
    inline def setBackupArnUndefined: Self = StObject.set(x, "BackupArn", js.undefined)
  }
}
