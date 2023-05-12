package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGlobalTablesOutput extends StObject {
  
  /**
    * <p>List of global table names.</p>
    */
  var GlobalTables: js.UndefOr[js.Array[GlobalTable]] = js.undefined
  
  /**
    * <p>Last evaluated global table name.</p>
    */
  var LastEvaluatedGlobalTableName: js.UndefOr[String] = js.undefined
}
object ListGlobalTablesOutput {
  
  inline def apply(): ListGlobalTablesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGlobalTablesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListGlobalTablesOutput] (val x: Self) extends AnyVal {
    
    inline def setGlobalTables(value: js.Array[GlobalTable]): Self = StObject.set(x, "GlobalTables", value.asInstanceOf[js.Any])
    
    inline def setGlobalTablesUndefined: Self = StObject.set(x, "GlobalTables", js.undefined)
    
    inline def setGlobalTablesVarargs(value: GlobalTable*): Self = StObject.set(x, "GlobalTables", js.Array(value*))
    
    inline def setLastEvaluatedGlobalTableName(value: String): Self = StObject.set(x, "LastEvaluatedGlobalTableName", value.asInstanceOf[js.Any])
    
    inline def setLastEvaluatedGlobalTableNameUndefined: Self = StObject.set(x, "LastEvaluatedGlobalTableName", js.undefined)
  }
}
