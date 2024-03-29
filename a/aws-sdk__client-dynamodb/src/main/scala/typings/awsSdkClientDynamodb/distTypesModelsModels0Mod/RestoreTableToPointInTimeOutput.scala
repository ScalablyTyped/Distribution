package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreTableToPointInTimeOutput extends StObject {
  
  /**
    * <p>Represents the properties of a table.</p>
    */
  var TableDescription: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.TableDescription] = js.undefined
}
object RestoreTableToPointInTimeOutput {
  
  inline def apply(): RestoreTableToPointInTimeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreTableToPointInTimeOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestoreTableToPointInTimeOutput] (val x: Self) extends AnyVal {
    
    inline def setTableDescription(value: TableDescription): Self = StObject.set(x, "TableDescription", value.asInstanceOf[js.Any])
    
    inline def setTableDescriptionUndefined: Self = StObject.set(x, "TableDescription", js.undefined)
  }
}
