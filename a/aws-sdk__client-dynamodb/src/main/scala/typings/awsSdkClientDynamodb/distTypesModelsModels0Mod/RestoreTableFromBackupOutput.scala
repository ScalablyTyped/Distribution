package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreTableFromBackupOutput extends StObject {
  
  /**
    * <p>The description of the table created from an existing backup.</p>
    */
  var TableDescription: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.TableDescription] = js.undefined
}
object RestoreTableFromBackupOutput {
  
  inline def apply(): RestoreTableFromBackupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreTableFromBackupOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestoreTableFromBackupOutput] (val x: Self) extends AnyVal {
    
    inline def setTableDescription(value: TableDescription): Self = StObject.set(x, "TableDescription", value.asInstanceOf[js.Any])
    
    inline def setTableDescriptionUndefined: Self = StObject.set(x, "TableDescription", js.undefined)
  }
}
