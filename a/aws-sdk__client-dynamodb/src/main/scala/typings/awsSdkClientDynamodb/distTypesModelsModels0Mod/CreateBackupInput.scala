package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBackupInput extends StObject {
  
  /**
    * <p>Specified name for the backup.</p>
    */
  var BackupName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The name of the table.</p>
    */
  var TableName: js.UndefOr[String] = js.undefined
}
object CreateBackupInput {
  
  inline def apply(): CreateBackupInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBackupInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateBackupInput] (val x: Self) extends AnyVal {
    
    inline def setBackupName(value: String): Self = StObject.set(x, "BackupName", value.asInstanceOf[js.Any])
    
    inline def setBackupNameUndefined: Self = StObject.set(x, "BackupName", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
