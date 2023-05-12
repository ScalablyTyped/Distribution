package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTableInput extends StObject {
  
  /**
    * <p>The name of the table to delete.</p>
    */
  var TableName: js.UndefOr[String] = js.undefined
}
object DeleteTableInput {
  
  inline def apply(): DeleteTableInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTableInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTableInput] (val x: Self) extends AnyVal {
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
