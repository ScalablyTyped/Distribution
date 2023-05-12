package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTableOutput extends StObject {
  
  /**
    * <p>Represents the properties of a table.</p>
    */
  var TableDescription: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.TableDescription] = js.undefined
}
object DeleteTableOutput {
  
  inline def apply(): DeleteTableOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTableOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTableOutput] (val x: Self) extends AnyVal {
    
    inline def setTableDescription(value: TableDescription): Self = StObject.set(x, "TableDescription", value.asInstanceOf[js.Any])
    
    inline def setTableDescriptionUndefined: Self = StObject.set(x, "TableDescription", js.undefined)
  }
}
